const scholarships = [
    {
        id: "SCH001",
        name: "Merit Scholarship",
        amount: 50000,
        eligibility: "Minimum CGPA of 8.0",
        description: "Financial support for students with excellent academic performance."
    },
    {
        id: "SCH002",
        name: "Need-Based Scholarship",
        amount: 30000,
        eligibility: "Annual family income below ₹3,00,000",
        description: "Financial assistance for students requiring economic support."
    },
    {
        id: "SCH003",
        name: "Engineering Scholarship",
        amount: 25000,
        eligibility: "Must be enrolled in an engineering course",
        description: "Financial support for eligible engineering students."
    },
    {
        id: "SCH004",
        name: "First Graduate Scholarship",
        amount: 20000,
        eligibility: "Must satisfy first-generation graduate criteria",
        description: "Financial assistance for eligible first-generation graduates."
    }
];

const applications = [];

function displayScholarships() {
    const list = document.getElementById("scholarshipList");

    list.innerHTML = scholarships.map(function (scholarship) {
        const applied = applications.some(function (app) {
            return app.scholarshipId === scholarship.id;
        });

        return `
            <div class="scholarship-card">
                <span class="status">Open</span>
                <h3>${scholarship.name}</h3>
                <p>${scholarship.description}</p>
                <p><strong>Eligibility:</strong> ${scholarship.eligibility}</p>
                <div class="amount">₹${scholarship.amount.toLocaleString("en-IN")}</div>
                <p><strong>Scheme ID:</strong> ${scholarship.id}</p>
                <button class="apply-btn"
                    onclick="applyForScholarship('${scholarship.id}')"
                    ${applied ? "disabled" : ""}>
                    ${applied ? "Applied" : "Apply Now"}
                </button>
            </div>
        `;
    }).join("");

    document.getElementById("totalScholarships").textContent =
        scholarships.length;
}

function applyForScholarship(id) {
    const alreadyApplied = applications.some(function (app) {
        return app.scholarshipId === id;
    });

    if (alreadyApplied) {
        alert("You have already applied for this scholarship.");
        return;
    }

    const scholarship = scholarships.find(function (item) {
        return item.id === id;
    });

    if (!scholarship) {
        alert("Scholarship not found.");
        return;
    }

    applications.push({
        scholarshipId: scholarship.id,
        scholarshipName: scholarship.name,
        amount: scholarship.amount,
        status: "SUBMITTED"
    });

    alert("Application submitted successfully!");

    displayScholarships();
    displayApplications();
}

function displayApplications() {
    const list = document.getElementById("applicationList");

    document.getElementById("totalApplications").textContent =
        applications.length;

    document.getElementById("pendingApplications").textContent =
        applications.filter(function (app) {
            return app.status === "SUBMITTED";
        }).length;

    if (applications.length === 0) {
        list.innerHTML =
            '<p class="empty-message">You have not applied for any scholarships yet.</p>';
        return;
    }

    list.innerHTML = applications.map(function (app) {
        return `
            <div class="application-item">
                <h3>${app.scholarshipName}</h3>
                <p>Scholarship ID: ${app.scholarshipId}</p>
                <p>Amount: ₹${app.amount.toLocaleString("en-IN")}</p>
                <p>Application Status:
                    <span class="status">${app.status}</span>
                </p>
            </div>
        `;
    }).join("");
}

displayScholarships();
displayApplications();
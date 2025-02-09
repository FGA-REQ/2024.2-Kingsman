document.addEventListener("DOMContentLoaded", function() {
    const interests = [
        { name: "Gastronomia", image: "gastronomia.jpg" },
        { name: "Vida Noturna", image: "vida_noturna.jpg" },
        { name: "Cultura", image: "cultura.jpg" },
        { name: "Lazer", image: "lazer.jpg" }

    ];

    const container = document.getElementById("interests-container");

    interests.forEach(interest => {
        const div = document.createElement("div");
        div.className = "interest-card";
        div.innerHTML = `
            <img src="${interest.image}" alt="${interest.name}">
            <p>${interest.name}</p>
        `;
        div.addEventListener("click", () => {
            div.classList.toggle("selected");
        });
        container.appendChild(div);
    });
});
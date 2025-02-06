document.addEventListener("DOMContentLoaded", () => {
    const loginForm = document.getElementById("loginForm");
  
    loginForm.addEventListener("submit", async (e) => {
        e.preventDefault();
  
        const name = document.getElementById("name").value;
        const sobrenome = document.getElementById("sobrenome").value;
        const data =  document.getElementById("data").value;
        const email =  document.getElementById("email").value;
        const senha =  document.getElementById("senha").value;
  
        try {
            const response = await fetch("http://localhost:5000/login", {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ name, sobrenome, data, email, senha }),
            });
  
            const data = await response.json();
            alert(data.message);
        } catch (error) {
            alert("Erro ao conectar ao servidor");
            console.error("Erro:", error);
        }
    });
  });
  
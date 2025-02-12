document.addEventListener("DOMContentLoaded", () => {
  const loginForm = document.getElementById("loginForm");

  loginForm.addEventListener("submit", async (e) => {
    e.preventDefault();

    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    try {
      const response = await fetch(`http://localhost:8080/usuarios/${email}`, {
        method: "GET",
        headers: { "Content-Type": "application/json" },
      });

      const data = await response.json();
      console.log(data);
      if (data.message == undefined) {
        alert("Login feito com sucesso");
      }
    } catch (error) {
      alert("Erro ao conectar ao servidor");
      console.error("Erro:", error);
    }
  });
});

url = "https://reqres.in/api/users?page=2";

async function info(url) {
    try {
        const response = await fetch(url);
        var read = await response.json();
        let actual_data = read.data;
        console.log(actual_data);
        let content = ``;
        for (let user of actual_data) {
            content += `<div class="card"><img src='${user.avatar}' alt="Avatar" ><div class="container">
            <h4><b>${user.first_name} ${user.last_name}</b></h4><p>${user.email}</p>
            </div></div>`;
        }

        $(".display").get(0).innerHTML += content;
        
        $(".btn").fadeOut(()=>{
            this.remove();
        });
    } catch (error) {
        console.log(error);
    }
}

$(".btn").on("click", () => {
    alert("hi");
    info(url);
}); 

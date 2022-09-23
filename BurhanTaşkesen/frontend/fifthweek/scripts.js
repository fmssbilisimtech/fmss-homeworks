let butoncuk = document.getElementById("butoncuk");
let baskaButoncuk = document.getElementById("baskaButoncuk");
butoncuk.style.marginLeft = "50px"

butoncuk.addEventListener("mouseover", (e)=> {
    if(butoncuk.style.marginLeft == "50px"){
        butoncuk.style.marginLeft = "200px"
    }else{
        butoncuk.style.marginLeft = "50px"
    }
})

butoncuk.addEventListener("click", (e)=> {
    alert("Hayır çok seviyorsun")   
})

baskaButoncuk.addEventListener("click", (e)=> {
    alert("Biz de öyle düşünmüştük...")     
})

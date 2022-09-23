let inputCard = document.getElementById("inputCard");
let filmList = document.getElementById("filmList");
let btnAdd = document.getElementById("btnAdd");

let nameInput = document.getElementById("filmName");
let typeInput = document.getElementById("filmType");
let urlInput = document.getElementById("filmUrl");



let films = JSON.parse(localStorage.getItem("films"));
if(films == null){
    films = [];
}else{
    showFilms();
}

console.log(films);

btnAdd.addEventListener("click",(ev) => {
    let newFilm = new Film(nameInput.value, typeInput.value, urlInput.value)
    films.push(newFilm)
    console.log(newFilm)
    localStorage.setItem("films",JSON.stringify(films))

    nameInput.value = ""
    typeInput.value = ""
    urlInput.value = ""

    filmList.innerHTML = ""
    showFilms();
})

function showFilms(){
    for (let i = 0; i < films.length; i++) {
        console.log(films[i].name);
        let name = films[i].name
        let type = films[i].type
        let url = films[i].url
        filmList.innerHTML += '<div class="row mb-2 align-items-center"><div class="col-4 justify-content-center">' + name + '</div><div class="col-4">' + type + '</div><div class="col-4"><img width="100vw" src="' + url + '" alt=""></div></div>'
    }
}

filmList.style.maxHeight = "310px"
filmList.style.overflowY = "auto"

/*for (let index = 0; index < 20; index++) {
    filmList.innerHTML += '<div class="row mb-2 align-items-center"><div class="col-4 justify-content-center">Buz Devri</div><div class="col-4">Animasyon</div><div class="col-4"><img width="100vw" src="https://tr.web.img4.acsta.net/c_310_420/pictures/bzp/01/35784.jpg" alt=""></div></div>'
}*/


function Film(name, type, url){
    this.name = name;
    this.type = type;
    this.url = url;
}

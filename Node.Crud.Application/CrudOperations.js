const fs = require('fs');

const insert = (title, desc, author) => {
   
    let noteslist = [];
    try {
       
        noteslist = JSON.parse(fs.readFileSync("Notes.json"));
    } catch (e) {
        //console.log(e);
    }
    let index = noteslist.findIndex((x) => x.title == title);
    if (index == -1) {
        noteslist.push({ title, desc, author });

        console.log("Note Added")
    } else {
        console.log("note is already avaialble");
    }
    fs.writeFileSync("Notes.json", JSON.stringify(noteslist));

}


const del = (title) => {
    let noteslist = [];
    try {
        noteslist = JSON.parse(fs.readFileSync("Notes.json"));
    } catch (e) {
        //console.log(e);
    }

    const filteredlist = noteslist.filter((x) => x.title != title);
    fs.writeFileSync("Notes.json", JSON.stringify(filteredlist));
    console.log('note removed');
}


const get = () => {
    let noteslist = [];
    try {
        noteslist = JSON.parse(fs.readFileSync("Notes.json"));
    } catch (e) {
        //console.log(e);
    }
    console.log(noteslist);

}

const update = (title, desc, author) => {
    let noteslist = [];
    try {
        noteslist = JSON.parse(fs.readFileSync("Notes.json"));
    } catch (e) {
        //console.log(e);
    }
    let index = noteslist.findIndex((x) => x.title == title);
    if (index == 1) {
        console.log("title found and updated");
        noteslist[index].desc = desc;
        fs.writeFileSync("Notes.json", JSON.stringify(noteslist));

        noteslist[index].author = author;
        fs.writeFileSync("Notes.json", JSON.stringify(noteslist));

    }
    else {
        console.log("Title Not Found");
    }
}

module.exports = {
    insert,
    del,
    get,
    update
}
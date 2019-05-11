console.log('Node Console Based Application For CRUD Opreation');
console.log('');
const yargs = require('yargs');
const commands = require('./CrudOperations');
let operation = yargs.argv._[0];

console.log(yargs.argv._[0]);
switch (operation) {
    case "insert":

        yargs.command({
            command: 'insert',
            describe: 'insert data,in console terminal, using this command: node nodeCrud.js insert --title="Buy" --desc="desc" --author="auth"', 
            builder: {
                title: {
                    describe: 'Note title',
                    demandOption: true,
                    type: 'string'
                },
                desc: {
                    describe: 'Note description',
                    demandOption: true,
                    type: 'string'
                },
                author: {
                    describe: 'Note author',
                    demandOption: true,
                    type: 'string'
                }
            },
            handler: function (argv) {
                console.log('Title: ' + argv.title)
                console.log('Desc: ' + argv.desc)
				console.log('Author: ' + argv.author)
            }
        })

        break;

    case "update":
        yargs.command({
            command: 'update',
            describe: '',
            builder: {
                title: {
                    describe: 'Note title',
                    demandOption: true,
                    type: 'string'
                }
            },
            handler: function (argv) {
                console.log('Title: ' + argv.title)
                console.log('Desc: ' + argv.desc)
				console.log('Author: ' + argv.author)
            }
        })

        break;

    case "delete":
        yargs.command({
            command: 'delete',
            describe: '',
            builder: {
                title: {
                    describe: 'Note title',
                    demandOption: true,
                    type: 'string'
                }
            },
            handler: function (argv) {
                console.log('Title: ' + argv.title)
                console.log('Desc: ' + argv.desc)
				console.log('Author: ' + argv.author)
            }
        })
        break;

    default: "Unrecognised command";
}

// console.log('Title: ' + yargs.argv.title)
// console.log('Body: ' + yargs.argv.body)

var createIfNotExist = require("create-if-not-exist");

createIfNotExist('Notes.json', '');


let title = yargs.argv.title;
let desc = yargs.argv.desc;
let author = yargs.argv.author;

switch (operation) {
    case "insert":

        if (title && desc && author) {
            commands.insert(title, desc, author);
        }

        break;

    case "update":
        if (title) {
            commands.update(title, desc, author);
        }

        break;

    case "delete":
        if (title) {
            commands.del(title);
        }
        break;

    case "get":
        commands.get();
        break;

    default: "Unrecognised command";
}
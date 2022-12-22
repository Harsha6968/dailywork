let employees=[{id:101,name:"harsha",gmail:"goneharshavardhan96962@gmail.com",gender:"M"},
{id:102,name:"harsha",gmail:"goneharshavardhan96962@gmail.com",gender:"M"},
{id:103,name:"harsha",gmail:"goneharshavardhan96962@gmail.com",gender:"M"}]

let createEmployee=(emp,callback)=>{
    setTimeout(()=>{
        employees.push(emp)
        callback()
    },[4000])
}
let getEmployees=()=>{
    setTimeout(()=>{
        let rows=""
        for(employee of employees){
            rows=rows +`<tr>
                        <td>${employee.id}</td>
                        <td>${employee.name}</td>
                        <td>${employee.gmail}</td>
                        <td>${employee.gender}</td>
                        </tr>`
        }
        document.getElementById('abc').innerHTML=rows

    },[1000])
}
createEmployee({id:103,name:"harsha",gmail:"goneharshavardhan96962@gmail.com",gender:"M"},getEmployees())




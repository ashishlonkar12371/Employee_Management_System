export interface Employee{
    id:number;
    name:string;
    status:string;
    phoneno:number;
    department:string;
    city:{
        cid:number,
        cname:string
    };
    createddtm:number;
    createdby:string;
    updateddtm:number;
    updatedby:string;
}
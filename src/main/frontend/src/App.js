import React, {useState,useEffect} from 'react';
import './App.css';
import axios from 'axios';


const userProfiles = () =>{

  const fetchUserProfiles = () => {
    axios.get("http://localhost:8080/api/vi/user-profile").then(res =>{

      console.log(res);
  
    });

    return <h1>hello</h1>;
  

  }

  useEffect(() =>{
    fetchUserProfiles();
  },[]);
}

function App() {
  return (
    <div className="App">
     <userProfiles/>
    </div>
  );
}

export default App;

import React from "react";
import ExpenseForm from "./components/ExpenseForm";
import ExpenseList from "./components/ExpenseList";

function App(){
  return (
    <div>
      <h2>Expense Tracker</h2>
      <ExpenseForm />
      <ExpenseList />
    </div>
  );
}

export default App;
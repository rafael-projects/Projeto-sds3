import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";
import DataTable from "components/DataTable";
import Footer from "components/Footer/indes";
import NavBar from "components/NavBar";


function App() {
  return (
    <>
      <NavBar />
      <div>
        <h1 className="text-primary py-3">Dash Board de Vendas</h1>

        <div className="row py-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Sucesso</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas as Vendas</h5>
            <DonutChart />
          </div>
        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas vendas</h2>

        </div>

        <DataTable />
      </div>



      <Footer />
    </>
  );
}

export default App;

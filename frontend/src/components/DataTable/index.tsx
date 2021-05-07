
const DataTable = () => {
    return (
        <div className="table-responsive">
    <table className="table table-striped table-sm">
        <thead>
            <tr>
                <th>Data</th>
                <th>Vendedor</th>
                <th>Clientes visitados</th>
                <th>Negócios fechados</th>
                <th>Valor</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>22/04/2021</td>
                <td>Barry Allen</td>
                <td>34</td>
                <td>25</td>
                <td>15017.00</td>
            </tr>
            <tr>
                <td>22/04/2021</td>
                <td>Logan</td>
                <td>72</td>
                <td>65</td>
                <td>27017.00</td>
            </tr>
            <tr>
                <td>22/04/2021</td>
                <td>DarthVader</td>
                <td>100</td>
                <td>91</td>
                <td>45017.00</td>
            </tr>
            <tr>
                <td>22/04/2021</td>
                <td>Naruto</td>
                <td>48</td>
                <td>40</td>
                <td>14325.00</td>
            </tr>
        </tbody>
    </table>
</div>
    );
}

export default DataTable;

import React from 'react';
// template
import Table from 'react-bootstrap/Table';
import Nutrient from './Nutrient';

const NutrientTable = ({itemInfo}) => {
  return(
    <>
    <h5 className='title'>μμμ±λΆ</h5>
    <Table striped className='table'>
      <Nutrient itemInfo={itemInfo}/>
    </Table>
    </>
  );
}

export default NutrientTable;
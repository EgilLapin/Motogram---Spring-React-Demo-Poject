import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import reportWebVitals from './reportWebVitals';
import {UserSignupPage} from './pages/UserSignupPage';
import * as apiCalls from './api/apiCalls';


const actions = {
  postSignup: apiCalls.signup
}

ReactDOM.render(
  <UserSignupPage actions={actions}/>,
  document.getElementById('root')
);

serviceWorker.unregister();

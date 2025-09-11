import { StyleSheet } from 'react-native';

export let styles = StyleSheet.create({
  container: {
    backgroundColor: '#d6eaff', 
    flex: 1,
    padding: 25,
    alignItems: 'center',
    justifyContent: 'flex-start',
  },
  tituloNome: {
    fontSize: 22,
    fontWeight: 'bold',
    marginBottom: 25,
    textAlign: 'center',
    color: '#003366',   
  },
  caixa: {
    backgroundColor: '#ffffff',
    width: '90%',
    padding: 15,
    marginBottom: 18,
    borderRadius: 6,
    alignItems: 'center',
  },
  subTitulo: {
    fontSize: 17,
    fontWeight: 'bold',
    marginBottom: 8,
    textAlign: 'center',
    color: '#004080',
  },
});
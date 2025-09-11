import { StyleSheet, Text, View } from 'react-native';
import { Titulo } from './src/compenents/titulo/titulo';
import { Conteudo } from './src/compenents/texto/conteudo';

export default function App() {
  return (
    <View style={estilos.container}>
      <Titulo></Titulo>
      <Conteudo></Conteudo>
    </View>
  );
}

const estilos = StyleSheet.create({
  container: {
    backgroundColor: '#d6eaff', 
    flex: 1,
    padding: 25,
    alignItems: 'center',
    justifyContent: 'flex-start',
  },
});

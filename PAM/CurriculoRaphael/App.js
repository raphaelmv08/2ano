import { StyleSheet, Text, View } from 'react-native';

export default function App() {
  return (
    <View style={estilos.container}>
<Text style={estilos.tituloNome}>Raphael Reinaldo Oliveira Silva</Text>


      <View style={estilos.caixa}>
        <Text style={estilos.subTitulo}>Contato</Text>
        <Text>Telefone: (11) 98355-1792</Text>
        <Text>Email: raphael.oliveira@gmail.com</Text>
      </View>

      <View style={estilos.caixa}>
        <Text style={estilos.subTitulo}>Sobre mim</Text>
        <Text>
          Estudante de Desenvolvimento de Sistemas na ETEC. Tenho interesse em
          aprender mais sobre programação e tecnologia, sempre buscando evoluir
          para usar no mercado de trabalho futuramente.
        </Text>
      </View>

      <View style={estilos.caixa}>
        <Text style={estilos.subTitulo}>Formação</Text>
        <Text>Ensino Médio + Técnico em Desenvolvimento de Sistemas – ETEC</Text>
      </View>

      <View style={estilos.caixa}>
        <Text style={estilos.subTitulo}>Competências</Text>
        <Text>• Lógica de Programação</Text>
        <Text>• HTML, CSS, JavaScript</Text>
        <Text>• Java e Banco de Dados</Text>
        <Text>• Gimp, Astah, BRModelo (básico)</Text>
        <Text>• Inglês (Fluente)</Text>
      </View> 

      <View style={estilos.caixa}>
        <Text style={estilos.subTitulo}>Experiência</Text>
        <Text>não possui experiência profissional.</Text>
      </View>
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

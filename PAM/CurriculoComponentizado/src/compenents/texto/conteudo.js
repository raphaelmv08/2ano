import { Text, View, Image } from 'react-native';
import { styles } from './styles';
import { Fragment } from 'react/jsx-runtime';

export function Conteudo() {
     return (
      
        <Fragment>
<View style={styles.caixa}>
        <Text style={styles.subTitulo}>Contato</Text>
        <Text>Telefone: (11) 98355-1792</Text>
        <Text>Email: raphael.oliveira@gmail.com</Text>
      </View>

      <View style={styles.caixa}>
        <Text style={styles.subTitulo}>Sobre mim</Text>
        <Text>
          Estudante de Desenvolvimento de Sistemas na ETEC. Tenho interesse em
          aprender mais sobre programação e tecnologia, sempre buscando evoluir
          para usar no mercado de trabalho futuramente.
        </Text>
      </View>

      <View style={styles.caixa}>
        <Text style={styles.subTitulo}>Formação</Text>
        <Text>Ensino Médio + Técnico em Desenvolvimento de Sistemas – ETEC</Text>
      </View>

      <View style={styles.caixa}>
        <Text style={styles.subTitulo}>Competências</Text>
        <Text>• Lógica de Programação</Text>
        <Text>• HTML, CSS, JavaScript</Text>
        <Text>• Java e Banco de Dados</Text>
        <Text>• Gimp, Astah, BRModelo (básico)</Text>
        <Text>• Inglês (Intermédiario)</Text>
      </View> 

      <View style={styles.caixa}>
        <Text style={styles.subTitulo}>Experiência</Text>
        <Text>não possui experiência profissional.</Text>
      </View>
      </Fragment>
);
}
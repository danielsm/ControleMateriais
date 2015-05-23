package esII.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tarefa.class)
public abstract class Tarefa_ {

	public static volatile SingularAttribute<Tarefa, Long> id;
	public static volatile SingularAttribute<Tarefa, Integer> duracao;
	public static volatile SingularAttribute<Tarefa, String> nome_projeto;
	public static volatile SingularAttribute<Tarefa, Integer> semanaInicio;
	public static volatile SingularAttribute<Tarefa, String> descricao;

}


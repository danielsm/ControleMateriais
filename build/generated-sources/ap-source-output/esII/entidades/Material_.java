package esII.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Material.class)
public abstract class Material_ {

	public static volatile SingularAttribute<Material, Long> id;
	public static volatile SingularAttribute<Material, Integer> quantidade;
	public static volatile SingularAttribute<Material, Long> id_tarefa;
	public static volatile SingularAttribute<Material, String> nome;

}


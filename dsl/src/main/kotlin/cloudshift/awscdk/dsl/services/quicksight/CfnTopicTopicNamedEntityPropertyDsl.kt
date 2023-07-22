@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicTopicNamedEntityPropertyDsl {
  private val cdkBuilder: CfnTopic.TopicNamedEntityProperty.Builder =
      CfnTopic.TopicNamedEntityProperty.builder()

  private val _definition: MutableList<Any> = mutableListOf()

  private val _entitySynonyms: MutableList<String> = mutableListOf()

  /**
   * @param definition The definition of a named entity.
   */
  public fun definition(vararg definition: Any) {
    _definition.addAll(listOf(*definition))
  }

  /**
   * @param definition The definition of a named entity.
   */
  public fun definition(definition: Collection<Any>) {
    _definition.addAll(definition)
  }

  /**
   * @param definition The definition of a named entity.
   */
  public fun definition(definition: IResolvable) {
    cdkBuilder.definition(definition)
  }

  /**
   * @param entityDescription The description of the named entity.
   */
  public fun entityDescription(entityDescription: String) {
    cdkBuilder.entityDescription(entityDescription)
  }

  /**
   * @param entityName The name of the named entity. 
   */
  public fun entityName(entityName: String) {
    cdkBuilder.entityName(entityName)
  }

  /**
   * @param entitySynonyms The other names or aliases for the named entity.
   */
  public fun entitySynonyms(vararg entitySynonyms: String) {
    _entitySynonyms.addAll(listOf(*entitySynonyms))
  }

  /**
   * @param entitySynonyms The other names or aliases for the named entity.
   */
  public fun entitySynonyms(entitySynonyms: Collection<String>) {
    _entitySynonyms.addAll(entitySynonyms)
  }

  /**
   * @param semanticEntityType The type of named entity that a topic represents.
   */
  public fun semanticEntityType(semanticEntityType: IResolvable) {
    cdkBuilder.semanticEntityType(semanticEntityType)
  }

  /**
   * @param semanticEntityType The type of named entity that a topic represents.
   */
  public fun semanticEntityType(semanticEntityType: CfnTopic.SemanticEntityTypeProperty) {
    cdkBuilder.semanticEntityType(semanticEntityType)
  }

  public fun build(): CfnTopic.TopicNamedEntityProperty {
    if(_definition.isNotEmpty()) cdkBuilder.definition(_definition)
    if(_entitySynonyms.isNotEmpty()) cdkBuilder.entitySynonyms(_entitySynonyms)
    return cdkBuilder.build()
  }
}

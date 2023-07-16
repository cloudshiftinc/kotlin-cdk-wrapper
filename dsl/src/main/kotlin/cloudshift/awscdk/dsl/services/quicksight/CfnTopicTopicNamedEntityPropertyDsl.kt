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

  public fun definition(vararg definition: Any) {
    _definition.addAll(listOf(*definition))
  }

  public fun definition(definition: Collection<Any>) {
    _definition.addAll(definition)
  }

  public fun definition(definition: IResolvable) {
    cdkBuilder.definition(definition)
  }

  public fun entityDescription(entityDescription: String) {
    cdkBuilder.entityDescription(entityDescription)
  }

  public fun entityName(entityName: String) {
    cdkBuilder.entityName(entityName)
  }

  public fun entitySynonyms(vararg entitySynonyms: String) {
    _entitySynonyms.addAll(listOf(*entitySynonyms))
  }

  public fun entitySynonyms(entitySynonyms: Collection<String>) {
    _entitySynonyms.addAll(entitySynonyms)
  }

  public fun semanticEntityType(semanticEntityType: IResolvable) {
    cdkBuilder.semanticEntityType(semanticEntityType)
  }

  public fun semanticEntityType(semanticEntityType: CfnTopic.SemanticEntityTypeProperty) {
    cdkBuilder.semanticEntityType(semanticEntityType)
  }

  public fun build(): CfnTopic.TopicNamedEntityProperty {
    if(_definition.isNotEmpty()) cdkBuilder.definition(_definition)
    if(_entitySynonyms.isNotEmpty()) cdkBuilder.entitySynonyms(_entitySynonyms)
    return cdkBuilder.build()
  }
}

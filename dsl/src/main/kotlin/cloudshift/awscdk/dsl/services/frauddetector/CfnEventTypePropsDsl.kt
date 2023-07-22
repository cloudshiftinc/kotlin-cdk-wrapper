@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.frauddetector.CfnEventTypeProps

@CdkDslMarker
public class CfnEventTypePropsDsl {
  private val cdkBuilder: CfnEventTypeProps.Builder = CfnEventTypeProps.builder()

  private val _entityTypes: MutableList<Any> = mutableListOf()

  private val _eventVariables: MutableList<Any> = mutableListOf()

  private val _labels: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The event type description.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param entityTypes The event type entity types. 
   */
  public fun entityTypes(vararg entityTypes: Any) {
    _entityTypes.addAll(listOf(*entityTypes))
  }

  /**
   * @param entityTypes The event type entity types. 
   */
  public fun entityTypes(entityTypes: Collection<Any>) {
    _entityTypes.addAll(entityTypes)
  }

  /**
   * @param entityTypes The event type entity types. 
   */
  public fun entityTypes(entityTypes: IResolvable) {
    cdkBuilder.entityTypes(entityTypes)
  }

  /**
   * @param eventVariables The event type event variables. 
   */
  public fun eventVariables(vararg eventVariables: Any) {
    _eventVariables.addAll(listOf(*eventVariables))
  }

  /**
   * @param eventVariables The event type event variables. 
   */
  public fun eventVariables(eventVariables: Collection<Any>) {
    _eventVariables.addAll(eventVariables)
  }

  /**
   * @param eventVariables The event type event variables. 
   */
  public fun eventVariables(eventVariables: IResolvable) {
    cdkBuilder.eventVariables(eventVariables)
  }

  /**
   * @param labels The event type labels. 
   */
  public fun labels(vararg labels: Any) {
    _labels.addAll(listOf(*labels))
  }

  /**
   * @param labels The event type labels. 
   */
  public fun labels(labels: Collection<Any>) {
    _labels.addAll(labels)
  }

  /**
   * @param labels The event type labels. 
   */
  public fun labels(labels: IResolvable) {
    cdkBuilder.labels(labels)
  }

  /**
   * @param name The event type name. 
   * Pattern : `^[0-9a-z_-]+$`
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEventTypeProps {
    if(_entityTypes.isNotEmpty()) cdkBuilder.entityTypes(_entityTypes)
    if(_eventVariables.isNotEmpty()) cdkBuilder.eventVariables(_eventVariables)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

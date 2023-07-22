@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.frauddetector.CfnDetector

/**
 * The event type details.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.frauddetector.*;
 * EventTypeProperty eventTypeProperty = EventTypeProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .entityTypes(List.of(EntityTypeProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .eventVariables(List.of(EventVariableProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .dataSource("dataSource")
 * .dataType("dataType")
 * .defaultValue("defaultValue")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .variableType("variableType")
 * .build()))
 * .inline(false)
 * .labels(List.of(LabelProperty.builder()
 * .arn("arn")
 * .createdTime("createdTime")
 * .description("description")
 * .inline(false)
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .lastUpdatedTime("lastUpdatedTime")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-frauddetector-detector-eventtype.html)
 */
@CdkDslMarker
public class CfnDetectorEventTypePropertyDsl {
  private val cdkBuilder: CfnDetector.EventTypeProperty.Builder =
      CfnDetector.EventTypeProperty.builder()

  private val _entityTypes: MutableList<Any> = mutableListOf()

  private val _eventVariables: MutableList<Any> = mutableListOf()

  private val _labels: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param arn The entity type ARN.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param createdTime Timestamp of when the event type was created.
   */
  public fun createdTime(createdTime: String) {
    cdkBuilder.createdTime(createdTime)
  }

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
   * @param inline Indicates whether the resource is defined within this CloudFormation template and
   * impacts the create, update, and delete behavior of the stack.
   * If the value is `true` , CloudFormation will create/update/delete the resource when
   * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate that
   * the object exists and then use it within the resource without making changes to the object.
   *
   * For example, when creating `AWS::FraudDetector::Detector` you must define at least two
   * variables. You can set `Inline=true` for these variables and CloudFormation will
   * create/update/delete the Variables as part of stack operations. However, if you set `Inline=false`
   * , CloudFormation will associate the variables to your detector but not execute any changes to the
   * variables.
   */
  public fun `inline`(`inline`: Boolean) {
    cdkBuilder.`inline`(`inline`)
  }

  /**
   * @param inline Indicates whether the resource is defined within this CloudFormation template and
   * impacts the create, update, and delete behavior of the stack.
   * If the value is `true` , CloudFormation will create/update/delete the resource when
   * creating/updating/deleting the stack. If the value is `false` , CloudFormation will validate that
   * the object exists and then use it within the resource without making changes to the object.
   *
   * For example, when creating `AWS::FraudDetector::Detector` you must define at least two
   * variables. You can set `Inline=true` for these variables and CloudFormation will
   * create/update/delete the Variables as part of stack operations. However, if you set `Inline=false`
   * , CloudFormation will associate the variables to your detector but not execute any changes to the
   * variables.
   */
  public fun `inline`(`inline`: IResolvable) {
    cdkBuilder.`inline`(`inline`)
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
   * @param lastUpdatedTime Timestamp of when the event type was last updated.
   */
  public fun lastUpdatedTime(lastUpdatedTime: String) {
    cdkBuilder.lastUpdatedTime(lastUpdatedTime)
  }

  /**
   * @param name The event type name.
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

  public fun build(): CfnDetector.EventTypeProperty {
    if(_entityTypes.isNotEmpty()) cdkBuilder.entityTypes(_entityTypes)
    if(_eventVariables.isNotEmpty()) cdkBuilder.eventVariables(_eventVariables)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

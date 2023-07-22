@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnStateMachine
import software.amazon.awscdk.services.sam.CfnStateMachineProps

/**
 * Properties for defining a `CfnStateMachine`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Object definition;
 * CfnStateMachineProps cfnStateMachineProps = CfnStateMachineProps.builder()
 * .definition(definition)
 * .definitionSubstitutions(Map.of(
 * "definitionSubstitutionsKey", "definitionSubstitutions"))
 * .definitionUri("definitionUri")
 * .events(Map.of(
 * "eventsKey", EventSourceProperty.builder()
 * .properties(ApiEventProperty.builder()
 * .method("method")
 * .path("path")
 * // the properties below are optional
 * .restApiId("restApiId")
 * .build())
 * .type("type")
 * .build()))
 * .logging(LoggingConfigurationProperty.builder()
 * .destinations(List.of(LogDestinationProperty.builder()
 * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .build()))
 * .includeExecutionData(false)
 * .level("level")
 * .build())
 * .name("name")
 * .permissionsBoundaries("permissionsBoundaries")
 * .policies("policies")
 * .role("role")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .tracing(TracingConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html)
 */
@CdkDslMarker
public class CfnStateMachinePropsDsl {
  private val cdkBuilder: CfnStateMachineProps.Builder = CfnStateMachineProps.builder()

  private val _policies: MutableList<Any> = mutableListOf()

  /**
   * @param definition the value to be set.
   */
  public fun definition(definition: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(definition)
    cdkBuilder.definition(builder.map)
  }

  /**
   * @param definition the value to be set.
   */
  public fun definition(definition: Any) {
    cdkBuilder.definition(definition)
  }

  /**
   * @param definitionSubstitutions the value to be set.
   */
  public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
    cdkBuilder.definitionSubstitutions(definitionSubstitutions)
  }

  /**
   * @param definitionSubstitutions the value to be set.
   */
  public fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
    cdkBuilder.definitionSubstitutions(definitionSubstitutions)
  }

  /**
   * @param definitionUri the value to be set.
   */
  public fun definitionUri(definitionUri: String) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * @param definitionUri the value to be set.
   */
  public fun definitionUri(definitionUri: IResolvable) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * @param definitionUri the value to be set.
   */
  public fun definitionUri(definitionUri: CfnStateMachine.S3LocationProperty) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * @param events the value to be set.
   */
  public fun events(events: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(events)
    cdkBuilder.events(builder.map)
  }

  /**
   * @param events the value to be set.
   */
  public fun events(events: Map<String, Any>) {
    cdkBuilder.events(events)
  }

  /**
   * @param events the value to be set.
   */
  public fun events(events: IResolvable) {
    cdkBuilder.events(events)
  }

  /**
   * @param logging the value to be set.
   */
  public fun logging(logging: IResolvable) {
    cdkBuilder.logging(logging)
  }

  /**
   * @param logging the value to be set.
   */
  public fun logging(logging: CfnStateMachine.LoggingConfigurationProperty) {
    cdkBuilder.logging(logging)
  }

  /**
   * @param name the value to be set.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param permissionsBoundaries the value to be set.
   */
  public fun permissionsBoundaries(permissionsBoundaries: String) {
    cdkBuilder.permissionsBoundaries(permissionsBoundaries)
  }

  /**
   * @param policies the value to be set.
   */
  public fun policies(policies: String) {
    cdkBuilder.policies(policies)
  }

  /**
   * @param policies the value to be set.
   */
  public fun policies(vararg policies: Any) {
    _policies.addAll(listOf(*policies))
  }

  /**
   * @param policies the value to be set.
   */
  public fun policies(policies: Collection<Any>) {
    _policies.addAll(policies)
  }

  /**
   * @param policies the value to be set.
   */
  public fun policies(policies: IResolvable) {
    cdkBuilder.policies(policies)
  }

  /**
   * @param policies the value to be set.
   */
  public fun policies(policies: CfnStateMachine.IAMPolicyDocumentProperty) {
    cdkBuilder.policies(policies)
  }

  /**
   * @param role the value to be set.
   */
  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  /**
   * @param tags the value to be set.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param tracing the value to be set.
   */
  public fun tracing(tracing: IResolvable) {
    cdkBuilder.tracing(tracing)
  }

  /**
   * @param tracing the value to be set.
   */
  public fun tracing(tracing: CfnStateMachine.TracingConfigurationProperty) {
    cdkBuilder.tracing(tracing)
  }

  /**
   * @param type the value to be set.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnStateMachineProps {
    if(_policies.isNotEmpty()) cdkBuilder.policies(_policies)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import software.constructs.Construct

@CdkDslMarker
public class CfnStateMachineDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStateMachine.Builder = CfnStateMachine.Builder.create(scope, id)

  private val _tags: MutableList<CfnStateMachine.TagsEntryProperty> = mutableListOf()

  public fun definition(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.definition(builder.map)
  }

  public fun definition(definition: Any) {
    cdkBuilder.definition(definition)
  }

  public fun definitionS3Location(definitionS3Location: IResolvable) {
    cdkBuilder.definitionS3Location(definitionS3Location)
  }

  public fun definitionS3Location(definitionS3Location: CfnStateMachine.S3LocationProperty) {
    cdkBuilder.definitionS3Location(definitionS3Location)
  }

  public fun definitionString(definitionString: String) {
    cdkBuilder.definitionString(definitionString)
  }

  public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
    cdkBuilder.definitionSubstitutions(definitionSubstitutions)
  }

  public fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
    cdkBuilder.definitionSubstitutions(definitionSubstitutions)
  }

  public fun loggingConfiguration(loggingConfiguration: IResolvable) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  public
      fun loggingConfiguration(loggingConfiguration: CfnStateMachine.LoggingConfigurationProperty) {
    cdkBuilder.loggingConfiguration(loggingConfiguration)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun stateMachineName(stateMachineName: String) {
    cdkBuilder.stateMachineName(stateMachineName)
  }

  public fun stateMachineType(stateMachineType: String) {
    cdkBuilder.stateMachineType(stateMachineType)
  }

  public fun tags(tags: CfnStateMachineTagsEntryPropertyDsl.() -> Unit) {
    _tags.add(CfnStateMachineTagsEntryPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnStateMachine.TagsEntryProperty>) {
    _tags.addAll(tags)
  }

  public fun tracingConfiguration(tracingConfiguration: IResolvable) {
    cdkBuilder.tracingConfiguration(tracingConfiguration)
  }

  public
      fun tracingConfiguration(tracingConfiguration: CfnStateMachine.TracingConfigurationProperty) {
    cdkBuilder.tracingConfiguration(tracingConfiguration)
  }

  public fun build(): CfnStateMachine {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

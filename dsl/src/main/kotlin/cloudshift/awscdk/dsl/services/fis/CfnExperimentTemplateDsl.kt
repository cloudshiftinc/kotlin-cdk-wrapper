@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnExperimentTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnExperimentTemplate.Builder =
      CfnExperimentTemplate.Builder.create(scope, id)

  private val _stopConditions: MutableList<Any> = mutableListOf()

  public fun actions(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.actions(builder.map)
  }

  public fun actions(actions: Map<String, *>) {
    cdkBuilder.actions(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun logConfiguration(logConfiguration: IResolvable) {
    cdkBuilder.logConfiguration(logConfiguration)
  }

  public
      fun logConfiguration(logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty) {
    cdkBuilder.logConfiguration(logConfiguration)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun stopConditions(vararg stopConditions: Any) {
    _stopConditions.addAll(listOf(*stopConditions))
  }

  public fun stopConditions(stopConditions: Collection<Any>) {
    _stopConditions.addAll(stopConditions)
  }

  public fun stopConditions(stopConditions: IResolvable) {
    cdkBuilder.stopConditions(stopConditions)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun targets(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.targets(builder.map)
  }

  public fun targets(targets: Map<String, *>) {
    cdkBuilder.targets(targets)
  }

  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  public fun build(): CfnExperimentTemplate {
    if(_stopConditions.isNotEmpty()) cdkBuilder.stopConditions(_stopConditions)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow
import software.amazon.awscdk.services.appflow.CfnFlowProps

@CdkDslMarker
public class CfnFlowPropsDsl {
  private val cdkBuilder: CfnFlowProps.Builder = CfnFlowProps.builder()

  private val _destinationFlowConfigList: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _tasks: MutableList<Any> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun destinationFlowConfigList(vararg destinationFlowConfigList: Any) {
    _destinationFlowConfigList.addAll(listOf(*destinationFlowConfigList))
  }

  public fun destinationFlowConfigList(destinationFlowConfigList: Collection<Any>) {
    _destinationFlowConfigList.addAll(destinationFlowConfigList)
  }

  public fun destinationFlowConfigList(destinationFlowConfigList: IResolvable) {
    cdkBuilder.destinationFlowConfigList(destinationFlowConfigList)
  }

  public fun flowName(flowName: String) {
    cdkBuilder.flowName(flowName)
  }

  public fun flowStatus(flowStatus: String) {
    cdkBuilder.flowStatus(flowStatus)
  }

  public fun kmsArn(kmsArn: String) {
    cdkBuilder.kmsArn(kmsArn)
  }

  public fun metadataCatalogConfig(metadataCatalogConfig: IResolvable) {
    cdkBuilder.metadataCatalogConfig(metadataCatalogConfig)
  }

  public fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty) {
    cdkBuilder.metadataCatalogConfig(metadataCatalogConfig)
  }

  public fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
    cdkBuilder.sourceFlowConfig(sourceFlowConfig)
  }

  public fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty) {
    cdkBuilder.sourceFlowConfig(sourceFlowConfig)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun tasks(vararg tasks: Any) {
    _tasks.addAll(listOf(*tasks))
  }

  public fun tasks(tasks: Collection<Any>) {
    _tasks.addAll(tasks)
  }

  public fun tasks(tasks: IResolvable) {
    cdkBuilder.tasks(tasks)
  }

  public fun triggerConfig(triggerConfig: IResolvable) {
    cdkBuilder.triggerConfig(triggerConfig)
  }

  public fun triggerConfig(triggerConfig: CfnFlow.TriggerConfigProperty) {
    cdkBuilder.triggerConfig(triggerConfig)
  }

  public fun build(): CfnFlowProps {
    if(_destinationFlowConfigList.isNotEmpty())
        cdkBuilder.destinationFlowConfigList(_destinationFlowConfigList)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_tasks.isNotEmpty()) cdkBuilder.tasks(_tasks)
    return cdkBuilder.build()
  }
}

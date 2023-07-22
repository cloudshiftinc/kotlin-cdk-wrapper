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

  /**
   * @param description A user-entered description of the flow.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places data
   * in the destination connector. 
   */
  public fun destinationFlowConfigList(vararg destinationFlowConfigList: Any) {
    _destinationFlowConfigList.addAll(listOf(*destinationFlowConfigList))
  }

  /**
   * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places data
   * in the destination connector. 
   */
  public fun destinationFlowConfigList(destinationFlowConfigList: Collection<Any>) {
    _destinationFlowConfigList.addAll(destinationFlowConfigList)
  }

  /**
   * @param destinationFlowConfigList The configuration that controls how Amazon AppFlow places data
   * in the destination connector. 
   */
  public fun destinationFlowConfigList(destinationFlowConfigList: IResolvable) {
    cdkBuilder.destinationFlowConfigList(destinationFlowConfigList)
  }

  /**
   * @param flowName The specified name of the flow. 
   * Spaces are not allowed. Use underscores (_) or hyphens (-) only.
   */
  public fun flowName(flowName: String) {
    cdkBuilder.flowName(flowName)
  }

  /**
   * @param flowStatus Sets the status of the flow. You can specify one of the following values:.
   * * **Active** - The flow runs based on the trigger settings that you defined. Active scheduled
   * flows run as scheduled, and active event-triggered flows run when the specified change event
   * occurs. However, active on-demand flows run only when you manually start them by using Amazon
   * AppFlow.
   * * **Suspended** - You can use this option to deactivate an active flow. Scheduled and
   * event-triggered flows will cease to run until you reactive them. This value only affects scheduled
   * and event-triggered flows. It has no effect for on-demand flows.
   *
   * If you omit the FlowStatus parameter, Amazon AppFlow creates the flow with a default status.
   * The default status for on-demand flows is Active. The default status for scheduled and
   * event-triggered flows is Draft, which means they’re not yet active.
   */
  public fun flowStatus(flowStatus: String) {
    cdkBuilder.flowStatus(flowStatus)
  }

  /**
   * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
   * provide for encryption.
   * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
   * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
   */
  public fun kmsArn(kmsArn: String) {
    cdkBuilder.kmsArn(kmsArn)
  }

  /**
   * @param metadataCatalogConfig Configurations of metadata catalog of the flow.
   */
  public fun metadataCatalogConfig(metadataCatalogConfig: IResolvable) {
    cdkBuilder.metadataCatalogConfig(metadataCatalogConfig)
  }

  /**
   * @param metadataCatalogConfig Configurations of metadata catalog of the flow.
   */
  public fun metadataCatalogConfig(metadataCatalogConfig: CfnFlow.MetadataCatalogConfigProperty) {
    cdkBuilder.metadataCatalogConfig(metadataCatalogConfig)
  }

  /**
   * @param sourceFlowConfig Contains information about the configuration of the source connector
   * used in the flow. 
   */
  public fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
    cdkBuilder.sourceFlowConfig(sourceFlowConfig)
  }

  /**
   * @param sourceFlowConfig Contains information about the configuration of the source connector
   * used in the flow. 
   */
  public fun sourceFlowConfig(sourceFlowConfig: CfnFlow.SourceFlowConfigProperty) {
    cdkBuilder.sourceFlowConfig(sourceFlowConfig)
  }

  /**
   * @param tags The tags used to organize, track, or control access for your flow.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags used to organize, track, or control access for your flow.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
   * flow run. 
   */
  public fun tasks(vararg tasks: Any) {
    _tasks.addAll(listOf(*tasks))
  }

  /**
   * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
   * flow run. 
   */
  public fun tasks(tasks: Collection<Any>) {
    _tasks.addAll(tasks)
  }

  /**
   * @param tasks A list of tasks that Amazon AppFlow performs while transferring the data in the
   * flow run. 
   */
  public fun tasks(tasks: IResolvable) {
    cdkBuilder.tasks(tasks)
  }

  /**
   * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
   * specified flow. 
   */
  public fun triggerConfig(triggerConfig: IResolvable) {
    cdkBuilder.triggerConfig(triggerConfig)
  }

  /**
   * @param triggerConfig The trigger settings that determine how and when Amazon AppFlow runs the
   * specified flow. 
   */
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

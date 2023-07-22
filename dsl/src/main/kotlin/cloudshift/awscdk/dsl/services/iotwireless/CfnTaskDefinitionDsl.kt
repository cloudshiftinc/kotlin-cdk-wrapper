@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition
import software.constructs.Construct

@CdkDslMarker
public class CfnTaskDefinitionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTaskDefinition.Builder = CfnTaskDefinition.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Whether to automatically create tasks using this task definition for all gateways with the
   * specified current version.
   *
   * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-autocreatetasks)
   * @param autoCreateTasks Whether to automatically create tasks using this task definition for all
   * gateways with the specified current version. 
   */
  public fun autoCreateTasks(autoCreateTasks: Boolean) {
    cdkBuilder.autoCreateTasks(autoCreateTasks)
  }

  /**
   * Whether to automatically create tasks using this task definition for all gateways with the
   * specified current version.
   *
   * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-autocreatetasks)
   * @param autoCreateTasks Whether to automatically create tasks using this task definition for all
   * gateways with the specified current version. 
   */
  public fun autoCreateTasks(autoCreateTasks: IResolvable) {
    cdkBuilder.autoCreateTasks(autoCreateTasks)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
   * @param loRaWanUpdateGatewayTaskEntry 
   */
  public fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable) {
    cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
   * @param loRaWanUpdateGatewayTaskEntry 
   */
  public
      fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty) {
    cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry)
  }

  /**
   * The name of the new resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-name)
   * @param name The name of the new resource. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-tags)
   * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-tags)
   * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * A filter to list only the wireless gateway task definitions that use this task definition type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-taskdefinitiontype)
   * @param taskDefinitionType A filter to list only the wireless gateway task definitions that use
   * this task definition type. 
   */
  public fun taskDefinitionType(taskDefinitionType: String) {
    cdkBuilder.taskDefinitionType(taskDefinitionType)
  }

  /**
   * Information about the gateways to update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
   * @param update Information about the gateways to update. 
   */
  public fun update(update: IResolvable) {
    cdkBuilder.update(update)
  }

  /**
   * Information about the gateways to update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
   * @param update Information about the gateways to update. 
   */
  public fun update(update: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty) {
    cdkBuilder.update(update)
  }

  public fun build(): CfnTaskDefinition {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

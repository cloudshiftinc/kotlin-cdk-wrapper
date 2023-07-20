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

  public fun autoCreateTasks(autoCreateTasks: Boolean) {
    cdkBuilder.autoCreateTasks(autoCreateTasks)
  }

  public fun autoCreateTasks(autoCreateTasks: IResolvable) {
    cdkBuilder.autoCreateTasks(autoCreateTasks)
  }

  public fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable) {
    cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry)
  }

  public
      fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty) {
    cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun taskDefinitionType(taskDefinitionType: String) {
    cdkBuilder.taskDefinitionType(taskDefinitionType)
  }

  public fun update(update: IResolvable) {
    cdkBuilder.update(update)
  }

  public fun update(update: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty) {
    cdkBuilder.update(update)
  }

  public fun build(): CfnTaskDefinition {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

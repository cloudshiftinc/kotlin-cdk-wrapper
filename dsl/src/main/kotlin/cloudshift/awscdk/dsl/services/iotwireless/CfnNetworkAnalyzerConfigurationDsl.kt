@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnNetworkAnalyzerConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNetworkAnalyzerConfiguration.Builder =
      CfnNetworkAnalyzerConfiguration.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _wirelessDevices: MutableList<String> = mutableListOf()

  private val _wirelessGateways: MutableList<String> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
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

  public fun traceContent(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.traceContent(builder.map)
  }

  public fun traceContent(traceContent: Any) {
    cdkBuilder.traceContent(traceContent)
  }

  public fun wirelessDevices(vararg wirelessDevices: String) {
    _wirelessDevices.addAll(listOf(*wirelessDevices))
  }

  public fun wirelessDevices(wirelessDevices: Collection<String>) {
    _wirelessDevices.addAll(wirelessDevices)
  }

  public fun wirelessGateways(vararg wirelessGateways: String) {
    _wirelessGateways.addAll(listOf(*wirelessGateways))
  }

  public fun wirelessGateways(wirelessGateways: Collection<String>) {
    _wirelessGateways.addAll(wirelessGateways)
  }

  public fun build(): CfnNetworkAnalyzerConfiguration {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_wirelessDevices.isNotEmpty()) cdkBuilder.wirelessDevices(_wirelessDevices)
    if(_wirelessGateways.isNotEmpty()) cdkBuilder.wirelessGateways(_wirelessGateways)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnDevice
import software.amazon.awscdk.services.networkmanager.CfnDeviceProps

@CdkDslMarker
public class CfnDevicePropsDsl {
  private val cdkBuilder: CfnDeviceProps.Builder = CfnDeviceProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun awsLocation(awsLocation: IResolvable) {
    cdkBuilder.awsLocation(awsLocation)
  }

  public fun awsLocation(awsLocation: CfnDevice.AWSLocationProperty) {
    cdkBuilder.awsLocation(awsLocation)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  public fun location(location: CfnDevice.LocationProperty) {
    cdkBuilder.location(location)
  }

  public fun model(model: String) {
    cdkBuilder.model(model)
  }

  public fun serialNumber(serialNumber: String) {
    cdkBuilder.serialNumber(serialNumber)
  }

  public fun siteId(siteId: String) {
    cdkBuilder.siteId(siteId)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun vendor(vendor: String) {
    cdkBuilder.vendor(vendor)
  }

  public fun build(): CfnDeviceProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

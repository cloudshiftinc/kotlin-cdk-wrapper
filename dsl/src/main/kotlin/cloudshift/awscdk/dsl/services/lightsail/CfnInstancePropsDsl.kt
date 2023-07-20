@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnInstance
import software.amazon.awscdk.services.lightsail.CfnInstanceProps

@CdkDslMarker
public class CfnInstancePropsDsl {
  private val cdkBuilder: CfnInstanceProps.Builder = CfnInstanceProps.builder()

  private val _addOns: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun addOns(vararg addOns: Any) {
    _addOns.addAll(listOf(*addOns))
  }

  public fun addOns(addOns: Collection<Any>) {
    _addOns.addAll(addOns)
  }

  public fun addOns(addOns: IResolvable) {
    cdkBuilder.addOns(addOns)
  }

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun blueprintId(blueprintId: String) {
    cdkBuilder.blueprintId(blueprintId)
  }

  public fun bundleId(bundleId: String) {
    cdkBuilder.bundleId(bundleId)
  }

  public fun hardware(hardware: IResolvable) {
    cdkBuilder.hardware(hardware)
  }

  public fun hardware(hardware: CfnInstance.HardwareProperty) {
    cdkBuilder.hardware(hardware)
  }

  public fun instanceName(instanceName: String) {
    cdkBuilder.instanceName(instanceName)
  }

  public fun keyPairName(keyPairName: String) {
    cdkBuilder.keyPairName(keyPairName)
  }

  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  public fun location(location: CfnInstance.LocationProperty) {
    cdkBuilder.location(location)
  }

  public fun networking(networking: IResolvable) {
    cdkBuilder.networking(networking)
  }

  public fun networking(networking: CfnInstance.NetworkingProperty) {
    cdkBuilder.networking(networking)
  }

  public fun state(state: IResolvable) {
    cdkBuilder.state(state)
  }

  public fun state(state: CfnInstance.StateProperty) {
    cdkBuilder.state(state)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun userData(userData: String) {
    cdkBuilder.userData(userData)
  }

  public fun build(): CfnInstanceProps {
    if(_addOns.isNotEmpty()) cdkBuilder.addOns(_addOns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

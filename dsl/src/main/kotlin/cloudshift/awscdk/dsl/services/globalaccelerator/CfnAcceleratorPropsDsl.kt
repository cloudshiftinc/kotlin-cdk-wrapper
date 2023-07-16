@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps

@CdkDslMarker
public class CfnAcceleratorPropsDsl {
  private val cdkBuilder: CfnAcceleratorProps.Builder = CfnAcceleratorProps.builder()

  private val _ipAddresses: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun ipAddressType(ipAddressType: String) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  public fun ipAddresses(vararg ipAddresses: String) {
    _ipAddresses.addAll(listOf(*ipAddresses))
  }

  public fun ipAddresses(ipAddresses: Collection<String>) {
    _ipAddresses.addAll(ipAddresses)
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

  public fun build(): CfnAcceleratorProps {
    if(_ipAddresses.isNotEmpty()) cdkBuilder.ipAddresses(_ipAddresses)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

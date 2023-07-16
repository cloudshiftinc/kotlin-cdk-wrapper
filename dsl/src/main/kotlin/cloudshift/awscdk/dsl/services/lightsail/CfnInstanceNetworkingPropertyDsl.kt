@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnInstance

@CdkDslMarker
public class CfnInstanceNetworkingPropertyDsl {
  private val cdkBuilder: CfnInstance.NetworkingProperty.Builder =
      CfnInstance.NetworkingProperty.builder()

  private val _ports: MutableList<Any> = mutableListOf()

  public fun monthlyTransfer(monthlyTransfer: Number) {
    cdkBuilder.monthlyTransfer(monthlyTransfer)
  }

  public fun ports(vararg ports: Any) {
    _ports.addAll(listOf(*ports))
  }

  public fun ports(ports: Collection<Any>) {
    _ports.addAll(ports)
  }

  public fun ports(ports: IResolvable) {
    cdkBuilder.ports(ports)
  }

  public fun build(): CfnInstance.NetworkingProperty {
    if(_ports.isNotEmpty()) cdkBuilder.ports(_ports)
    return cdkBuilder.build()
  }
}

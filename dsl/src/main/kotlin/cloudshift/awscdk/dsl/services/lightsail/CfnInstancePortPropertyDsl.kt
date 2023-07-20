@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lightsail.CfnInstance

@CdkDslMarker
public class CfnInstancePortPropertyDsl {
  private val cdkBuilder: CfnInstance.PortProperty.Builder = CfnInstance.PortProperty.builder()

  private val _cidrListAliases: MutableList<String> = mutableListOf()

  private val _cidrs: MutableList<String> = mutableListOf()

  private val _ipv6Cidrs: MutableList<String> = mutableListOf()

  public fun accessDirection(accessDirection: String) {
    cdkBuilder.accessDirection(accessDirection)
  }

  public fun accessFrom(accessFrom: String) {
    cdkBuilder.accessFrom(accessFrom)
  }

  public fun accessType(accessType: String) {
    cdkBuilder.accessType(accessType)
  }

  public fun cidrListAliases(vararg cidrListAliases: String) {
    _cidrListAliases.addAll(listOf(*cidrListAliases))
  }

  public fun cidrListAliases(cidrListAliases: Collection<String>) {
    _cidrListAliases.addAll(cidrListAliases)
  }

  public fun cidrs(vararg cidrs: String) {
    _cidrs.addAll(listOf(*cidrs))
  }

  public fun cidrs(cidrs: Collection<String>) {
    _cidrs.addAll(cidrs)
  }

  public fun commonName(commonName: String) {
    cdkBuilder.commonName(commonName)
  }

  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  public fun ipv6Cidrs(vararg ipv6Cidrs: String) {
    _ipv6Cidrs.addAll(listOf(*ipv6Cidrs))
  }

  public fun ipv6Cidrs(ipv6Cidrs: Collection<String>) {
    _ipv6Cidrs.addAll(ipv6Cidrs)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): CfnInstance.PortProperty {
    if(_cidrListAliases.isNotEmpty()) cdkBuilder.cidrListAliases(_cidrListAliases)
    if(_cidrs.isNotEmpty()) cdkBuilder.cidrs(_cidrs)
    if(_ipv6Cidrs.isNotEmpty()) cdkBuilder.ipv6Cidrs(_ipv6Cidrs)
    return cdkBuilder.build()
  }
}

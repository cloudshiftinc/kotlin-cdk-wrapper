@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.transfer.CfnServer

@CdkDslMarker
public class CfnServerProtocolDetailsPropertyDsl {
  private val cdkBuilder: CfnServer.ProtocolDetailsProperty.Builder =
      CfnServer.ProtocolDetailsProperty.builder()

  private val _as2Transports: MutableList<String> = mutableListOf()

  public fun as2Transports(vararg as2Transports: String) {
    _as2Transports.addAll(listOf(*as2Transports))
  }

  public fun as2Transports(as2Transports: Collection<String>) {
    _as2Transports.addAll(as2Transports)
  }

  public fun passiveIp(passiveIp: String) {
    cdkBuilder.passiveIp(passiveIp)
  }

  public fun setStatOption(setStatOption: String) {
    cdkBuilder.setStatOption(setStatOption)
  }

  public fun tlsSessionResumptionMode(tlsSessionResumptionMode: String) {
    cdkBuilder.tlsSessionResumptionMode(tlsSessionResumptionMode)
  }

  public fun build(): CfnServer.ProtocolDetailsProperty {
    if(_as2Transports.isNotEmpty()) cdkBuilder.as2Transports(_as2Transports)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnFleet

@CdkDslMarker
public class CfnFleetDomainJoinInfoPropertyDsl {
  private val cdkBuilder: CfnFleet.DomainJoinInfoProperty.Builder =
      CfnFleet.DomainJoinInfoProperty.builder()

  public fun directoryName(directoryName: String) {
    cdkBuilder.directoryName(directoryName)
  }

  public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
    cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
  }

  public fun build(): CfnFleet.DomainJoinInfoProperty = cdkBuilder.build()
}

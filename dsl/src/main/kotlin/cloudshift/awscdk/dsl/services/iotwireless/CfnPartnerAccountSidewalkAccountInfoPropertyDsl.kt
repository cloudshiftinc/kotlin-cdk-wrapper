@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount

@CdkDslMarker
public class CfnPartnerAccountSidewalkAccountInfoPropertyDsl {
  private val cdkBuilder: CfnPartnerAccount.SidewalkAccountInfoProperty.Builder =
      CfnPartnerAccount.SidewalkAccountInfoProperty.builder()

  public fun appServerPrivateKey(appServerPrivateKey: String) {
    cdkBuilder.appServerPrivateKey(appServerPrivateKey)
  }

  public fun build(): CfnPartnerAccount.SidewalkAccountInfoProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount

@CdkDslMarker
public class CfnPartnerAccountSidewalkAccountInfoWithFingerprintPropertyDsl {
  private val cdkBuilder: CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.Builder =
      CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty.builder()

  /**
   * @param amazonId The Sidewalk Amazon ID.
   */
  public fun amazonId(amazonId: String) {
    cdkBuilder.amazonId(amazonId)
  }

  /**
   * @param arn The Amazon Resource Name (ARN) of the resource.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param fingerprint The fingerprint of the Sidewalk application server private key.
   */
  public fun fingerprint(fingerprint: String) {
    cdkBuilder.fingerprint(fingerprint)
  }

  public fun build(): CfnPartnerAccount.SidewalkAccountInfoWithFingerprintProperty =
      cdkBuilder.build()
}

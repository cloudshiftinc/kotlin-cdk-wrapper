@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnPartnerAccount

/**
 * Information about a Sidewalk account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * SidewalkAccountInfoWithFingerprintProperty sidewalkAccountInfoWithFingerprintProperty =
 * SidewalkAccountInfoWithFingerprintProperty.builder()
 * .amazonId("amazonId")
 * .arn("arn")
 * .fingerprint("fingerprint")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-partneraccount-sidewalkaccountinfowithfingerprint.html)
 */
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

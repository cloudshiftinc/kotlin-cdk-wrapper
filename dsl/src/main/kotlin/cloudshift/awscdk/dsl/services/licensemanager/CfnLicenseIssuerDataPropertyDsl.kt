@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.licensemanager.CfnLicense

/**
 * Details associated with the issuer of a license.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.licensemanager.*;
 * IssuerDataProperty issuerDataProperty = IssuerDataProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .signKey("signKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-issuerdata.html)
 */
@CdkDslMarker
public class CfnLicenseIssuerDataPropertyDsl {
  private val cdkBuilder: CfnLicense.IssuerDataProperty.Builder =
      CfnLicense.IssuerDataProperty.builder()

  /**
   * @param name Issuer name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param signKey Asymmetric KMS key from AWS Key Management Service .
   * The KMS key must have a key usage of sign and verify, and support the RSASSA-PSS SHA-256
   * signing algorithm.
   */
  public fun signKey(signKey: String) {
    cdkBuilder.signKey(signKey)
  }

  public fun build(): CfnLicense.IssuerDataProperty = cdkBuilder.build()
}

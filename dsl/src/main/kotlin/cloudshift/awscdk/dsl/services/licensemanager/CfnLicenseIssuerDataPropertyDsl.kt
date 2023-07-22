@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.licensemanager.CfnLicense

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

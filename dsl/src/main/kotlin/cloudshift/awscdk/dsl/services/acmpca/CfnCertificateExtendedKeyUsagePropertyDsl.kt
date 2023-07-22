@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificateExtendedKeyUsagePropertyDsl {
  private val cdkBuilder: CfnCertificate.ExtendedKeyUsageProperty.Builder =
      CfnCertificate.ExtendedKeyUsageProperty.builder()

  /**
   * @param extendedKeyUsageObjectIdentifier Specifies a custom `ExtendedKeyUsage` with an object
   * identifier (OID).
   */
  public fun extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier: String) {
    cdkBuilder.extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier)
  }

  /**
   * @param extendedKeyUsageType Specifies a standard `ExtendedKeyUsage` as defined as in [RFC
   * 5280](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.12)
   * .
   */
  public fun extendedKeyUsageType(extendedKeyUsageType: String) {
    cdkBuilder.extendedKeyUsageType(extendedKeyUsageType)
  }

  public fun build(): CfnCertificate.ExtendedKeyUsageProperty = cdkBuilder.build()
}

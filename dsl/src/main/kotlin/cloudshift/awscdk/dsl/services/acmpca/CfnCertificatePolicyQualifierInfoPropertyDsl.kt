@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificatePolicyQualifierInfoPropertyDsl {
  private val cdkBuilder: CfnCertificate.PolicyQualifierInfoProperty.Builder =
      CfnCertificate.PolicyQualifierInfoProperty.builder()

  public fun policyQualifierId(policyQualifierId: String) {
    cdkBuilder.policyQualifierId(policyQualifierId)
  }

  public fun qualifier(qualifier: IResolvable) {
    cdkBuilder.qualifier(qualifier)
  }

  public fun qualifier(qualifier: CfnCertificate.QualifierProperty) {
    cdkBuilder.qualifier(qualifier)
  }

  public fun build(): CfnCertificate.PolicyQualifierInfoProperty = cdkBuilder.build()
}

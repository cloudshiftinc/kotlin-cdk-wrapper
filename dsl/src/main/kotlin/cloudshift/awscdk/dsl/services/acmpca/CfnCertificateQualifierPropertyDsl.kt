@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificateQualifierPropertyDsl {
  private val cdkBuilder: CfnCertificate.QualifierProperty.Builder =
      CfnCertificate.QualifierProperty.builder()

  /**
   * @param cpsUri Contains a pointer to a certification practice statement (CPS) published by the
   * CA. 
   */
  public fun cpsUri(cpsUri: String) {
    cdkBuilder.cpsUri(cpsUri)
  }

  public fun build(): CfnCertificate.QualifierProperty = cdkBuilder.build()
}

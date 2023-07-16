@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificateValidityPropertyDsl {
  private val cdkBuilder: CfnCertificate.ValidityProperty.Builder =
      CfnCertificate.ValidityProperty.builder()

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCertificate.ValidityProperty = cdkBuilder.build()
}

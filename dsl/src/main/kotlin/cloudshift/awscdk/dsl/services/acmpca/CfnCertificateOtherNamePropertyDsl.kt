@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificateOtherNamePropertyDsl {
  private val cdkBuilder: CfnCertificate.OtherNameProperty.Builder =
      CfnCertificate.OtherNameProperty.builder()

  /**
   * @param typeId Specifies an OID. 
   */
  public fun typeId(typeId: String) {
    cdkBuilder.typeId(typeId)
  }

  /**
   * @param value Specifies an OID value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCertificate.OtherNameProperty = cdkBuilder.build()
}

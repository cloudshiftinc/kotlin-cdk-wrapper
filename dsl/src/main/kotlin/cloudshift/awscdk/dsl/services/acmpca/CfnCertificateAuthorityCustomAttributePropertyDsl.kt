@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@CdkDslMarker
public class CfnCertificateAuthorityCustomAttributePropertyDsl {
  private val cdkBuilder: CfnCertificateAuthority.CustomAttributeProperty.Builder =
      CfnCertificateAuthority.CustomAttributeProperty.builder()

  /**
   * @param objectIdentifier Specifies the object identifier (OID) of the attribute type of the
   * relative distinguished name (RDN). 
   */
  public fun objectIdentifier(objectIdentifier: String) {
    cdkBuilder.objectIdentifier(objectIdentifier)
  }

  /**
   * @param value Specifies the attribute value of relative distinguished name (RDN). 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCertificateAuthority.CustomAttributeProperty = cdkBuilder.build()
}

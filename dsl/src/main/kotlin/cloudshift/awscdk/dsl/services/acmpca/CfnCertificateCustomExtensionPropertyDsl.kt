@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificateCustomExtensionPropertyDsl {
  private val cdkBuilder: CfnCertificate.CustomExtensionProperty.Builder =
      CfnCertificate.CustomExtensionProperty.builder()

  public fun critical(critical: Boolean) {
    cdkBuilder.critical(critical)
  }

  public fun critical(critical: IResolvable) {
    cdkBuilder.critical(critical)
  }

  public fun objectIdentifier(objectIdentifier: String) {
    cdkBuilder.objectIdentifier(objectIdentifier)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCertificate.CustomExtensionProperty = cdkBuilder.build()
}

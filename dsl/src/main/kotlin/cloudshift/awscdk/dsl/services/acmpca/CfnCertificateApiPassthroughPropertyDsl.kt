@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate

@CdkDslMarker
public class CfnCertificateApiPassthroughPropertyDsl {
  private val cdkBuilder: CfnCertificate.ApiPassthroughProperty.Builder =
      CfnCertificate.ApiPassthroughProperty.builder()

  public fun extensions(extensions: IResolvable) {
    cdkBuilder.extensions(extensions)
  }

  public fun extensions(extensions: CfnCertificate.ExtensionsProperty) {
    cdkBuilder.extensions(extensions)
  }

  public fun subject(subject: IResolvable) {
    cdkBuilder.subject(subject)
  }

  public fun subject(subject: CfnCertificate.SubjectProperty) {
    cdkBuilder.subject(subject)
  }

  public fun build(): CfnCertificate.ApiPassthroughProperty = cdkBuilder.build()
}

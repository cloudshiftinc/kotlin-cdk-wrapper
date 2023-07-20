@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeTlsValidationContextTrustPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.TlsValidationContextTrustProperty.Builder =
      CfnVirtualNode.TlsValidationContextTrustProperty.builder()

  public fun acm(acm: IResolvable) {
    cdkBuilder.acm(acm)
  }

  public fun acm(acm: CfnVirtualNode.TlsValidationContextAcmTrustProperty) {
    cdkBuilder.acm(acm)
  }

  public fun `file`(`file`: IResolvable) {
    cdkBuilder.`file`(`file`)
  }

  public fun `file`(`file`: CfnVirtualNode.TlsValidationContextFileTrustProperty) {
    cdkBuilder.`file`(`file`)
  }

  public fun sds(sds: IResolvable) {
    cdkBuilder.sds(sds)
  }

  public fun sds(sds: CfnVirtualNode.TlsValidationContextSdsTrustProperty) {
    cdkBuilder.sds(sds)
  }

  public fun build(): CfnVirtualNode.TlsValidationContextTrustProperty = cdkBuilder.build()
}

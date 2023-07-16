@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeListenerTlsCertificatePropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ListenerTlsCertificateProperty.Builder =
      CfnVirtualNode.ListenerTlsCertificateProperty.builder()

  public fun acm(acm: IResolvable) {
    cdkBuilder.acm(acm)
  }

  public fun acm(acm: CfnVirtualNode.ListenerTlsAcmCertificateProperty) {
    cdkBuilder.acm(acm)
  }

  public fun `file`(`file`: IResolvable) {
    cdkBuilder.`file`(`file`)
  }

  public fun `file`(`file`: CfnVirtualNode.ListenerTlsFileCertificateProperty) {
    cdkBuilder.`file`(`file`)
  }

  public fun sds(sds: IResolvable) {
    cdkBuilder.sds(sds)
  }

  public fun sds(sds: CfnVirtualNode.ListenerTlsSdsCertificateProperty) {
    cdkBuilder.sds(sds)
  }

  public fun build(): CfnVirtualNode.ListenerTlsCertificateProperty = cdkBuilder.build()
}

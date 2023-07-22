@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeListenerTlsCertificatePropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ListenerTlsCertificateProperty.Builder =
      CfnVirtualNode.ListenerTlsCertificateProperty.builder()

  /**
   * @param acm A reference to an object that represents an AWS Certificate Manager certificate.
   */
  public fun acm(acm: IResolvable) {
    cdkBuilder.acm(acm)
  }

  /**
   * @param acm A reference to an object that represents an AWS Certificate Manager certificate.
   */
  public fun acm(acm: CfnVirtualNode.ListenerTlsAcmCertificateProperty) {
    cdkBuilder.acm(acm)
  }

  /**
   * @param file A reference to an object that represents a local file certificate.
   */
  public fun `file`(`file`: IResolvable) {
    cdkBuilder.`file`(`file`)
  }

  /**
   * @param file A reference to an object that represents a local file certificate.
   */
  public fun `file`(`file`: CfnVirtualNode.ListenerTlsFileCertificateProperty) {
    cdkBuilder.`file`(`file`)
  }

  /**
   * @param sds A reference to an object that represents a listener's Secret Discovery Service
   * certificate.
   */
  public fun sds(sds: IResolvable) {
    cdkBuilder.sds(sds)
  }

  /**
   * @param sds A reference to an object that represents a listener's Secret Discovery Service
   * certificate.
   */
  public fun sds(sds: CfnVirtualNode.ListenerTlsSdsCertificateProperty) {
    cdkBuilder.sds(sds)
  }

  public fun build(): CfnVirtualNode.ListenerTlsCertificateProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerTlsCertificatePropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty.Builder =
      CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty.builder()

  /**
   * @param acm A reference to an object that represents an AWS Certificate Manager certificate.
   */
  public fun acm(acm: IResolvable) {
    cdkBuilder.acm(acm)
  }

  /**
   * @param acm A reference to an object that represents an AWS Certificate Manager certificate.
   */
  public fun acm(acm: CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty) {
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
  public fun `file`(`file`: CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty) {
    cdkBuilder.`file`(`file`)
  }

  /**
   * @param sds A reference to an object that represents a virtual gateway's listener's Secret
   * Discovery Service certificate.
   */
  public fun sds(sds: IResolvable) {
    cdkBuilder.sds(sds)
  }

  /**
   * @param sds A reference to an object that represents a virtual gateway's listener's Secret
   * Discovery Service certificate.
   */
  public fun sds(sds: CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty) {
    cdkBuilder.sds(sds)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty =
      cdkBuilder.build()
}

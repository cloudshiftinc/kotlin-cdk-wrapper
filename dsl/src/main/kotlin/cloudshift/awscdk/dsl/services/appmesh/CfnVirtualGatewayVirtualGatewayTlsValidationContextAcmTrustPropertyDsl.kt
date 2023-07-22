@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents a Transport Layer Security (TLS) validation context trust for an AWS
 * Certificate Manager certificate.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayTlsValidationContextAcmTrustProperty
 * virtualGatewayTlsValidationContextAcmTrustProperty =
 * VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
 * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextacmtrust.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayTlsValidationContextAcmTrustPropertyDsl {
  private val cdkBuilder:
      CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty.Builder =
      CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty.builder()

  private val _certificateAuthorityArns: MutableList<String> = mutableListOf()

  /**
   * @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. 
   */
  public fun certificateAuthorityArns(vararg certificateAuthorityArns: String) {
    _certificateAuthorityArns.addAll(listOf(*certificateAuthorityArns))
  }

  /**
   * @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. 
   */
  public fun certificateAuthorityArns(certificateAuthorityArns: Collection<String>) {
    _certificateAuthorityArns.addAll(certificateAuthorityArns)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty {
    if(_certificateAuthorityArns.isNotEmpty())
        cdkBuilder.certificateAuthorityArns(_certificateAuthorityArns)
    return cdkBuilder.build()
  }
}

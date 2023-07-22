@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

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

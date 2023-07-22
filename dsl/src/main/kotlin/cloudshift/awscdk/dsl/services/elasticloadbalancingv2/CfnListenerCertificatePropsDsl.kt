@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps

@CdkDslMarker
public class CfnListenerCertificatePropsDsl {
  private val cdkBuilder: CfnListenerCertificateProps.Builder =
      CfnListenerCertificateProps.builder()

  private val _certificates: MutableList<Any> = mutableListOf()

  /**
   * @param certificates The certificate. 
   * You can specify one certificate per resource.
   */
  public fun certificates(vararg certificates: Any) {
    _certificates.addAll(listOf(*certificates))
  }

  /**
   * @param certificates The certificate. 
   * You can specify one certificate per resource.
   */
  public fun certificates(certificates: Collection<Any>) {
    _certificates.addAll(certificates)
  }

  /**
   * @param certificates The certificate. 
   * You can specify one certificate per resource.
   */
  public fun certificates(certificates: IResolvable) {
    cdkBuilder.certificates(certificates)
  }

  /**
   * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
   */
  public fun listenerArn(listenerArn: String) {
    cdkBuilder.listenerArn(listenerArn)
  }

  public fun build(): CfnListenerCertificateProps {
    if(_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
    return cdkBuilder.build()
  }
}

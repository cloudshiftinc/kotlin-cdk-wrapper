@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate
import software.constructs.Construct

@CdkDslMarker
public class CfnListenerCertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnListenerCertificate.Builder =
      CfnListenerCertificate.Builder.create(scope, id)

  private val _certificates: MutableList<Any> = mutableListOf()

  /**
   * The certificate.
   *
   * You can specify one certificate per resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
   * @param certificates The certificate. 
   */
  public fun certificates(vararg certificates: Any) {
    _certificates.addAll(listOf(*certificates))
  }

  /**
   * The certificate.
   *
   * You can specify one certificate per resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
   * @param certificates The certificate. 
   */
  public fun certificates(certificates: Collection<Any>) {
    _certificates.addAll(certificates)
  }

  /**
   * The certificate.
   *
   * You can specify one certificate per resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
   * @param certificates The certificate. 
   */
  public fun certificates(certificates: IResolvable) {
    cdkBuilder.certificates(certificates)
  }

  /**
   * The Amazon Resource Name (ARN) of the listener.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn)
   * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
   */
  public fun listenerArn(listenerArn: String) {
    cdkBuilder.listenerArn(listenerArn)
  }

  public fun build(): CfnListenerCertificate {
    if(_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnListenerCertificate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * CfnListenerCertificateProps cfnListenerCertificateProps = CfnListenerCertificateProps.builder()
 * .certificates(List.of(CertificateProperty.builder()
 * .certificateArn("certificateArn")
 * .build()))
 * .listenerArn("listenerArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
 */
public interface CfnListenerCertificateProps {
  /**
   * The certificate.
   *
   * You can specify one certificate per resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
   */
  public fun certificates(): Any

  /**
   * The Amazon Resource Name (ARN) of the listener.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn)
   */
  public fun listenerArn(): String

  /**
   * A builder for [CfnListenerCertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificates The certificate. 
     * You can specify one certificate per resource.
     */
    public fun certificates(certificates: IResolvable)

    /**
     * @param certificates The certificate. 
     * You can specify one certificate per resource.
     */
    public fun certificates(certificates: List<Any>)

    /**
     * @param certificates The certificate. 
     * You can specify one certificate per resource.
     */
    public fun certificates(vararg certificates: Any)

    /**
     * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
     */
    public fun listenerArn(listenerArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps.builder()

    /**
     * @param certificates The certificate. 
     * You can specify one certificate per resource.
     */
    override fun certificates(certificates: IResolvable) {
      cdkBuilder.certificates(certificates.let(IResolvable::unwrap))
    }

    /**
     * @param certificates The certificate. 
     * You can specify one certificate per resource.
     */
    override fun certificates(certificates: List<Any>) {
      cdkBuilder.certificates(certificates)
    }

    /**
     * @param certificates The certificate. 
     * You can specify one certificate per resource.
     */
    override fun certificates(vararg certificates: Any): Unit = certificates(certificates.toList())

    /**
     * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
     */
    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps,
  ) : CdkObject(cdkObject), CfnListenerCertificateProps {
    /**
     * The certificate.
     *
     * You can specify one certificate per resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
     */
    override fun certificates(): Any = unwrap(this).getCertificates()

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn)
     */
    override fun listenerArn(): String = unwrap(this).getListenerArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListenerCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps):
        CfnListenerCertificateProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnListenerCertificateProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListenerCertificateProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps
  }
}

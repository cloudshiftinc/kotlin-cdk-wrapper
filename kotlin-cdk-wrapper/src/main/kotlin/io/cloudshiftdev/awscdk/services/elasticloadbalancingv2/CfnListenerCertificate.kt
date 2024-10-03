@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an SSL server certificate to add to the certificate list for an HTTPS or TLS listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * CfnListenerCertificate cfnListenerCertificate = CfnListenerCertificate.Builder.create(this,
 * "MyCfnListenerCertificate")
 * .certificates(List.of(CertificateProperty.builder()
 * .certificateArn("certificateArn")
 * .build()))
 * .listenerArn("listenerArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html)
 */
public open class CfnListenerCertificate(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnListenerCertificateProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnListenerCertificateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnListenerCertificateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnListenerCertificateProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The certificate.
   */
  public open fun certificates(): Any = unwrap(this).getCertificates()

  /**
   * The certificate.
   */
  public open fun certificates(`value`: IResolvable) {
    unwrap(this).setCertificates(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The certificate.
   */
  public open fun certificates(`value`: List<Any>) {
    unwrap(this).setCertificates(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The certificate.
   */
  public open fun certificates(vararg `value`: Any): Unit = certificates(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the listener.
   */
  public open fun listenerArn(): String = unwrap(this).getListenerArn()

  /**
   * The Amazon Resource Name (ARN) of the listener.
   */
  public open fun listenerArn(`value`: String) {
    unwrap(this).setListenerArn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The certificate.
     *
     * You can specify one certificate per resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
     * @param certificates The certificate. 
     */
    public fun certificates(certificates: IResolvable)

    /**
     * The certificate.
     *
     * You can specify one certificate per resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
     * @param certificates The certificate. 
     */
    public fun certificates(certificates: List<Any>)

    /**
     * The certificate.
     *
     * You can specify one certificate per resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
     * @param certificates The certificate. 
     */
    public fun certificates(vararg certificates: Any)

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn)
     * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
     */
    public fun listenerArn(listenerArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.Builder.create(scope,
        id)

    /**
     * The certificate.
     *
     * You can specify one certificate per resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
     * @param certificates The certificate. 
     */
    override fun certificates(certificates: IResolvable) {
      cdkBuilder.certificates(certificates.let(IResolvable.Companion::unwrap))
    }

    /**
     * The certificate.
     *
     * You can specify one certificate per resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
     * @param certificates The certificate. 
     */
    override fun certificates(certificates: List<Any>) {
      cdkBuilder.certificates(certificates.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The certificate.
     *
     * You can specify one certificate per resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates)
     * @param certificates The certificate. 
     */
    override fun certificates(vararg certificates: Any): Unit = certificates(certificates.toList())

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn)
     * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
     */
    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnListenerCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnListenerCertificate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate):
        CfnListenerCertificate = CfnListenerCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnListenerCertificate):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate
  }

  /**
   * Specifies an SSL server certificate for the certificate list of a secure listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
   * CertificateProperty certificateProperty = CertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenercertificate-certificate.html)
   */
  public interface CertificateProperty {
    /**
     * The Amazon Resource Name (ARN) of the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenercertificate-certificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificate-certificatearn)
     */
    public fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * A builder for [CertificateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateArn The Amazon Resource Name (ARN) of the certificate.
       */
      public fun certificateArn(certificateArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty.builder()

      /**
       * @param certificateArn The Amazon Resource Name (ARN) of the certificate.
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty,
    ) : CdkObject(cdkObject),
        CertificateProperty {
      /**
       * The Amazon Resource Name (ARN) of the certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenercertificate-certificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificate-certificatearn)
       */
      override fun certificateArn(): String? = unwrap(this).getCertificateArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty):
          CertificateProperty = CdkObjectWrappers.wrap(cdkObject) as? CertificateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty
    }
  }
}

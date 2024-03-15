@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Lightsail::LoadBalancerTlsCertificate` resource specifies a TLS certificate that can be
 * used with a Lightsail load balancer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnLoadBalancerTlsCertificate cfnLoadBalancerTlsCertificate =
 * CfnLoadBalancerTlsCertificate.Builder.create(this, "MyCfnLoadBalancerTlsCertificate")
 * .certificateDomainName("certificateDomainName")
 * .certificateName("certificateName")
 * .loadBalancerName("loadBalancerName")
 * // the properties below are optional
 * .certificateAlternativeNames(List.of("certificateAlternativeNames"))
 * .httpsRedirectionEnabled(false)
 * .isAttached(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html)
 */
public open class CfnLoadBalancerTlsCertificate internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
   */
  public open fun attrLoadBalancerTlsCertificateArn(): String =
      unwrap(this).getAttrLoadBalancerTlsCertificateArn()

  /**
   * The validation status of the SSL/TLS certificate.
   *
   * Valid Values: `PENDING_VALIDATION` | `ISSUED` | `INACTIVE` | `EXPIRED` | `VALIDATION_TIMED_OUT`
   * | `REVOKED` | `FAILED` | `UNKNOWN`
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * An array of alternative domain names and subdomain names for your SSL/TLS certificate.
   */
  public open fun certificateAlternativeNames(): List<String> =
      unwrap(this).getCertificateAlternativeNames() ?: emptyList()

  /**
   * An array of alternative domain names and subdomain names for your SSL/TLS certificate.
   */
  public open fun certificateAlternativeNames(`value`: List<String>) {
    unwrap(this).setCertificateAlternativeNames(`value`)
  }

  /**
   * An array of alternative domain names and subdomain names for your SSL/TLS certificate.
   */
  public open fun certificateAlternativeNames(vararg `value`: String): Unit =
      certificateAlternativeNames(`value`.toList())

  /**
   * The domain name for the SSL/TLS certificate.
   */
  public open fun certificateDomainName(): String = unwrap(this).getCertificateDomainName()

  /**
   * The domain name for the SSL/TLS certificate.
   */
  public open fun certificateDomainName(`value`: String) {
    unwrap(this).setCertificateDomainName(`value`)
  }

  /**
   * The name of the SSL/TLS certificate.
   */
  public open fun certificateName(): String = unwrap(this).getCertificateName()

  /**
   * The name of the SSL/TLS certificate.
   */
  public open fun certificateName(`value`: String) {
    unwrap(this).setCertificateName(`value`)
  }

  /**
   * A Boolean value indicating whether HTTPS redirection is enabled for the load balancer that the
   * TLS certificate is attached to.
   */
  public open fun httpsRedirectionEnabled(): Any? = unwrap(this).getHttpsRedirectionEnabled()

  /**
   * A Boolean value indicating whether HTTPS redirection is enabled for the load balancer that the
   * TLS certificate is attached to.
   */
  public open fun httpsRedirectionEnabled(`value`: Boolean) {
    unwrap(this).setHttpsRedirectionEnabled(`value`)
  }

  /**
   * A Boolean value indicating whether HTTPS redirection is enabled for the load balancer that the
   * TLS certificate is attached to.
   */
  public open fun httpsRedirectionEnabled(`value`: IResolvable) {
    unwrap(this).setHttpsRedirectionEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A Boolean value indicating whether the SSL/TLS certificate is attached to a Lightsail load
   * balancer.
   */
  public open fun isAttached(): Any? = unwrap(this).getIsAttached()

  /**
   * A Boolean value indicating whether the SSL/TLS certificate is attached to a Lightsail load
   * balancer.
   */
  public open fun isAttached(`value`: Boolean) {
    unwrap(this).setIsAttached(`value`)
  }

  /**
   * A Boolean value indicating whether the SSL/TLS certificate is attached to a Lightsail load
   * balancer.
   */
  public open fun isAttached(`value`: IResolvable) {
    unwrap(this).setIsAttached(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the load balancer that the SSL/TLS certificate is attached to.
   */
  public open fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()

  /**
   * The name of the load balancer that the SSL/TLS certificate is attached to.
   */
  public open fun loadBalancerName(`value`: String) {
    unwrap(this).setLoadBalancerName(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An array of alternative domain names and subdomain names for your SSL/TLS certificate.
     *
     * In addition to the primary domain name, you can have up to nine alternative domain names.
     * Wildcards (such as `*.example.com` ) are not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatealternativenames)
     * @param certificateAlternativeNames An array of alternative domain names and subdomain names
     * for your SSL/TLS certificate. 
     */
    public fun certificateAlternativeNames(certificateAlternativeNames: List<String>)

    /**
     * An array of alternative domain names and subdomain names for your SSL/TLS certificate.
     *
     * In addition to the primary domain name, you can have up to nine alternative domain names.
     * Wildcards (such as `*.example.com` ) are not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatealternativenames)
     * @param certificateAlternativeNames An array of alternative domain names and subdomain names
     * for your SSL/TLS certificate. 
     */
    public fun certificateAlternativeNames(vararg certificateAlternativeNames: String)

    /**
     * The domain name for the SSL/TLS certificate.
     *
     * For example, `example.com` or `www.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatedomainname)
     * @param certificateDomainName The domain name for the SSL/TLS certificate. 
     */
    public fun certificateDomainName(certificateDomainName: String)

    /**
     * The name of the SSL/TLS certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatename)
     * @param certificateName The name of the SSL/TLS certificate. 
     */
    public fun certificateName(certificateName: String)

    /**
     * A Boolean value indicating whether HTTPS redirection is enabled for the load balancer that
     * the TLS certificate is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-httpsredirectionenabled)
     * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is
     * enabled for the load balancer that the TLS certificate is attached to. 
     */
    public fun httpsRedirectionEnabled(httpsRedirectionEnabled: Boolean)

    /**
     * A Boolean value indicating whether HTTPS redirection is enabled for the load balancer that
     * the TLS certificate is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-httpsredirectionenabled)
     * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is
     * enabled for the load balancer that the TLS certificate is attached to. 
     */
    public fun httpsRedirectionEnabled(httpsRedirectionEnabled: IResolvable)

    /**
     * A Boolean value indicating whether the SSL/TLS certificate is attached to a Lightsail load
     * balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-isattached)
     * @param isAttached A Boolean value indicating whether the SSL/TLS certificate is attached to a
     * Lightsail load balancer. 
     */
    public fun isAttached(isAttached: Boolean)

    /**
     * A Boolean value indicating whether the SSL/TLS certificate is attached to a Lightsail load
     * balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-isattached)
     * @param isAttached A Boolean value indicating whether the SSL/TLS certificate is attached to a
     * Lightsail load balancer. 
     */
    public fun isAttached(isAttached: IResolvable)

    /**
     * The name of the load balancer that the SSL/TLS certificate is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-loadbalancername)
     * @param loadBalancerName The name of the load balancer that the SSL/TLS certificate is
     * attached to. 
     */
    public fun loadBalancerName(loadBalancerName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate.Builder =
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate.Builder.create(scope,
        id)

    /**
     * An array of alternative domain names and subdomain names for your SSL/TLS certificate.
     *
     * In addition to the primary domain name, you can have up to nine alternative domain names.
     * Wildcards (such as `*.example.com` ) are not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatealternativenames)
     * @param certificateAlternativeNames An array of alternative domain names and subdomain names
     * for your SSL/TLS certificate. 
     */
    override fun certificateAlternativeNames(certificateAlternativeNames: List<String>) {
      cdkBuilder.certificateAlternativeNames(certificateAlternativeNames)
    }

    /**
     * An array of alternative domain names and subdomain names for your SSL/TLS certificate.
     *
     * In addition to the primary domain name, you can have up to nine alternative domain names.
     * Wildcards (such as `*.example.com` ) are not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatealternativenames)
     * @param certificateAlternativeNames An array of alternative domain names and subdomain names
     * for your SSL/TLS certificate. 
     */
    override fun certificateAlternativeNames(vararg certificateAlternativeNames: String): Unit =
        certificateAlternativeNames(certificateAlternativeNames.toList())

    /**
     * The domain name for the SSL/TLS certificate.
     *
     * For example, `example.com` or `www.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatedomainname)
     * @param certificateDomainName The domain name for the SSL/TLS certificate. 
     */
    override fun certificateDomainName(certificateDomainName: String) {
      cdkBuilder.certificateDomainName(certificateDomainName)
    }

    /**
     * The name of the SSL/TLS certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatename)
     * @param certificateName The name of the SSL/TLS certificate. 
     */
    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    /**
     * A Boolean value indicating whether HTTPS redirection is enabled for the load balancer that
     * the TLS certificate is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-httpsredirectionenabled)
     * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is
     * enabled for the load balancer that the TLS certificate is attached to. 
     */
    override fun httpsRedirectionEnabled(httpsRedirectionEnabled: Boolean) {
      cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled)
    }

    /**
     * A Boolean value indicating whether HTTPS redirection is enabled for the load balancer that
     * the TLS certificate is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-httpsredirectionenabled)
     * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is
     * enabled for the load balancer that the TLS certificate is attached to. 
     */
    override fun httpsRedirectionEnabled(httpsRedirectionEnabled: IResolvable) {
      cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled.let(IResolvable::unwrap))
    }

    /**
     * A Boolean value indicating whether the SSL/TLS certificate is attached to a Lightsail load
     * balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-isattached)
     * @param isAttached A Boolean value indicating whether the SSL/TLS certificate is attached to a
     * Lightsail load balancer. 
     */
    override fun isAttached(isAttached: Boolean) {
      cdkBuilder.isAttached(isAttached)
    }

    /**
     * A Boolean value indicating whether the SSL/TLS certificate is attached to a Lightsail load
     * balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-isattached)
     * @param isAttached A Boolean value indicating whether the SSL/TLS certificate is attached to a
     * Lightsail load balancer. 
     */
    override fun isAttached(isAttached: IResolvable) {
      cdkBuilder.isAttached(isAttached.let(IResolvable::unwrap))
    }

    /**
     * The name of the load balancer that the SSL/TLS certificate is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-loadbalancername)
     * @param loadBalancerName The name of the load balancer that the SSL/TLS certificate is
     * attached to. 
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoadBalancerTlsCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoadBalancerTlsCertificate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate):
        CfnLoadBalancerTlsCertificate = CfnLoadBalancerTlsCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancerTlsCertificate):
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate = wrapped.cdkObject
  }
}

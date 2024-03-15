@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnLoadBalancerTlsCertificate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnLoadBalancerTlsCertificateProps cfnLoadBalancerTlsCertificateProps =
 * CfnLoadBalancerTlsCertificateProps.builder()
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
public interface CfnLoadBalancerTlsCertificateProps {
  /**
   * An array of alternative domain names and subdomain names for your SSL/TLS certificate.
   *
   * In addition to the primary domain name, you can have up to nine alternative domain names.
   * Wildcards (such as `*.example.com` ) are not supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatealternativenames)
   */
  public fun certificateAlternativeNames(): List<String> =
      unwrap(this).getCertificateAlternativeNames() ?: emptyList()

  /**
   * The domain name for the SSL/TLS certificate.
   *
   * For example, `example.com` or `www.example.com` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatedomainname)
   */
  public fun certificateDomainName(): String

  /**
   * The name of the SSL/TLS certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatename)
   */
  public fun certificateName(): String

  /**
   * A Boolean value indicating whether HTTPS redirection is enabled for the load balancer that the
   * TLS certificate is attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-httpsredirectionenabled)
   */
  public fun httpsRedirectionEnabled(): Any? = unwrap(this).getHttpsRedirectionEnabled()

  /**
   * A Boolean value indicating whether the SSL/TLS certificate is attached to a Lightsail load
   * balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-isattached)
   */
  public fun isAttached(): Any? = unwrap(this).getIsAttached()

  /**
   * The name of the load balancer that the SSL/TLS certificate is attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-loadbalancername)
   */
  public fun loadBalancerName(): String

  /**
   * A builder for [CfnLoadBalancerTlsCertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateAlternativeNames An array of alternative domain names and subdomain names
     * for your SSL/TLS certificate.
     * In addition to the primary domain name, you can have up to nine alternative domain names.
     * Wildcards (such as `*.example.com` ) are not supported.
     */
    public fun certificateAlternativeNames(certificateAlternativeNames: List<String>)

    /**
     * @param certificateAlternativeNames An array of alternative domain names and subdomain names
     * for your SSL/TLS certificate.
     * In addition to the primary domain name, you can have up to nine alternative domain names.
     * Wildcards (such as `*.example.com` ) are not supported.
     */
    public fun certificateAlternativeNames(vararg certificateAlternativeNames: String)

    /**
     * @param certificateDomainName The domain name for the SSL/TLS certificate. 
     * For example, `example.com` or `www.example.com` .
     */
    public fun certificateDomainName(certificateDomainName: String)

    /**
     * @param certificateName The name of the SSL/TLS certificate. 
     */
    public fun certificateName(certificateName: String)

    /**
     * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is
     * enabled for the load balancer that the TLS certificate is attached to.
     */
    public fun httpsRedirectionEnabled(httpsRedirectionEnabled: Boolean)

    /**
     * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is
     * enabled for the load balancer that the TLS certificate is attached to.
     */
    public fun httpsRedirectionEnabled(httpsRedirectionEnabled: IResolvable)

    /**
     * @param isAttached A Boolean value indicating whether the SSL/TLS certificate is attached to a
     * Lightsail load balancer.
     */
    public fun isAttached(isAttached: Boolean)

    /**
     * @param isAttached A Boolean value indicating whether the SSL/TLS certificate is attached to a
     * Lightsail load balancer.
     */
    public fun isAttached(isAttached: IResolvable)

    /**
     * @param loadBalancerName The name of the load balancer that the SSL/TLS certificate is
     * attached to. 
     */
    public fun loadBalancerName(loadBalancerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps.builder()

    /**
     * @param certificateAlternativeNames An array of alternative domain names and subdomain names
     * for your SSL/TLS certificate.
     * In addition to the primary domain name, you can have up to nine alternative domain names.
     * Wildcards (such as `*.example.com` ) are not supported.
     */
    override fun certificateAlternativeNames(certificateAlternativeNames: List<String>) {
      cdkBuilder.certificateAlternativeNames(certificateAlternativeNames)
    }

    /**
     * @param certificateAlternativeNames An array of alternative domain names and subdomain names
     * for your SSL/TLS certificate.
     * In addition to the primary domain name, you can have up to nine alternative domain names.
     * Wildcards (such as `*.example.com` ) are not supported.
     */
    override fun certificateAlternativeNames(vararg certificateAlternativeNames: String): Unit =
        certificateAlternativeNames(certificateAlternativeNames.toList())

    /**
     * @param certificateDomainName The domain name for the SSL/TLS certificate. 
     * For example, `example.com` or `www.example.com` .
     */
    override fun certificateDomainName(certificateDomainName: String) {
      cdkBuilder.certificateDomainName(certificateDomainName)
    }

    /**
     * @param certificateName The name of the SSL/TLS certificate. 
     */
    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    /**
     * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is
     * enabled for the load balancer that the TLS certificate is attached to.
     */
    override fun httpsRedirectionEnabled(httpsRedirectionEnabled: Boolean) {
      cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled)
    }

    /**
     * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is
     * enabled for the load balancer that the TLS certificate is attached to.
     */
    override fun httpsRedirectionEnabled(httpsRedirectionEnabled: IResolvable) {
      cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param isAttached A Boolean value indicating whether the SSL/TLS certificate is attached to a
     * Lightsail load balancer.
     */
    override fun isAttached(isAttached: Boolean) {
      cdkBuilder.isAttached(isAttached)
    }

    /**
     * @param isAttached A Boolean value indicating whether the SSL/TLS certificate is attached to a
     * Lightsail load balancer.
     */
    override fun isAttached(isAttached: IResolvable) {
      cdkBuilder.isAttached(isAttached.let(IResolvable::unwrap))
    }

    /**
     * @param loadBalancerName The name of the load balancer that the SSL/TLS certificate is
     * attached to. 
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps,
  ) : CdkObject(cdkObject), CfnLoadBalancerTlsCertificateProps {
    /**
     * An array of alternative domain names and subdomain names for your SSL/TLS certificate.
     *
     * In addition to the primary domain name, you can have up to nine alternative domain names.
     * Wildcards (such as `*.example.com` ) are not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatealternativenames)
     */
    override fun certificateAlternativeNames(): List<String> =
        unwrap(this).getCertificateAlternativeNames() ?: emptyList()

    /**
     * The domain name for the SSL/TLS certificate.
     *
     * For example, `example.com` or `www.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatedomainname)
     */
    override fun certificateDomainName(): String = unwrap(this).getCertificateDomainName()

    /**
     * The name of the SSL/TLS certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatename)
     */
    override fun certificateName(): String = unwrap(this).getCertificateName()

    /**
     * A Boolean value indicating whether HTTPS redirection is enabled for the load balancer that
     * the TLS certificate is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-httpsredirectionenabled)
     */
    override fun httpsRedirectionEnabled(): Any? = unwrap(this).getHttpsRedirectionEnabled()

    /**
     * A Boolean value indicating whether the SSL/TLS certificate is attached to a Lightsail load
     * balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-isattached)
     */
    override fun isAttached(): Any? = unwrap(this).getIsAttached()

    /**
     * The name of the load balancer that the SSL/TLS certificate is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-loadbalancername)
     */
    override fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoadBalancerTlsCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps):
        CfnLoadBalancerTlsCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancerTlsCertificateProps):
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps
  }
}

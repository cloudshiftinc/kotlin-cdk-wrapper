@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate
import software.constructs.Construct

@CdkDslMarker
public class CfnLoadBalancerTlsCertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLoadBalancerTlsCertificate.Builder =
      CfnLoadBalancerTlsCertificate.Builder.create(scope, id)

  private val _certificateAlternativeNames: MutableList<String> = mutableListOf()

  /**
   * An array of alternative domain names and subdomain names for your SSL/TLS certificate.
   *
   * In addition to the primary domain name, you can have up to nine alternative domain names.
   * Wildcards (such as `*.example.com` ) are not supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatealternativenames)
   * @param certificateAlternativeNames An array of alternative domain names and subdomain names for
   * your SSL/TLS certificate. 
   */
  public fun certificateAlternativeNames(vararg certificateAlternativeNames: String) {
    _certificateAlternativeNames.addAll(listOf(*certificateAlternativeNames))
  }

  /**
   * An array of alternative domain names and subdomain names for your SSL/TLS certificate.
   *
   * In addition to the primary domain name, you can have up to nine alternative domain names.
   * Wildcards (such as `*.example.com` ) are not supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatealternativenames)
   * @param certificateAlternativeNames An array of alternative domain names and subdomain names for
   * your SSL/TLS certificate. 
   */
  public fun certificateAlternativeNames(certificateAlternativeNames: Collection<String>) {
    _certificateAlternativeNames.addAll(certificateAlternativeNames)
  }

  /**
   * The domain name for the SSL/TLS certificate.
   *
   * For example, `example.com` or `www.example.com` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatedomainname)
   * @param certificateDomainName The domain name for the SSL/TLS certificate. 
   */
  public fun certificateDomainName(certificateDomainName: String) {
    cdkBuilder.certificateDomainName(certificateDomainName)
  }

  /**
   * The name of the SSL/TLS certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-certificatename)
   * @param certificateName The name of the SSL/TLS certificate. 
   */
  public fun certificateName(certificateName: String) {
    cdkBuilder.certificateName(certificateName)
  }

  /**
   * A Boolean value indicating whether HTTPS redirection is enabled for the load balancer that the
   * TLS certificate is attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-httpsredirectionenabled)
   * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is enabled
   * for the load balancer that the TLS certificate is attached to. 
   */
  public fun httpsRedirectionEnabled(httpsRedirectionEnabled: Boolean) {
    cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled)
  }

  /**
   * A Boolean value indicating whether HTTPS redirection is enabled for the load balancer that the
   * TLS certificate is attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-httpsredirectionenabled)
   * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is enabled
   * for the load balancer that the TLS certificate is attached to. 
   */
  public fun httpsRedirectionEnabled(httpsRedirectionEnabled: IResolvable) {
    cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled)
  }

  /**
   * A Boolean value indicating whether the SSL/TLS certificate is attached to a Lightsail load
   * balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-isattached)
   * @param isAttached A Boolean value indicating whether the SSL/TLS certificate is attached to a
   * Lightsail load balancer. 
   */
  public fun isAttached(isAttached: Boolean) {
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
  public fun isAttached(isAttached: IResolvable) {
    cdkBuilder.isAttached(isAttached)
  }

  /**
   * The name of the load balancer that the SSL/TLS certificate is attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancertlscertificate.html#cfn-lightsail-loadbalancertlscertificate-loadbalancername)
   * @param loadBalancerName The name of the load balancer that the SSL/TLS certificate is attached
   * to. 
   */
  public fun loadBalancerName(loadBalancerName: String) {
    cdkBuilder.loadBalancerName(loadBalancerName)
  }

  public fun build(): CfnLoadBalancerTlsCertificate {
    if(_certificateAlternativeNames.isNotEmpty())
        cdkBuilder.certificateAlternativeNames(_certificateAlternativeNames)
    return cdkBuilder.build()
  }
}

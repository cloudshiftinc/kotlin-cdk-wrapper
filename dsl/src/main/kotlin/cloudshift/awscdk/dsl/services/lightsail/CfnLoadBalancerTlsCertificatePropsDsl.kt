@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps

/**
 * Properties for defining a `CfnLoadBalancerTlsCertificate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
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
@CdkDslMarker
public class CfnLoadBalancerTlsCertificatePropsDsl {
    private val cdkBuilder: CfnLoadBalancerTlsCertificateProps.Builder =
        CfnLoadBalancerTlsCertificateProps.builder()

    private val _certificateAlternativeNames: MutableList<String> = mutableListOf()

    /**
     * @param certificateAlternativeNames An array of alternative domain names and subdomain names
     *   for your SSL/TLS certificate. In addition to the primary domain name, you can have up to
     *   nine alternative domain names. Wildcards (such as `*.example.com` ) are not supported.
     */
    public fun certificateAlternativeNames(vararg certificateAlternativeNames: String) {
        _certificateAlternativeNames.addAll(listOf(*certificateAlternativeNames))
    }

    /**
     * @param certificateAlternativeNames An array of alternative domain names and subdomain names
     *   for your SSL/TLS certificate. In addition to the primary domain name, you can have up to
     *   nine alternative domain names. Wildcards (such as `*.example.com` ) are not supported.
     */
    public fun certificateAlternativeNames(certificateAlternativeNames: Collection<String>) {
        _certificateAlternativeNames.addAll(certificateAlternativeNames)
    }

    /**
     * @param certificateDomainName The domain name for the SSL/TLS certificate. For example,
     *   `example.com` or `www.example.com` .
     */
    public fun certificateDomainName(certificateDomainName: String) {
        cdkBuilder.certificateDomainName(certificateDomainName)
    }

    /** @param certificateName The name of the SSL/TLS certificate. */
    public fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
    }

    /**
     * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is
     *   enabled for the load balancer that the TLS certificate is attached to.
     */
    public fun httpsRedirectionEnabled(httpsRedirectionEnabled: Boolean) {
        cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled)
    }

    /**
     * @param httpsRedirectionEnabled A Boolean value indicating whether HTTPS redirection is
     *   enabled for the load balancer that the TLS certificate is attached to.
     */
    public fun httpsRedirectionEnabled(httpsRedirectionEnabled: IResolvable) {
        cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled)
    }

    /**
     * @param isAttached A Boolean value indicating whether the SSL/TLS certificate is attached to a
     *   Lightsail load balancer.
     */
    public fun isAttached(isAttached: Boolean) {
        cdkBuilder.isAttached(isAttached)
    }

    /**
     * @param isAttached A Boolean value indicating whether the SSL/TLS certificate is attached to a
     *   Lightsail load balancer.
     */
    public fun isAttached(isAttached: IResolvable) {
        cdkBuilder.isAttached(isAttached)
    }

    /**
     * @param loadBalancerName The name of the load balancer that the SSL/TLS certificate is
     *   attached to.
     */
    public fun loadBalancerName(loadBalancerName: String) {
        cdkBuilder.loadBalancerName(loadBalancerName)
    }

    public fun build(): CfnLoadBalancerTlsCertificateProps {
        if (_certificateAlternativeNames.isNotEmpty())
            cdkBuilder.certificateAlternativeNames(_certificateAlternativeNames)
        return cdkBuilder.build()
    }
}

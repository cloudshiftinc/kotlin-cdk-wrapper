@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for a Distribution.
 *
 * Example:
 *
 * ```
 * // Adding an existing Lambda&#64;Edge function created in a different stack
 * // to a CloudFront distribution.
 * Bucket s3Bucket;
 * IVersion functionVersion = Version.fromVersionArn(this, "Version",
 * "arn:aws:lambda:us-east-1:123456789012:function:functionName:1");
 * Distribution.Builder.create(this, "distro")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new S3Origin(s3Bucket))
 * .edgeLambdas(List.of(EdgeLambda.builder()
 * .functionVersion(functionVersion)
 * .eventType(LambdaEdgeEventType.VIEWER_REQUEST)
 * .build()))
 * .build())
 * .build();
 * ```
 */
public interface DistributionProps {
  /**
   * Additional behaviors for the distribution, mapped by the pathPattern that specifies which
   * requests to apply the behavior to.
   *
   * Default: - no additional behaviors are added.
   */
  public fun additionalBehaviors(): Map<String, BehaviorOptions> =
      unwrap(this).getAdditionalBehaviors()?.mapValues{BehaviorOptions.wrap(it.value)} ?: emptyMap()

  /**
   * A certificate to associate with the distribution.
   *
   * The certificate must be located in N. Virginia (us-east-1).
   *
   * Default: - the CloudFront wildcard certificate (*.cloudfront.net) will be used.
   */
  public fun certificate(): ICertificate? = unwrap(this).getCertificate()?.let(ICertificate::wrap)

  /**
   * Any comments you want to include about the distribution.
   *
   * Default: - no comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * The default behavior for the distribution.
   */
  public fun defaultBehavior(): BehaviorOptions

  /**
   * The object that you want CloudFront to request from your origin (for example, index.html) when
   * a viewer requests the root URL for your distribution. If no default object is set, the request
   * goes to the origin's root (e.g., example.com/).
   *
   * Default: - no default root object
   */
  public fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

  /**
   * Alternative domain names for this distribution.
   *
   * If you want to use your own domain name, such as www.example.com, instead of the cloudfront.net
   * domain name,
   * you can add an alternate domain name to your distribution. If you attach a certificate to the
   * distribution,
   * you should add (at least one of) the domain names of the certificate to this list.
   *
   * When you want to move a domain name between distributions, you can associate a certificate
   * without specifying any domain names.
   * For more information, see the *Moving an alternate domain name to a different distribution*
   * section in the README.
   *
   * Default: - The distribution will only support the default generated name (e.g.,
   * d111111abcdef8.cloudfront.net)
   */
  public fun domainNames(): List<String> = unwrap(this).getDomainNames() ?: emptyList()

  /**
   * Whether CloudFront will respond to IPv6 DNS requests with an IPv6 address.
   *
   * If you specify false, CloudFront responds to IPv6 DNS requests with the DNS response code
   * NOERROR and with no IP addresses.
   * This allows viewers to submit a second request, for an IPv4 address for your distribution.
   *
   * Default: true
   */
  public fun enableIpv6(): Boolean? = unwrap(this).getEnableIpv6()

  /**
   * Enable access logging for the distribution.
   *
   * Default: - false, unless `logBucket` is specified.
   */
  public fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

  /**
   * Enable or disable the distribution.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * How CloudFront should handle requests that are not successful (e.g., PageNotFound).
   *
   * Default: - No custom error responses.
   */
  public fun errorResponses(): List<ErrorResponse> =
      unwrap(this).getErrorResponses()?.map(ErrorResponse::wrap) ?: emptyList()

  /**
   * Controls the countries in which your content is distributed.
   *
   * Default: - No geographic restrictions
   */
  public fun geoRestriction(): GeoRestriction? =
      unwrap(this).getGeoRestriction()?.let(GeoRestriction::wrap)

  /**
   * Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront.
   *
   * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or later, and must
   * support server name identification (SNI).
   *
   * Default: HttpVersion.HTTP2
   */
  public fun httpVersion(): HttpVersion? = unwrap(this).getHttpVersion()?.let(HttpVersion::wrap)

  /**
   * The Amazon S3 bucket to store the access logs in.
   *
   * Make sure to set `objectOwnership` to `s3.ObjectOwnership.OBJECT_WRITER` in your custom bucket.
   *
   * Default: - A bucket is created if `enableLogging` is true
   */
  public fun logBucket(): IBucket? = unwrap(this).getLogBucket()?.let(IBucket::wrap)

  /**
   * An optional string that you want CloudFront to prefix to the access log filenames for this
   * distribution.
   *
   * Default: - no prefix
   */
  public fun logFilePrefix(): String? = unwrap(this).getLogFilePrefix()

  /**
   * Specifies whether you want CloudFront to include cookies in access logs.
   *
   * Default: false
   */
  public fun logIncludesCookies(): Boolean? = unwrap(this).getLogIncludesCookies()

  /**
   * The minimum version of the SSL protocol that you want CloudFront to use for HTTPS connections.
   *
   * CloudFront serves your objects only to browsers or devices that support at
   * least the SSL version that you specify.
   *
   * Default: - SecurityPolicyProtocol.TLS_V1_2_2021 if the
   * '@aws-cdk/aws-cloudfront:defaultSecurityPolicyTLSv1.2_2021' feature flag is set; otherwise,
   * SecurityPolicyProtocol.TLS_V1_2_2019.
   */
  public fun minimumProtocolVersion(): SecurityPolicyProtocol? =
      unwrap(this).getMinimumProtocolVersion()?.let(SecurityPolicyProtocol::wrap)

  /**
   * The price class that corresponds with the maximum price that you want to pay for CloudFront
   * service.
   *
   * If you specify PriceClass_All, CloudFront responds to requests for your objects from all
   * CloudFront edge locations.
   * If you specify a price class other than PriceClass_All, CloudFront serves your objects from the
   * CloudFront edge location
   * that has the lowest latency among the edge locations in your price class.
   *
   * Default: PriceClass.PRICE_CLASS_ALL
   */
  public fun priceClass(): PriceClass? = unwrap(this).getPriceClass()?.let(PriceClass::wrap)

  /**
   * Whether to enable additional CloudWatch metrics.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/viewing-cloudfront-metrics.html)
   */
  public fun publishAdditionalMetrics(): Boolean? = unwrap(this).getPublishAdditionalMetrics()

  /**
   * The SSL method CloudFront will use for your distribution.
   *
   * Server Name Indication (SNI) - is an extension to the TLS computer networking protocol by which
   * a client indicates
   * which hostname it is attempting to connect to at the start of the handshaking process. This
   * allows a server to present
   * multiple certificates on the same IP address and TCP port number and hence allows multiple
   * secure (HTTPS) websites
   * (or any other service over TLS) to be served by the same IP address without requiring all those
   * sites to use the same certificate.
   *
   * CloudFront can use SNI to host multiple distributions on the same IP - which a large majority
   * of clients will support.
   *
   * If your clients cannot support SNI however - CloudFront can use dedicated IPs for your
   * distribution - but there is a prorated monthly charge for
   * using this feature. By default, we use SNI - but you can optionally enable dedicated IPs (VIP).
   *
   * See the CloudFront SSL for more details about pricing :
   * https://aws.amazon.com/cloudfront/custom-ssl-domains/
   *
   * Default: SSLMethod.SNI
   */
  public fun sslSupportMethod(): SSLMethod? =
      unwrap(this).getSslSupportMethod()?.let(SSLMethod::wrap)

  /**
   * Unique identifier that specifies the AWS WAF web ACL to associate with this CloudFront
   * distribution.
   *
   * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for example
   * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
   * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
   * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
   *
   * Default: - No AWS Web Application Firewall web access control list (web ACL).
   *
   * [Documentation](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html#API_CreateDistribution_RequestParameters.)
   */
  public fun webAclId(): String? = unwrap(this).getWebAclId()

  /**
   * A builder for [DistributionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalBehaviors Additional behaviors for the distribution, mapped by the
     * pathPattern that specifies which requests to apply the behavior to.
     */
    public fun additionalBehaviors(additionalBehaviors: Map<String, BehaviorOptions>)

    /**
     * @param certificate A certificate to associate with the distribution.
     * The certificate must be located in N. Virginia (us-east-1).
     */
    public fun certificate(certificate: ICertificate)

    /**
     * @param comment Any comments you want to include about the distribution.
     */
    public fun comment(comment: String)

    /**
     * @param defaultBehavior The default behavior for the distribution. 
     */
    public fun defaultBehavior(defaultBehavior: BehaviorOptions)

    /**
     * @param defaultBehavior The default behavior for the distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80a91bac75a0f8e6677c3ecfd1080e30cdedc9eb185dbde5f7c2ce912e9e666c")
    public fun defaultBehavior(defaultBehavior: BehaviorOptions.Builder.() -> Unit)

    /**
     * @param defaultRootObject The object that you want CloudFront to request from your origin (for
     * example, index.html) when a viewer requests the root URL for your distribution. If no default
     * object is set, the request goes to the origin's root (e.g., example.com/).
     */
    public fun defaultRootObject(defaultRootObject: String)

    /**
     * @param domainNames Alternative domain names for this distribution.
     * If you want to use your own domain name, such as www.example.com, instead of the
     * cloudfront.net domain name,
     * you can add an alternate domain name to your distribution. If you attach a certificate to the
     * distribution,
     * you should add (at least one of) the domain names of the certificate to this list.
     *
     * When you want to move a domain name between distributions, you can associate a certificate
     * without specifying any domain names.
     * For more information, see the *Moving an alternate domain name to a different distribution*
     * section in the README.
     */
    public fun domainNames(domainNames: List<String>)

    /**
     * @param domainNames Alternative domain names for this distribution.
     * If you want to use your own domain name, such as www.example.com, instead of the
     * cloudfront.net domain name,
     * you can add an alternate domain name to your distribution. If you attach a certificate to the
     * distribution,
     * you should add (at least one of) the domain names of the certificate to this list.
     *
     * When you want to move a domain name between distributions, you can associate a certificate
     * without specifying any domain names.
     * For more information, see the *Moving an alternate domain name to a different distribution*
     * section in the README.
     */
    public fun domainNames(vararg domainNames: String)

    /**
     * @param enableIpv6 Whether CloudFront will respond to IPv6 DNS requests with an IPv6 address.
     * If you specify false, CloudFront responds to IPv6 DNS requests with the DNS response code
     * NOERROR and with no IP addresses.
     * This allows viewers to submit a second request, for an IPv4 address for your distribution.
     */
    public fun enableIpv6(enableIpv6: Boolean)

    /**
     * @param enableLogging Enable access logging for the distribution.
     */
    public fun enableLogging(enableLogging: Boolean)

    /**
     * @param enabled Enable or disable the distribution.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param errorResponses How CloudFront should handle requests that are not successful (e.g.,
     * PageNotFound).
     */
    public fun errorResponses(errorResponses: List<ErrorResponse>)

    /**
     * @param errorResponses How CloudFront should handle requests that are not successful (e.g.,
     * PageNotFound).
     */
    public fun errorResponses(vararg errorResponses: ErrorResponse)

    /**
     * @param geoRestriction Controls the countries in which your content is distributed.
     */
    public fun geoRestriction(geoRestriction: GeoRestriction)

    /**
     * @param httpVersion Specify the maximum HTTP version that you want viewers to use to
     * communicate with CloudFront.
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or later, and must
     * support server name identification (SNI).
     */
    public fun httpVersion(httpVersion: HttpVersion)

    /**
     * @param logBucket The Amazon S3 bucket to store the access logs in.
     * Make sure to set `objectOwnership` to `s3.ObjectOwnership.OBJECT_WRITER` in your custom
     * bucket.
     */
    public fun logBucket(logBucket: IBucket)

    /**
     * @param logFilePrefix An optional string that you want CloudFront to prefix to the access log
     * filenames for this distribution.
     */
    public fun logFilePrefix(logFilePrefix: String)

    /**
     * @param logIncludesCookies Specifies whether you want CloudFront to include cookies in access
     * logs.
     */
    public fun logIncludesCookies(logIncludesCookies: Boolean)

    /**
     * @param minimumProtocolVersion The minimum version of the SSL protocol that you want
     * CloudFront to use for HTTPS connections.
     * CloudFront serves your objects only to browsers or devices that support at
     * least the SSL version that you specify.
     */
    public fun minimumProtocolVersion(minimumProtocolVersion: SecurityPolicyProtocol)

    /**
     * @param priceClass The price class that corresponds with the maximum price that you want to
     * pay for CloudFront service.
     * If you specify PriceClass_All, CloudFront responds to requests for your objects from all
     * CloudFront edge locations.
     * If you specify a price class other than PriceClass_All, CloudFront serves your objects from
     * the CloudFront edge location
     * that has the lowest latency among the edge locations in your price class.
     */
    public fun priceClass(priceClass: PriceClass)

    /**
     * @param publishAdditionalMetrics Whether to enable additional CloudWatch metrics.
     */
    public fun publishAdditionalMetrics(publishAdditionalMetrics: Boolean)

    /**
     * @param sslSupportMethod The SSL method CloudFront will use for your distribution.
     * Server Name Indication (SNI) - is an extension to the TLS computer networking protocol by
     * which a client indicates
     * which hostname it is attempting to connect to at the start of the handshaking process. This
     * allows a server to present
     * multiple certificates on the same IP address and TCP port number and hence allows multiple
     * secure (HTTPS) websites
     * (or any other service over TLS) to be served by the same IP address without requiring all
     * those sites to use the same certificate.
     *
     * CloudFront can use SNI to host multiple distributions on the same IP - which a large majority
     * of clients will support.
     *
     * If your clients cannot support SNI however - CloudFront can use dedicated IPs for your
     * distribution - but there is a prorated monthly charge for
     * using this feature. By default, we use SNI - but you can optionally enable dedicated IPs
     * (VIP).
     *
     * See the CloudFront SSL for more details about pricing :
     * https://aws.amazon.com/cloudfront/custom-ssl-domains/
     */
    public fun sslSupportMethod(sslSupportMethod: SSLMethod)

    /**
     * @param webAclId Unique identifier that specifies the AWS WAF web ACL to associate with this
     * CloudFront distribution.
     * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     */
    public fun webAclId(webAclId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.DistributionProps.Builder =
        software.amazon.awscdk.services.cloudfront.DistributionProps.builder()

    /**
     * @param additionalBehaviors Additional behaviors for the distribution, mapped by the
     * pathPattern that specifies which requests to apply the behavior to.
     */
    override fun additionalBehaviors(additionalBehaviors: Map<String, BehaviorOptions>) {
      cdkBuilder.additionalBehaviors(additionalBehaviors.mapValues{BehaviorOptions.unwrap(it.value)})
    }

    /**
     * @param certificate A certificate to associate with the distribution.
     * The certificate must be located in N. Virginia (us-east-1).
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate.Companion::unwrap))
    }

    /**
     * @param comment Any comments you want to include about the distribution.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param defaultBehavior The default behavior for the distribution. 
     */
    override fun defaultBehavior(defaultBehavior: BehaviorOptions) {
      cdkBuilder.defaultBehavior(defaultBehavior.let(BehaviorOptions.Companion::unwrap))
    }

    /**
     * @param defaultBehavior The default behavior for the distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80a91bac75a0f8e6677c3ecfd1080e30cdedc9eb185dbde5f7c2ce912e9e666c")
    override fun defaultBehavior(defaultBehavior: BehaviorOptions.Builder.() -> Unit): Unit =
        defaultBehavior(BehaviorOptions(defaultBehavior))

    /**
     * @param defaultRootObject The object that you want CloudFront to request from your origin (for
     * example, index.html) when a viewer requests the root URL for your distribution. If no default
     * object is set, the request goes to the origin's root (e.g., example.com/).
     */
    override fun defaultRootObject(defaultRootObject: String) {
      cdkBuilder.defaultRootObject(defaultRootObject)
    }

    /**
     * @param domainNames Alternative domain names for this distribution.
     * If you want to use your own domain name, such as www.example.com, instead of the
     * cloudfront.net domain name,
     * you can add an alternate domain name to your distribution. If you attach a certificate to the
     * distribution,
     * you should add (at least one of) the domain names of the certificate to this list.
     *
     * When you want to move a domain name between distributions, you can associate a certificate
     * without specifying any domain names.
     * For more information, see the *Moving an alternate domain name to a different distribution*
     * section in the README.
     */
    override fun domainNames(domainNames: List<String>) {
      cdkBuilder.domainNames(domainNames)
    }

    /**
     * @param domainNames Alternative domain names for this distribution.
     * If you want to use your own domain name, such as www.example.com, instead of the
     * cloudfront.net domain name,
     * you can add an alternate domain name to your distribution. If you attach a certificate to the
     * distribution,
     * you should add (at least one of) the domain names of the certificate to this list.
     *
     * When you want to move a domain name between distributions, you can associate a certificate
     * without specifying any domain names.
     * For more information, see the *Moving an alternate domain name to a different distribution*
     * section in the README.
     */
    override fun domainNames(vararg domainNames: String): Unit = domainNames(domainNames.toList())

    /**
     * @param enableIpv6 Whether CloudFront will respond to IPv6 DNS requests with an IPv6 address.
     * If you specify false, CloudFront responds to IPv6 DNS requests with the DNS response code
     * NOERROR and with no IP addresses.
     * This allows viewers to submit a second request, for an IPv4 address for your distribution.
     */
    override fun enableIpv6(enableIpv6: Boolean) {
      cdkBuilder.enableIpv6(enableIpv6)
    }

    /**
     * @param enableLogging Enable access logging for the distribution.
     */
    override fun enableLogging(enableLogging: Boolean) {
      cdkBuilder.enableLogging(enableLogging)
    }

    /**
     * @param enabled Enable or disable the distribution.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param errorResponses How CloudFront should handle requests that are not successful (e.g.,
     * PageNotFound).
     */
    override fun errorResponses(errorResponses: List<ErrorResponse>) {
      cdkBuilder.errorResponses(errorResponses.map(ErrorResponse.Companion::unwrap))
    }

    /**
     * @param errorResponses How CloudFront should handle requests that are not successful (e.g.,
     * PageNotFound).
     */
    override fun errorResponses(vararg errorResponses: ErrorResponse): Unit =
        errorResponses(errorResponses.toList())

    /**
     * @param geoRestriction Controls the countries in which your content is distributed.
     */
    override fun geoRestriction(geoRestriction: GeoRestriction) {
      cdkBuilder.geoRestriction(geoRestriction.let(GeoRestriction.Companion::unwrap))
    }

    /**
     * @param httpVersion Specify the maximum HTTP version that you want viewers to use to
     * communicate with CloudFront.
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or later, and must
     * support server name identification (SNI).
     */
    override fun httpVersion(httpVersion: HttpVersion) {
      cdkBuilder.httpVersion(httpVersion.let(HttpVersion.Companion::unwrap))
    }

    /**
     * @param logBucket The Amazon S3 bucket to store the access logs in.
     * Make sure to set `objectOwnership` to `s3.ObjectOwnership.OBJECT_WRITER` in your custom
     * bucket.
     */
    override fun logBucket(logBucket: IBucket) {
      cdkBuilder.logBucket(logBucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param logFilePrefix An optional string that you want CloudFront to prefix to the access log
     * filenames for this distribution.
     */
    override fun logFilePrefix(logFilePrefix: String) {
      cdkBuilder.logFilePrefix(logFilePrefix)
    }

    /**
     * @param logIncludesCookies Specifies whether you want CloudFront to include cookies in access
     * logs.
     */
    override fun logIncludesCookies(logIncludesCookies: Boolean) {
      cdkBuilder.logIncludesCookies(logIncludesCookies)
    }

    /**
     * @param minimumProtocolVersion The minimum version of the SSL protocol that you want
     * CloudFront to use for HTTPS connections.
     * CloudFront serves your objects only to browsers or devices that support at
     * least the SSL version that you specify.
     */
    override fun minimumProtocolVersion(minimumProtocolVersion: SecurityPolicyProtocol) {
      cdkBuilder.minimumProtocolVersion(minimumProtocolVersion.let(SecurityPolicyProtocol.Companion::unwrap))
    }

    /**
     * @param priceClass The price class that corresponds with the maximum price that you want to
     * pay for CloudFront service.
     * If you specify PriceClass_All, CloudFront responds to requests for your objects from all
     * CloudFront edge locations.
     * If you specify a price class other than PriceClass_All, CloudFront serves your objects from
     * the CloudFront edge location
     * that has the lowest latency among the edge locations in your price class.
     */
    override fun priceClass(priceClass: PriceClass) {
      cdkBuilder.priceClass(priceClass.let(PriceClass.Companion::unwrap))
    }

    /**
     * @param publishAdditionalMetrics Whether to enable additional CloudWatch metrics.
     */
    override fun publishAdditionalMetrics(publishAdditionalMetrics: Boolean) {
      cdkBuilder.publishAdditionalMetrics(publishAdditionalMetrics)
    }

    /**
     * @param sslSupportMethod The SSL method CloudFront will use for your distribution.
     * Server Name Indication (SNI) - is an extension to the TLS computer networking protocol by
     * which a client indicates
     * which hostname it is attempting to connect to at the start of the handshaking process. This
     * allows a server to present
     * multiple certificates on the same IP address and TCP port number and hence allows multiple
     * secure (HTTPS) websites
     * (or any other service over TLS) to be served by the same IP address without requiring all
     * those sites to use the same certificate.
     *
     * CloudFront can use SNI to host multiple distributions on the same IP - which a large majority
     * of clients will support.
     *
     * If your clients cannot support SNI however - CloudFront can use dedicated IPs for your
     * distribution - but there is a prorated monthly charge for
     * using this feature. By default, we use SNI - but you can optionally enable dedicated IPs
     * (VIP).
     *
     * See the CloudFront SSL for more details about pricing :
     * https://aws.amazon.com/cloudfront/custom-ssl-domains/
     */
    override fun sslSupportMethod(sslSupportMethod: SSLMethod) {
      cdkBuilder.sslSupportMethod(sslSupportMethod.let(SSLMethod.Companion::unwrap))
    }

    /**
     * @param webAclId Unique identifier that specifies the AWS WAF web ACL to associate with this
     * CloudFront distribution.
     * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     */
    override fun webAclId(webAclId: String) {
      cdkBuilder.webAclId(webAclId)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.DistributionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.DistributionProps,
  ) : CdkObject(cdkObject),
      DistributionProps {
    /**
     * Additional behaviors for the distribution, mapped by the pathPattern that specifies which
     * requests to apply the behavior to.
     *
     * Default: - no additional behaviors are added.
     */
    override fun additionalBehaviors(): Map<String, BehaviorOptions> =
        unwrap(this).getAdditionalBehaviors()?.mapValues{BehaviorOptions.wrap(it.value)} ?:
        emptyMap()

    /**
     * A certificate to associate with the distribution.
     *
     * The certificate must be located in N. Virginia (us-east-1).
     *
     * Default: - the CloudFront wildcard certificate (*.cloudfront.net) will be used.
     */
    override fun certificate(): ICertificate? =
        unwrap(this).getCertificate()?.let(ICertificate::wrap)

    /**
     * Any comments you want to include about the distribution.
     *
     * Default: - no comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The default behavior for the distribution.
     */
    override fun defaultBehavior(): BehaviorOptions =
        unwrap(this).getDefaultBehavior().let(BehaviorOptions::wrap)

    /**
     * The object that you want CloudFront to request from your origin (for example, index.html)
     * when a viewer requests the root URL for your distribution. If no default object is set, the
     * request goes to the origin's root (e.g., example.com/).
     *
     * Default: - no default root object
     */
    override fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

    /**
     * Alternative domain names for this distribution.
     *
     * If you want to use your own domain name, such as www.example.com, instead of the
     * cloudfront.net domain name,
     * you can add an alternate domain name to your distribution. If you attach a certificate to the
     * distribution,
     * you should add (at least one of) the domain names of the certificate to this list.
     *
     * When you want to move a domain name between distributions, you can associate a certificate
     * without specifying any domain names.
     * For more information, see the *Moving an alternate domain name to a different distribution*
     * section in the README.
     *
     * Default: - The distribution will only support the default generated name (e.g.,
     * d111111abcdef8.cloudfront.net)
     */
    override fun domainNames(): List<String> = unwrap(this).getDomainNames() ?: emptyList()

    /**
     * Whether CloudFront will respond to IPv6 DNS requests with an IPv6 address.
     *
     * If you specify false, CloudFront responds to IPv6 DNS requests with the DNS response code
     * NOERROR and with no IP addresses.
     * This allows viewers to submit a second request, for an IPv4 address for your distribution.
     *
     * Default: true
     */
    override fun enableIpv6(): Boolean? = unwrap(this).getEnableIpv6()

    /**
     * Enable access logging for the distribution.
     *
     * Default: - false, unless `logBucket` is specified.
     */
    override fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

    /**
     * Enable or disable the distribution.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * How CloudFront should handle requests that are not successful (e.g., PageNotFound).
     *
     * Default: - No custom error responses.
     */
    override fun errorResponses(): List<ErrorResponse> =
        unwrap(this).getErrorResponses()?.map(ErrorResponse::wrap) ?: emptyList()

    /**
     * Controls the countries in which your content is distributed.
     *
     * Default: - No geographic restrictions
     */
    override fun geoRestriction(): GeoRestriction? =
        unwrap(this).getGeoRestriction()?.let(GeoRestriction::wrap)

    /**
     * Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront.
     *
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or later, and must
     * support server name identification (SNI).
     *
     * Default: HttpVersion.HTTP2
     */
    override fun httpVersion(): HttpVersion? = unwrap(this).getHttpVersion()?.let(HttpVersion::wrap)

    /**
     * The Amazon S3 bucket to store the access logs in.
     *
     * Make sure to set `objectOwnership` to `s3.ObjectOwnership.OBJECT_WRITER` in your custom
     * bucket.
     *
     * Default: - A bucket is created if `enableLogging` is true
     */
    override fun logBucket(): IBucket? = unwrap(this).getLogBucket()?.let(IBucket::wrap)

    /**
     * An optional string that you want CloudFront to prefix to the access log filenames for this
     * distribution.
     *
     * Default: - no prefix
     */
    override fun logFilePrefix(): String? = unwrap(this).getLogFilePrefix()

    /**
     * Specifies whether you want CloudFront to include cookies in access logs.
     *
     * Default: false
     */
    override fun logIncludesCookies(): Boolean? = unwrap(this).getLogIncludesCookies()

    /**
     * The minimum version of the SSL protocol that you want CloudFront to use for HTTPS
     * connections.
     *
     * CloudFront serves your objects only to browsers or devices that support at
     * least the SSL version that you specify.
     *
     * Default: - SecurityPolicyProtocol.TLS_V1_2_2021 if the
     * '@aws-cdk/aws-cloudfront:defaultSecurityPolicyTLSv1.2_2021' feature flag is set; otherwise,
     * SecurityPolicyProtocol.TLS_V1_2_2019.
     */
    override fun minimumProtocolVersion(): SecurityPolicyProtocol? =
        unwrap(this).getMinimumProtocolVersion()?.let(SecurityPolicyProtocol::wrap)

    /**
     * The price class that corresponds with the maximum price that you want to pay for CloudFront
     * service.
     *
     * If you specify PriceClass_All, CloudFront responds to requests for your objects from all
     * CloudFront edge locations.
     * If you specify a price class other than PriceClass_All, CloudFront serves your objects from
     * the CloudFront edge location
     * that has the lowest latency among the edge locations in your price class.
     *
     * Default: PriceClass.PRICE_CLASS_ALL
     */
    override fun priceClass(): PriceClass? = unwrap(this).getPriceClass()?.let(PriceClass::wrap)

    /**
     * Whether to enable additional CloudWatch metrics.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/viewing-cloudfront-metrics.html)
     */
    override fun publishAdditionalMetrics(): Boolean? = unwrap(this).getPublishAdditionalMetrics()

    /**
     * The SSL method CloudFront will use for your distribution.
     *
     * Server Name Indication (SNI) - is an extension to the TLS computer networking protocol by
     * which a client indicates
     * which hostname it is attempting to connect to at the start of the handshaking process. This
     * allows a server to present
     * multiple certificates on the same IP address and TCP port number and hence allows multiple
     * secure (HTTPS) websites
     * (or any other service over TLS) to be served by the same IP address without requiring all
     * those sites to use the same certificate.
     *
     * CloudFront can use SNI to host multiple distributions on the same IP - which a large majority
     * of clients will support.
     *
     * If your clients cannot support SNI however - CloudFront can use dedicated IPs for your
     * distribution - but there is a prorated monthly charge for
     * using this feature. By default, we use SNI - but you can optionally enable dedicated IPs
     * (VIP).
     *
     * See the CloudFront SSL for more details about pricing :
     * https://aws.amazon.com/cloudfront/custom-ssl-domains/
     *
     * Default: SSLMethod.SNI
     */
    override fun sslSupportMethod(): SSLMethod? =
        unwrap(this).getSslSupportMethod()?.let(SSLMethod::wrap)

    /**
     * Unique identifier that specifies the AWS WAF web ACL to associate with this CloudFront
     * distribution.
     *
     * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * Default: - No AWS Web Application Firewall web access control list (web ACL).
     *
     * [Documentation](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html#API_CreateDistribution_RequestParameters.)
     */
    override fun webAclId(): String? = unwrap(this).getWebAclId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DistributionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.DistributionProps):
        DistributionProps = CdkObjectWrappers.wrap(cdkObject) as? DistributionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DistributionProps):
        software.amazon.awscdk.services.cloudfront.DistributionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.DistributionProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionDistributionConfigPropertyDsl {
  private val cdkBuilder: CfnDistribution.DistributionConfigProperty.Builder =
      CfnDistribution.DistributionConfigProperty.builder()

  private val _aliases: MutableList<String> = mutableListOf()

  private val _cacheBehaviors: MutableList<Any> = mutableListOf()

  private val _cnamEs: MutableList<String> = mutableListOf()

  private val _customErrorResponses: MutableList<Any> = mutableListOf()

  private val _origins: MutableList<Any> = mutableListOf()

  /**
   * @param aliases A complex type that contains information about CNAMEs (alternate domain names),
   * if any, for this distribution.
   */
  public fun aliases(vararg aliases: String) {
    _aliases.addAll(listOf(*aliases))
  }

  /**
   * @param aliases A complex type that contains information about CNAMEs (alternate domain names),
   * if any, for this distribution.
   */
  public fun aliases(aliases: Collection<String>) {
    _aliases.addAll(aliases)
  }

  /**
   * @param cacheBehaviors A complex type that contains zero or more `CacheBehavior` elements.
   */
  public fun cacheBehaviors(vararg cacheBehaviors: Any) {
    _cacheBehaviors.addAll(listOf(*cacheBehaviors))
  }

  /**
   * @param cacheBehaviors A complex type that contains zero or more `CacheBehavior` elements.
   */
  public fun cacheBehaviors(cacheBehaviors: Collection<Any>) {
    _cacheBehaviors.addAll(cacheBehaviors)
  }

  /**
   * @param cacheBehaviors A complex type that contains zero or more `CacheBehavior` elements.
   */
  public fun cacheBehaviors(cacheBehaviors: IResolvable) {
    cdkBuilder.cacheBehaviors(cacheBehaviors)
  }

  /**
   * @param cnamEs the value to be set.
   */
  public fun cnamEs(vararg cnamEs: String) {
    _cnamEs.addAll(listOf(*cnamEs))
  }

  /**
   * @param cnamEs the value to be set.
   */
  public fun cnamEs(cnamEs: Collection<String>) {
    _cnamEs.addAll(cnamEs)
  }

  /**
   * @param comment A comment to describe the distribution.
   * The comment cannot be longer than 128 characters.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param continuousDeploymentPolicyId The identifier of a continuous deployment policy.
   * For more information, see `CreateContinuousDeploymentPolicy` .
   */
  public fun continuousDeploymentPolicyId(continuousDeploymentPolicyId: String) {
    cdkBuilder.continuousDeploymentPolicyId(continuousDeploymentPolicyId)
  }

  /**
   * @param customErrorResponses A complex type that controls the following:.
   * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
   * messages before returning the response to the viewer.
   * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
   *
   * For more information about custom error pages, see [Customizing Error
   * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
   * in the *Amazon CloudFront Developer Guide* .
   */
  public fun customErrorResponses(vararg customErrorResponses: Any) {
    _customErrorResponses.addAll(listOf(*customErrorResponses))
  }

  /**
   * @param customErrorResponses A complex type that controls the following:.
   * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
   * messages before returning the response to the viewer.
   * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
   *
   * For more information about custom error pages, see [Customizing Error
   * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
   * in the *Amazon CloudFront Developer Guide* .
   */
  public fun customErrorResponses(customErrorResponses: Collection<Any>) {
    _customErrorResponses.addAll(customErrorResponses)
  }

  /**
   * @param customErrorResponses A complex type that controls the following:.
   * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
   * messages before returning the response to the viewer.
   * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
   *
   * For more information about custom error pages, see [Customizing Error
   * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
   * in the *Amazon CloudFront Developer Guide* .
   */
  public fun customErrorResponses(customErrorResponses: IResolvable) {
    cdkBuilder.customErrorResponses(customErrorResponses)
  }

  /**
   * @param customOrigin the value to be set.
   */
  public fun customOrigin(customOrigin: IResolvable) {
    cdkBuilder.customOrigin(customOrigin)
  }

  /**
   * @param customOrigin the value to be set.
   */
  public fun customOrigin(customOrigin: CfnDistribution.LegacyCustomOriginProperty) {
    cdkBuilder.customOrigin(customOrigin)
  }

  /**
   * @param defaultCacheBehavior A complex type that describes the default cache behavior if you
   * don't specify a `CacheBehavior` element or if files don't match any of the values of `PathPattern`
   * in `CacheBehavior` elements. 
   * You must create exactly one default cache behavior.
   */
  public fun defaultCacheBehavior(defaultCacheBehavior: IResolvable) {
    cdkBuilder.defaultCacheBehavior(defaultCacheBehavior)
  }

  /**
   * @param defaultCacheBehavior A complex type that describes the default cache behavior if you
   * don't specify a `CacheBehavior` element or if files don't match any of the values of `PathPattern`
   * in `CacheBehavior` elements. 
   * You must create exactly one default cache behavior.
   */
  public
      fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.DefaultCacheBehaviorProperty) {
    cdkBuilder.defaultCacheBehavior(defaultCacheBehavior)
  }

  /**
   * @param defaultRootObject The object that you want CloudFront to request from your origin (for
   * example, `index.html` ) when a viewer requests the root URL for your distribution (
   * `https://www.example.com` ) instead of an object in your distribution (
   * `https://www.example.com/product-description.html` ). Specifying a default root object avoids
   * exposing the contents of your distribution.
   * Specify only the object name, for example, `index.html` . Don't add a `/` before the object
   * name.
   *
   * If you don't want to specify a default root object when you create a distribution, include an
   * empty `DefaultRootObject` element.
   *
   * To delete the default root object from an existing distribution, update the distribution
   * configuration and include an empty `DefaultRootObject` element.
   *
   * To replace the default root object, update the distribution configuration and specify the new
   * object.
   *
   * For more information about the default root object, see [Creating a Default Root
   * Object](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html)
   * in the *Amazon CloudFront Developer Guide* .
   */
  public fun defaultRootObject(defaultRootObject: String) {
    cdkBuilder.defaultRootObject(defaultRootObject)
  }

  /**
   * @param enabled From this field, you can enable or disable the selected distribution. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled From this field, you can enable or disable the selected distribution. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param httpVersion (Optional) Specify the maximum HTTP version(s) that you want viewers to use
   * to communicate with CloudFront .
   * The default value for new distributions is `http1.1` .
   *
   * For viewers and CloudFront to use HTTP/2, viewers must support TLSv1.2 or later, and must
   * support Server Name Indication (SNI).
   *
   * For viewers and CloudFront to use HTTP/3, viewers must support TLSv1.3 and Server Name
   * Indication (SNI). CloudFront supports HTTP/3 connection migration to allow the viewer to switch
   * networks without losing connection. For more information about connection migration, see
   * [Connection
   * Migration](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc9000.html#name-connection-migration)
   * at RFC 9000. For more information about supported TLSv1.3 ciphers, see [Supported protocols and
   * ciphers between viewers and
   * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html)
   * .
   */
  public fun httpVersion(httpVersion: String) {
    cdkBuilder.httpVersion(httpVersion)
  }

  /**
   * @param ipv6Enabled If you want CloudFront to respond to IPv6 DNS requests with an IPv6 address
   * for your distribution, specify `true` .
   * If you specify `false` , CloudFront responds to IPv6 DNS requests with the DNS response code
   * `NOERROR` and with no IP addresses. This allows viewers to submit a second request, for an IPv4
   * address for your distribution.
   *
   * In general, you should enable IPv6 if you have users on IPv6 networks who want to access your
   * content. However, if you're using signed URLs or signed cookies to restrict access to your
   * content, and if you're using a custom policy that includes the `IpAddress` parameter to restrict
   * the IP addresses that can access your content, don't enable IPv6. If you want to restrict access
   * to some content by IP address and not restrict access to other content (or restrict access but not
   * by IP address), you can create two distributions. For more information, see [Creating a Signed URL
   * Using a Custom
   * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you're using an Amazon Route 53 AWS Integration alias resource record set to route traffic
   * to your CloudFront distribution, you need to create a second alias resource record set when both
   * of the following are true:
   *
   * * You enable IPv6 for the distribution
   * * You're using alternate domain names in the URLs for your objects
   *
   * For more information, see [Routing Traffic to an Amazon CloudFront Web Distribution by Using
   * Your Domain
   * Name](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html)
   * in the *Amazon Route 53 AWS Integration Developer Guide* .
   *
   * If you created a CNAME resource record set, either with Amazon Route 53 AWS Integration or with
   * another DNS service, you don't need to make any changes. A CNAME record will route traffic to your
   * distribution regardless of the IP address format of the viewer request.
   */
  public fun ipv6Enabled(ipv6Enabled: Boolean) {
    cdkBuilder.ipv6Enabled(ipv6Enabled)
  }

  /**
   * @param ipv6Enabled If you want CloudFront to respond to IPv6 DNS requests with an IPv6 address
   * for your distribution, specify `true` .
   * If you specify `false` , CloudFront responds to IPv6 DNS requests with the DNS response code
   * `NOERROR` and with no IP addresses. This allows viewers to submit a second request, for an IPv4
   * address for your distribution.
   *
   * In general, you should enable IPv6 if you have users on IPv6 networks who want to access your
   * content. However, if you're using signed URLs or signed cookies to restrict access to your
   * content, and if you're using a custom policy that includes the `IpAddress` parameter to restrict
   * the IP addresses that can access your content, don't enable IPv6. If you want to restrict access
   * to some content by IP address and not restrict access to other content (or restrict access but not
   * by IP address), you can create two distributions. For more information, see [Creating a Signed URL
   * Using a Custom
   * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you're using an Amazon Route 53 AWS Integration alias resource record set to route traffic
   * to your CloudFront distribution, you need to create a second alias resource record set when both
   * of the following are true:
   *
   * * You enable IPv6 for the distribution
   * * You're using alternate domain names in the URLs for your objects
   *
   * For more information, see [Routing Traffic to an Amazon CloudFront Web Distribution by Using
   * Your Domain
   * Name](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html)
   * in the *Amazon Route 53 AWS Integration Developer Guide* .
   *
   * If you created a CNAME resource record set, either with Amazon Route 53 AWS Integration or with
   * another DNS service, you don't need to make any changes. A CNAME record will route traffic to your
   * distribution regardless of the IP address format of the viewer request.
   */
  public fun ipv6Enabled(ipv6Enabled: IResolvable) {
    cdkBuilder.ipv6Enabled(ipv6Enabled)
  }

  /**
   * @param logging A complex type that controls whether access logs are written for the
   * distribution.
   * For more information about logging, see [Access
   * Logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) in the
   * *Amazon CloudFront Developer Guide* .
   */
  public fun logging(logging: IResolvable) {
    cdkBuilder.logging(logging)
  }

  /**
   * @param logging A complex type that controls whether access logs are written for the
   * distribution.
   * For more information about logging, see [Access
   * Logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) in the
   * *Amazon CloudFront Developer Guide* .
   */
  public fun logging(logging: CfnDistribution.LoggingProperty) {
    cdkBuilder.logging(logging)
  }

  /**
   * @param originGroups A complex type that contains information about origin groups for this
   * distribution.
   */
  public fun originGroups(originGroups: IResolvable) {
    cdkBuilder.originGroups(originGroups)
  }

  /**
   * @param originGroups A complex type that contains information about origin groups for this
   * distribution.
   */
  public fun originGroups(originGroups: CfnDistribution.OriginGroupsProperty) {
    cdkBuilder.originGroups(originGroups)
  }

  /**
   * @param origins A complex type that contains information about origins for this distribution.
   */
  public fun origins(vararg origins: Any) {
    _origins.addAll(listOf(*origins))
  }

  /**
   * @param origins A complex type that contains information about origins for this distribution.
   */
  public fun origins(origins: Collection<Any>) {
    _origins.addAll(origins)
  }

  /**
   * @param origins A complex type that contains information about origins for this distribution.
   */
  public fun origins(origins: IResolvable) {
    cdkBuilder.origins(origins)
  }

  /**
   * @param priceClass The price class that corresponds with the maximum price that you want to pay
   * for CloudFront service.
   * If you specify `PriceClass_All` , CloudFront responds to requests for your objects from all
   * CloudFront edge locations.
   *
   * If you specify a price class other than `PriceClass_All` , CloudFront serves your objects from
   * the CloudFront edge location that has the lowest latency among the edge locations in your price
   * class. Viewers who are in or near regions that are excluded from your specified price class may
   * encounter slower performance.
   *
   * For more information about price classes, see [Choosing the Price Class for a CloudFront
   * Distribution](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html)
   * in the *Amazon CloudFront Developer Guide* . For information about CloudFront pricing, including
   * how price classes (such as Price Class 100) map to CloudFront regions, see [Amazon CloudFront
   * Pricing](https://docs.aws.amazon.com/cloudfront/pricing/) .
   */
  public fun priceClass(priceClass: String) {
    cdkBuilder.priceClass(priceClass)
  }

  /**
   * @param restrictions A complex type that identifies ways in which you want to restrict
   * distribution of your content.
   */
  public fun restrictions(restrictions: IResolvable) {
    cdkBuilder.restrictions(restrictions)
  }

  /**
   * @param restrictions A complex type that identifies ways in which you want to restrict
   * distribution of your content.
   */
  public fun restrictions(restrictions: CfnDistribution.RestrictionsProperty) {
    cdkBuilder.restrictions(restrictions)
  }

  /**
   * @param s3Origin the value to be set.
   */
  public fun s3Origin(s3Origin: IResolvable) {
    cdkBuilder.s3Origin(s3Origin)
  }

  /**
   * @param s3Origin the value to be set.
   */
  public fun s3Origin(s3Origin: CfnDistribution.LegacyS3OriginProperty) {
    cdkBuilder.s3Origin(s3Origin)
  }

  /**
   * @param staging A Boolean that indicates whether this is a staging distribution.
   * When this value is `true` , this is a staging distribution. When this value is `false` , this
   * is not a staging distribution.
   */
  public fun staging(staging: Boolean) {
    cdkBuilder.staging(staging)
  }

  /**
   * @param staging A Boolean that indicates whether this is a staging distribution.
   * When this value is `true` , this is a staging distribution. When this value is `false` , this
   * is not a staging distribution.
   */
  public fun staging(staging: IResolvable) {
    cdkBuilder.staging(staging)
  }

  /**
   * @param viewerCertificate A complex type that determines the distribution's SSL/TLS
   * configuration for communicating with viewers.
   */
  public fun viewerCertificate(viewerCertificate: IResolvable) {
    cdkBuilder.viewerCertificate(viewerCertificate)
  }

  /**
   * @param viewerCertificate A complex type that determines the distribution's SSL/TLS
   * configuration for communicating with viewers.
   */
  public fun viewerCertificate(viewerCertificate: CfnDistribution.ViewerCertificateProperty) {
    cdkBuilder.viewerCertificate(viewerCertificate)
  }

  /**
   * @param webAclId A unique identifier that specifies the AWS WAF web ACL, if any, to associate
   * with this distribution.
   * To specify a web ACL created using the latest version of AWS WAF , use the ACL ARN, for example
   * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`
   * . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
   * `473e64fd-f30b-4765-81a0-62ad96dd167a` .
   *
   * AWS WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests that
   * are forwarded to CloudFront, and lets you control access to your content. Based on conditions that
   * you specify, such as the IP addresses that requests originate from or the values of query strings,
   * CloudFront responds to requests either with the requested content or with an HTTP 403 status code
   * (Forbidden). You can also configure CloudFront to return a custom error page when a request is
   * blocked. For more information about AWS WAF , see the [AWS WAF Developer
   * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html) .
   */
  public fun webAclId(webAclId: String) {
    cdkBuilder.webAclId(webAclId)
  }

  public fun build(): CfnDistribution.DistributionConfigProperty {
    if(_aliases.isNotEmpty()) cdkBuilder.aliases(_aliases)
    if(_cacheBehaviors.isNotEmpty()) cdkBuilder.cacheBehaviors(_cacheBehaviors)
    if(_cnamEs.isNotEmpty()) cdkBuilder.cnamEs(_cnamEs)
    if(_customErrorResponses.isNotEmpty()) cdkBuilder.customErrorResponses(_customErrorResponses)
    if(_origins.isNotEmpty()) cdkBuilder.origins(_origins)
    return cdkBuilder.build()
  }
}

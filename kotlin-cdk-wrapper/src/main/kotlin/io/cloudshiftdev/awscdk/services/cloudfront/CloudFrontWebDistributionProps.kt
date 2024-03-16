@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * Bucket sourceBucket;
 * ViewerCertificate viewerCertificate = ViewerCertificate.fromIamCertificate("MYIAMROLEIDENTIFIER",
 * ViewerCertificateOptions.builder()
 * .aliases(List.of("MYALIAS"))
 * .build());
 * CloudFrontWebDistribution.Builder.create(this, "MyCfWebDistribution")
 * .originConfigs(List.of(SourceConfiguration.builder()
 * .s3OriginSource(S3OriginConfig.builder()
 * .s3BucketSource(sourceBucket)
 * .build())
 * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
 * .build()))
 * .viewerCertificate(viewerCertificate)
 * .build();
 * ```
 */
public interface CloudFrontWebDistributionProps {
  /**
   * A comment for this distribution in the CloudFront console.
   *
   * Default: - No comment is added to distribution.
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * The default object to serve.
   *
   * Default: - "index.html" is served.
   */
  public fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

  /**
   * If your distribution should have IPv6 enabled.
   *
   * Default: true
   */
  public fun enableIpV6(): Boolean? = unwrap(this).getEnableIpV6()

  /**
   * Enable or disable the distribution.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * How CloudFront should handle requests that are not successful (eg PageNotFound).
   *
   * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range
   * with custom error messages. CloudFront does not cache HTTP status codes.
   *
   * Default: - No custom error configuration.
   */
  public fun errorConfigurations(): List<CfnDistribution.CustomErrorResponseProperty> =
      unwrap(this).getErrorConfigurations()?.map(CfnDistribution.CustomErrorResponseProperty::wrap)
      ?: emptyList()

  /**
   * Controls the countries in which your content is distributed.
   *
   * Default: No geo restriction
   */
  public fun geoRestriction(): GeoRestriction? =
      unwrap(this).getGeoRestriction()?.let(GeoRestriction::wrap)

  /**
   * The max supported HTTP Versions.
   *
   * Default: HttpVersion.HTTP2
   */
  public fun httpVersion(): HttpVersion? = unwrap(this).getHttpVersion()?.let(HttpVersion::wrap)

  /**
   * Optional - if we should enable logging.
   *
   * You can pass an empty object ({}) to have us auto create a bucket for logging.
   * Omission of this property indicates no logging is to be enabled.
   *
   * Default: - no logging is enabled by default.
   */
  public fun loggingConfig(): LoggingConfiguration? =
      unwrap(this).getLoggingConfig()?.let(LoggingConfiguration::wrap)

  /**
   * The origin configurations for this distribution.
   *
   * Behaviors are a part of the origin.
   */
  public fun originConfigs(): List<SourceConfiguration>

  /**
   * The price class for the distribution (this impacts how many locations CloudFront uses for your
   * distribution, and billing).
   *
   * Default: PriceClass.PRICE_CLASS_100 the cheapest option for CloudFront is picked by default.
   */
  public fun priceClass(): PriceClass? = unwrap(this).getPriceClass()?.let(PriceClass::wrap)

  /**
   * Specifies whether you want viewers to use HTTP or HTTPS to request your objects, whether you're
   * using an alternate domain name with HTTPS, and if so, if you're using AWS Certificate Manager
   * (ACM) or a third-party certificate authority.
   *
   * Default: ViewerCertificate.fromCloudFrontDefaultCertificate()
   *
   * [Documentation](https://aws.amazon.com/premiumsupport/knowledge-center/custom-ssl-certificate-cloudfront/)
   */
  public fun viewerCertificate(): ViewerCertificate? =
      unwrap(this).getViewerCertificate()?.let(ViewerCertificate::wrap)

  /**
   * The default viewer policy for incoming clients.
   *
   * Default: RedirectToHTTPs
   */
  public fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
      unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)

  /**
   * Unique identifier that specifies the AWS WAF web ACL to associate with this CloudFront
   * distribution.
   *
   * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for example
   * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
   *
   * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
   * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
   *
   * Default: - No AWS Web Application Firewall web access control list (web ACL).
   *
   * [Documentation](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html#API_CreateDistribution_RequestParameters.)
   */
  public fun webAclId(): String? = unwrap(this).getWebACLId()

  /**
   * A builder for [CloudFrontWebDistributionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment A comment for this distribution in the CloudFront console.
     */
    public fun comment(comment: String)

    /**
     * @param defaultRootObject The default object to serve.
     */
    public fun defaultRootObject(defaultRootObject: String)

    /**
     * @param enableIpV6 If your distribution should have IPv6 enabled.
     */
    public fun enableIpV6(enableIpV6: Boolean)

    /**
     * @param enabled Enable or disable the distribution.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     * PageNotFound).
     * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range
     * with custom error messages. CloudFront does not cache HTTP status codes.
     */
    public
        fun errorConfigurations(errorConfigurations: List<CfnDistribution.CustomErrorResponseProperty>)

    /**
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     * PageNotFound).
     * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range
     * with custom error messages. CloudFront does not cache HTTP status codes.
     */
    public fun errorConfigurations(vararg
        errorConfigurations: CfnDistribution.CustomErrorResponseProperty)

    /**
     * @param geoRestriction Controls the countries in which your content is distributed.
     */
    public fun geoRestriction(geoRestriction: GeoRestriction)

    /**
     * @param httpVersion The max supported HTTP Versions.
     */
    public fun httpVersion(httpVersion: HttpVersion)

    /**
     * @param loggingConfig Optional - if we should enable logging.
     * You can pass an empty object ({}) to have us auto create a bucket for logging.
     * Omission of this property indicates no logging is to be enabled.
     */
    public fun loggingConfig(loggingConfig: LoggingConfiguration)

    /**
     * @param loggingConfig Optional - if we should enable logging.
     * You can pass an empty object ({}) to have us auto create a bucket for logging.
     * Omission of this property indicates no logging is to be enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57916fcbbbcf6947de63cf0e1f900aa30c598933f866f66ada527886bfda9962")
    public fun loggingConfig(loggingConfig: LoggingConfiguration.Builder.() -> Unit)

    /**
     * @param originConfigs The origin configurations for this distribution. 
     * Behaviors are a part of the origin.
     */
    public fun originConfigs(originConfigs: List<SourceConfiguration>)

    /**
     * @param originConfigs The origin configurations for this distribution. 
     * Behaviors are a part of the origin.
     */
    public fun originConfigs(vararg originConfigs: SourceConfiguration)

    /**
     * @param priceClass The price class for the distribution (this impacts how many locations
     * CloudFront uses for your distribution, and billing).
     */
    public fun priceClass(priceClass: PriceClass)

    /**
     * @param viewerCertificate Specifies whether you want viewers to use HTTP or HTTPS to request
     * your objects, whether you're using an alternate domain name with HTTPS, and if so, if you're
     * using AWS Certificate Manager (ACM) or a third-party certificate authority.
     */
    public fun viewerCertificate(viewerCertificate: ViewerCertificate)

    /**
     * @param viewerProtocolPolicy The default viewer policy for incoming clients.
     */
    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy)

    /**
     * @param webAclId Unique identifier that specifies the AWS WAF web ACL to associate with this
     * CloudFront distribution.
     * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     */
    public fun webAclId(webAclId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.Builder =
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps.builder()

    /**
     * @param comment A comment for this distribution in the CloudFront console.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param defaultRootObject The default object to serve.
     */
    override fun defaultRootObject(defaultRootObject: String) {
      cdkBuilder.defaultRootObject(defaultRootObject)
    }

    /**
     * @param enableIpV6 If your distribution should have IPv6 enabled.
     */
    override fun enableIpV6(enableIpV6: Boolean) {
      cdkBuilder.enableIpV6(enableIpV6)
    }

    /**
     * @param enabled Enable or disable the distribution.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     * PageNotFound).
     * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range
     * with custom error messages. CloudFront does not cache HTTP status codes.
     */
    override
        fun errorConfigurations(errorConfigurations: List<CfnDistribution.CustomErrorResponseProperty>) {
      cdkBuilder.errorConfigurations(errorConfigurations.map(CfnDistribution.CustomErrorResponseProperty::unwrap))
    }

    /**
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     * PageNotFound).
     * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range
     * with custom error messages. CloudFront does not cache HTTP status codes.
     */
    override fun errorConfigurations(vararg
        errorConfigurations: CfnDistribution.CustomErrorResponseProperty): Unit =
        errorConfigurations(errorConfigurations.toList())

    /**
     * @param geoRestriction Controls the countries in which your content is distributed.
     */
    override fun geoRestriction(geoRestriction: GeoRestriction) {
      cdkBuilder.geoRestriction(geoRestriction.let(GeoRestriction::unwrap))
    }

    /**
     * @param httpVersion The max supported HTTP Versions.
     */
    override fun httpVersion(httpVersion: HttpVersion) {
      cdkBuilder.httpVersion(httpVersion.let(HttpVersion::unwrap))
    }

    /**
     * @param loggingConfig Optional - if we should enable logging.
     * You can pass an empty object ({}) to have us auto create a bucket for logging.
     * Omission of this property indicates no logging is to be enabled.
     */
    override fun loggingConfig(loggingConfig: LoggingConfiguration) {
      cdkBuilder.loggingConfig(loggingConfig.let(LoggingConfiguration::unwrap))
    }

    /**
     * @param loggingConfig Optional - if we should enable logging.
     * You can pass an empty object ({}) to have us auto create a bucket for logging.
     * Omission of this property indicates no logging is to be enabled.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57916fcbbbcf6947de63cf0e1f900aa30c598933f866f66ada527886bfda9962")
    override fun loggingConfig(loggingConfig: LoggingConfiguration.Builder.() -> Unit): Unit =
        loggingConfig(LoggingConfiguration(loggingConfig))

    /**
     * @param originConfigs The origin configurations for this distribution. 
     * Behaviors are a part of the origin.
     */
    override fun originConfigs(originConfigs: List<SourceConfiguration>) {
      cdkBuilder.originConfigs(originConfigs.map(SourceConfiguration::unwrap))
    }

    /**
     * @param originConfigs The origin configurations for this distribution. 
     * Behaviors are a part of the origin.
     */
    override fun originConfigs(vararg originConfigs: SourceConfiguration): Unit =
        originConfigs(originConfigs.toList())

    /**
     * @param priceClass The price class for the distribution (this impacts how many locations
     * CloudFront uses for your distribution, and billing).
     */
    override fun priceClass(priceClass: PriceClass) {
      cdkBuilder.priceClass(priceClass.let(PriceClass::unwrap))
    }

    /**
     * @param viewerCertificate Specifies whether you want viewers to use HTTP or HTTPS to request
     * your objects, whether you're using an alternate domain name with HTTPS, and if so, if you're
     * using AWS Certificate Manager (ACM) or a third-party certificate authority.
     */
    override fun viewerCertificate(viewerCertificate: ViewerCertificate) {
      cdkBuilder.viewerCertificate(viewerCertificate.let(ViewerCertificate::unwrap))
    }

    /**
     * @param viewerProtocolPolicy The default viewer policy for incoming clients.
     */
    override fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
      cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy.let(ViewerProtocolPolicy::unwrap))
    }

    /**
     * @param webAclId Unique identifier that specifies the AWS WAF web ACL to associate with this
     * CloudFront distribution.
     * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     */
    override fun webAclId(webAclId: String) {
      cdkBuilder.webAclId(webAclId)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps,
  ) : CdkObject(cdkObject), CloudFrontWebDistributionProps {
    /**
     * A comment for this distribution in the CloudFront console.
     *
     * Default: - No comment is added to distribution.
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The default object to serve.
     *
     * Default: - "index.html" is served.
     */
    override fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

    /**
     * If your distribution should have IPv6 enabled.
     *
     * Default: true
     */
    override fun enableIpV6(): Boolean? = unwrap(this).getEnableIpV6()

    /**
     * Enable or disable the distribution.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * How CloudFront should handle requests that are not successful (eg PageNotFound).
     *
     * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range
     * with custom error messages. CloudFront does not cache HTTP status codes.
     *
     * Default: - No custom error configuration.
     */
    override fun errorConfigurations(): List<CfnDistribution.CustomErrorResponseProperty> =
        unwrap(this).getErrorConfigurations()?.map(CfnDistribution.CustomErrorResponseProperty::wrap)
        ?: emptyList()

    /**
     * Controls the countries in which your content is distributed.
     *
     * Default: No geo restriction
     */
    override fun geoRestriction(): GeoRestriction? =
        unwrap(this).getGeoRestriction()?.let(GeoRestriction::wrap)

    /**
     * The max supported HTTP Versions.
     *
     * Default: HttpVersion.HTTP2
     */
    override fun httpVersion(): HttpVersion? = unwrap(this).getHttpVersion()?.let(HttpVersion::wrap)

    /**
     * Optional - if we should enable logging.
     *
     * You can pass an empty object ({}) to have us auto create a bucket for logging.
     * Omission of this property indicates no logging is to be enabled.
     *
     * Default: - no logging is enabled by default.
     */
    override fun loggingConfig(): LoggingConfiguration? =
        unwrap(this).getLoggingConfig()?.let(LoggingConfiguration::wrap)

    /**
     * The origin configurations for this distribution.
     *
     * Behaviors are a part of the origin.
     */
    override fun originConfigs(): List<SourceConfiguration> =
        unwrap(this).getOriginConfigs().map(SourceConfiguration::wrap)

    /**
     * The price class for the distribution (this impacts how many locations CloudFront uses for
     * your distribution, and billing).
     *
     * Default: PriceClass.PRICE_CLASS_100 the cheapest option for CloudFront is picked by default.
     */
    override fun priceClass(): PriceClass? = unwrap(this).getPriceClass()?.let(PriceClass::wrap)

    /**
     * Specifies whether you want viewers to use HTTP or HTTPS to request your objects, whether
     * you're using an alternate domain name with HTTPS, and if so, if you're using AWS Certificate
     * Manager (ACM) or a third-party certificate authority.
     *
     * Default: ViewerCertificate.fromCloudFrontDefaultCertificate()
     *
     * [Documentation](https://aws.amazon.com/premiumsupport/knowledge-center/custom-ssl-certificate-cloudfront/)
     */
    override fun viewerCertificate(): ViewerCertificate? =
        unwrap(this).getViewerCertificate()?.let(ViewerCertificate::wrap)

    /**
     * The default viewer policy for incoming clients.
     *
     * Default: RedirectToHTTPs
     */
    override fun viewerProtocolPolicy(): ViewerProtocolPolicy? =
        unwrap(this).getViewerProtocolPolicy()?.let(ViewerProtocolPolicy::wrap)

    /**
     * Unique identifier that specifies the AWS WAF web ACL to associate with this CloudFront
     * distribution.
     *
     * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * Default: - No AWS Web Application Firewall web access control list (web ACL).
     *
     * [Documentation](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html#API_CreateDistribution_RequestParameters.)
     */
    override fun webAclId(): String? = unwrap(this).getWebACLId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudFrontWebDistributionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps):
        CloudFrontWebDistributionProps = CdkObjectWrappers.wrap(cdkObject) as
        CloudFrontWebDistributionProps

    internal fun unwrap(wrapped: CloudFrontWebDistributionProps):
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps
  }
}

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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution
import software.amazon.awscdk.services.cloudfront.GeoRestriction
import software.amazon.awscdk.services.cloudfront.HttpVersion
import software.amazon.awscdk.services.cloudfront.LoggingConfiguration
import software.amazon.awscdk.services.cloudfront.PriceClass
import software.amazon.awscdk.services.cloudfront.SourceConfiguration
import software.amazon.awscdk.services.cloudfront.ViewerCertificate
import software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy
import software.constructs.Construct

/**
 * Amazon CloudFront is a global content delivery network (CDN) service that securely delivers data,
 * videos, applications, and APIs to your viewers with low latency and high transfer speeds.
 *
 * CloudFront fronts user provided content and caches it at edge locations across the world.
 *
 * Here's how you can use this construct:
 * ```
 * Bucket sourceBucket = new Bucket(this, "Bucket");
 * CloudFrontWebDistribution distribution = CloudFrontWebDistribution.Builder.create(this,
 * "MyDistribution")
 * .originConfigs(List.of(SourceConfiguration.builder()
 * .s3OriginSource(S3OriginConfig.builder()
 * .s3BucketSource(sourceBucket)
 * .build())
 * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
 * .build()))
 * .build();
 * ```
 *
 * This will create a CloudFront distribution that uses your S3Bucket as it's origin.
 *
 * You can customize the distribution using additional properties from the
 * CloudFrontWebDistributionProps interface.
 *
 * Example:
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
@CdkDslMarker
public class CloudFrontWebDistributionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CloudFrontWebDistribution.Builder =
        CloudFrontWebDistribution.Builder.create(scope, id)

    private val _errorConfigurations: MutableList<CfnDistribution.CustomErrorResponseProperty> =
        mutableListOf()

    private val _originConfigs: MutableList<SourceConfiguration> = mutableListOf()

    /**
     * A comment for this distribution in the CloudFront console.
     *
     * Default: - No comment is added to distribution.
     *
     * @param comment A comment for this distribution in the CloudFront console.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * The default object to serve.
     *
     * Default: - "index.html" is served.
     *
     * @param defaultRootObject The default object to serve.
     */
    public fun defaultRootObject(defaultRootObject: String) {
        cdkBuilder.defaultRootObject(defaultRootObject)
    }

    /**
     * If your distribution should have IPv6 enabled.
     *
     * Default: true
     *
     * @param enableIpV6 If your distribution should have IPv6 enabled.
     */
    public fun enableIpV6(enableIpV6: Boolean) {
        cdkBuilder.enableIpV6(enableIpV6)
    }

    /**
     * Enable or disable the distribution.
     *
     * Default: true
     *
     * @param enabled Enable or disable the distribution.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * How CloudFront should handle requests that are not successful (eg PageNotFound).
     *
     * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range with
     * custom error messages. CloudFront does not cache HTTP status codes.
     *
     * Default: - No custom error configuration.
     *
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     *   PageNotFound).
     */
    public fun errorConfigurations(
        errorConfigurations: CfnDistributionCustomErrorResponsePropertyDsl.() -> Unit
    ) {
        _errorConfigurations.add(
            CfnDistributionCustomErrorResponsePropertyDsl().apply(errorConfigurations).build()
        )
    }

    /**
     * How CloudFront should handle requests that are not successful (eg PageNotFound).
     *
     * By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx range with
     * custom error messages. CloudFront does not cache HTTP status codes.
     *
     * Default: - No custom error configuration.
     *
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     *   PageNotFound).
     */
    public fun errorConfigurations(
        errorConfigurations: Collection<CfnDistribution.CustomErrorResponseProperty>
    ) {
        _errorConfigurations.addAll(errorConfigurations)
    }

    /**
     * Controls the countries in which your content is distributed.
     *
     * Default: No geo restriction
     *
     * @param geoRestriction Controls the countries in which your content is distributed.
     */
    public fun geoRestriction(geoRestriction: GeoRestriction) {
        cdkBuilder.geoRestriction(geoRestriction)
    }

    /**
     * The max supported HTTP Versions.
     *
     * Default: HttpVersion.HTTP2
     *
     * @param httpVersion The max supported HTTP Versions.
     */
    public fun httpVersion(httpVersion: HttpVersion) {
        cdkBuilder.httpVersion(httpVersion)
    }

    /**
     * Optional - if we should enable logging.
     *
     * You can pass an empty object ({}) to have us auto create a bucket for logging. Omission of
     * this property indicates no logging is to be enabled.
     *
     * Default: - no logging is enabled by default.
     *
     * @param loggingConfig Optional - if we should enable logging.
     */
    public fun loggingConfig(loggingConfig: LoggingConfigurationDsl.() -> Unit = {}) {
        val builder = LoggingConfigurationDsl()
        builder.apply(loggingConfig)
        cdkBuilder.loggingConfig(builder.build())
    }

    /**
     * Optional - if we should enable logging.
     *
     * You can pass an empty object ({}) to have us auto create a bucket for logging. Omission of
     * this property indicates no logging is to be enabled.
     *
     * Default: - no logging is enabled by default.
     *
     * @param loggingConfig Optional - if we should enable logging.
     */
    public fun loggingConfig(loggingConfig: LoggingConfiguration) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    /**
     * The origin configurations for this distribution.
     *
     * Behaviors are a part of the origin.
     *
     * @param originConfigs The origin configurations for this distribution.
     */
    public fun originConfigs(originConfigs: SourceConfigurationDsl.() -> Unit) {
        _originConfigs.add(SourceConfigurationDsl().apply(originConfigs).build())
    }

    /**
     * The origin configurations for this distribution.
     *
     * Behaviors are a part of the origin.
     *
     * @param originConfigs The origin configurations for this distribution.
     */
    public fun originConfigs(originConfigs: Collection<SourceConfiguration>) {
        _originConfigs.addAll(originConfigs)
    }

    /**
     * The price class for the distribution (this impacts how many locations CloudFront uses for
     * your distribution, and billing).
     *
     * Default: PriceClass.PRICE_CLASS_100 the cheapest option for CloudFront is picked by default.
     *
     * @param priceClass The price class for the distribution (this impacts how many locations
     *   CloudFront uses for your distribution, and billing).
     */
    public fun priceClass(priceClass: PriceClass) {
        cdkBuilder.priceClass(priceClass)
    }

    /**
     * Specifies whether you want viewers to use HTTP or HTTPS to request your objects, whether
     * you're using an alternate domain name with HTTPS, and if so, if you're using AWS Certificate
     * Manager (ACM) or a third-party certificate authority.
     *
     * Default: ViewerCertificate.fromCloudFrontDefaultCertificate()
     *
     * [Documentation](https://aws.amazon.com/premiumsupport/knowledge-center/custom-ssl-certificate-cloudfront/)
     *
     * @param viewerCertificate Specifies whether you want viewers to use HTTP or HTTPS to request
     *   your objects, whether you're using an alternate domain name with HTTPS, and if so, if
     *   you're using AWS Certificate Manager (ACM) or a third-party certificate authority.
     */
    public fun viewerCertificate(viewerCertificate: ViewerCertificate) {
        cdkBuilder.viewerCertificate(viewerCertificate)
    }

    /**
     * The default viewer policy for incoming clients.
     *
     * Default: RedirectToHTTPs
     *
     * @param viewerProtocolPolicy The default viewer policy for incoming clients.
     */
    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
        cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
    }

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
     *
     * @param webAclId Unique identifier that specifies the AWS WAF web ACL to associate with this
     *   CloudFront distribution.
     */
    public fun webAclId(webAclId: String) {
        cdkBuilder.webAclId(webAclId)
    }

    public fun build(): CloudFrontWebDistribution {
        if (_errorConfigurations.isNotEmpty()) cdkBuilder.errorConfigurations(_errorConfigurations)
        if (_originConfigs.isNotEmpty()) cdkBuilder.originConfigs(_originConfigs)
        return cdkBuilder.build()
    }
}

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
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps
import software.amazon.awscdk.services.cloudfront.GeoRestriction
import software.amazon.awscdk.services.cloudfront.HttpVersion
import software.amazon.awscdk.services.cloudfront.LoggingConfiguration
import software.amazon.awscdk.services.cloudfront.PriceClass
import software.amazon.awscdk.services.cloudfront.SourceConfiguration
import software.amazon.awscdk.services.cloudfront.ViewerCertificate
import software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy

/**
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
public class CloudFrontWebDistributionPropsDsl {
    private val cdkBuilder: CloudFrontWebDistributionProps.Builder =
        CloudFrontWebDistributionProps.builder()

    private val _errorConfigurations: MutableList<CfnDistribution.CustomErrorResponseProperty> =
        mutableListOf()

    private val _originConfigs: MutableList<SourceConfiguration> = mutableListOf()

    /** @param comment A comment for this distribution in the CloudFront console. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /** @param defaultRootObject The default object to serve. */
    public fun defaultRootObject(defaultRootObject: String) {
        cdkBuilder.defaultRootObject(defaultRootObject)
    }

    /** @param enableIpV6 If your distribution should have IPv6 enabled. */
    public fun enableIpV6(enableIpV6: Boolean) {
        cdkBuilder.enableIpV6(enableIpV6)
    }

    /** @param enabled Enable or disable the distribution. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     *   PageNotFound). By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx
     *   range with custom error messages. CloudFront does not cache HTTP status codes.
     */
    public fun errorConfigurations(
        errorConfigurations: CfnDistributionCustomErrorResponsePropertyDsl.() -> Unit
    ) {
        _errorConfigurations.add(
            CfnDistributionCustomErrorResponsePropertyDsl().apply(errorConfigurations).build()
        )
    }

    /**
     * @param errorConfigurations How CloudFront should handle requests that are not successful (eg
     *   PageNotFound). By default, CloudFront does not replace HTTP status codes in the 4xx and 5xx
     *   range with custom error messages. CloudFront does not cache HTTP status codes.
     */
    public fun errorConfigurations(
        errorConfigurations: Collection<CfnDistribution.CustomErrorResponseProperty>
    ) {
        _errorConfigurations.addAll(errorConfigurations)
    }

    /** @param geoRestriction Controls the countries in which your content is distributed. */
    public fun geoRestriction(geoRestriction: GeoRestriction) {
        cdkBuilder.geoRestriction(geoRestriction)
    }

    /** @param httpVersion The max supported HTTP Versions. */
    public fun httpVersion(httpVersion: HttpVersion) {
        cdkBuilder.httpVersion(httpVersion)
    }

    /**
     * @param loggingConfig Optional - if we should enable logging. You can pass an empty object
     *   ({}) to have us auto create a bucket for logging. Omission of this property indicates no
     *   logging is to be enabled.
     */
    public fun loggingConfig(loggingConfig: LoggingConfigurationDsl.() -> Unit = {}) {
        val builder = LoggingConfigurationDsl()
        builder.apply(loggingConfig)
        cdkBuilder.loggingConfig(builder.build())
    }

    /**
     * @param loggingConfig Optional - if we should enable logging. You can pass an empty object
     *   ({}) to have us auto create a bucket for logging. Omission of this property indicates no
     *   logging is to be enabled.
     */
    public fun loggingConfig(loggingConfig: LoggingConfiguration) {
        cdkBuilder.loggingConfig(loggingConfig)
    }

    /**
     * @param originConfigs The origin configurations for this distribution. Behaviors are a part of
     *   the origin.
     */
    public fun originConfigs(originConfigs: SourceConfigurationDsl.() -> Unit) {
        _originConfigs.add(SourceConfigurationDsl().apply(originConfigs).build())
    }

    /**
     * @param originConfigs The origin configurations for this distribution. Behaviors are a part of
     *   the origin.
     */
    public fun originConfigs(originConfigs: Collection<SourceConfiguration>) {
        _originConfigs.addAll(originConfigs)
    }

    /**
     * @param priceClass The price class for the distribution (this impacts how many locations
     *   CloudFront uses for your distribution, and billing).
     */
    public fun priceClass(priceClass: PriceClass) {
        cdkBuilder.priceClass(priceClass)
    }

    /**
     * @param viewerCertificate Specifies whether you want viewers to use HTTP or HTTPS to request
     *   your objects, whether you're using an alternate domain name with HTTPS, and if so, if
     *   you're using AWS Certificate Manager (ACM) or a third-party certificate authority.
     */
    public fun viewerCertificate(viewerCertificate: ViewerCertificate) {
        cdkBuilder.viewerCertificate(viewerCertificate)
    }

    /** @param viewerProtocolPolicy The default viewer policy for incoming clients. */
    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
        cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
    }

    /**
     * @param webAclId Unique identifier that specifies the AWS WAF web ACL to associate with this
     *   CloudFront distribution. To specify a web ACL created using the latest version of AWS WAF,
     *   use the ACL ARN, for example
     *   `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     */
    public fun webAclId(webAclId: String) {
        cdkBuilder.webAclId(webAclId)
    }

    public fun build(): CloudFrontWebDistributionProps {
        if (_errorConfigurations.isNotEmpty()) cdkBuilder.errorConfigurations(_errorConfigurations)
        if (_originConfigs.isNotEmpty()) cdkBuilder.originConfigs(_originConfigs)
        return cdkBuilder.build()
    }
}

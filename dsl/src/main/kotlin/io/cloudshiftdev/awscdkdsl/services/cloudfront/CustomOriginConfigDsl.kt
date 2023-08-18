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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.CustomOriginConfig
import software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy
import software.amazon.awscdk.services.cloudfront.OriginSslPolicy

/**
 * A custom origin configuration.
 *
 * Example:
 * ```
 * Bucket sourceBucket;
 * OriginAccessIdentity oai;
 * CloudFrontWebDistribution.Builder.create(this, "MyCfWebDistribution")
 * .originConfigs(List.of(SourceConfiguration.builder()
 * .s3OriginSource(S3OriginConfig.builder()
 * .s3BucketSource(sourceBucket)
 * .originAccessIdentity(oai)
 * .build())
 * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
 * .build(), SourceConfiguration.builder()
 * .customOriginSource(CustomOriginConfig.builder()
 * .domainName("MYALIAS")
 * .build())
 * .behaviors(List.of(Behavior.builder().pathPattern("/somewhere").build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class CustomOriginConfigDsl {
    private val cdkBuilder: CustomOriginConfig.Builder = CustomOriginConfig.builder()

    private val _allowedOriginSslVersions: MutableList<OriginSslPolicy> = mutableListOf()

    /** @param allowedOriginSslVersions The SSL versions to use when interacting with the origin. */
    public fun allowedOriginSslVersions(vararg allowedOriginSslVersions: OriginSslPolicy) {
        _allowedOriginSslVersions.addAll(listOf(*allowedOriginSslVersions))
    }

    /** @param allowedOriginSslVersions The SSL versions to use when interacting with the origin. */
    public fun allowedOriginSslVersions(allowedOriginSslVersions: Collection<OriginSslPolicy>) {
        _allowedOriginSslVersions.addAll(allowedOriginSslVersions)
    }

    /**
     * @param domainName The domain name of the custom origin. Should not include the path - that
     *   should be in the parent SourceConfiguration
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param httpPort The origin HTTP port. */
    public fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
    }

    /** @param httpsPort The origin HTTPS port. */
    public fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
    }

    /** @param originHeaders Any additional headers to pass to the origin. */
    public fun originHeaders(originHeaders: Map<String, String>) {
        cdkBuilder.originHeaders(originHeaders)
    }

    /** @param originKeepaliveTimeout The keep alive timeout when making calls in seconds. */
    public fun originKeepaliveTimeout(originKeepaliveTimeout: Duration) {
        cdkBuilder.originKeepaliveTimeout(originKeepaliveTimeout)
    }

    /** @param originPath The relative path to the origin root to use for sources. */
    public fun originPath(originPath: String) {
        cdkBuilder.originPath(originPath)
    }

    /**
     * @param originProtocolPolicy The protocol (http or https) policy to use when interacting with
     *   the origin.
     */
    public fun originProtocolPolicy(originProtocolPolicy: OriginProtocolPolicy) {
        cdkBuilder.originProtocolPolicy(originProtocolPolicy)
    }

    /** @param originReadTimeout The read timeout when calling the origin in seconds. */
    public fun originReadTimeout(originReadTimeout: Duration) {
        cdkBuilder.originReadTimeout(originReadTimeout)
    }

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     *   latency to your origin, you can get better network performance.
     */
    public fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public fun build(): CustomOriginConfig {
        if (_allowedOriginSslVersions.isNotEmpty())
            cdkBuilder.allowedOriginSslVersions(_allowedOriginSslVersions)
        return cdkBuilder.build()
    }
}

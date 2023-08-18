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
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.S3OriginConfig
import software.amazon.awscdk.services.s3.IBucket

/**
 * S3 origin configuration for CloudFront.
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
public class S3OriginConfigDsl {
    private val cdkBuilder: S3OriginConfig.Builder = S3OriginConfig.builder()

    /**
     * @param originAccessIdentity The optional Origin Access Identity of the origin identity
     *   cloudfront will use when calling your s3 bucket.
     */
    public fun originAccessIdentity(originAccessIdentity: IOriginAccessIdentity) {
        cdkBuilder.originAccessIdentity(originAccessIdentity)
    }

    /** @param originHeaders Any additional headers to pass to the origin. */
    public fun originHeaders(originHeaders: Map<String, String>) {
        cdkBuilder.originHeaders(originHeaders)
    }

    /** @param originPath The relative path to the origin root to use for sources. */
    public fun originPath(originPath: String) {
        cdkBuilder.originPath(originPath)
    }

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     *   latency to your origin, you can get better network performance.
     */
    public fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
    }

    /** @param s3BucketSource The source bucket to serve content from. */
    public fun s3BucketSource(s3BucketSource: IBucket) {
        cdkBuilder.s3BucketSource(s3BucketSource)
    }

    public fun build(): S3OriginConfig = cdkBuilder.build()
}

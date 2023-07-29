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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * The S3 Intelligent-Tiering storage class is designed to optimize storage costs by automatically
 * moving data to the most cost-effective storage access tier, without additional operational
 * overhead.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * TieringProperty tieringProperty = TieringProperty.builder()
 * .accessTier("accessTier")
 * .days(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tiering.html)
 */
@CdkDslMarker
public class CfnBucketTieringPropertyDsl {
    private val cdkBuilder: CfnBucket.TieringProperty.Builder = CfnBucket.TieringProperty.builder()

    /**
     * @param accessTier S3 Intelligent-Tiering access tier. See
     *   [Storage class for automatically optimizing frequently and infrequently accessed objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access)
     *   for a list of access tiers in the S3 Intelligent-Tiering storage class.
     */
    public fun accessTier(accessTier: String) {
        cdkBuilder.accessTier(accessTier)
    }

    /**
     * @param days The number of consecutive days of no access after which an object will be
     *   eligible to be transitioned to the corresponding tier. The minimum number of days specified
     *   for Archive Access tier must be at least 90 days and Deep Archive Access tier must be at
     *   least 180 days. The maximum can be up to 2 years (730 days).
     */
    public fun days(days: Number) {
        cdkBuilder.days(days)
    }

    public fun build(): CfnBucket.TieringProperty = cdkBuilder.build()
}

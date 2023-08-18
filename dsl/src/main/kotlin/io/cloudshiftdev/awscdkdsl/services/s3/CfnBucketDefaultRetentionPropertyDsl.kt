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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * The container element for specifying the default Object Lock retention settings for new objects
 * placed in the specified bucket.
 * * The `DefaultRetention` settings require both a mode and a period.
 * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
 *   cannot specify `Days` and `Years` at the same time.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * DefaultRetentionProperty defaultRetentionProperty = DefaultRetentionProperty.builder()
 * .days(123)
 * .mode("mode")
 * .years(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
 */
@CdkDslMarker
public class CfnBucketDefaultRetentionPropertyDsl {
    private val cdkBuilder: CfnBucket.DefaultRetentionProperty.Builder =
        CfnBucket.DefaultRetentionProperty.builder()

    /**
     * @param days The number of days that you want to specify for the default retention period. If
     *   Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
     */
    public fun days(days: Number) {
        cdkBuilder.days(days)
    }

    /**
     * @param mode The default Object Lock retention mode you want to apply to new objects placed in
     *   the specified bucket. If Object Lock is turned on, you must specify `Mode` and specify
     *   either `Days` or `Years` .
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param years The number of years that you want to specify for the default retention period.
     *   If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
     */
    public fun years(years: Number) {
        cdkBuilder.years(years)
    }

    public fun build(): CfnBucket.DefaultRetentionProperty = cdkBuilder.build()
}

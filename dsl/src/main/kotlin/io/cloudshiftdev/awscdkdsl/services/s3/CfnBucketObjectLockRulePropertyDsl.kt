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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies the Object Lock rule for the specified object.
 *
 * Enable the this rule when you apply `ObjectLockConfiguration` to a bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ObjectLockRuleProperty objectLockRuleProperty = ObjectLockRuleProperty.builder()
 * .defaultRetention(DefaultRetentionProperty.builder()
 * .days(123)
 * .mode("mode")
 * .years(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
 */
@CdkDslMarker
public class CfnBucketObjectLockRulePropertyDsl {
    private val cdkBuilder: CfnBucket.ObjectLockRuleProperty.Builder =
        CfnBucket.ObjectLockRuleProperty.builder()

    /**
     * @param defaultRetention The default Object Lock retention mode and period that you want to
     *   apply to new objects placed in the specified bucket. If Object Lock is turned on, bucket
     *   settings require both `Mode` and a period of either `Days` or `Years` . You cannot specify
     *   `Days` and `Years` at the same time. For more information about allowable values for mode
     *   and period, see
     *   [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
     *   .
     */
    public fun defaultRetention(defaultRetention: IResolvable) {
        cdkBuilder.defaultRetention(defaultRetention)
    }

    /**
     * @param defaultRetention The default Object Lock retention mode and period that you want to
     *   apply to new objects placed in the specified bucket. If Object Lock is turned on, bucket
     *   settings require both `Mode` and a period of either `Days` or `Years` . You cannot specify
     *   `Days` and `Years` at the same time. For more information about allowable values for mode
     *   and period, see
     *   [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
     *   .
     */
    public fun defaultRetention(defaultRetention: CfnBucket.DefaultRetentionProperty) {
        cdkBuilder.defaultRetention(defaultRetention)
    }

    public fun build(): CfnBucket.ObjectLockRuleProperty = cdkBuilder.build()
}

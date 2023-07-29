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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Places an Object Lock configuration on the specified bucket.
 *
 * The rule specified in the Object Lock configuration will be applied by default to every new
 * object placed in the specified bucket. For more information, see
 * [Locking Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ObjectLockConfigurationProperty objectLockConfigurationProperty =
 * ObjectLockConfigurationProperty.builder()
 * .objectLockEnabled("objectLockEnabled")
 * .rule(ObjectLockRuleProperty.builder()
 * .defaultRetention(DefaultRetentionProperty.builder()
 * .days(123)
 * .mode("mode")
 * .years(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketObjectLockConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.ObjectLockConfigurationProperty.Builder =
        CfnBucket.ObjectLockConfigurationProperty.builder()

    /**
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     *   enabled. Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     */
    public fun objectLockEnabled(objectLockEnabled: String) {
        cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    /**
     * @param rule Specifies the Object Lock rule for the specified object. Enable this rule when
     *   you apply `ObjectLockConfiguration` to a bucket. If Object Lock is turned on, bucket
     *   settings require both `Mode` and a period of either `Days` or `Years` . You cannot specify
     *   `Days` and `Years` at the same time. For more information, see
     *   [ObjectLockRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
     *   and
     *   [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
     *   .
     */
    public fun rule(rule: IResolvable) {
        cdkBuilder.rule(rule)
    }

    /**
     * @param rule Specifies the Object Lock rule for the specified object. Enable this rule when
     *   you apply `ObjectLockConfiguration` to a bucket. If Object Lock is turned on, bucket
     *   settings require both `Mode` and a period of either `Days` or `Years` . You cannot specify
     *   `Days` and `Years` at the same time. For more information, see
     *   [ObjectLockRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
     *   and
     *   [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
     *   .
     */
    public fun rule(rule: CfnBucket.ObjectLockRuleProperty) {
        cdkBuilder.rule(rule)
    }

    public fun build(): CfnBucket.ObjectLockConfigurationProperty = cdkBuilder.build()
}

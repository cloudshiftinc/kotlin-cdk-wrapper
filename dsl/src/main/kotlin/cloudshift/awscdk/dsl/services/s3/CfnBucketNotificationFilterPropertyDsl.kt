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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies object key name filtering rules.
 *
 * For information about key name filtering, see
 * [Configuring event notifications using object key name filtering](https://docs.aws.amazon.com/AmazonS3/latest/userguide/notification-how-to-filtering.html)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * NotificationFilterProperty notificationFilterProperty = NotificationFilterProperty.builder()
 * .s3Key(S3KeyFilterProperty.builder()
 * .rules(List.of(FilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationfilter.html)
 */
@CdkDslMarker
public class CfnBucketNotificationFilterPropertyDsl {
    private val cdkBuilder: CfnBucket.NotificationFilterProperty.Builder =
        CfnBucket.NotificationFilterProperty.builder()

    /** @param s3Key A container for object key name prefix and suffix filtering rules. */
    public fun s3Key(s3Key: IResolvable) {
        cdkBuilder.s3Key(s3Key)
    }

    /** @param s3Key A container for object key name prefix and suffix filtering rules. */
    public fun s3Key(s3Key: CfnBucket.S3KeyFilterProperty) {
        cdkBuilder.s3Key(s3Key)
    }

    public fun build(): CfnBucket.NotificationFilterProperty = cdkBuilder.build()
}

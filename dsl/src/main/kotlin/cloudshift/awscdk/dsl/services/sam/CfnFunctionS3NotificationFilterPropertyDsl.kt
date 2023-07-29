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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * S3NotificationFilterProperty s3NotificationFilterProperty =
 * S3NotificationFilterProperty.builder()
 * .s3Key(S3KeyFilterProperty.builder()
 * .rules(List.of(S3KeyFilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3notificationfilter.html)
 */
@CdkDslMarker
public class CfnFunctionS3NotificationFilterPropertyDsl {
    private val cdkBuilder: CfnFunction.S3NotificationFilterProperty.Builder =
        CfnFunction.S3NotificationFilterProperty.builder()

    /** @param s3Key the value to be set. */
    public fun s3Key(s3Key: IResolvable) {
        cdkBuilder.s3Key(s3Key)
    }

    /** @param s3Key the value to be set. */
    public fun s3Key(s3Key: CfnFunction.S3KeyFilterProperty) {
        cdkBuilder.s3Key(s3Key)
    }

    public fun build(): CfnFunction.S3NotificationFilterProperty = cdkBuilder.build()
}

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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * S3EventProperty s3EventProperty = S3EventProperty.builder()
 * .bucket("bucket")
 * .events("events")
 * // the properties below are optional
 * .filter(S3NotificationFilterProperty.builder()
 * .s3Key(S3KeyFilterProperty.builder()
 * .rules(List.of(S3KeyFilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-s3event.html)
 */
@CdkDslMarker
public class CfnFunctionS3EventPropertyDsl {
    private val cdkBuilder: CfnFunction.S3EventProperty.Builder =
        CfnFunction.S3EventProperty.builder()

    /** @param bucket the value to be set. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param events the value to be set. */
    public fun events(events: String) {
        cdkBuilder.events(events)
    }

    /** @param filter the value to be set. */
    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    /** @param filter the value to be set. */
    public fun filter(filter: CfnFunction.S3NotificationFilterProperty) {
        cdkBuilder.filter(filter)
    }

    public fun build(): CfnFunction.S3EventProperty = cdkBuilder.build()
}

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
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * DeadLetterQueueProperty deadLetterQueueProperty = DeadLetterQueueProperty.builder()
 * .targetArn("targetArn")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-deadletterqueue.html)
 */
@CdkDslMarker
public class CfnFunctionDeadLetterQueuePropertyDsl {
    private val cdkBuilder: CfnFunction.DeadLetterQueueProperty.Builder =
        CfnFunction.DeadLetterQueueProperty.builder()

    /** @param targetArn the value to be set. */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    /** @param type the value to be set. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnFunction.DeadLetterQueueProperty = cdkBuilder.build()
}

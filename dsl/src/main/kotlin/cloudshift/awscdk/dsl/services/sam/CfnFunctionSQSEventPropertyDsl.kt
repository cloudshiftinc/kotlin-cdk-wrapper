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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * SQSEventProperty sQSEventProperty = SQSEventProperty.builder()
 * .queue("queue")
 * // the properties below are optional
 * .batchSize(123)
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-sqsevent.html)
 */
@CdkDslMarker
public class CfnFunctionSQSEventPropertyDsl {
    private val cdkBuilder: CfnFunction.SQSEventProperty.Builder =
        CfnFunction.SQSEventProperty.builder()

    /** @param batchSize the value to be set. */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /** @param enabled the value to be set. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled the value to be set. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param queue the value to be set. */
    public fun queue(queue: String) {
        cdkBuilder.queue(queue)
    }

    public fun build(): CfnFunction.SQSEventProperty = cdkBuilder.build()
}

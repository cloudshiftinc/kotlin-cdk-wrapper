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
 * SNSEventProperty sNSEventProperty = SNSEventProperty.builder()
 * .topic("topic")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-snsevent.html)
 */
@CdkDslMarker
public class CfnFunctionSNSEventPropertyDsl {
    private val cdkBuilder: CfnFunction.SNSEventProperty.Builder =
        CfnFunction.SNSEventProperty.builder()

    /** @param topic the value to be set. */
    public fun topic(topic: String) {
        cdkBuilder.topic(topic)
    }

    public fun build(): CfnFunction.SNSEventProperty = cdkBuilder.build()
}

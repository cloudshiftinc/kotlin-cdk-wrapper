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
 * LogGroupSAMPTProperty logGroupSAMPTProperty = LogGroupSAMPTProperty.builder()
 * .logGroupName("logGroupName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-loggroupsampt.html)
 */
@CdkDslMarker
public class CfnFunctionLogGroupSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.LogGroupSAMPTProperty.Builder =
        CfnFunction.LogGroupSAMPTProperty.builder()

    /** @param logGroupName the value to be set. */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun build(): CfnFunction.LogGroupSAMPTProperty = cdkBuilder.build()
}

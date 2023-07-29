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
 * CloudWatchLogsEventProperty cloudWatchLogsEventProperty = CloudWatchLogsEventProperty.builder()
 * .filterPattern("filterPattern")
 * .logGroupName("logGroupName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-cloudwatchlogsevent.html)
 */
@CdkDslMarker
public class CfnFunctionCloudWatchLogsEventPropertyDsl {
    private val cdkBuilder: CfnFunction.CloudWatchLogsEventProperty.Builder =
        CfnFunction.CloudWatchLogsEventProperty.builder()

    /** @param filterPattern the value to be set. */
    public fun filterPattern(filterPattern: String) {
        cdkBuilder.filterPattern(filterPattern)
    }

    /** @param logGroupName the value to be set. */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun build(): CfnFunction.CloudWatchLogsEventProperty = cdkBuilder.build()
}

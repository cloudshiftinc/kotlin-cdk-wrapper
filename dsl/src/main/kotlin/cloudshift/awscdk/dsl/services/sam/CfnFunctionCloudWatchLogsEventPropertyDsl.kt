@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionCloudWatchLogsEventPropertyDsl {
    private val cdkBuilder: CfnFunction.CloudWatchLogsEventProperty.Builder =
        CfnFunction.CloudWatchLogsEventProperty.builder()

    public fun filterPattern(filterPattern: String) {
        cdkBuilder.filterPattern(filterPattern)
    }

    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun build(): CfnFunction.CloudWatchLogsEventProperty = cdkBuilder.build()
}

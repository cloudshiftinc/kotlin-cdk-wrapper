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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.stepfunctions.LogLevel
import software.amazon.awscdk.services.stepfunctions.LogOptions
import kotlin.Boolean

@CdkDslMarker
public class LogOptionsDsl {
    private val cdkBuilder: LogOptions.Builder = LogOptions.builder()

    public fun destination(destination: ILogGroup) {
        cdkBuilder.destination(destination)
    }

    public fun includeExecutionData(includeExecutionData: Boolean) {
        cdkBuilder.includeExecutionData(includeExecutionData)
    }

    public fun level(level: LogLevel) {
        cdkBuilder.level(level)
    }

    public fun build(): LogOptions = cdkBuilder.build()
}

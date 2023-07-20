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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.LogStreamProps
import kotlin.String

@CdkDslMarker
public class LogStreamPropsDsl {
    private val cdkBuilder: LogStreamProps.Builder = LogStreamProps.builder()

    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun logStreamName(logStreamName: String) {
        cdkBuilder.logStreamName(logStreamName)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): LogStreamProps = cdkBuilder.build()
}

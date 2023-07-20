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
import software.amazon.awscdk.services.logs.CfnLogStreamProps
import kotlin.String

@CdkDslMarker
public class CfnLogStreamPropsDsl {
    private val cdkBuilder: CfnLogStreamProps.Builder = CfnLogStreamProps.builder()

    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun logStreamName(logStreamName: String) {
        cdkBuilder.logStreamName(logStreamName)
    }

    public fun build(): CfnLogStreamProps = cdkBuilder.build()
}

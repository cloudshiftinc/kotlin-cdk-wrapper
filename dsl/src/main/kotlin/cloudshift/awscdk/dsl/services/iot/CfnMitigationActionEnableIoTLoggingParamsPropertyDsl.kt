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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnMitigationAction
import kotlin.String

@CdkDslMarker
public class CfnMitigationActionEnableIoTLoggingParamsPropertyDsl {
    private val cdkBuilder: CfnMitigationAction.EnableIoTLoggingParamsProperty.Builder =
        CfnMitigationAction.EnableIoTLoggingParamsProperty.builder()

    public fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
    }

    public fun roleArnForLogging(roleArnForLogging: String) {
        cdkBuilder.roleArnForLogging(roleArnForLogging)
    }

    public fun build(): CfnMitigationAction.EnableIoTLoggingParamsProperty = cdkBuilder.build()
}

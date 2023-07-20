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
import software.amazon.awscdk.services.iot.CfnResourceSpecificLoggingProps
import kotlin.String

@CdkDslMarker
public class CfnResourceSpecificLoggingPropsDsl {
    private val cdkBuilder: CfnResourceSpecificLoggingProps.Builder =
        CfnResourceSpecificLoggingProps.builder()

    public fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
    }

    public fun targetName(targetName: String) {
        cdkBuilder.targetName(targetName)
    }

    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): CfnResourceSpecificLoggingProps = cdkBuilder.build()
}

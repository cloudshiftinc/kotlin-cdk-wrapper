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
import software.amazon.awscdk.services.iot.CfnResourceSpecificLogging
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnResourceSpecificLoggingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourceSpecificLogging.Builder =
        CfnResourceSpecificLogging.Builder.create(scope, id)

    public fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
    }

    public fun targetName(targetName: String) {
        cdkBuilder.targetName(targetName)
    }

    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): CfnResourceSpecificLogging = cdkBuilder.build()
}

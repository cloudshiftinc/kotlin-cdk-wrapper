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

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSimulationApplicationVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSimulationApplicationVersion.Builder =
        CfnSimulationApplicationVersion.Builder.create(scope, id)

    public fun application(application: String) {
        cdkBuilder.application(application)
    }

    public fun currentRevisionId(currentRevisionId: String) {
        cdkBuilder.currentRevisionId(currentRevisionId)
    }

    public fun build(): CfnSimulationApplicationVersion = cdkBuilder.build()
}

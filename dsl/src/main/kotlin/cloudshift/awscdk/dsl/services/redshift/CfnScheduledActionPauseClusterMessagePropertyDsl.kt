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

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.redshift.CfnScheduledAction
import kotlin.String

@CdkDslMarker
public class CfnScheduledActionPauseClusterMessagePropertyDsl {
    private val cdkBuilder: CfnScheduledAction.PauseClusterMessageProperty.Builder =
        CfnScheduledAction.PauseClusterMessageProperty.builder()

    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    public fun build(): CfnScheduledAction.PauseClusterMessageProperty = cdkBuilder.build()
}

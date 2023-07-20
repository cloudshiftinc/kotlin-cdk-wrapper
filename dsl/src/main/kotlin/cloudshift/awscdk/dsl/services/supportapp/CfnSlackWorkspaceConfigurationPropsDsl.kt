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

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps
import kotlin.String

@CdkDslMarker
public class CfnSlackWorkspaceConfigurationPropsDsl {
    private val cdkBuilder: CfnSlackWorkspaceConfigurationProps.Builder =
        CfnSlackWorkspaceConfigurationProps.builder()

    public fun teamId(teamId: String) {
        cdkBuilder.teamId(teamId)
    }

    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnSlackWorkspaceConfigurationProps = cdkBuilder.build()
}

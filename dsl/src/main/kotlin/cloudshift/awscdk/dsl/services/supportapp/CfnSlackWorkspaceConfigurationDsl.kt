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
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSlackWorkspaceConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSlackWorkspaceConfiguration.Builder =
        CfnSlackWorkspaceConfiguration.Builder.create(scope, id)

    public fun teamId(teamId: String) {
        cdkBuilder.teamId(teamId)
    }

    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnSlackWorkspaceConfiguration = cdkBuilder.build()
}

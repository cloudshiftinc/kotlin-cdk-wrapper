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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnConnectorProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConnectorProfile.Builder = CfnConnectorProfile.Builder.create(
        scope,
        id,
    )

    public fun connectionMode(connectionMode: String) {
        cdkBuilder.connectionMode(connectionMode)
    }

    public fun connectorLabel(connectorLabel: String) {
        cdkBuilder.connectorLabel(connectorLabel)
    }

    public fun connectorProfileConfig(connectorProfileConfig: IResolvable) {
        cdkBuilder.connectorProfileConfig(connectorProfileConfig)
    }

    public fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty) {
        cdkBuilder.connectorProfileConfig(connectorProfileConfig)
    }

    public fun connectorProfileName(connectorProfileName: String) {
        cdkBuilder.connectorProfileName(connectorProfileName)
    }

    public fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
    }

    public fun kmsArn(kmsArn: String) {
        cdkBuilder.kmsArn(kmsArn)
    }

    public fun build(): CfnConnectorProfile = cdkBuilder.build()
}

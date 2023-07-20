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
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.String

@CdkDslMarker
public class CfnFlowDestinationFlowConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.DestinationFlowConfigProperty.Builder =
        CfnFlow.DestinationFlowConfigProperty.builder()

    public fun apiVersion(apiVersion: String) {
        cdkBuilder.apiVersion(apiVersion)
    }

    public fun connectorProfileName(connectorProfileName: String) {
        cdkBuilder.connectorProfileName(connectorProfileName)
    }

    public fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
    }

    public fun destinationConnectorProperties(destinationConnectorProperties: IResolvable) {
        cdkBuilder.destinationConnectorProperties(destinationConnectorProperties)
    }

    public fun destinationConnectorProperties(destinationConnectorProperties: CfnFlow.DestinationConnectorPropertiesProperty) {
        cdkBuilder.destinationConnectorProperties(destinationConnectorProperties)
    }

    public fun build(): CfnFlow.DestinationFlowConfigProperty = cdkBuilder.build()
}

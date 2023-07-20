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
public class CfnFlowSourceFlowConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.SourceFlowConfigProperty.Builder =
        CfnFlow.SourceFlowConfigProperty.builder()

    public fun apiVersion(apiVersion: String) {
        cdkBuilder.apiVersion(apiVersion)
    }

    public fun connectorProfileName(connectorProfileName: String) {
        cdkBuilder.connectorProfileName(connectorProfileName)
    }

    public fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
    }

    public fun incrementalPullConfig(incrementalPullConfig: IResolvable) {
        cdkBuilder.incrementalPullConfig(incrementalPullConfig)
    }

    public fun incrementalPullConfig(incrementalPullConfig: CfnFlow.IncrementalPullConfigProperty) {
        cdkBuilder.incrementalPullConfig(incrementalPullConfig)
    }

    public fun sourceConnectorProperties(sourceConnectorProperties: IResolvable) {
        cdkBuilder.sourceConnectorProperties(sourceConnectorProperties)
    }

    public fun sourceConnectorProperties(sourceConnectorProperties: CfnFlow.SourceConnectorPropertiesProperty) {
        cdkBuilder.sourceConnectorProperties(sourceConnectorProperties)
    }

    public fun build(): CfnFlow.SourceFlowConfigProperty = cdkBuilder.build()
}

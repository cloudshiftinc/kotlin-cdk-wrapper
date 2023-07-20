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

import software.amazon.awscdk.services.appflow.CfnConnector
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.Unit

public inline fun CfnConnector.setConnectorProvisioningConfig(
    block: CfnConnectorConnectorProvisioningConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnConnectorConnectorProvisioningConfigPropertyDsl()
    builder.apply(block)
    return setConnectorProvisioningConfig(builder.build())
}

public inline fun CfnFlow.setSourceFlowConfig(
    block: CfnFlowSourceFlowConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFlowSourceFlowConfigPropertyDsl()
    builder.apply(block)
    return setSourceFlowConfig(builder.build())
}

public inline fun CfnFlow.setTriggerConfig(block: CfnFlowTriggerConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnFlowTriggerConfigPropertyDsl()
    builder.apply(block)
    return setTriggerConfig(builder.build())
}

public inline fun CfnFlow.setMetadataCatalogConfig(
    block: CfnFlowMetadataCatalogConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFlowMetadataCatalogConfigPropertyDsl()
    builder.apply(block)
    return setMetadataCatalogConfig(builder.build())
}

public inline fun CfnConnectorProfile.setConnectorProfileConfig(
    block: CfnConnectorProfileConnectorProfileConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnConnectorProfileConnectorProfileConfigPropertyDsl()
    builder.apply(block)
    return setConnectorProfileConfig(builder.build())
}

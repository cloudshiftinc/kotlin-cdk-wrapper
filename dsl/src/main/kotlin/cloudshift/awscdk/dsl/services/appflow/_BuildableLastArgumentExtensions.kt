@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnector
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The configuration required for registering the connector.
 */
public inline
    fun CfnConnector.setConnectorProvisioningConfig(block: CfnConnectorConnectorProvisioningConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectorConnectorProvisioningConfigPropertyDsl()
  builder.apply(block)
  return setConnectorProvisioningConfig(builder.build())
}

/**
 * Contains information about the configuration of the source connector used in the flow.
 */
public inline fun CfnFlow.setSourceFlowConfig(block: CfnFlowSourceFlowConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFlowSourceFlowConfigPropertyDsl()
  builder.apply(block)
  return setSourceFlowConfig(builder.build())
}

/**
 * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
 */
public inline fun CfnFlow.setTriggerConfig(block: CfnFlowTriggerConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnFlowTriggerConfigPropertyDsl()
  builder.apply(block)
  return setTriggerConfig(builder.build())
}

/**
 * Configurations of metadata catalog of the flow.
 */
public inline
    fun CfnFlow.setMetadataCatalogConfig(block: CfnFlowMetadataCatalogConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFlowMetadataCatalogConfigPropertyDsl()
  builder.apply(block)
  return setMetadataCatalogConfig(builder.build())
}

/**
 * Defines the connector-specific configuration and credentials.
 */
public inline
    fun CfnConnectorProfile.setConnectorProfileConfig(block: CfnConnectorProfileConnectorProfileConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectorProfileConnectorProfileConfigPropertyDsl()
  builder.apply(block)
  return setConnectorProfileConfig(builder.build())
}

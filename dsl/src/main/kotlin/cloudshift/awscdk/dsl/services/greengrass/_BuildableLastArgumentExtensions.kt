@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnGroup
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition

/**
 * The subscription definition version to include when the subscription definition is created.
 */
public inline
    fun CfnSubscriptionDefinition.setInitialVersion(block: CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

/**
 * The core definition version to include when the core definition is created.
 */
public inline
    fun CfnCoreDefinition.setInitialVersion(block: CfnCoreDefinitionCoreDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCoreDefinitionCoreDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

/**
 * The function definition version to include when the function definition is created.
 */
public inline
    fun CfnFunctionDefinition.setInitialVersion(block: CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

/**
 * The connector definition version to include when the connector definition is created.
 */
public inline
    fun CfnConnectorDefinition.setInitialVersion(block: CfnConnectorDefinitionConnectorDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectorDefinitionConnectorDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

/**
 * The group version to include when the group is created.
 */
public inline fun CfnGroup.setInitialVersion(block: CfnGroupGroupVersionPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnGroupGroupVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

/**
 * The device definition version to include when the device definition is created.
 */
public inline
    fun CfnDeviceDefinition.setInitialVersion(block: CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

/**
 * The default configuration that applies to all Lambda functions in the group.
 */
public inline
    fun CfnFunctionDefinitionVersion.setDefaultConfig(block: CfnFunctionDefinitionVersionDefaultConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionDefinitionVersionDefaultConfigPropertyDsl()
  builder.apply(block)
  return setDefaultConfig(builder.build())
}

/**
 * The resource definition version to include when the resource definition is created.
 */
public inline
    fun CfnResourceDefinition.setInitialVersion(block: CfnResourceDefinitionResourceDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceDefinitionResourceDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

/**
 * The logger definition version to include when the logger definition is created.
 */
public inline
    fun CfnLoggerDefinition.setInitialVersion(block: CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

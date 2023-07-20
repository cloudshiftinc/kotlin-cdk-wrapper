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

public inline
    fun CfnResourceDefinition.setInitialVersion(block: CfnResourceDefinitionResourceDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceDefinitionResourceDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline
    fun CfnDeviceDefinition.setInitialVersion(block: CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline
    fun CfnConnectorDefinition.setInitialVersion(block: CfnConnectorDefinitionConnectorDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectorDefinitionConnectorDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline
    fun CfnFunctionDefinition.setInitialVersion(block: CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline fun CfnGroup.setInitialVersion(block: CfnGroupGroupVersionPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnGroupGroupVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline
    fun CfnLoggerDefinition.setInitialVersion(block: CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline
    fun CfnCoreDefinition.setInitialVersion(block: CfnCoreDefinitionCoreDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCoreDefinitionCoreDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline
    fun CfnSubscriptionDefinition.setInitialVersion(block: CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline
    fun CfnFunctionDefinitionVersion.setDefaultConfig(block: CfnFunctionDefinitionVersionDefaultConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionDefinitionVersionDefaultConfigPropertyDsl()
  builder.apply(block)
  return setDefaultConfig(builder.build())
}

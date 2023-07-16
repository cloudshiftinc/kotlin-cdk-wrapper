@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnGroup
import software.amazon.awscdk.services.greengrass.CfnGroupVersion
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion

public inline fun CfnConnectorDefinition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnConnectorDefinition.setInitialVersion(block: CfnConnectorDefinitionConnectorDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConnectorDefinitionConnectorDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline fun CfnConnectorDefinitionVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCoreDefinition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnCoreDefinition.setInitialVersion(block: CfnCoreDefinitionCoreDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCoreDefinitionCoreDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline fun CfnCoreDefinitionVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDeviceDefinition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDeviceDefinition.setInitialVersion(block: CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline fun CfnDeviceDefinitionVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnFunctionDefinition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnFunctionDefinition.setInitialVersion(block: CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline fun CfnFunctionDefinitionVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnFunctionDefinitionVersion.setDefaultConfig(block: CfnFunctionDefinitionVersionDefaultConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionDefinitionVersionDefaultConfigPropertyDsl()
  builder.apply(block)
  return setDefaultConfig(builder.build())
}

public inline fun CfnGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnGroup.setInitialVersion(block: CfnGroupGroupVersionPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnGroupGroupVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline fun CfnGroupVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnLoggerDefinition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnLoggerDefinition.setInitialVersion(block: CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline fun CfnLoggerDefinitionVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResourceDefinition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnResourceDefinition.setInitialVersion(block: CfnResourceDefinitionResourceDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceDefinitionResourceDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline fun CfnResourceDefinitionVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSubscriptionDefinition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnSubscriptionDefinition.setInitialVersion(block: CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl()
  builder.apply(block)
  return setInitialVersion(builder.build())
}

public inline fun CfnSubscriptionDefinitionVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.cloudformation.CfnCustomResource
import software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig
import software.amazon.awscdk.services.cloudformation.CfnHookVersion
import software.amazon.awscdk.services.cloudformation.CfnMacro
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnModuleVersion
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersion
import software.amazon.awscdk.services.cloudformation.CfnPublisher
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceVersion
import software.amazon.awscdk.services.cloudformation.CfnStack
import software.amazon.awscdk.services.cloudformation.CfnStackSet
import software.amazon.awscdk.services.cloudformation.CfnTypeActivation
import software.amazon.awscdk.services.cloudformation.CfnWaitCondition
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandle

public inline fun CfnCustomResource.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnHookDefaultVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnHookTypeConfig.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnHookVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnHookVersion.setLoggingConfig(block: CfnHookVersionLoggingConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnHookVersionLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
}

public inline fun CfnMacro.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnModuleDefaultVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnModuleVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPublicTypeVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPublisher.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResourceDefaultVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResourceVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnResourceVersion.setLoggingConfig(block: CfnResourceVersionLoggingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceVersionLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
}

public inline fun CfnStack.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnStackSet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnStackSet.setAutoDeployment(block: CfnStackSetAutoDeploymentPropertyDsl.() -> Unit = {}) {
  val builder = CfnStackSetAutoDeploymentPropertyDsl()
  builder.apply(block)
  return setAutoDeployment(builder.build())
}

public inline
    fun CfnStackSet.setOperationPreferences(block: CfnStackSetOperationPreferencesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStackSetOperationPreferencesPropertyDsl()
  builder.apply(block)
  return setOperationPreferences(builder.build())
}

public inline fun CfnTypeActivation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnTypeActivation.setLoggingConfig(block: CfnTypeActivationLoggingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTypeActivationLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
}

public inline fun CfnWaitCondition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnWaitConditionHandle.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

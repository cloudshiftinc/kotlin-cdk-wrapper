@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnHookVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceVersion
import software.amazon.awscdk.services.cloudformation.CfnStackSet
import software.amazon.awscdk.services.cloudformation.CfnTypeActivation

public inline
    fun CfnResourceVersion.setLoggingConfig(block: CfnResourceVersionLoggingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceVersionLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
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

public inline
    fun CfnTypeActivation.setLoggingConfig(block: CfnTypeActivationLoggingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTypeActivationLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
}

public inline
    fun CfnHookVersion.setLoggingConfig(block: CfnHookVersionLoggingConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnHookVersionLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment

public inline fun CfnApplication.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnApplication.setResourceLifecycleConfig(block: CfnApplicationApplicationResourceLifecycleConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationApplicationResourceLifecycleConfigPropertyDsl()
  builder.apply(block)
  return setResourceLifecycleConfig(builder.build())
}

public inline fun CfnApplicationVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnApplicationVersion.setSourceBundle(block: CfnApplicationVersionSourceBundlePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationVersionSourceBundlePropertyDsl()
  builder.apply(block)
  return setSourceBundle(builder.build())
}

public inline fun CfnConfigurationTemplate.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnConfigurationTemplate.setSourceConfiguration(block: CfnConfigurationTemplateSourceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationTemplateSourceConfigurationPropertyDsl()
  builder.apply(block)
  return setSourceConfiguration(builder.build())
}

public inline fun CfnEnvironment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEnvironment.setTier(block: CfnEnvironmentTierPropertyDsl.() -> Unit = {}) {
  val builder = CfnEnvironmentTierPropertyDsl()
  builder.apply(block)
  return setTier(builder.build())
}

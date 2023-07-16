@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling.hooktargets

import cloudshift.awscdk.dsl.services.autoscaling.BindHookTargetOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig
import software.amazon.awscdk.services.autoscaling.hooktargets.FunctionHook
import software.amazon.awscdk.services.autoscaling.hooktargets.QueueHook
import software.amazon.awscdk.services.autoscaling.hooktargets.TopicHook
import software.constructs.Construct

public inline fun FunctionHook.bind(arg0: Construct, block: BindHookTargetOptionsDsl.() -> Unit =
    {}): LifecycleHookTargetConfig {
  val builder = BindHookTargetOptionsDsl()
  builder.apply(block)
  return bind(arg0,builder.build())
}

public inline fun QueueHook.bind(arg0: Construct, block: BindHookTargetOptionsDsl.() -> Unit = {}):
    LifecycleHookTargetConfig {
  val builder = BindHookTargetOptionsDsl()
  builder.apply(block)
  return bind(arg0,builder.build())
}

public inline fun TopicHook.bind(arg0: Construct, block: BindHookTargetOptionsDsl.() -> Unit = {}):
    LifecycleHookTargetConfig {
  val builder = BindHookTargetOptionsDsl()
  builder.apply(block)
  return bind(arg0,builder.build())
}

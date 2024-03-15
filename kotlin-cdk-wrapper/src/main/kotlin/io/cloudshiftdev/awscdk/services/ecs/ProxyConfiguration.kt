@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct

public abstract class ProxyConfiguration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct, arg1: TaskDefinition):
      CfnTaskDefinition.ProxyConfigurationProperty = unwrap(this).bind(arg0.let(Construct::unwrap),
      arg1.let(TaskDefinition::unwrap)).let(CfnTaskDefinition.ProxyConfigurationProperty::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration,
  ) : ProxyConfiguration(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration):
        ProxyConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProxyConfiguration):
        software.amazon.awscdk.services.ecs.ProxyConfiguration = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.ProxyConfiguration
  }
}

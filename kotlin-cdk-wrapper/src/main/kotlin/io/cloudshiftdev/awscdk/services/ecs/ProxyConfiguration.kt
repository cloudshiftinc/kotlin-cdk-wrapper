@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct

/**
 * The base class for proxy configurations.
 */
public abstract class ProxyConfiguration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration,
) : CdkObject(cdkObject) {
  /**
   * Called when the proxy configuration is configured on a task definition.
   *
   * @param _scope 
   * @param _taskDefinition 
   */
  public open fun bind(_scope: Construct, _taskDefinition: TaskDefinition):
      CfnTaskDefinition.ProxyConfigurationProperty =
      unwrap(this).bind(_scope.let(Construct::unwrap),
      _taskDefinition.let(TaskDefinition::unwrap)).let(CfnTaskDefinition.ProxyConfigurationProperty::wrap)

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

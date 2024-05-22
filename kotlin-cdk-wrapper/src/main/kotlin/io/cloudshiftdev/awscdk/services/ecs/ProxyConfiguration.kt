@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct

/**
 * The base class for proxy configurations.
 */
public abstract class ProxyConfiguration(
  cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration,
) : CdkObject(cdkObject) {
  /**
   * Called when the proxy configuration is configured on a task definition.
   *
   * @param _scope 
   * @param _taskDefinition 
   */
  public open fun bind(scope: Construct, taskDefinition: TaskDefinition):
      CfnTaskDefinition.ProxyConfigurationProperty =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      taskDefinition.let(TaskDefinition.Companion::unwrap)).let(CfnTaskDefinition.ProxyConfigurationProperty::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration,
  ) : ProxyConfiguration(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration):
        ProxyConfiguration = CdkObjectWrappers.wrap(cdkObject) as? ProxyConfiguration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProxyConfiguration):
        software.amazon.awscdk.services.ecs.ProxyConfiguration = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.ProxyConfiguration
  }
}

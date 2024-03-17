@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public abstract class InstanceBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.servicediscovery.InstanceBase,
) : Resource(cdkObject), IInstance {
  /**
   * The Id of the instance.
   */
  public override fun instanceId(): String = unwrap(this).getInstanceId()

  /**
   * The Cloudmap service to which the instance is registered.
   */
  public override fun service(): IService = unwrap(this).getService().let(IService::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.InstanceBase,
  ) : InstanceBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.InstanceBase):
        InstanceBase = CdkObjectWrappers.wrap(cdkObject) as? InstanceBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceBase):
        software.amazon.awscdk.services.servicediscovery.InstanceBase = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.InstanceBase
  }
}

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Resource
import kotlin.String

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
        InstanceBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceBase):
        software.amazon.awscdk.services.servicediscovery.InstanceBase = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.InstanceBase
  }
}
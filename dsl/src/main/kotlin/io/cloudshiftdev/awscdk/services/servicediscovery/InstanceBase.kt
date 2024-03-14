package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.Resource
import kotlin.String

public abstract class InstanceBase
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.servicediscovery.InstanceBase,
) : Resource(cdkObject), IInstance {
    /** The Id of the instance. */
    public override fun instanceId(): String = unwrap(this).getInstanceId()

    /** The Cloudmap service to which the instance is registered. */
    public override fun service(): IService = unwrap(this).getService().let(IService::wrap)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.servicediscovery.InstanceBase,
    ) : InstanceBase(cdkObject)

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicediscovery.InstanceBase
        ): InstanceBase = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: InstanceBase
        ): software.amazon.awscdk.services.servicediscovery.InstanceBase =
            (wrapped as Wrapper).cdkObject
    }
}

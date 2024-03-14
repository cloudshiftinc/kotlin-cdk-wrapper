package io.cloudshiftdev.awscdk.services.servicediscovery

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface NonIpInstanceBaseProps : BaseInstanceProps {
  public interface Builder {
    public fun customAttributes(customAttributes: Map<String, String>)

    public fun instanceId(instanceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps.Builder =
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps.builder()

    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps,
  ) : NonIpInstanceBaseProps {
    override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
        emptyMap()

    override fun instanceId(): String? = unwrap(this).getInstanceId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NonIpInstanceBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps):
        NonIpInstanceBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NonIpInstanceBaseProps):
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps = (wrapped as
        Wrapper).cdkObject
  }
}

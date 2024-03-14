package io.cloudshiftdev.awscdk.services.servicediscovery

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface BaseInstanceProps {
  public fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
      emptyMap()

  public fun instanceId(): String? = unwrap(this).getInstanceId()

  public interface Builder {
    public fun customAttributes(customAttributes: Map<String, String>)

    public fun instanceId(instanceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.BaseInstanceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.BaseInstanceProps.builder()

    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.BaseInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicediscovery.BaseInstanceProps,
  ) : BaseInstanceProps {
    override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
        emptyMap()

    override fun instanceId(): String? = unwrap(this).getInstanceId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.BaseInstanceProps):
        BaseInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseInstanceProps):
        software.amazon.awscdk.services.servicediscovery.BaseInstanceProps = (wrapped as
        Wrapper).cdkObject
  }
}

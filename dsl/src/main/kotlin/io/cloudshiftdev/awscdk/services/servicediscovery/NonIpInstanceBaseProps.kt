package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface NonIpInstanceBaseProps : BaseInstanceProps {
  /**
   * A builder for [NonIpInstanceBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customAttributes Custom attributes of the instance.
     */
    public fun customAttributes(customAttributes: Map<String, String>)

    /**
     * @param instanceId The id of the instance resource.
     */
    public fun instanceId(instanceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps.Builder =
        software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps.builder()

    /**
     * @param customAttributes Custom attributes of the instance.
     */
    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    /**
     * @param instanceId The id of the instance resource.
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps,
  ) : NonIpInstanceBaseProps {
    /**
     * Custom attributes of the instance.
     *
     * Default: none
     */
    override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
        emptyMap()

    /**
     * The id of the instance resource.
     *
     * Default: Automatically generated name
     */
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

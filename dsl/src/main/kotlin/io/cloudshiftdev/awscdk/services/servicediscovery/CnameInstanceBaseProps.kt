package io.cloudshiftdev.awscdk.services.servicediscovery

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CnameInstanceBaseProps : BaseInstanceProps {
  public fun instanceCname(): String

  public interface Builder {
    public fun customAttributes(customAttributes: Map<String, String>) {
    }

    public fun instanceCname(instanceCname: String) {
    }

    public fun instanceId(instanceId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps.Builder =
        software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps.builder()

    public override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    public override fun instanceCname(instanceCname: String) {
      cdkBuilder.instanceCname(instanceCname)
    }

    public override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps,
  ) : CnameInstanceBaseProps {
    public override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes()
        ?: emptyMap()

    public override fun instanceCname(): String = unwrap(this).getInstanceCname()

    public override fun instanceId(): String? = unwrap(this).getInstanceId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CnameInstanceBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps):
        CnameInstanceBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CnameInstanceBaseProps):
        software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps = (wrapped as
        Wrapper).cdkObject
  }
}

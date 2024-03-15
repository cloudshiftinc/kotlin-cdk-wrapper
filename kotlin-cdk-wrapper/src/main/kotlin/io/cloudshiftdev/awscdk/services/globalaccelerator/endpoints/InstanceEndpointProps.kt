@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface InstanceEndpointProps {
  public fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

  public fun weight(): Number? = unwrap(this).getWeight()

  @CdkDslMarker
  public interface Builder {
    public fun preserveClientIp(preserveClientIp: Boolean)

    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps.builder()

    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build():
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps,
  ) : CdkObject(cdkObject), InstanceEndpointProps {
    override fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps):
        InstanceEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceEndpointProps):
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps
  }
}
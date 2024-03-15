@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface RawEndpointProps {
  public fun endpointId(): String

  public fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

  public fun region(): String? = unwrap(this).getRegion()

  public fun weight(): Number? = unwrap(this).getWeight()

  @CdkDslMarker
  public interface Builder {
    public fun endpointId(endpointId: String)

    public fun preserveClientIp(preserveClientIp: Boolean)

    public fun region(region: String)

    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.RawEndpointProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.RawEndpointProps.builder()

    override fun endpointId(endpointId: String) {
      cdkBuilder.endpointId(endpointId)
    }

    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.RawEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.RawEndpointProps,
  ) : CdkObject(cdkObject), RawEndpointProps {
    override fun endpointId(): String = unwrap(this).getEndpointId()

    override fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

    override fun region(): String? = unwrap(this).getRegion()

    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RawEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.RawEndpointProps):
        RawEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RawEndpointProps):
        software.amazon.awscdk.services.globalaccelerator.RawEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.RawEndpointProps
  }
}

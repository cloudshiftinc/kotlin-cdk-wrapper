@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class RawEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.globalaccelerator.RawEndpoint,
) : CdkObject(cdkObject), IEndpoint {
  public override fun region(): String? = unwrap(this).getRegion()

  public override fun renderEndpointConfiguration(): Any =
      unwrap(this).renderEndpointConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun endpointId(endpointId: String)

    public fun preserveClientIp(preserveClientIp: Boolean)

    public fun region(region: String)

    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.RawEndpoint.Builder =
        software.amazon.awscdk.services.globalaccelerator.RawEndpoint.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.globalaccelerator.RawEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RawEndpoint {
      val builderImpl = BuilderImpl()
      return RawEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.RawEndpoint):
        RawEndpoint = RawEndpoint(cdkObject)

    internal fun unwrap(wrapped: RawEndpoint):
        software.amazon.awscdk.services.globalaccelerator.RawEndpoint = wrapped.cdkObject
  }
}

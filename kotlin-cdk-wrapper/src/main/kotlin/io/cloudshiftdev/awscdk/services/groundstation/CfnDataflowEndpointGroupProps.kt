@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.groundstation

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface CfnDataflowEndpointGroupProps {
  public fun contactPostPassDurationSeconds(): Number? =
      unwrap(this).getContactPostPassDurationSeconds()

  public fun contactPrePassDurationSeconds(): Number? =
      unwrap(this).getContactPrePassDurationSeconds()

  public fun endpointDetails(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number)

    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number)

    public fun endpointDetails(endpointDetails: IResolvable)

    public fun endpointDetails(endpointDetails: List<Any>)

    public fun endpointDetails(vararg endpointDetails: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps.Builder =
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps.builder()

    override fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
      cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    override fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
      cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    override fun endpointDetails(endpointDetails: IResolvable) {
      cdkBuilder.endpointDetails(endpointDetails.let(IResolvable::unwrap))
    }

    override fun endpointDetails(endpointDetails: List<Any>) {
      cdkBuilder.endpointDetails(endpointDetails)
    }

    override fun endpointDetails(vararg endpointDetails: Any): Unit =
        endpointDetails(endpointDetails.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps,
  ) : CdkObject(cdkObject), CfnDataflowEndpointGroupProps {
    override fun contactPostPassDurationSeconds(): Number? =
        unwrap(this).getContactPostPassDurationSeconds()

    override fun contactPrePassDurationSeconds(): Number? =
        unwrap(this).getContactPrePassDurationSeconds()

    override fun endpointDetails(): Any = unwrap(this).getEndpointDetails()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataflowEndpointGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps):
        CfnDataflowEndpointGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataflowEndpointGroupProps):
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps
  }
}

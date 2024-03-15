@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDeliveryDestinationProps {
  public fun deliveryDestinationPolicy(): Any? = unwrap(this).getDeliveryDestinationPolicy()

  public fun destinationResourceArn(): String? = unwrap(this).getDestinationResourceArn()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun deliveryDestinationPolicy(deliveryDestinationPolicy: Any)

    public fun destinationResourceArn(destinationResourceArn: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps.Builder
        = software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps.builder()

    override fun deliveryDestinationPolicy(deliveryDestinationPolicy: Any) {
      cdkBuilder.deliveryDestinationPolicy(deliveryDestinationPolicy)
    }

    override fun destinationResourceArn(destinationResourceArn: String) {
      cdkBuilder.destinationResourceArn(destinationResourceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps,
  ) : CdkObject(cdkObject), CfnDeliveryDestinationProps {
    override fun deliveryDestinationPolicy(): Any? = unwrap(this).getDeliveryDestinationPolicy()

    override fun destinationResourceArn(): String? = unwrap(this).getDestinationResourceArn()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeliveryDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps):
        CfnDeliveryDestinationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeliveryDestinationProps):
        software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps
  }
}

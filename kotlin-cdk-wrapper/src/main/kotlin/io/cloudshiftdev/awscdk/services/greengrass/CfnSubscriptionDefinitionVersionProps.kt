@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSubscriptionDefinitionVersionProps {
  public fun subscriptionDefinitionId(): String

  public fun subscriptions(): Any

  @CdkDslMarker
  public interface Builder {
    public fun subscriptionDefinitionId(subscriptionDefinitionId: String)

    public fun subscriptions(subscriptions: IResolvable)

    public fun subscriptions(subscriptions: List<Any>)

    public fun subscriptions(vararg subscriptions: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps.builder()

    override fun subscriptionDefinitionId(subscriptionDefinitionId: String) {
      cdkBuilder.subscriptionDefinitionId(subscriptionDefinitionId)
    }

    override fun subscriptions(subscriptions: IResolvable) {
      cdkBuilder.subscriptions(subscriptions.let(IResolvable::unwrap))
    }

    override fun subscriptions(subscriptions: List<Any>) {
      cdkBuilder.subscriptions(subscriptions)
    }

    override fun subscriptions(vararg subscriptions: Any): Unit =
        subscriptions(subscriptions.toList())

    public fun build():
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnSubscriptionDefinitionVersionProps {
    override fun subscriptionDefinitionId(): String = unwrap(this).getSubscriptionDefinitionId()

    override fun subscriptions(): Any = unwrap(this).getSubscriptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnSubscriptionDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps):
        CfnSubscriptionDefinitionVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps
  }
}

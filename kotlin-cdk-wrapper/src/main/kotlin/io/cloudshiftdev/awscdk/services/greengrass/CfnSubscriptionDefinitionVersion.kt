@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubscriptionDefinitionVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun subscriptionDefinitionId(): String = unwrap(this).getSubscriptionDefinitionId()

  public open fun subscriptionDefinitionId(`value`: String) {
    unwrap(this).setSubscriptionDefinitionId(`value`)
  }

  public open fun subscriptions(): Any = unwrap(this).getSubscriptions()

  public open fun subscriptions(`value`: IResolvable) {
    unwrap(this).setSubscriptions(`value`.let(IResolvable::unwrap))
  }

  public open fun subscriptions(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubscriptions(__idx_ac66f0)
  }

  public open fun subscriptions(vararg __idx_ac66f0: Any): Unit =
      subscriptions(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun subscriptionDefinitionId(subscriptionDefinitionId: String)

    public fun subscriptions(subscriptions: IResolvable)

    public fun subscriptions(subscriptions: List<Any>)

    public fun subscriptions(vararg subscriptions: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.Builder.create(scope,
        id)

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

    public fun build(): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscriptionDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscriptionDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion):
        CfnSubscriptionDefinitionVersion = CfnSubscriptionDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion =
        wrapped.cdkObject
  }

  public interface SubscriptionProperty {
    public fun id(): String

    public fun source(): String

    public fun subject(): String

    public fun target(): String

    @CdkDslMarker
    public interface Builder {
      public fun id(id: String)

      public fun source(source: String)

      public fun subject(subject: String)

      public fun target(target: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      override fun subject(subject: String) {
        cdkBuilder.subject(subject)
      }

      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty,
    ) : CdkObject(cdkObject), SubscriptionProperty {
      override fun id(): String = unwrap(this).getId()

      override fun source(): String = unwrap(this).getSource()

      override fun subject(): String = unwrap(this).getSubject()

      override fun target(): String = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty):
          SubscriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriptionProperty):
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty
    }
  }
}

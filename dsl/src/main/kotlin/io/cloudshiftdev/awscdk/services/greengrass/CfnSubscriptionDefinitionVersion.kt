package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubscriptionDefinitionVersion internal constructor(
  private val cdkObject:
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

  public interface Builder {
    public fun subscriptionDefinitionId(subscriptionDefinitionId: String) {
    }

    public fun subscriptions(subscriptions: IResolvable) {
    }

    public fun subscriptions(subscriptions: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.Builder.create(scope,
        id)

    public override fun subscriptionDefinitionId(subscriptionDefinitionId: String) {
      cdkBuilder.subscriptionDefinitionId(subscriptionDefinitionId)
    }

    public override fun subscriptions(subscriptions: IResolvable) {
      cdkBuilder.subscriptions(subscriptions.let(IResolvable::unwrap))
    }

    public override fun subscriptions(subscriptions: List<Any>) {
      cdkBuilder.subscriptions(subscriptions)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun id(id: String) {
      }

      public fun source(source: String) {
      }

      public fun subject(subject: String) {
      }

      public fun target(target: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty.builder()

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public override fun subject(subject: String) {
        cdkBuilder.subject(subject)
      }

      public override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty,
    ) : SubscriptionProperty {
      public override fun id(): String = unwrap(this).getId()

      public override fun source(): String = unwrap(this).getSource()

      public override fun subject(): String = unwrap(this).getSubject()

      public override fun target(): String = unwrap(this).getTarget()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty):
          SubscriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriptionProperty):
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion.SubscriptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

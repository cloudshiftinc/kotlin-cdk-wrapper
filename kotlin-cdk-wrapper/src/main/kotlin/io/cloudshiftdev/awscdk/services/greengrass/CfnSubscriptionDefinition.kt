@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubscriptionDefinition internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  public open fun initialVersion(`value`: SubscriptionDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(SubscriptionDefinitionVersionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7fc1d2b042e2eb456ab2333dc31bd7af1e7bef77929f9cf18d6afdb607704c0")
  public open fun initialVersion(`value`: SubscriptionDefinitionVersionProperty.Builder.() -> Unit):
      Unit = initialVersion(SubscriptionDefinitionVersionProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable)

    public fun initialVersion(initialVersion: SubscriptionDefinitionVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("021af35f0f0d44f88db7cae98553a0b2efb9d2f31c4c512a04f55a0db15e3104")
    public
        fun initialVersion(initialVersion: SubscriptionDefinitionVersionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.Builder =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.Builder.create(scope,
        id)

    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    override fun initialVersion(initialVersion: SubscriptionDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(SubscriptionDefinitionVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("021af35f0f0d44f88db7cae98553a0b2efb9d2f31c4c512a04f55a0db15e3104")
    override
        fun initialVersion(initialVersion: SubscriptionDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(SubscriptionDefinitionVersionProperty(initialVersion))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscriptionDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscriptionDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition):
        CfnSubscriptionDefinition = CfnSubscriptionDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionDefinition):
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition = wrapped.cdkObject
  }

  public interface SubscriptionDefinitionVersionProperty {
    public fun subscriptions(): Any

    @CdkDslMarker
    public interface Builder {
      public fun subscriptions(subscriptions: IResolvable)

      public fun subscriptions(subscriptions: List<Any>)

      public fun subscriptions(vararg subscriptions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.builder()

      override fun subscriptions(subscriptions: IResolvable) {
        cdkBuilder.subscriptions(subscriptions.let(IResolvable::unwrap))
      }

      override fun subscriptions(subscriptions: List<Any>) {
        cdkBuilder.subscriptions(subscriptions)
      }

      override fun subscriptions(vararg subscriptions: Any): Unit =
          subscriptions(subscriptions.toList())

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty,
    ) : CdkObject(cdkObject), SubscriptionDefinitionVersionProperty {
      override fun subscriptions(): Any = unwrap(this).getSubscriptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SubscriptionDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty):
          SubscriptionDefinitionVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriptionDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty
    }
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
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty.builder()

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
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty):
          SubscriptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriptionProperty):
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty
    }
  }
}

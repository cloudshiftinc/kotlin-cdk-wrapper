@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appintegrations

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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

public open class CfnEventIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.appintegrations.CfnEventIntegration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrEventIntegrationArn(): String = unwrap(this).getAttrEventIntegrationArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun eventBridgeBus(): String = unwrap(this).getEventBridgeBus()

  public open fun eventBridgeBus(`value`: String) {
    unwrap(this).setEventBridgeBus(`value`)
  }

  public open fun eventFilter(): Any = unwrap(this).getEventFilter()

  public open fun eventFilter(`value`: IResolvable) {
    unwrap(this).setEventFilter(`value`.let(IResolvable::unwrap))
  }

  public open fun eventFilter(`value`: EventFilterProperty) {
    unwrap(this).setEventFilter(`value`.let(EventFilterProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("460cf4195c3f238b565223aae854251e58e1a76047c3f672f449b8315c3a37fe")
  public open fun eventFilter(`value`: EventFilterProperty.Builder.() -> Unit): Unit =
      eventFilter(EventFilterProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun eventBridgeBus(eventBridgeBus: String)

    public fun eventFilter(eventFilter: IResolvable)

    public fun eventFilter(eventFilter: EventFilterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cb1d4f55e176a54a6afd4cd01263922ef7c9a98ace6d5a4a98f7345ff7ea2dd")
    public fun eventFilter(eventFilter: EventFilterProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appintegrations.CfnEventIntegration.Builder =
        software.amazon.awscdk.services.appintegrations.CfnEventIntegration.Builder.create(scope,
        id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventBridgeBus(eventBridgeBus: String) {
      cdkBuilder.eventBridgeBus(eventBridgeBus)
    }

    override fun eventFilter(eventFilter: IResolvable) {
      cdkBuilder.eventFilter(eventFilter.let(IResolvable::unwrap))
    }

    override fun eventFilter(eventFilter: EventFilterProperty) {
      cdkBuilder.eventFilter(eventFilter.let(EventFilterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cb1d4f55e176a54a6afd4cd01263922ef7c9a98ace6d5a4a98f7345ff7ea2dd")
    override fun eventFilter(eventFilter: EventFilterProperty.Builder.() -> Unit): Unit =
        eventFilter(EventFilterProperty(eventFilter))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appintegrations.CfnEventIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appintegrations.CfnEventIntegration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnEventIntegration):
        CfnEventIntegration = CfnEventIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnEventIntegration):
        software.amazon.awscdk.services.appintegrations.CfnEventIntegration = wrapped.cdkObject
  }

  public interface EventFilterProperty {
    public fun source(): String

    @CdkDslMarker
    public interface Builder {
      public fun source(source: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty.Builder
          =
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty.builder()

      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public fun build():
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty,
    ) : CdkObject(cdkObject), EventFilterProperty {
      override fun source(): String = unwrap(this).getSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty):
          EventFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventFilterProperty):
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventFilterProperty
    }
  }
}
package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnView internal constructor(
  private val cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnView,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrViewArn(): String = unwrap(this).getAttrViewArn()

  public open fun filters(): Any? = unwrap(this).getFilters()

  public open fun filters(`value`: IResolvable) {
    unwrap(this).setFilters(`value`.let(IResolvable::unwrap))
  }

  public open fun filters(`value`: FiltersProperty) {
    unwrap(this).setFilters(`value`.let(FiltersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8efc60275e91ea77cfe0ee95bdce8898540e1c5fbb268593760d8e3dfe9c9a57")
  public open fun filters(`value`: FiltersProperty.Builder.() -> Unit): Unit =
      filters(FiltersProperty(`value`))

  public open fun includedProperties(): Any? = unwrap(this).getIncludedProperties()

  public open fun includedProperties(`value`: IResolvable) {
    unwrap(this).setIncludedProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun includedProperties(__idx_ac66f0: List<Any>) {
    unwrap(this).setIncludedProperties(__idx_ac66f0)
  }

  public open fun includedProperties(vararg __idx_ac66f0: Any): Unit =
      includedProperties(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun scope(): String? = unwrap(this).getScope()

  public open fun scope(`value`: String) {
    unwrap(this).setScope(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun viewName(): String = unwrap(this).getViewName()

  public open fun viewName(`value`: String) {
    unwrap(this).setViewName(`value`)
  }

  public interface Builder {
    public fun filters(filters: IResolvable)

    public fun filters(filters: FiltersProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c101ff1abd5d95a62efbece54fc4a6c86ed1d5bb82015518c12e97e76685c0a")
    public fun filters(filters: FiltersProperty.Builder.() -> Unit)

    public fun includedProperties(includedProperties: IResolvable)

    public fun includedProperties(includedProperties: List<Any>)

    public fun includedProperties(vararg includedProperties: Any)

    public fun scope(scope: String)

    public fun tags(tags: Map<String, String>)

    public fun viewName(viewName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourceexplorer2.CfnView.Builder =
        software.amazon.awscdk.services.resourceexplorer2.CfnView.Builder.create(scope, id)

    override fun filters(filters: IResolvable) {
      cdkBuilder.filters(filters.let(IResolvable::unwrap))
    }

    override fun filters(filters: FiltersProperty) {
      cdkBuilder.filters(filters.let(FiltersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c101ff1abd5d95a62efbece54fc4a6c86ed1d5bb82015518c12e97e76685c0a")
    override fun filters(filters: FiltersProperty.Builder.() -> Unit): Unit =
        filters(FiltersProperty(filters))

    override fun includedProperties(includedProperties: IResolvable) {
      cdkBuilder.includedProperties(includedProperties.let(IResolvable::unwrap))
    }

    override fun includedProperties(includedProperties: List<Any>) {
      cdkBuilder.includedProperties(includedProperties)
    }

    override fun includedProperties(vararg includedProperties: Any): Unit =
        includedProperties(includedProperties.toList())

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun viewName(viewName: String) {
      cdkBuilder.viewName(viewName)
    }

    public fun build(): software.amazon.awscdk.services.resourceexplorer2.CfnView =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnView {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnView(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnView): CfnView
        = CfnView(cdkObject)

    internal fun unwrap(wrapped: CfnView): software.amazon.awscdk.services.resourceexplorer2.CfnView
        = wrapped.cdkObject
  }

  public interface SearchFilterProperty {
    public fun filterString(): String

    public interface Builder {
      public fun filterString(filterString: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty.Builder =
          software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty.builder()

      override fun filterString(filterString: String) {
        cdkBuilder.filterString(filterString)
      }

      public fun build():
          software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty,
    ) : SearchFilterProperty {
      override fun filterString(): String = unwrap(this).getFilterString()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SearchFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty):
          SearchFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SearchFilterProperty):
          software.amazon.awscdk.services.resourceexplorer2.CfnView.SearchFilterProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface IncludedPropertyProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty.Builder
          =
          software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty,
    ) : IncludedPropertyProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IncludedPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty):
          IncludedPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncludedPropertyProperty):
          software.amazon.awscdk.services.resourceexplorer2.CfnView.IncludedPropertyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FiltersProperty {
    public fun filterString(): String

    public interface Builder {
      public fun filterString(filterString: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty.Builder =
          software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty.builder()

      override fun filterString(filterString: String) {
        cdkBuilder.filterString(filterString)
      }

      public fun build(): software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty,
    ) : FiltersProperty {
      override fun filterString(): String = unwrap(this).getFilterString()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FiltersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty):
          FiltersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FiltersProperty):
          software.amazon.awscdk.services.resourceexplorer2.CfnView.FiltersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}

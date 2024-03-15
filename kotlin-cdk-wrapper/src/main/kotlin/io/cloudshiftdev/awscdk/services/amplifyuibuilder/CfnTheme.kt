@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplifyuibuilder

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTheme internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnTheme,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun appId(): String? = unwrap(this).getAppId()

  public open fun appId(`value`: String) {
    unwrap(this).setAppId(`value`)
  }

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  public open fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public open fun environmentName(`value`: String) {
    unwrap(this).setEnvironmentName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun overrides(): Any? = unwrap(this).getOverrides()

  public open fun overrides(`value`: IResolvable) {
    unwrap(this).setOverrides(`value`.let(IResolvable::unwrap))
  }

  public open fun overrides(__idx_ac66f0: List<Any>) {
    unwrap(this).setOverrides(__idx_ac66f0)
  }

  public open fun overrides(vararg __idx_ac66f0: Any): Unit = overrides(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun values(): Any? = unwrap(this).getValues()

  public open fun values(`value`: IResolvable) {
    unwrap(this).setValues(`value`.let(IResolvable::unwrap))
  }

  public open fun values(__idx_ac66f0: List<Any>) {
    unwrap(this).setValues(__idx_ac66f0)
  }

  public open fun values(vararg __idx_ac66f0: Any): Unit = values(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun appId(appId: String)

    public fun environmentName(environmentName: String)

    public fun name(name: String)

    public fun overrides(overrides: IResolvable)

    public fun overrides(overrides: List<Any>)

    public fun overrides(vararg overrides: Any)

    public fun tags(tags: Map<String, String>)

    public fun values(values: IResolvable)

    public fun values(values: List<Any>)

    public fun values(vararg values: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.Builder.create(scope, id)

    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun overrides(overrides: IResolvable) {
      cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
    }

    override fun overrides(overrides: List<Any>) {
      cdkBuilder.overrides(overrides)
    }

    override fun overrides(vararg overrides: Any): Unit = overrides(overrides.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun values(values: IResolvable) {
      cdkBuilder.values(values.let(IResolvable::unwrap))
    }

    override fun values(values: List<Any>) {
      cdkBuilder.values(values)
    }

    override fun values(vararg values: Any): Unit = values(values.toList())

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnTheme =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTheme {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTheme(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnTheme):
        CfnTheme = CfnTheme(cdkObject)

    internal fun unwrap(wrapped: CfnTheme):
        software.amazon.awscdk.services.amplifyuibuilder.CfnTheme = wrapped.cdkObject
  }

  public interface ThemeValuesProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): Any? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: IResolvable)

      public fun `value`(`value`: ThemeValueProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35433fbe0a3c1523107c7f69fb9c117e2d4e7d21eb2de9e2f329067b72cd4cfe")
      public fun `value`(`value`: ThemeValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      override fun `value`(`value`: ThemeValueProperty) {
        cdkBuilder.`value`(`value`.let(ThemeValueProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35433fbe0a3c1523107c7f69fb9c117e2d4e7d21eb2de9e2f329067b72cd4cfe")
      override fun `value`(`value`: ThemeValueProperty.Builder.() -> Unit): Unit =
          `value`(ThemeValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty,
    ) : CdkObject(cdkObject), ThemeValuesProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThemeValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty):
          ThemeValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThemeValuesProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValuesProperty
    }
  }

  public interface ThemeValueProperty {
    public fun children(): Any? = unwrap(this).getChildren()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun children(children: IResolvable)

      public fun children(children: List<Any>)

      public fun children(vararg children: Any)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty.Builder =
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty.builder()

      override fun children(children: IResolvable) {
        cdkBuilder.children(children.let(IResolvable::unwrap))
      }

      override fun children(children: List<Any>) {
        cdkBuilder.children(children)
      }

      override fun children(vararg children: Any): Unit = children(children.toList())

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty,
    ) : CdkObject(cdkObject), ThemeValueProperty {
      override fun children(): Any? = unwrap(this).getChildren()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThemeValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty):
          ThemeValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThemeValueProperty):
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amplifyuibuilder.CfnTheme.ThemeValueProperty
    }
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnAnalysisTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun analysisParameters(): Any? = unwrap(this).getAnalysisParameters()

  public open fun analysisParameters(`value`: IResolvable) {
    unwrap(this).setAnalysisParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun analysisParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setAnalysisParameters(__idx_ac66f0)
  }

  public open fun analysisParameters(vararg __idx_ac66f0: Any): Unit =
      analysisParameters(__idx_ac66f0.toList())

  public open fun attrAnalysisTemplateIdentifier(): String =
      unwrap(this).getAttrAnalysisTemplateIdentifier()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCollaborationArn(): String = unwrap(this).getAttrCollaborationArn()

  public open fun attrCollaborationIdentifier(): String =
      unwrap(this).getAttrCollaborationIdentifier()

  public open fun attrMembershipArn(): String = unwrap(this).getAttrMembershipArn()

  public open fun attrSchema(): IResolvable = unwrap(this).getAttrSchema().let(IResolvable::wrap)

  public open fun attrSchemaReferencedTables(): List<String> =
      unwrap(this).getAttrSchemaReferencedTables()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun format(): String = unwrap(this).getFormat()

  public open fun format(`value`: String) {
    unwrap(this).setFormat(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

  public open fun membershipIdentifier(`value`: String) {
    unwrap(this).setMembershipIdentifier(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun source(): Any = unwrap(this).getSource()

  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable::unwrap))
  }

  public open fun source(`value`: AnalysisSourceProperty) {
    unwrap(this).setSource(`value`.let(AnalysisSourceProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("997162caadb96ba6b460c4c52a6c9188fe25ed68b37dcf8f64d12c265909dd23")
  public open fun source(`value`: AnalysisSourceProperty.Builder.() -> Unit): Unit =
      source(AnalysisSourceProperty(`value`))

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun analysisParameters(analysisParameters: IResolvable)

    public fun analysisParameters(analysisParameters: List<Any>)

    public fun analysisParameters(vararg analysisParameters: Any)

    public fun description(description: String)

    public fun format(format: String)

    public fun membershipIdentifier(membershipIdentifier: String)

    public fun name(name: String)

    public fun source(source: IResolvable)

    public fun source(source: AnalysisSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e785149e3cb40f1492f363f91d84288a1fc5535a66b6f33d66fe0006c4eabcf9")
    public fun source(source: AnalysisSourceProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.Builder.create(scope, id)

    override fun analysisParameters(analysisParameters: IResolvable) {
      cdkBuilder.analysisParameters(analysisParameters.let(IResolvable::unwrap))
    }

    override fun analysisParameters(analysisParameters: List<Any>) {
      cdkBuilder.analysisParameters(analysisParameters)
    }

    override fun analysisParameters(vararg analysisParameters: Any): Unit =
        analysisParameters(analysisParameters.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    override fun source(source: AnalysisSourceProperty) {
      cdkBuilder.source(source.let(AnalysisSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e785149e3cb40f1492f363f91d84288a1fc5535a66b6f33d66fe0006c4eabcf9")
    override fun source(source: AnalysisSourceProperty.Builder.() -> Unit): Unit =
        source(AnalysisSourceProperty(source))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnalysisTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnalysisTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate):
        CfnAnalysisTemplate = CfnAnalysisTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnAnalysisTemplate):
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate = wrapped.cdkObject
  }

  public interface AnalysisSourceProperty {
    public fun text(): String

    @CdkDslMarker
    public interface Builder {
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty.builder()

      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty,
    ) : CdkObject(cdkObject), AnalysisSourceProperty {
      override fun text(): String = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty):
          AnalysisSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisSourceProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSourceProperty
    }
  }

  public interface AnalysisSchemaProperty {
    public fun referencedTables(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun referencedTables(referencedTables: List<String>)

      public fun referencedTables(vararg referencedTables: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty.builder()

      override fun referencedTables(referencedTables: List<String>) {
        cdkBuilder.referencedTables(referencedTables)
      }

      override fun referencedTables(vararg referencedTables: String): Unit =
          referencedTables(referencedTables.toList())

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty,
    ) : CdkObject(cdkObject), AnalysisSchemaProperty {
      override fun referencedTables(): List<String> = unwrap(this).getReferencedTables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty):
          AnalysisSchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisSchemaProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisSchemaProperty
    }
  }

  public interface AnalysisParameterProperty {
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    public fun name(): String

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun defaultValue(defaultValue: String)

      public fun name(name: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty.builder()

      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty,
    ) : CdkObject(cdkObject), AnalysisParameterProperty {
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      override fun name(): String = unwrap(this).getName()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty):
          AnalysisParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisParameterProperty):
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate.AnalysisParameterProperty
    }
  }
}
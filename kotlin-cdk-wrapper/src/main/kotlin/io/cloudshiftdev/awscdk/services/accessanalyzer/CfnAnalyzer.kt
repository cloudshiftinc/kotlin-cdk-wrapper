@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.accessanalyzer

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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAnalyzer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun analyzerConfiguration(): Any? = unwrap(this).getAnalyzerConfiguration()

  public open fun analyzerConfiguration(`value`: IResolvable) {
    unwrap(this).setAnalyzerConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun analyzerConfiguration(`value`: AnalyzerConfigurationProperty) {
    unwrap(this).setAnalyzerConfiguration(`value`.let(AnalyzerConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d96198f42b896af4b94eb3419f13ed3346f921e992c5710fccec212e0514de1b")
  public open fun analyzerConfiguration(`value`: AnalyzerConfigurationProperty.Builder.() -> Unit):
      Unit = analyzerConfiguration(AnalyzerConfigurationProperty(`value`))

  public open fun analyzerName(): String? = unwrap(this).getAnalyzerName()

  public open fun analyzerName(`value`: String) {
    unwrap(this).setAnalyzerName(`value`)
  }

  public open fun archiveRules(): Any? = unwrap(this).getArchiveRules()

  public open fun archiveRules(`value`: IResolvable) {
    unwrap(this).setArchiveRules(`value`.let(IResolvable::unwrap))
  }

  public open fun archiveRules(__idx_ac66f0: List<Any>) {
    unwrap(this).setArchiveRules(__idx_ac66f0)
  }

  public open fun archiveRules(vararg __idx_ac66f0: Any): Unit = archiveRules(__idx_ac66f0.toList())

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun analyzerConfiguration(analyzerConfiguration: IResolvable)

    public fun analyzerConfiguration(analyzerConfiguration: AnalyzerConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08181d83c131043275ab65dc780b8019da1eaca230ceb165db05ef754008c5a8")
    public
        fun analyzerConfiguration(analyzerConfiguration: AnalyzerConfigurationProperty.Builder.() -> Unit)

    public fun analyzerName(analyzerName: String)

    public fun archiveRules(archiveRules: IResolvable)

    public fun archiveRules(archiveRules: List<Any>)

    public fun archiveRules(vararg archiveRules: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.Builder =
        software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.Builder.create(scope, id)

    override fun analyzerConfiguration(analyzerConfiguration: IResolvable) {
      cdkBuilder.analyzerConfiguration(analyzerConfiguration.let(IResolvable::unwrap))
    }

    override fun analyzerConfiguration(analyzerConfiguration: AnalyzerConfigurationProperty) {
      cdkBuilder.analyzerConfiguration(analyzerConfiguration.let(AnalyzerConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08181d83c131043275ab65dc780b8019da1eaca230ceb165db05ef754008c5a8")
    override
        fun analyzerConfiguration(analyzerConfiguration: AnalyzerConfigurationProperty.Builder.() -> Unit):
        Unit = analyzerConfiguration(AnalyzerConfigurationProperty(analyzerConfiguration))

    override fun analyzerName(analyzerName: String) {
      cdkBuilder.analyzerName(analyzerName)
    }

    override fun archiveRules(archiveRules: IResolvable) {
      cdkBuilder.archiveRules(archiveRules.let(IResolvable::unwrap))
    }

    override fun archiveRules(archiveRules: List<Any>) {
      cdkBuilder.archiveRules(archiveRules)
    }

    override fun archiveRules(vararg archiveRules: Any): Unit = archiveRules(archiveRules.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnalyzer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnalyzer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer):
        CfnAnalyzer = CfnAnalyzer(cdkObject)

    internal fun unwrap(wrapped: CfnAnalyzer):
        software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer = wrapped.cdkObject
  }

  public interface FilterProperty {
    public fun contains(): List<String> = unwrap(this).getContains() ?: emptyList()

    public fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

    public fun exists(): Any? = unwrap(this).getExists()

    public fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()

    public fun `property`(): String

    @CdkDslMarker
    public interface Builder {
      public fun contains(contains: List<String>)

      public fun contains(vararg contains: String)

      public fun eq(eq: List<String>)

      public fun eq(vararg eq: String)

      public fun exists(exists: Boolean)

      public fun exists(exists: IResolvable)

      public fun neq(neq: List<String>)

      public fun neq(vararg neq: String)

      public fun `property`(`property`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty.Builder =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty.builder()

      override fun contains(contains: List<String>) {
        cdkBuilder.contains(contains)
      }

      override fun contains(vararg contains: String): Unit = contains(contains.toList())

      override fun eq(eq: List<String>) {
        cdkBuilder.eq(eq)
      }

      override fun eq(vararg eq: String): Unit = eq(eq.toList())

      override fun exists(exists: Boolean) {
        cdkBuilder.exists(exists)
      }

      override fun exists(exists: IResolvable) {
        cdkBuilder.exists(exists.let(IResolvable::unwrap))
      }

      override fun neq(neq: List<String>) {
        cdkBuilder.neq(neq)
      }

      override fun neq(vararg neq: String): Unit = neq(neq.toList())

      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      public fun build(): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      override fun contains(): List<String> = unwrap(this).getContains() ?: emptyList()

      override fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

      override fun exists(): Any? = unwrap(this).getExists()

      override fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()

      override fun `property`(): String = unwrap(this).getProperty()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty
    }
  }

  public interface AnalyzerConfigurationProperty {
    public fun unusedAccessConfiguration(): Any? = unwrap(this).getUnusedAccessConfiguration()

    @CdkDslMarker
    public interface Builder {
      public fun unusedAccessConfiguration(unusedAccessConfiguration: IResolvable)

      public
          fun unusedAccessConfiguration(unusedAccessConfiguration: UnusedAccessConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63ab8f673dc332d9b0d20c53140bcf87473a0e8d671b6890e885eeb33b85cc81")
      public
          fun unusedAccessConfiguration(unusedAccessConfiguration: UnusedAccessConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty.builder()

      override fun unusedAccessConfiguration(unusedAccessConfiguration: IResolvable) {
        cdkBuilder.unusedAccessConfiguration(unusedAccessConfiguration.let(IResolvable::unwrap))
      }

      override
          fun unusedAccessConfiguration(unusedAccessConfiguration: UnusedAccessConfigurationProperty) {
        cdkBuilder.unusedAccessConfiguration(unusedAccessConfiguration.let(UnusedAccessConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63ab8f673dc332d9b0d20c53140bcf87473a0e8d671b6890e885eeb33b85cc81")
      override
          fun unusedAccessConfiguration(unusedAccessConfiguration: UnusedAccessConfigurationProperty.Builder.() -> Unit):
          Unit =
          unusedAccessConfiguration(UnusedAccessConfigurationProperty(unusedAccessConfiguration))

      public fun build():
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty,
    ) : CdkObject(cdkObject), AnalyzerConfigurationProperty {
      override fun unusedAccessConfiguration(): Any? = unwrap(this).getUnusedAccessConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalyzerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty):
          AnalyzerConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalyzerConfigurationProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty
    }
  }

  public interface ArchiveRuleProperty {
    public fun filter(): Any

    public fun ruleName(): String

    @CdkDslMarker
    public interface Builder {
      public fun filter(filter: IResolvable)

      public fun filter(filter: List<Any>)

      public fun filter(vararg filter: Any)

      public fun ruleName(ruleName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty.Builder =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty.builder()

      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      override fun filter(filter: List<Any>) {
        cdkBuilder.filter(filter)
      }

      override fun filter(vararg filter: Any): Unit = filter(filter.toList())

      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      public fun build():
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty,
    ) : CdkObject(cdkObject), ArchiveRuleProperty {
      override fun filter(): Any = unwrap(this).getFilter()

      override fun ruleName(): String = unwrap(this).getRuleName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty):
          ArchiveRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveRuleProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty
    }
  }

  public interface UnusedAccessConfigurationProperty {
    public fun unusedAccessAge(): Number? = unwrap(this).getUnusedAccessAge()

    @CdkDslMarker
    public interface Builder {
      public fun unusedAccessAge(unusedAccessAge: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty.builder()

      override fun unusedAccessAge(unusedAccessAge: Number) {
        cdkBuilder.unusedAccessAge(unusedAccessAge)
      }

      public fun build():
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty,
    ) : CdkObject(cdkObject), UnusedAccessConfigurationProperty {
      override fun unusedAccessAge(): Number? = unwrap(this).getUnusedAccessAge()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          UnusedAccessConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty):
          UnusedAccessConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UnusedAccessConfigurationProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty
    }
  }
}

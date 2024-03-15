@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.accessanalyzer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAnalyzerProps {
  public fun analyzerConfiguration(): Any? = unwrap(this).getAnalyzerConfiguration()

  public fun analyzerName(): String? = unwrap(this).getAnalyzerName()

  public fun archiveRules(): Any? = unwrap(this).getArchiveRules()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun analyzerConfiguration(analyzerConfiguration: IResolvable)

    public
        fun analyzerConfiguration(analyzerConfiguration: CfnAnalyzer.AnalyzerConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e8ef999c1ee18f5f538bd76caa12533cc428031c70ead9e147324a194fc0e6c")
    public
        fun analyzerConfiguration(analyzerConfiguration: CfnAnalyzer.AnalyzerConfigurationProperty.Builder.() -> Unit)

    public fun analyzerName(analyzerName: String)

    public fun archiveRules(archiveRules: IResolvable)

    public fun archiveRules(archiveRules: List<Any>)

    public fun archiveRules(vararg archiveRules: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps.Builder
        = software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps.builder()

    override fun analyzerConfiguration(analyzerConfiguration: IResolvable) {
      cdkBuilder.analyzerConfiguration(analyzerConfiguration.let(IResolvable::unwrap))
    }

    override
        fun analyzerConfiguration(analyzerConfiguration: CfnAnalyzer.AnalyzerConfigurationProperty) {
      cdkBuilder.analyzerConfiguration(analyzerConfiguration.let(CfnAnalyzer.AnalyzerConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e8ef999c1ee18f5f538bd76caa12533cc428031c70ead9e147324a194fc0e6c")
    override
        fun analyzerConfiguration(analyzerConfiguration: CfnAnalyzer.AnalyzerConfigurationProperty.Builder.() -> Unit):
        Unit =
        analyzerConfiguration(CfnAnalyzer.AnalyzerConfigurationProperty(analyzerConfiguration))

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

    public fun build(): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps,
  ) : CdkObject(cdkObject), CfnAnalyzerProps {
    override fun analyzerConfiguration(): Any? = unwrap(this).getAnalyzerConfiguration()

    override fun analyzerName(): String? = unwrap(this).getAnalyzerName()

    override fun archiveRules(): Any? = unwrap(this).getArchiveRules()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnalyzerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps):
        CfnAnalyzerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnalyzerProps):
        software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps
  }
}

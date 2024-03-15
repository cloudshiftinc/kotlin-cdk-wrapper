@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAnalysisTemplateProps {
  public fun analysisParameters(): Any? = unwrap(this).getAnalysisParameters()

  public fun description(): String? = unwrap(this).getDescription()

  public fun format(): String

  public fun membershipIdentifier(): String

  public fun name(): String

  public fun source(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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

    public fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d318518d69866fb3b317dab255838a7b0f145eb57d564ae2fcf7d5c65a790eb")
    public fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps.builder()

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

    override fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty) {
      cdkBuilder.source(source.let(CfnAnalysisTemplate.AnalysisSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d318518d69866fb3b317dab255838a7b0f145eb57d564ae2fcf7d5c65a790eb")
    override fun source(source: CfnAnalysisTemplate.AnalysisSourceProperty.Builder.() -> Unit): Unit
        = source(CfnAnalysisTemplate.AnalysisSourceProperty(source))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps,
  ) : CdkObject(cdkObject), CfnAnalysisTemplateProps {
    override fun analysisParameters(): Any? = unwrap(this).getAnalysisParameters()

    override fun description(): String? = unwrap(this).getDescription()

    override fun format(): String = unwrap(this).getFormat()

    override fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

    override fun name(): String = unwrap(this).getName()

    override fun source(): Any = unwrap(this).getSource()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnalysisTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps):
        CfnAnalysisTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnalysisTemplateProps):
        software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnReportGroupProps {
  public fun deleteReports(): Any? = unwrap(this).getDeleteReports()

  public fun exportConfig(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun deleteReports(deleteReports: Boolean)

    public fun deleteReports(deleteReports: IResolvable)

    public fun exportConfig(exportConfig: IResolvable)

    public fun exportConfig(exportConfig: CfnReportGroup.ReportExportConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c3cb3de75b844bd82295d8ecf486748951b06392d562004f8817d8101ed78ec")
    public
        fun exportConfig(exportConfig: CfnReportGroup.ReportExportConfigProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnReportGroupProps.Builder =
        software.amazon.awscdk.services.codebuild.CfnReportGroupProps.builder()

    override fun deleteReports(deleteReports: Boolean) {
      cdkBuilder.deleteReports(deleteReports)
    }

    override fun deleteReports(deleteReports: IResolvable) {
      cdkBuilder.deleteReports(deleteReports.let(IResolvable::unwrap))
    }

    override fun exportConfig(exportConfig: IResolvable) {
      cdkBuilder.exportConfig(exportConfig.let(IResolvable::unwrap))
    }

    override fun exportConfig(exportConfig: CfnReportGroup.ReportExportConfigProperty) {
      cdkBuilder.exportConfig(exportConfig.let(CfnReportGroup.ReportExportConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c3cb3de75b844bd82295d8ecf486748951b06392d562004f8817d8101ed78ec")
    override
        fun exportConfig(exportConfig: CfnReportGroup.ReportExportConfigProperty.Builder.() -> Unit):
        Unit = exportConfig(CfnReportGroup.ReportExportConfigProperty(exportConfig))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CfnReportGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroupProps,
  ) : CdkObject(cdkObject), CfnReportGroupProps {
    override fun deleteReports(): Any? = unwrap(this).getDeleteReports()

    override fun exportConfig(): Any = unwrap(this).getExportConfig()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReportGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnReportGroupProps):
        CfnReportGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReportGroupProps):
        software.amazon.awscdk.services.codebuild.CfnReportGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.CfnReportGroupProps
  }
}

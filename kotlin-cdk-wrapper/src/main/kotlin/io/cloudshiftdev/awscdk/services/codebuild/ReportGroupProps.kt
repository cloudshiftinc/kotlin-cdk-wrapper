@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ReportGroupProps {
  public fun exportBucket(): IBucket? = unwrap(this).getExportBucket()?.let(IBucket::wrap)

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun reportGroupName(): String? = unwrap(this).getReportGroupName()

  public fun type(): ReportGroupType? = unwrap(this).getType()?.let(ReportGroupType::wrap)

  public fun zipExport(): Boolean? = unwrap(this).getZipExport()

  @CdkDslMarker
  public interface Builder {
    public fun exportBucket(exportBucket: IBucket)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun reportGroupName(reportGroupName: String)

    public fun type(type: ReportGroupType)

    public fun zipExport(zipExport: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.ReportGroupProps.Builder =
        software.amazon.awscdk.services.codebuild.ReportGroupProps.builder()

    override fun exportBucket(exportBucket: IBucket) {
      cdkBuilder.exportBucket(exportBucket.let(IBucket::unwrap))
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun reportGroupName(reportGroupName: String) {
      cdkBuilder.reportGroupName(reportGroupName)
    }

    override fun type(type: ReportGroupType) {
      cdkBuilder.type(type.let(ReportGroupType::unwrap))
    }

    override fun zipExport(zipExport: Boolean) {
      cdkBuilder.zipExport(zipExport)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.ReportGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.ReportGroupProps,
  ) : CdkObject(cdkObject), ReportGroupProps {
    override fun exportBucket(): IBucket? = unwrap(this).getExportBucket()?.let(IBucket::wrap)

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun reportGroupName(): String? = unwrap(this).getReportGroupName()

    override fun type(): ReportGroupType? = unwrap(this).getType()?.let(ReportGroupType::wrap)

    override fun zipExport(): Boolean? = unwrap(this).getZipExport()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReportGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ReportGroupProps):
        ReportGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReportGroupProps):
        software.amazon.awscdk.services.codebuild.ReportGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.ReportGroupProps
  }
}

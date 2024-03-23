@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for `ReportGroup`.
 *
 * Example:
 *
 * ```
 * Source source;
 * // create a new ReportGroup
 * ReportGroup reportGroup = ReportGroup.Builder.create(this, "ReportGroup")
 * .type(ReportGroupType.CODE_COVERAGE)
 * .build();
 * Project project = Project.Builder.create(this, "Project")
 * .source(source)
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * // ...
 * "reports", Map.of(
 * reportGroup.getReportGroupArn(), Map.of(
 * "files", "**&#47;*",
 * "base-directory", "build/coverage-report.xml",
 * "file-format", "JACOCOXML")))))
 * .build();
 * ```
 */
public interface ReportGroupProps {
  /**
   * An optional S3 bucket to export the reports to.
   *
   * Default: - the reports will not be exported
   */
  public fun exportBucket(): IBucket? = unwrap(this).getExportBucket()?.let(IBucket::wrap)

  /**
   * What to do when this resource is deleted from a stack.
   *
   * As CodeBuild does not allow deleting a ResourceGroup that has reports inside of it,
   * this is set to retain the resource by default.
   *
   * Default: RemovalPolicy.RETAIN
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * The physical name of the report group.
   *
   * Default: - CloudFormation-generated name
   */
  public fun reportGroupName(): String? = unwrap(this).getReportGroupName()

  /**
   * The type of report group. This can be one of the following values:.
   *
   * * **TEST** - The report group contains test reports.
   * * **CODE_COVERAGE** - The report group contains code coverage reports.
   *
   * Default: TEST
   */
  public fun type(): ReportGroupType? = unwrap(this).getType()?.let(ReportGroupType::wrap)

  /**
   * Whether to output the report files into the export bucket as-is, or create a ZIP from them
   * before doing the export.
   *
   * Ignored if `exportBucket` has not been provided.
   *
   * Default: - false (the files will not be ZIPped)
   */
  public fun zipExport(): Boolean? = unwrap(this).getZipExport()

  /**
   * A builder for [ReportGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param exportBucket An optional S3 bucket to export the reports to.
     */
    public fun exportBucket(exportBucket: IBucket)

    /**
     * @param removalPolicy What to do when this resource is deleted from a stack.
     * As CodeBuild does not allow deleting a ResourceGroup that has reports inside of it,
     * this is set to retain the resource by default.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param reportGroupName The physical name of the report group.
     */
    public fun reportGroupName(reportGroupName: String)

    /**
     * @param type The type of report group. This can be one of the following values:.
     * * **TEST** - The report group contains test reports.
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     */
    public fun type(type: ReportGroupType)

    /**
     * @param zipExport Whether to output the report files into the export bucket as-is, or create a
     * ZIP from them before doing the export.
     * Ignored if `exportBucket` has not been provided.
     */
    public fun zipExport(zipExport: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.ReportGroupProps.Builder =
        software.amazon.awscdk.services.codebuild.ReportGroupProps.builder()

    /**
     * @param exportBucket An optional S3 bucket to export the reports to.
     */
    override fun exportBucket(exportBucket: IBucket) {
      cdkBuilder.exportBucket(exportBucket.let(IBucket::unwrap))
    }

    /**
     * @param removalPolicy What to do when this resource is deleted from a stack.
     * As CodeBuild does not allow deleting a ResourceGroup that has reports inside of it,
     * this is set to retain the resource by default.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param reportGroupName The physical name of the report group.
     */
    override fun reportGroupName(reportGroupName: String) {
      cdkBuilder.reportGroupName(reportGroupName)
    }

    /**
     * @param type The type of report group. This can be one of the following values:.
     * * **TEST** - The report group contains test reports.
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     */
    override fun type(type: ReportGroupType) {
      cdkBuilder.type(type.let(ReportGroupType::unwrap))
    }

    /**
     * @param zipExport Whether to output the report files into the export bucket as-is, or create a
     * ZIP from them before doing the export.
     * Ignored if `exportBucket` has not been provided.
     */
    override fun zipExport(zipExport: Boolean) {
      cdkBuilder.zipExport(zipExport)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.ReportGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.ReportGroupProps,
  ) : CdkObject(cdkObject), ReportGroupProps {
    /**
     * An optional S3 bucket to export the reports to.
     *
     * Default: - the reports will not be exported
     */
    override fun exportBucket(): IBucket? = unwrap(this).getExportBucket()?.let(IBucket::wrap)

    /**
     * What to do when this resource is deleted from a stack.
     *
     * As CodeBuild does not allow deleting a ResourceGroup that has reports inside of it,
     * this is set to retain the resource by default.
     *
     * Default: RemovalPolicy.RETAIN
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The physical name of the report group.
     *
     * Default: - CloudFormation-generated name
     */
    override fun reportGroupName(): String? = unwrap(this).getReportGroupName()

    /**
     * The type of report group. This can be one of the following values:.
     *
     * * **TEST** - The report group contains test reports.
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     *
     * Default: TEST
     */
    override fun type(): ReportGroupType? = unwrap(this).getType()?.let(ReportGroupType::wrap)

    /**
     * Whether to output the report files into the export bucket as-is, or create a ZIP from them
     * before doing the export.
     *
     * Ignored if `exportBucket` has not been provided.
     *
     * Default: - false (the files will not be ZIPped)
     */
    override fun zipExport(): Boolean? = unwrap(this).getZipExport()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReportGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ReportGroupProps):
        ReportGroupProps = CdkObjectWrappers.wrap(cdkObject) as? ReportGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReportGroupProps):
        software.amazon.awscdk.services.codebuild.ReportGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.ReportGroupProps
  }
}

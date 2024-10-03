@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The ReportGroup resource class.
 *
 * Example:
 *
 * ```
 * Source source;
 * // create a new ReportGroup
 * ReportGroup reportGroup = new ReportGroup(this, "ReportGroup");
 * Project project = Project.Builder.create(this, "Project")
 * .source(source)
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * // ...
 * "reports", Map.of(
 * reportGroup.getReportGroupArn(), Map.of(
 * "files", "**&#47;*",
 * "base-directory", "build/test-results")))))
 * .build();
 * ```
 */
public open class ReportGroup(
  cdkObject: software.amazon.awscdk.services.codebuild.ReportGroup,
) : Resource(cdkObject),
    IReportGroup {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.codebuild.ReportGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ReportGroupProps,
  ) :
      this(software.amazon.awscdk.services.codebuild.ReportGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ReportGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ReportGroupProps.Builder.() -> Unit,
  ) : this(scope, id, ReportGroupProps(props)
  )

  /**
   * Grants the given entity permissions to write (that is, upload reports to) this report group.
   *
   * @param identity 
   */
  public override fun grantWrite(identity: IGrantable): Grant =
      unwrap(this).grantWrite(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The ARN of the ReportGroup.
   */
  public override fun reportGroupArn(): String = unwrap(this).getReportGroupArn()

  /**
   * The name of the ReportGroup.
   */
  public override fun reportGroupName(): String = unwrap(this).getReportGroupName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.ReportGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If true, deleting the report group force deletes the contents of the report group.
     *
     * If false, the report group must be empty before attempting to delete it.
     *
     * Default: false
     *
     * @param deleteReports If true, deleting the report group force deletes the contents of the
     * report group. 
     */
    public fun deleteReports(deleteReports: Boolean)

    /**
     * An optional S3 bucket to export the reports to.
     *
     * Default: - the reports will not be exported
     *
     * @param exportBucket An optional S3 bucket to export the reports to. 
     */
    public fun exportBucket(exportBucket: IBucket)

    /**
     * What to do when this resource is deleted from a stack.
     *
     * As CodeBuild does not allow deleting a ResourceGroup that has reports inside of it,
     * this is set to retain the resource by default.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy What to do when this resource is deleted from a stack. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * The physical name of the report group.
     *
     * Default: - CloudFormation-generated name
     *
     * @param reportGroupName The physical name of the report group. 
     */
    public fun reportGroupName(reportGroupName: String)

    /**
     * The type of report group. This can be one of the following values:.
     *
     * * **TEST** - The report group contains test reports.
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     *
     * Default: TEST
     *
     * @param type The type of report group. This can be one of the following values:. 
     */
    public fun type(type: ReportGroupType)

    /**
     * Whether to output the report files into the export bucket as-is, or create a ZIP from them
     * before doing the export.
     *
     * Ignored if `exportBucket` has not been provided.
     *
     * Default: - false (the files will not be ZIPped)
     *
     * @param zipExport Whether to output the report files into the export bucket as-is, or create a
     * ZIP from them before doing the export. 
     */
    public fun zipExport(zipExport: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.ReportGroup.Builder =
        software.amazon.awscdk.services.codebuild.ReportGroup.Builder.create(scope, id)

    /**
     * If true, deleting the report group force deletes the contents of the report group.
     *
     * If false, the report group must be empty before attempting to delete it.
     *
     * Default: false
     *
     * @param deleteReports If true, deleting the report group force deletes the contents of the
     * report group. 
     */
    override fun deleteReports(deleteReports: Boolean) {
      cdkBuilder.deleteReports(deleteReports)
    }

    /**
     * An optional S3 bucket to export the reports to.
     *
     * Default: - the reports will not be exported
     *
     * @param exportBucket An optional S3 bucket to export the reports to. 
     */
    override fun exportBucket(exportBucket: IBucket) {
      cdkBuilder.exportBucket(exportBucket.let(IBucket.Companion::unwrap))
    }

    /**
     * What to do when this resource is deleted from a stack.
     *
     * As CodeBuild does not allow deleting a ResourceGroup that has reports inside of it,
     * this is set to retain the resource by default.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy What to do when this resource is deleted from a stack. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The physical name of the report group.
     *
     * Default: - CloudFormation-generated name
     *
     * @param reportGroupName The physical name of the report group. 
     */
    override fun reportGroupName(reportGroupName: String) {
      cdkBuilder.reportGroupName(reportGroupName)
    }

    /**
     * The type of report group. This can be one of the following values:.
     *
     * * **TEST** - The report group contains test reports.
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     *
     * Default: TEST
     *
     * @param type The type of report group. This can be one of the following values:. 
     */
    override fun type(type: ReportGroupType) {
      cdkBuilder.type(type.let(ReportGroupType.Companion::unwrap))
    }

    /**
     * Whether to output the report files into the export bucket as-is, or create a ZIP from them
     * before doing the export.
     *
     * Ignored if `exportBucket` has not been provided.
     *
     * Default: - false (the files will not be ZIPped)
     *
     * @param zipExport Whether to output the report files into the export bucket as-is, or create a
     * ZIP from them before doing the export. 
     */
    override fun zipExport(zipExport: Boolean) {
      cdkBuilder.zipExport(zipExport)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.ReportGroup = cdkBuilder.build()
  }

  public companion object {
    public fun fromReportGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      reportGroupName: String,
    ): IReportGroup =
        software.amazon.awscdk.services.codebuild.ReportGroup.fromReportGroupName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, reportGroupName).let(IReportGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ReportGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ReportGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ReportGroup): ReportGroup
        = ReportGroup(cdkObject)

    internal fun unwrap(wrapped: ReportGroup): software.amazon.awscdk.services.codebuild.ReportGroup
        = wrapped.cdkObject as software.amazon.awscdk.services.codebuild.ReportGroup
  }
}

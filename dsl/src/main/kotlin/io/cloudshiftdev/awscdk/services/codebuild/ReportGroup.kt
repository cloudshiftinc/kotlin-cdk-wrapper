package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ReportGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codebuild.ReportGroup,
) : Resource(cdkObject), IReportGroup {
  public override fun grantWrite(identity: IGrantable): Grant =
      unwrap(this).grantWrite(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun reportGroupArn(): String = unwrap(this).getReportGroupArn()

  public override fun reportGroupName(): String = unwrap(this).getReportGroupName()

  public interface Builder {
    public fun exportBucket(exportBucket: IBucket)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun reportGroupName(reportGroupName: String)

    public fun type(type: ReportGroupType)

    public fun zipExport(zipExport: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.ReportGroup.Builder =
        software.amazon.awscdk.services.codebuild.ReportGroup.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.codebuild.ReportGroup = cdkBuilder.build()
  }

  public companion object {
    public open fun fromReportGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      reportGroupName: String,
    ): IReportGroup =
        software.amazon.awscdk.services.codebuild.ReportGroup.fromReportGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
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
        = wrapped.cdkObject
  }
}

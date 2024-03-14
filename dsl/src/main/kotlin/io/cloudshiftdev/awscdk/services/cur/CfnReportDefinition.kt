package io.cloudshiftdev.awscdk.services.cur

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReportDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cur.CfnReportDefinition,
) : CfnResource(cdkObject), IInspectable {
  public open fun additionalArtifacts(): List<String> = unwrap(this).getAdditionalArtifacts() ?:
      emptyList()

  public open fun additionalArtifacts(`value`: List<String>) {
    unwrap(this).setAdditionalArtifacts(`value`)
  }

  public open fun additionalSchemaElements(): List<String> =
      unwrap(this).getAdditionalSchemaElements() ?: emptyList()

  public open fun additionalSchemaElements(`value`: List<String>) {
    unwrap(this).setAdditionalSchemaElements(`value`)
  }

  public open fun billingViewArn(): String? = unwrap(this).getBillingViewArn()

  public open fun billingViewArn(`value`: String) {
    unwrap(this).setBillingViewArn(`value`)
  }

  public open fun compression(): String = unwrap(this).getCompression()

  public open fun compression(`value`: String) {
    unwrap(this).setCompression(`value`)
  }

  public open fun format(): String = unwrap(this).getFormat()

  public open fun format(`value`: String) {
    unwrap(this).setFormat(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun refreshClosedReports(): Any = unwrap(this).getRefreshClosedReports()

  public open fun refreshClosedReports(`value`: Boolean) {
    unwrap(this).setRefreshClosedReports(`value`)
  }

  public open fun refreshClosedReports(`value`: IResolvable) {
    unwrap(this).setRefreshClosedReports(`value`.let(IResolvable::unwrap))
  }

  public open fun reportName(): String = unwrap(this).getReportName()

  public open fun reportName(`value`: String) {
    unwrap(this).setReportName(`value`)
  }

  public open fun reportVersioning(): String = unwrap(this).getReportVersioning()

  public open fun reportVersioning(`value`: String) {
    unwrap(this).setReportVersioning(`value`)
  }

  public open fun s3Bucket(): String = unwrap(this).getS3Bucket()

  public open fun s3Bucket(`value`: String) {
    unwrap(this).setS3Bucket(`value`)
  }

  public open fun s3Prefix(): String = unwrap(this).getS3Prefix()

  public open fun s3Prefix(`value`: String) {
    unwrap(this).setS3Prefix(`value`)
  }

  public open fun s3Region(): String = unwrap(this).getS3Region()

  public open fun s3Region(`value`: String) {
    unwrap(this).setS3Region(`value`)
  }

  public open fun timeUnit(): String = unwrap(this).getTimeUnit()

  public open fun timeUnit(`value`: String) {
    unwrap(this).setTimeUnit(`value`)
  }

  public interface Builder {
    public fun additionalArtifacts(additionalArtifacts: List<String>)

    public fun additionalSchemaElements(additionalSchemaElements: List<String>)

    public fun billingViewArn(billingViewArn: String)

    public fun compression(compression: String)

    public fun format(format: String)

    public fun refreshClosedReports(refreshClosedReports: Boolean)

    public fun refreshClosedReports(refreshClosedReports: IResolvable)

    public fun reportName(reportName: String)

    public fun reportVersioning(reportVersioning: String)

    public fun s3Bucket(s3Bucket: String)

    public fun s3Prefix(s3Prefix: String)

    public fun s3Region(s3Region: String)

    public fun timeUnit(timeUnit: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cur.CfnReportDefinition.Builder =
        software.amazon.awscdk.services.cur.CfnReportDefinition.Builder.create(scope, id)

    override fun additionalArtifacts(additionalArtifacts: List<String>) {
      cdkBuilder.additionalArtifacts(additionalArtifacts)
    }

    override fun additionalSchemaElements(additionalSchemaElements: List<String>) {
      cdkBuilder.additionalSchemaElements(additionalSchemaElements)
    }

    override fun billingViewArn(billingViewArn: String) {
      cdkBuilder.billingViewArn(billingViewArn)
    }

    override fun compression(compression: String) {
      cdkBuilder.compression(compression)
    }

    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    override fun refreshClosedReports(refreshClosedReports: Boolean) {
      cdkBuilder.refreshClosedReports(refreshClosedReports)
    }

    override fun refreshClosedReports(refreshClosedReports: IResolvable) {
      cdkBuilder.refreshClosedReports(refreshClosedReports.let(IResolvable::unwrap))
    }

    override fun reportName(reportName: String) {
      cdkBuilder.reportName(reportName)
    }

    override fun reportVersioning(reportVersioning: String) {
      cdkBuilder.reportVersioning(reportVersioning)
    }

    override fun s3Bucket(s3Bucket: String) {
      cdkBuilder.s3Bucket(s3Bucket)
    }

    override fun s3Prefix(s3Prefix: String) {
      cdkBuilder.s3Prefix(s3Prefix)
    }

    override fun s3Region(s3Region: String) {
      cdkBuilder.s3Region(s3Region)
    }

    override fun timeUnit(timeUnit: String) {
      cdkBuilder.timeUnit(timeUnit)
    }

    public fun build(): software.amazon.awscdk.services.cur.CfnReportDefinition = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReportDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReportDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cur.CfnReportDefinition):
        CfnReportDefinition = CfnReportDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnReportDefinition):
        software.amazon.awscdk.services.cur.CfnReportDefinition = wrapped.cdkObject
  }
}

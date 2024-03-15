@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cur

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnReportDefinitionProps {
  public fun additionalArtifacts(): List<String> = unwrap(this).getAdditionalArtifacts() ?:
      emptyList()

  public fun additionalSchemaElements(): List<String> = unwrap(this).getAdditionalSchemaElements()
      ?: emptyList()

  public fun billingViewArn(): String? = unwrap(this).getBillingViewArn()

  public fun compression(): String

  public fun format(): String

  public fun refreshClosedReports(): Any

  public fun reportName(): String

  public fun reportVersioning(): String

  public fun s3Bucket(): String

  public fun s3Prefix(): String

  public fun s3Region(): String

  public fun timeUnit(): String

  @CdkDslMarker
  public interface Builder {
    public fun additionalArtifacts(additionalArtifacts: List<String>)

    public fun additionalArtifacts(vararg additionalArtifacts: String)

    public fun additionalSchemaElements(additionalSchemaElements: List<String>)

    public fun additionalSchemaElements(vararg additionalSchemaElements: String)

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cur.CfnReportDefinitionProps.Builder =
        software.amazon.awscdk.services.cur.CfnReportDefinitionProps.builder()

    override fun additionalArtifacts(additionalArtifacts: List<String>) {
      cdkBuilder.additionalArtifacts(additionalArtifacts)
    }

    override fun additionalArtifacts(vararg additionalArtifacts: String): Unit =
        additionalArtifacts(additionalArtifacts.toList())

    override fun additionalSchemaElements(additionalSchemaElements: List<String>) {
      cdkBuilder.additionalSchemaElements(additionalSchemaElements)
    }

    override fun additionalSchemaElements(vararg additionalSchemaElements: String): Unit =
        additionalSchemaElements(additionalSchemaElements.toList())

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

    public fun build(): software.amazon.awscdk.services.cur.CfnReportDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cur.CfnReportDefinitionProps,
  ) : CdkObject(cdkObject), CfnReportDefinitionProps {
    override fun additionalArtifacts(): List<String> = unwrap(this).getAdditionalArtifacts() ?:
        emptyList()

    override fun additionalSchemaElements(): List<String> =
        unwrap(this).getAdditionalSchemaElements() ?: emptyList()

    override fun billingViewArn(): String? = unwrap(this).getBillingViewArn()

    override fun compression(): String = unwrap(this).getCompression()

    override fun format(): String = unwrap(this).getFormat()

    override fun refreshClosedReports(): Any = unwrap(this).getRefreshClosedReports()

    override fun reportName(): String = unwrap(this).getReportName()

    override fun reportVersioning(): String = unwrap(this).getReportVersioning()

    override fun s3Bucket(): String = unwrap(this).getS3Bucket()

    override fun s3Prefix(): String = unwrap(this).getS3Prefix()

    override fun s3Region(): String = unwrap(this).getS3Region()

    override fun timeUnit(): String = unwrap(this).getTimeUnit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReportDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cur.CfnReportDefinitionProps):
        CfnReportDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReportDefinitionProps):
        software.amazon.awscdk.services.cur.CfnReportDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cur.CfnReportDefinitionProps
  }
}

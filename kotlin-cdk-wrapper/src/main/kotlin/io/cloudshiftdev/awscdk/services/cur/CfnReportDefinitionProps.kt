@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cur

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnReportDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cur.*;
 * CfnReportDefinitionProps cfnReportDefinitionProps = CfnReportDefinitionProps.builder()
 * .compression("compression")
 * .format("format")
 * .refreshClosedReports(false)
 * .reportName("reportName")
 * .reportVersioning("reportVersioning")
 * .s3Bucket("s3Bucket")
 * .s3Prefix("s3Prefix")
 * .s3Region("s3Region")
 * .timeUnit("timeUnit")
 * // the properties below are optional
 * .additionalArtifacts(List.of("additionalArtifacts"))
 * .additionalSchemaElements(List.of("additionalSchemaElements"))
 * .billingViewArn("billingViewArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html)
 */
public interface CfnReportDefinitionProps {
  /**
   * A list of manifests that you want AWS to create for this report.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalartifacts)
   */
  public fun additionalArtifacts(): List<String> = unwrap(this).getAdditionalArtifacts() ?:
      emptyList()

  /**
   * A list of strings that indicate additional content that AWS includes in the report, such as
   * individual resource IDs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalschemaelements)
   */
  public fun additionalSchemaElements(): List<String> = unwrap(this).getAdditionalSchemaElements()
      ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the billing view.
   *
   * You can get this value by using the billing view service public APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-billingviewarn)
   */
  public fun billingViewArn(): String? = unwrap(this).getBillingViewArn()

  /**
   * The compression format that Amazon Web Services uses for the report.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-compression)
   */
  public fun compression(): String

  /**
   * The format that Amazon Web Services saves the report in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-format)
   */
  public fun format(): String

  /**
   * Whether you want AWS to update your reports after they have been finalized if AWS detects
   * charges related to previous months.
   *
   * These charges can include refunds, credits, or support fees.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-refreshclosedreports)
   */
  public fun refreshClosedReports(): Any

  /**
   * The name of the report that you want to create.
   *
   * The name must be unique, is case sensitive, and can't include spaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-reportname)
   */
  public fun reportName(): String

  /**
   * Whether you want AWS to overwrite the previous version of each report or to deliver the report
   * in addition to the previous versions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-reportversioning)
   */
  public fun reportVersioning(): String

  /**
   * The S3 bucket where Amazon Web Services delivers the report.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3bucket)
   */
  public fun s3Bucket(): String

  /**
   * The prefix that Amazon Web Services adds to the report name when Amazon Web Services delivers
   * the report.
   *
   * Your prefix can't include spaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3prefix)
   */
  public fun s3Prefix(): String

  /**
   * The Region of the S3 bucket that Amazon Web Services delivers the report into.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3region)
   */
  public fun s3Region(): String

  /**
   * The granularity of the line items in the report.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-timeunit)
   */
  public fun timeUnit(): String

  /**
   * A builder for [CfnReportDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report.
     */
    public fun additionalArtifacts(additionalArtifacts: List<String>)

    /**
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report.
     */
    public fun additionalArtifacts(vararg additionalArtifacts: String)

    /**
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     * includes in the report, such as individual resource IDs.
     */
    public fun additionalSchemaElements(additionalSchemaElements: List<String>)

    /**
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     * includes in the report, such as individual resource IDs.
     */
    public fun additionalSchemaElements(vararg additionalSchemaElements: String)

    /**
     * @param billingViewArn The Amazon Resource Name (ARN) of the billing view.
     * You can get this value by using the billing view service public APIs.
     */
    public fun billingViewArn(billingViewArn: String)

    /**
     * @param compression The compression format that Amazon Web Services uses for the report. 
     */
    public fun compression(compression: String)

    /**
     * @param format The format that Amazon Web Services saves the report in. 
     */
    public fun format(format: String)

    /**
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     * finalized if AWS detects charges related to previous months. 
     * These charges can include refunds, credits, or support fees.
     */
    public fun refreshClosedReports(refreshClosedReports: Boolean)

    /**
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     * finalized if AWS detects charges related to previous months. 
     * These charges can include refunds, credits, or support fees.
     */
    public fun refreshClosedReports(refreshClosedReports: IResolvable)

    /**
     * @param reportName The name of the report that you want to create. 
     * The name must be unique, is case sensitive, and can't include spaces.
     */
    public fun reportName(reportName: String)

    /**
     * @param reportVersioning Whether you want AWS to overwrite the previous version of each report
     * or to deliver the report in addition to the previous versions. 
     */
    public fun reportVersioning(reportVersioning: String)

    /**
     * @param s3Bucket The S3 bucket where Amazon Web Services delivers the report. 
     */
    public fun s3Bucket(s3Bucket: String)

    /**
     * @param s3Prefix The prefix that Amazon Web Services adds to the report name when Amazon Web
     * Services delivers the report. 
     * Your prefix can't include spaces.
     */
    public fun s3Prefix(s3Prefix: String)

    /**
     * @param s3Region The Region of the S3 bucket that Amazon Web Services delivers the report
     * into. 
     */
    public fun s3Region(s3Region: String)

    /**
     * @param timeUnit The granularity of the line items in the report. 
     */
    public fun timeUnit(timeUnit: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cur.CfnReportDefinitionProps.Builder =
        software.amazon.awscdk.services.cur.CfnReportDefinitionProps.builder()

    /**
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report.
     */
    override fun additionalArtifacts(additionalArtifacts: List<String>) {
      cdkBuilder.additionalArtifacts(additionalArtifacts)
    }

    /**
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report.
     */
    override fun additionalArtifacts(vararg additionalArtifacts: String): Unit =
        additionalArtifacts(additionalArtifacts.toList())

    /**
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     * includes in the report, such as individual resource IDs.
     */
    override fun additionalSchemaElements(additionalSchemaElements: List<String>) {
      cdkBuilder.additionalSchemaElements(additionalSchemaElements)
    }

    /**
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     * includes in the report, such as individual resource IDs.
     */
    override fun additionalSchemaElements(vararg additionalSchemaElements: String): Unit =
        additionalSchemaElements(additionalSchemaElements.toList())

    /**
     * @param billingViewArn The Amazon Resource Name (ARN) of the billing view.
     * You can get this value by using the billing view service public APIs.
     */
    override fun billingViewArn(billingViewArn: String) {
      cdkBuilder.billingViewArn(billingViewArn)
    }

    /**
     * @param compression The compression format that Amazon Web Services uses for the report. 
     */
    override fun compression(compression: String) {
      cdkBuilder.compression(compression)
    }

    /**
     * @param format The format that Amazon Web Services saves the report in. 
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    /**
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     * finalized if AWS detects charges related to previous months. 
     * These charges can include refunds, credits, or support fees.
     */
    override fun refreshClosedReports(refreshClosedReports: Boolean) {
      cdkBuilder.refreshClosedReports(refreshClosedReports)
    }

    /**
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     * finalized if AWS detects charges related to previous months. 
     * These charges can include refunds, credits, or support fees.
     */
    override fun refreshClosedReports(refreshClosedReports: IResolvable) {
      cdkBuilder.refreshClosedReports(refreshClosedReports.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param reportName The name of the report that you want to create. 
     * The name must be unique, is case sensitive, and can't include spaces.
     */
    override fun reportName(reportName: String) {
      cdkBuilder.reportName(reportName)
    }

    /**
     * @param reportVersioning Whether you want AWS to overwrite the previous version of each report
     * or to deliver the report in addition to the previous versions. 
     */
    override fun reportVersioning(reportVersioning: String) {
      cdkBuilder.reportVersioning(reportVersioning)
    }

    /**
     * @param s3Bucket The S3 bucket where Amazon Web Services delivers the report. 
     */
    override fun s3Bucket(s3Bucket: String) {
      cdkBuilder.s3Bucket(s3Bucket)
    }

    /**
     * @param s3Prefix The prefix that Amazon Web Services adds to the report name when Amazon Web
     * Services delivers the report. 
     * Your prefix can't include spaces.
     */
    override fun s3Prefix(s3Prefix: String) {
      cdkBuilder.s3Prefix(s3Prefix)
    }

    /**
     * @param s3Region The Region of the S3 bucket that Amazon Web Services delivers the report
     * into. 
     */
    override fun s3Region(s3Region: String) {
      cdkBuilder.s3Region(s3Region)
    }

    /**
     * @param timeUnit The granularity of the line items in the report. 
     */
    override fun timeUnit(timeUnit: String) {
      cdkBuilder.timeUnit(timeUnit)
    }

    public fun build(): software.amazon.awscdk.services.cur.CfnReportDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cur.CfnReportDefinitionProps,
  ) : CdkObject(cdkObject),
      CfnReportDefinitionProps {
    /**
     * A list of manifests that you want AWS to create for this report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalartifacts)
     */
    override fun additionalArtifacts(): List<String> = unwrap(this).getAdditionalArtifacts() ?:
        emptyList()

    /**
     * A list of strings that indicate additional content that AWS includes in the report, such as
     * individual resource IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalschemaelements)
     */
    override fun additionalSchemaElements(): List<String> =
        unwrap(this).getAdditionalSchemaElements() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the billing view.
     *
     * You can get this value by using the billing view service public APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-billingviewarn)
     */
    override fun billingViewArn(): String? = unwrap(this).getBillingViewArn()

    /**
     * The compression format that Amazon Web Services uses for the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-compression)
     */
    override fun compression(): String = unwrap(this).getCompression()

    /**
     * The format that Amazon Web Services saves the report in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-format)
     */
    override fun format(): String = unwrap(this).getFormat()

    /**
     * Whether you want AWS to update your reports after they have been finalized if AWS detects
     * charges related to previous months.
     *
     * These charges can include refunds, credits, or support fees.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-refreshclosedreports)
     */
    override fun refreshClosedReports(): Any = unwrap(this).getRefreshClosedReports()

    /**
     * The name of the report that you want to create.
     *
     * The name must be unique, is case sensitive, and can't include spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-reportname)
     */
    override fun reportName(): String = unwrap(this).getReportName()

    /**
     * Whether you want AWS to overwrite the previous version of each report or to deliver the
     * report in addition to the previous versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-reportversioning)
     */
    override fun reportVersioning(): String = unwrap(this).getReportVersioning()

    /**
     * The S3 bucket where Amazon Web Services delivers the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3bucket)
     */
    override fun s3Bucket(): String = unwrap(this).getS3Bucket()

    /**
     * The prefix that Amazon Web Services adds to the report name when Amazon Web Services delivers
     * the report.
     *
     * Your prefix can't include spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3prefix)
     */
    override fun s3Prefix(): String = unwrap(this).getS3Prefix()

    /**
     * The Region of the S3 bucket that Amazon Web Services delivers the report into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3region)
     */
    override fun s3Region(): String = unwrap(this).getS3Region()

    /**
     * The granularity of the line items in the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-timeunit)
     */
    override fun timeUnit(): String = unwrap(this).getTimeUnit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReportDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cur.CfnReportDefinitionProps):
        CfnReportDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnReportDefinitionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReportDefinitionProps):
        software.amazon.awscdk.services.cur.CfnReportDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cur.CfnReportDefinitionProps
  }
}

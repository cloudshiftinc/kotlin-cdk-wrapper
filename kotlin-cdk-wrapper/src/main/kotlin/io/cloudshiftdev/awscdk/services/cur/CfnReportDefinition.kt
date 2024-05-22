@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cur

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The definition of AWS Cost and Usage Report.
 *
 * You can specify the report name, time unit, report format, compression format, S3 bucket,
 * additional artifacts, and schema elements in the definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cur.*;
 * CfnReportDefinition cfnReportDefinition = CfnReportDefinition.Builder.create(this,
 * "MyCfnReportDefinition")
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
public open class CfnReportDefinition(
  cdkObject: software.amazon.awscdk.services.cur.CfnReportDefinition,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReportDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.cur.CfnReportDefinition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnReportDefinitionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReportDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnReportDefinitionProps(props)
  )

  /**
   * A list of manifests that you want AWS to create for this report.
   */
  public open fun additionalArtifacts(): List<String> = unwrap(this).getAdditionalArtifacts() ?:
      emptyList()

  /**
   * A list of manifests that you want AWS to create for this report.
   */
  public open fun additionalArtifacts(`value`: List<String>) {
    unwrap(this).setAdditionalArtifacts(`value`)
  }

  /**
   * A list of manifests that you want AWS to create for this report.
   */
  public open fun additionalArtifacts(vararg `value`: String): Unit =
      additionalArtifacts(`value`.toList())

  /**
   * A list of strings that indicate additional content that AWS includes in the report, such as
   * individual resource IDs.
   */
  public open fun additionalSchemaElements(): List<String> =
      unwrap(this).getAdditionalSchemaElements() ?: emptyList()

  /**
   * A list of strings that indicate additional content that AWS includes in the report, such as
   * individual resource IDs.
   */
  public open fun additionalSchemaElements(`value`: List<String>) {
    unwrap(this).setAdditionalSchemaElements(`value`)
  }

  /**
   * A list of strings that indicate additional content that AWS includes in the report, such as
   * individual resource IDs.
   */
  public open fun additionalSchemaElements(vararg `value`: String): Unit =
      additionalSchemaElements(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the billing view.
   */
  public open fun billingViewArn(): String? = unwrap(this).getBillingViewArn()

  /**
   * The Amazon Resource Name (ARN) of the billing view.
   */
  public open fun billingViewArn(`value`: String) {
    unwrap(this).setBillingViewArn(`value`)
  }

  /**
   * The compression format that Amazon Web Services uses for the report.
   */
  public open fun compression(): String = unwrap(this).getCompression()

  /**
   * The compression format that Amazon Web Services uses for the report.
   */
  public open fun compression(`value`: String) {
    unwrap(this).setCompression(`value`)
  }

  /**
   * The format that Amazon Web Services saves the report in.
   */
  public open fun format(): String = unwrap(this).getFormat()

  /**
   * The format that Amazon Web Services saves the report in.
   */
  public open fun format(`value`: String) {
    unwrap(this).setFormat(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Whether you want AWS to update your reports after they have been finalized if AWS detects
   * charges related to previous months.
   */
  public open fun refreshClosedReports(): Any = unwrap(this).getRefreshClosedReports()

  /**
   * Whether you want AWS to update your reports after they have been finalized if AWS detects
   * charges related to previous months.
   */
  public open fun refreshClosedReports(`value`: Boolean) {
    unwrap(this).setRefreshClosedReports(`value`)
  }

  /**
   * Whether you want AWS to update your reports after they have been finalized if AWS detects
   * charges related to previous months.
   */
  public open fun refreshClosedReports(`value`: IResolvable) {
    unwrap(this).setRefreshClosedReports(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The name of the report that you want to create.
   */
  public open fun reportName(): String = unwrap(this).getReportName()

  /**
   * The name of the report that you want to create.
   */
  public open fun reportName(`value`: String) {
    unwrap(this).setReportName(`value`)
  }

  /**
   * Whether you want AWS to overwrite the previous version of each report or to deliver the report
   * in addition to the previous versions.
   */
  public open fun reportVersioning(): String = unwrap(this).getReportVersioning()

  /**
   * Whether you want AWS to overwrite the previous version of each report or to deliver the report
   * in addition to the previous versions.
   */
  public open fun reportVersioning(`value`: String) {
    unwrap(this).setReportVersioning(`value`)
  }

  /**
   * The S3 bucket where Amazon Web Services delivers the report.
   */
  public open fun s3Bucket(): String = unwrap(this).getS3Bucket()

  /**
   * The S3 bucket where Amazon Web Services delivers the report.
   */
  public open fun s3Bucket(`value`: String) {
    unwrap(this).setS3Bucket(`value`)
  }

  /**
   * The prefix that Amazon Web Services adds to the report name when Amazon Web Services delivers
   * the report.
   */
  public open fun s3Prefix(): String = unwrap(this).getS3Prefix()

  /**
   * The prefix that Amazon Web Services adds to the report name when Amazon Web Services delivers
   * the report.
   */
  public open fun s3Prefix(`value`: String) {
    unwrap(this).setS3Prefix(`value`)
  }

  /**
   * The Region of the S3 bucket that Amazon Web Services delivers the report into.
   */
  public open fun s3Region(): String = unwrap(this).getS3Region()

  /**
   * The Region of the S3 bucket that Amazon Web Services delivers the report into.
   */
  public open fun s3Region(`value`: String) {
    unwrap(this).setS3Region(`value`)
  }

  /**
   * The granularity of the line items in the report.
   */
  public open fun timeUnit(): String = unwrap(this).getTimeUnit()

  /**
   * The granularity of the line items in the report.
   */
  public open fun timeUnit(`value`: String) {
    unwrap(this).setTimeUnit(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cur.CfnReportDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of manifests that you want AWS to create for this report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalartifacts)
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report. 
     */
    public fun additionalArtifacts(additionalArtifacts: List<String>)

    /**
     * A list of manifests that you want AWS to create for this report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalartifacts)
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report. 
     */
    public fun additionalArtifacts(vararg additionalArtifacts: String)

    /**
     * A list of strings that indicate additional content that AWS includes in the report, such as
     * individual resource IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalschemaelements)
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     * includes in the report, such as individual resource IDs. 
     */
    public fun additionalSchemaElements(additionalSchemaElements: List<String>)

    /**
     * A list of strings that indicate additional content that AWS includes in the report, such as
     * individual resource IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalschemaelements)
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     * includes in the report, such as individual resource IDs. 
     */
    public fun additionalSchemaElements(vararg additionalSchemaElements: String)

    /**
     * The Amazon Resource Name (ARN) of the billing view.
     *
     * You can get this value by using the billing view service public APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-billingviewarn)
     * @param billingViewArn The Amazon Resource Name (ARN) of the billing view. 
     */
    public fun billingViewArn(billingViewArn: String)

    /**
     * The compression format that Amazon Web Services uses for the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-compression)
     * @param compression The compression format that Amazon Web Services uses for the report. 
     */
    public fun compression(compression: String)

    /**
     * The format that Amazon Web Services saves the report in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-format)
     * @param format The format that Amazon Web Services saves the report in. 
     */
    public fun format(format: String)

    /**
     * Whether you want AWS to update your reports after they have been finalized if AWS detects
     * charges related to previous months.
     *
     * These charges can include refunds, credits, or support fees.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-refreshclosedreports)
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     * finalized if AWS detects charges related to previous months. 
     */
    public fun refreshClosedReports(refreshClosedReports: Boolean)

    /**
     * Whether you want AWS to update your reports after they have been finalized if AWS detects
     * charges related to previous months.
     *
     * These charges can include refunds, credits, or support fees.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-refreshclosedreports)
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     * finalized if AWS detects charges related to previous months. 
     */
    public fun refreshClosedReports(refreshClosedReports: IResolvable)

    /**
     * The name of the report that you want to create.
     *
     * The name must be unique, is case sensitive, and can't include spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-reportname)
     * @param reportName The name of the report that you want to create. 
     */
    public fun reportName(reportName: String)

    /**
     * Whether you want AWS to overwrite the previous version of each report or to deliver the
     * report in addition to the previous versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-reportversioning)
     * @param reportVersioning Whether you want AWS to overwrite the previous version of each report
     * or to deliver the report in addition to the previous versions. 
     */
    public fun reportVersioning(reportVersioning: String)

    /**
     * The S3 bucket where Amazon Web Services delivers the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3bucket)
     * @param s3Bucket The S3 bucket where Amazon Web Services delivers the report. 
     */
    public fun s3Bucket(s3Bucket: String)

    /**
     * The prefix that Amazon Web Services adds to the report name when Amazon Web Services delivers
     * the report.
     *
     * Your prefix can't include spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3prefix)
     * @param s3Prefix The prefix that Amazon Web Services adds to the report name when Amazon Web
     * Services delivers the report. 
     */
    public fun s3Prefix(s3Prefix: String)

    /**
     * The Region of the S3 bucket that Amazon Web Services delivers the report into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3region)
     * @param s3Region The Region of the S3 bucket that Amazon Web Services delivers the report
     * into. 
     */
    public fun s3Region(s3Region: String)

    /**
     * The granularity of the line items in the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-timeunit)
     * @param timeUnit The granularity of the line items in the report. 
     */
    public fun timeUnit(timeUnit: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cur.CfnReportDefinition.Builder =
        software.amazon.awscdk.services.cur.CfnReportDefinition.Builder.create(scope, id)

    /**
     * A list of manifests that you want AWS to create for this report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalartifacts)
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report. 
     */
    override fun additionalArtifacts(additionalArtifacts: List<String>) {
      cdkBuilder.additionalArtifacts(additionalArtifacts)
    }

    /**
     * A list of manifests that you want AWS to create for this report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalartifacts)
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report. 
     */
    override fun additionalArtifacts(vararg additionalArtifacts: String): Unit =
        additionalArtifacts(additionalArtifacts.toList())

    /**
     * A list of strings that indicate additional content that AWS includes in the report, such as
     * individual resource IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalschemaelements)
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     * includes in the report, such as individual resource IDs. 
     */
    override fun additionalSchemaElements(additionalSchemaElements: List<String>) {
      cdkBuilder.additionalSchemaElements(additionalSchemaElements)
    }

    /**
     * A list of strings that indicate additional content that AWS includes in the report, such as
     * individual resource IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalschemaelements)
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     * includes in the report, such as individual resource IDs. 
     */
    override fun additionalSchemaElements(vararg additionalSchemaElements: String): Unit =
        additionalSchemaElements(additionalSchemaElements.toList())

    /**
     * The Amazon Resource Name (ARN) of the billing view.
     *
     * You can get this value by using the billing view service public APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-billingviewarn)
     * @param billingViewArn The Amazon Resource Name (ARN) of the billing view. 
     */
    override fun billingViewArn(billingViewArn: String) {
      cdkBuilder.billingViewArn(billingViewArn)
    }

    /**
     * The compression format that Amazon Web Services uses for the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-compression)
     * @param compression The compression format that Amazon Web Services uses for the report. 
     */
    override fun compression(compression: String) {
      cdkBuilder.compression(compression)
    }

    /**
     * The format that Amazon Web Services saves the report in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-format)
     * @param format The format that Amazon Web Services saves the report in. 
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    /**
     * Whether you want AWS to update your reports after they have been finalized if AWS detects
     * charges related to previous months.
     *
     * These charges can include refunds, credits, or support fees.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-refreshclosedreports)
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     * finalized if AWS detects charges related to previous months. 
     */
    override fun refreshClosedReports(refreshClosedReports: Boolean) {
      cdkBuilder.refreshClosedReports(refreshClosedReports)
    }

    /**
     * Whether you want AWS to update your reports after they have been finalized if AWS detects
     * charges related to previous months.
     *
     * These charges can include refunds, credits, or support fees.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-refreshclosedreports)
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     * finalized if AWS detects charges related to previous months. 
     */
    override fun refreshClosedReports(refreshClosedReports: IResolvable) {
      cdkBuilder.refreshClosedReports(refreshClosedReports.let(IResolvable.Companion::unwrap))
    }

    /**
     * The name of the report that you want to create.
     *
     * The name must be unique, is case sensitive, and can't include spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-reportname)
     * @param reportName The name of the report that you want to create. 
     */
    override fun reportName(reportName: String) {
      cdkBuilder.reportName(reportName)
    }

    /**
     * Whether you want AWS to overwrite the previous version of each report or to deliver the
     * report in addition to the previous versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-reportversioning)
     * @param reportVersioning Whether you want AWS to overwrite the previous version of each report
     * or to deliver the report in addition to the previous versions. 
     */
    override fun reportVersioning(reportVersioning: String) {
      cdkBuilder.reportVersioning(reportVersioning)
    }

    /**
     * The S3 bucket where Amazon Web Services delivers the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3bucket)
     * @param s3Bucket The S3 bucket where Amazon Web Services delivers the report. 
     */
    override fun s3Bucket(s3Bucket: String) {
      cdkBuilder.s3Bucket(s3Bucket)
    }

    /**
     * The prefix that Amazon Web Services adds to the report name when Amazon Web Services delivers
     * the report.
     *
     * Your prefix can't include spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3prefix)
     * @param s3Prefix The prefix that Amazon Web Services adds to the report name when Amazon Web
     * Services delivers the report. 
     */
    override fun s3Prefix(s3Prefix: String) {
      cdkBuilder.s3Prefix(s3Prefix)
    }

    /**
     * The Region of the S3 bucket that Amazon Web Services delivers the report into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3region)
     * @param s3Region The Region of the S3 bucket that Amazon Web Services delivers the report
     * into. 
     */
    override fun s3Region(s3Region: String) {
      cdkBuilder.s3Region(s3Region)
    }

    /**
     * The granularity of the line items in the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-timeunit)
     * @param timeUnit The granularity of the line items in the report. 
     */
    override fun timeUnit(timeUnit: String) {
      cdkBuilder.timeUnit(timeUnit)
    }

    public fun build(): software.amazon.awscdk.services.cur.CfnReportDefinition = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cur.CfnReportDefinition.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.cur.CfnReportDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.cur.CfnReportDefinition
  }
}

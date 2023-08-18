@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cur

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cur.CfnReportDefinition
import software.constructs.Construct

/**
 * The definition of AWS Cost and Usage Report.
 *
 * You can specify the report name, time unit, report format, compression format, S3 bucket,
 * additional artifacts, and schema elements in the definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cur.*;
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
@CdkDslMarker
public class CfnReportDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReportDefinition.Builder =
        CfnReportDefinition.Builder.create(scope, id)

    private val _additionalArtifacts: MutableList<String> = mutableListOf()

    private val _additionalSchemaElements: MutableList<String> = mutableListOf()

    /**
     * A list of manifests that you want AWS to create for this report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalartifacts)
     *
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report.
     */
    public fun additionalArtifacts(vararg additionalArtifacts: String) {
        _additionalArtifacts.addAll(listOf(*additionalArtifacts))
    }

    /**
     * A list of manifests that you want AWS to create for this report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalartifacts)
     *
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report.
     */
    public fun additionalArtifacts(additionalArtifacts: Collection<String>) {
        _additionalArtifacts.addAll(additionalArtifacts)
    }

    /**
     * A list of strings that indicate additional content that AWS includes in the report, such as
     * individual resource IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalschemaelements)
     *
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     *   includes in the report, such as individual resource IDs.
     */
    public fun additionalSchemaElements(vararg additionalSchemaElements: String) {
        _additionalSchemaElements.addAll(listOf(*additionalSchemaElements))
    }

    /**
     * A list of strings that indicate additional content that AWS includes in the report, such as
     * individual resource IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-additionalschemaelements)
     *
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     *   includes in the report, such as individual resource IDs.
     */
    public fun additionalSchemaElements(additionalSchemaElements: Collection<String>) {
        _additionalSchemaElements.addAll(additionalSchemaElements)
    }

    /**
     * The Amazon Resource Name (ARN) of the billing view.
     *
     * You can get this value by using the billing view service public APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-billingviewarn)
     *
     * @param billingViewArn The Amazon Resource Name (ARN) of the billing view.
     */
    public fun billingViewArn(billingViewArn: String) {
        cdkBuilder.billingViewArn(billingViewArn)
    }

    /**
     * The compression format that Amazon Web Services uses for the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-compression)
     *
     * @param compression The compression format that Amazon Web Services uses for the report.
     */
    public fun compression(compression: String) {
        cdkBuilder.compression(compression)
    }

    /**
     * The format that Amazon Web Services saves the report in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-format)
     *
     * @param format The format that Amazon Web Services saves the report in.
     */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /**
     * Whether you want AWS to update your reports after they have been finalized if AWS detects
     * charges related to previous months.
     *
     * These charges can include refunds, credits, or support fees.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-refreshclosedreports)
     *
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     *   finalized if AWS detects charges related to previous months.
     */
    public fun refreshClosedReports(refreshClosedReports: Boolean) {
        cdkBuilder.refreshClosedReports(refreshClosedReports)
    }

    /**
     * Whether you want AWS to update your reports after they have been finalized if AWS detects
     * charges related to previous months.
     *
     * These charges can include refunds, credits, or support fees.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-refreshclosedreports)
     *
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     *   finalized if AWS detects charges related to previous months.
     */
    public fun refreshClosedReports(refreshClosedReports: IResolvable) {
        cdkBuilder.refreshClosedReports(refreshClosedReports)
    }

    /**
     * The name of the report that you want to create.
     *
     * The name must be unique, is case sensitive, and can't include spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-reportname)
     *
     * @param reportName The name of the report that you want to create.
     */
    public fun reportName(reportName: String) {
        cdkBuilder.reportName(reportName)
    }

    /**
     * Whether you want AWS to overwrite the previous version of each report or to deliver the
     * report in addition to the previous versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-reportversioning)
     *
     * @param reportVersioning Whether you want AWS to overwrite the previous version of each report
     *   or to deliver the report in addition to the previous versions.
     */
    public fun reportVersioning(reportVersioning: String) {
        cdkBuilder.reportVersioning(reportVersioning)
    }

    /**
     * The S3 bucket where Amazon Web Services delivers the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3bucket)
     *
     * @param s3Bucket The S3 bucket where Amazon Web Services delivers the report.
     */
    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    /**
     * The prefix that Amazon Web Services adds to the report name when Amazon Web Services delivers
     * the report.
     *
     * Your prefix can't include spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3prefix)
     *
     * @param s3Prefix The prefix that Amazon Web Services adds to the report name when Amazon Web
     *   Services delivers the report.
     */
    public fun s3Prefix(s3Prefix: String) {
        cdkBuilder.s3Prefix(s3Prefix)
    }

    /**
     * The Region of the S3 bucket that Amazon Web Services delivers the report into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-s3region)
     *
     * @param s3Region The Region of the S3 bucket that Amazon Web Services delivers the report
     *   into.
     */
    public fun s3Region(s3Region: String) {
        cdkBuilder.s3Region(s3Region)
    }

    /**
     * The granularity of the line items in the report.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html#cfn-cur-reportdefinition-timeunit)
     *
     * @param timeUnit The granularity of the line items in the report.
     */
    public fun timeUnit(timeUnit: String) {
        cdkBuilder.timeUnit(timeUnit)
    }

    public fun build(): CfnReportDefinition {
        if (_additionalArtifacts.isNotEmpty()) cdkBuilder.additionalArtifacts(_additionalArtifacts)
        if (_additionalSchemaElements.isNotEmpty())
            cdkBuilder.additionalSchemaElements(_additionalSchemaElements)
        return cdkBuilder.build()
    }
}

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
import software.amazon.awscdk.services.cur.CfnReportDefinitionProps

/**
 * Properties for defining a `CfnReportDefinition`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cur.*;
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
@CdkDslMarker
public class CfnReportDefinitionPropsDsl {
    private val cdkBuilder: CfnReportDefinitionProps.Builder = CfnReportDefinitionProps.builder()

    private val _additionalArtifacts: MutableList<String> = mutableListOf()

    private val _additionalSchemaElements: MutableList<String> = mutableListOf()

    /**
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report.
     */
    public fun additionalArtifacts(vararg additionalArtifacts: String) {
        _additionalArtifacts.addAll(listOf(*additionalArtifacts))
    }

    /**
     * @param additionalArtifacts A list of manifests that you want AWS to create for this report.
     */
    public fun additionalArtifacts(additionalArtifacts: Collection<String>) {
        _additionalArtifacts.addAll(additionalArtifacts)
    }

    /**
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     *   includes in the report, such as individual resource IDs.
     */
    public fun additionalSchemaElements(vararg additionalSchemaElements: String) {
        _additionalSchemaElements.addAll(listOf(*additionalSchemaElements))
    }

    /**
     * @param additionalSchemaElements A list of strings that indicate additional content that AWS
     *   includes in the report, such as individual resource IDs.
     */
    public fun additionalSchemaElements(additionalSchemaElements: Collection<String>) {
        _additionalSchemaElements.addAll(additionalSchemaElements)
    }

    /**
     * @param billingViewArn The Amazon Resource Name (ARN) of the billing view. You can get this
     *   value by using the billing view service public APIs.
     */
    public fun billingViewArn(billingViewArn: String) {
        cdkBuilder.billingViewArn(billingViewArn)
    }

    /** @param compression The compression format that Amazon Web Services uses for the report. */
    public fun compression(compression: String) {
        cdkBuilder.compression(compression)
    }

    /** @param format The format that Amazon Web Services saves the report in. */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /**
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     *   finalized if AWS detects charges related to previous months. These charges can include
     *   refunds, credits, or support fees.
     */
    public fun refreshClosedReports(refreshClosedReports: Boolean) {
        cdkBuilder.refreshClosedReports(refreshClosedReports)
    }

    /**
     * @param refreshClosedReports Whether you want AWS to update your reports after they have been
     *   finalized if AWS detects charges related to previous months. These charges can include
     *   refunds, credits, or support fees.
     */
    public fun refreshClosedReports(refreshClosedReports: IResolvable) {
        cdkBuilder.refreshClosedReports(refreshClosedReports)
    }

    /**
     * @param reportName The name of the report that you want to create. The name must be unique, is
     *   case sensitive, and can't include spaces.
     */
    public fun reportName(reportName: String) {
        cdkBuilder.reportName(reportName)
    }

    /**
     * @param reportVersioning Whether you want AWS to overwrite the previous version of each report
     *   or to deliver the report in addition to the previous versions.
     */
    public fun reportVersioning(reportVersioning: String) {
        cdkBuilder.reportVersioning(reportVersioning)
    }

    /** @param s3Bucket The S3 bucket where Amazon Web Services delivers the report. */
    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    /**
     * @param s3Prefix The prefix that Amazon Web Services adds to the report name when Amazon Web
     *   Services delivers the report. Your prefix can't include spaces.
     */
    public fun s3Prefix(s3Prefix: String) {
        cdkBuilder.s3Prefix(s3Prefix)
    }

    /**
     * @param s3Region The Region of the S3 bucket that Amazon Web Services delivers the report
     *   into.
     */
    public fun s3Region(s3Region: String) {
        cdkBuilder.s3Region(s3Region)
    }

    /** @param timeUnit The granularity of the line items in the report. */
    public fun timeUnit(timeUnit: String) {
        cdkBuilder.timeUnit(timeUnit)
    }

    public fun build(): CfnReportDefinitionProps {
        if (_additionalArtifacts.isNotEmpty()) cdkBuilder.additionalArtifacts(_additionalArtifacts)
        if (_additionalSchemaElements.isNotEmpty())
            cdkBuilder.additionalSchemaElements(_additionalSchemaElements)
        return cdkBuilder.build()
    }
}

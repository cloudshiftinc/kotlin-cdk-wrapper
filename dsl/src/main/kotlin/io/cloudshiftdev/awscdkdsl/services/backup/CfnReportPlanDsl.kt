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

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.backup.CfnReportPlan
import software.constructs.Construct

/**
 * Creates a report plan.
 *
 * A report plan is a document that contains information about the contents of the report and where
 * AWS Backup will deliver it.
 *
 * If you call `CreateReportPlan` with a plan that already exists, you receive an
 * `AlreadyExistsException` exception.
 *
 * For a sample AWS CloudFormation template, see the
 * [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/assigning-resources.html#assigning-resources-cfn)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * Object reportDeliveryChannel;
 * Object reportSetting;
 * CfnReportPlan cfnReportPlan = CfnReportPlan.Builder.create(this, "MyCfnReportPlan")
 * .reportDeliveryChannel(reportDeliveryChannel)
 * .reportSetting(reportSetting)
 * // the properties below are optional
 * .reportPlanDescription("reportPlanDescription")
 * .reportPlanName("reportPlanName")
 * .reportPlanTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html)
 */
@CdkDslMarker
public class CfnReportPlanDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReportPlan.Builder = CfnReportPlan.Builder.create(scope, id)

    private val _reportPlanTags: MutableList<CfnTag> = mutableListOf()

    /**
     * Contains information about where and how to deliver your reports, specifically your Amazon S3
     * bucket name, S3 key prefix, and the formats of your reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportdeliverychannel)
     *
     * @param reportDeliveryChannel Contains information about where and how to deliver your
     *   reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your
     *   reports.
     */
    public fun reportDeliveryChannel(reportDeliveryChannel: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(reportDeliveryChannel)
        cdkBuilder.reportDeliveryChannel(builder.map)
    }

    /**
     * Contains information about where and how to deliver your reports, specifically your Amazon S3
     * bucket name, S3 key prefix, and the formats of your reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportdeliverychannel)
     *
     * @param reportDeliveryChannel Contains information about where and how to deliver your
     *   reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your
     *   reports.
     */
    public fun reportDeliveryChannel(reportDeliveryChannel: Any) {
        cdkBuilder.reportDeliveryChannel(reportDeliveryChannel)
    }

    /**
     * An optional description of the report plan with a maximum 1,024 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplandescription)
     *
     * @param reportPlanDescription An optional description of the report plan with a maximum 1,024
     *   characters.
     */
    public fun reportPlanDescription(reportPlanDescription: String) {
        cdkBuilder.reportPlanDescription(reportPlanDescription)
    }

    /**
     * The unique name of the report plan.
     *
     * This name is between 1 and 256 characters starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplanname)
     *
     * @param reportPlanName The unique name of the report plan.
     */
    public fun reportPlanName(reportPlanName: String) {
        cdkBuilder.reportPlanName(reportPlanName)
    }

    /**
     * A list of tags to tag your report plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplantags)
     *
     * @param reportPlanTags A list of tags to tag your report plan.
     */
    public fun reportPlanTags(reportPlanTags: CfnTagDsl.() -> Unit) {
        _reportPlanTags.add(CfnTagDsl().apply(reportPlanTags).build())
    }

    /**
     * A list of tags to tag your report plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplantags)
     *
     * @param reportPlanTags A list of tags to tag your report plan.
     */
    public fun reportPlanTags(reportPlanTags: Collection<CfnTag>) {
        _reportPlanTags.addAll(reportPlanTags)
    }

    /**
     * Identifies the report template for the report. Reports are built using a report template. The
     * report templates are:.
     *
     * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT
     * | RESTORE_JOB_REPORT`
     *
     * If the report template is `RESOURCE_COMPLIANCE_REPORT` or `CONTROL_COMPLIANCE_REPORT` , this
     * API resource also describes the report coverage by AWS Regions and frameworks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportsetting)
     *
     * @param reportSetting Identifies the report template for the report. Reports are built using a
     *   report template. The report templates are:.
     */
    public fun reportSetting(reportSetting: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(reportSetting)
        cdkBuilder.reportSetting(builder.map)
    }

    /**
     * Identifies the report template for the report. Reports are built using a report template. The
     * report templates are:.
     *
     * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT
     * | RESTORE_JOB_REPORT`
     *
     * If the report template is `RESOURCE_COMPLIANCE_REPORT` or `CONTROL_COMPLIANCE_REPORT` , this
     * API resource also describes the report coverage by AWS Regions and frameworks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportsetting)
     *
     * @param reportSetting Identifies the report template for the report. Reports are built using a
     *   report template. The report templates are:.
     */
    public fun reportSetting(reportSetting: Any) {
        cdkBuilder.reportSetting(reportSetting)
    }

    public fun build(): CfnReportPlan {
        if (_reportPlanTags.isNotEmpty()) cdkBuilder.reportPlanTags(_reportPlanTags)
        return cdkBuilder.build()
    }
}

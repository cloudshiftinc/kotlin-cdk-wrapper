@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnReportPlan`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * Object reportDeliveryChannel;
 * Object reportSetting;
 * CfnReportPlanProps cfnReportPlanProps = CfnReportPlanProps.builder()
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
public interface CfnReportPlanProps {
  /**
   * Contains information about where and how to deliver your reports, specifically your Amazon S3
   * bucket name, S3 key prefix, and the formats of your reports.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportdeliverychannel)
   */
  public fun reportDeliveryChannel(): Any

  /**
   * An optional description of the report plan with a maximum 1,024 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplandescription)
   */
  public fun reportPlanDescription(): String? = unwrap(this).getReportPlanDescription()

  /**
   * The unique name of the report plan.
   *
   * This name is between 1 and 256 characters starting with a letter, and consisting of letters
   * (a-z, A-Z), numbers (0-9), and underscores (_).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplanname)
   */
  public fun reportPlanName(): String? = unwrap(this).getReportPlanName()

  /**
   * A list of tags to tag your report plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplantags)
   */
  public fun reportPlanTags(): List<CfnTag> = unwrap(this).getReportPlanTags()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Identifies the report template for the report. Reports are built using a report template. The
   * report templates are:.
   *
   * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT |
   * RESTORE_JOB_REPORT`
   *
   * If the report template is `RESOURCE_COMPLIANCE_REPORT` or `CONTROL_COMPLIANCE_REPORT` , this
   * API resource also describes the report coverage by AWS Regions and frameworks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportsetting)
   */
  public fun reportSetting(): Any

  /**
   * A builder for [CfnReportPlanProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param reportDeliveryChannel Contains information about where and how to deliver your
     * reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your
     * reports. 
     */
    public fun reportDeliveryChannel(reportDeliveryChannel: Any)

    /**
     * @param reportPlanDescription An optional description of the report plan with a maximum 1,024
     * characters.
     */
    public fun reportPlanDescription(reportPlanDescription: String)

    /**
     * @param reportPlanName The unique name of the report plan.
     * This name is between 1 and 256 characters starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     */
    public fun reportPlanName(reportPlanName: String)

    /**
     * @param reportPlanTags A list of tags to tag your report plan.
     */
    public fun reportPlanTags(reportPlanTags: List<CfnTag>)

    /**
     * @param reportPlanTags A list of tags to tag your report plan.
     */
    public fun reportPlanTags(vararg reportPlanTags: CfnTag)

    /**
     * @param reportSetting Identifies the report template for the report. Reports are built using a
     * report template. The report templates are:. 
     * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT
     * | RESTORE_JOB_REPORT`
     *
     * If the report template is `RESOURCE_COMPLIANCE_REPORT` or `CONTROL_COMPLIANCE_REPORT` , this
     * API resource also describes the report coverage by AWS Regions and frameworks.
     */
    public fun reportSetting(reportSetting: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnReportPlanProps.Builder =
        software.amazon.awscdk.services.backup.CfnReportPlanProps.builder()

    /**
     * @param reportDeliveryChannel Contains information about where and how to deliver your
     * reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your
     * reports. 
     */
    override fun reportDeliveryChannel(reportDeliveryChannel: Any) {
      cdkBuilder.reportDeliveryChannel(reportDeliveryChannel)
    }

    /**
     * @param reportPlanDescription An optional description of the report plan with a maximum 1,024
     * characters.
     */
    override fun reportPlanDescription(reportPlanDescription: String) {
      cdkBuilder.reportPlanDescription(reportPlanDescription)
    }

    /**
     * @param reportPlanName The unique name of the report plan.
     * This name is between 1 and 256 characters starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     */
    override fun reportPlanName(reportPlanName: String) {
      cdkBuilder.reportPlanName(reportPlanName)
    }

    /**
     * @param reportPlanTags A list of tags to tag your report plan.
     */
    override fun reportPlanTags(reportPlanTags: List<CfnTag>) {
      cdkBuilder.reportPlanTags(reportPlanTags.map(CfnTag::unwrap))
    }

    /**
     * @param reportPlanTags A list of tags to tag your report plan.
     */
    override fun reportPlanTags(vararg reportPlanTags: CfnTag): Unit =
        reportPlanTags(reportPlanTags.toList())

    /**
     * @param reportSetting Identifies the report template for the report. Reports are built using a
     * report template. The report templates are:. 
     * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT
     * | RESTORE_JOB_REPORT`
     *
     * If the report template is `RESOURCE_COMPLIANCE_REPORT` or `CONTROL_COMPLIANCE_REPORT` , this
     * API resource also describes the report coverage by AWS Regions and frameworks.
     */
    override fun reportSetting(reportSetting: Any) {
      cdkBuilder.reportSetting(reportSetting)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnReportPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.CfnReportPlanProps,
  ) : CdkObject(cdkObject), CfnReportPlanProps {
    /**
     * Contains information about where and how to deliver your reports, specifically your Amazon S3
     * bucket name, S3 key prefix, and the formats of your reports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportdeliverychannel)
     */
    override fun reportDeliveryChannel(): Any = unwrap(this).getReportDeliveryChannel()

    /**
     * An optional description of the report plan with a maximum 1,024 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplandescription)
     */
    override fun reportPlanDescription(): String? = unwrap(this).getReportPlanDescription()

    /**
     * The unique name of the report plan.
     *
     * This name is between 1 and 256 characters starting with a letter, and consisting of letters
     * (a-z, A-Z), numbers (0-9), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplanname)
     */
    override fun reportPlanName(): String? = unwrap(this).getReportPlanName()

    /**
     * A list of tags to tag your report plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-reportplan.html#cfn-backup-reportplan-reportplantags)
     */
    override fun reportPlanTags(): List<CfnTag> =
        unwrap(this).getReportPlanTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun reportSetting(): Any = unwrap(this).getReportSetting()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReportPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnReportPlanProps):
        CfnReportPlanProps = CdkObjectWrappers.wrap(cdkObject) as CfnReportPlanProps

    internal fun unwrap(wrapped: CfnReportPlanProps):
        software.amazon.awscdk.services.backup.CfnReportPlanProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.backup.CfnReportPlanProps
  }
}

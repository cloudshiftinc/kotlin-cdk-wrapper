@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnReportPlanProps

@CdkDslMarker
public class CfnReportPlanPropsDsl {
  private val cdkBuilder: CfnReportPlanProps.Builder = CfnReportPlanProps.builder()

  private val _reportPlanTags: MutableList<Any> = mutableListOf()

  /**
   * @param reportDeliveryChannel Contains information about where and how to deliver your reports,
   * specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. 
   */
  public fun reportDeliveryChannel(reportDeliveryChannel: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(reportDeliveryChannel)
    cdkBuilder.reportDeliveryChannel(builder.map)
  }

  /**
   * @param reportDeliveryChannel Contains information about where and how to deliver your reports,
   * specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports. 
   */
  public fun reportDeliveryChannel(reportDeliveryChannel: Any) {
    cdkBuilder.reportDeliveryChannel(reportDeliveryChannel)
  }

  /**
   * @param reportPlanDescription An optional description of the report plan with a maximum 1,024
   * characters.
   */
  public fun reportPlanDescription(reportPlanDescription: String) {
    cdkBuilder.reportPlanDescription(reportPlanDescription)
  }

  /**
   * @param reportPlanName The unique name of the report plan.
   * This name is between 1 and 256 characters starting with a letter, and consisting of letters
   * (a-z, A-Z), numbers (0-9), and underscores (_).
   */
  public fun reportPlanName(reportPlanName: String) {
    cdkBuilder.reportPlanName(reportPlanName)
  }

  /**
   * @param reportPlanTags A list of tags to tag your report plan.
   */
  public fun reportPlanTags(vararg reportPlanTags: Any) {
    _reportPlanTags.addAll(listOf(*reportPlanTags))
  }

  /**
   * @param reportPlanTags A list of tags to tag your report plan.
   */
  public fun reportPlanTags(reportPlanTags: Collection<Any>) {
    _reportPlanTags.addAll(reportPlanTags)
  }

  /**
   * @param reportPlanTags A list of tags to tag your report plan.
   */
  public fun reportPlanTags(reportPlanTags: IResolvable) {
    cdkBuilder.reportPlanTags(reportPlanTags)
  }

  /**
   * @param reportSetting Identifies the report template for the report. Reports are built using a
   * report template. The report templates are:. 
   * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT |
   * RESTORE_JOB_REPORT`
   *
   * If the report template is `RESOURCE_COMPLIANCE_REPORT` or `CONTROL_COMPLIANCE_REPORT` , this
   * API resource also describes the report coverage by AWS Regions and frameworks.
   */
  public fun reportSetting(reportSetting: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(reportSetting)
    cdkBuilder.reportSetting(builder.map)
  }

  /**
   * @param reportSetting Identifies the report template for the report. Reports are built using a
   * report template. The report templates are:. 
   * `RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT |
   * RESTORE_JOB_REPORT`
   *
   * If the report template is `RESOURCE_COMPLIANCE_REPORT` or `CONTROL_COMPLIANCE_REPORT` , this
   * API resource also describes the report coverage by AWS Regions and frameworks.
   */
  public fun reportSetting(reportSetting: Any) {
    cdkBuilder.reportSetting(reportSetting)
  }

  public fun build(): CfnReportPlanProps {
    if(_reportPlanTags.isNotEmpty()) cdkBuilder.reportPlanTags(_reportPlanTags)
    return cdkBuilder.build()
  }
}

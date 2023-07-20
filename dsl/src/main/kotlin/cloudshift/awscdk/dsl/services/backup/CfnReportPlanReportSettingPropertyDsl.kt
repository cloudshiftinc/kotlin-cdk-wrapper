@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.backup.CfnReportPlan

@CdkDslMarker
public class CfnReportPlanReportSettingPropertyDsl {
  private val cdkBuilder: CfnReportPlan.ReportSettingProperty.Builder =
      CfnReportPlan.ReportSettingProperty.builder()

  private val _accounts: MutableList<String> = mutableListOf()

  private val _frameworkArns: MutableList<String> = mutableListOf()

  private val _organizationUnits: MutableList<String> = mutableListOf()

  private val _regions: MutableList<String> = mutableListOf()

  public fun accounts(vararg accounts: String) {
    _accounts.addAll(listOf(*accounts))
  }

  public fun accounts(accounts: Collection<String>) {
    _accounts.addAll(accounts)
  }

  public fun frameworkArns(vararg frameworkArns: String) {
    _frameworkArns.addAll(listOf(*frameworkArns))
  }

  public fun frameworkArns(frameworkArns: Collection<String>) {
    _frameworkArns.addAll(frameworkArns)
  }

  public fun organizationUnits(vararg organizationUnits: String) {
    _organizationUnits.addAll(listOf(*organizationUnits))
  }

  public fun organizationUnits(organizationUnits: Collection<String>) {
    _organizationUnits.addAll(organizationUnits)
  }

  public fun regions(vararg regions: String) {
    _regions.addAll(listOf(*regions))
  }

  public fun regions(regions: Collection<String>) {
    _regions.addAll(regions)
  }

  public fun reportTemplate(reportTemplate: String) {
    cdkBuilder.reportTemplate(reportTemplate)
  }

  public fun build(): CfnReportPlan.ReportSettingProperty {
    if(_accounts.isNotEmpty()) cdkBuilder.accounts(_accounts)
    if(_frameworkArns.isNotEmpty()) cdkBuilder.frameworkArns(_frameworkArns)
    if(_organizationUnits.isNotEmpty()) cdkBuilder.organizationUnits(_organizationUnits)
    if(_regions.isNotEmpty()) cdkBuilder.regions(_regions)
    return cdkBuilder.build()
  }
}

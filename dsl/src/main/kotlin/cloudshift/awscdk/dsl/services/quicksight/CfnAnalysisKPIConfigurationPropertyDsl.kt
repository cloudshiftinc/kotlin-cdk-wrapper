@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration of a KPI visual.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-kpiconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisKPIConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.KPIConfigurationProperty.Builder =
      CfnAnalysis.KPIConfigurationProperty.builder()

  /**
   * @param fieldWells The field well configuration of a KPI visual.
   */
  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param fieldWells The field well configuration of a KPI visual.
   */
  public fun fieldWells(fieldWells: CfnAnalysis.KPIFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param kpiOptions The options that determine the presentation of a KPI visual.
   */
  public fun kpiOptions(kpiOptions: IResolvable) {
    cdkBuilder.kpiOptions(kpiOptions)
  }

  /**
   * @param kpiOptions The options that determine the presentation of a KPI visual.
   */
  public fun kpiOptions(kpiOptions: CfnAnalysis.KPIOptionsProperty) {
    cdkBuilder.kpiOptions(kpiOptions)
  }

  /**
   * @param sortConfiguration The sort configuration of a KPI visual.
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration of a KPI visual.
   */
  public fun sortConfiguration(sortConfiguration: CfnAnalysis.KPISortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun build(): CfnAnalysis.KPIConfigurationProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateRelativeDatesFilterPropertyDsl {
  private val cdkBuilder: CfnTemplate.RelativeDatesFilterProperty.Builder =
      CfnTemplate.RelativeDatesFilterProperty.builder()

  /**
   * @param anchorDateConfiguration The date configuration of the filter. 
   */
  public fun anchorDateConfiguration(anchorDateConfiguration: IResolvable) {
    cdkBuilder.anchorDateConfiguration(anchorDateConfiguration)
  }

  /**
   * @param anchorDateConfiguration The date configuration of the filter. 
   */
  public
      fun anchorDateConfiguration(anchorDateConfiguration: CfnTemplate.AnchorDateConfigurationProperty) {
    cdkBuilder.anchorDateConfiguration(anchorDateConfiguration)
  }

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param excludePeriodConfiguration The configuration for the exclude period of the filter.
   */
  public fun excludePeriodConfiguration(excludePeriodConfiguration: IResolvable) {
    cdkBuilder.excludePeriodConfiguration(excludePeriodConfiguration)
  }

  /**
   * @param excludePeriodConfiguration The configuration for the exclude period of the filter.
   */
  public
      fun excludePeriodConfiguration(excludePeriodConfiguration: CfnTemplate.ExcludePeriodConfigurationProperty) {
    cdkBuilder.excludePeriodConfiguration(excludePeriodConfiguration)
  }

  /**
   * @param filterId An identifier that uniquely identifies a filter within a dashboard, analysis,
   * or template. 
   */
  public fun filterId(filterId: String) {
    cdkBuilder.filterId(filterId)
  }

  /**
   * @param minimumGranularity The minimum granularity (period granularity) of the relative dates
   * filter.
   */
  public fun minimumGranularity(minimumGranularity: String) {
    cdkBuilder.minimumGranularity(minimumGranularity)
  }

  /**
   * @param nullOption This option determines how null values should be treated when filtering data.
   * 
   * * `ALL_VALUES` : Include null values in filtered results.
   * * `NULLS_ONLY` : Only include null values in filtered results.
   * * `NON_NULLS_ONLY` : Exclude null values from filtered results.
   */
  public fun nullOption(nullOption: String) {
    cdkBuilder.nullOption(nullOption)
  }

  /**
   * @param parameterName The parameter whose value should be used for the filter value.
   */
  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  /**
   * @param relativeDateType The range date type of the filter. Choose one of the options below:. 
   * * `PREVIOUS`
   * * `THIS`
   * * `LAST`
   * * `NOW`
   * * `NEXT`
   */
  public fun relativeDateType(relativeDateType: String) {
    cdkBuilder.relativeDateType(relativeDateType)
  }

  /**
   * @param relativeDateValue The date value of the filter.
   */
  public fun relativeDateValue(relativeDateValue: Number) {
    cdkBuilder.relativeDateValue(relativeDateValue)
  }

  /**
   * @param timeGranularity The level of time precision that is used to aggregate `DateTime` values.
   * 
   */
  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun build(): CfnTemplate.RelativeDatesFilterProperty = cdkBuilder.build()
}

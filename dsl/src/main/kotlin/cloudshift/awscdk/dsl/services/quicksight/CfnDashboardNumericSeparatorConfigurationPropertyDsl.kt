@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardNumericSeparatorConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.NumericSeparatorConfigurationProperty.Builder =
      CfnDashboard.NumericSeparatorConfigurationProperty.builder()

  /**
   * @param decimalSeparator Determines the decimal separator.
   */
  public fun decimalSeparator(decimalSeparator: String) {
    cdkBuilder.decimalSeparator(decimalSeparator)
  }

  /**
   * @param thousandsSeparator The options that determine the thousands separator configuration.
   */
  public fun thousandsSeparator(thousandsSeparator: IResolvable) {
    cdkBuilder.thousandsSeparator(thousandsSeparator)
  }

  /**
   * @param thousandsSeparator The options that determine the thousands separator configuration.
   */
  public fun thousandsSeparator(thousandsSeparator: CfnDashboard.ThousandSeparatorOptionsProperty) {
    cdkBuilder.thousandsSeparator(thousandsSeparator)
  }

  public fun build(): CfnDashboard.NumericSeparatorConfigurationProperty = cdkBuilder.build()
}

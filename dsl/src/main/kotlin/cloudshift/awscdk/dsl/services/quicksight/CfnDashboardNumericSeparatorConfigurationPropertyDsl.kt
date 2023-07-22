@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options that determine the numeric separator configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NumericSeparatorConfigurationProperty numericSeparatorConfigurationProperty =
 * NumericSeparatorConfigurationProperty.builder()
 * .decimalSeparator("decimalSeparator")
 * .thousandsSeparator(ThousandSeparatorOptionsProperty.builder()
 * .symbol("symbol")
 * .visibility("visibility")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-numericseparatorconfiguration.html)
 */
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

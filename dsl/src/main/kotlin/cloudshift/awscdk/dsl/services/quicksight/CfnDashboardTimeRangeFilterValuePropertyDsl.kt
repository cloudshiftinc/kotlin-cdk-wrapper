@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The value of a time range filter.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TimeRangeFilterValueProperty timeRangeFilterValueProperty =
 * TimeRangeFilterValueProperty.builder()
 * .parameter("parameter")
 * .rollingDate(RollingDateConfigurationProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .staticValue("staticValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-timerangefiltervalue.html)
 */
@CdkDslMarker
public class CfnDashboardTimeRangeFilterValuePropertyDsl {
  private val cdkBuilder: CfnDashboard.TimeRangeFilterValueProperty.Builder =
      CfnDashboard.TimeRangeFilterValueProperty.builder()

  /**
   * @param parameter The parameter type input value.
   */
  public fun parameter(parameter: String) {
    cdkBuilder.parameter(parameter)
  }

  /**
   * @param rollingDate The rolling date input value.
   */
  public fun rollingDate(rollingDate: IResolvable) {
    cdkBuilder.rollingDate(rollingDate)
  }

  /**
   * @param rollingDate The rolling date input value.
   */
  public fun rollingDate(rollingDate: CfnDashboard.RollingDateConfigurationProperty) {
    cdkBuilder.rollingDate(rollingDate)
  }

  /**
   * @param staticValue The static input value.
   */
  public fun staticValue(staticValue: String) {
    cdkBuilder.staticValue(staticValue)
  }

  public fun build(): CfnDashboard.TimeRangeFilterValueProperty = cdkBuilder.build()
}

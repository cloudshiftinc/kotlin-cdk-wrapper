@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The option that determines the data label type.
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
 * DataLabelTypeProperty dataLabelTypeProperty = DataLabelTypeProperty.builder()
 * .dataPathLabelType(DataPathLabelTypeProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .visibility("visibility")
 * .build())
 * .fieldLabelType(FieldLabelTypeProperty.builder()
 * .fieldId("fieldId")
 * .visibility("visibility")
 * .build())
 * .maximumLabelType(MaximumLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build())
 * .minimumLabelType(MinimumLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build())
 * .rangeEndsLabelType(RangeEndsLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datalabeltype.html)
 */
@CdkDslMarker
public class CfnDashboardDataLabelTypePropertyDsl {
  private val cdkBuilder: CfnDashboard.DataLabelTypeProperty.Builder =
      CfnDashboard.DataLabelTypeProperty.builder()

  /**
   * @param dataPathLabelType The option that specifies individual data values for labels.
   */
  public fun dataPathLabelType(dataPathLabelType: IResolvable) {
    cdkBuilder.dataPathLabelType(dataPathLabelType)
  }

  /**
   * @param dataPathLabelType The option that specifies individual data values for labels.
   */
  public fun dataPathLabelType(dataPathLabelType: CfnDashboard.DataPathLabelTypeProperty) {
    cdkBuilder.dataPathLabelType(dataPathLabelType)
  }

  /**
   * @param fieldLabelType Determines the label configuration for the entire field.
   */
  public fun fieldLabelType(fieldLabelType: IResolvable) {
    cdkBuilder.fieldLabelType(fieldLabelType)
  }

  /**
   * @param fieldLabelType Determines the label configuration for the entire field.
   */
  public fun fieldLabelType(fieldLabelType: CfnDashboard.FieldLabelTypeProperty) {
    cdkBuilder.fieldLabelType(fieldLabelType)
  }

  /**
   * @param maximumLabelType Determines the label configuration for the maximum value in a visual.
   */
  public fun maximumLabelType(maximumLabelType: IResolvable) {
    cdkBuilder.maximumLabelType(maximumLabelType)
  }

  /**
   * @param maximumLabelType Determines the label configuration for the maximum value in a visual.
   */
  public fun maximumLabelType(maximumLabelType: CfnDashboard.MaximumLabelTypeProperty) {
    cdkBuilder.maximumLabelType(maximumLabelType)
  }

  /**
   * @param minimumLabelType Determines the label configuration for the minimum value in a visual.
   */
  public fun minimumLabelType(minimumLabelType: IResolvable) {
    cdkBuilder.minimumLabelType(minimumLabelType)
  }

  /**
   * @param minimumLabelType Determines the label configuration for the minimum value in a visual.
   */
  public fun minimumLabelType(minimumLabelType: CfnDashboard.MinimumLabelTypeProperty) {
    cdkBuilder.minimumLabelType(minimumLabelType)
  }

  /**
   * @param rangeEndsLabelType Determines the label configuration for range end value in a visual.
   */
  public fun rangeEndsLabelType(rangeEndsLabelType: IResolvable) {
    cdkBuilder.rangeEndsLabelType(rangeEndsLabelType)
  }

  /**
   * @param rangeEndsLabelType Determines the label configuration for range end value in a visual.
   */
  public fun rangeEndsLabelType(rangeEndsLabelType: CfnDashboard.RangeEndsLabelTypeProperty) {
    cdkBuilder.rangeEndsLabelType(rangeEndsLabelType)
  }

  public fun build(): CfnDashboard.DataLabelTypeProperty = cdkBuilder.build()
}

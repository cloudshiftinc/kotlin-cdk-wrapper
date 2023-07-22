@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDataLabelTypePropertyDsl {
  private val cdkBuilder: CfnTemplate.DataLabelTypeProperty.Builder =
      CfnTemplate.DataLabelTypeProperty.builder()

  /**
   * @param dataPathLabelType The option that specifies individual data values for labels.
   */
  public fun dataPathLabelType(dataPathLabelType: IResolvable) {
    cdkBuilder.dataPathLabelType(dataPathLabelType)
  }

  /**
   * @param dataPathLabelType The option that specifies individual data values for labels.
   */
  public fun dataPathLabelType(dataPathLabelType: CfnTemplate.DataPathLabelTypeProperty) {
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
  public fun fieldLabelType(fieldLabelType: CfnTemplate.FieldLabelTypeProperty) {
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
  public fun maximumLabelType(maximumLabelType: CfnTemplate.MaximumLabelTypeProperty) {
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
  public fun minimumLabelType(minimumLabelType: CfnTemplate.MinimumLabelTypeProperty) {
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
  public fun rangeEndsLabelType(rangeEndsLabelType: CfnTemplate.RangeEndsLabelTypeProperty) {
    cdkBuilder.rangeEndsLabelType(rangeEndsLabelType)
  }

  public fun build(): CfnTemplate.DataLabelTypeProperty = cdkBuilder.build()
}

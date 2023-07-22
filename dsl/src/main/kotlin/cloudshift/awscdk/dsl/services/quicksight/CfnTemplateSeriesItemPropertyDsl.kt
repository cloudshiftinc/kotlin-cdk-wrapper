@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSeriesItemPropertyDsl {
  private val cdkBuilder: CfnTemplate.SeriesItemProperty.Builder =
      CfnTemplate.SeriesItemProperty.builder()

  /**
   * @param dataFieldSeriesItem The data field series item configuration of a line chart.
   */
  public fun dataFieldSeriesItem(dataFieldSeriesItem: IResolvable) {
    cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
  }

  /**
   * @param dataFieldSeriesItem The data field series item configuration of a line chart.
   */
  public fun dataFieldSeriesItem(dataFieldSeriesItem: CfnTemplate.DataFieldSeriesItemProperty) {
    cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
  }

  /**
   * @param fieldSeriesItem The field series item configuration of a line chart.
   */
  public fun fieldSeriesItem(fieldSeriesItem: IResolvable) {
    cdkBuilder.fieldSeriesItem(fieldSeriesItem)
  }

  /**
   * @param fieldSeriesItem The field series item configuration of a line chart.
   */
  public fun fieldSeriesItem(fieldSeriesItem: CfnTemplate.FieldSeriesItemProperty) {
    cdkBuilder.fieldSeriesItem(fieldSeriesItem)
  }

  public fun build(): CfnTemplate.SeriesItemProperty = cdkBuilder.build()
}

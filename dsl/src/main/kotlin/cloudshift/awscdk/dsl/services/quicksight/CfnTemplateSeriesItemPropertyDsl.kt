@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSeriesItemPropertyDsl {
  private val cdkBuilder: CfnTemplate.SeriesItemProperty.Builder =
      CfnTemplate.SeriesItemProperty.builder()

  public fun dataFieldSeriesItem(dataFieldSeriesItem: IResolvable) {
    cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
  }

  public fun dataFieldSeriesItem(dataFieldSeriesItem: CfnTemplate.DataFieldSeriesItemProperty) {
    cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
  }

  public fun fieldSeriesItem(fieldSeriesItem: IResolvable) {
    cdkBuilder.fieldSeriesItem(fieldSeriesItem)
  }

  public fun fieldSeriesItem(fieldSeriesItem: CfnTemplate.FieldSeriesItemProperty) {
    cdkBuilder.fieldSeriesItem(fieldSeriesItem)
  }

  public fun build(): CfnTemplate.SeriesItemProperty = cdkBuilder.build()
}

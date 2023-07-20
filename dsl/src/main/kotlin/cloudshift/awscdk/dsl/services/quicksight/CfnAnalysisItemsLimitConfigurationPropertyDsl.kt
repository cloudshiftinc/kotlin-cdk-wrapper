@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisItemsLimitConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ItemsLimitConfigurationProperty.Builder =
      CfnAnalysis.ItemsLimitConfigurationProperty.builder()

  public fun itemsLimit(itemsLimit: Number) {
    cdkBuilder.itemsLimit(itemsLimit)
  }

  public fun otherCategories(otherCategories: String) {
    cdkBuilder.otherCategories(otherCategories)
  }

  public fun build(): CfnAnalysis.ItemsLimitConfigurationProperty = cdkBuilder.build()
}

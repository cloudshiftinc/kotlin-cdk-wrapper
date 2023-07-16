@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateItemsLimitConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ItemsLimitConfigurationProperty.Builder =
      CfnTemplate.ItemsLimitConfigurationProperty.builder()

  public fun itemsLimit(itemsLimit: Number) {
    cdkBuilder.itemsLimit(itemsLimit)
  }

  public fun otherCategories(otherCategories: String) {
    cdkBuilder.otherCategories(otherCategories)
  }

  public fun build(): CfnTemplate.ItemsLimitConfigurationProperty = cdkBuilder.build()
}

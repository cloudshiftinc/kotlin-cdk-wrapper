@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.resourceexplorer2.CfnView

@CdkDslMarker
public class CfnViewFiltersPropertyDsl {
  private val cdkBuilder: CfnView.FiltersProperty.Builder = CfnView.FiltersProperty.builder()

  public fun filterString(filterString: String) {
    cdkBuilder.filterString(filterString)
  }

  public fun build(): CfnView.FiltersProperty = cdkBuilder.build()
}

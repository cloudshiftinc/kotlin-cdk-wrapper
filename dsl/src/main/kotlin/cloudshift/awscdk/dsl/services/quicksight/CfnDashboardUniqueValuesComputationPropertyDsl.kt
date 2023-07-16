@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardUniqueValuesComputationPropertyDsl {
  private val cdkBuilder: CfnDashboard.UniqueValuesComputationProperty.Builder =
      CfnDashboard.UniqueValuesComputationProperty.builder()

  public fun category(category: IResolvable) {
    cdkBuilder.category(category)
  }

  public fun category(category: CfnDashboard.DimensionFieldProperty) {
    cdkBuilder.category(category)
  }

  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDashboard.UniqueValuesComputationProperty = cdkBuilder.build()
}

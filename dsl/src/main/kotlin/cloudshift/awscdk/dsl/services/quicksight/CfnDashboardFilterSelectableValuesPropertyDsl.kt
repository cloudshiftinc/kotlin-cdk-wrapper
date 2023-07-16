@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFilterSelectableValuesPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilterSelectableValuesProperty.Builder =
      CfnDashboard.FilterSelectableValuesProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnDashboard.FilterSelectableValuesProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}

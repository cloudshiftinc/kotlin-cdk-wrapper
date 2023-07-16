@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardParameterSelectableValuesPropertyDsl {
  private val cdkBuilder: CfnDashboard.ParameterSelectableValuesProperty.Builder =
      CfnDashboard.ParameterSelectableValuesProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  public fun linkToDataSetColumn(linkToDataSetColumn: IResolvable) {
    cdkBuilder.linkToDataSetColumn(linkToDataSetColumn)
  }

  public fun linkToDataSetColumn(linkToDataSetColumn: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.linkToDataSetColumn(linkToDataSetColumn)
  }

  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnDashboard.ParameterSelectableValuesProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}

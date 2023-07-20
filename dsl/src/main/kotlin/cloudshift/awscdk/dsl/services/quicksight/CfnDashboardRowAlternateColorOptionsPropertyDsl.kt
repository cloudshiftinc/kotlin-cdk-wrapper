@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardRowAlternateColorOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.RowAlternateColorOptionsProperty.Builder =
      CfnDashboard.RowAlternateColorOptionsProperty.builder()

  private val _rowAlternateColors: MutableList<String> = mutableListOf()

  public fun rowAlternateColors(vararg rowAlternateColors: String) {
    _rowAlternateColors.addAll(listOf(*rowAlternateColors))
  }

  public fun rowAlternateColors(rowAlternateColors: Collection<String>) {
    _rowAlternateColors.addAll(rowAlternateColors)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnDashboard.RowAlternateColorOptionsProperty {
    if(_rowAlternateColors.isNotEmpty()) cdkBuilder.rowAlternateColors(_rowAlternateColors)
    return cdkBuilder.build()
  }
}

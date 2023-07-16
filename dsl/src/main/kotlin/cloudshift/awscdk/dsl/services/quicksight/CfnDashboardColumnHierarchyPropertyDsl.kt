@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardColumnHierarchyPropertyDsl {
  private val cdkBuilder: CfnDashboard.ColumnHierarchyProperty.Builder =
      CfnDashboard.ColumnHierarchyProperty.builder()

  public fun dateTimeHierarchy(dateTimeHierarchy: IResolvable) {
    cdkBuilder.dateTimeHierarchy(dateTimeHierarchy)
  }

  public fun dateTimeHierarchy(dateTimeHierarchy: CfnDashboard.DateTimeHierarchyProperty) {
    cdkBuilder.dateTimeHierarchy(dateTimeHierarchy)
  }

  public fun explicitHierarchy(explicitHierarchy: IResolvable) {
    cdkBuilder.explicitHierarchy(explicitHierarchy)
  }

  public fun explicitHierarchy(explicitHierarchy: CfnDashboard.ExplicitHierarchyProperty) {
    cdkBuilder.explicitHierarchy(explicitHierarchy)
  }

  public fun predefinedHierarchy(predefinedHierarchy: IResolvable) {
    cdkBuilder.predefinedHierarchy(predefinedHierarchy)
  }

  public fun predefinedHierarchy(predefinedHierarchy: CfnDashboard.PredefinedHierarchyProperty) {
    cdkBuilder.predefinedHierarchy(predefinedHierarchy)
  }

  public fun build(): CfnDashboard.ColumnHierarchyProperty = cdkBuilder.build()
}

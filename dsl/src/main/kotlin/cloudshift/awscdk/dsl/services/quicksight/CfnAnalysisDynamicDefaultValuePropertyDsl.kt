@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDynamicDefaultValuePropertyDsl {
  private val cdkBuilder: CfnAnalysis.DynamicDefaultValueProperty.Builder =
      CfnAnalysis.DynamicDefaultValueProperty.builder()

  public fun defaultValueColumn(defaultValueColumn: IResolvable) {
    cdkBuilder.defaultValueColumn(defaultValueColumn)
  }

  public fun defaultValueColumn(defaultValueColumn: CfnAnalysis.ColumnIdentifierProperty) {
    cdkBuilder.defaultValueColumn(defaultValueColumn)
  }

  public fun groupNameColumn(groupNameColumn: IResolvable) {
    cdkBuilder.groupNameColumn(groupNameColumn)
  }

  public fun groupNameColumn(groupNameColumn: CfnAnalysis.ColumnIdentifierProperty) {
    cdkBuilder.groupNameColumn(groupNameColumn)
  }

  public fun userNameColumn(userNameColumn: IResolvable) {
    cdkBuilder.userNameColumn(userNameColumn)
  }

  public fun userNameColumn(userNameColumn: CfnAnalysis.ColumnIdentifierProperty) {
    cdkBuilder.userNameColumn(userNameColumn)
  }

  public fun build(): CfnAnalysis.DynamicDefaultValueProperty = cdkBuilder.build()
}

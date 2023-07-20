@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateColumnHierarchyPropertyDsl {
  private val cdkBuilder: CfnTemplate.ColumnHierarchyProperty.Builder =
      CfnTemplate.ColumnHierarchyProperty.builder()

  public fun dateTimeHierarchy(dateTimeHierarchy: IResolvable) {
    cdkBuilder.dateTimeHierarchy(dateTimeHierarchy)
  }

  public fun dateTimeHierarchy(dateTimeHierarchy: CfnTemplate.DateTimeHierarchyProperty) {
    cdkBuilder.dateTimeHierarchy(dateTimeHierarchy)
  }

  public fun explicitHierarchy(explicitHierarchy: IResolvable) {
    cdkBuilder.explicitHierarchy(explicitHierarchy)
  }

  public fun explicitHierarchy(explicitHierarchy: CfnTemplate.ExplicitHierarchyProperty) {
    cdkBuilder.explicitHierarchy(explicitHierarchy)
  }

  public fun predefinedHierarchy(predefinedHierarchy: IResolvable) {
    cdkBuilder.predefinedHierarchy(predefinedHierarchy)
  }

  public fun predefinedHierarchy(predefinedHierarchy: CfnTemplate.PredefinedHierarchyProperty) {
    cdkBuilder.predefinedHierarchy(predefinedHierarchy)
  }

  public fun build(): CfnTemplate.ColumnHierarchyProperty = cdkBuilder.build()
}

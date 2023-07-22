@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateColumnHierarchyPropertyDsl {
  private val cdkBuilder: CfnTemplate.ColumnHierarchyProperty.Builder =
      CfnTemplate.ColumnHierarchyProperty.builder()

  /**
   * @param dateTimeHierarchy The option that determines the hierarchy of any `DateTime` fields.
   */
  public fun dateTimeHierarchy(dateTimeHierarchy: IResolvable) {
    cdkBuilder.dateTimeHierarchy(dateTimeHierarchy)
  }

  /**
   * @param dateTimeHierarchy The option that determines the hierarchy of any `DateTime` fields.
   */
  public fun dateTimeHierarchy(dateTimeHierarchy: CfnTemplate.DateTimeHierarchyProperty) {
    cdkBuilder.dateTimeHierarchy(dateTimeHierarchy)
  }

  /**
   * @param explicitHierarchy The option that determines the hierarchy of the fields that are built
   * within a visual's field wells.
   * These fields can't be duplicated to other visuals.
   */
  public fun explicitHierarchy(explicitHierarchy: IResolvable) {
    cdkBuilder.explicitHierarchy(explicitHierarchy)
  }

  /**
   * @param explicitHierarchy The option that determines the hierarchy of the fields that are built
   * within a visual's field wells.
   * These fields can't be duplicated to other visuals.
   */
  public fun explicitHierarchy(explicitHierarchy: CfnTemplate.ExplicitHierarchyProperty) {
    cdkBuilder.explicitHierarchy(explicitHierarchy)
  }

  /**
   * @param predefinedHierarchy The option that determines the hierarchy of the fields that are
   * defined during data preparation.
   * These fields are available to use in any analysis that uses the data source.
   */
  public fun predefinedHierarchy(predefinedHierarchy: IResolvable) {
    cdkBuilder.predefinedHierarchy(predefinedHierarchy)
  }

  /**
   * @param predefinedHierarchy The option that determines the hierarchy of the fields that are
   * defined during data preparation.
   * These fields are available to use in any analysis that uses the data source.
   */
  public fun predefinedHierarchy(predefinedHierarchy: CfnTemplate.PredefinedHierarchyProperty) {
    cdkBuilder.predefinedHierarchy(predefinedHierarchy)
  }

  public fun build(): CfnTemplate.ColumnHierarchyProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateColumnConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ColumnConfigurationProperty.Builder =
      CfnTemplate.ColumnConfigurationProperty.builder()

  /**
   * @param column The column. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column. 
   */
  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param formatConfiguration The format configuration of a column.
   */
  public fun formatConfiguration(formatConfiguration: IResolvable) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  /**
   * @param formatConfiguration The format configuration of a column.
   */
  public fun formatConfiguration(formatConfiguration: CfnTemplate.FormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  /**
   * @param role The role of the column.
   */
  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun build(): CfnTemplate.ColumnConfigurationProperty = cdkBuilder.build()
}

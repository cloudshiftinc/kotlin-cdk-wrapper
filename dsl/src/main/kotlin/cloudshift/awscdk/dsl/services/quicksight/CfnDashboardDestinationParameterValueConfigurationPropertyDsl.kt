@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDestinationParameterValueConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.DestinationParameterValueConfigurationProperty.Builder =
      CfnDashboard.DestinationParameterValueConfigurationProperty.builder()

  /**
   * @param customValuesConfiguration The configuration of custom values for destination parameter
   * in `DestinationParameterValueConfiguration` .
   */
  public fun customValuesConfiguration(customValuesConfiguration: IResolvable) {
    cdkBuilder.customValuesConfiguration(customValuesConfiguration)
  }

  /**
   * @param customValuesConfiguration The configuration of custom values for destination parameter
   * in `DestinationParameterValueConfiguration` .
   */
  public
      fun customValuesConfiguration(customValuesConfiguration: CfnDashboard.CustomValuesConfigurationProperty) {
    cdkBuilder.customValuesConfiguration(customValuesConfiguration)
  }

  /**
   * @param selectAllValueOptions The configuration that selects all options.
   */
  public fun selectAllValueOptions(selectAllValueOptions: String) {
    cdkBuilder.selectAllValueOptions(selectAllValueOptions)
  }

  /**
   * @param sourceColumn the value to be set.
   */
  public fun sourceColumn(sourceColumn: IResolvable) {
    cdkBuilder.sourceColumn(sourceColumn)
  }

  /**
   * @param sourceColumn the value to be set.
   */
  public fun sourceColumn(sourceColumn: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.sourceColumn(sourceColumn)
  }

  /**
   * @param sourceField The source field ID of the destination parameter.
   */
  public fun sourceField(sourceField: String) {
    cdkBuilder.sourceField(sourceField)
  }

  /**
   * @param sourceParameterName The source parameter name of the destination parameter.
   */
  public fun sourceParameterName(sourceParameterName: String) {
    cdkBuilder.sourceParameterName(sourceParameterName)
  }

  public fun build(): CfnDashboard.DestinationParameterValueConfigurationProperty =
      cdkBuilder.build()
}

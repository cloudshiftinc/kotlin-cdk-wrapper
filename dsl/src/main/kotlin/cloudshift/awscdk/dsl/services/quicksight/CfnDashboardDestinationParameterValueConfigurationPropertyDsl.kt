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

  public fun customValuesConfiguration(customValuesConfiguration: IResolvable) {
    cdkBuilder.customValuesConfiguration(customValuesConfiguration)
  }

  public
      fun customValuesConfiguration(customValuesConfiguration: CfnDashboard.CustomValuesConfigurationProperty) {
    cdkBuilder.customValuesConfiguration(customValuesConfiguration)
  }

  public fun selectAllValueOptions(selectAllValueOptions: String) {
    cdkBuilder.selectAllValueOptions(selectAllValueOptions)
  }

  public fun sourceColumn(sourceColumn: IResolvable) {
    cdkBuilder.sourceColumn(sourceColumn)
  }

  public fun sourceColumn(sourceColumn: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.sourceColumn(sourceColumn)
  }

  public fun sourceField(sourceField: String) {
    cdkBuilder.sourceField(sourceField)
  }

  public fun sourceParameterName(sourceParameterName: String) {
    cdkBuilder.sourceParameterName(sourceParameterName)
  }

  public fun build(): CfnDashboard.DestinationParameterValueConfigurationProperty =
      cdkBuilder.build()
}

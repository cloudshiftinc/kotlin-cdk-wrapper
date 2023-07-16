@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisCategoryFilterPropertyDsl {
  private val cdkBuilder: CfnAnalysis.CategoryFilterProperty.Builder =
      CfnAnalysis.CategoryFilterProperty.builder()

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  public fun configuration(configuration: CfnAnalysis.CategoryFilterConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  public fun filterId(filterId: String) {
    cdkBuilder.filterId(filterId)
  }

  public fun build(): CfnAnalysis.CategoryFilterProperty = cdkBuilder.build()
}

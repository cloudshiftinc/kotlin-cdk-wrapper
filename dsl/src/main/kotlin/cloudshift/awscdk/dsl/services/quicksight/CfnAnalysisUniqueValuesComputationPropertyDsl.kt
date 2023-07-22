@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisUniqueValuesComputationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.UniqueValuesComputationProperty.Builder =
      CfnAnalysis.UniqueValuesComputationProperty.builder()

  /**
   * @param category The category field that is used in a computation. 
   */
  public fun category(category: IResolvable) {
    cdkBuilder.category(category)
  }

  /**
   * @param category The category field that is used in a computation. 
   */
  public fun category(category: CfnAnalysis.DimensionFieldProperty) {
    cdkBuilder.category(category)
  }

  /**
   * @param computationId The ID for a computation. 
   */
  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  /**
   * @param name The name of a computation.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnAnalysis.UniqueValuesComputationProperty = cdkBuilder.build()
}

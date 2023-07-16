@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform

@CdkDslMarker
public class CfnMLTransformFindMatchesParametersPropertyDsl {
  private val cdkBuilder: CfnMLTransform.FindMatchesParametersProperty.Builder =
      CfnMLTransform.FindMatchesParametersProperty.builder()

  public fun accuracyCostTradeoff(accuracyCostTradeoff: Number) {
    cdkBuilder.accuracyCostTradeoff(accuracyCostTradeoff)
  }

  public fun enforceProvidedLabels(enforceProvidedLabels: Boolean) {
    cdkBuilder.enforceProvidedLabels(enforceProvidedLabels)
  }

  public fun enforceProvidedLabels(enforceProvidedLabels: IResolvable) {
    cdkBuilder.enforceProvidedLabels(enforceProvidedLabels)
  }

  public fun precisionRecallTradeoff(precisionRecallTradeoff: Number) {
    cdkBuilder.precisionRecallTradeoff(precisionRecallTradeoff)
  }

  public fun primaryKeyColumnName(primaryKeyColumnName: String) {
    cdkBuilder.primaryKeyColumnName(primaryKeyColumnName)
  }

  public fun build(): CfnMLTransform.FindMatchesParametersProperty = cdkBuilder.build()
}

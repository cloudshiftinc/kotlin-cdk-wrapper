@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnExperiment

@CdkDslMarker
public class CfnExperimentTreatmentToWeightPropertyDsl {
  private val cdkBuilder: CfnExperiment.TreatmentToWeightProperty.Builder =
      CfnExperiment.TreatmentToWeightProperty.builder()

  public fun splitWeight(splitWeight: Number) {
    cdkBuilder.splitWeight(splitWeight)
  }

  public fun treatment(treatment: String) {
    cdkBuilder.treatment(treatment)
  }

  public fun build(): CfnExperiment.TreatmentToWeightProperty = cdkBuilder.build()
}

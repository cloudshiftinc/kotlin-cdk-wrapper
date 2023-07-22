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

  /**
   * @param splitWeight The portion of experiment traffic to allocate to this treatment. 
   * Specify the traffic portion in thousandths of a percent, so 20,000 allocated to a treatment
   * would allocate 20% of the experiment traffic to that treatment.
   */
  public fun splitWeight(splitWeight: Number) {
    cdkBuilder.splitWeight(splitWeight)
  }

  /**
   * @param treatment The name of the treatment. 
   */
  public fun treatment(treatment: String) {
    cdkBuilder.treatment(treatment)
  }

  public fun build(): CfnExperiment.TreatmentToWeightProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnExperiment

@CdkDslMarker
public class CfnExperimentOnlineAbConfigObjectPropertyDsl {
  private val cdkBuilder: CfnExperiment.OnlineAbConfigObjectProperty.Builder =
      CfnExperiment.OnlineAbConfigObjectProperty.builder()

  private val _treatmentWeights: MutableList<Any> = mutableListOf()

  /**
   * @param controlTreatmentName The name of the variation that is to be the default variation that
   * the other variations are compared to.
   */
  public fun controlTreatmentName(controlTreatmentName: String) {
    cdkBuilder.controlTreatmentName(controlTreatmentName)
  }

  /**
   * @param treatmentWeights A set of key-value pairs.
   * The keys are treatment names, and the values are the portion of experiment traffic to be
   * assigned to that treatment. Specify the traffic portion in thousandths of a percent, so 20,000 for
   * a variation would allocate 20% of the experiment traffic to that variation.
   */
  public fun treatmentWeights(vararg treatmentWeights: Any) {
    _treatmentWeights.addAll(listOf(*treatmentWeights))
  }

  /**
   * @param treatmentWeights A set of key-value pairs.
   * The keys are treatment names, and the values are the portion of experiment traffic to be
   * assigned to that treatment. Specify the traffic portion in thousandths of a percent, so 20,000 for
   * a variation would allocate 20% of the experiment traffic to that variation.
   */
  public fun treatmentWeights(treatmentWeights: Collection<Any>) {
    _treatmentWeights.addAll(treatmentWeights)
  }

  /**
   * @param treatmentWeights A set of key-value pairs.
   * The keys are treatment names, and the values are the portion of experiment traffic to be
   * assigned to that treatment. Specify the traffic portion in thousandths of a percent, so 20,000 for
   * a variation would allocate 20% of the experiment traffic to that variation.
   */
  public fun treatmentWeights(treatmentWeights: IResolvable) {
    cdkBuilder.treatmentWeights(treatmentWeights)
  }

  public fun build(): CfnExperiment.OnlineAbConfigObjectProperty {
    if(_treatmentWeights.isNotEmpty()) cdkBuilder.treatmentWeights(_treatmentWeights)
    return cdkBuilder.build()
  }
}

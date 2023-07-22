@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnExperiment

@CdkDslMarker
public class CfnExperimentTreatmentObjectPropertyDsl {
  private val cdkBuilder: CfnExperiment.TreatmentObjectProperty.Builder =
      CfnExperiment.TreatmentObjectProperty.builder()

  /**
   * @param description The description of the treatment.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param feature The name of the feature for this experiment. 
   */
  public fun feature(feature: String) {
    cdkBuilder.feature(feature)
  }

  /**
   * @param treatmentName A name for this treatment. 
   * It can include up to 127 characters.
   */
  public fun treatmentName(treatmentName: String) {
    cdkBuilder.treatmentName(treatmentName)
  }

  /**
   * @param variation The name of the variation to use for this treatment. 
   */
  public fun variation(variation: String) {
    cdkBuilder.variation(variation)
  }

  public fun build(): CfnExperiment.TreatmentObjectProperty = cdkBuilder.build()
}

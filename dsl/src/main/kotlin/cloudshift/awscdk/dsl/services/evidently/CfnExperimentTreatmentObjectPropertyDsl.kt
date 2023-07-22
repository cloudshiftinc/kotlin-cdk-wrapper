@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnExperiment

/**
 * A structure that defines one treatment in an experiment.
 *
 * A treatment is a variation of the feature that you are including in the experiment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * TreatmentObjectProperty treatmentObjectProperty = TreatmentObjectProperty.builder()
 * .feature("feature")
 * .treatmentName("treatmentName")
 * .variation("variation")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-experiment-treatmentobject.html)
 */
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

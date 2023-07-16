@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardTrainingMetricPropertyDsl {
  private val cdkBuilder: CfnModelCard.TrainingMetricProperty.Builder =
      CfnModelCard.TrainingMetricProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun notes(notes: String) {
    cdkBuilder.notes(notes)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnModelCard.TrainingMetricProperty = cdkBuilder.build()
}

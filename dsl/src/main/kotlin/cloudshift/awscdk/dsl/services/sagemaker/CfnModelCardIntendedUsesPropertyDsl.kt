@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardIntendedUsesPropertyDsl {
  private val cdkBuilder: CfnModelCard.IntendedUsesProperty.Builder =
      CfnModelCard.IntendedUsesProperty.builder()

  public fun explanationsForRiskRating(explanationsForRiskRating: String) {
    cdkBuilder.explanationsForRiskRating(explanationsForRiskRating)
  }

  public fun factorsAffectingModelEfficiency(factorsAffectingModelEfficiency: String) {
    cdkBuilder.factorsAffectingModelEfficiency(factorsAffectingModelEfficiency)
  }

  public fun intendedUses(intendedUses: String) {
    cdkBuilder.intendedUses(intendedUses)
  }

  public fun purposeOfModel(purposeOfModel: String) {
    cdkBuilder.purposeOfModel(purposeOfModel)
  }

  public fun riskRating(riskRating: String) {
    cdkBuilder.riskRating(riskRating)
  }

  public fun build(): CfnModelCard.IntendedUsesProperty = cdkBuilder.build()
}

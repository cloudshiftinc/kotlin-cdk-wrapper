@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardContentPropertyDsl {
  private val cdkBuilder: CfnModelCard.ContentProperty.Builder =
      CfnModelCard.ContentProperty.builder()

  private val _evaluationDetails: MutableList<Any> = mutableListOf()

  /**
   * @param additionalInformation Additional information about the model.
   */
  public fun additionalInformation(additionalInformation: IResolvable) {
    cdkBuilder.additionalInformation(additionalInformation)
  }

  /**
   * @param additionalInformation Additional information about the model.
   */
  public
      fun additionalInformation(additionalInformation: CfnModelCard.AdditionalInformationProperty) {
    cdkBuilder.additionalInformation(additionalInformation)
  }

  /**
   * @param businessDetails Information about how the model supports business goals.
   */
  public fun businessDetails(businessDetails: IResolvable) {
    cdkBuilder.businessDetails(businessDetails)
  }

  /**
   * @param businessDetails Information about how the model supports business goals.
   */
  public fun businessDetails(businessDetails: CfnModelCard.BusinessDetailsProperty) {
    cdkBuilder.businessDetails(businessDetails)
  }

  /**
   * @param evaluationDetails An overview about the model's evaluation.
   */
  public fun evaluationDetails(vararg evaluationDetails: Any) {
    _evaluationDetails.addAll(listOf(*evaluationDetails))
  }

  /**
   * @param evaluationDetails An overview about the model's evaluation.
   */
  public fun evaluationDetails(evaluationDetails: Collection<Any>) {
    _evaluationDetails.addAll(evaluationDetails)
  }

  /**
   * @param evaluationDetails An overview about the model's evaluation.
   */
  public fun evaluationDetails(evaluationDetails: IResolvable) {
    cdkBuilder.evaluationDetails(evaluationDetails)
  }

  /**
   * @param intendedUses The intended usage of the model.
   */
  public fun intendedUses(intendedUses: IResolvable) {
    cdkBuilder.intendedUses(intendedUses)
  }

  /**
   * @param intendedUses The intended usage of the model.
   */
  public fun intendedUses(intendedUses: CfnModelCard.IntendedUsesProperty) {
    cdkBuilder.intendedUses(intendedUses)
  }

  /**
   * @param modelOverview An overview about the model.
   */
  public fun modelOverview(modelOverview: IResolvable) {
    cdkBuilder.modelOverview(modelOverview)
  }

  /**
   * @param modelOverview An overview about the model.
   */
  public fun modelOverview(modelOverview: CfnModelCard.ModelOverviewProperty) {
    cdkBuilder.modelOverview(modelOverview)
  }

  /**
   * @param modelPackageDetails Metadata information related to model package version.
   */
  public fun modelPackageDetails(modelPackageDetails: IResolvable) {
    cdkBuilder.modelPackageDetails(modelPackageDetails)
  }

  /**
   * @param modelPackageDetails Metadata information related to model package version.
   */
  public fun modelPackageDetails(modelPackageDetails: CfnModelCard.ModelPackageDetailsProperty) {
    cdkBuilder.modelPackageDetails(modelPackageDetails)
  }

  /**
   * @param trainingDetails An overview about model training.
   */
  public fun trainingDetails(trainingDetails: IResolvable) {
    cdkBuilder.trainingDetails(trainingDetails)
  }

  /**
   * @param trainingDetails An overview about model training.
   */
  public fun trainingDetails(trainingDetails: CfnModelCard.TrainingDetailsProperty) {
    cdkBuilder.trainingDetails(trainingDetails)
  }

  public fun build(): CfnModelCard.ContentProperty {
    if(_evaluationDetails.isNotEmpty()) cdkBuilder.evaluationDetails(_evaluationDetails)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * Metadata information related to model package version.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelPackageDetailsProperty modelPackageDetailsProperty = ModelPackageDetailsProperty.builder()
 * .approvalDescription("approvalDescription")
 * .createdBy(ModelPackageCreatorProperty.builder()
 * .userProfileName("userProfileName")
 * .build())
 * .domain("domain")
 * .inferenceSpecification(InferenceSpecificationProperty.builder()
 * .containers(List.of(ContainerProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .modelDataUrl("modelDataUrl")
 * .nearestModelName("nearestModelName")
 * .build()))
 * .build())
 * .modelApprovalStatus("modelApprovalStatus")
 * .modelPackageArn("modelPackageArn")
 * .modelPackageDescription("modelPackageDescription")
 * .modelPackageGroupName("modelPackageGroupName")
 * .modelPackageName("modelPackageName")
 * .modelPackageStatus("modelPackageStatus")
 * .modelPackageVersion(123)
 * .sourceAlgorithms(List.of(SourceAlgorithmProperty.builder()
 * .algorithmName("algorithmName")
 * // the properties below are optional
 * .modelDataUrl("modelDataUrl")
 * .build()))
 * .task("task")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagedetails.html)
 */
@CdkDslMarker
public class CfnModelCardModelPackageDetailsPropertyDsl {
  private val cdkBuilder: CfnModelCard.ModelPackageDetailsProperty.Builder =
      CfnModelCard.ModelPackageDetailsProperty.builder()

  private val _sourceAlgorithms: MutableList<Any> = mutableListOf()

  /**
   * @param approvalDescription A description provided for the model approval.
   */
  public fun approvalDescription(approvalDescription: String) {
    cdkBuilder.approvalDescription(approvalDescription)
  }

  /**
   * @param createdBy the value to be set.
   */
  public fun createdBy(createdBy: IResolvable) {
    cdkBuilder.createdBy(createdBy)
  }

  /**
   * @param createdBy the value to be set.
   */
  public fun createdBy(createdBy: CfnModelCard.ModelPackageCreatorProperty) {
    cdkBuilder.createdBy(createdBy)
  }

  /**
   * @param domain The machine learning domain of the model package you specified.
   * Common machine learning domains include computer vision and natural language processing.
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param inferenceSpecification the value to be set.
   */
  public fun inferenceSpecification(inferenceSpecification: IResolvable) {
    cdkBuilder.inferenceSpecification(inferenceSpecification)
  }

  /**
   * @param inferenceSpecification the value to be set.
   */
  public
      fun inferenceSpecification(inferenceSpecification: CfnModelCard.InferenceSpecificationProperty) {
    cdkBuilder.inferenceSpecification(inferenceSpecification)
  }

  /**
   * @param modelApprovalStatus Current approval status of model package.
   */
  public fun modelApprovalStatus(modelApprovalStatus: String) {
    cdkBuilder.modelApprovalStatus(modelApprovalStatus)
  }

  /**
   * @param modelPackageArn The Amazon Resource Name (ARN) of the model package.
   */
  public fun modelPackageArn(modelPackageArn: String) {
    cdkBuilder.modelPackageArn(modelPackageArn)
  }

  /**
   * @param modelPackageDescription A brief summary of the model package.
   */
  public fun modelPackageDescription(modelPackageDescription: String) {
    cdkBuilder.modelPackageDescription(modelPackageDescription)
  }

  /**
   * @param modelPackageGroupName If the model is a versioned model, the name of the model group
   * that the versioned model belongs to.
   */
  public fun modelPackageGroupName(modelPackageGroupName: String) {
    cdkBuilder.modelPackageGroupName(modelPackageGroupName)
  }

  /**
   * @param modelPackageName Name of the model package.
   */
  public fun modelPackageName(modelPackageName: String) {
    cdkBuilder.modelPackageName(modelPackageName)
  }

  /**
   * @param modelPackageStatus Current status of model package.
   */
  public fun modelPackageStatus(modelPackageStatus: String) {
    cdkBuilder.modelPackageStatus(modelPackageStatus)
  }

  /**
   * @param modelPackageVersion Version of the model package.
   */
  public fun modelPackageVersion(modelPackageVersion: Number) {
    cdkBuilder.modelPackageVersion(modelPackageVersion)
  }

  /**
   * @param sourceAlgorithms the value to be set.
   */
  public fun sourceAlgorithms(vararg sourceAlgorithms: Any) {
    _sourceAlgorithms.addAll(listOf(*sourceAlgorithms))
  }

  /**
   * @param sourceAlgorithms the value to be set.
   */
  public fun sourceAlgorithms(sourceAlgorithms: Collection<Any>) {
    _sourceAlgorithms.addAll(sourceAlgorithms)
  }

  /**
   * @param sourceAlgorithms the value to be set.
   */
  public fun sourceAlgorithms(sourceAlgorithms: IResolvable) {
    cdkBuilder.sourceAlgorithms(sourceAlgorithms)
  }

  /**
   * @param task The machine learning task you specified that your model package accomplishes.
   * Common machine learning tasks include object detection and image classification.
   */
  public fun task(task: String) {
    cdkBuilder.task(task)
  }

  public fun build(): CfnModelCard.ModelPackageDetailsProperty {
    if(_sourceAlgorithms.isNotEmpty()) cdkBuilder.sourceAlgorithms(_sourceAlgorithms)
    return cdkBuilder.build()
  }
}

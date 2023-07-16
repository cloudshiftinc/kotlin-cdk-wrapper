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

@CdkDslMarker
public class CfnModelCardModelPackageDetailsPropertyDsl {
  private val cdkBuilder: CfnModelCard.ModelPackageDetailsProperty.Builder =
      CfnModelCard.ModelPackageDetailsProperty.builder()

  private val _sourceAlgorithms: MutableList<Any> = mutableListOf()

  public fun approvalDescription(approvalDescription: String) {
    cdkBuilder.approvalDescription(approvalDescription)
  }

  public fun createdBy(createdBy: IResolvable) {
    cdkBuilder.createdBy(createdBy)
  }

  public fun createdBy(createdBy: CfnModelCard.ModelPackageCreatorProperty) {
    cdkBuilder.createdBy(createdBy)
  }

  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  public fun inferenceSpecification(inferenceSpecification: IResolvable) {
    cdkBuilder.inferenceSpecification(inferenceSpecification)
  }

  public
      fun inferenceSpecification(inferenceSpecification: CfnModelCard.InferenceSpecificationProperty) {
    cdkBuilder.inferenceSpecification(inferenceSpecification)
  }

  public fun modelApprovalStatus(modelApprovalStatus: String) {
    cdkBuilder.modelApprovalStatus(modelApprovalStatus)
  }

  public fun modelPackageArn(modelPackageArn: String) {
    cdkBuilder.modelPackageArn(modelPackageArn)
  }

  public fun modelPackageDescription(modelPackageDescription: String) {
    cdkBuilder.modelPackageDescription(modelPackageDescription)
  }

  public fun modelPackageGroupName(modelPackageGroupName: String) {
    cdkBuilder.modelPackageGroupName(modelPackageGroupName)
  }

  public fun modelPackageName(modelPackageName: String) {
    cdkBuilder.modelPackageName(modelPackageName)
  }

  public fun modelPackageStatus(modelPackageStatus: String) {
    cdkBuilder.modelPackageStatus(modelPackageStatus)
  }

  public fun modelPackageVersion(modelPackageVersion: Number) {
    cdkBuilder.modelPackageVersion(modelPackageVersion)
  }

  public fun sourceAlgorithms(vararg sourceAlgorithms: Any) {
    _sourceAlgorithms.addAll(listOf(*sourceAlgorithms))
  }

  public fun sourceAlgorithms(sourceAlgorithms: Collection<Any>) {
    _sourceAlgorithms.addAll(sourceAlgorithms)
  }

  public fun sourceAlgorithms(sourceAlgorithms: IResolvable) {
    cdkBuilder.sourceAlgorithms(sourceAlgorithms)
  }

  public fun task(task: String) {
    cdkBuilder.task(task)
  }

  public fun build(): CfnModelCard.ModelPackageDetailsProperty {
    if(_sourceAlgorithms.isNotEmpty()) cdkBuilder.sourceAlgorithms(_sourceAlgorithms)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import software.amazon.awscdk.services.sagemaker.CfnModelPackageProps

@CdkDslMarker
public class CfnModelPackagePropsDsl {
  private val cdkBuilder: CfnModelPackageProps.Builder = CfnModelPackageProps.builder()

  private val _additionalInferenceSpecifications: MutableList<Any> = mutableListOf()

  private val _additionalInferenceSpecificationsToAdd: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun additionalInferenceSpecifications(vararg additionalInferenceSpecifications: Any) {
    _additionalInferenceSpecifications.addAll(listOf(*additionalInferenceSpecifications))
  }

  public fun additionalInferenceSpecifications(additionalInferenceSpecifications: Collection<Any>) {
    _additionalInferenceSpecifications.addAll(additionalInferenceSpecifications)
  }

  public fun additionalInferenceSpecifications(additionalInferenceSpecifications: IResolvable) {
    cdkBuilder.additionalInferenceSpecifications(additionalInferenceSpecifications)
  }

  public fun additionalInferenceSpecificationsToAdd(vararg
      additionalInferenceSpecificationsToAdd: Any) {
    _additionalInferenceSpecificationsToAdd.addAll(listOf(*additionalInferenceSpecificationsToAdd))
  }

  public
      fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: Collection<Any>) {
    _additionalInferenceSpecificationsToAdd.addAll(additionalInferenceSpecificationsToAdd)
  }

  public
      fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: IResolvable) {
    cdkBuilder.additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd)
  }

  public fun approvalDescription(approvalDescription: String) {
    cdkBuilder.approvalDescription(approvalDescription)
  }

  public fun certifyForMarketplace(certifyForMarketplace: Boolean) {
    cdkBuilder.certifyForMarketplace(certifyForMarketplace)
  }

  public fun certifyForMarketplace(certifyForMarketplace: IResolvable) {
    cdkBuilder.certifyForMarketplace(certifyForMarketplace)
  }

  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  public fun customerMetadataProperties(customerMetadataProperties: Map<String, String>) {
    cdkBuilder.customerMetadataProperties(customerMetadataProperties)
  }

  public fun customerMetadataProperties(customerMetadataProperties: IResolvable) {
    cdkBuilder.customerMetadataProperties(customerMetadataProperties)
  }

  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  public fun driftCheckBaselines(driftCheckBaselines: IResolvable) {
    cdkBuilder.driftCheckBaselines(driftCheckBaselines)
  }

  public fun driftCheckBaselines(driftCheckBaselines: CfnModelPackage.DriftCheckBaselinesProperty) {
    cdkBuilder.driftCheckBaselines(driftCheckBaselines)
  }

  public fun inferenceSpecification(inferenceSpecification: IResolvable) {
    cdkBuilder.inferenceSpecification(inferenceSpecification)
  }

  public
      fun inferenceSpecification(inferenceSpecification: CfnModelPackage.InferenceSpecificationProperty) {
    cdkBuilder.inferenceSpecification(inferenceSpecification)
  }

  public fun lastModifiedTime(lastModifiedTime: String) {
    cdkBuilder.lastModifiedTime(lastModifiedTime)
  }

  public fun metadataProperties(metadataProperties: IResolvable) {
    cdkBuilder.metadataProperties(metadataProperties)
  }

  public fun metadataProperties(metadataProperties: CfnModelPackage.MetadataPropertiesProperty) {
    cdkBuilder.metadataProperties(metadataProperties)
  }

  public fun modelApprovalStatus(modelApprovalStatus: String) {
    cdkBuilder.modelApprovalStatus(modelApprovalStatus)
  }

  public fun modelMetrics(modelMetrics: IResolvable) {
    cdkBuilder.modelMetrics(modelMetrics)
  }

  public fun modelMetrics(modelMetrics: CfnModelPackage.ModelMetricsProperty) {
    cdkBuilder.modelMetrics(modelMetrics)
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

  public fun modelPackageStatusDetails(modelPackageStatusDetails: IResolvable) {
    cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails)
  }

  public
      fun modelPackageStatusDetails(modelPackageStatusDetails: CfnModelPackage.ModelPackageStatusDetailsProperty) {
    cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails)
  }

  public fun modelPackageVersion(modelPackageVersion: Number) {
    cdkBuilder.modelPackageVersion(modelPackageVersion)
  }

  public fun samplePayloadUrl(samplePayloadUrl: String) {
    cdkBuilder.samplePayloadUrl(samplePayloadUrl)
  }

  public fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: IResolvable) {
    cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification)
  }

  public
      fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: CfnModelPackage.SourceAlgorithmSpecificationProperty) {
    cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun task(task: String) {
    cdkBuilder.task(task)
  }

  public fun validationSpecification(validationSpecification: IResolvable) {
    cdkBuilder.validationSpecification(validationSpecification)
  }

  public
      fun validationSpecification(validationSpecification: CfnModelPackage.ValidationSpecificationProperty) {
    cdkBuilder.validationSpecification(validationSpecification)
  }

  public fun build(): CfnModelPackageProps {
    if(_additionalInferenceSpecifications.isNotEmpty())
        cdkBuilder.additionalInferenceSpecifications(_additionalInferenceSpecifications)
    if(_additionalInferenceSpecificationsToAdd.isNotEmpty())
        cdkBuilder.additionalInferenceSpecificationsToAdd(_additionalInferenceSpecificationsToAdd)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

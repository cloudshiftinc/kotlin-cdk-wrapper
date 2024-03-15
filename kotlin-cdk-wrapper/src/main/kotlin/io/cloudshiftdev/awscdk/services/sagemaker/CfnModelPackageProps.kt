@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnModelPackageProps {
  public fun additionalInferenceSpecifications(): Any? =
      unwrap(this).getAdditionalInferenceSpecifications()

  public fun additionalInferenceSpecificationsToAdd(): Any? =
      unwrap(this).getAdditionalInferenceSpecificationsToAdd()

  public fun approvalDescription(): String? = unwrap(this).getApprovalDescription()

  public fun certifyForMarketplace(): Any? = unwrap(this).getCertifyForMarketplace()

  public fun clientToken(): String? = unwrap(this).getClientToken()

  public fun customerMetadataProperties(): Any? = unwrap(this).getCustomerMetadataProperties()

  public fun domain(): String? = unwrap(this).getDomain()

  public fun driftCheckBaselines(): Any? = unwrap(this).getDriftCheckBaselines()

  public fun inferenceSpecification(): Any? = unwrap(this).getInferenceSpecification()

  public fun lastModifiedTime(): String? = unwrap(this).getLastModifiedTime()

  public fun metadataProperties(): Any? = unwrap(this).getMetadataProperties()

  public fun modelApprovalStatus(): String? = unwrap(this).getModelApprovalStatus()

  public fun modelMetrics(): Any? = unwrap(this).getModelMetrics()

  public fun modelPackageDescription(): String? = unwrap(this).getModelPackageDescription()

  public fun modelPackageGroupName(): String? = unwrap(this).getModelPackageGroupName()

  public fun modelPackageName(): String? = unwrap(this).getModelPackageName()

  public fun modelPackageStatusDetails(): Any? = unwrap(this).getModelPackageStatusDetails()

  public fun modelPackageVersion(): Number? = unwrap(this).getModelPackageVersion()

  public fun samplePayloadUrl(): String? = unwrap(this).getSamplePayloadUrl()

  public fun skipModelValidation(): String? = unwrap(this).getSkipModelValidation()

  public fun sourceAlgorithmSpecification(): Any? = unwrap(this).getSourceAlgorithmSpecification()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun task(): String? = unwrap(this).getTask()

  public fun validationSpecification(): Any? = unwrap(this).getValidationSpecification()

  @CdkDslMarker
  public interface Builder {
    public fun additionalInferenceSpecifications(additionalInferenceSpecifications: IResolvable)

    public fun additionalInferenceSpecifications(additionalInferenceSpecifications: List<Any>)

    public fun additionalInferenceSpecifications(vararg additionalInferenceSpecifications: Any)

    public
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: IResolvable)

    public
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: List<Any>)

    public fun additionalInferenceSpecificationsToAdd(vararg
        additionalInferenceSpecificationsToAdd: Any)

    public fun approvalDescription(approvalDescription: String)

    public fun certifyForMarketplace(certifyForMarketplace: Boolean)

    public fun certifyForMarketplace(certifyForMarketplace: IResolvable)

    public fun clientToken(clientToken: String)

    public fun customerMetadataProperties(customerMetadataProperties: IResolvable)

    public fun customerMetadataProperties(customerMetadataProperties: Map<String, String>)

    public fun domain(domain: String)

    public fun driftCheckBaselines(driftCheckBaselines: IResolvable)

    public fun driftCheckBaselines(driftCheckBaselines: CfnModelPackage.DriftCheckBaselinesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20e953fa558ccaa9edc9e6fa879bfb60c111741ba2a80aebc60d00bff1998da4")
    public
        fun driftCheckBaselines(driftCheckBaselines: CfnModelPackage.DriftCheckBaselinesProperty.Builder.() -> Unit)

    public fun inferenceSpecification(inferenceSpecification: IResolvable)

    public
        fun inferenceSpecification(inferenceSpecification: CfnModelPackage.InferenceSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e216f3dd5acf61f14b9dc7b5d610de80b88550de6b37b027e2978f2b4bf2ad9")
    public
        fun inferenceSpecification(inferenceSpecification: CfnModelPackage.InferenceSpecificationProperty.Builder.() -> Unit)

    public fun lastModifiedTime(lastModifiedTime: String)

    public fun metadataProperties(metadataProperties: IResolvable)

    public fun metadataProperties(metadataProperties: CfnModelPackage.MetadataPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df38983112debb9256941485a19341f349f3e3fb6aabc2fa8601154c1db63e25")
    public
        fun metadataProperties(metadataProperties: CfnModelPackage.MetadataPropertiesProperty.Builder.() -> Unit)

    public fun modelApprovalStatus(modelApprovalStatus: String)

    public fun modelMetrics(modelMetrics: IResolvable)

    public fun modelMetrics(modelMetrics: CfnModelPackage.ModelMetricsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a387f00a27f0bc37297133f9097aef52eb9a2c7b0643bde8646002633ed1fee")
    public fun modelMetrics(modelMetrics: CfnModelPackage.ModelMetricsProperty.Builder.() -> Unit)

    public fun modelPackageDescription(modelPackageDescription: String)

    public fun modelPackageGroupName(modelPackageGroupName: String)

    public fun modelPackageName(modelPackageName: String)

    public fun modelPackageStatusDetails(modelPackageStatusDetails: IResolvable)

    public
        fun modelPackageStatusDetails(modelPackageStatusDetails: CfnModelPackage.ModelPackageStatusDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3780f79c6d195a0cd106b9b82d76a6b2ad801452b9135ad5a873e9a53a11585")
    public
        fun modelPackageStatusDetails(modelPackageStatusDetails: CfnModelPackage.ModelPackageStatusDetailsProperty.Builder.() -> Unit)

    public fun modelPackageVersion(modelPackageVersion: Number)

    public fun samplePayloadUrl(samplePayloadUrl: String)

    public fun skipModelValidation(skipModelValidation: String)

    public fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: IResolvable)

    public
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: CfnModelPackage.SourceAlgorithmSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af168644b5d0c74cbc5930d32f3bc5be29d8d5eb83a53c19deb06e95c5892a97")
    public
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: CfnModelPackage.SourceAlgorithmSpecificationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun task(task: String)

    public fun validationSpecification(validationSpecification: IResolvable)

    public
        fun validationSpecification(validationSpecification: CfnModelPackage.ValidationSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95553887979e733cadf816a81a0a0be3a5a4330c352d0bca422bb36aebb2234e")
    public
        fun validationSpecification(validationSpecification: CfnModelPackage.ValidationSpecificationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelPackageProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelPackageProps.builder()

    override fun additionalInferenceSpecifications(additionalInferenceSpecifications: IResolvable) {
      cdkBuilder.additionalInferenceSpecifications(additionalInferenceSpecifications.let(IResolvable::unwrap))
    }

    override fun additionalInferenceSpecifications(additionalInferenceSpecifications: List<Any>) {
      cdkBuilder.additionalInferenceSpecifications(additionalInferenceSpecifications)
    }

    override fun additionalInferenceSpecifications(vararg additionalInferenceSpecifications: Any):
        Unit = additionalInferenceSpecifications(additionalInferenceSpecifications.toList())

    override
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: IResolvable) {
      cdkBuilder.additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd.let(IResolvable::unwrap))
    }

    override
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: List<Any>) {
      cdkBuilder.additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd)
    }

    override fun additionalInferenceSpecificationsToAdd(vararg
        additionalInferenceSpecificationsToAdd: Any): Unit =
        additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd.toList())

    override fun approvalDescription(approvalDescription: String) {
      cdkBuilder.approvalDescription(approvalDescription)
    }

    override fun certifyForMarketplace(certifyForMarketplace: Boolean) {
      cdkBuilder.certifyForMarketplace(certifyForMarketplace)
    }

    override fun certifyForMarketplace(certifyForMarketplace: IResolvable) {
      cdkBuilder.certifyForMarketplace(certifyForMarketplace.let(IResolvable::unwrap))
    }

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun customerMetadataProperties(customerMetadataProperties: IResolvable) {
      cdkBuilder.customerMetadataProperties(customerMetadataProperties.let(IResolvable::unwrap))
    }

    override fun customerMetadataProperties(customerMetadataProperties: Map<String, String>) {
      cdkBuilder.customerMetadataProperties(customerMetadataProperties)
    }

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun driftCheckBaselines(driftCheckBaselines: IResolvable) {
      cdkBuilder.driftCheckBaselines(driftCheckBaselines.let(IResolvable::unwrap))
    }

    override
        fun driftCheckBaselines(driftCheckBaselines: CfnModelPackage.DriftCheckBaselinesProperty) {
      cdkBuilder.driftCheckBaselines(driftCheckBaselines.let(CfnModelPackage.DriftCheckBaselinesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20e953fa558ccaa9edc9e6fa879bfb60c111741ba2a80aebc60d00bff1998da4")
    override
        fun driftCheckBaselines(driftCheckBaselines: CfnModelPackage.DriftCheckBaselinesProperty.Builder.() -> Unit):
        Unit = driftCheckBaselines(CfnModelPackage.DriftCheckBaselinesProperty(driftCheckBaselines))

    override fun inferenceSpecification(inferenceSpecification: IResolvable) {
      cdkBuilder.inferenceSpecification(inferenceSpecification.let(IResolvable::unwrap))
    }

    override
        fun inferenceSpecification(inferenceSpecification: CfnModelPackage.InferenceSpecificationProperty) {
      cdkBuilder.inferenceSpecification(inferenceSpecification.let(CfnModelPackage.InferenceSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e216f3dd5acf61f14b9dc7b5d610de80b88550de6b37b027e2978f2b4bf2ad9")
    override
        fun inferenceSpecification(inferenceSpecification: CfnModelPackage.InferenceSpecificationProperty.Builder.() -> Unit):
        Unit =
        inferenceSpecification(CfnModelPackage.InferenceSpecificationProperty(inferenceSpecification))

    override fun lastModifiedTime(lastModifiedTime: String) {
      cdkBuilder.lastModifiedTime(lastModifiedTime)
    }

    override fun metadataProperties(metadataProperties: IResolvable) {
      cdkBuilder.metadataProperties(metadataProperties.let(IResolvable::unwrap))
    }

    override
        fun metadataProperties(metadataProperties: CfnModelPackage.MetadataPropertiesProperty) {
      cdkBuilder.metadataProperties(metadataProperties.let(CfnModelPackage.MetadataPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df38983112debb9256941485a19341f349f3e3fb6aabc2fa8601154c1db63e25")
    override
        fun metadataProperties(metadataProperties: CfnModelPackage.MetadataPropertiesProperty.Builder.() -> Unit):
        Unit = metadataProperties(CfnModelPackage.MetadataPropertiesProperty(metadataProperties))

    override fun modelApprovalStatus(modelApprovalStatus: String) {
      cdkBuilder.modelApprovalStatus(modelApprovalStatus)
    }

    override fun modelMetrics(modelMetrics: IResolvable) {
      cdkBuilder.modelMetrics(modelMetrics.let(IResolvable::unwrap))
    }

    override fun modelMetrics(modelMetrics: CfnModelPackage.ModelMetricsProperty) {
      cdkBuilder.modelMetrics(modelMetrics.let(CfnModelPackage.ModelMetricsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a387f00a27f0bc37297133f9097aef52eb9a2c7b0643bde8646002633ed1fee")
    override
        fun modelMetrics(modelMetrics: CfnModelPackage.ModelMetricsProperty.Builder.() -> Unit):
        Unit = modelMetrics(CfnModelPackage.ModelMetricsProperty(modelMetrics))

    override fun modelPackageDescription(modelPackageDescription: String) {
      cdkBuilder.modelPackageDescription(modelPackageDescription)
    }

    override fun modelPackageGroupName(modelPackageGroupName: String) {
      cdkBuilder.modelPackageGroupName(modelPackageGroupName)
    }

    override fun modelPackageName(modelPackageName: String) {
      cdkBuilder.modelPackageName(modelPackageName)
    }

    override fun modelPackageStatusDetails(modelPackageStatusDetails: IResolvable) {
      cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails.let(IResolvable::unwrap))
    }

    override
        fun modelPackageStatusDetails(modelPackageStatusDetails: CfnModelPackage.ModelPackageStatusDetailsProperty) {
      cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails.let(CfnModelPackage.ModelPackageStatusDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3780f79c6d195a0cd106b9b82d76a6b2ad801452b9135ad5a873e9a53a11585")
    override
        fun modelPackageStatusDetails(modelPackageStatusDetails: CfnModelPackage.ModelPackageStatusDetailsProperty.Builder.() -> Unit):
        Unit =
        modelPackageStatusDetails(CfnModelPackage.ModelPackageStatusDetailsProperty(modelPackageStatusDetails))

    override fun modelPackageVersion(modelPackageVersion: Number) {
      cdkBuilder.modelPackageVersion(modelPackageVersion)
    }

    override fun samplePayloadUrl(samplePayloadUrl: String) {
      cdkBuilder.samplePayloadUrl(samplePayloadUrl)
    }

    override fun skipModelValidation(skipModelValidation: String) {
      cdkBuilder.skipModelValidation(skipModelValidation)
    }

    override fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: IResolvable) {
      cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification.let(IResolvable::unwrap))
    }

    override
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: CfnModelPackage.SourceAlgorithmSpecificationProperty) {
      cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification.let(CfnModelPackage.SourceAlgorithmSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af168644b5d0c74cbc5930d32f3bc5be29d8d5eb83a53c19deb06e95c5892a97")
    override
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: CfnModelPackage.SourceAlgorithmSpecificationProperty.Builder.() -> Unit):
        Unit =
        sourceAlgorithmSpecification(CfnModelPackage.SourceAlgorithmSpecificationProperty(sourceAlgorithmSpecification))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun task(task: String) {
      cdkBuilder.task(task)
    }

    override fun validationSpecification(validationSpecification: IResolvable) {
      cdkBuilder.validationSpecification(validationSpecification.let(IResolvable::unwrap))
    }

    override
        fun validationSpecification(validationSpecification: CfnModelPackage.ValidationSpecificationProperty) {
      cdkBuilder.validationSpecification(validationSpecification.let(CfnModelPackage.ValidationSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95553887979e733cadf816a81a0a0be3a5a4330c352d0bca422bb36aebb2234e")
    override
        fun validationSpecification(validationSpecification: CfnModelPackage.ValidationSpecificationProperty.Builder.() -> Unit):
        Unit =
        validationSpecification(CfnModelPackage.ValidationSpecificationProperty(validationSpecification))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelPackageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageProps,
  ) : CdkObject(cdkObject), CfnModelPackageProps {
    override fun additionalInferenceSpecifications(): Any? =
        unwrap(this).getAdditionalInferenceSpecifications()

    override fun additionalInferenceSpecificationsToAdd(): Any? =
        unwrap(this).getAdditionalInferenceSpecificationsToAdd()

    override fun approvalDescription(): String? = unwrap(this).getApprovalDescription()

    override fun certifyForMarketplace(): Any? = unwrap(this).getCertifyForMarketplace()

    override fun clientToken(): String? = unwrap(this).getClientToken()

    override fun customerMetadataProperties(): Any? = unwrap(this).getCustomerMetadataProperties()

    override fun domain(): String? = unwrap(this).getDomain()

    override fun driftCheckBaselines(): Any? = unwrap(this).getDriftCheckBaselines()

    override fun inferenceSpecification(): Any? = unwrap(this).getInferenceSpecification()

    override fun lastModifiedTime(): String? = unwrap(this).getLastModifiedTime()

    override fun metadataProperties(): Any? = unwrap(this).getMetadataProperties()

    override fun modelApprovalStatus(): String? = unwrap(this).getModelApprovalStatus()

    override fun modelMetrics(): Any? = unwrap(this).getModelMetrics()

    override fun modelPackageDescription(): String? = unwrap(this).getModelPackageDescription()

    override fun modelPackageGroupName(): String? = unwrap(this).getModelPackageGroupName()

    override fun modelPackageName(): String? = unwrap(this).getModelPackageName()

    override fun modelPackageStatusDetails(): Any? = unwrap(this).getModelPackageStatusDetails()

    override fun modelPackageVersion(): Number? = unwrap(this).getModelPackageVersion()

    override fun samplePayloadUrl(): String? = unwrap(this).getSamplePayloadUrl()

    override fun skipModelValidation(): String? = unwrap(this).getSkipModelValidation()

    override fun sourceAlgorithmSpecification(): Any? =
        unwrap(this).getSourceAlgorithmSpecification()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun task(): String? = unwrap(this).getTask()

    override fun validationSpecification(): Any? = unwrap(this).getValidationSpecification()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelPackageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackageProps):
        CfnModelPackageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelPackageProps):
        software.amazon.awscdk.services.sagemaker.CfnModelPackageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnModelPackageProps
  }
}

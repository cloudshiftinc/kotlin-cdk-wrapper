package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnModelPackage internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun additionalInferenceSpecifications(): Any? =
      unwrap(this).getAdditionalInferenceSpecifications()

  public open fun additionalInferenceSpecifications(`value`: IResolvable) {
    unwrap(this).setAdditionalInferenceSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun additionalInferenceSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setAdditionalInferenceSpecifications(__idx_ac66f0)
  }

  public open fun additionalInferenceSpecificationsToAdd(): Any? =
      unwrap(this).getAdditionalInferenceSpecificationsToAdd()

  public open fun additionalInferenceSpecificationsToAdd(`value`: IResolvable) {
    unwrap(this).setAdditionalInferenceSpecificationsToAdd(`value`.let(IResolvable::unwrap))
  }

  public open fun additionalInferenceSpecificationsToAdd(__idx_ac66f0: List<Any>) {
    unwrap(this).setAdditionalInferenceSpecificationsToAdd(__idx_ac66f0)
  }

  public open fun approvalDescription(): String? = unwrap(this).getApprovalDescription()

  public open fun approvalDescription(`value`: String) {
    unwrap(this).setApprovalDescription(`value`)
  }

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrModelPackageArn(): String = unwrap(this).getAttrModelPackageArn()

  public open fun attrModelPackageStatus(): String = unwrap(this).getAttrModelPackageStatus()

  public open fun certifyForMarketplace(): Any? = unwrap(this).getCertifyForMarketplace()

  public open fun certifyForMarketplace(`value`: Boolean) {
    unwrap(this).setCertifyForMarketplace(`value`)
  }

  public open fun certifyForMarketplace(`value`: IResolvable) {
    unwrap(this).setCertifyForMarketplace(`value`.let(IResolvable::unwrap))
  }

  public open fun clientToken(): String? = unwrap(this).getClientToken()

  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  public open fun customerMetadataProperties(): Any? = unwrap(this).getCustomerMetadataProperties()

  public open fun customerMetadataProperties(`value`: IResolvable) {
    unwrap(this).setCustomerMetadataProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun customerMetadataProperties(`value`: Map<String, String>) {
    unwrap(this).setCustomerMetadataProperties(`value`)
  }

  public open fun domain(): String? = unwrap(this).getDomain()

  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  public open fun driftCheckBaselines(): Any? = unwrap(this).getDriftCheckBaselines()

  public open fun driftCheckBaselines(`value`: IResolvable) {
    unwrap(this).setDriftCheckBaselines(`value`.let(IResolvable::unwrap))
  }

  public open fun driftCheckBaselines(`value`: DriftCheckBaselinesProperty) {
    unwrap(this).setDriftCheckBaselines(`value`.let(DriftCheckBaselinesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d01fd3368f0bbdcec61d8ecf1d0a9767efd971f63d3df30affa479f6ad32d949")
  public open fun driftCheckBaselines(`value`: DriftCheckBaselinesProperty.Builder.() -> Unit): Unit
      = driftCheckBaselines(DriftCheckBaselinesProperty(`value`))

  public open fun inferenceSpecification(): Any? = unwrap(this).getInferenceSpecification()

  public open fun inferenceSpecification(`value`: IResolvable) {
    unwrap(this).setInferenceSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun inferenceSpecification(`value`: InferenceSpecificationProperty) {
    unwrap(this).setInferenceSpecification(`value`.let(InferenceSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d2c3d3762c4b909a9f13e1ccd787820f905d545e9807623e96b0e812f0e4549")
  public open
      fun inferenceSpecification(`value`: InferenceSpecificationProperty.Builder.() -> Unit): Unit =
      inferenceSpecification(InferenceSpecificationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lastModifiedTime(): String? = unwrap(this).getLastModifiedTime()

  public open fun lastModifiedTime(`value`: String) {
    unwrap(this).setLastModifiedTime(`value`)
  }

  public open fun metadataProperties(): Any? = unwrap(this).getMetadataProperties()

  public open fun metadataProperties(`value`: IResolvable) {
    unwrap(this).setMetadataProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun metadataProperties(`value`: MetadataPropertiesProperty) {
    unwrap(this).setMetadataProperties(`value`.let(MetadataPropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d498c70c5f49479794ea3aad6d904b1e15c35e37414ec0ed63fee77a6a0e029e")
  public open fun metadataProperties(`value`: MetadataPropertiesProperty.Builder.() -> Unit): Unit =
      metadataProperties(MetadataPropertiesProperty(`value`))

  public open fun modelApprovalStatus(): String? = unwrap(this).getModelApprovalStatus()

  public open fun modelApprovalStatus(`value`: String) {
    unwrap(this).setModelApprovalStatus(`value`)
  }

  public open fun modelMetrics(): Any? = unwrap(this).getModelMetrics()

  public open fun modelMetrics(`value`: IResolvable) {
    unwrap(this).setModelMetrics(`value`.let(IResolvable::unwrap))
  }

  public open fun modelMetrics(`value`: ModelMetricsProperty) {
    unwrap(this).setModelMetrics(`value`.let(ModelMetricsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("94979f7e82bb9745540bce7a16361d26c9c15caa7cf120c9077f8bc87788b015")
  public open fun modelMetrics(`value`: ModelMetricsProperty.Builder.() -> Unit): Unit =
      modelMetrics(ModelMetricsProperty(`value`))

  public open fun modelPackageDescription(): String? = unwrap(this).getModelPackageDescription()

  public open fun modelPackageDescription(`value`: String) {
    unwrap(this).setModelPackageDescription(`value`)
  }

  public open fun modelPackageGroupName(): String? = unwrap(this).getModelPackageGroupName()

  public open fun modelPackageGroupName(`value`: String) {
    unwrap(this).setModelPackageGroupName(`value`)
  }

  public open fun modelPackageName(): String? = unwrap(this).getModelPackageName()

  public open fun modelPackageName(`value`: String) {
    unwrap(this).setModelPackageName(`value`)
  }

  public open fun modelPackageStatusDetails(): Any? = unwrap(this).getModelPackageStatusDetails()

  public open fun modelPackageStatusDetails(`value`: IResolvable) {
    unwrap(this).setModelPackageStatusDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun modelPackageStatusDetails(`value`: ModelPackageStatusDetailsProperty) {
    unwrap(this).setModelPackageStatusDetails(`value`.let(ModelPackageStatusDetailsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5f5907dd6a5634c710e72408110136b7a0f0d8a4901ed3f18423e1c8e83ea922")
  public open
      fun modelPackageStatusDetails(`value`: ModelPackageStatusDetailsProperty.Builder.() -> Unit):
      Unit = modelPackageStatusDetails(ModelPackageStatusDetailsProperty(`value`))

  public open fun modelPackageVersion(): Number? = unwrap(this).getModelPackageVersion()

  public open fun modelPackageVersion(`value`: Number) {
    unwrap(this).setModelPackageVersion(`value`)
  }

  public open fun samplePayloadUrl(): String? = unwrap(this).getSamplePayloadUrl()

  public open fun samplePayloadUrl(`value`: String) {
    unwrap(this).setSamplePayloadUrl(`value`)
  }

  public open fun skipModelValidation(): String? = unwrap(this).getSkipModelValidation()

  public open fun skipModelValidation(`value`: String) {
    unwrap(this).setSkipModelValidation(`value`)
  }

  public open fun sourceAlgorithmSpecification(): Any? =
      unwrap(this).getSourceAlgorithmSpecification()

  public open fun sourceAlgorithmSpecification(`value`: IResolvable) {
    unwrap(this).setSourceAlgorithmSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceAlgorithmSpecification(`value`: SourceAlgorithmSpecificationProperty) {
    unwrap(this).setSourceAlgorithmSpecification(`value`.let(SourceAlgorithmSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a9e2cef8a14af5cd74d8adb6e4011fd865402eaefe95d53425d7f248f2576db0")
  public open
      fun sourceAlgorithmSpecification(`value`: SourceAlgorithmSpecificationProperty.Builder.() -> Unit):
      Unit = sourceAlgorithmSpecification(SourceAlgorithmSpecificationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun task(): String? = unwrap(this).getTask()

  public open fun task(`value`: String) {
    unwrap(this).setTask(`value`)
  }

  public open fun validationSpecification(): Any? = unwrap(this).getValidationSpecification()

  public open fun validationSpecification(`value`: IResolvable) {
    unwrap(this).setValidationSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun validationSpecification(`value`: ValidationSpecificationProperty) {
    unwrap(this).setValidationSpecification(`value`.let(ValidationSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("164275543bb77010f0687951a1b5558256913cf6caf0a0f0b820d4222e314e3e")
  public open
      fun validationSpecification(`value`: ValidationSpecificationProperty.Builder.() -> Unit): Unit
      = validationSpecification(ValidationSpecificationProperty(`value`))

  public interface Builder {
    public fun additionalInferenceSpecifications(additionalInferenceSpecifications: IResolvable) {
    }

    public fun additionalInferenceSpecifications(additionalInferenceSpecifications: List<Any>) {
    }

    public
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: IResolvable) {
    }

    public
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: List<Any>) {
    }

    public fun approvalDescription(approvalDescription: String) {
    }

    public fun certifyForMarketplace(certifyForMarketplace: Boolean) {
    }

    public fun certifyForMarketplace(certifyForMarketplace: IResolvable) {
    }

    public fun clientToken(clientToken: String) {
    }

    public fun customerMetadataProperties(customerMetadataProperties: IResolvable) {
    }

    public fun customerMetadataProperties(customerMetadataProperties: Map<String, String>) {
    }

    public fun domain(domain: String) {
    }

    public fun driftCheckBaselines(driftCheckBaselines: IResolvable) {
    }

    public fun driftCheckBaselines(driftCheckBaselines: DriftCheckBaselinesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd3813ed732be0df3b84a486d67699bbdb8ebf7a0284ad6157146b7e74ebd54a")
    public
        fun driftCheckBaselines(driftCheckBaselines: DriftCheckBaselinesProperty.Builder.() -> Unit) {
    }

    public fun inferenceSpecification(inferenceSpecification: IResolvable) {
    }

    public fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01fe09a95aa538ca8d34a7f48b4200c1cbc009cb7a6b4ff100f6af39051f642c")
    public
        fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty.Builder.() -> Unit) {
    }

    public fun lastModifiedTime(lastModifiedTime: String) {
    }

    public fun metadataProperties(metadataProperties: IResolvable) {
    }

    public fun metadataProperties(metadataProperties: MetadataPropertiesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfb0ceea10e37a93d7fc3f8ce8fca16f93995a81c01f3ec3e44888d4433ab59e")
    public
        fun metadataProperties(metadataProperties: MetadataPropertiesProperty.Builder.() -> Unit) {
    }

    public fun modelApprovalStatus(modelApprovalStatus: String) {
    }

    public fun modelMetrics(modelMetrics: IResolvable) {
    }

    public fun modelMetrics(modelMetrics: ModelMetricsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("722c220ed8ea051362c8be2e757ad919c1b15f1d4add2b649dc4fa954e150a39")
    public fun modelMetrics(modelMetrics: ModelMetricsProperty.Builder.() -> Unit) {
    }

    public fun modelPackageDescription(modelPackageDescription: String) {
    }

    public fun modelPackageGroupName(modelPackageGroupName: String) {
    }

    public fun modelPackageName(modelPackageName: String) {
    }

    public fun modelPackageStatusDetails(modelPackageStatusDetails: IResolvable) {
    }

    public
        fun modelPackageStatusDetails(modelPackageStatusDetails: ModelPackageStatusDetailsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb12f14dcab652f6946953ce722874384ffe72391251a6f4b6cc8d0e273e9e14")
    public
        fun modelPackageStatusDetails(modelPackageStatusDetails: ModelPackageStatusDetailsProperty.Builder.() -> Unit) {
    }

    public fun modelPackageVersion(modelPackageVersion: Number) {
    }

    public fun samplePayloadUrl(samplePayloadUrl: String) {
    }

    public fun skipModelValidation(skipModelValidation: String) {
    }

    public fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: IResolvable) {
    }

    public
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: SourceAlgorithmSpecificationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e02988bd9476acbdfc852bc4bd36390a8ecae5ba99c2af7e4064054cc3cec056")
    public
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: SourceAlgorithmSpecificationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun task(task: String) {
    }

    public fun validationSpecification(validationSpecification: IResolvable) {
    }

    public fun validationSpecification(validationSpecification: ValidationSpecificationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ee97043ca056526984ecac5319a17d610d8189c4b87d891b3d7e866c96d3df9")
    public
        fun validationSpecification(validationSpecification: ValidationSpecificationProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnModelPackage.Builder =
        software.amazon.awscdk.services.sagemaker.CfnModelPackage.Builder.create(scope, id)

    public override
        fun additionalInferenceSpecifications(additionalInferenceSpecifications: IResolvable) {
      cdkBuilder.additionalInferenceSpecifications(additionalInferenceSpecifications.let(IResolvable::unwrap))
    }

    public override
        fun additionalInferenceSpecifications(additionalInferenceSpecifications: List<Any>) {
      cdkBuilder.additionalInferenceSpecifications(additionalInferenceSpecifications)
    }

    public override
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: IResolvable) {
      cdkBuilder.additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd.let(IResolvable::unwrap))
    }

    public override
        fun additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd: List<Any>) {
      cdkBuilder.additionalInferenceSpecificationsToAdd(additionalInferenceSpecificationsToAdd)
    }

    public override fun approvalDescription(approvalDescription: String) {
      cdkBuilder.approvalDescription(approvalDescription)
    }

    public override fun certifyForMarketplace(certifyForMarketplace: Boolean) {
      cdkBuilder.certifyForMarketplace(certifyForMarketplace)
    }

    public override fun certifyForMarketplace(certifyForMarketplace: IResolvable) {
      cdkBuilder.certifyForMarketplace(certifyForMarketplace.let(IResolvable::unwrap))
    }

    public override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    public override fun customerMetadataProperties(customerMetadataProperties: IResolvable) {
      cdkBuilder.customerMetadataProperties(customerMetadataProperties.let(IResolvable::unwrap))
    }

    public override
        fun customerMetadataProperties(customerMetadataProperties: Map<String, String>) {
      cdkBuilder.customerMetadataProperties(customerMetadataProperties)
    }

    public override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    public override fun driftCheckBaselines(driftCheckBaselines: IResolvable) {
      cdkBuilder.driftCheckBaselines(driftCheckBaselines.let(IResolvable::unwrap))
    }

    public override fun driftCheckBaselines(driftCheckBaselines: DriftCheckBaselinesProperty) {
      cdkBuilder.driftCheckBaselines(driftCheckBaselines.let(DriftCheckBaselinesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd3813ed732be0df3b84a486d67699bbdb8ebf7a0284ad6157146b7e74ebd54a")
    public override
        fun driftCheckBaselines(driftCheckBaselines: DriftCheckBaselinesProperty.Builder.() -> Unit):
        Unit = driftCheckBaselines(DriftCheckBaselinesProperty(driftCheckBaselines))

    public override fun inferenceSpecification(inferenceSpecification: IResolvable) {
      cdkBuilder.inferenceSpecification(inferenceSpecification.let(IResolvable::unwrap))
    }

    public override
        fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty) {
      cdkBuilder.inferenceSpecification(inferenceSpecification.let(InferenceSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01fe09a95aa538ca8d34a7f48b4200c1cbc009cb7a6b4ff100f6af39051f642c")
    public override
        fun inferenceSpecification(inferenceSpecification: InferenceSpecificationProperty.Builder.() -> Unit):
        Unit = inferenceSpecification(InferenceSpecificationProperty(inferenceSpecification))

    public override fun lastModifiedTime(lastModifiedTime: String) {
      cdkBuilder.lastModifiedTime(lastModifiedTime)
    }

    public override fun metadataProperties(metadataProperties: IResolvable) {
      cdkBuilder.metadataProperties(metadataProperties.let(IResolvable::unwrap))
    }

    public override fun metadataProperties(metadataProperties: MetadataPropertiesProperty) {
      cdkBuilder.metadataProperties(metadataProperties.let(MetadataPropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfb0ceea10e37a93d7fc3f8ce8fca16f93995a81c01f3ec3e44888d4433ab59e")
    public override
        fun metadataProperties(metadataProperties: MetadataPropertiesProperty.Builder.() -> Unit):
        Unit = metadataProperties(MetadataPropertiesProperty(metadataProperties))

    public override fun modelApprovalStatus(modelApprovalStatus: String) {
      cdkBuilder.modelApprovalStatus(modelApprovalStatus)
    }

    public override fun modelMetrics(modelMetrics: IResolvable) {
      cdkBuilder.modelMetrics(modelMetrics.let(IResolvable::unwrap))
    }

    public override fun modelMetrics(modelMetrics: ModelMetricsProperty) {
      cdkBuilder.modelMetrics(modelMetrics.let(ModelMetricsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("722c220ed8ea051362c8be2e757ad919c1b15f1d4add2b649dc4fa954e150a39")
    public override fun modelMetrics(modelMetrics: ModelMetricsProperty.Builder.() -> Unit): Unit =
        modelMetrics(ModelMetricsProperty(modelMetrics))

    public override fun modelPackageDescription(modelPackageDescription: String) {
      cdkBuilder.modelPackageDescription(modelPackageDescription)
    }

    public override fun modelPackageGroupName(modelPackageGroupName: String) {
      cdkBuilder.modelPackageGroupName(modelPackageGroupName)
    }

    public override fun modelPackageName(modelPackageName: String) {
      cdkBuilder.modelPackageName(modelPackageName)
    }

    public override fun modelPackageStatusDetails(modelPackageStatusDetails: IResolvable) {
      cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails.let(IResolvable::unwrap))
    }

    public override
        fun modelPackageStatusDetails(modelPackageStatusDetails: ModelPackageStatusDetailsProperty) {
      cdkBuilder.modelPackageStatusDetails(modelPackageStatusDetails.let(ModelPackageStatusDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb12f14dcab652f6946953ce722874384ffe72391251a6f4b6cc8d0e273e9e14")
    public override
        fun modelPackageStatusDetails(modelPackageStatusDetails: ModelPackageStatusDetailsProperty.Builder.() -> Unit):
        Unit =
        modelPackageStatusDetails(ModelPackageStatusDetailsProperty(modelPackageStatusDetails))

    public override fun modelPackageVersion(modelPackageVersion: Number) {
      cdkBuilder.modelPackageVersion(modelPackageVersion)
    }

    public override fun samplePayloadUrl(samplePayloadUrl: String) {
      cdkBuilder.samplePayloadUrl(samplePayloadUrl)
    }

    public override fun skipModelValidation(skipModelValidation: String) {
      cdkBuilder.skipModelValidation(skipModelValidation)
    }

    public override fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: IResolvable) {
      cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification.let(IResolvable::unwrap))
    }

    public override
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: SourceAlgorithmSpecificationProperty) {
      cdkBuilder.sourceAlgorithmSpecification(sourceAlgorithmSpecification.let(SourceAlgorithmSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e02988bd9476acbdfc852bc4bd36390a8ecae5ba99c2af7e4064054cc3cec056")
    public override
        fun sourceAlgorithmSpecification(sourceAlgorithmSpecification: SourceAlgorithmSpecificationProperty.Builder.() -> Unit):
        Unit =
        sourceAlgorithmSpecification(SourceAlgorithmSpecificationProperty(sourceAlgorithmSpecification))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun task(task: String) {
      cdkBuilder.task(task)
    }

    public override fun validationSpecification(validationSpecification: IResolvable) {
      cdkBuilder.validationSpecification(validationSpecification.let(IResolvable::unwrap))
    }

    public override
        fun validationSpecification(validationSpecification: ValidationSpecificationProperty) {
      cdkBuilder.validationSpecification(validationSpecification.let(ValidationSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ee97043ca056526984ecac5319a17d610d8189c4b87d891b3d7e866c96d3df9")
    public override
        fun validationSpecification(validationSpecification: ValidationSpecificationProperty.Builder.() -> Unit):
        Unit = validationSpecification(ValidationSpecificationProperty(validationSpecification))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelPackage =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModelPackage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModelPackage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage):
        CfnModelPackage = CfnModelPackage(cdkObject)

    internal fun unwrap(wrapped: CfnModelPackage):
        software.amazon.awscdk.services.sagemaker.CfnModelPackage = wrapped.cdkObject
  }

  public interface BiasProperty {
    public fun postTrainingReport(): Any? = unwrap(this).getPostTrainingReport()

    public fun preTrainingReport(): Any? = unwrap(this).getPreTrainingReport()

    public fun report(): Any? = unwrap(this).getReport()

    public interface Builder {
      public fun postTrainingReport(postTrainingReport: IResolvable) {
      }

      public fun postTrainingReport(postTrainingReport: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7518be2ecca968b747e0cb56a1dd4e9c0624e41b037d55acd2668fde63c47f0c")
      public fun postTrainingReport(postTrainingReport: MetricsSourceProperty.Builder.() -> Unit) {
      }

      public fun preTrainingReport(preTrainingReport: IResolvable) {
      }

      public fun preTrainingReport(preTrainingReport: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c284f5e0c1d4d792395a22dd0b0daab4cb58c99ff9f1f2bfbc50c3bb32bdcfa3")
      public fun preTrainingReport(preTrainingReport: MetricsSourceProperty.Builder.() -> Unit) {
      }

      public fun report(report: IResolvable) {
      }

      public fun report(report: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31758d5b749eb5240a789a43c50577c80045025222dcd62b97de562df9566c8e")
      public fun report(report: MetricsSourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty.builder()

      public override fun postTrainingReport(postTrainingReport: IResolvable) {
        cdkBuilder.postTrainingReport(postTrainingReport.let(IResolvable::unwrap))
      }

      public override fun postTrainingReport(postTrainingReport: MetricsSourceProperty) {
        cdkBuilder.postTrainingReport(postTrainingReport.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7518be2ecca968b747e0cb56a1dd4e9c0624e41b037d55acd2668fde63c47f0c")
      public override
          fun postTrainingReport(postTrainingReport: MetricsSourceProperty.Builder.() -> Unit): Unit
          = postTrainingReport(MetricsSourceProperty(postTrainingReport))

      public override fun preTrainingReport(preTrainingReport: IResolvable) {
        cdkBuilder.preTrainingReport(preTrainingReport.let(IResolvable::unwrap))
      }

      public override fun preTrainingReport(preTrainingReport: MetricsSourceProperty) {
        cdkBuilder.preTrainingReport(preTrainingReport.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c284f5e0c1d4d792395a22dd0b0daab4cb58c99ff9f1f2bfbc50c3bb32bdcfa3")
      public override
          fun preTrainingReport(preTrainingReport: MetricsSourceProperty.Builder.() -> Unit): Unit =
          preTrainingReport(MetricsSourceProperty(preTrainingReport))

      public override fun report(report: IResolvable) {
        cdkBuilder.report(report.let(IResolvable::unwrap))
      }

      public override fun report(report: MetricsSourceProperty) {
        cdkBuilder.report(report.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31758d5b749eb5240a789a43c50577c80045025222dcd62b97de562df9566c8e")
      public override fun report(report: MetricsSourceProperty.Builder.() -> Unit): Unit =
          report(MetricsSourceProperty(report))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty,
    ) : BiasProperty {
      public override fun postTrainingReport(): Any? = unwrap(this).getPostTrainingReport()

      public override fun preTrainingReport(): Any? = unwrap(this).getPreTrainingReport()

      public override fun report(): Any? = unwrap(this).getReport()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BiasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty):
          BiasProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BiasProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.BiasProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SourceAlgorithmSpecificationProperty {
    public fun sourceAlgorithms(): Any

    public interface Builder {
      public fun sourceAlgorithms(sourceAlgorithms: IResolvable) {
      }

      public fun sourceAlgorithms(sourceAlgorithms: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty.builder()

      public override fun sourceAlgorithms(sourceAlgorithms: IResolvable) {
        cdkBuilder.sourceAlgorithms(sourceAlgorithms.let(IResolvable::unwrap))
      }

      public override fun sourceAlgorithms(sourceAlgorithms: List<Any>) {
        cdkBuilder.sourceAlgorithms(sourceAlgorithms)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty,
    ) : SourceAlgorithmSpecificationProperty {
      public override fun sourceAlgorithms(): Any = unwrap(this).getSourceAlgorithms()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SourceAlgorithmSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty):
          SourceAlgorithmSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceAlgorithmSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExplainabilityProperty {
    public fun report(): Any? = unwrap(this).getReport()

    public interface Builder {
      public fun report(report: IResolvable) {
      }

      public fun report(report: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6226d61ca0d55fa1ebe648926a6b2f4a99bd4a20e34c6e80dd3e94c2462663ef")
      public fun report(report: MetricsSourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty.builder()

      public override fun report(report: IResolvable) {
        cdkBuilder.report(report.let(IResolvable::unwrap))
      }

      public override fun report(report: MetricsSourceProperty) {
        cdkBuilder.report(report.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6226d61ca0d55fa1ebe648926a6b2f4a99bd4a20e34c6e80dd3e94c2462663ef")
      public override fun report(report: MetricsSourceProperty.Builder.() -> Unit): Unit =
          report(MetricsSourceProperty(report))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty,
    ) : ExplainabilityProperty {
      public override fun report(): Any? = unwrap(this).getReport()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExplainabilityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty):
          ExplainabilityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExplainabilityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ExplainabilityProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DriftCheckBaselinesProperty {
    public fun bias(): Any? = unwrap(this).getBias()

    public fun explainability(): Any? = unwrap(this).getExplainability()

    public fun modelDataQuality(): Any? = unwrap(this).getModelDataQuality()

    public fun modelQuality(): Any? = unwrap(this).getModelQuality()

    public interface Builder {
      public fun bias(bias: IResolvable) {
      }

      public fun bias(bias: DriftCheckBiasProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("928782260f85ee87168ab2f3b43473ba5e2fee2025bec3c747b4b13189fd326a")
      public fun bias(bias: DriftCheckBiasProperty.Builder.() -> Unit) {
      }

      public fun explainability(explainability: IResolvable) {
      }

      public fun explainability(explainability: DriftCheckExplainabilityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bec72e51059c6e4692aa5a35935f4d2fb1630952fd479c84cba4d358c73c2fc5")
      public
          fun explainability(explainability: DriftCheckExplainabilityProperty.Builder.() -> Unit) {
      }

      public fun modelDataQuality(modelDataQuality: IResolvable) {
      }

      public fun modelDataQuality(modelDataQuality: DriftCheckModelDataQualityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe84f7ca72bef9952679d6519e935f3ba52590948c2e3223511da975d1d82232")
      public
          fun modelDataQuality(modelDataQuality: DriftCheckModelDataQualityProperty.Builder.() -> Unit) {
      }

      public fun modelQuality(modelQuality: IResolvable) {
      }

      public fun modelQuality(modelQuality: DriftCheckModelQualityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fb86383a4e71c1bd29f6dcec128bec46a7bc676f9a22e80363ceaaee6be6171")
      public fun modelQuality(modelQuality: DriftCheckModelQualityProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty.builder()

      public override fun bias(bias: IResolvable) {
        cdkBuilder.bias(bias.let(IResolvable::unwrap))
      }

      public override fun bias(bias: DriftCheckBiasProperty) {
        cdkBuilder.bias(bias.let(DriftCheckBiasProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("928782260f85ee87168ab2f3b43473ba5e2fee2025bec3c747b4b13189fd326a")
      public override fun bias(bias: DriftCheckBiasProperty.Builder.() -> Unit): Unit =
          bias(DriftCheckBiasProperty(bias))

      public override fun explainability(explainability: IResolvable) {
        cdkBuilder.explainability(explainability.let(IResolvable::unwrap))
      }

      public override fun explainability(explainability: DriftCheckExplainabilityProperty) {
        cdkBuilder.explainability(explainability.let(DriftCheckExplainabilityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bec72e51059c6e4692aa5a35935f4d2fb1630952fd479c84cba4d358c73c2fc5")
      public override
          fun explainability(explainability: DriftCheckExplainabilityProperty.Builder.() -> Unit):
          Unit = explainability(DriftCheckExplainabilityProperty(explainability))

      public override fun modelDataQuality(modelDataQuality: IResolvable) {
        cdkBuilder.modelDataQuality(modelDataQuality.let(IResolvable::unwrap))
      }

      public override fun modelDataQuality(modelDataQuality: DriftCheckModelDataQualityProperty) {
        cdkBuilder.modelDataQuality(modelDataQuality.let(DriftCheckModelDataQualityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe84f7ca72bef9952679d6519e935f3ba52590948c2e3223511da975d1d82232")
      public override
          fun modelDataQuality(modelDataQuality: DriftCheckModelDataQualityProperty.Builder.() -> Unit):
          Unit = modelDataQuality(DriftCheckModelDataQualityProperty(modelDataQuality))

      public override fun modelQuality(modelQuality: IResolvable) {
        cdkBuilder.modelQuality(modelQuality.let(IResolvable::unwrap))
      }

      public override fun modelQuality(modelQuality: DriftCheckModelQualityProperty) {
        cdkBuilder.modelQuality(modelQuality.let(DriftCheckModelQualityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fb86383a4e71c1bd29f6dcec128bec46a7bc676f9a22e80363ceaaee6be6171")
      public override
          fun modelQuality(modelQuality: DriftCheckModelQualityProperty.Builder.() -> Unit): Unit =
          modelQuality(DriftCheckModelQualityProperty(modelQuality))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty,
    ) : DriftCheckBaselinesProperty {
      public override fun bias(): Any? = unwrap(this).getBias()

      public override fun explainability(): Any? = unwrap(this).getExplainability()

      public override fun modelDataQuality(): Any? = unwrap(this).getModelDataQuality()

      public override fun modelQuality(): Any? = unwrap(this).getModelQuality()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DriftCheckBaselinesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty):
          DriftCheckBaselinesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DriftCheckBaselinesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBaselinesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ValidationProfileProperty {
    public fun profileName(): String

    public fun transformJobDefinition(): Any

    public interface Builder {
      public fun profileName(profileName: String) {
      }

      public fun transformJobDefinition(transformJobDefinition: IResolvable) {
      }

      public fun transformJobDefinition(transformJobDefinition: TransformJobDefinitionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a474cb846bb6f45fabf0cac8c72139c0a32686c9dbdc9792327efb3e0ffd582a")
      public
          fun transformJobDefinition(transformJobDefinition: TransformJobDefinitionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty.builder()

      public override fun profileName(profileName: String) {
        cdkBuilder.profileName(profileName)
      }

      public override fun transformJobDefinition(transformJobDefinition: IResolvable) {
        cdkBuilder.transformJobDefinition(transformJobDefinition.let(IResolvable::unwrap))
      }

      public override
          fun transformJobDefinition(transformJobDefinition: TransformJobDefinitionProperty) {
        cdkBuilder.transformJobDefinition(transformJobDefinition.let(TransformJobDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a474cb846bb6f45fabf0cac8c72139c0a32686c9dbdc9792327efb3e0ffd582a")
      public override
          fun transformJobDefinition(transformJobDefinition: TransformJobDefinitionProperty.Builder.() -> Unit):
          Unit = transformJobDefinition(TransformJobDefinitionProperty(transformJobDefinition))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty,
    ) : ValidationProfileProperty {
      public override fun profileName(): String = unwrap(this).getProfileName()

      public override fun transformJobDefinition(): Any = unwrap(this).getTransformJobDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValidationProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty):
          ValidationProfileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidationProfileProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationProfileProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InferenceSpecificationProperty {
    public fun containers(): Any

    public fun supportedContentTypes(): List<String>

    public fun supportedRealtimeInferenceInstanceTypes(): List<String> =
        unwrap(this).getSupportedRealtimeInferenceInstanceTypes() ?: emptyList()

    public fun supportedResponseMimeTypes(): List<String>

    public fun supportedTransformInstanceTypes(): List<String> =
        unwrap(this).getSupportedTransformInstanceTypes() ?: emptyList()

    public interface Builder {
      public fun containers(containers: IResolvable) {
      }

      public fun containers(containers: List<Any>) {
      }

      public fun supportedContentTypes(supportedContentTypes: List<String>) {
      }

      public
          fun supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes: List<String>) {
      }

      public fun supportedResponseMimeTypes(supportedResponseMimeTypes: List<String>) {
      }

      public fun supportedTransformInstanceTypes(supportedTransformInstanceTypes: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty.builder()

      public override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable::unwrap))
      }

      public override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers)
      }

      public override fun supportedContentTypes(supportedContentTypes: List<String>) {
        cdkBuilder.supportedContentTypes(supportedContentTypes)
      }

      public override
          fun supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes: List<String>) {
        cdkBuilder.supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes)
      }

      public override fun supportedResponseMimeTypes(supportedResponseMimeTypes: List<String>) {
        cdkBuilder.supportedResponseMimeTypes(supportedResponseMimeTypes)
      }

      public override
          fun supportedTransformInstanceTypes(supportedTransformInstanceTypes: List<String>) {
        cdkBuilder.supportedTransformInstanceTypes(supportedTransformInstanceTypes)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty,
    ) : InferenceSpecificationProperty {
      public override fun containers(): Any = unwrap(this).getContainers()

      public override fun supportedContentTypes(): List<String> =
          unwrap(this).getSupportedContentTypes() ?: emptyList()

      public override fun supportedRealtimeInferenceInstanceTypes(): List<String> =
          unwrap(this).getSupportedRealtimeInferenceInstanceTypes() ?: emptyList()

      public override fun supportedResponseMimeTypes(): List<String> =
          unwrap(this).getSupportedResponseMimeTypes() ?: emptyList()

      public override fun supportedTransformInstanceTypes(): List<String> =
          unwrap(this).getSupportedTransformInstanceTypes() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty):
          InferenceSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.InferenceSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DriftCheckModelQualityProperty {
    public fun constraints(): Any? = unwrap(this).getConstraints()

    public fun statistics(): Any? = unwrap(this).getStatistics()

    public interface Builder {
      public fun constraints(constraints: IResolvable) {
      }

      public fun constraints(constraints: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e279833095b174ae27c37e67729b9102c62f9400b31cc7479e29208376d09e")
      public fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit) {
      }

      public fun statistics(statistics: IResolvable) {
      }

      public fun statistics(statistics: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3940780e4a07cd964e2f2dcc12f27871b85f89660dc8f88daac10d7a85bfc948")
      public fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty.builder()

      public override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable::unwrap))
      }

      public override fun constraints(constraints: MetricsSourceProperty) {
        cdkBuilder.constraints(constraints.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e279833095b174ae27c37e67729b9102c62f9400b31cc7479e29208376d09e")
      public override fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit): Unit =
          constraints(MetricsSourceProperty(constraints))

      public override fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics.let(IResolvable::unwrap))
      }

      public override fun statistics(statistics: MetricsSourceProperty) {
        cdkBuilder.statistics(statistics.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3940780e4a07cd964e2f2dcc12f27871b85f89660dc8f88daac10d7a85bfc948")
      public override fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit): Unit =
          statistics(MetricsSourceProperty(statistics))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty,
    ) : DriftCheckModelQualityProperty {
      public override fun constraints(): Any? = unwrap(this).getConstraints()

      public override fun statistics(): Any? = unwrap(this).getStatistics()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DriftCheckModelQualityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty):
          DriftCheckModelQualityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DriftCheckModelQualityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelQualityProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelPackageStatusDetailsProperty {
    public fun validationStatuses(): Any? = unwrap(this).getValidationStatuses()

    public interface Builder {
      public fun validationStatuses(validationStatuses: IResolvable) {
      }

      public fun validationStatuses(validationStatuses: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty.builder()

      public override fun validationStatuses(validationStatuses: IResolvable) {
        cdkBuilder.validationStatuses(validationStatuses.let(IResolvable::unwrap))
      }

      public override fun validationStatuses(validationStatuses: List<Any>) {
        cdkBuilder.validationStatuses(validationStatuses)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty,
    ) : ModelPackageStatusDetailsProperty {
      public override fun validationStatuses(): Any? = unwrap(this).getValidationStatuses()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelPackageStatusDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty):
          ModelPackageStatusDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageStatusDetailsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TransformResourcesProperty {
    public fun instanceCount(): Number

    public fun instanceType(): String

    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    public interface Builder {
      public fun instanceCount(instanceCount: Number) {
      }

      public fun instanceType(instanceType: String) {
      }

      public fun volumeKmsKeyId(volumeKmsKeyId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty.builder()

      public override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      public override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public override fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty,
    ) : TransformResourcesProperty {
      public override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      public override fun instanceType(): String = unwrap(this).getInstanceType()

      public override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TransformResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty):
          TransformResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformResourcesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformResourcesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DriftCheckExplainabilityProperty {
    public fun configFile(): Any? = unwrap(this).getConfigFile()

    public fun constraints(): Any? = unwrap(this).getConstraints()

    public interface Builder {
      public fun configFile(configFile: IResolvable) {
      }

      public fun configFile(configFile: FileSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c706fe7141916f9bc2539d511c2cf67a8dd0fd1ee2cc7f0843591345917138a6")
      public fun configFile(configFile: FileSourceProperty.Builder.() -> Unit) {
      }

      public fun constraints(constraints: IResolvable) {
      }

      public fun constraints(constraints: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("510f79405b037af9db3613e9e0b5c9185c9fde2eb6daf836ab525b3d89aff1a7")
      public fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty.builder()

      public override fun configFile(configFile: IResolvable) {
        cdkBuilder.configFile(configFile.let(IResolvable::unwrap))
      }

      public override fun configFile(configFile: FileSourceProperty) {
        cdkBuilder.configFile(configFile.let(FileSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c706fe7141916f9bc2539d511c2cf67a8dd0fd1ee2cc7f0843591345917138a6")
      public override fun configFile(configFile: FileSourceProperty.Builder.() -> Unit): Unit =
          configFile(FileSourceProperty(configFile))

      public override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable::unwrap))
      }

      public override fun constraints(constraints: MetricsSourceProperty) {
        cdkBuilder.constraints(constraints.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("510f79405b037af9db3613e9e0b5c9185c9fde2eb6daf836ab525b3d89aff1a7")
      public override fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit): Unit =
          constraints(MetricsSourceProperty(constraints))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty,
    ) : DriftCheckExplainabilityProperty {
      public override fun configFile(): Any? = unwrap(this).getConfigFile()

      public override fun constraints(): Any? = unwrap(this).getConstraints()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DriftCheckExplainabilityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty):
          DriftCheckExplainabilityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DriftCheckExplainabilityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckExplainabilityProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TransformJobDefinitionProperty {
    public fun batchStrategy(): String? = unwrap(this).getBatchStrategy()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun maxConcurrentTransforms(): Number? = unwrap(this).getMaxConcurrentTransforms()

    public fun maxPayloadInMb(): Number? = unwrap(this).getMaxPayloadInMb()

    public fun transformInput(): Any

    public fun transformOutput(): Any

    public fun transformResources(): Any

    public interface Builder {
      public fun batchStrategy(batchStrategy: String) {
      }

      public fun environment(environment: IResolvable) {
      }

      public fun environment(environment: Map<String, String>) {
      }

      public fun maxConcurrentTransforms(maxConcurrentTransforms: Number) {
      }

      public fun maxPayloadInMb(maxPayloadInMb: Number) {
      }

      public fun transformInput(transformInput: IResolvable) {
      }

      public fun transformInput(transformInput: TransformInputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20571916d44bec5aa2706c1c71bae57ba5ed064c50b6d72e189ff26ba6afb55f")
      public fun transformInput(transformInput: TransformInputProperty.Builder.() -> Unit) {
      }

      public fun transformOutput(transformOutput: IResolvable) {
      }

      public fun transformOutput(transformOutput: TransformOutputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c83a6d8001850c633dde75c66011537a09e384942155594f95a2fe33bda5265")
      public fun transformOutput(transformOutput: TransformOutputProperty.Builder.() -> Unit) {
      }

      public fun transformResources(transformResources: IResolvable) {
      }

      public fun transformResources(transformResources: TransformResourcesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3b313075a4a02a44f820c052872d95513973bd42395efb835d4dcf14876eb07")
      public
          fun transformResources(transformResources: TransformResourcesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty.builder()

      public override fun batchStrategy(batchStrategy: String) {
        cdkBuilder.batchStrategy(batchStrategy)
      }

      public override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      public override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      public override fun maxConcurrentTransforms(maxConcurrentTransforms: Number) {
        cdkBuilder.maxConcurrentTransforms(maxConcurrentTransforms)
      }

      public override fun maxPayloadInMb(maxPayloadInMb: Number) {
        cdkBuilder.maxPayloadInMb(maxPayloadInMb)
      }

      public override fun transformInput(transformInput: IResolvable) {
        cdkBuilder.transformInput(transformInput.let(IResolvable::unwrap))
      }

      public override fun transformInput(transformInput: TransformInputProperty) {
        cdkBuilder.transformInput(transformInput.let(TransformInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20571916d44bec5aa2706c1c71bae57ba5ed064c50b6d72e189ff26ba6afb55f")
      public override fun transformInput(transformInput: TransformInputProperty.Builder.() -> Unit):
          Unit = transformInput(TransformInputProperty(transformInput))

      public override fun transformOutput(transformOutput: IResolvable) {
        cdkBuilder.transformOutput(transformOutput.let(IResolvable::unwrap))
      }

      public override fun transformOutput(transformOutput: TransformOutputProperty) {
        cdkBuilder.transformOutput(transformOutput.let(TransformOutputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c83a6d8001850c633dde75c66011537a09e384942155594f95a2fe33bda5265")
      public override
          fun transformOutput(transformOutput: TransformOutputProperty.Builder.() -> Unit): Unit =
          transformOutput(TransformOutputProperty(transformOutput))

      public override fun transformResources(transformResources: IResolvable) {
        cdkBuilder.transformResources(transformResources.let(IResolvable::unwrap))
      }

      public override fun transformResources(transformResources: TransformResourcesProperty) {
        cdkBuilder.transformResources(transformResources.let(TransformResourcesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d3b313075a4a02a44f820c052872d95513973bd42395efb835d4dcf14876eb07")
      public override
          fun transformResources(transformResources: TransformResourcesProperty.Builder.() -> Unit):
          Unit = transformResources(TransformResourcesProperty(transformResources))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty,
    ) : TransformJobDefinitionProperty {
      public override fun batchStrategy(): String? = unwrap(this).getBatchStrategy()

      public override fun environment(): Any? = unwrap(this).getEnvironment()

      public override fun maxConcurrentTransforms(): Number? =
          unwrap(this).getMaxConcurrentTransforms()

      public override fun maxPayloadInMb(): Number? = unwrap(this).getMaxPayloadInMb()

      public override fun transformInput(): Any = unwrap(this).getTransformInput()

      public override fun transformOutput(): Any = unwrap(this).getTransformOutput()

      public override fun transformResources(): Any = unwrap(this).getTransformResources()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TransformJobDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty):
          TransformJobDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformJobDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformJobDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricsSourceProperty {
    public fun contentDigest(): String? = unwrap(this).getContentDigest()

    public fun contentType(): String

    public fun s3Uri(): String

    public interface Builder {
      public fun contentDigest(contentDigest: String) {
      }

      public fun contentType(contentType: String) {
      }

      public fun s3Uri(s3Uri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty.builder()

      public override fun contentDigest(contentDigest: String) {
        cdkBuilder.contentDigest(contentDigest)
      }

      public override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      public override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty,
    ) : MetricsSourceProperty {
      public override fun contentDigest(): String? = unwrap(this).getContentDigest()

      public override fun contentType(): String = unwrap(this).getContentType()

      public override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricsSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty):
          MetricsSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricsSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetricsSourceProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ModelMetricsProperty {
    public fun bias(): Any? = unwrap(this).getBias()

    public fun explainability(): Any? = unwrap(this).getExplainability()

    public fun modelDataQuality(): Any? = unwrap(this).getModelDataQuality()

    public fun modelQuality(): Any? = unwrap(this).getModelQuality()

    public interface Builder {
      public fun bias(bias: IResolvable) {
      }

      public fun bias(bias: BiasProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8be727ee25583c3ec6c29082be1cc7efe7e399e251b55833351731e30898d433")
      public fun bias(bias: BiasProperty.Builder.() -> Unit) {
      }

      public fun explainability(explainability: IResolvable) {
      }

      public fun explainability(explainability: ExplainabilityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("757bf78a4853ff1eeaa98fd44d4a3e2086fc93915276e3c2a24c189519a37535")
      public fun explainability(explainability: ExplainabilityProperty.Builder.() -> Unit) {
      }

      public fun modelDataQuality(modelDataQuality: IResolvable) {
      }

      public fun modelDataQuality(modelDataQuality: ModelDataQualityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b81ba8038bb18b1965a4318a2c20631d369068a2c2895334d9620ed104af4d54")
      public fun modelDataQuality(modelDataQuality: ModelDataQualityProperty.Builder.() -> Unit) {
      }

      public fun modelQuality(modelQuality: IResolvable) {
      }

      public fun modelQuality(modelQuality: ModelQualityProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eaf636a529385f397ecc8e6d59ffda0a3cd8c70617aea70d09e99a3092d3202f")
      public fun modelQuality(modelQuality: ModelQualityProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty.builder()

      public override fun bias(bias: IResolvable) {
        cdkBuilder.bias(bias.let(IResolvable::unwrap))
      }

      public override fun bias(bias: BiasProperty) {
        cdkBuilder.bias(bias.let(BiasProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8be727ee25583c3ec6c29082be1cc7efe7e399e251b55833351731e30898d433")
      public override fun bias(bias: BiasProperty.Builder.() -> Unit): Unit =
          bias(BiasProperty(bias))

      public override fun explainability(explainability: IResolvable) {
        cdkBuilder.explainability(explainability.let(IResolvable::unwrap))
      }

      public override fun explainability(explainability: ExplainabilityProperty) {
        cdkBuilder.explainability(explainability.let(ExplainabilityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("757bf78a4853ff1eeaa98fd44d4a3e2086fc93915276e3c2a24c189519a37535")
      public override fun explainability(explainability: ExplainabilityProperty.Builder.() -> Unit):
          Unit = explainability(ExplainabilityProperty(explainability))

      public override fun modelDataQuality(modelDataQuality: IResolvable) {
        cdkBuilder.modelDataQuality(modelDataQuality.let(IResolvable::unwrap))
      }

      public override fun modelDataQuality(modelDataQuality: ModelDataQualityProperty) {
        cdkBuilder.modelDataQuality(modelDataQuality.let(ModelDataQualityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b81ba8038bb18b1965a4318a2c20631d369068a2c2895334d9620ed104af4d54")
      public override
          fun modelDataQuality(modelDataQuality: ModelDataQualityProperty.Builder.() -> Unit): Unit
          = modelDataQuality(ModelDataQualityProperty(modelDataQuality))

      public override fun modelQuality(modelQuality: IResolvable) {
        cdkBuilder.modelQuality(modelQuality.let(IResolvable::unwrap))
      }

      public override fun modelQuality(modelQuality: ModelQualityProperty) {
        cdkBuilder.modelQuality(modelQuality.let(ModelQualityProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eaf636a529385f397ecc8e6d59ffda0a3cd8c70617aea70d09e99a3092d3202f")
      public override fun modelQuality(modelQuality: ModelQualityProperty.Builder.() -> Unit): Unit
          = modelQuality(ModelQualityProperty(modelQuality))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty,
    ) : ModelMetricsProperty {
      public override fun bias(): Any? = unwrap(this).getBias()

      public override fun explainability(): Any? = unwrap(this).getExplainability()

      public override fun modelDataQuality(): Any? = unwrap(this).getModelDataQuality()

      public override fun modelQuality(): Any? = unwrap(this).getModelQuality()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelMetricsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty):
          ModelMetricsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelMetricsProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelMetricsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SourceAlgorithmProperty {
    public fun algorithmName(): String

    public fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

    public interface Builder {
      public fun algorithmName(algorithmName: String) {
      }

      public fun modelDataUrl(modelDataUrl: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty.builder()

      public override fun algorithmName(algorithmName: String) {
        cdkBuilder.algorithmName(algorithmName)
      }

      public override fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty,
    ) : SourceAlgorithmProperty {
      public override fun algorithmName(): String = unwrap(this).getAlgorithmName()

      public override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceAlgorithmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty):
          SourceAlgorithmProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceAlgorithmProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.SourceAlgorithmProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TransformInputProperty {
    public fun compressionType(): String? = unwrap(this).getCompressionType()

    public fun contentType(): String? = unwrap(this).getContentType()

    public fun dataSource(): Any

    public fun splitType(): String? = unwrap(this).getSplitType()

    public interface Builder {
      public fun compressionType(compressionType: String) {
      }

      public fun contentType(contentType: String) {
      }

      public fun dataSource(dataSource: IResolvable) {
      }

      public fun dataSource(dataSource: DataSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae1d3df29f8c64689e55692a2aa40f1471ea240b66d77fdce112ec946154959e")
      public fun dataSource(dataSource: DataSourceProperty.Builder.() -> Unit) {
      }

      public fun splitType(splitType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty.builder()

      public override fun compressionType(compressionType: String) {
        cdkBuilder.compressionType(compressionType)
      }

      public override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      public override fun dataSource(dataSource: IResolvable) {
        cdkBuilder.dataSource(dataSource.let(IResolvable::unwrap))
      }

      public override fun dataSource(dataSource: DataSourceProperty) {
        cdkBuilder.dataSource(dataSource.let(DataSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ae1d3df29f8c64689e55692a2aa40f1471ea240b66d77fdce112ec946154959e")
      public override fun dataSource(dataSource: DataSourceProperty.Builder.() -> Unit): Unit =
          dataSource(DataSourceProperty(dataSource))

      public override fun splitType(splitType: String) {
        cdkBuilder.splitType(splitType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty,
    ) : TransformInputProperty {
      public override fun compressionType(): String? = unwrap(this).getCompressionType()

      public override fun contentType(): String? = unwrap(this).getContentType()

      public override fun dataSource(): Any = unwrap(this).getDataSource()

      public override fun splitType(): String? = unwrap(this).getSplitType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TransformInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty):
          TransformInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformInputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TransformOutputProperty {
    public fun accept(): String? = unwrap(this).getAccept()

    public fun assembleWith(): String? = unwrap(this).getAssembleWith()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun s3OutputPath(): String

    public interface Builder {
      public fun accept(accept: String) {
      }

      public fun assembleWith(assembleWith: String) {
      }

      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun s3OutputPath(s3OutputPath: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty.builder()

      public override fun accept(accept: String) {
        cdkBuilder.accept(accept)
      }

      public override fun assembleWith(assembleWith: String) {
        cdkBuilder.assembleWith(assembleWith)
      }

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override fun s3OutputPath(s3OutputPath: String) {
        cdkBuilder.s3OutputPath(s3OutputPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty,
    ) : TransformOutputProperty {
      public override fun accept(): String? = unwrap(this).getAccept()

      public override fun assembleWith(): String? = unwrap(this).getAssembleWith()

      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun s3OutputPath(): String = unwrap(this).getS3OutputPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TransformOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty):
          TransformOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformOutputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.TransformOutputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelPackageContainerDefinitionProperty {
    public fun containerHostname(): String? = unwrap(this).getContainerHostname()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun framework(): String? = unwrap(this).getFramework()

    public fun frameworkVersion(): String? = unwrap(this).getFrameworkVersion()

    public fun image(): String

    public fun imageDigest(): String? = unwrap(this).getImageDigest()

    public fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

    public fun modelInput(): Any? = unwrap(this).getModelInput()

    public fun nearestModelName(): String? = unwrap(this).getNearestModelName()

    public interface Builder {
      public fun containerHostname(containerHostname: String) {
      }

      public fun environment(environment: IResolvable) {
      }

      public fun environment(environment: Map<String, String>) {
      }

      public fun framework(framework: String) {
      }

      public fun frameworkVersion(frameworkVersion: String) {
      }

      public fun image(image: String) {
      }

      public fun imageDigest(imageDigest: String) {
      }

      public fun modelDataUrl(modelDataUrl: String) {
      }

      public fun modelInput(modelInput: Any) {
      }

      public fun nearestModelName(nearestModelName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty.builder()

      public override fun containerHostname(containerHostname: String) {
        cdkBuilder.containerHostname(containerHostname)
      }

      public override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      public override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      public override fun framework(framework: String) {
        cdkBuilder.framework(framework)
      }

      public override fun frameworkVersion(frameworkVersion: String) {
        cdkBuilder.frameworkVersion(frameworkVersion)
      }

      public override fun image(image: String) {
        cdkBuilder.image(image)
      }

      public override fun imageDigest(imageDigest: String) {
        cdkBuilder.imageDigest(imageDigest)
      }

      public override fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
      }

      public override fun modelInput(modelInput: Any) {
        cdkBuilder.modelInput(modelInput)
      }

      public override fun nearestModelName(nearestModelName: String) {
        cdkBuilder.nearestModelName(nearestModelName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty,
    ) : ModelPackageContainerDefinitionProperty {
      public override fun containerHostname(): String? = unwrap(this).getContainerHostname()

      public override fun environment(): Any? = unwrap(this).getEnvironment()

      public override fun framework(): String? = unwrap(this).getFramework()

      public override fun frameworkVersion(): String? = unwrap(this).getFrameworkVersion()

      public override fun image(): String = unwrap(this).getImage()

      public override fun imageDigest(): String? = unwrap(this).getImageDigest()

      public override fun modelDataUrl(): String? = unwrap(this).getModelDataUrl()

      public override fun modelInput(): Any? = unwrap(this).getModelInput()

      public override fun nearestModelName(): String? = unwrap(this).getNearestModelName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelPackageContainerDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty):
          ModelPackageContainerDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageContainerDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageContainerDefinitionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelInputProperty {
    public fun dataInputConfig(): String

    public interface Builder {
      public fun dataInputConfig(dataInputConfig: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty.builder()

      public override fun dataInputConfig(dataInputConfig: String) {
        cdkBuilder.dataInputConfig(dataInputConfig)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty,
    ) : ModelInputProperty {
      public override fun dataInputConfig(): String = unwrap(this).getDataInputConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty):
          ModelInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelInputProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelInputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ModelQualityProperty {
    public fun constraints(): Any? = unwrap(this).getConstraints()

    public fun statistics(): Any? = unwrap(this).getStatistics()

    public interface Builder {
      public fun constraints(constraints: IResolvable) {
      }

      public fun constraints(constraints: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d421f451d6edcc7575ec206c2f7fc907831a315f1b8d72e3d9c37ba1d230d65")
      public fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit) {
      }

      public fun statistics(statistics: IResolvable) {
      }

      public fun statistics(statistics: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5732927e06a4e0ac97206ee7529026a9521b8e43367915c6c12ca58e531614ed")
      public fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty.builder()

      public override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable::unwrap))
      }

      public override fun constraints(constraints: MetricsSourceProperty) {
        cdkBuilder.constraints(constraints.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d421f451d6edcc7575ec206c2f7fc907831a315f1b8d72e3d9c37ba1d230d65")
      public override fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit): Unit =
          constraints(MetricsSourceProperty(constraints))

      public override fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics.let(IResolvable::unwrap))
      }

      public override fun statistics(statistics: MetricsSourceProperty) {
        cdkBuilder.statistics(statistics.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5732927e06a4e0ac97206ee7529026a9521b8e43367915c6c12ca58e531614ed")
      public override fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit): Unit =
          statistics(MetricsSourceProperty(statistics))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty,
    ) : ModelQualityProperty {
      public override fun constraints(): Any? = unwrap(this).getConstraints()

      public override fun statistics(): Any? = unwrap(this).getStatistics()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelQualityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty):
          ModelQualityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelQualityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelQualityProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ModelPackageStatusItemProperty {
    public fun failureReason(): String? = unwrap(this).getFailureReason()

    public fun name(): String

    public fun status(): String

    public interface Builder {
      public fun failureReason(failureReason: String) {
      }

      public fun name(name: String) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty.builder()

      public override fun failureReason(failureReason: String) {
        cdkBuilder.failureReason(failureReason)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty,
    ) : ModelPackageStatusItemProperty {
      public override fun failureReason(): String? = unwrap(this).getFailureReason()

      public override fun name(): String = unwrap(this).getName()

      public override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelPackageStatusItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty):
          ModelPackageStatusItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelPackageStatusItemProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelPackageStatusItemProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ModelDataQualityProperty {
    public fun constraints(): Any? = unwrap(this).getConstraints()

    public fun statistics(): Any? = unwrap(this).getStatistics()

    public interface Builder {
      public fun constraints(constraints: IResolvable) {
      }

      public fun constraints(constraints: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17651debc01e0f4a93ea58087411e4cd218de64194b35b4c14b6973111e8813b")
      public fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit) {
      }

      public fun statistics(statistics: IResolvable) {
      }

      public fun statistics(statistics: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb2c82a1598873be70e3fa2ac906e01ecdbec14bf4b295e56ef6136ee268662f")
      public fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty.builder()

      public override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable::unwrap))
      }

      public override fun constraints(constraints: MetricsSourceProperty) {
        cdkBuilder.constraints(constraints.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17651debc01e0f4a93ea58087411e4cd218de64194b35b4c14b6973111e8813b")
      public override fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit): Unit =
          constraints(MetricsSourceProperty(constraints))

      public override fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics.let(IResolvable::unwrap))
      }

      public override fun statistics(statistics: MetricsSourceProperty) {
        cdkBuilder.statistics(statistics.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb2c82a1598873be70e3fa2ac906e01ecdbec14bf4b295e56ef6136ee268662f")
      public override fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit): Unit =
          statistics(MetricsSourceProperty(statistics))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty,
    ) : ModelDataQualityProperty {
      public override fun constraints(): Any? = unwrap(this).getConstraints()

      public override fun statistics(): Any? = unwrap(this).getStatistics()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ModelDataQualityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty):
          ModelDataQualityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelDataQualityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ModelDataQualityProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ValidationSpecificationProperty {
    public fun validationProfiles(): Any

    public fun validationRole(): String

    public interface Builder {
      public fun validationProfiles(validationProfiles: IResolvable) {
      }

      public fun validationProfiles(validationProfiles: List<Any>) {
      }

      public fun validationRole(validationRole: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty.builder()

      public override fun validationProfiles(validationProfiles: IResolvable) {
        cdkBuilder.validationProfiles(validationProfiles.let(IResolvable::unwrap))
      }

      public override fun validationProfiles(validationProfiles: List<Any>) {
        cdkBuilder.validationProfiles(validationProfiles)
      }

      public override fun validationRole(validationRole: String) {
        cdkBuilder.validationRole(validationRole)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty,
    ) : ValidationSpecificationProperty {
      public override fun validationProfiles(): Any = unwrap(this).getValidationProfiles()

      public override fun validationRole(): String = unwrap(this).getValidationRole()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValidationSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty):
          ValidationSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidationSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.ValidationSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetadataPropertiesProperty {
    public fun commitId(): String? = unwrap(this).getCommitId()

    public fun generatedBy(): String? = unwrap(this).getGeneratedBy()

    public fun projectId(): String? = unwrap(this).getProjectId()

    public fun repository(): String? = unwrap(this).getRepository()

    public interface Builder {
      public fun commitId(commitId: String) {
      }

      public fun generatedBy(generatedBy: String) {
      }

      public fun projectId(projectId: String) {
      }

      public fun repository(repository: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty.builder()

      public override fun commitId(commitId: String) {
        cdkBuilder.commitId(commitId)
      }

      public override fun generatedBy(generatedBy: String) {
        cdkBuilder.generatedBy(generatedBy)
      }

      public override fun projectId(projectId: String) {
        cdkBuilder.projectId(projectId)
      }

      public override fun repository(repository: String) {
        cdkBuilder.repository(repository)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty,
    ) : MetadataPropertiesProperty {
      public override fun commitId(): String? = unwrap(this).getCommitId()

      public override fun generatedBy(): String? = unwrap(this).getGeneratedBy()

      public override fun projectId(): String? = unwrap(this).getProjectId()

      public override fun repository(): String? = unwrap(this).getRepository()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty):
          MetadataPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataPropertiesProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.MetadataPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3DataSourceProperty {
    public fun s3DataType(): String

    public fun s3Uri(): String

    public interface Builder {
      public fun s3DataType(s3DataType: String) {
      }

      public fun s3Uri(s3Uri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty.builder()

      public override fun s3DataType(s3DataType: String) {
        cdkBuilder.s3DataType(s3DataType)
      }

      public override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty,
    ) : S3DataSourceProperty {
      public override fun s3DataType(): String = unwrap(this).getS3DataType()

      public override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty):
          S3DataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DataSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.S3DataSourceProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DataSourceProperty {
    public fun s3DataSource(): Any

    public interface Builder {
      public fun s3DataSource(s3DataSource: IResolvable) {
      }

      public fun s3DataSource(s3DataSource: S3DataSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4afc4570dd9358bb0cb51b72e74794958c33359c12dfea7c7fe8565f68c181e7")
      public fun s3DataSource(s3DataSource: S3DataSourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty.builder()

      public override fun s3DataSource(s3DataSource: IResolvable) {
        cdkBuilder.s3DataSource(s3DataSource.let(IResolvable::unwrap))
      }

      public override fun s3DataSource(s3DataSource: S3DataSourceProperty) {
        cdkBuilder.s3DataSource(s3DataSource.let(S3DataSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4afc4570dd9358bb0cb51b72e74794958c33359c12dfea7c7fe8565f68c181e7")
      public override fun s3DataSource(s3DataSource: S3DataSourceProperty.Builder.() -> Unit): Unit
          = s3DataSource(S3DataSourceProperty(s3DataSource))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty,
    ) : DataSourceProperty {
      public override fun s3DataSource(): Any = unwrap(this).getS3DataSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty):
          DataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DataSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DriftCheckModelDataQualityProperty {
    public fun constraints(): Any? = unwrap(this).getConstraints()

    public fun statistics(): Any? = unwrap(this).getStatistics()

    public interface Builder {
      public fun constraints(constraints: IResolvable) {
      }

      public fun constraints(constraints: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c63d833ca7452ddf2902d2c3e26c2a40251457a7f0c3a61efee884bbdbd6830")
      public fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit) {
      }

      public fun statistics(statistics: IResolvable) {
      }

      public fun statistics(statistics: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c418561efd00db268003819ccc8a5fdda0063dd30d88acbf5b61b748c58ffda")
      public fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty.builder()

      public override fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints.let(IResolvable::unwrap))
      }

      public override fun constraints(constraints: MetricsSourceProperty) {
        cdkBuilder.constraints(constraints.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c63d833ca7452ddf2902d2c3e26c2a40251457a7f0c3a61efee884bbdbd6830")
      public override fun constraints(constraints: MetricsSourceProperty.Builder.() -> Unit): Unit =
          constraints(MetricsSourceProperty(constraints))

      public override fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics.let(IResolvable::unwrap))
      }

      public override fun statistics(statistics: MetricsSourceProperty) {
        cdkBuilder.statistics(statistics.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c418561efd00db268003819ccc8a5fdda0063dd30d88acbf5b61b748c58ffda")
      public override fun statistics(statistics: MetricsSourceProperty.Builder.() -> Unit): Unit =
          statistics(MetricsSourceProperty(statistics))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty,
    ) : DriftCheckModelDataQualityProperty {
      public override fun constraints(): Any? = unwrap(this).getConstraints()

      public override fun statistics(): Any? = unwrap(this).getStatistics()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DriftCheckModelDataQualityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty):
          DriftCheckModelDataQualityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DriftCheckModelDataQualityProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckModelDataQualityProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DriftCheckBiasProperty {
    public fun configFile(): Any? = unwrap(this).getConfigFile()

    public fun postTrainingConstraints(): Any? = unwrap(this).getPostTrainingConstraints()

    public fun preTrainingConstraints(): Any? = unwrap(this).getPreTrainingConstraints()

    public interface Builder {
      public fun configFile(configFile: IResolvable) {
      }

      public fun configFile(configFile: FileSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a1df16f6e16a3ef409d3a7961d705d73cb00f4e634cab22f2ba08dcddc9742a")
      public fun configFile(configFile: FileSourceProperty.Builder.() -> Unit) {
      }

      public fun postTrainingConstraints(postTrainingConstraints: IResolvable) {
      }

      public fun postTrainingConstraints(postTrainingConstraints: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("193e29a0efc44232891916800aafaf7d157acec86ee43ab8157957009d232bfd")
      public
          fun postTrainingConstraints(postTrainingConstraints: MetricsSourceProperty.Builder.() -> Unit) {
      }

      public fun preTrainingConstraints(preTrainingConstraints: IResolvable) {
      }

      public fun preTrainingConstraints(preTrainingConstraints: MetricsSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6159add795ca353ab92fcc28608a3bc1265ddb7fb2d5c91a4a2203d244df165c")
      public
          fun preTrainingConstraints(preTrainingConstraints: MetricsSourceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty.builder()

      public override fun configFile(configFile: IResolvable) {
        cdkBuilder.configFile(configFile.let(IResolvable::unwrap))
      }

      public override fun configFile(configFile: FileSourceProperty) {
        cdkBuilder.configFile(configFile.let(FileSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a1df16f6e16a3ef409d3a7961d705d73cb00f4e634cab22f2ba08dcddc9742a")
      public override fun configFile(configFile: FileSourceProperty.Builder.() -> Unit): Unit =
          configFile(FileSourceProperty(configFile))

      public override fun postTrainingConstraints(postTrainingConstraints: IResolvable) {
        cdkBuilder.postTrainingConstraints(postTrainingConstraints.let(IResolvable::unwrap))
      }

      public override fun postTrainingConstraints(postTrainingConstraints: MetricsSourceProperty) {
        cdkBuilder.postTrainingConstraints(postTrainingConstraints.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("193e29a0efc44232891916800aafaf7d157acec86ee43ab8157957009d232bfd")
      public override
          fun postTrainingConstraints(postTrainingConstraints: MetricsSourceProperty.Builder.() -> Unit):
          Unit = postTrainingConstraints(MetricsSourceProperty(postTrainingConstraints))

      public override fun preTrainingConstraints(preTrainingConstraints: IResolvable) {
        cdkBuilder.preTrainingConstraints(preTrainingConstraints.let(IResolvable::unwrap))
      }

      public override fun preTrainingConstraints(preTrainingConstraints: MetricsSourceProperty) {
        cdkBuilder.preTrainingConstraints(preTrainingConstraints.let(MetricsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6159add795ca353ab92fcc28608a3bc1265ddb7fb2d5c91a4a2203d244df165c")
      public override
          fun preTrainingConstraints(preTrainingConstraints: MetricsSourceProperty.Builder.() -> Unit):
          Unit = preTrainingConstraints(MetricsSourceProperty(preTrainingConstraints))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty,
    ) : DriftCheckBiasProperty {
      public override fun configFile(): Any? = unwrap(this).getConfigFile()

      public override fun postTrainingConstraints(): Any? =
          unwrap(this).getPostTrainingConstraints()

      public override fun preTrainingConstraints(): Any? = unwrap(this).getPreTrainingConstraints()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DriftCheckBiasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty):
          DriftCheckBiasProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DriftCheckBiasProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.DriftCheckBiasProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FileSourceProperty {
    public fun contentDigest(): String? = unwrap(this).getContentDigest()

    public fun contentType(): String? = unwrap(this).getContentType()

    public fun s3Uri(): String

    public interface Builder {
      public fun contentDigest(contentDigest: String) {
      }

      public fun contentType(contentType: String) {
      }

      public fun s3Uri(s3Uri: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty.builder()

      public override fun contentDigest(contentDigest: String) {
        cdkBuilder.contentDigest(contentDigest)
      }

      public override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      public override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty,
    ) : FileSourceProperty {
      public override fun contentDigest(): String? = unwrap(this).getContentDigest()

      public override fun contentType(): String? = unwrap(this).getContentType()

      public override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FileSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty):
          FileSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSourceProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.FileSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AdditionalInferenceSpecificationDefinitionProperty {
    public fun containers(): Any

    public fun description(): String? = unwrap(this).getDescription()

    public fun name(): String

    public fun supportedContentTypes(): List<String> = unwrap(this).getSupportedContentTypes() ?:
        emptyList()

    public fun supportedRealtimeInferenceInstanceTypes(): List<String> =
        unwrap(this).getSupportedRealtimeInferenceInstanceTypes() ?: emptyList()

    public fun supportedResponseMimeTypes(): List<String> =
        unwrap(this).getSupportedResponseMimeTypes() ?: emptyList()

    public fun supportedTransformInstanceTypes(): List<String> =
        unwrap(this).getSupportedTransformInstanceTypes() ?: emptyList()

    public interface Builder {
      public fun containers(containers: IResolvable) {
      }

      public fun containers(containers: List<Any>) {
      }

      public fun description(description: String) {
      }

      public fun name(name: String) {
      }

      public fun supportedContentTypes(supportedContentTypes: List<String>) {
      }

      public
          fun supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes: List<String>) {
      }

      public fun supportedResponseMimeTypes(supportedResponseMimeTypes: List<String>) {
      }

      public fun supportedTransformInstanceTypes(supportedTransformInstanceTypes: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty.builder()

      public override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable::unwrap))
      }

      public override fun containers(containers: List<Any>) {
        cdkBuilder.containers(containers)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun supportedContentTypes(supportedContentTypes: List<String>) {
        cdkBuilder.supportedContentTypes(supportedContentTypes)
      }

      public override
          fun supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes: List<String>) {
        cdkBuilder.supportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes)
      }

      public override fun supportedResponseMimeTypes(supportedResponseMimeTypes: List<String>) {
        cdkBuilder.supportedResponseMimeTypes(supportedResponseMimeTypes)
      }

      public override
          fun supportedTransformInstanceTypes(supportedTransformInstanceTypes: List<String>) {
        cdkBuilder.supportedTransformInstanceTypes(supportedTransformInstanceTypes)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty,
    ) : AdditionalInferenceSpecificationDefinitionProperty {
      public override fun containers(): Any = unwrap(this).getContainers()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun name(): String = unwrap(this).getName()

      public override fun supportedContentTypes(): List<String> =
          unwrap(this).getSupportedContentTypes() ?: emptyList()

      public override fun supportedRealtimeInferenceInstanceTypes(): List<String> =
          unwrap(this).getSupportedRealtimeInferenceInstanceTypes() ?: emptyList()

      public override fun supportedResponseMimeTypes(): List<String> =
          unwrap(this).getSupportedResponseMimeTypes() ?: emptyList()

      public override fun supportedTransformInstanceTypes(): List<String> =
          unwrap(this).getSupportedTransformInstanceTypes() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdditionalInferenceSpecificationDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty):
          AdditionalInferenceSpecificationDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdditionalInferenceSpecificationDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

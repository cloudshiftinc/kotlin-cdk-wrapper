@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInferenceExperiment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrEndpointMetadata(): IResolvable =
      unwrap(this).getAttrEndpointMetadata().let(IResolvable::wrap)

  public open fun attrEndpointMetadataEndpointConfigName(): String =
      unwrap(this).getAttrEndpointMetadataEndpointConfigName()

  public open fun attrEndpointMetadataEndpointName(): String =
      unwrap(this).getAttrEndpointMetadataEndpointName()

  public open fun attrEndpointMetadataEndpointStatus(): String =
      unwrap(this).getAttrEndpointMetadataEndpointStatus()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun dataStorageConfig(): Any? = unwrap(this).getDataStorageConfig()

  public open fun dataStorageConfig(`value`: IResolvable) {
    unwrap(this).setDataStorageConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun dataStorageConfig(`value`: DataStorageConfigProperty) {
    unwrap(this).setDataStorageConfig(`value`.let(DataStorageConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f414884b4ff9ae6b5f00a3740bbb00594265f6f6af882521a2b69b61c77c3e77")
  public open fun dataStorageConfig(`value`: DataStorageConfigProperty.Builder.() -> Unit): Unit =
      dataStorageConfig(DataStorageConfigProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun desiredState(): String? = unwrap(this).getDesiredState()

  public open fun desiredState(`value`: String) {
    unwrap(this).setDesiredState(`value`)
  }

  public open fun endpointName(): String = unwrap(this).getEndpointName()

  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKey(): String? = unwrap(this).getKmsKey()

  public open fun kmsKey(`value`: String) {
    unwrap(this).setKmsKey(`value`)
  }

  public open fun modelVariants(): Any = unwrap(this).getModelVariants()

  public open fun modelVariants(`value`: IResolvable) {
    unwrap(this).setModelVariants(`value`.let(IResolvable::unwrap))
  }

  public open fun modelVariants(__idx_ac66f0: List<Any>) {
    unwrap(this).setModelVariants(__idx_ac66f0)
  }

  public open fun modelVariants(vararg __idx_ac66f0: Any): Unit =
      modelVariants(__idx_ac66f0.toList())

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun schedule(): Any? = unwrap(this).getSchedule()

  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  public open fun schedule(`value`: InferenceExperimentScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(InferenceExperimentScheduleProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9281d5d1825feb25119389de2c8647c8ab36821c8f0817f1cce1b38786d1ceb8")
  public open fun schedule(`value`: InferenceExperimentScheduleProperty.Builder.() -> Unit): Unit =
      schedule(InferenceExperimentScheduleProperty(`value`))

  public open fun shadowModeConfig(): Any? = unwrap(this).getShadowModeConfig()

  public open fun shadowModeConfig(`value`: IResolvable) {
    unwrap(this).setShadowModeConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun shadowModeConfig(`value`: ShadowModeConfigProperty) {
    unwrap(this).setShadowModeConfig(`value`.let(ShadowModeConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("494cdb3ba4abdd45ced5b56a1bee18e5ca22950a3e575e1c4d03e35aa1610a8e")
  public open fun shadowModeConfig(`value`: ShadowModeConfigProperty.Builder.() -> Unit): Unit =
      shadowModeConfig(ShadowModeConfigProperty(`value`))

  public open fun statusReason(): String? = unwrap(this).getStatusReason()

  public open fun statusReason(`value`: String) {
    unwrap(this).setStatusReason(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun dataStorageConfig(dataStorageConfig: IResolvable)

    public fun dataStorageConfig(dataStorageConfig: DataStorageConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e51e3d075653daa5174b2be450830b085f8bebfaa6b2d62d2a20fe1a6bec95a5")
    public fun dataStorageConfig(dataStorageConfig: DataStorageConfigProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun desiredState(desiredState: String)

    public fun endpointName(endpointName: String)

    public fun kmsKey(kmsKey: String)

    public fun modelVariants(modelVariants: IResolvable)

    public fun modelVariants(modelVariants: List<Any>)

    public fun modelVariants(vararg modelVariants: Any)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: InferenceExperimentScheduleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b244a9c073c83fcd951950f537fee6a7d3d8ec01411a1f6d5ead347bd57d29ac")
    public fun schedule(schedule: InferenceExperimentScheduleProperty.Builder.() -> Unit)

    public fun shadowModeConfig(shadowModeConfig: IResolvable)

    public fun shadowModeConfig(shadowModeConfig: ShadowModeConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2243bb2097ea95ae6f2f4fe27c807f8fc42844d4f75293db606946ba663d6b13")
    public fun shadowModeConfig(shadowModeConfig: ShadowModeConfigProperty.Builder.() -> Unit)

    public fun statusReason(statusReason: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.Builder
        = software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.Builder.create(scope, id)

    override fun dataStorageConfig(dataStorageConfig: IResolvable) {
      cdkBuilder.dataStorageConfig(dataStorageConfig.let(IResolvable::unwrap))
    }

    override fun dataStorageConfig(dataStorageConfig: DataStorageConfigProperty) {
      cdkBuilder.dataStorageConfig(dataStorageConfig.let(DataStorageConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e51e3d075653daa5174b2be450830b085f8bebfaa6b2d62d2a20fe1a6bec95a5")
    override fun dataStorageConfig(dataStorageConfig: DataStorageConfigProperty.Builder.() -> Unit):
        Unit = dataStorageConfig(DataStorageConfigProperty(dataStorageConfig))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun desiredState(desiredState: String) {
      cdkBuilder.desiredState(desiredState)
    }

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    override fun modelVariants(modelVariants: IResolvable) {
      cdkBuilder.modelVariants(modelVariants.let(IResolvable::unwrap))
    }

    override fun modelVariants(modelVariants: List<Any>) {
      cdkBuilder.modelVariants(modelVariants)
    }

    override fun modelVariants(vararg modelVariants: Any): Unit =
        modelVariants(modelVariants.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: InferenceExperimentScheduleProperty) {
      cdkBuilder.schedule(schedule.let(InferenceExperimentScheduleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b244a9c073c83fcd951950f537fee6a7d3d8ec01411a1f6d5ead347bd57d29ac")
    override fun schedule(schedule: InferenceExperimentScheduleProperty.Builder.() -> Unit): Unit =
        schedule(InferenceExperimentScheduleProperty(schedule))

    override fun shadowModeConfig(shadowModeConfig: IResolvable) {
      cdkBuilder.shadowModeConfig(shadowModeConfig.let(IResolvable::unwrap))
    }

    override fun shadowModeConfig(shadowModeConfig: ShadowModeConfigProperty) {
      cdkBuilder.shadowModeConfig(shadowModeConfig.let(ShadowModeConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2243bb2097ea95ae6f2f4fe27c807f8fc42844d4f75293db606946ba663d6b13")
    override fun shadowModeConfig(shadowModeConfig: ShadowModeConfigProperty.Builder.() -> Unit):
        Unit = shadowModeConfig(ShadowModeConfigProperty(shadowModeConfig))

    override fun statusReason(statusReason: String) {
      cdkBuilder.statusReason(statusReason)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInferenceExperiment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInferenceExperiment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment):
        CfnInferenceExperiment = CfnInferenceExperiment(cdkObject)

    internal fun unwrap(wrapped: CfnInferenceExperiment):
        software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment = wrapped.cdkObject
  }

  public interface DataStorageConfigProperty {
    public fun contentType(): Any? = unwrap(this).getContentType()

    public fun destination(): String

    public fun kmsKey(): String? = unwrap(this).getKmsKey()

    @CdkDslMarker
    public interface Builder {
      public fun contentType(contentType: IResolvable)

      public fun contentType(contentType: CaptureContentTypeHeaderProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73064d70e8f53d7e2ea89d687f25104ccbdebcde028549ea11f97ef5cf9f12ab")
      public fun contentType(contentType: CaptureContentTypeHeaderProperty.Builder.() -> Unit)

      public fun destination(destination: String)

      public fun kmsKey(kmsKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty.builder()

      override fun contentType(contentType: IResolvable) {
        cdkBuilder.contentType(contentType.let(IResolvable::unwrap))
      }

      override fun contentType(contentType: CaptureContentTypeHeaderProperty) {
        cdkBuilder.contentType(contentType.let(CaptureContentTypeHeaderProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("73064d70e8f53d7e2ea89d687f25104ccbdebcde028549ea11f97ef5cf9f12ab")
      override fun contentType(contentType: CaptureContentTypeHeaderProperty.Builder.() -> Unit):
          Unit = contentType(CaptureContentTypeHeaderProperty(contentType))

      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty,
    ) : CdkObject(cdkObject), DataStorageConfigProperty {
      override fun contentType(): Any? = unwrap(this).getContentType()

      override fun destination(): String = unwrap(this).getDestination()

      override fun kmsKey(): String? = unwrap(this).getKmsKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataStorageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty):
          DataStorageConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataStorageConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.DataStorageConfigProperty
    }
  }

  public interface ModelInfrastructureConfigProperty {
    public fun infrastructureType(): String

    public fun realTimeInferenceConfig(): Any

    @CdkDslMarker
    public interface Builder {
      public fun infrastructureType(infrastructureType: String)

      public fun realTimeInferenceConfig(realTimeInferenceConfig: IResolvable)

      public fun realTimeInferenceConfig(realTimeInferenceConfig: RealTimeInferenceConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f3dffa871b10f2225becc151d1c6d7eb2481c0952003198a4adbd9833aa3b6c")
      public
          fun realTimeInferenceConfig(realTimeInferenceConfig: RealTimeInferenceConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty.builder()

      override fun infrastructureType(infrastructureType: String) {
        cdkBuilder.infrastructureType(infrastructureType)
      }

      override fun realTimeInferenceConfig(realTimeInferenceConfig: IResolvable) {
        cdkBuilder.realTimeInferenceConfig(realTimeInferenceConfig.let(IResolvable::unwrap))
      }

      override
          fun realTimeInferenceConfig(realTimeInferenceConfig: RealTimeInferenceConfigProperty) {
        cdkBuilder.realTimeInferenceConfig(realTimeInferenceConfig.let(RealTimeInferenceConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f3dffa871b10f2225becc151d1c6d7eb2481c0952003198a4adbd9833aa3b6c")
      override
          fun realTimeInferenceConfig(realTimeInferenceConfig: RealTimeInferenceConfigProperty.Builder.() -> Unit):
          Unit = realTimeInferenceConfig(RealTimeInferenceConfigProperty(realTimeInferenceConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty,
    ) : CdkObject(cdkObject), ModelInfrastructureConfigProperty {
      override fun infrastructureType(): String = unwrap(this).getInfrastructureType()

      override fun realTimeInferenceConfig(): Any = unwrap(this).getRealTimeInferenceConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ModelInfrastructureConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty):
          ModelInfrastructureConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelInfrastructureConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelInfrastructureConfigProperty
    }
  }

  public interface ShadowModelVariantConfigProperty {
    public fun samplingPercentage(): Number

    public fun shadowModelVariantName(): String

    @CdkDslMarker
    public interface Builder {
      public fun samplingPercentage(samplingPercentage: Number)

      public fun shadowModelVariantName(shadowModelVariantName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty.builder()

      override fun samplingPercentage(samplingPercentage: Number) {
        cdkBuilder.samplingPercentage(samplingPercentage)
      }

      override fun shadowModelVariantName(shadowModelVariantName: String) {
        cdkBuilder.shadowModelVariantName(shadowModelVariantName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty,
    ) : CdkObject(cdkObject), ShadowModelVariantConfigProperty {
      override fun samplingPercentage(): Number = unwrap(this).getSamplingPercentage()

      override fun shadowModelVariantName(): String = unwrap(this).getShadowModelVariantName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ShadowModelVariantConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty):
          ShadowModelVariantConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShadowModelVariantConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModelVariantConfigProperty
    }
  }

  public interface ShadowModeConfigProperty {
    public fun shadowModelVariants(): Any

    public fun sourceModelVariantName(): String

    @CdkDslMarker
    public interface Builder {
      public fun shadowModelVariants(shadowModelVariants: IResolvable)

      public fun shadowModelVariants(shadowModelVariants: List<Any>)

      public fun shadowModelVariants(vararg shadowModelVariants: Any)

      public fun sourceModelVariantName(sourceModelVariantName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty.builder()

      override fun shadowModelVariants(shadowModelVariants: IResolvable) {
        cdkBuilder.shadowModelVariants(shadowModelVariants.let(IResolvable::unwrap))
      }

      override fun shadowModelVariants(shadowModelVariants: List<Any>) {
        cdkBuilder.shadowModelVariants(shadowModelVariants)
      }

      override fun shadowModelVariants(vararg shadowModelVariants: Any): Unit =
          shadowModelVariants(shadowModelVariants.toList())

      override fun sourceModelVariantName(sourceModelVariantName: String) {
        cdkBuilder.sourceModelVariantName(sourceModelVariantName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty,
    ) : CdkObject(cdkObject), ShadowModeConfigProperty {
      override fun shadowModelVariants(): Any = unwrap(this).getShadowModelVariants()

      override fun sourceModelVariantName(): String = unwrap(this).getSourceModelVariantName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ShadowModeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty):
          ShadowModeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShadowModeConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ShadowModeConfigProperty
    }
  }

  public interface RealTimeInferenceConfigProperty {
    public fun instanceCount(): Number

    public fun instanceType(): String

    @CdkDslMarker
    public interface Builder {
      public fun instanceCount(instanceCount: Number)

      public fun instanceType(instanceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty.builder()

      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty,
    ) : CdkObject(cdkObject), RealTimeInferenceConfigProperty {
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      override fun instanceType(): String = unwrap(this).getInstanceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RealTimeInferenceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty):
          RealTimeInferenceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RealTimeInferenceConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.RealTimeInferenceConfigProperty
    }
  }

  public interface ModelVariantConfigProperty {
    public fun infrastructureConfig(): Any

    public fun modelName(): String

    public fun variantName(): String

    @CdkDslMarker
    public interface Builder {
      public fun infrastructureConfig(infrastructureConfig: IResolvable)

      public fun infrastructureConfig(infrastructureConfig: ModelInfrastructureConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ed0abd901e636aeddd8f2b2728a28d8b56e3079fb1dedc6567ee87784b2dcdc")
      public
          fun infrastructureConfig(infrastructureConfig: ModelInfrastructureConfigProperty.Builder.() -> Unit)

      public fun modelName(modelName: String)

      public fun variantName(variantName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty.builder()

      override fun infrastructureConfig(infrastructureConfig: IResolvable) {
        cdkBuilder.infrastructureConfig(infrastructureConfig.let(IResolvable::unwrap))
      }

      override fun infrastructureConfig(infrastructureConfig: ModelInfrastructureConfigProperty) {
        cdkBuilder.infrastructureConfig(infrastructureConfig.let(ModelInfrastructureConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ed0abd901e636aeddd8f2b2728a28d8b56e3079fb1dedc6567ee87784b2dcdc")
      override
          fun infrastructureConfig(infrastructureConfig: ModelInfrastructureConfigProperty.Builder.() -> Unit):
          Unit = infrastructureConfig(ModelInfrastructureConfigProperty(infrastructureConfig))

      override fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
      }

      override fun variantName(variantName: String) {
        cdkBuilder.variantName(variantName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty,
    ) : CdkObject(cdkObject), ModelVariantConfigProperty {
      override fun infrastructureConfig(): Any = unwrap(this).getInfrastructureConfig()

      override fun modelName(): String = unwrap(this).getModelName()

      override fun variantName(): String = unwrap(this).getVariantName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ModelVariantConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty):
          ModelVariantConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ModelVariantConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.ModelVariantConfigProperty
    }
  }

  public interface InferenceExperimentScheduleProperty {
    public fun endTime(): String? = unwrap(this).getEndTime()

    public fun startTime(): String? = unwrap(this).getStartTime()

    @CdkDslMarker
    public interface Builder {
      public fun endTime(endTime: String)

      public fun startTime(startTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty.builder()

      override fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
      }

      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty,
    ) : CdkObject(cdkObject), InferenceExperimentScheduleProperty {
      override fun endTime(): String? = unwrap(this).getEndTime()

      override fun startTime(): String? = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceExperimentScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty):
          InferenceExperimentScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceExperimentScheduleProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.InferenceExperimentScheduleProperty
    }
  }

  public interface CaptureContentTypeHeaderProperty {
    public fun csvContentTypes(): List<String> = unwrap(this).getCsvContentTypes() ?: emptyList()

    public fun jsonContentTypes(): List<String> = unwrap(this).getJsonContentTypes() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun csvContentTypes(csvContentTypes: List<String>)

      public fun csvContentTypes(vararg csvContentTypes: String)

      public fun jsonContentTypes(jsonContentTypes: List<String>)

      public fun jsonContentTypes(vararg jsonContentTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty.builder()

      override fun csvContentTypes(csvContentTypes: List<String>) {
        cdkBuilder.csvContentTypes(csvContentTypes)
      }

      override fun csvContentTypes(vararg csvContentTypes: String): Unit =
          csvContentTypes(csvContentTypes.toList())

      override fun jsonContentTypes(jsonContentTypes: List<String>) {
        cdkBuilder.jsonContentTypes(jsonContentTypes)
      }

      override fun jsonContentTypes(vararg jsonContentTypes: String): Unit =
          jsonContentTypes(jsonContentTypes.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty,
    ) : CdkObject(cdkObject), CaptureContentTypeHeaderProperty {
      override fun csvContentTypes(): List<String> = unwrap(this).getCsvContentTypes() ?:
          emptyList()

      override fun jsonContentTypes(): List<String> = unwrap(this).getJsonContentTypes() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CaptureContentTypeHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty):
          CaptureContentTypeHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CaptureContentTypeHeaderProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.CaptureContentTypeHeaderProperty
    }
  }

  public interface EndpointMetadataProperty {
    public fun endpointConfigName(): String? = unwrap(this).getEndpointConfigName()

    public fun endpointName(): String

    public fun endpointStatus(): String? = unwrap(this).getEndpointStatus()

    @CdkDslMarker
    public interface Builder {
      public fun endpointConfigName(endpointConfigName: String)

      public fun endpointName(endpointName: String)

      public fun endpointStatus(endpointStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty.builder()

      override fun endpointConfigName(endpointConfigName: String) {
        cdkBuilder.endpointConfigName(endpointConfigName)
      }

      override fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
      }

      override fun endpointStatus(endpointStatus: String) {
        cdkBuilder.endpointStatus(endpointStatus)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty,
    ) : CdkObject(cdkObject), EndpointMetadataProperty {
      override fun endpointConfigName(): String? = unwrap(this).getEndpointConfigName()

      override fun endpointName(): String = unwrap(this).getEndpointName()

      override fun endpointStatus(): String? = unwrap(this).getEndpointStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty):
          EndpointMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointMetadataProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment.EndpointMetadataProperty
    }
  }
}

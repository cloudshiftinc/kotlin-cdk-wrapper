package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInferenceComponent internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrFailureReason(): String = unwrap(this).getAttrFailureReason()

  public open fun attrInferenceComponentArn(): String = unwrap(this).getAttrInferenceComponentArn()

  public open fun attrInferenceComponentStatus(): String =
      unwrap(this).getAttrInferenceComponentStatus()

  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  public open fun attrRuntimeConfigCurrentCopyCount(): Number =
      unwrap(this).getAttrRuntimeConfigCurrentCopyCount()

  public open fun attrRuntimeConfigDesiredCopyCount(): Number =
      unwrap(this).getAttrRuntimeConfigDesiredCopyCount()

  public open fun attrSpecificationContainerDeployedImage(): IResolvable =
      unwrap(this).getAttrSpecificationContainerDeployedImage().let(IResolvable::wrap)

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun endpointArn(): String? = unwrap(this).getEndpointArn()

  public open fun endpointArn(`value`: String) {
    unwrap(this).setEndpointArn(`value`)
  }

  public open fun endpointName(): String = unwrap(this).getEndpointName()

  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  public open fun inferenceComponentName(): String? = unwrap(this).getInferenceComponentName()

  public open fun inferenceComponentName(`value`: String) {
    unwrap(this).setInferenceComponentName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun runtimeConfig(): Any = unwrap(this).getRuntimeConfig()

  public open fun runtimeConfig(`value`: IResolvable) {
    unwrap(this).setRuntimeConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun runtimeConfig(`value`: InferenceComponentRuntimeConfigProperty) {
    unwrap(this).setRuntimeConfig(`value`.let(InferenceComponentRuntimeConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df395dd72cc8a0a25d1c75ea2c1ab61453578df2ea59f8c9d4be8fa98876dbb2")
  public open
      fun runtimeConfig(`value`: InferenceComponentRuntimeConfigProperty.Builder.() -> Unit): Unit =
      runtimeConfig(InferenceComponentRuntimeConfigProperty(`value`))

  public open fun specification(): Any = unwrap(this).getSpecification()

  public open fun specification(`value`: IResolvable) {
    unwrap(this).setSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun specification(`value`: InferenceComponentSpecificationProperty) {
    unwrap(this).setSpecification(`value`.let(InferenceComponentSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bca15f5e1adf3b33786cab41801739fff5bc2f74aac0f5a3a9940b5e0236b802")
  public open
      fun specification(`value`: InferenceComponentSpecificationProperty.Builder.() -> Unit): Unit =
      specification(InferenceComponentSpecificationProperty(`value`))

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun variantName(): String = unwrap(this).getVariantName()

  public open fun variantName(`value`: String) {
    unwrap(this).setVariantName(`value`)
  }

  public interface Builder {
    public fun endpointArn(endpointArn: String) {
    }

    public fun endpointName(endpointName: String) {
    }

    public fun inferenceComponentName(inferenceComponentName: String) {
    }

    public fun runtimeConfig(runtimeConfig: IResolvable) {
    }

    public fun runtimeConfig(runtimeConfig: InferenceComponentRuntimeConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6afac6df923c3d8419f2d3ff5f1def435217dfa9f6a56e2e3094dea054a47711")
    public
        fun runtimeConfig(runtimeConfig: InferenceComponentRuntimeConfigProperty.Builder.() -> Unit) {
    }

    public fun specification(specification: IResolvable) {
    }

    public fun specification(specification: InferenceComponentSpecificationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7829741ee3827433f0932668ce991537fd59ad2432d6b2302f8cd800ef7cdb17")
    public
        fun specification(specification: InferenceComponentSpecificationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun variantName(variantName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.Builder
        = software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.Builder.create(scope, id)

    public override fun endpointArn(endpointArn: String) {
      cdkBuilder.endpointArn(endpointArn)
    }

    public override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    public override fun inferenceComponentName(inferenceComponentName: String) {
      cdkBuilder.inferenceComponentName(inferenceComponentName)
    }

    public override fun runtimeConfig(runtimeConfig: IResolvable) {
      cdkBuilder.runtimeConfig(runtimeConfig.let(IResolvable::unwrap))
    }

    public override fun runtimeConfig(runtimeConfig: InferenceComponentRuntimeConfigProperty) {
      cdkBuilder.runtimeConfig(runtimeConfig.let(InferenceComponentRuntimeConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6afac6df923c3d8419f2d3ff5f1def435217dfa9f6a56e2e3094dea054a47711")
    public override
        fun runtimeConfig(runtimeConfig: InferenceComponentRuntimeConfigProperty.Builder.() -> Unit):
        Unit = runtimeConfig(InferenceComponentRuntimeConfigProperty(runtimeConfig))

    public override fun specification(specification: IResolvable) {
      cdkBuilder.specification(specification.let(IResolvable::unwrap))
    }

    public override fun specification(specification: InferenceComponentSpecificationProperty) {
      cdkBuilder.specification(specification.let(InferenceComponentSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7829741ee3827433f0932668ce991537fd59ad2432d6b2302f8cd800ef7cdb17")
    public override
        fun specification(specification: InferenceComponentSpecificationProperty.Builder.() -> Unit):
        Unit = specification(InferenceComponentSpecificationProperty(specification))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun variantName(variantName: String) {
      cdkBuilder.variantName(variantName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnInferenceComponent =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInferenceComponent {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInferenceComponent(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent):
        CfnInferenceComponent = CfnInferenceComponent(cdkObject)

    internal fun unwrap(wrapped: CfnInferenceComponent):
        software.amazon.awscdk.services.sagemaker.CfnInferenceComponent = wrapped.cdkObject
  }

  public interface InferenceComponentContainerSpecificationProperty {
    public fun artifactUrl(): String? = unwrap(this).getArtifactUrl()

    public fun deployedImage(): Any? = unwrap(this).getDeployedImage()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun image(): String? = unwrap(this).getImage()

    public interface Builder {
      public fun artifactUrl(artifactUrl: String) {
      }

      public fun deployedImage(deployedImage: IResolvable) {
      }

      public fun deployedImage(deployedImage: DeployedImageProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9230b33ebfbb5888d5f4fd74a9405daa0aed42d3dd6a28687ba27a7f7e9f033e")
      public fun deployedImage(deployedImage: DeployedImageProperty.Builder.() -> Unit) {
      }

      public fun environment(environment: IResolvable) {
      }

      public fun environment(environment: Map<String, String>) {
      }

      public fun image(image: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty.builder()

      public override fun artifactUrl(artifactUrl: String) {
        cdkBuilder.artifactUrl(artifactUrl)
      }

      public override fun deployedImage(deployedImage: IResolvable) {
        cdkBuilder.deployedImage(deployedImage.let(IResolvable::unwrap))
      }

      public override fun deployedImage(deployedImage: DeployedImageProperty) {
        cdkBuilder.deployedImage(deployedImage.let(DeployedImageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9230b33ebfbb5888d5f4fd74a9405daa0aed42d3dd6a28687ba27a7f7e9f033e")
      public override fun deployedImage(deployedImage: DeployedImageProperty.Builder.() -> Unit):
          Unit = deployedImage(DeployedImageProperty(deployedImage))

      public override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      public override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      public override fun image(image: String) {
        cdkBuilder.image(image)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty,
    ) : InferenceComponentContainerSpecificationProperty {
      public override fun artifactUrl(): String? = unwrap(this).getArtifactUrl()

      public override fun deployedImage(): Any? = unwrap(this).getDeployedImage()

      public override fun environment(): Any? = unwrap(this).getEnvironment()

      public override fun image(): String? = unwrap(this).getImage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentContainerSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty):
          InferenceComponentContainerSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentContainerSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InferenceComponentStartupParametersProperty {
    public fun containerStartupHealthCheckTimeoutInSeconds(): Number? =
        unwrap(this).getContainerStartupHealthCheckTimeoutInSeconds()

    public fun modelDataDownloadTimeoutInSeconds(): Number? =
        unwrap(this).getModelDataDownloadTimeoutInSeconds()

    public interface Builder {
      public
          fun containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds: Number) {
      }

      public fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty.builder()

      public override
          fun containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds: Number) {
        cdkBuilder.containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds)
      }

      public override
          fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number) {
        cdkBuilder.modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty,
    ) : InferenceComponentStartupParametersProperty {
      public override fun containerStartupHealthCheckTimeoutInSeconds(): Number? =
          unwrap(this).getContainerStartupHealthCheckTimeoutInSeconds()

      public override fun modelDataDownloadTimeoutInSeconds(): Number? =
          unwrap(this).getModelDataDownloadTimeoutInSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentStartupParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty):
          InferenceComponentStartupParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentStartupParametersProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InferenceComponentRuntimeConfigProperty {
    public fun copyCount(): Number? = unwrap(this).getCopyCount()

    public fun currentCopyCount(): Number? = unwrap(this).getCurrentCopyCount()

    public fun desiredCopyCount(): Number? = unwrap(this).getDesiredCopyCount()

    public interface Builder {
      public fun copyCount(copyCount: Number) {
      }

      public fun currentCopyCount(currentCopyCount: Number) {
      }

      public fun desiredCopyCount(desiredCopyCount: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty.builder()

      public override fun copyCount(copyCount: Number) {
        cdkBuilder.copyCount(copyCount)
      }

      public override fun currentCopyCount(currentCopyCount: Number) {
        cdkBuilder.currentCopyCount(currentCopyCount)
      }

      public override fun desiredCopyCount(desiredCopyCount: Number) {
        cdkBuilder.desiredCopyCount(desiredCopyCount)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty,
    ) : InferenceComponentRuntimeConfigProperty {
      public override fun copyCount(): Number? = unwrap(this).getCopyCount()

      public override fun currentCopyCount(): Number? = unwrap(this).getCurrentCopyCount()

      public override fun desiredCopyCount(): Number? = unwrap(this).getDesiredCopyCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentRuntimeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty):
          InferenceComponentRuntimeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentRuntimeConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InferenceComponentSpecificationProperty {
    public fun computeResourceRequirements(): Any

    public fun container(): Any? = unwrap(this).getContainer()

    public fun modelName(): String? = unwrap(this).getModelName()

    public fun startupParameters(): Any? = unwrap(this).getStartupParameters()

    public interface Builder {
      public fun computeResourceRequirements(computeResourceRequirements: IResolvable) {
      }

      public
          fun computeResourceRequirements(computeResourceRequirements: InferenceComponentComputeResourceRequirementsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db00219b7dbb581ee5a0820364523ece8e2c71181d72bb3cc72165ffd178a63a")
      public
          fun computeResourceRequirements(computeResourceRequirements: InferenceComponentComputeResourceRequirementsProperty.Builder.() -> Unit) {
      }

      public fun container(container: IResolvable) {
      }

      public fun container(container: InferenceComponentContainerSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c159431fed6e3b661da5cd1940492ea428fd171e79db76570eba05437585428d")
      public
          fun container(container: InferenceComponentContainerSpecificationProperty.Builder.() -> Unit) {
      }

      public fun modelName(modelName: String) {
      }

      public fun startupParameters(startupParameters: IResolvable) {
      }

      public fun startupParameters(startupParameters: InferenceComponentStartupParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26f6720eb665a9db2971614a7e88275897ea49410b838f9a5782e76ebd0833ff")
      public
          fun startupParameters(startupParameters: InferenceComponentStartupParametersProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty.builder()

      public override fun computeResourceRequirements(computeResourceRequirements: IResolvable) {
        cdkBuilder.computeResourceRequirements(computeResourceRequirements.let(IResolvable::unwrap))
      }

      public override
          fun computeResourceRequirements(computeResourceRequirements: InferenceComponentComputeResourceRequirementsProperty) {
        cdkBuilder.computeResourceRequirements(computeResourceRequirements.let(InferenceComponentComputeResourceRequirementsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db00219b7dbb581ee5a0820364523ece8e2c71181d72bb3cc72165ffd178a63a")
      public override
          fun computeResourceRequirements(computeResourceRequirements: InferenceComponentComputeResourceRequirementsProperty.Builder.() -> Unit):
          Unit =
          computeResourceRequirements(InferenceComponentComputeResourceRequirementsProperty(computeResourceRequirements))

      public override fun container(container: IResolvable) {
        cdkBuilder.container(container.let(IResolvable::unwrap))
      }

      public override fun container(container: InferenceComponentContainerSpecificationProperty) {
        cdkBuilder.container(container.let(InferenceComponentContainerSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c159431fed6e3b661da5cd1940492ea428fd171e79db76570eba05437585428d")
      public override
          fun container(container: InferenceComponentContainerSpecificationProperty.Builder.() -> Unit):
          Unit = container(InferenceComponentContainerSpecificationProperty(container))

      public override fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
      }

      public override fun startupParameters(startupParameters: IResolvable) {
        cdkBuilder.startupParameters(startupParameters.let(IResolvable::unwrap))
      }

      public override
          fun startupParameters(startupParameters: InferenceComponentStartupParametersProperty) {
        cdkBuilder.startupParameters(startupParameters.let(InferenceComponentStartupParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26f6720eb665a9db2971614a7e88275897ea49410b838f9a5782e76ebd0833ff")
      public override
          fun startupParameters(startupParameters: InferenceComponentStartupParametersProperty.Builder.() -> Unit):
          Unit = startupParameters(InferenceComponentStartupParametersProperty(startupParameters))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty,
    ) : InferenceComponentSpecificationProperty {
      public override fun computeResourceRequirements(): Any =
          unwrap(this).getComputeResourceRequirements()

      public override fun container(): Any? = unwrap(this).getContainer()

      public override fun modelName(): String? = unwrap(this).getModelName()

      public override fun startupParameters(): Any? = unwrap(this).getStartupParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty):
          InferenceComponentSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InferenceComponentComputeResourceRequirementsProperty {
    public fun maxMemoryRequiredInMb(): Number? = unwrap(this).getMaxMemoryRequiredInMb()

    public fun minMemoryRequiredInMb(): Number? = unwrap(this).getMinMemoryRequiredInMb()

    public fun numberOfAcceleratorDevicesRequired(): Number? =
        unwrap(this).getNumberOfAcceleratorDevicesRequired()

    public fun numberOfCpuCoresRequired(): Number? = unwrap(this).getNumberOfCpuCoresRequired()

    public interface Builder {
      public fun maxMemoryRequiredInMb(maxMemoryRequiredInMb: Number) {
      }

      public fun minMemoryRequiredInMb(minMemoryRequiredInMb: Number) {
      }

      public fun numberOfAcceleratorDevicesRequired(numberOfAcceleratorDevicesRequired: Number) {
      }

      public fun numberOfCpuCoresRequired(numberOfCpuCoresRequired: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty.builder()

      public override fun maxMemoryRequiredInMb(maxMemoryRequiredInMb: Number) {
        cdkBuilder.maxMemoryRequiredInMb(maxMemoryRequiredInMb)
      }

      public override fun minMemoryRequiredInMb(minMemoryRequiredInMb: Number) {
        cdkBuilder.minMemoryRequiredInMb(minMemoryRequiredInMb)
      }

      public override
          fun numberOfAcceleratorDevicesRequired(numberOfAcceleratorDevicesRequired: Number) {
        cdkBuilder.numberOfAcceleratorDevicesRequired(numberOfAcceleratorDevicesRequired)
      }

      public override fun numberOfCpuCoresRequired(numberOfCpuCoresRequired: Number) {
        cdkBuilder.numberOfCpuCoresRequired(numberOfCpuCoresRequired)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty,
    ) : InferenceComponentComputeResourceRequirementsProperty {
      public override fun maxMemoryRequiredInMb(): Number? = unwrap(this).getMaxMemoryRequiredInMb()

      public override fun minMemoryRequiredInMb(): Number? = unwrap(this).getMinMemoryRequiredInMb()

      public override fun numberOfAcceleratorDevicesRequired(): Number? =
          unwrap(this).getNumberOfAcceleratorDevicesRequired()

      public override fun numberOfCpuCoresRequired(): Number? =
          unwrap(this).getNumberOfCpuCoresRequired()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentComputeResourceRequirementsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty):
          InferenceComponentComputeResourceRequirementsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentComputeResourceRequirementsProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeployedImageProperty {
    public fun resolutionTime(): String? = unwrap(this).getResolutionTime()

    public fun resolvedImage(): String? = unwrap(this).getResolvedImage()

    public fun specifiedImage(): String? = unwrap(this).getSpecifiedImage()

    public interface Builder {
      public fun resolutionTime(resolutionTime: String) {
      }

      public fun resolvedImage(resolvedImage: String) {
      }

      public fun specifiedImage(specifiedImage: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty.builder()

      public override fun resolutionTime(resolutionTime: String) {
        cdkBuilder.resolutionTime(resolutionTime)
      }

      public override fun resolvedImage(resolvedImage: String) {
        cdkBuilder.resolvedImage(resolvedImage)
      }

      public override fun specifiedImage(specifiedImage: String) {
        cdkBuilder.specifiedImage(specifiedImage)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty,
    ) : DeployedImageProperty {
      public override fun resolutionTime(): String? = unwrap(this).getResolutionTime()

      public override fun resolvedImage(): String? = unwrap(this).getResolvedImage()

      public override fun specifiedImage(): String? = unwrap(this).getSpecifiedImage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeployedImageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty):
          DeployedImageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeployedImageProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}

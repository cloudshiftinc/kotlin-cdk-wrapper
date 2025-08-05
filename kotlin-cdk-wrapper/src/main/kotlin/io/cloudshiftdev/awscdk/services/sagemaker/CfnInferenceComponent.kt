@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an inference component, which is a SageMaker AI hosting object that you can use to deploy
 * a model to an endpoint.
 *
 * In the inference component settings, you specify the model, the endpoint, and how the model
 * utilizes the resources that the endpoint hosts. You can optimize resource utilization by tailoring
 * how the required CPU cores, accelerators, and memory are allocated. You can deploy multiple
 * inference components to an endpoint, where each inference component contains one model and the
 * resource utilization needs for that individual model. After you deploy an inference component, you
 * can directly invoke the associated model when you use the InvokeEndpoint API action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnInferenceComponent cfnInferenceComponent = CfnInferenceComponent.Builder.create(this,
 * "MyCfnInferenceComponent")
 * .endpointName("endpointName")
 * .specification(InferenceComponentSpecificationProperty.builder()
 * .baseInferenceComponentName("baseInferenceComponentName")
 * .computeResourceRequirements(InferenceComponentComputeResourceRequirementsProperty.builder()
 * .maxMemoryRequiredInMb(123)
 * .minMemoryRequiredInMb(123)
 * .numberOfAcceleratorDevicesRequired(123)
 * .numberOfCpuCoresRequired(123)
 * .build())
 * .container(InferenceComponentContainerSpecificationProperty.builder()
 * .artifactUrl("artifactUrl")
 * .deployedImage(DeployedImageProperty.builder()
 * .resolutionTime("resolutionTime")
 * .resolvedImage("resolvedImage")
 * .specifiedImage("specifiedImage")
 * .build())
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .image("image")
 * .build())
 * .modelName("modelName")
 * .startupParameters(InferenceComponentStartupParametersProperty.builder()
 * .containerStartupHealthCheckTimeoutInSeconds(123)
 * .modelDataDownloadTimeoutInSeconds(123)
 * .build())
 * .build())
 * // the properties below are optional
 * .deploymentConfig(InferenceComponentDeploymentConfigProperty.builder()
 * .autoRollbackConfiguration(AutoRollbackConfigurationProperty.builder()
 * .alarms(List.of(AlarmProperty.builder()
 * .alarmName("alarmName")
 * .build()))
 * .build())
 * .rollingUpdatePolicy(InferenceComponentRollingUpdatePolicyProperty.builder()
 * .maximumBatchSize(InferenceComponentCapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .maximumExecutionTimeoutInSeconds(123)
 * .rollbackMaximumBatchSize(InferenceComponentCapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .waitIntervalInSeconds(123)
 * .build())
 * .build())
 * .endpointArn("endpointArn")
 * .inferenceComponentName("inferenceComponentName")
 * .runtimeConfig(InferenceComponentRuntimeConfigProperty.builder()
 * .copyCount(123)
 * .currentCopyCount(123)
 * .desiredCopyCount(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .variantName("variantName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html)
 */
public open class CfnInferenceComponent(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInferenceComponentProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnInferenceComponent(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnInferenceComponentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInferenceComponentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInferenceComponentProps(props)
  )

  /**
   * The time when the inference component was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The failure reason if the inference component is in a failed state.
   */
  public open fun attrFailureReason(): String = unwrap(this).getAttrFailureReason()

  /**
   * The Amazon Resource Name (ARN) of the inference component.
   */
  public open fun attrInferenceComponentArn(): String = unwrap(this).getAttrInferenceComponentArn()

  /**
   * The status of the inference component.
   */
  public open fun attrInferenceComponentStatus(): String =
      unwrap(this).getAttrInferenceComponentStatus()

  /**
   * The time when the inference component was last updated.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The number of runtime copies of the model container that are currently deployed.
   */
  public open fun attrRuntimeConfigCurrentCopyCount(): Number =
      unwrap(this).getAttrRuntimeConfigCurrentCopyCount()

  /**
   * The number of runtime copies of the model container that you requested to deploy with the
   * inference component.
   */
  public open fun attrRuntimeConfigDesiredCopyCount(): Number =
      unwrap(this).getAttrRuntimeConfigDesiredCopyCount()

  /**
   *
   */
  public open fun attrSpecificationContainerDeployedImage(): IResolvable =
      unwrap(this).getAttrSpecificationContainerDeployedImage().let(IResolvable::wrap)

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The deployment configuration for an endpoint, which contains the desired deployment strategy
   * and rollback configurations.
   */
  public open fun deploymentConfig(): Any? = unwrap(this).getDeploymentConfig()

  /**
   * The deployment configuration for an endpoint, which contains the desired deployment strategy
   * and rollback configurations.
   */
  public open fun deploymentConfig(`value`: IResolvable) {
    unwrap(this).setDeploymentConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The deployment configuration for an endpoint, which contains the desired deployment strategy
   * and rollback configurations.
   */
  public open fun deploymentConfig(`value`: InferenceComponentDeploymentConfigProperty) {
    unwrap(this).setDeploymentConfig(`value`.let(InferenceComponentDeploymentConfigProperty.Companion::unwrap))
  }

  /**
   * The deployment configuration for an endpoint, which contains the desired deployment strategy
   * and rollback configurations.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("913ccc16603a449ed939f7451ee29ee8c30b583d180cbc5d4222a181de4d3515")
  public open
      fun deploymentConfig(`value`: InferenceComponentDeploymentConfigProperty.Builder.() -> Unit):
      Unit = deploymentConfig(InferenceComponentDeploymentConfigProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
   */
  public open fun endpointArn(): String? = unwrap(this).getEndpointArn()

  /**
   * The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
   */
  public open fun endpointArn(`value`: String) {
    unwrap(this).setEndpointArn(`value`)
  }

  /**
   * The name of the endpoint that hosts the inference component.
   */
  public open fun endpointName(): String = unwrap(this).getEndpointName()

  /**
   * The name of the endpoint that hosts the inference component.
   */
  public open fun endpointName(`value`: String) {
    unwrap(this).setEndpointName(`value`)
  }

  /**
   * The name of the inference component.
   */
  public open fun inferenceComponentName(): String? = unwrap(this).getInferenceComponentName()

  /**
   * The name of the inference component.
   */
  public open fun inferenceComponentName(`value`: String) {
    unwrap(this).setInferenceComponentName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The runtime config for the inference component.
   */
  public open fun runtimeConfig(): Any? = unwrap(this).getRuntimeConfig()

  /**
   * The runtime config for the inference component.
   */
  public open fun runtimeConfig(`value`: IResolvable) {
    unwrap(this).setRuntimeConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The runtime config for the inference component.
   */
  public open fun runtimeConfig(`value`: InferenceComponentRuntimeConfigProperty) {
    unwrap(this).setRuntimeConfig(`value`.let(InferenceComponentRuntimeConfigProperty.Companion::unwrap))
  }

  /**
   * The runtime config for the inference component.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df395dd72cc8a0a25d1c75ea2c1ab61453578df2ea59f8c9d4be8fa98876dbb2")
  public open
      fun runtimeConfig(`value`: InferenceComponentRuntimeConfigProperty.Builder.() -> Unit): Unit =
      runtimeConfig(InferenceComponentRuntimeConfigProperty(`value`))

  /**
   * The specification for the inference component.
   */
  public open fun specification(): Any = unwrap(this).getSpecification()

  /**
   * The specification for the inference component.
   */
  public open fun specification(`value`: IResolvable) {
    unwrap(this).setSpecification(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The specification for the inference component.
   */
  public open fun specification(`value`: InferenceComponentSpecificationProperty) {
    unwrap(this).setSpecification(`value`.let(InferenceComponentSpecificationProperty.Companion::unwrap))
  }

  /**
   * The specification for the inference component.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bca15f5e1adf3b33786cab41801739fff5bc2f74aac0f5a3a9940b5e0236b802")
  public open
      fun specification(`value`: InferenceComponentSpecificationProperty.Builder.() -> Unit): Unit =
      specification(InferenceComponentSpecificationProperty(`value`))

  /**
   * An array of tags to apply to the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of tags to apply to the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of tags to apply to the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The name of the production variant that hosts the inference component.
   */
  public open fun variantName(): String? = unwrap(this).getVariantName()

  /**
   * The name of the production variant that hosts the inference component.
   */
  public open fun variantName(`value`: String) {
    unwrap(this).setVariantName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnInferenceComponent].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    public fun deploymentConfig(deploymentConfig: IResolvable)

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    public fun deploymentConfig(deploymentConfig: InferenceComponentDeploymentConfigProperty)

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("070671df738ceddc1531c24367e5f72b193c5f77e66c96a8c23e14c86f92e69f")
    public
        fun deploymentConfig(deploymentConfig: InferenceComponentDeploymentConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-endpointarn)
     * @param endpointArn The Amazon Resource Name (ARN) of the endpoint that hosts the inference
     * component. 
     */
    public fun endpointArn(endpointArn: String)

    /**
     * The name of the endpoint that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-endpointname)
     * @param endpointName The name of the endpoint that hosts the inference component. 
     */
    public fun endpointName(endpointName: String)

    /**
     * The name of the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-inferencecomponentname)
     * @param inferenceComponentName The name of the inference component. 
     */
    public fun inferenceComponentName(inferenceComponentName: String)

    /**
     * The runtime config for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-runtimeconfig)
     * @param runtimeConfig The runtime config for the inference component. 
     */
    public fun runtimeConfig(runtimeConfig: IResolvable)

    /**
     * The runtime config for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-runtimeconfig)
     * @param runtimeConfig The runtime config for the inference component. 
     */
    public fun runtimeConfig(runtimeConfig: InferenceComponentRuntimeConfigProperty)

    /**
     * The runtime config for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-runtimeconfig)
     * @param runtimeConfig The runtime config for the inference component. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6afac6df923c3d8419f2d3ff5f1def435217dfa9f6a56e2e3094dea054a47711")
    public
        fun runtimeConfig(runtimeConfig: InferenceComponentRuntimeConfigProperty.Builder.() -> Unit)

    /**
     * The specification for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-specification)
     * @param specification The specification for the inference component. 
     */
    public fun specification(specification: IResolvable)

    /**
     * The specification for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-specification)
     * @param specification The specification for the inference component. 
     */
    public fun specification(specification: InferenceComponentSpecificationProperty)

    /**
     * The specification for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-specification)
     * @param specification The specification for the inference component. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7829741ee3827433f0932668ce991537fd59ad2432d6b2302f8cd800ef7cdb17")
    public
        fun specification(specification: InferenceComponentSpecificationProperty.Builder.() -> Unit)

    /**
     * An array of tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-tags)
     * @param tags An array of tags to apply to the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-tags)
     * @param tags An array of tags to apply to the resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the production variant that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-variantname)
     * @param variantName The name of the production variant that hosts the inference component. 
     */
    public fun variantName(variantName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.Builder
        = software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.Builder.create(scope, id)

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    override fun deploymentConfig(deploymentConfig: IResolvable) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    override fun deploymentConfig(deploymentConfig: InferenceComponentDeploymentConfigProperty) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(InferenceComponentDeploymentConfigProperty.Companion::unwrap))
    }

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy
     * and rollback configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-deploymentconfig)
     * @param deploymentConfig The deployment configuration for an endpoint, which contains the
     * desired deployment strategy and rollback configurations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("070671df738ceddc1531c24367e5f72b193c5f77e66c96a8c23e14c86f92e69f")
    override
        fun deploymentConfig(deploymentConfig: InferenceComponentDeploymentConfigProperty.Builder.() -> Unit):
        Unit = deploymentConfig(InferenceComponentDeploymentConfigProperty(deploymentConfig))

    /**
     * The Amazon Resource Name (ARN) of the endpoint that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-endpointarn)
     * @param endpointArn The Amazon Resource Name (ARN) of the endpoint that hosts the inference
     * component. 
     */
    override fun endpointArn(endpointArn: String) {
      cdkBuilder.endpointArn(endpointArn)
    }

    /**
     * The name of the endpoint that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-endpointname)
     * @param endpointName The name of the endpoint that hosts the inference component. 
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * The name of the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-inferencecomponentname)
     * @param inferenceComponentName The name of the inference component. 
     */
    override fun inferenceComponentName(inferenceComponentName: String) {
      cdkBuilder.inferenceComponentName(inferenceComponentName)
    }

    /**
     * The runtime config for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-runtimeconfig)
     * @param runtimeConfig The runtime config for the inference component. 
     */
    override fun runtimeConfig(runtimeConfig: IResolvable) {
      cdkBuilder.runtimeConfig(runtimeConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The runtime config for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-runtimeconfig)
     * @param runtimeConfig The runtime config for the inference component. 
     */
    override fun runtimeConfig(runtimeConfig: InferenceComponentRuntimeConfigProperty) {
      cdkBuilder.runtimeConfig(runtimeConfig.let(InferenceComponentRuntimeConfigProperty.Companion::unwrap))
    }

    /**
     * The runtime config for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-runtimeconfig)
     * @param runtimeConfig The runtime config for the inference component. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6afac6df923c3d8419f2d3ff5f1def435217dfa9f6a56e2e3094dea054a47711")
    override
        fun runtimeConfig(runtimeConfig: InferenceComponentRuntimeConfigProperty.Builder.() -> Unit):
        Unit = runtimeConfig(InferenceComponentRuntimeConfigProperty(runtimeConfig))

    /**
     * The specification for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-specification)
     * @param specification The specification for the inference component. 
     */
    override fun specification(specification: IResolvable) {
      cdkBuilder.specification(specification.let(IResolvable.Companion::unwrap))
    }

    /**
     * The specification for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-specification)
     * @param specification The specification for the inference component. 
     */
    override fun specification(specification: InferenceComponentSpecificationProperty) {
      cdkBuilder.specification(specification.let(InferenceComponentSpecificationProperty.Companion::unwrap))
    }

    /**
     * The specification for the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-specification)
     * @param specification The specification for the inference component. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7829741ee3827433f0932668ce991537fd59ad2432d6b2302f8cd800ef7cdb17")
    override
        fun specification(specification: InferenceComponentSpecificationProperty.Builder.() -> Unit):
        Unit = specification(InferenceComponentSpecificationProperty(specification))

    /**
     * An array of tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-tags)
     * @param tags An array of tags to apply to the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-tags)
     * @param tags An array of tags to apply to the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the production variant that hosts the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-inferencecomponent.html#cfn-sagemaker-inferencecomponent-variantname)
     * @param variantName The name of the production variant that hosts the inference component. 
     */
    override fun variantName(variantName: String) {
      cdkBuilder.variantName(variantName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnInferenceComponent =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.sagemaker.CfnInferenceComponent = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnInferenceComponent
  }

  /**
   * An Amazon CloudWatch alarm configured to monitor metrics on an endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * AlarmProperty alarmProperty = AlarmProperty.builder()
   * .alarmName("alarmName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-alarm.html)
   */
  public interface AlarmProperty {
    /**
     * The name of a CloudWatch alarm in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-alarm.html#cfn-sagemaker-inferencecomponent-alarm-alarmname)
     */
    public fun alarmName(): String

    /**
     * A builder for [AlarmProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmName The name of a CloudWatch alarm in your account. 
       */
      public fun alarmName(alarmName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AlarmProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AlarmProperty.builder()

      /**
       * @param alarmName The name of a CloudWatch alarm in your account. 
       */
      override fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AlarmProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AlarmProperty,
    ) : CdkObject(cdkObject),
        AlarmProperty {
      /**
       * The name of a CloudWatch alarm in your account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-alarm.html#cfn-sagemaker-inferencecomponent-alarm-alarmname)
       */
      override fun alarmName(): String = unwrap(this).getAlarmName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AlarmProperty):
          AlarmProperty = CdkObjectWrappers.wrap(cdkObject) as? AlarmProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AlarmProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AlarmProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * AutoRollbackConfigurationProperty autoRollbackConfigurationProperty =
   * AutoRollbackConfigurationProperty.builder()
   * .alarms(List.of(AlarmProperty.builder()
   * .alarmName("alarmName")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-autorollbackconfiguration.html)
   */
  public interface AutoRollbackConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-autorollbackconfiguration.html#cfn-sagemaker-inferencecomponent-autorollbackconfiguration-alarms)
     */
    public fun alarms(): Any

    /**
     * A builder for [AutoRollbackConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarms the value to be set. 
       */
      public fun alarms(alarms: IResolvable)

      /**
       * @param alarms the value to be set. 
       */
      public fun alarms(alarms: List<Any>)

      /**
       * @param alarms the value to be set. 
       */
      public fun alarms(vararg alarms: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AutoRollbackConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AutoRollbackConfigurationProperty.builder()

      /**
       * @param alarms the value to be set. 
       */
      override fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param alarms the value to be set. 
       */
      override fun alarms(alarms: List<Any>) {
        cdkBuilder.alarms(alarms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param alarms the value to be set. 
       */
      override fun alarms(vararg alarms: Any): Unit = alarms(alarms.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AutoRollbackConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AutoRollbackConfigurationProperty,
    ) : CdkObject(cdkObject),
        AutoRollbackConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-autorollbackconfiguration.html#cfn-sagemaker-inferencecomponent-autorollbackconfiguration-alarms)
       */
      override fun alarms(): Any = unwrap(this).getAlarms()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AutoRollbackConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AutoRollbackConfigurationProperty):
          AutoRollbackConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoRollbackConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoRollbackConfigurationProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AutoRollbackConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.AutoRollbackConfigurationProperty
    }
  }

  /**
   * Gets the Amazon EC2 Container Registry path of the docker image of the model that is hosted in
   * this
   * [ProductionVariant](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ProductionVariant.html)
   * .
   *
   * If you used the `registry/repository[:tag]` form to specify the image path of the primary
   * container when you created the model hosted in this `ProductionVariant` , the path resolves to a
   * path of the form `registry/repository[&#64;digest]` . A digest is a hash value that identifies a
   * specific version of an image. For information about Amazon ECR paths, see [Pulling an
   * Image](https://docs.aws.amazon.com//AmazonECR/latest/userguide/docker-pull-ecr-image.html) in the
   * *Amazon ECR User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DeployedImageProperty deployedImageProperty = DeployedImageProperty.builder()
   * .resolutionTime("resolutionTime")
   * .resolvedImage("resolvedImage")
   * .specifiedImage("specifiedImage")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-deployedimage.html)
   */
  public interface DeployedImageProperty {
    /**
     * The date and time when the image path for the model resolved to the `ResolvedImage`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-deployedimage.html#cfn-sagemaker-inferencecomponent-deployedimage-resolutiontime)
     */
    public fun resolutionTime(): String? = unwrap(this).getResolutionTime()

    /**
     * The specific digest path of the image hosted in this `ProductionVariant` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-deployedimage.html#cfn-sagemaker-inferencecomponent-deployedimage-resolvedimage)
     */
    public fun resolvedImage(): String? = unwrap(this).getResolvedImage()

    /**
     * The image path you specified when you created the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-deployedimage.html#cfn-sagemaker-inferencecomponent-deployedimage-specifiedimage)
     */
    public fun specifiedImage(): String? = unwrap(this).getSpecifiedImage()

    /**
     * A builder for [DeployedImageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resolutionTime The date and time when the image path for the model resolved to the
       * `ResolvedImage`.
       */
      public fun resolutionTime(resolutionTime: String)

      /**
       * @param resolvedImage The specific digest path of the image hosted in this
       * `ProductionVariant` .
       */
      public fun resolvedImage(resolvedImage: String)

      /**
       * @param specifiedImage The image path you specified when you created the model.
       */
      public fun specifiedImage(specifiedImage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty.builder()

      /**
       * @param resolutionTime The date and time when the image path for the model resolved to the
       * `ResolvedImage`.
       */
      override fun resolutionTime(resolutionTime: String) {
        cdkBuilder.resolutionTime(resolutionTime)
      }

      /**
       * @param resolvedImage The specific digest path of the image hosted in this
       * `ProductionVariant` .
       */
      override fun resolvedImage(resolvedImage: String) {
        cdkBuilder.resolvedImage(resolvedImage)
      }

      /**
       * @param specifiedImage The image path you specified when you created the model.
       */
      override fun specifiedImage(specifiedImage: String) {
        cdkBuilder.specifiedImage(specifiedImage)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty,
    ) : CdkObject(cdkObject),
        DeployedImageProperty {
      /**
       * The date and time when the image path for the model resolved to the `ResolvedImage`.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-deployedimage.html#cfn-sagemaker-inferencecomponent-deployedimage-resolutiontime)
       */
      override fun resolutionTime(): String? = unwrap(this).getResolutionTime()

      /**
       * The specific digest path of the image hosted in this `ProductionVariant` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-deployedimage.html#cfn-sagemaker-inferencecomponent-deployedimage-resolvedimage)
       */
      override fun resolvedImage(): String? = unwrap(this).getResolvedImage()

      /**
       * The image path you specified when you created the model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-deployedimage.html#cfn-sagemaker-inferencecomponent-deployedimage-specifiedimage)
       */
      override fun specifiedImage(): String? = unwrap(this).getSpecifiedImage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeployedImageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty):
          DeployedImageProperty = CdkObjectWrappers.wrap(cdkObject) as? DeployedImageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeployedImageProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.DeployedImageProperty
    }
  }

  /**
   * Specifies the type and size of the endpoint capacity to activate for a rolling deployment or a
   * rollback strategy.
   *
   * You can specify your batches as either of the following:
   *
   * * A count of inference component copies
   * * The overall percentage or your fleet
   *
   * For a rollback strategy, if you don't specify the fields in this object, or if you set the
   * `Value` parameter to 100%, then SageMaker AI uses a blue/green rollback strategy and rolls all
   * traffic back to the blue fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * InferenceComponentCapacitySizeProperty inferenceComponentCapacitySizeProperty =
   * InferenceComponentCapacitySizeProperty.builder()
   * .type("type")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcapacitysize.html)
   */
  public interface InferenceComponentCapacitySizeProperty {
    /**
     * Specifies the endpoint capacity type.
     *
     * * **COPY_COUNT** - The endpoint activates based on the number of inference component copies.
     * * **CAPACITY_PERCENT** - The endpoint activates based on the specified percentage of
     * capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcapacitysize.html#cfn-sagemaker-inferencecomponent-inferencecomponentcapacitysize-type)
     */
    public fun type(): String

    /**
     * Defines the capacity size, either as a number of inference component copies or a capacity
     * percentage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcapacitysize.html#cfn-sagemaker-inferencecomponent-inferencecomponentcapacitysize-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [InferenceComponentCapacitySizeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type Specifies the endpoint capacity type. 
       * * **COPY_COUNT** - The endpoint activates based on the number of inference component
       * copies.
       * * **CAPACITY_PERCENT** - The endpoint activates based on the specified percentage of
       * capacity.
       */
      public fun type(type: String)

      /**
       * @param value Defines the capacity size, either as a number of inference component copies or
       * a capacity percentage. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentCapacitySizeProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentCapacitySizeProperty.builder()

      /**
       * @param type Specifies the endpoint capacity type. 
       * * **COPY_COUNT** - The endpoint activates based on the number of inference component
       * copies.
       * * **CAPACITY_PERCENT** - The endpoint activates based on the specified percentage of
       * capacity.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value Defines the capacity size, either as a number of inference component copies or
       * a capacity percentage. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentCapacitySizeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentCapacitySizeProperty,
    ) : CdkObject(cdkObject),
        InferenceComponentCapacitySizeProperty {
      /**
       * Specifies the endpoint capacity type.
       *
       * * **COPY_COUNT** - The endpoint activates based on the number of inference component
       * copies.
       * * **CAPACITY_PERCENT** - The endpoint activates based on the specified percentage of
       * capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcapacitysize.html#cfn-sagemaker-inferencecomponent-inferencecomponentcapacitysize-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Defines the capacity size, either as a number of inference component copies or a capacity
       * percentage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcapacitysize.html#cfn-sagemaker-inferencecomponent-inferencecomponentcapacitysize-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentCapacitySizeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentCapacitySizeProperty):
          InferenceComponentCapacitySizeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceComponentCapacitySizeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentCapacitySizeProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentCapacitySizeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentCapacitySizeProperty
    }
  }

  /**
   * Defines the compute resources to allocate to run a model, plus any adapter models, that you
   * assign to an inference component.
   *
   * These resources include CPU cores, accelerators, and memory.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * InferenceComponentComputeResourceRequirementsProperty
   * inferenceComponentComputeResourceRequirementsProperty =
   * InferenceComponentComputeResourceRequirementsProperty.builder()
   * .maxMemoryRequiredInMb(123)
   * .minMemoryRequiredInMb(123)
   * .numberOfAcceleratorDevicesRequired(123)
   * .numberOfCpuCoresRequired(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements.html)
   */
  public interface InferenceComponentComputeResourceRequirementsProperty {
    /**
     * The maximum MB of memory to allocate to run a model that you assign to an inference
     * component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements.html#cfn-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements-maxmemoryrequiredinmb)
     */
    public fun maxMemoryRequiredInMb(): Number? = unwrap(this).getMaxMemoryRequiredInMb()

    /**
     * The minimum MB of memory to allocate to run a model that you assign to an inference
     * component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements.html#cfn-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements-minmemoryrequiredinmb)
     */
    public fun minMemoryRequiredInMb(): Number? = unwrap(this).getMinMemoryRequiredInMb()

    /**
     * The number of accelerators to allocate to run a model that you assign to an inference
     * component.
     *
     * Accelerators include GPUs and AWS Inferentia.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements.html#cfn-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements-numberofacceleratordevicesrequired)
     */
    public fun numberOfAcceleratorDevicesRequired(): Number? =
        unwrap(this).getNumberOfAcceleratorDevicesRequired()

    /**
     * The number of CPU cores to allocate to run a model that you assign to an inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements.html#cfn-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements-numberofcpucoresrequired)
     */
    public fun numberOfCpuCoresRequired(): Number? = unwrap(this).getNumberOfCpuCoresRequired()

    /**
     * A builder for [InferenceComponentComputeResourceRequirementsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxMemoryRequiredInMb The maximum MB of memory to allocate to run a model that you
       * assign to an inference component.
       */
      public fun maxMemoryRequiredInMb(maxMemoryRequiredInMb: Number)

      /**
       * @param minMemoryRequiredInMb The minimum MB of memory to allocate to run a model that you
       * assign to an inference component.
       */
      public fun minMemoryRequiredInMb(minMemoryRequiredInMb: Number)

      /**
       * @param numberOfAcceleratorDevicesRequired The number of accelerators to allocate to run a
       * model that you assign to an inference component.
       * Accelerators include GPUs and AWS Inferentia.
       */
      public fun numberOfAcceleratorDevicesRequired(numberOfAcceleratorDevicesRequired: Number)

      /**
       * @param numberOfCpuCoresRequired The number of CPU cores to allocate to run a model that you
       * assign to an inference component.
       */
      public fun numberOfCpuCoresRequired(numberOfCpuCoresRequired: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty.builder()

      /**
       * @param maxMemoryRequiredInMb The maximum MB of memory to allocate to run a model that you
       * assign to an inference component.
       */
      override fun maxMemoryRequiredInMb(maxMemoryRequiredInMb: Number) {
        cdkBuilder.maxMemoryRequiredInMb(maxMemoryRequiredInMb)
      }

      /**
       * @param minMemoryRequiredInMb The minimum MB of memory to allocate to run a model that you
       * assign to an inference component.
       */
      override fun minMemoryRequiredInMb(minMemoryRequiredInMb: Number) {
        cdkBuilder.minMemoryRequiredInMb(minMemoryRequiredInMb)
      }

      /**
       * @param numberOfAcceleratorDevicesRequired The number of accelerators to allocate to run a
       * model that you assign to an inference component.
       * Accelerators include GPUs and AWS Inferentia.
       */
      override fun numberOfAcceleratorDevicesRequired(numberOfAcceleratorDevicesRequired: Number) {
        cdkBuilder.numberOfAcceleratorDevicesRequired(numberOfAcceleratorDevicesRequired)
      }

      /**
       * @param numberOfCpuCoresRequired The number of CPU cores to allocate to run a model that you
       * assign to an inference component.
       */
      override fun numberOfCpuCoresRequired(numberOfCpuCoresRequired: Number) {
        cdkBuilder.numberOfCpuCoresRequired(numberOfCpuCoresRequired)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty,
    ) : CdkObject(cdkObject),
        InferenceComponentComputeResourceRequirementsProperty {
      /**
       * The maximum MB of memory to allocate to run a model that you assign to an inference
       * component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements.html#cfn-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements-maxmemoryrequiredinmb)
       */
      override fun maxMemoryRequiredInMb(): Number? = unwrap(this).getMaxMemoryRequiredInMb()

      /**
       * The minimum MB of memory to allocate to run a model that you assign to an inference
       * component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements.html#cfn-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements-minmemoryrequiredinmb)
       */
      override fun minMemoryRequiredInMb(): Number? = unwrap(this).getMinMemoryRequiredInMb()

      /**
       * The number of accelerators to allocate to run a model that you assign to an inference
       * component.
       *
       * Accelerators include GPUs and AWS Inferentia.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements.html#cfn-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements-numberofacceleratordevicesrequired)
       */
      override fun numberOfAcceleratorDevicesRequired(): Number? =
          unwrap(this).getNumberOfAcceleratorDevicesRequired()

      /**
       * The number of CPU cores to allocate to run a model that you assign to an inference
       * component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements.html#cfn-sagemaker-inferencecomponent-inferencecomponentcomputeresourcerequirements-numberofcpucoresrequired)
       */
      override fun numberOfCpuCoresRequired(): Number? = unwrap(this).getNumberOfCpuCoresRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentComputeResourceRequirementsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty):
          InferenceComponentComputeResourceRequirementsProperty = CdkObjectWrappers.wrap(cdkObject)
          as? InferenceComponentComputeResourceRequirementsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentComputeResourceRequirementsProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentComputeResourceRequirementsProperty
    }
  }

  /**
   * Defines a container that provides the runtime environment for a model that you deploy with an
   * inference component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * InferenceComponentContainerSpecificationProperty
   * inferenceComponentContainerSpecificationProperty =
   * InferenceComponentContainerSpecificationProperty.builder()
   * .artifactUrl("artifactUrl")
   * .deployedImage(DeployedImageProperty.builder()
   * .resolutionTime("resolutionTime")
   * .resolvedImage("resolvedImage")
   * .specifiedImage("specifiedImage")
   * .build())
   * .environment(Map.of(
   * "environmentKey", "environment"))
   * .image("image")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcontainerspecification.html)
   */
  public interface InferenceComponentContainerSpecificationProperty {
    /**
     * The Amazon S3 path where the model artifacts, which result from model training, are stored.
     *
     * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcontainerspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentcontainerspecification-artifacturl)
     */
    public fun artifactUrl(): String? = unwrap(this).getArtifactUrl()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcontainerspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentcontainerspecification-deployedimage)
     */
    public fun deployedImage(): Any? = unwrap(this).getDeployedImage()

    /**
     * The environment variables to set in the Docker container.
     *
     * Each key and value in the Environment string-to-string map can have length of up to 1024. We
     * support up to 16 entries in the map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcontainerspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentcontainerspecification-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image for the model
     * is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcontainerspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentcontainerspecification-image)
     */
    public fun image(): String? = unwrap(this).getImage()

    /**
     * A builder for [InferenceComponentContainerSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param artifactUrl The Amazon S3 path where the model artifacts, which result from model
       * training, are stored.
       * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
       */
      public fun artifactUrl(artifactUrl: String)

      /**
       * @param deployedImage the value to be set.
       */
      public fun deployedImage(deployedImage: IResolvable)

      /**
       * @param deployedImage the value to be set.
       */
      public fun deployedImage(deployedImage: DeployedImageProperty)

      /**
       * @param deployedImage the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9230b33ebfbb5888d5f4fd74a9405daa0aed42d3dd6a28687ba27a7f7e9f033e")
      public fun deployedImage(deployedImage: DeployedImageProperty.Builder.() -> Unit)

      /**
       * @param environment The environment variables to set in the Docker container.
       * Each key and value in the Environment string-to-string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       */
      public fun environment(environment: Map<String, String>)

      /**
       * @param environment The environment variables to set in the Docker container.
       * Each key and value in the Environment string-to-string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param image The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image
       * for the model is stored.
       */
      public fun image(image: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty.builder()

      /**
       * @param artifactUrl The Amazon S3 path where the model artifacts, which result from model
       * training, are stored.
       * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
       */
      override fun artifactUrl(artifactUrl: String) {
        cdkBuilder.artifactUrl(artifactUrl)
      }

      /**
       * @param deployedImage the value to be set.
       */
      override fun deployedImage(deployedImage: IResolvable) {
        cdkBuilder.deployedImage(deployedImage.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deployedImage the value to be set.
       */
      override fun deployedImage(deployedImage: DeployedImageProperty) {
        cdkBuilder.deployedImage(deployedImage.let(DeployedImageProperty.Companion::unwrap))
      }

      /**
       * @param deployedImage the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9230b33ebfbb5888d5f4fd74a9405daa0aed42d3dd6a28687ba27a7f7e9f033e")
      override fun deployedImage(deployedImage: DeployedImageProperty.Builder.() -> Unit): Unit =
          deployedImage(DeployedImageProperty(deployedImage))

      /**
       * @param environment The environment variables to set in the Docker container.
       * Each key and value in the Environment string-to-string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       */
      override fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param environment The environment variables to set in the Docker container.
       * Each key and value in the Environment string-to-string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param image The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image
       * for the model is stored.
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty,
    ) : CdkObject(cdkObject),
        InferenceComponentContainerSpecificationProperty {
      /**
       * The Amazon S3 path where the model artifacts, which result from model training, are stored.
       *
       * This path must point to a single gzip compressed tar archive (.tar.gz suffix).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcontainerspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentcontainerspecification-artifacturl)
       */
      override fun artifactUrl(): String? = unwrap(this).getArtifactUrl()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcontainerspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentcontainerspecification-deployedimage)
       */
      override fun deployedImage(): Any? = unwrap(this).getDeployedImage()

      /**
       * The environment variables to set in the Docker container.
       *
       * Each key and value in the Environment string-to-string map can have length of up to 1024.
       * We support up to 16 entries in the map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcontainerspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentcontainerspecification-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image for the
       * model is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentcontainerspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentcontainerspecification-image)
       */
      override fun image(): String? = unwrap(this).getImage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentContainerSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty):
          InferenceComponentContainerSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceComponentContainerSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentContainerSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentContainerSpecificationProperty
    }
  }

  /**
   * The deployment configuration for an endpoint that hosts inference components.
   *
   * The configuration includes the desired deployment strategy and rollback settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * InferenceComponentDeploymentConfigProperty inferenceComponentDeploymentConfigProperty =
   * InferenceComponentDeploymentConfigProperty.builder()
   * .autoRollbackConfiguration(AutoRollbackConfigurationProperty.builder()
   * .alarms(List.of(AlarmProperty.builder()
   * .alarmName("alarmName")
   * .build()))
   * .build())
   * .rollingUpdatePolicy(InferenceComponentRollingUpdatePolicyProperty.builder()
   * .maximumBatchSize(InferenceComponentCapacitySizeProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * .maximumExecutionTimeoutInSeconds(123)
   * .rollbackMaximumBatchSize(InferenceComponentCapacitySizeProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * .waitIntervalInSeconds(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentdeploymentconfig.html)
   */
  public interface InferenceComponentDeploymentConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentdeploymentconfig.html#cfn-sagemaker-inferencecomponent-inferencecomponentdeploymentconfig-autorollbackconfiguration)
     */
    public fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

    /**
     * Specifies a rolling deployment strategy for updating a SageMaker AI endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentdeploymentconfig.html#cfn-sagemaker-inferencecomponent-inferencecomponentdeploymentconfig-rollingupdatepolicy)
     */
    public fun rollingUpdatePolicy(): Any? = unwrap(this).getRollingUpdatePolicy()

    /**
     * A builder for [InferenceComponentDeploymentConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoRollbackConfiguration the value to be set.
       */
      public fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable)

      /**
       * @param autoRollbackConfiguration the value to be set.
       */
      public
          fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty)

      /**
       * @param autoRollbackConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26810b99c5cd977d842aebc2ce743196ec8c716123964d7c9480179cada6d22a")
      public
          fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty.Builder.() -> Unit)

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * AI endpoint.
       */
      public fun rollingUpdatePolicy(rollingUpdatePolicy: IResolvable)

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * AI endpoint.
       */
      public
          fun rollingUpdatePolicy(rollingUpdatePolicy: InferenceComponentRollingUpdatePolicyProperty)

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * AI endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf33ef8c4c3c96f342848c6bab804fdebeb5739858fa869468b1d6bf532d5676")
      public
          fun rollingUpdatePolicy(rollingUpdatePolicy: InferenceComponentRollingUpdatePolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentDeploymentConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentDeploymentConfigProperty.builder()

      /**
       * @param autoRollbackConfiguration the value to be set.
       */
      override fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
        cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param autoRollbackConfiguration the value to be set.
       */
      override
          fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty) {
        cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(AutoRollbackConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param autoRollbackConfiguration the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26810b99c5cd977d842aebc2ce743196ec8c716123964d7c9480179cada6d22a")
      override
          fun autoRollbackConfiguration(autoRollbackConfiguration: AutoRollbackConfigurationProperty.Builder.() -> Unit):
          Unit =
          autoRollbackConfiguration(AutoRollbackConfigurationProperty(autoRollbackConfiguration))

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * AI endpoint.
       */
      override fun rollingUpdatePolicy(rollingUpdatePolicy: IResolvable) {
        cdkBuilder.rollingUpdatePolicy(rollingUpdatePolicy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * AI endpoint.
       */
      override
          fun rollingUpdatePolicy(rollingUpdatePolicy: InferenceComponentRollingUpdatePolicyProperty) {
        cdkBuilder.rollingUpdatePolicy(rollingUpdatePolicy.let(InferenceComponentRollingUpdatePolicyProperty.Companion::unwrap))
      }

      /**
       * @param rollingUpdatePolicy Specifies a rolling deployment strategy for updating a SageMaker
       * AI endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf33ef8c4c3c96f342848c6bab804fdebeb5739858fa869468b1d6bf532d5676")
      override
          fun rollingUpdatePolicy(rollingUpdatePolicy: InferenceComponentRollingUpdatePolicyProperty.Builder.() -> Unit):
          Unit =
          rollingUpdatePolicy(InferenceComponentRollingUpdatePolicyProperty(rollingUpdatePolicy))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentDeploymentConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentDeploymentConfigProperty,
    ) : CdkObject(cdkObject),
        InferenceComponentDeploymentConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentdeploymentconfig.html#cfn-sagemaker-inferencecomponent-inferencecomponentdeploymentconfig-autorollbackconfiguration)
       */
      override fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

      /**
       * Specifies a rolling deployment strategy for updating a SageMaker AI endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentdeploymentconfig.html#cfn-sagemaker-inferencecomponent-inferencecomponentdeploymentconfig-rollingupdatepolicy)
       */
      override fun rollingUpdatePolicy(): Any? = unwrap(this).getRollingUpdatePolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentDeploymentConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentDeploymentConfigProperty):
          InferenceComponentDeploymentConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceComponentDeploymentConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentDeploymentConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentDeploymentConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentDeploymentConfigProperty
    }
  }

  /**
   * Specifies a rolling deployment strategy for updating a SageMaker AI inference component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * InferenceComponentRollingUpdatePolicyProperty inferenceComponentRollingUpdatePolicyProperty =
   * InferenceComponentRollingUpdatePolicyProperty.builder()
   * .maximumBatchSize(InferenceComponentCapacitySizeProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * .maximumExecutionTimeoutInSeconds(123)
   * .rollbackMaximumBatchSize(InferenceComponentCapacitySizeProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * .waitIntervalInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy.html)
   */
  public interface InferenceComponentRollingUpdatePolicyProperty {
    /**
     * The batch size for each rolling step in the deployment process.
     *
     * For each step, SageMaker AI provisions capacity on the new endpoint fleet, routes traffic to
     * that fleet, and terminates capacity on the old endpoint fleet. The value must be between 5% to
     * 50% of the copy count of the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy.html#cfn-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy-maximumbatchsize)
     */
    public fun maximumBatchSize(): Any? = unwrap(this).getMaximumBatchSize()

    /**
     * The time limit for the total deployment.
     *
     * Exceeding this limit causes a timeout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy.html#cfn-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy-maximumexecutiontimeoutinseconds)
     */
    public fun maximumExecutionTimeoutInSeconds(): Number? =
        unwrap(this).getMaximumExecutionTimeoutInSeconds()

    /**
     * The batch size for a rollback to the old endpoint fleet.
     *
     * If this field is absent, the value is set to the default, which is 100% of the total
     * capacity. When the default is used, SageMaker AI provisions the entire capacity of the old fleet
     * at once during rollback.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy.html#cfn-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy-rollbackmaximumbatchsize)
     */
    public fun rollbackMaximumBatchSize(): Any? = unwrap(this).getRollbackMaximumBatchSize()

    /**
     * The length of the baking period, during which SageMaker AI monitors alarms for each batch on
     * the new fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy.html#cfn-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy-waitintervalinseconds)
     */
    public fun waitIntervalInSeconds(): Number? = unwrap(this).getWaitIntervalInSeconds()

    /**
     * A builder for [InferenceComponentRollingUpdatePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumBatchSize The batch size for each rolling step in the deployment process.
       * For each step, SageMaker AI provisions capacity on the new endpoint fleet, routes traffic
       * to that fleet, and terminates capacity on the old endpoint fleet. The value must be between 5%
       * to 50% of the copy count of the inference component.
       */
      public fun maximumBatchSize(maximumBatchSize: IResolvable)

      /**
       * @param maximumBatchSize The batch size for each rolling step in the deployment process.
       * For each step, SageMaker AI provisions capacity on the new endpoint fleet, routes traffic
       * to that fleet, and terminates capacity on the old endpoint fleet. The value must be between 5%
       * to 50% of the copy count of the inference component.
       */
      public fun maximumBatchSize(maximumBatchSize: InferenceComponentCapacitySizeProperty)

      /**
       * @param maximumBatchSize The batch size for each rolling step in the deployment process.
       * For each step, SageMaker AI provisions capacity on the new endpoint fleet, routes traffic
       * to that fleet, and terminates capacity on the old endpoint fleet. The value must be between 5%
       * to 50% of the copy count of the inference component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("975ca168e3bdc4a266ab83c07f3a07dfdfb84c2da2a5c806d1218a556690bfcf")
      public
          fun maximumBatchSize(maximumBatchSize: InferenceComponentCapacitySizeProperty.Builder.() -> Unit)

      /**
       * @param maximumExecutionTimeoutInSeconds The time limit for the total deployment.
       * Exceeding this limit causes a timeout.
       */
      public fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number)

      /**
       * @param rollbackMaximumBatchSize The batch size for a rollback to the old endpoint fleet.
       * If this field is absent, the value is set to the default, which is 100% of the total
       * capacity. When the default is used, SageMaker AI provisions the entire capacity of the old
       * fleet at once during rollback.
       */
      public fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: IResolvable)

      /**
       * @param rollbackMaximumBatchSize The batch size for a rollback to the old endpoint fleet.
       * If this field is absent, the value is set to the default, which is 100% of the total
       * capacity. When the default is used, SageMaker AI provisions the entire capacity of the old
       * fleet at once during rollback.
       */
      public
          fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: InferenceComponentCapacitySizeProperty)

      /**
       * @param rollbackMaximumBatchSize The batch size for a rollback to the old endpoint fleet.
       * If this field is absent, the value is set to the default, which is 100% of the total
       * capacity. When the default is used, SageMaker AI provisions the entire capacity of the old
       * fleet at once during rollback.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("354c863c0125e64e7ddd14712ef688c2ce97bb1011d922157fe2616cbb70cc7b")
      public
          fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: InferenceComponentCapacitySizeProperty.Builder.() -> Unit)

      /**
       * @param waitIntervalInSeconds The length of the baking period, during which SageMaker AI
       * monitors alarms for each batch on the new fleet.
       */
      public fun waitIntervalInSeconds(waitIntervalInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRollingUpdatePolicyProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRollingUpdatePolicyProperty.builder()

      /**
       * @param maximumBatchSize The batch size for each rolling step in the deployment process.
       * For each step, SageMaker AI provisions capacity on the new endpoint fleet, routes traffic
       * to that fleet, and terminates capacity on the old endpoint fleet. The value must be between 5%
       * to 50% of the copy count of the inference component.
       */
      override fun maximumBatchSize(maximumBatchSize: IResolvable) {
        cdkBuilder.maximumBatchSize(maximumBatchSize.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param maximumBatchSize The batch size for each rolling step in the deployment process.
       * For each step, SageMaker AI provisions capacity on the new endpoint fleet, routes traffic
       * to that fleet, and terminates capacity on the old endpoint fleet. The value must be between 5%
       * to 50% of the copy count of the inference component.
       */
      override fun maximumBatchSize(maximumBatchSize: InferenceComponentCapacitySizeProperty) {
        cdkBuilder.maximumBatchSize(maximumBatchSize.let(InferenceComponentCapacitySizeProperty.Companion::unwrap))
      }

      /**
       * @param maximumBatchSize The batch size for each rolling step in the deployment process.
       * For each step, SageMaker AI provisions capacity on the new endpoint fleet, routes traffic
       * to that fleet, and terminates capacity on the old endpoint fleet. The value must be between 5%
       * to 50% of the copy count of the inference component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("975ca168e3bdc4a266ab83c07f3a07dfdfb84c2da2a5c806d1218a556690bfcf")
      override
          fun maximumBatchSize(maximumBatchSize: InferenceComponentCapacitySizeProperty.Builder.() -> Unit):
          Unit = maximumBatchSize(InferenceComponentCapacitySizeProperty(maximumBatchSize))

      /**
       * @param maximumExecutionTimeoutInSeconds The time limit for the total deployment.
       * Exceeding this limit causes a timeout.
       */
      override fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number) {
        cdkBuilder.maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds)
      }

      /**
       * @param rollbackMaximumBatchSize The batch size for a rollback to the old endpoint fleet.
       * If this field is absent, the value is set to the default, which is 100% of the total
       * capacity. When the default is used, SageMaker AI provisions the entire capacity of the old
       * fleet at once during rollback.
       */
      override fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: IResolvable) {
        cdkBuilder.rollbackMaximumBatchSize(rollbackMaximumBatchSize.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rollbackMaximumBatchSize The batch size for a rollback to the old endpoint fleet.
       * If this field is absent, the value is set to the default, which is 100% of the total
       * capacity. When the default is used, SageMaker AI provisions the entire capacity of the old
       * fleet at once during rollback.
       */
      override
          fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: InferenceComponentCapacitySizeProperty) {
        cdkBuilder.rollbackMaximumBatchSize(rollbackMaximumBatchSize.let(InferenceComponentCapacitySizeProperty.Companion::unwrap))
      }

      /**
       * @param rollbackMaximumBatchSize The batch size for a rollback to the old endpoint fleet.
       * If this field is absent, the value is set to the default, which is 100% of the total
       * capacity. When the default is used, SageMaker AI provisions the entire capacity of the old
       * fleet at once during rollback.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("354c863c0125e64e7ddd14712ef688c2ce97bb1011d922157fe2616cbb70cc7b")
      override
          fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: InferenceComponentCapacitySizeProperty.Builder.() -> Unit):
          Unit =
          rollbackMaximumBatchSize(InferenceComponentCapacitySizeProperty(rollbackMaximumBatchSize))

      /**
       * @param waitIntervalInSeconds The length of the baking period, during which SageMaker AI
       * monitors alarms for each batch on the new fleet.
       */
      override fun waitIntervalInSeconds(waitIntervalInSeconds: Number) {
        cdkBuilder.waitIntervalInSeconds(waitIntervalInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRollingUpdatePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRollingUpdatePolicyProperty,
    ) : CdkObject(cdkObject),
        InferenceComponentRollingUpdatePolicyProperty {
      /**
       * The batch size for each rolling step in the deployment process.
       *
       * For each step, SageMaker AI provisions capacity on the new endpoint fleet, routes traffic
       * to that fleet, and terminates capacity on the old endpoint fleet. The value must be between 5%
       * to 50% of the copy count of the inference component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy.html#cfn-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy-maximumbatchsize)
       */
      override fun maximumBatchSize(): Any? = unwrap(this).getMaximumBatchSize()

      /**
       * The time limit for the total deployment.
       *
       * Exceeding this limit causes a timeout.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy.html#cfn-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy-maximumexecutiontimeoutinseconds)
       */
      override fun maximumExecutionTimeoutInSeconds(): Number? =
          unwrap(this).getMaximumExecutionTimeoutInSeconds()

      /**
       * The batch size for a rollback to the old endpoint fleet.
       *
       * If this field is absent, the value is set to the default, which is 100% of the total
       * capacity. When the default is used, SageMaker AI provisions the entire capacity of the old
       * fleet at once during rollback.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy.html#cfn-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy-rollbackmaximumbatchsize)
       */
      override fun rollbackMaximumBatchSize(): Any? = unwrap(this).getRollbackMaximumBatchSize()

      /**
       * The length of the baking period, during which SageMaker AI monitors alarms for each batch
       * on the new fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy.html#cfn-sagemaker-inferencecomponent-inferencecomponentrollingupdatepolicy-waitintervalinseconds)
       */
      override fun waitIntervalInSeconds(): Number? = unwrap(this).getWaitIntervalInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentRollingUpdatePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRollingUpdatePolicyProperty):
          InferenceComponentRollingUpdatePolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceComponentRollingUpdatePolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentRollingUpdatePolicyProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRollingUpdatePolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRollingUpdatePolicyProperty
    }
  }

  /**
   * Runtime settings for a model that is deployed with an inference component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * InferenceComponentRuntimeConfigProperty inferenceComponentRuntimeConfigProperty =
   * InferenceComponentRuntimeConfigProperty.builder()
   * .copyCount(123)
   * .currentCopyCount(123)
   * .desiredCopyCount(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentruntimeconfig.html)
   */
  public interface InferenceComponentRuntimeConfigProperty {
    /**
     * The number of runtime copies of the model container to deploy with the inference component.
     *
     * Each copy can serve inference requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentruntimeconfig.html#cfn-sagemaker-inferencecomponent-inferencecomponentruntimeconfig-copycount)
     */
    public fun copyCount(): Number? = unwrap(this).getCopyCount()

    /**
     * The number of runtime copies of the model container that are currently deployed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentruntimeconfig.html#cfn-sagemaker-inferencecomponent-inferencecomponentruntimeconfig-currentcopycount)
     */
    public fun currentCopyCount(): Number? = unwrap(this).getCurrentCopyCount()

    /**
     * The number of runtime copies of the model container that you requested to deploy with the
     * inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentruntimeconfig.html#cfn-sagemaker-inferencecomponent-inferencecomponentruntimeconfig-desiredcopycount)
     */
    public fun desiredCopyCount(): Number? = unwrap(this).getDesiredCopyCount()

    /**
     * A builder for [InferenceComponentRuntimeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param copyCount The number of runtime copies of the model container to deploy with the
       * inference component.
       * Each copy can serve inference requests.
       */
      public fun copyCount(copyCount: Number)

      /**
       * @param currentCopyCount The number of runtime copies of the model container that are
       * currently deployed.
       */
      public fun currentCopyCount(currentCopyCount: Number)

      /**
       * @param desiredCopyCount The number of runtime copies of the model container that you
       * requested to deploy with the inference component.
       */
      public fun desiredCopyCount(desiredCopyCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty.builder()

      /**
       * @param copyCount The number of runtime copies of the model container to deploy with the
       * inference component.
       * Each copy can serve inference requests.
       */
      override fun copyCount(copyCount: Number) {
        cdkBuilder.copyCount(copyCount)
      }

      /**
       * @param currentCopyCount The number of runtime copies of the model container that are
       * currently deployed.
       */
      override fun currentCopyCount(currentCopyCount: Number) {
        cdkBuilder.currentCopyCount(currentCopyCount)
      }

      /**
       * @param desiredCopyCount The number of runtime copies of the model container that you
       * requested to deploy with the inference component.
       */
      override fun desiredCopyCount(desiredCopyCount: Number) {
        cdkBuilder.desiredCopyCount(desiredCopyCount)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty,
    ) : CdkObject(cdkObject),
        InferenceComponentRuntimeConfigProperty {
      /**
       * The number of runtime copies of the model container to deploy with the inference component.
       *
       * Each copy can serve inference requests.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentruntimeconfig.html#cfn-sagemaker-inferencecomponent-inferencecomponentruntimeconfig-copycount)
       */
      override fun copyCount(): Number? = unwrap(this).getCopyCount()

      /**
       * The number of runtime copies of the model container that are currently deployed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentruntimeconfig.html#cfn-sagemaker-inferencecomponent-inferencecomponentruntimeconfig-currentcopycount)
       */
      override fun currentCopyCount(): Number? = unwrap(this).getCurrentCopyCount()

      /**
       * The number of runtime copies of the model container that you requested to deploy with the
       * inference component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentruntimeconfig.html#cfn-sagemaker-inferencecomponent-inferencecomponentruntimeconfig-desiredcopycount)
       */
      override fun desiredCopyCount(): Number? = unwrap(this).getDesiredCopyCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentRuntimeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty):
          InferenceComponentRuntimeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceComponentRuntimeConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentRuntimeConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentRuntimeConfigProperty
    }
  }

  /**
   * Details about the resources to deploy with this inference component, including the model,
   * container, and compute resources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * InferenceComponentSpecificationProperty inferenceComponentSpecificationProperty =
   * InferenceComponentSpecificationProperty.builder()
   * .baseInferenceComponentName("baseInferenceComponentName")
   * .computeResourceRequirements(InferenceComponentComputeResourceRequirementsProperty.builder()
   * .maxMemoryRequiredInMb(123)
   * .minMemoryRequiredInMb(123)
   * .numberOfAcceleratorDevicesRequired(123)
   * .numberOfCpuCoresRequired(123)
   * .build())
   * .container(InferenceComponentContainerSpecificationProperty.builder()
   * .artifactUrl("artifactUrl")
   * .deployedImage(DeployedImageProperty.builder()
   * .resolutionTime("resolutionTime")
   * .resolvedImage("resolvedImage")
   * .specifiedImage("specifiedImage")
   * .build())
   * .environment(Map.of(
   * "environmentKey", "environment"))
   * .image("image")
   * .build())
   * .modelName("modelName")
   * .startupParameters(InferenceComponentStartupParametersProperty.builder()
   * .containerStartupHealthCheckTimeoutInSeconds(123)
   * .modelDataDownloadTimeoutInSeconds(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html)
   */
  public interface InferenceComponentSpecificationProperty {
    /**
     * The name of an existing inference component that is to contain the inference component that
     * you're creating with your request.
     *
     * Specify this parameter only if your request is meant to create an adapter inference
     * component. An adapter inference component contains the path to an adapter model. The purpose of
     * the adapter model is to tailor the inference output of a base foundation model, which is hosted
     * by the base inference component. The adapter inference component uses the compute resources that
     * you assigned to the base inference component.
     *
     * When you create an adapter inference component, use the `Container` parameter to specify the
     * location of the adapter artifacts. In the parameter value, use the `ArtifactUrl` parameter of
     * the `InferenceComponentContainerSpecification` data type.
     *
     * Before you can create an adapter inference component, you must have an existing inference
     * component that contains the foundation model that you want to adapt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentspecification-baseinferencecomponentname)
     */
    public fun baseInferenceComponentName(): String? = unwrap(this).getBaseInferenceComponentName()

    /**
     * The compute resources allocated to run the model, plus any adapter models, that you assign to
     * the inference component.
     *
     * Omit this parameter if your request is meant to create an adapter inference component. An
     * adapter inference component is loaded by a base inference component, and it uses the compute
     * resources of the base inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentspecification-computeresourcerequirements)
     */
    public fun computeResourceRequirements(): Any? = unwrap(this).getComputeResourceRequirements()

    /**
     * Defines a container that provides the runtime environment for a model that you deploy with an
     * inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentspecification-container)
     */
    public fun container(): Any? = unwrap(this).getContainer()

    /**
     * The name of an existing SageMaker AI model object in your account that you want to deploy
     * with the inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentspecification-modelname)
     */
    public fun modelName(): String? = unwrap(this).getModelName()

    /**
     * Settings that take effect while the model container starts up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentspecification-startupparameters)
     */
    public fun startupParameters(): Any? = unwrap(this).getStartupParameters()

    /**
     * A builder for [InferenceComponentSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseInferenceComponentName The name of an existing inference component that is to
       * contain the inference component that you're creating with your request.
       * Specify this parameter only if your request is meant to create an adapter inference
       * component. An adapter inference component contains the path to an adapter model. The purpose
       * of the adapter model is to tailor the inference output of a base foundation model, which is
       * hosted by the base inference component. The adapter inference component uses the compute
       * resources that you assigned to the base inference component.
       *
       * When you create an adapter inference component, use the `Container` parameter to specify
       * the location of the adapter artifacts. In the parameter value, use the `ArtifactUrl` parameter
       * of the `InferenceComponentContainerSpecification` data type.
       *
       * Before you can create an adapter inference component, you must have an existing inference
       * component that contains the foundation model that you want to adapt.
       */
      public fun baseInferenceComponentName(baseInferenceComponentName: String)

      /**
       * @param computeResourceRequirements The compute resources allocated to run the model, plus
       * any adapter models, that you assign to the inference component.
       * Omit this parameter if your request is meant to create an adapter inference component. An
       * adapter inference component is loaded by a base inference component, and it uses the compute
       * resources of the base inference component.
       */
      public fun computeResourceRequirements(computeResourceRequirements: IResolvable)

      /**
       * @param computeResourceRequirements The compute resources allocated to run the model, plus
       * any adapter models, that you assign to the inference component.
       * Omit this parameter if your request is meant to create an adapter inference component. An
       * adapter inference component is loaded by a base inference component, and it uses the compute
       * resources of the base inference component.
       */
      public
          fun computeResourceRequirements(computeResourceRequirements: InferenceComponentComputeResourceRequirementsProperty)

      /**
       * @param computeResourceRequirements The compute resources allocated to run the model, plus
       * any adapter models, that you assign to the inference component.
       * Omit this parameter if your request is meant to create an adapter inference component. An
       * adapter inference component is loaded by a base inference component, and it uses the compute
       * resources of the base inference component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db00219b7dbb581ee5a0820364523ece8e2c71181d72bb3cc72165ffd178a63a")
      public
          fun computeResourceRequirements(computeResourceRequirements: InferenceComponentComputeResourceRequirementsProperty.Builder.() -> Unit)

      /**
       * @param container Defines a container that provides the runtime environment for a model that
       * you deploy with an inference component.
       */
      public fun container(container: IResolvable)

      /**
       * @param container Defines a container that provides the runtime environment for a model that
       * you deploy with an inference component.
       */
      public fun container(container: InferenceComponentContainerSpecificationProperty)

      /**
       * @param container Defines a container that provides the runtime environment for a model that
       * you deploy with an inference component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c159431fed6e3b661da5cd1940492ea428fd171e79db76570eba05437585428d")
      public
          fun container(container: InferenceComponentContainerSpecificationProperty.Builder.() -> Unit)

      /**
       * @param modelName The name of an existing SageMaker AI model object in your account that you
       * want to deploy with the inference component.
       */
      public fun modelName(modelName: String)

      /**
       * @param startupParameters Settings that take effect while the model container starts up.
       */
      public fun startupParameters(startupParameters: IResolvable)

      /**
       * @param startupParameters Settings that take effect while the model container starts up.
       */
      public fun startupParameters(startupParameters: InferenceComponentStartupParametersProperty)

      /**
       * @param startupParameters Settings that take effect while the model container starts up.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26f6720eb665a9db2971614a7e88275897ea49410b838f9a5782e76ebd0833ff")
      public
          fun startupParameters(startupParameters: InferenceComponentStartupParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty.builder()

      /**
       * @param baseInferenceComponentName The name of an existing inference component that is to
       * contain the inference component that you're creating with your request.
       * Specify this parameter only if your request is meant to create an adapter inference
       * component. An adapter inference component contains the path to an adapter model. The purpose
       * of the adapter model is to tailor the inference output of a base foundation model, which is
       * hosted by the base inference component. The adapter inference component uses the compute
       * resources that you assigned to the base inference component.
       *
       * When you create an adapter inference component, use the `Container` parameter to specify
       * the location of the adapter artifacts. In the parameter value, use the `ArtifactUrl` parameter
       * of the `InferenceComponentContainerSpecification` data type.
       *
       * Before you can create an adapter inference component, you must have an existing inference
       * component that contains the foundation model that you want to adapt.
       */
      override fun baseInferenceComponentName(baseInferenceComponentName: String) {
        cdkBuilder.baseInferenceComponentName(baseInferenceComponentName)
      }

      /**
       * @param computeResourceRequirements The compute resources allocated to run the model, plus
       * any adapter models, that you assign to the inference component.
       * Omit this parameter if your request is meant to create an adapter inference component. An
       * adapter inference component is loaded by a base inference component, and it uses the compute
       * resources of the base inference component.
       */
      override fun computeResourceRequirements(computeResourceRequirements: IResolvable) {
        cdkBuilder.computeResourceRequirements(computeResourceRequirements.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param computeResourceRequirements The compute resources allocated to run the model, plus
       * any adapter models, that you assign to the inference component.
       * Omit this parameter if your request is meant to create an adapter inference component. An
       * adapter inference component is loaded by a base inference component, and it uses the compute
       * resources of the base inference component.
       */
      override
          fun computeResourceRequirements(computeResourceRequirements: InferenceComponentComputeResourceRequirementsProperty) {
        cdkBuilder.computeResourceRequirements(computeResourceRequirements.let(InferenceComponentComputeResourceRequirementsProperty.Companion::unwrap))
      }

      /**
       * @param computeResourceRequirements The compute resources allocated to run the model, plus
       * any adapter models, that you assign to the inference component.
       * Omit this parameter if your request is meant to create an adapter inference component. An
       * adapter inference component is loaded by a base inference component, and it uses the compute
       * resources of the base inference component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db00219b7dbb581ee5a0820364523ece8e2c71181d72bb3cc72165ffd178a63a")
      override
          fun computeResourceRequirements(computeResourceRequirements: InferenceComponentComputeResourceRequirementsProperty.Builder.() -> Unit):
          Unit =
          computeResourceRequirements(InferenceComponentComputeResourceRequirementsProperty(computeResourceRequirements))

      /**
       * @param container Defines a container that provides the runtime environment for a model that
       * you deploy with an inference component.
       */
      override fun container(container: IResolvable) {
        cdkBuilder.container(container.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param container Defines a container that provides the runtime environment for a model that
       * you deploy with an inference component.
       */
      override fun container(container: InferenceComponentContainerSpecificationProperty) {
        cdkBuilder.container(container.let(InferenceComponentContainerSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param container Defines a container that provides the runtime environment for a model that
       * you deploy with an inference component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c159431fed6e3b661da5cd1940492ea428fd171e79db76570eba05437585428d")
      override
          fun container(container: InferenceComponentContainerSpecificationProperty.Builder.() -> Unit):
          Unit = container(InferenceComponentContainerSpecificationProperty(container))

      /**
       * @param modelName The name of an existing SageMaker AI model object in your account that you
       * want to deploy with the inference component.
       */
      override fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
      }

      /**
       * @param startupParameters Settings that take effect while the model container starts up.
       */
      override fun startupParameters(startupParameters: IResolvable) {
        cdkBuilder.startupParameters(startupParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param startupParameters Settings that take effect while the model container starts up.
       */
      override
          fun startupParameters(startupParameters: InferenceComponentStartupParametersProperty) {
        cdkBuilder.startupParameters(startupParameters.let(InferenceComponentStartupParametersProperty.Companion::unwrap))
      }

      /**
       * @param startupParameters Settings that take effect while the model container starts up.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26f6720eb665a9db2971614a7e88275897ea49410b838f9a5782e76ebd0833ff")
      override
          fun startupParameters(startupParameters: InferenceComponentStartupParametersProperty.Builder.() -> Unit):
          Unit = startupParameters(InferenceComponentStartupParametersProperty(startupParameters))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty,
    ) : CdkObject(cdkObject),
        InferenceComponentSpecificationProperty {
      /**
       * The name of an existing inference component that is to contain the inference component that
       * you're creating with your request.
       *
       * Specify this parameter only if your request is meant to create an adapter inference
       * component. An adapter inference component contains the path to an adapter model. The purpose
       * of the adapter model is to tailor the inference output of a base foundation model, which is
       * hosted by the base inference component. The adapter inference component uses the compute
       * resources that you assigned to the base inference component.
       *
       * When you create an adapter inference component, use the `Container` parameter to specify
       * the location of the adapter artifacts. In the parameter value, use the `ArtifactUrl` parameter
       * of the `InferenceComponentContainerSpecification` data type.
       *
       * Before you can create an adapter inference component, you must have an existing inference
       * component that contains the foundation model that you want to adapt.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentspecification-baseinferencecomponentname)
       */
      override fun baseInferenceComponentName(): String? =
          unwrap(this).getBaseInferenceComponentName()

      /**
       * The compute resources allocated to run the model, plus any adapter models, that you assign
       * to the inference component.
       *
       * Omit this parameter if your request is meant to create an adapter inference component. An
       * adapter inference component is loaded by a base inference component, and it uses the compute
       * resources of the base inference component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentspecification-computeresourcerequirements)
       */
      override fun computeResourceRequirements(): Any? =
          unwrap(this).getComputeResourceRequirements()

      /**
       * Defines a container that provides the runtime environment for a model that you deploy with
       * an inference component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentspecification-container)
       */
      override fun container(): Any? = unwrap(this).getContainer()

      /**
       * The name of an existing SageMaker AI model object in your account that you want to deploy
       * with the inference component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentspecification-modelname)
       */
      override fun modelName(): String? = unwrap(this).getModelName()

      /**
       * Settings that take effect while the model container starts up.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentspecification.html#cfn-sagemaker-inferencecomponent-inferencecomponentspecification-startupparameters)
       */
      override fun startupParameters(): Any? = unwrap(this).getStartupParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty):
          InferenceComponentSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceComponentSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentSpecificationProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentSpecificationProperty
    }
  }

  /**
   * Settings that take effect while the model container starts up.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * InferenceComponentStartupParametersProperty inferenceComponentStartupParametersProperty =
   * InferenceComponentStartupParametersProperty.builder()
   * .containerStartupHealthCheckTimeoutInSeconds(123)
   * .modelDataDownloadTimeoutInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentstartupparameters.html)
   */
  public interface InferenceComponentStartupParametersProperty {
    /**
     * The timeout value, in seconds, for your inference container to pass health check by Amazon S3
     * Hosting.
     *
     * For more information about health check, see [How Your Container Should Respond to Health
     * Check (Ping)
     * Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentstartupparameters.html#cfn-sagemaker-inferencecomponent-inferencecomponentstartupparameters-containerstartuphealthchecktimeoutinseconds)
     */
    public fun containerStartupHealthCheckTimeoutInSeconds(): Number? =
        unwrap(this).getContainerStartupHealthCheckTimeoutInSeconds()

    /**
     * The timeout value, in seconds, to download and extract the model that you want to host from
     * Amazon S3 to the individual inference instance associated with this inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentstartupparameters.html#cfn-sagemaker-inferencecomponent-inferencecomponentstartupparameters-modeldatadownloadtimeoutinseconds)
     */
    public fun modelDataDownloadTimeoutInSeconds(): Number? =
        unwrap(this).getModelDataDownloadTimeoutInSeconds()

    /**
     * A builder for [InferenceComponentStartupParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerStartupHealthCheckTimeoutInSeconds The timeout value, in seconds, for your
       * inference container to pass health check by Amazon S3 Hosting.
       * For more information about health check, see [How Your Container Should Respond to Health
       * Check (Ping)
       * Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests)
       * .
       */
      public
          fun containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds: Number)

      /**
       * @param modelDataDownloadTimeoutInSeconds The timeout value, in seconds, to download and
       * extract the model that you want to host from Amazon S3 to the individual inference instance
       * associated with this inference component.
       */
      public fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty.builder()

      /**
       * @param containerStartupHealthCheckTimeoutInSeconds The timeout value, in seconds, for your
       * inference container to pass health check by Amazon S3 Hosting.
       * For more information about health check, see [How Your Container Should Respond to Health
       * Check (Ping)
       * Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests)
       * .
       */
      override
          fun containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds: Number) {
        cdkBuilder.containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds)
      }

      /**
       * @param modelDataDownloadTimeoutInSeconds The timeout value, in seconds, to download and
       * extract the model that you want to host from Amazon S3 to the individual inference instance
       * associated with this inference component.
       */
      override fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number) {
        cdkBuilder.modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty,
    ) : CdkObject(cdkObject),
        InferenceComponentStartupParametersProperty {
      /**
       * The timeout value, in seconds, for your inference container to pass health check by Amazon
       * S3 Hosting.
       *
       * For more information about health check, see [How Your Container Should Respond to Health
       * Check (Ping)
       * Requests](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-inference-code.html#your-algorithms-inference-algo-ping-requests)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentstartupparameters.html#cfn-sagemaker-inferencecomponent-inferencecomponentstartupparameters-containerstartuphealthchecktimeoutinseconds)
       */
      override fun containerStartupHealthCheckTimeoutInSeconds(): Number? =
          unwrap(this).getContainerStartupHealthCheckTimeoutInSeconds()

      /**
       * The timeout value, in seconds, to download and extract the model that you want to host from
       * Amazon S3 to the individual inference instance associated with this inference component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferencecomponent-inferencecomponentstartupparameters.html#cfn-sagemaker-inferencecomponent-inferencecomponentstartupparameters-modeldatadownloadtimeoutinseconds)
       */
      override fun modelDataDownloadTimeoutInSeconds(): Number? =
          unwrap(this).getModelDataDownloadTimeoutInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InferenceComponentStartupParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty):
          InferenceComponentStartupParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceComponentStartupParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceComponentStartupParametersProperty):
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnInferenceComponent.InferenceComponentStartupParametersProperty
    }
  }
}

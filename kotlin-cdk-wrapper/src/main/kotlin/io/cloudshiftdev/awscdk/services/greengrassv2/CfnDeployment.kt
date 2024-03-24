@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrassv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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
 * Creates a continuous deployment for a target, which is a AWS IoT Greengrass core device or group
 * of core devices.
 *
 * When you add a new core device to a group of core devices that has a deployment, AWS IoT
 * Greengrass deploys that group's deployment to the new device.
 *
 * You can define one deployment for each target. When you create a new deployment for a target that
 * has an existing deployment, you replace the previous deployment. AWS IoT Greengrass applies the new
 * deployment to the target devices.
 *
 * You can only add, update, or delete up to 10 deployments at a time to a single target.
 *
 * Every deployment has a revision number that indicates how many deployment revisions you define
 * for a target. Use this operation to create a new revision of an existing deployment. This operation
 * returns the revision number of the new deployment when you create it.
 *
 * For more information, see the [Create
 * deployments](https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html) in
 * the *AWS IoT Greengrass V2 Developer Guide* .
 *
 *
 * Deployment resources are deleted when you delete stacks. To keep the deployments in a stack, you
 * must specify `"DeletionPolicy": "Retain"` on each deployment resource in the stack template that you
 * want to keep. For more information, see
 * [DeletionPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 * You can only delete up to 10 deployment resources at a time. If you delete more than 10
 * resources, you receive an error.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
 * Object rateIncreaseCriteria;
 * CfnDeployment cfnDeployment = CfnDeployment.Builder.create(this, "MyCfnDeployment")
 * .targetArn("targetArn")
 * // the properties below are optional
 * .components(Map.of(
 * "componentsKey", ComponentDeploymentSpecificationProperty.builder()
 * .componentVersion("componentVersion")
 * .configurationUpdate(ComponentConfigurationUpdateProperty.builder()
 * .merge("merge")
 * .reset(List.of("reset"))
 * .build())
 * .runWith(ComponentRunWithProperty.builder()
 * .posixUser("posixUser")
 * .systemResourceLimits(SystemResourceLimitsProperty.builder()
 * .cpus(123)
 * .memory(123)
 * .build())
 * .windowsUser("windowsUser")
 * .build())
 * .build()))
 * .deploymentName("deploymentName")
 * .deploymentPolicies(DeploymentPoliciesProperty.builder()
 * .componentUpdatePolicy(DeploymentComponentUpdatePolicyProperty.builder()
 * .action("action")
 * .timeoutInSeconds(123)
 * .build())
 * .configurationValidationPolicy(DeploymentConfigurationValidationPolicyProperty.builder()
 * .timeoutInSeconds(123)
 * .build())
 * .failureHandlingPolicy("failureHandlingPolicy")
 * .build())
 * .iotJobConfiguration(DeploymentIoTJobConfigurationProperty.builder()
 * .abortConfig(IoTJobAbortConfigProperty.builder()
 * .criteriaList(List.of(IoTJobAbortCriteriaProperty.builder()
 * .action("action")
 * .failureType("failureType")
 * .minNumberOfExecutedThings(123)
 * .thresholdPercentage(123)
 * .build()))
 * .build())
 * .jobExecutionsRolloutConfig(IoTJobExecutionsRolloutConfigProperty.builder()
 * .exponentialRate(IoTJobExponentialRolloutRateProperty.builder()
 * .baseRatePerMinute(123)
 * .incrementFactor(123)
 * .rateIncreaseCriteria(rateIncreaseCriteria)
 * .build())
 * .maximumPerMinute(123)
 * .build())
 * .timeoutConfig(IoTJobTimeoutConfigProperty.builder()
 * .inProgressTimeoutInMinutes(123)
 * .build())
 * .build())
 * .parentTargetArn("parentTargetArn")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html)
 */
public open class CfnDeployment(
  cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentProps,
  ) :
      this(software.amazon.awscdk.services.greengrassv2.CfnDeployment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDeploymentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeploymentProps(props)
  )

  /**
   * The ID of the deployment.
   */
  public open fun attrDeploymentId(): String = unwrap(this).getAttrDeploymentId()

  /**
   * The components to deploy.
   */
  public open fun components(): Any? = unwrap(this).getComponents()

  /**
   * The components to deploy.
   */
  public open fun components(`value`: IResolvable) {
    unwrap(this).setComponents(`value`.let(IResolvable::unwrap))
  }

  /**
   * The components to deploy.
   */
  public open fun components(`value`: Map<String, Any>) {
    unwrap(this).setComponents(`value`.mapValues{CdkObjectWrappers.unwrap(it.value)})
  }

  /**
   * The name of the deployment.
   */
  public open fun deploymentName(): String? = unwrap(this).getDeploymentName()

  /**
   * The name of the deployment.
   */
  public open fun deploymentName(`value`: String) {
    unwrap(this).setDeploymentName(`value`)
  }

  /**
   * The deployment policies for the deployment.
   */
  public open fun deploymentPolicies(): Any? = unwrap(this).getDeploymentPolicies()

  /**
   * The deployment policies for the deployment.
   */
  public open fun deploymentPolicies(`value`: IResolvable) {
    unwrap(this).setDeploymentPolicies(`value`.let(IResolvable::unwrap))
  }

  /**
   * The deployment policies for the deployment.
   */
  public open fun deploymentPolicies(`value`: DeploymentPoliciesProperty) {
    unwrap(this).setDeploymentPolicies(`value`.let(DeploymentPoliciesProperty::unwrap))
  }

  /**
   * The deployment policies for the deployment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e932e3cdf74eecca3597cda2b744411d664a7dc32176062461c79cc91b97cc8")
  public open fun deploymentPolicies(`value`: DeploymentPoliciesProperty.Builder.() -> Unit): Unit =
      deploymentPolicies(DeploymentPoliciesProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The job configuration for the deployment configuration.
   */
  public open fun iotJobConfiguration(): Any? = unwrap(this).getIotJobConfiguration()

  /**
   * The job configuration for the deployment configuration.
   */
  public open fun iotJobConfiguration(`value`: IResolvable) {
    unwrap(this).setIotJobConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The job configuration for the deployment configuration.
   */
  public open fun iotJobConfiguration(`value`: DeploymentIoTJobConfigurationProperty) {
    unwrap(this).setIotJobConfiguration(`value`.let(DeploymentIoTJobConfigurationProperty::unwrap))
  }

  /**
   * The job configuration for the deployment configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54578ced49c987e269c6f5f2922f0208a0a96f232f97b778c894c28bcd56b237")
  public open
      fun iotJobConfiguration(`value`: DeploymentIoTJobConfigurationProperty.Builder.() -> Unit):
      Unit = iotJobConfiguration(DeploymentIoTJobConfigurationProperty(`value`))

  /**
   * The parent deployment's
   * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
   * subdeployment.
   */
  public open fun parentTargetArn(): String? = unwrap(this).getParentTargetArn()

  /**
   * The parent deployment's
   * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
   * subdeployment.
   */
  public open fun parentTargetArn(`value`: String) {
    unwrap(this).setParentTargetArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Application-specific metadata to attach to the deployment.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Application-specific metadata to attach to the deployment.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The ARN of the target AWS IoT thing or thing group.
   */
  public open fun targetArn(): String = unwrap(this).getTargetArn()

  /**
   * The ARN of the target AWS IoT thing or thing group.
   */
  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrassv2.CfnDeployment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The components to deploy.
     *
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-components)
     * @param components The components to deploy. 
     */
    public fun components(components: IResolvable)

    /**
     * The components to deploy.
     *
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-components)
     * @param components The components to deploy. 
     */
    public fun components(components: Map<String, Any>)

    /**
     * The name of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentname)
     * @param deploymentName The name of the deployment. 
     */
    public fun deploymentName(deploymentName: String)

    /**
     * The deployment policies for the deployment.
     *
     * These policies define how the deployment updates components and handles failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentpolicies)
     * @param deploymentPolicies The deployment policies for the deployment. 
     */
    public fun deploymentPolicies(deploymentPolicies: IResolvable)

    /**
     * The deployment policies for the deployment.
     *
     * These policies define how the deployment updates components and handles failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentpolicies)
     * @param deploymentPolicies The deployment policies for the deployment. 
     */
    public fun deploymentPolicies(deploymentPolicies: DeploymentPoliciesProperty)

    /**
     * The deployment policies for the deployment.
     *
     * These policies define how the deployment updates components and handles failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentpolicies)
     * @param deploymentPolicies The deployment policies for the deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6abdf667c4571f2e053be60238321b64f1b0cb205d4938adba46df49ad0ba187")
    public fun deploymentPolicies(deploymentPolicies: DeploymentPoliciesProperty.Builder.() -> Unit)

    /**
     * The job configuration for the deployment configuration.
     *
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-iotjobconfiguration)
     * @param iotJobConfiguration The job configuration for the deployment configuration. 
     */
    public fun iotJobConfiguration(iotJobConfiguration: IResolvable)

    /**
     * The job configuration for the deployment configuration.
     *
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-iotjobconfiguration)
     * @param iotJobConfiguration The job configuration for the deployment configuration. 
     */
    public fun iotJobConfiguration(iotJobConfiguration: DeploymentIoTJobConfigurationProperty)

    /**
     * The job configuration for the deployment configuration.
     *
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-iotjobconfiguration)
     * @param iotJobConfiguration The job configuration for the deployment configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47375d74830768d23d48de5b6201039cef3e1b3620fe1f6ef05e4b6ccd0a4c6c")
    public
        fun iotJobConfiguration(iotJobConfiguration: DeploymentIoTJobConfigurationProperty.Builder.() -> Unit)

    /**
     * The parent deployment's
     * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
     * subdeployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-parenttargetarn)
     * @param parentTargetArn The parent deployment's
     * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
     * subdeployment. 
     */
    public fun parentTargetArn(parentTargetArn: String)

    /**
     * Application-specific metadata to attach to the deployment.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tag your AWS IoT
     * Greengrass Version 2
     * resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html) in the
     * *AWS IoT Greengrass V2 Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-tags)
     * @param tags Application-specific metadata to attach to the deployment. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The ARN of the target AWS IoT thing or thing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-targetarn)
     * @param targetArn The ARN of the target AWS IoT thing or thing group. 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrassv2.CfnDeployment.Builder =
        software.amazon.awscdk.services.greengrassv2.CfnDeployment.Builder.create(scope, id)

    /**
     * The components to deploy.
     *
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-components)
     * @param components The components to deploy. 
     */
    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    /**
     * The components to deploy.
     *
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-components)
     * @param components The components to deploy. 
     */
    override fun components(components: Map<String, Any>) {
      cdkBuilder.components(components.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The name of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentname)
     * @param deploymentName The name of the deployment. 
     */
    override fun deploymentName(deploymentName: String) {
      cdkBuilder.deploymentName(deploymentName)
    }

    /**
     * The deployment policies for the deployment.
     *
     * These policies define how the deployment updates components and handles failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentpolicies)
     * @param deploymentPolicies The deployment policies for the deployment. 
     */
    override fun deploymentPolicies(deploymentPolicies: IResolvable) {
      cdkBuilder.deploymentPolicies(deploymentPolicies.let(IResolvable::unwrap))
    }

    /**
     * The deployment policies for the deployment.
     *
     * These policies define how the deployment updates components and handles failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentpolicies)
     * @param deploymentPolicies The deployment policies for the deployment. 
     */
    override fun deploymentPolicies(deploymentPolicies: DeploymentPoliciesProperty) {
      cdkBuilder.deploymentPolicies(deploymentPolicies.let(DeploymentPoliciesProperty::unwrap))
    }

    /**
     * The deployment policies for the deployment.
     *
     * These policies define how the deployment updates components and handles failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentpolicies)
     * @param deploymentPolicies The deployment policies for the deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6abdf667c4571f2e053be60238321b64f1b0cb205d4938adba46df49ad0ba187")
    override
        fun deploymentPolicies(deploymentPolicies: DeploymentPoliciesProperty.Builder.() -> Unit):
        Unit = deploymentPolicies(DeploymentPoliciesProperty(deploymentPolicies))

    /**
     * The job configuration for the deployment configuration.
     *
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-iotjobconfiguration)
     * @param iotJobConfiguration The job configuration for the deployment configuration. 
     */
    override fun iotJobConfiguration(iotJobConfiguration: IResolvable) {
      cdkBuilder.iotJobConfiguration(iotJobConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The job configuration for the deployment configuration.
     *
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-iotjobconfiguration)
     * @param iotJobConfiguration The job configuration for the deployment configuration. 
     */
    override fun iotJobConfiguration(iotJobConfiguration: DeploymentIoTJobConfigurationProperty) {
      cdkBuilder.iotJobConfiguration(iotJobConfiguration.let(DeploymentIoTJobConfigurationProperty::unwrap))
    }

    /**
     * The job configuration for the deployment configuration.
     *
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-iotjobconfiguration)
     * @param iotJobConfiguration The job configuration for the deployment configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47375d74830768d23d48de5b6201039cef3e1b3620fe1f6ef05e4b6ccd0a4c6c")
    override
        fun iotJobConfiguration(iotJobConfiguration: DeploymentIoTJobConfigurationProperty.Builder.() -> Unit):
        Unit = iotJobConfiguration(DeploymentIoTJobConfigurationProperty(iotJobConfiguration))

    /**
     * The parent deployment's
     * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
     * subdeployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-parenttargetarn)
     * @param parentTargetArn The parent deployment's
     * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
     * subdeployment. 
     */
    override fun parentTargetArn(parentTargetArn: String) {
      cdkBuilder.parentTargetArn(parentTargetArn)
    }

    /**
     * Application-specific metadata to attach to the deployment.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tag your AWS IoT
     * Greengrass Version 2
     * resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html) in the
     * *AWS IoT Greengrass V2 Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-tags)
     * @param tags Application-specific metadata to attach to the deployment. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The ARN of the target AWS IoT thing or thing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-targetarn)
     * @param targetArn The ARN of the target AWS IoT thing or thing group. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.greengrassv2.CfnDeployment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrassv2.CfnDeployment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeployment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeployment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment):
        CfnDeployment = CfnDeployment(cdkObject)

    internal fun unwrap(wrapped: CfnDeployment):
        software.amazon.awscdk.services.greengrassv2.CfnDeployment = wrapped.cdkObject as
        software.amazon.awscdk.services.greengrassv2.CfnDeployment
  }

  /**
   * Contains information about a deployment's update to a component's configuration on AWS IoT
   * Greengrass core devices.
   *
   * For more information, see [Update component
   * configurations](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * ComponentConfigurationUpdateProperty componentConfigurationUpdateProperty =
   * ComponentConfigurationUpdateProperty.builder()
   * .merge("merge")
   * .reset(List.of("reset"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentconfigurationupdate.html)
   */
  public interface ComponentConfigurationUpdateProperty {
    /**
     * A serialized JSON string that contains the configuration object to merge to target devices.
     *
     * The core device merges this configuration with the component's existing configuration. If
     * this is the first time a component deploys on a device, the core device merges this
     * configuration with the component's default configuration. This means that the core device keeps
     * it's existing configuration for keys and values that you don't specify in this object. For more
     * information, see [Merge configuration
     * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update)
     * in the *AWS IoT Greengrass V2 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentconfigurationupdate.html#cfn-greengrassv2-deployment-componentconfigurationupdate-merge)
     */
    public fun merge(): String? = unwrap(this).getMerge()

    /**
     * The list of configuration nodes to reset to default values on target devices.
     *
     * Use JSON pointers to specify each node to reset. JSON pointers start with a forward slash (
     * `/` ) and use forward slashes to separate the key for each level in the object. For more
     * information, see the [JSON pointer
     * specification](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) and [Reset
     * configuration
     * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update)
     * in the *AWS IoT Greengrass V2 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentconfigurationupdate.html#cfn-greengrassv2-deployment-componentconfigurationupdate-reset)
     */
    public fun reset(): List<String> = unwrap(this).getReset() ?: emptyList()

    /**
     * A builder for [ComponentConfigurationUpdateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param merge A serialized JSON string that contains the configuration object to merge to
       * target devices.
       * The core device merges this configuration with the component's existing configuration. If
       * this is the first time a component deploys on a device, the core device merges this
       * configuration with the component's default configuration. This means that the core device
       * keeps it's existing configuration for keys and values that you don't specify in this object.
       * For more information, see [Merge configuration
       * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      public fun merge(merge: String)

      /**
       * @param reset The list of configuration nodes to reset to default values on target devices.
       * Use JSON pointers to specify each node to reset. JSON pointers start with a forward slash (
       * `/` ) and use forward slashes to separate the key for each level in the object. For more
       * information, see the [JSON pointer
       * specification](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) and [Reset
       * configuration
       * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      public fun reset(reset: List<String>)

      /**
       * @param reset The list of configuration nodes to reset to default values on target devices.
       * Use JSON pointers to specify each node to reset. JSON pointers start with a forward slash (
       * `/` ) and use forward slashes to separate the key for each level in the object. For more
       * information, see the [JSON pointer
       * specification](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) and [Reset
       * configuration
       * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      public fun reset(vararg reset: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty.builder()

      /**
       * @param merge A serialized JSON string that contains the configuration object to merge to
       * target devices.
       * The core device merges this configuration with the component's existing configuration. If
       * this is the first time a component deploys on a device, the core device merges this
       * configuration with the component's default configuration. This means that the core device
       * keeps it's existing configuration for keys and values that you don't specify in this object.
       * For more information, see [Merge configuration
       * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      override fun merge(merge: String) {
        cdkBuilder.merge(merge)
      }

      /**
       * @param reset The list of configuration nodes to reset to default values on target devices.
       * Use JSON pointers to specify each node to reset. JSON pointers start with a forward slash (
       * `/` ) and use forward slashes to separate the key for each level in the object. For more
       * information, see the [JSON pointer
       * specification](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) and [Reset
       * configuration
       * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      override fun reset(reset: List<String>) {
        cdkBuilder.reset(reset)
      }

      /**
       * @param reset The list of configuration nodes to reset to default values on target devices.
       * Use JSON pointers to specify each node to reset. JSON pointers start with a forward slash (
       * `/` ) and use forward slashes to separate the key for each level in the object. For more
       * information, see the [JSON pointer
       * specification](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) and [Reset
       * configuration
       * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      override fun reset(vararg reset: String): Unit = reset(reset.toList())

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty,
    ) : CdkObject(cdkObject), ComponentConfigurationUpdateProperty {
      /**
       * A serialized JSON string that contains the configuration object to merge to target devices.
       *
       * The core device merges this configuration with the component's existing configuration. If
       * this is the first time a component deploys on a device, the core device merges this
       * configuration with the component's default configuration. This means that the core device
       * keeps it's existing configuration for keys and values that you don't specify in this object.
       * For more information, see [Merge configuration
       * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#merge-configuration-update)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentconfigurationupdate.html#cfn-greengrassv2-deployment-componentconfigurationupdate-merge)
       */
      override fun merge(): String? = unwrap(this).getMerge()

      /**
       * The list of configuration nodes to reset to default values on target devices.
       *
       * Use JSON pointers to specify each node to reset. JSON pointers start with a forward slash (
       * `/` ) and use forward slashes to separate the key for each level in the object. For more
       * information, see the [JSON pointer
       * specification](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) and [Reset
       * configuration
       * updates](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html#reset-configuration-update)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentconfigurationupdate.html#cfn-greengrassv2-deployment-componentconfigurationupdate-reset)
       */
      override fun reset(): List<String> = unwrap(this).getReset() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentConfigurationUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty):
          ComponentConfigurationUpdateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentConfigurationUpdateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentConfigurationUpdateProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentConfigurationUpdateProperty
    }
  }

  /**
   * Contains information about a component to deploy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * ComponentDeploymentSpecificationProperty componentDeploymentSpecificationProperty =
   * ComponentDeploymentSpecificationProperty.builder()
   * .componentVersion("componentVersion")
   * .configurationUpdate(ComponentConfigurationUpdateProperty.builder()
   * .merge("merge")
   * .reset(List.of("reset"))
   * .build())
   * .runWith(ComponentRunWithProperty.builder()
   * .posixUser("posixUser")
   * .systemResourceLimits(SystemResourceLimitsProperty.builder()
   * .cpus(123)
   * .memory(123)
   * .build())
   * .windowsUser("windowsUser")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentdeploymentspecification.html)
   */
  public interface ComponentDeploymentSpecificationProperty {
    /**
     * The version of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentdeploymentspecification.html#cfn-greengrassv2-deployment-componentdeploymentspecification-componentversion)
     */
    public fun componentVersion(): String? = unwrap(this).getComponentVersion()

    /**
     * The configuration updates to deploy for the component.
     *
     * You can define reset updates and merge updates. A reset updates the keys that you specify to
     * the default configuration for the component. A merge updates the core device's component
     * configuration with the keys and values that you specify. The AWS IoT Greengrass Core software
     * applies reset updates before it applies merge updates. For more information, see [Update
     * component
     * configuration](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentdeploymentspecification.html#cfn-greengrassv2-deployment-componentdeploymentspecification-configurationupdate)
     */
    public fun configurationUpdate(): Any? = unwrap(this).getConfigurationUpdate()

    /**
     * The system user and group that the  software uses to run component processes on the core
     * device.
     *
     * If you omit this parameter, the  software uses the system user and group that you configure
     * for the core device. For more information, see [Configure the user and group that run
     * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
     * in the *AWS IoT Greengrass V2 Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentdeploymentspecification.html#cfn-greengrassv2-deployment-componentdeploymentspecification-runwith)
     */
    public fun runWith(): Any? = unwrap(this).getRunWith()

    /**
     * A builder for [ComponentDeploymentSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentVersion The version of the component.
       */
      public fun componentVersion(componentVersion: String)

      /**
       * @param configurationUpdate The configuration updates to deploy for the component.
       * You can define reset updates and merge updates. A reset updates the keys that you specify
       * to the default configuration for the component. A merge updates the core device's component
       * configuration with the keys and values that you specify. The AWS IoT Greengrass Core software
       * applies reset updates before it applies merge updates. For more information, see [Update
       * component
       * configuration](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
       * .
       */
      public fun configurationUpdate(configurationUpdate: IResolvable)

      /**
       * @param configurationUpdate The configuration updates to deploy for the component.
       * You can define reset updates and merge updates. A reset updates the keys that you specify
       * to the default configuration for the component. A merge updates the core device's component
       * configuration with the keys and values that you specify. The AWS IoT Greengrass Core software
       * applies reset updates before it applies merge updates. For more information, see [Update
       * component
       * configuration](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
       * .
       */
      public fun configurationUpdate(configurationUpdate: ComponentConfigurationUpdateProperty)

      /**
       * @param configurationUpdate The configuration updates to deploy for the component.
       * You can define reset updates and merge updates. A reset updates the keys that you specify
       * to the default configuration for the component. A merge updates the core device's component
       * configuration with the keys and values that you specify. The AWS IoT Greengrass Core software
       * applies reset updates before it applies merge updates. For more information, see [Update
       * component
       * configuration](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bff8a79f37c7f2b8d15a21d1fb6b2699725a3bd18ee3d1a1210700f5854c3c98")
      public
          fun configurationUpdate(configurationUpdate: ComponentConfigurationUpdateProperty.Builder.() -> Unit)

      /**
       * @param runWith The system user and group that the  software uses to run component processes
       * on the core device.
       * If you omit this parameter, the  software uses the system user and group that you configure
       * for the core device. For more information, see [Configure the user and group that run
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      public fun runWith(runWith: IResolvable)

      /**
       * @param runWith The system user and group that the  software uses to run component processes
       * on the core device.
       * If you omit this parameter, the  software uses the system user and group that you configure
       * for the core device. For more information, see [Configure the user and group that run
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      public fun runWith(runWith: ComponentRunWithProperty)

      /**
       * @param runWith The system user and group that the  software uses to run component processes
       * on the core device.
       * If you omit this parameter, the  software uses the system user and group that you configure
       * for the core device. For more information, see [Configure the user and group that run
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fedfda318dca168ff86448eb05b7921146a82619d9f1a0fc65d92986e666558")
      public fun runWith(runWith: ComponentRunWithProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty.builder()

      /**
       * @param componentVersion The version of the component.
       */
      override fun componentVersion(componentVersion: String) {
        cdkBuilder.componentVersion(componentVersion)
      }

      /**
       * @param configurationUpdate The configuration updates to deploy for the component.
       * You can define reset updates and merge updates. A reset updates the keys that you specify
       * to the default configuration for the component. A merge updates the core device's component
       * configuration with the keys and values that you specify. The AWS IoT Greengrass Core software
       * applies reset updates before it applies merge updates. For more information, see [Update
       * component
       * configuration](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
       * .
       */
      override fun configurationUpdate(configurationUpdate: IResolvable) {
        cdkBuilder.configurationUpdate(configurationUpdate.let(IResolvable::unwrap))
      }

      /**
       * @param configurationUpdate The configuration updates to deploy for the component.
       * You can define reset updates and merge updates. A reset updates the keys that you specify
       * to the default configuration for the component. A merge updates the core device's component
       * configuration with the keys and values that you specify. The AWS IoT Greengrass Core software
       * applies reset updates before it applies merge updates. For more information, see [Update
       * component
       * configuration](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
       * .
       */
      override fun configurationUpdate(configurationUpdate: ComponentConfigurationUpdateProperty) {
        cdkBuilder.configurationUpdate(configurationUpdate.let(ComponentConfigurationUpdateProperty::unwrap))
      }

      /**
       * @param configurationUpdate The configuration updates to deploy for the component.
       * You can define reset updates and merge updates. A reset updates the keys that you specify
       * to the default configuration for the component. A merge updates the core device's component
       * configuration with the keys and values that you specify. The AWS IoT Greengrass Core software
       * applies reset updates before it applies merge updates. For more information, see [Update
       * component
       * configuration](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bff8a79f37c7f2b8d15a21d1fb6b2699725a3bd18ee3d1a1210700f5854c3c98")
      override
          fun configurationUpdate(configurationUpdate: ComponentConfigurationUpdateProperty.Builder.() -> Unit):
          Unit = configurationUpdate(ComponentConfigurationUpdateProperty(configurationUpdate))

      /**
       * @param runWith The system user and group that the  software uses to run component processes
       * on the core device.
       * If you omit this parameter, the  software uses the system user and group that you configure
       * for the core device. For more information, see [Configure the user and group that run
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      override fun runWith(runWith: IResolvable) {
        cdkBuilder.runWith(runWith.let(IResolvable::unwrap))
      }

      /**
       * @param runWith The system user and group that the  software uses to run component processes
       * on the core device.
       * If you omit this parameter, the  software uses the system user and group that you configure
       * for the core device. For more information, see [Configure the user and group that run
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      override fun runWith(runWith: ComponentRunWithProperty) {
        cdkBuilder.runWith(runWith.let(ComponentRunWithProperty::unwrap))
      }

      /**
       * @param runWith The system user and group that the  software uses to run component processes
       * on the core device.
       * If you omit this parameter, the  software uses the system user and group that you configure
       * for the core device. For more information, see [Configure the user and group that run
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fedfda318dca168ff86448eb05b7921146a82619d9f1a0fc65d92986e666558")
      override fun runWith(runWith: ComponentRunWithProperty.Builder.() -> Unit): Unit =
          runWith(ComponentRunWithProperty(runWith))

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty,
    ) : CdkObject(cdkObject), ComponentDeploymentSpecificationProperty {
      /**
       * The version of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentdeploymentspecification.html#cfn-greengrassv2-deployment-componentdeploymentspecification-componentversion)
       */
      override fun componentVersion(): String? = unwrap(this).getComponentVersion()

      /**
       * The configuration updates to deploy for the component.
       *
       * You can define reset updates and merge updates. A reset updates the keys that you specify
       * to the default configuration for the component. A merge updates the core device's component
       * configuration with the keys and values that you specify. The AWS IoT Greengrass Core software
       * applies reset updates before it applies merge updates. For more information, see [Update
       * component
       * configuration](https://docs.aws.amazon.com/greengrass/v2/developerguide/update-component-configurations.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentdeploymentspecification.html#cfn-greengrassv2-deployment-componentdeploymentspecification-configurationupdate)
       */
      override fun configurationUpdate(): Any? = unwrap(this).getConfigurationUpdate()

      /**
       * The system user and group that the  software uses to run component processes on the core
       * device.
       *
       * If you omit this parameter, the  software uses the system user and group that you configure
       * for the core device. For more information, see [Configure the user and group that run
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentdeploymentspecification.html#cfn-greengrassv2-deployment-componentdeploymentspecification-runwith)
       */
      override fun runWith(): Any? = unwrap(this).getRunWith()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentDeploymentSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty):
          ComponentDeploymentSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComponentDeploymentSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentDeploymentSpecificationProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentDeploymentSpecificationProperty
    }
  }

  /**
   * Contains information system user and group that the AWS IoT Greengrass Core software uses to
   * run component processes on the core device.
   *
   * For more information, see [Configure the user and group that run
   * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * ComponentRunWithProperty componentRunWithProperty = ComponentRunWithProperty.builder()
   * .posixUser("posixUser")
   * .systemResourceLimits(SystemResourceLimitsProperty.builder()
   * .cpus(123)
   * .memory(123)
   * .build())
   * .windowsUser("windowsUser")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentrunwith.html)
   */
  public interface ComponentRunWithProperty {
    /**
     * The POSIX system user and (optional) group to use to run this component.
     *
     * Specify the user and group separated by a colon ( `:` ) in the following format: `user:group`
     * . The group is optional. If you don't specify a group, the AWS IoT Greengrass Core software uses
     * the primary user for the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentrunwith.html#cfn-greengrassv2-deployment-componentrunwith-posixuser)
     */
    public fun posixUser(): String? = unwrap(this).getPosixUser()

    /**
     * The system resource limits to apply to this component's process on the core device.
     *
     * AWS IoT Greengrass supports this feature only on Linux core devices.
     *
     * If you omit this parameter, the AWS IoT Greengrass Core software uses the default system
     * resource limits that you configure on the AWS IoT Greengrass nucleus component. For more
     * information, see [Configure system resource limits for
     * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentrunwith.html#cfn-greengrassv2-deployment-componentrunwith-systemresourcelimits)
     */
    public fun systemResourceLimits(): Any? = unwrap(this).getSystemResourceLimits()

    /**
     * The Windows user to use to run this component on Windows core devices.
     *
     * The user must exist on each Windows core device, and its name and password must be in the
     * LocalSystem account's Credentials Manager instance.
     *
     * If you omit this parameter, the AWS IoT Greengrass Core software uses the default Windows
     * user that you configure on the AWS IoT Greengrass nucleus component. For more information, see
     * [Configure the user and group that run
     * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentrunwith.html#cfn-greengrassv2-deployment-componentrunwith-windowsuser)
     */
    public fun windowsUser(): String? = unwrap(this).getWindowsUser()

    /**
     * A builder for [ComponentRunWithProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param posixUser The POSIX system user and (optional) group to use to run this component.
       * Specify the user and group separated by a colon ( `:` ) in the following format:
       * `user:group` . The group is optional. If you don't specify a group, the AWS IoT Greengrass
       * Core software uses the primary user for the group.
       */
      public fun posixUser(posixUser: String)

      /**
       * @param systemResourceLimits The system resource limits to apply to this component's process
       * on the core device.
       * AWS IoT Greengrass supports this feature only on Linux core devices.
       *
       * If you omit this parameter, the AWS IoT Greengrass Core software uses the default system
       * resource limits that you configure on the AWS IoT Greengrass nucleus component. For more
       * information, see [Configure system resource limits for
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
       * .
       */
      public fun systemResourceLimits(systemResourceLimits: IResolvable)

      /**
       * @param systemResourceLimits The system resource limits to apply to this component's process
       * on the core device.
       * AWS IoT Greengrass supports this feature only on Linux core devices.
       *
       * If you omit this parameter, the AWS IoT Greengrass Core software uses the default system
       * resource limits that you configure on the AWS IoT Greengrass nucleus component. For more
       * information, see [Configure system resource limits for
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
       * .
       */
      public fun systemResourceLimits(systemResourceLimits: SystemResourceLimitsProperty)

      /**
       * @param systemResourceLimits The system resource limits to apply to this component's process
       * on the core device.
       * AWS IoT Greengrass supports this feature only on Linux core devices.
       *
       * If you omit this parameter, the AWS IoT Greengrass Core software uses the default system
       * resource limits that you configure on the AWS IoT Greengrass nucleus component. For more
       * information, see [Configure system resource limits for
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aef781a843243efacf3e7c91fe786e9fcf8a47f6be21dd3ead4beb719503243e")
      public
          fun systemResourceLimits(systemResourceLimits: SystemResourceLimitsProperty.Builder.() -> Unit)

      /**
       * @param windowsUser The Windows user to use to run this component on Windows core devices.
       * The user must exist on each Windows core device, and its name and password must be in the
       * LocalSystem account's Credentials Manager instance.
       *
       * If you omit this parameter, the AWS IoT Greengrass Core software uses the default Windows
       * user that you configure on the AWS IoT Greengrass nucleus component. For more information, see
       * [Configure the user and group that run
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
       * .
       */
      public fun windowsUser(windowsUser: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty.builder()

      /**
       * @param posixUser The POSIX system user and (optional) group to use to run this component.
       * Specify the user and group separated by a colon ( `:` ) in the following format:
       * `user:group` . The group is optional. If you don't specify a group, the AWS IoT Greengrass
       * Core software uses the primary user for the group.
       */
      override fun posixUser(posixUser: String) {
        cdkBuilder.posixUser(posixUser)
      }

      /**
       * @param systemResourceLimits The system resource limits to apply to this component's process
       * on the core device.
       * AWS IoT Greengrass supports this feature only on Linux core devices.
       *
       * If you omit this parameter, the AWS IoT Greengrass Core software uses the default system
       * resource limits that you configure on the AWS IoT Greengrass nucleus component. For more
       * information, see [Configure system resource limits for
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
       * .
       */
      override fun systemResourceLimits(systemResourceLimits: IResolvable) {
        cdkBuilder.systemResourceLimits(systemResourceLimits.let(IResolvable::unwrap))
      }

      /**
       * @param systemResourceLimits The system resource limits to apply to this component's process
       * on the core device.
       * AWS IoT Greengrass supports this feature only on Linux core devices.
       *
       * If you omit this parameter, the AWS IoT Greengrass Core software uses the default system
       * resource limits that you configure on the AWS IoT Greengrass nucleus component. For more
       * information, see [Configure system resource limits for
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
       * .
       */
      override fun systemResourceLimits(systemResourceLimits: SystemResourceLimitsProperty) {
        cdkBuilder.systemResourceLimits(systemResourceLimits.let(SystemResourceLimitsProperty::unwrap))
      }

      /**
       * @param systemResourceLimits The system resource limits to apply to this component's process
       * on the core device.
       * AWS IoT Greengrass supports this feature only on Linux core devices.
       *
       * If you omit this parameter, the AWS IoT Greengrass Core software uses the default system
       * resource limits that you configure on the AWS IoT Greengrass nucleus component. For more
       * information, see [Configure system resource limits for
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aef781a843243efacf3e7c91fe786e9fcf8a47f6be21dd3ead4beb719503243e")
      override
          fun systemResourceLimits(systemResourceLimits: SystemResourceLimitsProperty.Builder.() -> Unit):
          Unit = systemResourceLimits(SystemResourceLimitsProperty(systemResourceLimits))

      /**
       * @param windowsUser The Windows user to use to run this component on Windows core devices.
       * The user must exist on each Windows core device, and its name and password must be in the
       * LocalSystem account's Credentials Manager instance.
       *
       * If you omit this parameter, the AWS IoT Greengrass Core software uses the default Windows
       * user that you configure on the AWS IoT Greengrass nucleus component. For more information, see
       * [Configure the user and group that run
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
       * .
       */
      override fun windowsUser(windowsUser: String) {
        cdkBuilder.windowsUser(windowsUser)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty,
    ) : CdkObject(cdkObject), ComponentRunWithProperty {
      /**
       * The POSIX system user and (optional) group to use to run this component.
       *
       * Specify the user and group separated by a colon ( `:` ) in the following format:
       * `user:group` . The group is optional. If you don't specify a group, the AWS IoT Greengrass
       * Core software uses the primary user for the group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentrunwith.html#cfn-greengrassv2-deployment-componentrunwith-posixuser)
       */
      override fun posixUser(): String? = unwrap(this).getPosixUser()

      /**
       * The system resource limits to apply to this component's process on the core device.
       *
       * AWS IoT Greengrass supports this feature only on Linux core devices.
       *
       * If you omit this parameter, the AWS IoT Greengrass Core software uses the default system
       * resource limits that you configure on the AWS IoT Greengrass nucleus component. For more
       * information, see [Configure system resource limits for
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentrunwith.html#cfn-greengrassv2-deployment-componentrunwith-systemresourcelimits)
       */
      override fun systemResourceLimits(): Any? = unwrap(this).getSystemResourceLimits()

      /**
       * The Windows user to use to run this component on Windows core devices.
       *
       * The user must exist on each Windows core device, and its name and password must be in the
       * LocalSystem account's Credentials Manager instance.
       *
       * If you omit this parameter, the AWS IoT Greengrass Core software uses the default Windows
       * user that you configure on the AWS IoT Greengrass nucleus component. For more information, see
       * [Configure the user and group that run
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-user)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-componentrunwith.html#cfn-greengrassv2-deployment-componentrunwith-windowsuser)
       */
      override fun windowsUser(): String? = unwrap(this).getWindowsUser()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentRunWithProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty):
          ComponentRunWithProperty = CdkObjectWrappers.wrap(cdkObject) as? ComponentRunWithProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentRunWithProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.ComponentRunWithProperty
    }
  }

  /**
   * Contains information about a deployment's policy that defines when components are safe to
   * update.
   *
   * Each component on a device can report whether or not it's ready to update. After a component
   * and its dependencies are ready, they can apply the update in the deployment. You can configure
   * whether or not the deployment notifies components of an update and waits for a response. You
   * specify the amount of time each component has to respond to the update notification.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * DeploymentComponentUpdatePolicyProperty deploymentComponentUpdatePolicyProperty =
   * DeploymentComponentUpdatePolicyProperty.builder()
   * .action("action")
   * .timeoutInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentcomponentupdatepolicy.html)
   */
  public interface DeploymentComponentUpdatePolicyProperty {
    /**
     * Whether or not to notify components and wait for components to become safe to update.
     *
     * Choose from the following options:
     *
     * * `NOTIFY_COMPONENTS` – The deployment notifies each component before it stops and updates
     * that component. Components can use the
     * [SubscribeToComponentUpdates](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates)
     * IPC operation to receive these notifications. Then, components can respond with the
     * [DeferComponentUpdate](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate)
     * IPC operation. For more information, see the [Create
     * deployments](https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html)
     * in the *AWS IoT Greengrass V2 Developer Guide* .
     * * `SKIP_NOTIFY_COMPONENTS` – The deployment doesn't notify components or wait for them to be
     * safe to update.
     *
     * Default: `NOTIFY_COMPONENTS`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentcomponentupdatepolicy.html#cfn-greengrassv2-deployment-deploymentcomponentupdatepolicy-action)
     */
    public fun action(): String? = unwrap(this).getAction()

    /**
     * The amount of time in seconds that each component on a device has to report that it's safe to
     * update.
     *
     * If the component waits for longer than this timeout, then the deployment proceeds on the
     * device.
     *
     * Default: `60`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentcomponentupdatepolicy.html#cfn-greengrassv2-deployment-deploymentcomponentupdatepolicy-timeoutinseconds)
     */
    public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

    /**
     * A builder for [DeploymentComponentUpdatePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action Whether or not to notify components and wait for components to become safe to
       * update.
       * Choose from the following options:
       *
       * * `NOTIFY_COMPONENTS` – The deployment notifies each component before it stops and updates
       * that component. Components can use the
       * [SubscribeToComponentUpdates](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates)
       * IPC operation to receive these notifications. Then, components can respond with the
       * [DeferComponentUpdate](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate)
       * IPC operation. For more information, see the [Create
       * deployments](https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       * * `SKIP_NOTIFY_COMPONENTS` – The deployment doesn't notify components or wait for them to
       * be safe to update.
       *
       * Default: `NOTIFY_COMPONENTS`
       */
      public fun action(action: String)

      /**
       * @param timeoutInSeconds The amount of time in seconds that each component on a device has
       * to report that it's safe to update.
       * If the component waits for longer than this timeout, then the deployment proceeds on the
       * device.
       *
       * Default: `60`
       */
      public fun timeoutInSeconds(timeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty.builder()

      /**
       * @param action Whether or not to notify components and wait for components to become safe to
       * update.
       * Choose from the following options:
       *
       * * `NOTIFY_COMPONENTS` – The deployment notifies each component before it stops and updates
       * that component. Components can use the
       * [SubscribeToComponentUpdates](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates)
       * IPC operation to receive these notifications. Then, components can respond with the
       * [DeferComponentUpdate](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate)
       * IPC operation. For more information, see the [Create
       * deployments](https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       * * `SKIP_NOTIFY_COMPONENTS` – The deployment doesn't notify components or wait for them to
       * be safe to update.
       *
       * Default: `NOTIFY_COMPONENTS`
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param timeoutInSeconds The amount of time in seconds that each component on a device has
       * to report that it's safe to update.
       * If the component waits for longer than this timeout, then the deployment proceeds on the
       * device.
       *
       * Default: `60`
       */
      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty,
    ) : CdkObject(cdkObject), DeploymentComponentUpdatePolicyProperty {
      /**
       * Whether or not to notify components and wait for components to become safe to update.
       *
       * Choose from the following options:
       *
       * * `NOTIFY_COMPONENTS` – The deployment notifies each component before it stops and updates
       * that component. Components can use the
       * [SubscribeToComponentUpdates](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates)
       * IPC operation to receive these notifications. Then, components can respond with the
       * [DeferComponentUpdate](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate)
       * IPC operation. For more information, see the [Create
       * deployments](https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html)
       * in the *AWS IoT Greengrass V2 Developer Guide* .
       * * `SKIP_NOTIFY_COMPONENTS` – The deployment doesn't notify components or wait for them to
       * be safe to update.
       *
       * Default: `NOTIFY_COMPONENTS`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentcomponentupdatepolicy.html#cfn-greengrassv2-deployment-deploymentcomponentupdatepolicy-action)
       */
      override fun action(): String? = unwrap(this).getAction()

      /**
       * The amount of time in seconds that each component on a device has to report that it's safe
       * to update.
       *
       * If the component waits for longer than this timeout, then the deployment proceeds on the
       * device.
       *
       * Default: `60`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentcomponentupdatepolicy.html#cfn-greengrassv2-deployment-deploymentcomponentupdatepolicy-timeoutinseconds)
       */
      override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeploymentComponentUpdatePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty):
          DeploymentComponentUpdatePolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentComponentUpdatePolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentComponentUpdatePolicyProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentComponentUpdatePolicyProperty
    }
  }

  /**
   * Contains information about how long a component on a core device can validate its configuration
   * updates before it times out.
   *
   * Components can use the
   * [SubscribeToValidateConfigurationUpdates](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetovalidateconfigurationupdates)
   * IPC operation to receive notifications when a deployment specifies a configuration update. Then,
   * components can respond with the
   * [SendConfigurationValidityReport](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-sendconfigurationvalidityreport)
   * IPC operation. For more information, see the [Create
   * deployments](https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html) in
   * the *AWS IoT Greengrass V2 Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * DeploymentConfigurationValidationPolicyProperty deploymentConfigurationValidationPolicyProperty
   * = DeploymentConfigurationValidationPolicyProperty.builder()
   * .timeoutInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentconfigurationvalidationpolicy.html)
   */
  public interface DeploymentConfigurationValidationPolicyProperty {
    /**
     * The amount of time in seconds that a component can validate its configuration updates.
     *
     * If the validation time exceeds this timeout, then the deployment proceeds for the device.
     *
     * Default: `30`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentconfigurationvalidationpolicy.html#cfn-greengrassv2-deployment-deploymentconfigurationvalidationpolicy-timeoutinseconds)
     */
    public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

    /**
     * A builder for [DeploymentConfigurationValidationPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param timeoutInSeconds The amount of time in seconds that a component can validate its
       * configuration updates.
       * If the validation time exceeds this timeout, then the deployment proceeds for the device.
       *
       * Default: `30`
       */
      public fun timeoutInSeconds(timeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty.builder()

      /**
       * @param timeoutInSeconds The amount of time in seconds that a component can validate its
       * configuration updates.
       * If the validation time exceeds this timeout, then the deployment proceeds for the device.
       *
       * Default: `30`
       */
      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty,
    ) : CdkObject(cdkObject), DeploymentConfigurationValidationPolicyProperty {
      /**
       * The amount of time in seconds that a component can validate its configuration updates.
       *
       * If the validation time exceeds this timeout, then the deployment proceeds for the device.
       *
       * Default: `30`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentconfigurationvalidationpolicy.html#cfn-greengrassv2-deployment-deploymentconfigurationvalidationpolicy-timeoutinseconds)
       */
      override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeploymentConfigurationValidationPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty):
          DeploymentConfigurationValidationPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentConfigurationValidationPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentConfigurationValidationPolicyProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentConfigurationValidationPolicyProperty
    }
  }

  /**
   * Contains information about an AWS IoT job configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * Object rateIncreaseCriteria;
   * DeploymentIoTJobConfigurationProperty deploymentIoTJobConfigurationProperty =
   * DeploymentIoTJobConfigurationProperty.builder()
   * .abortConfig(IoTJobAbortConfigProperty.builder()
   * .criteriaList(List.of(IoTJobAbortCriteriaProperty.builder()
   * .action("action")
   * .failureType("failureType")
   * .minNumberOfExecutedThings(123)
   * .thresholdPercentage(123)
   * .build()))
   * .build())
   * .jobExecutionsRolloutConfig(IoTJobExecutionsRolloutConfigProperty.builder()
   * .exponentialRate(IoTJobExponentialRolloutRateProperty.builder()
   * .baseRatePerMinute(123)
   * .incrementFactor(123)
   * .rateIncreaseCriteria(rateIncreaseCriteria)
   * .build())
   * .maximumPerMinute(123)
   * .build())
   * .timeoutConfig(IoTJobTimeoutConfigProperty.builder()
   * .inProgressTimeoutInMinutes(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentiotjobconfiguration.html)
   */
  public interface DeploymentIoTJobConfigurationProperty {
    /**
     * The stop configuration for the job.
     *
     * This configuration defines when and how to stop a job rollout.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentiotjobconfiguration.html#cfn-greengrassv2-deployment-deploymentiotjobconfiguration-abortconfig)
     */
    public fun abortConfig(): Any? = unwrap(this).getAbortConfig()

    /**
     * The rollout configuration for the job.
     *
     * This configuration defines the rate at which the job rolls out to the fleet of target
     * devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentiotjobconfiguration.html#cfn-greengrassv2-deployment-deploymentiotjobconfiguration-jobexecutionsrolloutconfig)
     */
    public fun jobExecutionsRolloutConfig(): Any? = unwrap(this).getJobExecutionsRolloutConfig()

    /**
     * The timeout configuration for the job.
     *
     * This configuration defines the amount of time each device has to complete the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentiotjobconfiguration.html#cfn-greengrassv2-deployment-deploymentiotjobconfiguration-timeoutconfig)
     */
    public fun timeoutConfig(): Any? = unwrap(this).getTimeoutConfig()

    /**
     * A builder for [DeploymentIoTJobConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param abortConfig The stop configuration for the job.
       * This configuration defines when and how to stop a job rollout.
       */
      public fun abortConfig(abortConfig: IResolvable)

      /**
       * @param abortConfig The stop configuration for the job.
       * This configuration defines when and how to stop a job rollout.
       */
      public fun abortConfig(abortConfig: IoTJobAbortConfigProperty)

      /**
       * @param abortConfig The stop configuration for the job.
       * This configuration defines when and how to stop a job rollout.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d858e42f8f3f4ef01f1431c7d10deefde49f8ac38da46d650259358da27a86e")
      public fun abortConfig(abortConfig: IoTJobAbortConfigProperty.Builder.() -> Unit)

      /**
       * @param jobExecutionsRolloutConfig The rollout configuration for the job.
       * This configuration defines the rate at which the job rolls out to the fleet of target
       * devices.
       */
      public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IResolvable)

      /**
       * @param jobExecutionsRolloutConfig The rollout configuration for the job.
       * This configuration defines the rate at which the job rolls out to the fleet of target
       * devices.
       */
      public
          fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IoTJobExecutionsRolloutConfigProperty)

      /**
       * @param jobExecutionsRolloutConfig The rollout configuration for the job.
       * This configuration defines the rate at which the job rolls out to the fleet of target
       * devices.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ce12a5b66c90be2970b4d2ff92e31b15057ab75bc218b87232f484795e2b796")
      public
          fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IoTJobExecutionsRolloutConfigProperty.Builder.() -> Unit)

      /**
       * @param timeoutConfig The timeout configuration for the job.
       * This configuration defines the amount of time each device has to complete the job.
       */
      public fun timeoutConfig(timeoutConfig: IResolvable)

      /**
       * @param timeoutConfig The timeout configuration for the job.
       * This configuration defines the amount of time each device has to complete the job.
       */
      public fun timeoutConfig(timeoutConfig: IoTJobTimeoutConfigProperty)

      /**
       * @param timeoutConfig The timeout configuration for the job.
       * This configuration defines the amount of time each device has to complete the job.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bbff9c41ac0d600277c1581de9bef91b834f376dabcf95949d9426d71cd1527")
      public fun timeoutConfig(timeoutConfig: IoTJobTimeoutConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty.builder()

      /**
       * @param abortConfig The stop configuration for the job.
       * This configuration defines when and how to stop a job rollout.
       */
      override fun abortConfig(abortConfig: IResolvable) {
        cdkBuilder.abortConfig(abortConfig.let(IResolvable::unwrap))
      }

      /**
       * @param abortConfig The stop configuration for the job.
       * This configuration defines when and how to stop a job rollout.
       */
      override fun abortConfig(abortConfig: IoTJobAbortConfigProperty) {
        cdkBuilder.abortConfig(abortConfig.let(IoTJobAbortConfigProperty::unwrap))
      }

      /**
       * @param abortConfig The stop configuration for the job.
       * This configuration defines when and how to stop a job rollout.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d858e42f8f3f4ef01f1431c7d10deefde49f8ac38da46d650259358da27a86e")
      override fun abortConfig(abortConfig: IoTJobAbortConfigProperty.Builder.() -> Unit): Unit =
          abortConfig(IoTJobAbortConfigProperty(abortConfig))

      /**
       * @param jobExecutionsRolloutConfig The rollout configuration for the job.
       * This configuration defines the rate at which the job rolls out to the fleet of target
       * devices.
       */
      override fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IResolvable) {
        cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig.let(IResolvable::unwrap))
      }

      /**
       * @param jobExecutionsRolloutConfig The rollout configuration for the job.
       * This configuration defines the rate at which the job rolls out to the fleet of target
       * devices.
       */
      override
          fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IoTJobExecutionsRolloutConfigProperty) {
        cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig.let(IoTJobExecutionsRolloutConfigProperty::unwrap))
      }

      /**
       * @param jobExecutionsRolloutConfig The rollout configuration for the job.
       * This configuration defines the rate at which the job rolls out to the fleet of target
       * devices.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ce12a5b66c90be2970b4d2ff92e31b15057ab75bc218b87232f484795e2b796")
      override
          fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IoTJobExecutionsRolloutConfigProperty.Builder.() -> Unit):
          Unit =
          jobExecutionsRolloutConfig(IoTJobExecutionsRolloutConfigProperty(jobExecutionsRolloutConfig))

      /**
       * @param timeoutConfig The timeout configuration for the job.
       * This configuration defines the amount of time each device has to complete the job.
       */
      override fun timeoutConfig(timeoutConfig: IResolvable) {
        cdkBuilder.timeoutConfig(timeoutConfig.let(IResolvable::unwrap))
      }

      /**
       * @param timeoutConfig The timeout configuration for the job.
       * This configuration defines the amount of time each device has to complete the job.
       */
      override fun timeoutConfig(timeoutConfig: IoTJobTimeoutConfigProperty) {
        cdkBuilder.timeoutConfig(timeoutConfig.let(IoTJobTimeoutConfigProperty::unwrap))
      }

      /**
       * @param timeoutConfig The timeout configuration for the job.
       * This configuration defines the amount of time each device has to complete the job.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bbff9c41ac0d600277c1581de9bef91b834f376dabcf95949d9426d71cd1527")
      override fun timeoutConfig(timeoutConfig: IoTJobTimeoutConfigProperty.Builder.() -> Unit):
          Unit = timeoutConfig(IoTJobTimeoutConfigProperty(timeoutConfig))

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty,
    ) : CdkObject(cdkObject), DeploymentIoTJobConfigurationProperty {
      /**
       * The stop configuration for the job.
       *
       * This configuration defines when and how to stop a job rollout.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentiotjobconfiguration.html#cfn-greengrassv2-deployment-deploymentiotjobconfiguration-abortconfig)
       */
      override fun abortConfig(): Any? = unwrap(this).getAbortConfig()

      /**
       * The rollout configuration for the job.
       *
       * This configuration defines the rate at which the job rolls out to the fleet of target
       * devices.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentiotjobconfiguration.html#cfn-greengrassv2-deployment-deploymentiotjobconfiguration-jobexecutionsrolloutconfig)
       */
      override fun jobExecutionsRolloutConfig(): Any? = unwrap(this).getJobExecutionsRolloutConfig()

      /**
       * The timeout configuration for the job.
       *
       * This configuration defines the amount of time each device has to complete the job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentiotjobconfiguration.html#cfn-greengrassv2-deployment-deploymentiotjobconfiguration-timeoutconfig)
       */
      override fun timeoutConfig(): Any? = unwrap(this).getTimeoutConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DeploymentIoTJobConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty):
          DeploymentIoTJobConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentIoTJobConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentIoTJobConfigurationProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentIoTJobConfigurationProperty
    }
  }

  /**
   * Contains information about policies that define how a deployment updates components and handles
   * failure.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * DeploymentPoliciesProperty deploymentPoliciesProperty = DeploymentPoliciesProperty.builder()
   * .componentUpdatePolicy(DeploymentComponentUpdatePolicyProperty.builder()
   * .action("action")
   * .timeoutInSeconds(123)
   * .build())
   * .configurationValidationPolicy(DeploymentConfigurationValidationPolicyProperty.builder()
   * .timeoutInSeconds(123)
   * .build())
   * .failureHandlingPolicy("failureHandlingPolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentpolicies.html)
   */
  public interface DeploymentPoliciesProperty {
    /**
     * The component update policy for the configuration deployment.
     *
     * This policy defines when it's safe to deploy the configuration to devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentpolicies.html#cfn-greengrassv2-deployment-deploymentpolicies-componentupdatepolicy)
     */
    public fun componentUpdatePolicy(): Any? = unwrap(this).getComponentUpdatePolicy()

    /**
     * The configuration validation policy for the configuration deployment.
     *
     * This policy defines how long each component has to validate its configure updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentpolicies.html#cfn-greengrassv2-deployment-deploymentpolicies-configurationvalidationpolicy)
     */
    public fun configurationValidationPolicy(): Any? =
        unwrap(this).getConfigurationValidationPolicy()

    /**
     * The failure handling policy for the configuration deployment. This policy defines what to do
     * if the deployment fails.
     *
     * Default: `ROLLBACK`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentpolicies.html#cfn-greengrassv2-deployment-deploymentpolicies-failurehandlingpolicy)
     */
    public fun failureHandlingPolicy(): String? = unwrap(this).getFailureHandlingPolicy()

    /**
     * A builder for [DeploymentPoliciesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentUpdatePolicy The component update policy for the configuration deployment.
       * This policy defines when it's safe to deploy the configuration to devices.
       */
      public fun componentUpdatePolicy(componentUpdatePolicy: IResolvable)

      /**
       * @param componentUpdatePolicy The component update policy for the configuration deployment.
       * This policy defines when it's safe to deploy the configuration to devices.
       */
      public
          fun componentUpdatePolicy(componentUpdatePolicy: DeploymentComponentUpdatePolicyProperty)

      /**
       * @param componentUpdatePolicy The component update policy for the configuration deployment.
       * This policy defines when it's safe to deploy the configuration to devices.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd23378d3da5e5acd7651bf7bf4ea97194d457df8dfe715430fb85addc9a463e")
      public
          fun componentUpdatePolicy(componentUpdatePolicy: DeploymentComponentUpdatePolicyProperty.Builder.() -> Unit)

      /**
       * @param configurationValidationPolicy The configuration validation policy for the
       * configuration deployment.
       * This policy defines how long each component has to validate its configure updates.
       */
      public fun configurationValidationPolicy(configurationValidationPolicy: IResolvable)

      /**
       * @param configurationValidationPolicy The configuration validation policy for the
       * configuration deployment.
       * This policy defines how long each component has to validate its configure updates.
       */
      public
          fun configurationValidationPolicy(configurationValidationPolicy: DeploymentConfigurationValidationPolicyProperty)

      /**
       * @param configurationValidationPolicy The configuration validation policy for the
       * configuration deployment.
       * This policy defines how long each component has to validate its configure updates.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17f4cf5091503aa7e9264b7b3909fd1087ec714ea6e3e7ffea9a49a6d6e15f0b")
      public
          fun configurationValidationPolicy(configurationValidationPolicy: DeploymentConfigurationValidationPolicyProperty.Builder.() -> Unit)

      /**
       * @param failureHandlingPolicy The failure handling policy for the configuration deployment.
       * This policy defines what to do if the deployment fails.
       * Default: `ROLLBACK`
       */
      public fun failureHandlingPolicy(failureHandlingPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty.builder()

      /**
       * @param componentUpdatePolicy The component update policy for the configuration deployment.
       * This policy defines when it's safe to deploy the configuration to devices.
       */
      override fun componentUpdatePolicy(componentUpdatePolicy: IResolvable) {
        cdkBuilder.componentUpdatePolicy(componentUpdatePolicy.let(IResolvable::unwrap))
      }

      /**
       * @param componentUpdatePolicy The component update policy for the configuration deployment.
       * This policy defines when it's safe to deploy the configuration to devices.
       */
      override
          fun componentUpdatePolicy(componentUpdatePolicy: DeploymentComponentUpdatePolicyProperty) {
        cdkBuilder.componentUpdatePolicy(componentUpdatePolicy.let(DeploymentComponentUpdatePolicyProperty::unwrap))
      }

      /**
       * @param componentUpdatePolicy The component update policy for the configuration deployment.
       * This policy defines when it's safe to deploy the configuration to devices.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd23378d3da5e5acd7651bf7bf4ea97194d457df8dfe715430fb85addc9a463e")
      override
          fun componentUpdatePolicy(componentUpdatePolicy: DeploymentComponentUpdatePolicyProperty.Builder.() -> Unit):
          Unit =
          componentUpdatePolicy(DeploymentComponentUpdatePolicyProperty(componentUpdatePolicy))

      /**
       * @param configurationValidationPolicy The configuration validation policy for the
       * configuration deployment.
       * This policy defines how long each component has to validate its configure updates.
       */
      override fun configurationValidationPolicy(configurationValidationPolicy: IResolvable) {
        cdkBuilder.configurationValidationPolicy(configurationValidationPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param configurationValidationPolicy The configuration validation policy for the
       * configuration deployment.
       * This policy defines how long each component has to validate its configure updates.
       */
      override
          fun configurationValidationPolicy(configurationValidationPolicy: DeploymentConfigurationValidationPolicyProperty) {
        cdkBuilder.configurationValidationPolicy(configurationValidationPolicy.let(DeploymentConfigurationValidationPolicyProperty::unwrap))
      }

      /**
       * @param configurationValidationPolicy The configuration validation policy for the
       * configuration deployment.
       * This policy defines how long each component has to validate its configure updates.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17f4cf5091503aa7e9264b7b3909fd1087ec714ea6e3e7ffea9a49a6d6e15f0b")
      override
          fun configurationValidationPolicy(configurationValidationPolicy: DeploymentConfigurationValidationPolicyProperty.Builder.() -> Unit):
          Unit =
          configurationValidationPolicy(DeploymentConfigurationValidationPolicyProperty(configurationValidationPolicy))

      /**
       * @param failureHandlingPolicy The failure handling policy for the configuration deployment.
       * This policy defines what to do if the deployment fails.
       * Default: `ROLLBACK`
       */
      override fun failureHandlingPolicy(failureHandlingPolicy: String) {
        cdkBuilder.failureHandlingPolicy(failureHandlingPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty,
    ) : CdkObject(cdkObject), DeploymentPoliciesProperty {
      /**
       * The component update policy for the configuration deployment.
       *
       * This policy defines when it's safe to deploy the configuration to devices.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentpolicies.html#cfn-greengrassv2-deployment-deploymentpolicies-componentupdatepolicy)
       */
      override fun componentUpdatePolicy(): Any? = unwrap(this).getComponentUpdatePolicy()

      /**
       * The configuration validation policy for the configuration deployment.
       *
       * This policy defines how long each component has to validate its configure updates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentpolicies.html#cfn-greengrassv2-deployment-deploymentpolicies-configurationvalidationpolicy)
       */
      override fun configurationValidationPolicy(): Any? =
          unwrap(this).getConfigurationValidationPolicy()

      /**
       * The failure handling policy for the configuration deployment. This policy defines what to
       * do if the deployment fails.
       *
       * Default: `ROLLBACK`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentpolicies.html#cfn-greengrassv2-deployment-deploymentpolicies-failurehandlingpolicy)
       */
      override fun failureHandlingPolicy(): String? = unwrap(this).getFailureHandlingPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentPoliciesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty):
          DeploymentPoliciesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentPoliciesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentPoliciesProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.DeploymentPoliciesProperty
    }
  }

  /**
   * Contains a list of criteria that define when and how to cancel a configuration deployment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * IoTJobAbortConfigProperty ioTJobAbortConfigProperty = IoTJobAbortConfigProperty.builder()
   * .criteriaList(List.of(IoTJobAbortCriteriaProperty.builder()
   * .action("action")
   * .failureType("failureType")
   * .minNumberOfExecutedThings(123)
   * .thresholdPercentage(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortconfig.html)
   */
  public interface IoTJobAbortConfigProperty {
    /**
     * The list of criteria that define when and how to cancel the configuration deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortconfig.html#cfn-greengrassv2-deployment-iotjobabortconfig-criterialist)
     */
    public fun criteriaList(): Any

    /**
     * A builder for [IoTJobAbortConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param criteriaList The list of criteria that define when and how to cancel the
       * configuration deployment. 
       */
      public fun criteriaList(criteriaList: IResolvable)

      /**
       * @param criteriaList The list of criteria that define when and how to cancel the
       * configuration deployment. 
       */
      public fun criteriaList(criteriaList: List<Any>)

      /**
       * @param criteriaList The list of criteria that define when and how to cancel the
       * configuration deployment. 
       */
      public fun criteriaList(vararg criteriaList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty.builder()

      /**
       * @param criteriaList The list of criteria that define when and how to cancel the
       * configuration deployment. 
       */
      override fun criteriaList(criteriaList: IResolvable) {
        cdkBuilder.criteriaList(criteriaList.let(IResolvable::unwrap))
      }

      /**
       * @param criteriaList The list of criteria that define when and how to cancel the
       * configuration deployment. 
       */
      override fun criteriaList(criteriaList: List<Any>) {
        cdkBuilder.criteriaList(criteriaList.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param criteriaList The list of criteria that define when and how to cancel the
       * configuration deployment. 
       */
      override fun criteriaList(vararg criteriaList: Any): Unit =
          criteriaList(criteriaList.toList())

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty,
    ) : CdkObject(cdkObject), IoTJobAbortConfigProperty {
      /**
       * The list of criteria that define when and how to cancel the configuration deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortconfig.html#cfn-greengrassv2-deployment-iotjobabortconfig-criterialist)
       */
      override fun criteriaList(): Any = unwrap(this).getCriteriaList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IoTJobAbortConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty):
          IoTJobAbortConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IoTJobAbortConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTJobAbortConfigProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortConfigProperty
    }
  }

  /**
   * Contains criteria that define when and how to cancel a job.
   *
   * The deployment stops if the following conditions are true:
   *
   * * The number of things that receive the deployment exceeds the `minNumberOfExecutedThings` .
   * * The percentage of failures with type `failureType` exceeds the `thresholdPercentage` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * IoTJobAbortCriteriaProperty ioTJobAbortCriteriaProperty = IoTJobAbortCriteriaProperty.builder()
   * .action("action")
   * .failureType("failureType")
   * .minNumberOfExecutedThings(123)
   * .thresholdPercentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortcriteria.html)
   */
  public interface IoTJobAbortCriteriaProperty {
    /**
     * The action to perform when the criteria are met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortcriteria.html#cfn-greengrassv2-deployment-iotjobabortcriteria-action)
     */
    public fun action(): String

    /**
     * The type of job deployment failure that can cancel a job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortcriteria.html#cfn-greengrassv2-deployment-iotjobabortcriteria-failuretype)
     */
    public fun failureType(): String

    /**
     * The minimum number of things that receive the configuration before the job can cancel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortcriteria.html#cfn-greengrassv2-deployment-iotjobabortcriteria-minnumberofexecutedthings)
     */
    public fun minNumberOfExecutedThings(): Number

    /**
     * The minimum percentage of `failureType` failures that occur before the job can cancel.
     *
     * This parameter supports up to two digits after the decimal (for example, you can specify
     * `10.9` or `10.99` , but not `10.999` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortcriteria.html#cfn-greengrassv2-deployment-iotjobabortcriteria-thresholdpercentage)
     */
    public fun thresholdPercentage(): Number

    /**
     * A builder for [IoTJobAbortCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action to perform when the criteria are met. 
       */
      public fun action(action: String)

      /**
       * @param failureType The type of job deployment failure that can cancel a job. 
       */
      public fun failureType(failureType: String)

      /**
       * @param minNumberOfExecutedThings The minimum number of things that receive the
       * configuration before the job can cancel. 
       */
      public fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number)

      /**
       * @param thresholdPercentage The minimum percentage of `failureType` failures that occur
       * before the job can cancel. 
       * This parameter supports up to two digits after the decimal (for example, you can specify
       * `10.9` or `10.99` , but not `10.999` ).
       */
      public fun thresholdPercentage(thresholdPercentage: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty.builder()

      /**
       * @param action The action to perform when the criteria are met. 
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param failureType The type of job deployment failure that can cancel a job. 
       */
      override fun failureType(failureType: String) {
        cdkBuilder.failureType(failureType)
      }

      /**
       * @param minNumberOfExecutedThings The minimum number of things that receive the
       * configuration before the job can cancel. 
       */
      override fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number) {
        cdkBuilder.minNumberOfExecutedThings(minNumberOfExecutedThings)
      }

      /**
       * @param thresholdPercentage The minimum percentage of `failureType` failures that occur
       * before the job can cancel. 
       * This parameter supports up to two digits after the decimal (for example, you can specify
       * `10.9` or `10.99` , but not `10.999` ).
       */
      override fun thresholdPercentage(thresholdPercentage: Number) {
        cdkBuilder.thresholdPercentage(thresholdPercentage)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty,
    ) : CdkObject(cdkObject), IoTJobAbortCriteriaProperty {
      /**
       * The action to perform when the criteria are met.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortcriteria.html#cfn-greengrassv2-deployment-iotjobabortcriteria-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * The type of job deployment failure that can cancel a job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortcriteria.html#cfn-greengrassv2-deployment-iotjobabortcriteria-failuretype)
       */
      override fun failureType(): String = unwrap(this).getFailureType()

      /**
       * The minimum number of things that receive the configuration before the job can cancel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortcriteria.html#cfn-greengrassv2-deployment-iotjobabortcriteria-minnumberofexecutedthings)
       */
      override fun minNumberOfExecutedThings(): Number = unwrap(this).getMinNumberOfExecutedThings()

      /**
       * The minimum percentage of `failureType` failures that occur before the job can cancel.
       *
       * This parameter supports up to two digits after the decimal (for example, you can specify
       * `10.9` or `10.99` , but not `10.999` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobabortcriteria.html#cfn-greengrassv2-deployment-iotjobabortcriteria-thresholdpercentage)
       */
      override fun thresholdPercentage(): Number = unwrap(this).getThresholdPercentage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IoTJobAbortCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty):
          IoTJobAbortCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IoTJobAbortCriteriaProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTJobAbortCriteriaProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobAbortCriteriaProperty
    }
  }

  /**
   * Contains information about the rollout configuration for a job.
   *
   * This configuration defines the rate at which the job deploys a configuration to a fleet of
   * target devices.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * Object rateIncreaseCriteria;
   * IoTJobExecutionsRolloutConfigProperty ioTJobExecutionsRolloutConfigProperty =
   * IoTJobExecutionsRolloutConfigProperty.builder()
   * .exponentialRate(IoTJobExponentialRolloutRateProperty.builder()
   * .baseRatePerMinute(123)
   * .incrementFactor(123)
   * .rateIncreaseCriteria(rateIncreaseCriteria)
   * .build())
   * .maximumPerMinute(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexecutionsrolloutconfig.html)
   */
  public interface IoTJobExecutionsRolloutConfigProperty {
    /**
     * The exponential rate to increase the job rollout rate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexecutionsrolloutconfig.html#cfn-greengrassv2-deployment-iotjobexecutionsrolloutconfig-exponentialrate)
     */
    public fun exponentialRate(): Any? = unwrap(this).getExponentialRate()

    /**
     * The maximum number of devices that receive a pending job notification, per minute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexecutionsrolloutconfig.html#cfn-greengrassv2-deployment-iotjobexecutionsrolloutconfig-maximumperminute)
     */
    public fun maximumPerMinute(): Number? = unwrap(this).getMaximumPerMinute()

    /**
     * A builder for [IoTJobExecutionsRolloutConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exponentialRate The exponential rate to increase the job rollout rate.
       */
      public fun exponentialRate(exponentialRate: IResolvable)

      /**
       * @param exponentialRate The exponential rate to increase the job rollout rate.
       */
      public fun exponentialRate(exponentialRate: IoTJobExponentialRolloutRateProperty)

      /**
       * @param exponentialRate The exponential rate to increase the job rollout rate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9352d70c9c76997bcbd392503dd83aa2ecde1cd0de73073eddaab53ba524c5dd")
      public
          fun exponentialRate(exponentialRate: IoTJobExponentialRolloutRateProperty.Builder.() -> Unit)

      /**
       * @param maximumPerMinute The maximum number of devices that receive a pending job
       * notification, per minute.
       */
      public fun maximumPerMinute(maximumPerMinute: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty.builder()

      /**
       * @param exponentialRate The exponential rate to increase the job rollout rate.
       */
      override fun exponentialRate(exponentialRate: IResolvable) {
        cdkBuilder.exponentialRate(exponentialRate.let(IResolvable::unwrap))
      }

      /**
       * @param exponentialRate The exponential rate to increase the job rollout rate.
       */
      override fun exponentialRate(exponentialRate: IoTJobExponentialRolloutRateProperty) {
        cdkBuilder.exponentialRate(exponentialRate.let(IoTJobExponentialRolloutRateProperty::unwrap))
      }

      /**
       * @param exponentialRate The exponential rate to increase the job rollout rate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9352d70c9c76997bcbd392503dd83aa2ecde1cd0de73073eddaab53ba524c5dd")
      override
          fun exponentialRate(exponentialRate: IoTJobExponentialRolloutRateProperty.Builder.() -> Unit):
          Unit = exponentialRate(IoTJobExponentialRolloutRateProperty(exponentialRate))

      /**
       * @param maximumPerMinute The maximum number of devices that receive a pending job
       * notification, per minute.
       */
      override fun maximumPerMinute(maximumPerMinute: Number) {
        cdkBuilder.maximumPerMinute(maximumPerMinute)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty,
    ) : CdkObject(cdkObject), IoTJobExecutionsRolloutConfigProperty {
      /**
       * The exponential rate to increase the job rollout rate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexecutionsrolloutconfig.html#cfn-greengrassv2-deployment-iotjobexecutionsrolloutconfig-exponentialrate)
       */
      override fun exponentialRate(): Any? = unwrap(this).getExponentialRate()

      /**
       * The maximum number of devices that receive a pending job notification, per minute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexecutionsrolloutconfig.html#cfn-greengrassv2-deployment-iotjobexecutionsrolloutconfig-maximumperminute)
       */
      override fun maximumPerMinute(): Number? = unwrap(this).getMaximumPerMinute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IoTJobExecutionsRolloutConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty):
          IoTJobExecutionsRolloutConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IoTJobExecutionsRolloutConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTJobExecutionsRolloutConfigProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExecutionsRolloutConfigProperty
    }
  }

  /**
   * Contains information about an exponential rollout rate for a configuration deployment job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * Object rateIncreaseCriteria;
   * IoTJobExponentialRolloutRateProperty ioTJobExponentialRolloutRateProperty =
   * IoTJobExponentialRolloutRateProperty.builder()
   * .baseRatePerMinute(123)
   * .incrementFactor(123)
   * .rateIncreaseCriteria(rateIncreaseCriteria)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexponentialrolloutrate.html)
   */
  public interface IoTJobExponentialRolloutRateProperty {
    /**
     * The minimum number of devices that receive a pending job notification, per minute, when the
     * job starts.
     *
     * This parameter defines the initial rollout rate of the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexponentialrolloutrate.html#cfn-greengrassv2-deployment-iotjobexponentialrolloutrate-baserateperminute)
     */
    public fun baseRatePerMinute(): Number

    /**
     * The exponential factor to increase the rollout rate for the job.
     *
     * This parameter supports up to one digit after the decimal (for example, you can specify `1.5`
     * , but not `1.55` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexponentialrolloutrate.html#cfn-greengrassv2-deployment-iotjobexponentialrolloutrate-incrementfactor)
     */
    public fun incrementFactor(): Number

    /**
     * The criteria to increase the rollout rate for the job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexponentialrolloutrate.html#cfn-greengrassv2-deployment-iotjobexponentialrolloutrate-rateincreasecriteria)
     */
    public fun rateIncreaseCriteria(): Any

    /**
     * A builder for [IoTJobExponentialRolloutRateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseRatePerMinute The minimum number of devices that receive a pending job
       * notification, per minute, when the job starts. 
       * This parameter defines the initial rollout rate of the job.
       */
      public fun baseRatePerMinute(baseRatePerMinute: Number)

      /**
       * @param incrementFactor The exponential factor to increase the rollout rate for the job. 
       * This parameter supports up to one digit after the decimal (for example, you can specify
       * `1.5` , but not `1.55` ).
       */
      public fun incrementFactor(incrementFactor: Number)

      /**
       * @param rateIncreaseCriteria The criteria to increase the rollout rate for the job. 
       */
      public fun rateIncreaseCriteria(rateIncreaseCriteria: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty.builder()

      /**
       * @param baseRatePerMinute The minimum number of devices that receive a pending job
       * notification, per minute, when the job starts. 
       * This parameter defines the initial rollout rate of the job.
       */
      override fun baseRatePerMinute(baseRatePerMinute: Number) {
        cdkBuilder.baseRatePerMinute(baseRatePerMinute)
      }

      /**
       * @param incrementFactor The exponential factor to increase the rollout rate for the job. 
       * This parameter supports up to one digit after the decimal (for example, you can specify
       * `1.5` , but not `1.55` ).
       */
      override fun incrementFactor(incrementFactor: Number) {
        cdkBuilder.incrementFactor(incrementFactor)
      }

      /**
       * @param rateIncreaseCriteria The criteria to increase the rollout rate for the job. 
       */
      override fun rateIncreaseCriteria(rateIncreaseCriteria: Any) {
        cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty,
    ) : CdkObject(cdkObject), IoTJobExponentialRolloutRateProperty {
      /**
       * The minimum number of devices that receive a pending job notification, per minute, when the
       * job starts.
       *
       * This parameter defines the initial rollout rate of the job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexponentialrolloutrate.html#cfn-greengrassv2-deployment-iotjobexponentialrolloutrate-baserateperminute)
       */
      override fun baseRatePerMinute(): Number = unwrap(this).getBaseRatePerMinute()

      /**
       * The exponential factor to increase the rollout rate for the job.
       *
       * This parameter supports up to one digit after the decimal (for example, you can specify
       * `1.5` , but not `1.55` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexponentialrolloutrate.html#cfn-greengrassv2-deployment-iotjobexponentialrolloutrate-incrementfactor)
       */
      override fun incrementFactor(): Number = unwrap(this).getIncrementFactor()

      /**
       * The criteria to increase the rollout rate for the job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobexponentialrolloutrate.html#cfn-greengrassv2-deployment-iotjobexponentialrolloutrate-rateincreasecriteria)
       */
      override fun rateIncreaseCriteria(): Any = unwrap(this).getRateIncreaseCriteria()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IoTJobExponentialRolloutRateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty):
          IoTJobExponentialRolloutRateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IoTJobExponentialRolloutRateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTJobExponentialRolloutRateProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobExponentialRolloutRateProperty
    }
  }

  /**
   * Contains information about the timeout configuration for a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * IoTJobTimeoutConfigProperty ioTJobTimeoutConfigProperty = IoTJobTimeoutConfigProperty.builder()
   * .inProgressTimeoutInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobtimeoutconfig.html)
   */
  public interface IoTJobTimeoutConfigProperty {
    /**
     * The amount of time, in minutes, that devices have to complete the job.
     *
     * The timer starts when the job status is set to `IN_PROGRESS` . If the job status doesn't
     * change to a terminal state before the time expires, then the job status is set to `TIMED_OUT` .
     *
     * The timeout interval must be between 1 minute and 7 days (10080 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobtimeoutconfig.html#cfn-greengrassv2-deployment-iotjobtimeoutconfig-inprogresstimeoutinminutes)
     */
    public fun inProgressTimeoutInMinutes(): Number? = unwrap(this).getInProgressTimeoutInMinutes()

    /**
     * A builder for [IoTJobTimeoutConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inProgressTimeoutInMinutes The amount of time, in minutes, that devices have to
       * complete the job.
       * The timer starts when the job status is set to `IN_PROGRESS` . If the job status doesn't
       * change to a terminal state before the time expires, then the job status is set to `TIMED_OUT`
       * .
       *
       * The timeout interval must be between 1 minute and 7 days (10080 minutes).
       */
      public fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty.builder()

      /**
       * @param inProgressTimeoutInMinutes The amount of time, in minutes, that devices have to
       * complete the job.
       * The timer starts when the job status is set to `IN_PROGRESS` . If the job status doesn't
       * change to a terminal state before the time expires, then the job status is set to `TIMED_OUT`
       * .
       *
       * The timeout interval must be between 1 minute and 7 days (10080 minutes).
       */
      override fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number) {
        cdkBuilder.inProgressTimeoutInMinutes(inProgressTimeoutInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty,
    ) : CdkObject(cdkObject), IoTJobTimeoutConfigProperty {
      /**
       * The amount of time, in minutes, that devices have to complete the job.
       *
       * The timer starts when the job status is set to `IN_PROGRESS` . If the job status doesn't
       * change to a terminal state before the time expires, then the job status is set to `TIMED_OUT`
       * .
       *
       * The timeout interval must be between 1 minute and 7 days (10080 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-iotjobtimeoutconfig.html#cfn-greengrassv2-deployment-iotjobtimeoutconfig-inprogresstimeoutinminutes)
       */
      override fun inProgressTimeoutInMinutes(): Number? =
          unwrap(this).getInProgressTimeoutInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IoTJobTimeoutConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty):
          IoTJobTimeoutConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IoTJobTimeoutConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTJobTimeoutConfigProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.IoTJobTimeoutConfigProperty
    }
  }

  /**
   * Contains information about system resource limits that the  software applies to a component's
   * processes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
   * SystemResourceLimitsProperty systemResourceLimitsProperty =
   * SystemResourceLimitsProperty.builder()
   * .cpus(123)
   * .memory(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-systemresourcelimits.html)
   */
  public interface SystemResourceLimitsProperty {
    /**
     * The maximum amount of CPU time that a component's processes can use on the core device.
     *
     * A core device's total CPU time is equivalent to the device's number of CPU cores. For
     * example, on a core device with 4 CPU cores, you can set this value to 2 to limit the component's
     * processes to 50 percent usage of each CPU core. On a device with 1 CPU core, you can set this
     * value to 0.25 to limit the component's processes to 25 percent usage of the CPU. If you set this
     * value to a number greater than the number of CPU cores, the AWS IoT Greengrass Core software
     * doesn't limit the component's CPU usage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-systemresourcelimits.html#cfn-greengrassv2-deployment-systemresourcelimits-cpus)
     */
    public fun cpus(): Number? = unwrap(this).getCpus()

    /**
     * The maximum amount of RAM, expressed in kilobytes, that a component's processes can use on
     * the core device.
     *
     * For more information, see [Configure system resource limits for
     * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-systemresourcelimits.html#cfn-greengrassv2-deployment-systemresourcelimits-memory)
     */
    public fun memory(): Number? = unwrap(this).getMemory()

    /**
     * A builder for [SystemResourceLimitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpus The maximum amount of CPU time that a component's processes can use on the core
       * device.
       * A core device's total CPU time is equivalent to the device's number of CPU cores. For
       * example, on a core device with 4 CPU cores, you can set this value to 2 to limit the
       * component's processes to 50 percent usage of each CPU core. On a device with 1 CPU core, you
       * can set this value to 0.25 to limit the component's processes to 25 percent usage of the CPU.
       * If you set this value to a number greater than the number of CPU cores, the AWS IoT Greengrass
       * Core software doesn't limit the component's CPU usage.
       */
      public fun cpus(cpus: Number)

      /**
       * @param memory The maximum amount of RAM, expressed in kilobytes, that a component's
       * processes can use on the core device.
       * For more information, see [Configure system resource limits for
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
       * .
       */
      public fun memory(memory: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty.builder()

      /**
       * @param cpus The maximum amount of CPU time that a component's processes can use on the core
       * device.
       * A core device's total CPU time is equivalent to the device's number of CPU cores. For
       * example, on a core device with 4 CPU cores, you can set this value to 2 to limit the
       * component's processes to 50 percent usage of each CPU core. On a device with 1 CPU core, you
       * can set this value to 0.25 to limit the component's processes to 25 percent usage of the CPU.
       * If you set this value to a number greater than the number of CPU cores, the AWS IoT Greengrass
       * Core software doesn't limit the component's CPU usage.
       */
      override fun cpus(cpus: Number) {
        cdkBuilder.cpus(cpus)
      }

      /**
       * @param memory The maximum amount of RAM, expressed in kilobytes, that a component's
       * processes can use on the core device.
       * For more information, see [Configure system resource limits for
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
       * .
       */
      override fun memory(memory: Number) {
        cdkBuilder.memory(memory)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty,
    ) : CdkObject(cdkObject), SystemResourceLimitsProperty {
      /**
       * The maximum amount of CPU time that a component's processes can use on the core device.
       *
       * A core device's total CPU time is equivalent to the device's number of CPU cores. For
       * example, on a core device with 4 CPU cores, you can set this value to 2 to limit the
       * component's processes to 50 percent usage of each CPU core. On a device with 1 CPU core, you
       * can set this value to 0.25 to limit the component's processes to 25 percent usage of the CPU.
       * If you set this value to a number greater than the number of CPU cores, the AWS IoT Greengrass
       * Core software doesn't limit the component's CPU usage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-systemresourcelimits.html#cfn-greengrassv2-deployment-systemresourcelimits-cpus)
       */
      override fun cpus(): Number? = unwrap(this).getCpus()

      /**
       * The maximum amount of RAM, expressed in kilobytes, that a component's processes can use on
       * the core device.
       *
       * For more information, see [Configure system resource limits for
       * components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-systemresourcelimits.html#cfn-greengrassv2-deployment-systemresourcelimits-memory)
       */
      override fun memory(): Number? = unwrap(this).getMemory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SystemResourceLimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty):
          SystemResourceLimitsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SystemResourceLimitsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SystemResourceLimitsProperty):
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnDeployment.SystemResourceLimitsProperty
    }
  }
}

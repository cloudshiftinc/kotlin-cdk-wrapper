@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrassv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDeployment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrassv2.*;
 * Object rateIncreaseCriteria;
 * CfnDeploymentProps cfnDeploymentProps = CfnDeploymentProps.builder()
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
public interface CfnDeploymentProps {
  /**
   * The components to deploy.
   *
   * This is a dictionary, where each key is the name of a component, and each key's value is the
   * version and configuration to deploy for that component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-components)
   */
  public fun components(): Any? = unwrap(this).getComponents()

  /**
   * The name of the deployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentname)
   */
  public fun deploymentName(): String? = unwrap(this).getDeploymentName()

  /**
   * The deployment policies for the deployment.
   *
   * These policies define how the deployment updates components and handles failure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentpolicies)
   */
  public fun deploymentPolicies(): Any? = unwrap(this).getDeploymentPolicies()

  /**
   * The job configuration for the deployment configuration.
   *
   * The job configuration specifies the rollout, timeout, and stop configurations for the
   * deployment configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-iotjobconfiguration)
   */
  public fun iotJobConfiguration(): Any? = unwrap(this).getIotJobConfiguration()

  /**
   * The parent deployment's
   * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
   * subdeployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-parenttargetarn)
   */
  public fun parentTargetArn(): String? = unwrap(this).getParentTargetArn()

  /**
   * Application-specific metadata to attach to the deployment.
   *
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tag your AWS IoT Greengrass
   * Version 2 resources](https://docs.aws.amazon.com/greengrass/v2/developerguide/tag-resources.html)
   * in the *AWS IoT Greengrass V2 Developer Guide* .
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
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The ARN of the target AWS IoT thing or thing group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-targetarn)
   */
  public fun targetArn(): String

  /**
   * A builder for [CfnDeploymentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param components The components to deploy.
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     */
    public fun components(components: IResolvable)

    /**
     * @param components The components to deploy.
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     */
    public fun components(components: Map<String, Any>)

    /**
     * @param deploymentName The name of the deployment.
     */
    public fun deploymentName(deploymentName: String)

    /**
     * @param deploymentPolicies The deployment policies for the deployment.
     * These policies define how the deployment updates components and handles failure.
     */
    public fun deploymentPolicies(deploymentPolicies: IResolvable)

    /**
     * @param deploymentPolicies The deployment policies for the deployment.
     * These policies define how the deployment updates components and handles failure.
     */
    public fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty)

    /**
     * @param deploymentPolicies The deployment policies for the deployment.
     * These policies define how the deployment updates components and handles failure.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2969602c296659fd60db1407e77255f5f8635043c28de1d9abc8e8c593c8c1eb")
    public
        fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty.Builder.() -> Unit)

    /**
     * @param iotJobConfiguration The job configuration for the deployment configuration.
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     */
    public fun iotJobConfiguration(iotJobConfiguration: IResolvable)

    /**
     * @param iotJobConfiguration The job configuration for the deployment configuration.
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     */
    public
        fun iotJobConfiguration(iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty)

    /**
     * @param iotJobConfiguration The job configuration for the deployment configuration.
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7318a6268df3159d19417903291d4d0d880c94c524dd690ea603823570c3d544")
    public
        fun iotJobConfiguration(iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty.Builder.() -> Unit)

    /**
     * @param parentTargetArn The parent deployment's
     * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
     * subdeployment.
     */
    public fun parentTargetArn(parentTargetArn: String)

    /**
     * @param tags Application-specific metadata to attach to the deployment.
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
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param targetArn The ARN of the target AWS IoT thing or thing group. 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps.Builder
        = software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps.builder()

    /**
     * @param components The components to deploy.
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     */
    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param components The components to deploy.
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     */
    override fun components(components: Map<String, Any>) {
      cdkBuilder.components(components.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param deploymentName The name of the deployment.
     */
    override fun deploymentName(deploymentName: String) {
      cdkBuilder.deploymentName(deploymentName)
    }

    /**
     * @param deploymentPolicies The deployment policies for the deployment.
     * These policies define how the deployment updates components and handles failure.
     */
    override fun deploymentPolicies(deploymentPolicies: IResolvable) {
      cdkBuilder.deploymentPolicies(deploymentPolicies.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deploymentPolicies The deployment policies for the deployment.
     * These policies define how the deployment updates components and handles failure.
     */
    override fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty) {
      cdkBuilder.deploymentPolicies(deploymentPolicies.let(CfnDeployment.DeploymentPoliciesProperty.Companion::unwrap))
    }

    /**
     * @param deploymentPolicies The deployment policies for the deployment.
     * These policies define how the deployment updates components and handles failure.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2969602c296659fd60db1407e77255f5f8635043c28de1d9abc8e8c593c8c1eb")
    override
        fun deploymentPolicies(deploymentPolicies: CfnDeployment.DeploymentPoliciesProperty.Builder.() -> Unit):
        Unit = deploymentPolicies(CfnDeployment.DeploymentPoliciesProperty(deploymentPolicies))

    /**
     * @param iotJobConfiguration The job configuration for the deployment configuration.
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     */
    override fun iotJobConfiguration(iotJobConfiguration: IResolvable) {
      cdkBuilder.iotJobConfiguration(iotJobConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param iotJobConfiguration The job configuration for the deployment configuration.
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     */
    override
        fun iotJobConfiguration(iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty) {
      cdkBuilder.iotJobConfiguration(iotJobConfiguration.let(CfnDeployment.DeploymentIoTJobConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param iotJobConfiguration The job configuration for the deployment configuration.
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7318a6268df3159d19417903291d4d0d880c94c524dd690ea603823570c3d544")
    override
        fun iotJobConfiguration(iotJobConfiguration: CfnDeployment.DeploymentIoTJobConfigurationProperty.Builder.() -> Unit):
        Unit =
        iotJobConfiguration(CfnDeployment.DeploymentIoTJobConfigurationProperty(iotJobConfiguration))

    /**
     * @param parentTargetArn The parent deployment's
     * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
     * subdeployment.
     */
    override fun parentTargetArn(parentTargetArn: String) {
      cdkBuilder.parentTargetArn(parentTargetArn)
    }

    /**
     * @param tags Application-specific metadata to attach to the deployment.
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
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param targetArn The ARN of the target AWS IoT thing or thing group. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps,
  ) : CdkObject(cdkObject),
      CfnDeploymentProps {
    /**
     * The components to deploy.
     *
     * This is a dictionary, where each key is the name of a component, and each key's value is the
     * version and configuration to deploy for that component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-components)
     */
    override fun components(): Any? = unwrap(this).getComponents()

    /**
     * The name of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentname)
     */
    override fun deploymentName(): String? = unwrap(this).getDeploymentName()

    /**
     * The deployment policies for the deployment.
     *
     * These policies define how the deployment updates components and handles failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-deploymentpolicies)
     */
    override fun deploymentPolicies(): Any? = unwrap(this).getDeploymentPolicies()

    /**
     * The job configuration for the deployment configuration.
     *
     * The job configuration specifies the rollout, timeout, and stop configurations for the
     * deployment configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-iotjobconfiguration)
     */
    override fun iotJobConfiguration(): Any? = unwrap(this).getIotJobConfiguration()

    /**
     * The parent deployment's
     * [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) for a
     * subdeployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-parenttargetarn)
     */
    override fun parentTargetArn(): String? = unwrap(this).getParentTargetArn()

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
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The ARN of the target AWS IoT thing or thing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrassv2-deployment.html#cfn-greengrassv2-deployment-targetarn)
     */
    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps):
        CfnDeploymentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDeploymentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentProps):
        software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps
  }
}

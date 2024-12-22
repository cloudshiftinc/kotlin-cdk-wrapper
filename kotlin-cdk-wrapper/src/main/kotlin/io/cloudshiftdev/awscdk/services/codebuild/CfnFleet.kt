@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CodeBuild::Fleet` resource configures a compute fleet, a set of dedicated instances for
 * your build environment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * CfnFleet cfnFleet = CfnFleet.Builder.create(this, "MyCfnFleet")
 * .baseCapacity(123)
 * .computeConfiguration(ComputeConfigurationProperty.builder()
 * .disk(123)
 * .machineType("machineType")
 * .memory(123)
 * .vCpu(123)
 * .build())
 * .computeType("computeType")
 * .environmentType("environmentType")
 * .fleetProxyConfiguration(ProxyConfigurationProperty.builder()
 * .defaultBehavior("defaultBehavior")
 * .orderedProxyRules(List.of(FleetProxyRuleProperty.builder()
 * .effect("effect")
 * .entities(List.of("entities"))
 * .type("type")
 * .build()))
 * .build())
 * .fleetServiceRole("fleetServiceRole")
 * .fleetVpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .vpcId("vpcId")
 * .build())
 * .imageId("imageId")
 * .name("name")
 * .overflowBehavior("overflowBehavior")
 * .scalingConfiguration(ScalingConfigurationInputProperty.builder()
 * .maxCapacity(123)
 * .scalingType("scalingType")
 * .targetTrackingScalingConfigs(List.of(TargetTrackingScalingConfigurationProperty.builder()
 * .metricType("metricType")
 * .targetValue(123)
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html)
 */
public open class CfnFleet(
  cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.codebuild.CfnFleet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFleetProps,
  ) :
      this(software.amazon.awscdk.services.codebuild.CfnFleet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFleetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFleetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFleetProps(props)
  )

  /**
   * The ARN of the compute fleet.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds
   * that can run in parallel.
   */
  public open fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

  /**
   * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds
   * that can run in parallel.
   */
  public open fun baseCapacity(`value`: Number) {
    unwrap(this).setBaseCapacity(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The compute configuration of the compute fleet.
   */
  public open fun computeConfiguration(): Any? = unwrap(this).getComputeConfiguration()

  /**
   * The compute configuration of the compute fleet.
   */
  public open fun computeConfiguration(`value`: IResolvable) {
    unwrap(this).setComputeConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The compute configuration of the compute fleet.
   */
  public open fun computeConfiguration(`value`: ComputeConfigurationProperty) {
    unwrap(this).setComputeConfiguration(`value`.let(ComputeConfigurationProperty.Companion::unwrap))
  }

  /**
   * The compute configuration of the compute fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5bc3d7cf1d3331a9c8a1aa7e9b441f78b0906f7c7e75c4a3d7b23ce88c759d13")
  public open fun computeConfiguration(`value`: ComputeConfigurationProperty.Builder.() -> Unit):
      Unit = computeConfiguration(ComputeConfigurationProperty(`value`))

  /**
   * Information about the compute resources the compute fleet uses.
   *
   * Available values include:.
   */
  public open fun computeType(): String? = unwrap(this).getComputeType()

  /**
   * Information about the compute resources the compute fleet uses.
   *
   * Available values include:.
   */
  public open fun computeType(`value`: String) {
    unwrap(this).setComputeType(`value`)
  }

  /**
   * The environment type of the compute fleet.
   */
  public open fun environmentType(): String? = unwrap(this).getEnvironmentType()

  /**
   * The environment type of the compute fleet.
   */
  public open fun environmentType(`value`: String) {
    unwrap(this).setEnvironmentType(`value`)
  }

  /**
   * Information about the proxy configurations that apply network access control to your reserved
   * capacity instances.
   */
  public open fun fleetProxyConfiguration(): Any? = unwrap(this).getFleetProxyConfiguration()

  /**
   * Information about the proxy configurations that apply network access control to your reserved
   * capacity instances.
   */
  public open fun fleetProxyConfiguration(`value`: IResolvable) {
    unwrap(this).setFleetProxyConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about the proxy configurations that apply network access control to your reserved
   * capacity instances.
   */
  public open fun fleetProxyConfiguration(`value`: ProxyConfigurationProperty) {
    unwrap(this).setFleetProxyConfiguration(`value`.let(ProxyConfigurationProperty.Companion::unwrap))
  }

  /**
   * Information about the proxy configurations that apply network access control to your reserved
   * capacity instances.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9bc92f2222bba99709c21cf3d1316495d9b43881f6c09ce25af1344b5659b086")
  public open fun fleetProxyConfiguration(`value`: ProxyConfigurationProperty.Builder.() -> Unit):
      Unit = fleetProxyConfiguration(ProxyConfigurationProperty(`value`))

  /**
   * The service role associated with the compute fleet.
   */
  public open fun fleetServiceRole(): String? = unwrap(this).getFleetServiceRole()

  /**
   * The service role associated with the compute fleet.
   */
  public open fun fleetServiceRole(`value`: String) {
    unwrap(this).setFleetServiceRole(`value`)
  }

  /**
   * Information about the VPC configuration that AWS CodeBuild accesses.
   */
  public open fun fleetVpcConfig(): Any? = unwrap(this).getFleetVpcConfig()

  /**
   * Information about the VPC configuration that AWS CodeBuild accesses.
   */
  public open fun fleetVpcConfig(`value`: IResolvable) {
    unwrap(this).setFleetVpcConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about the VPC configuration that AWS CodeBuild accesses.
   */
  public open fun fleetVpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setFleetVpcConfig(`value`.let(VpcConfigProperty.Companion::unwrap))
  }

  /**
   * Information about the VPC configuration that AWS CodeBuild accesses.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ae880fbe2c1ab8b417e5fafe263789c3105b4e087fa381af6efbae306dd1cbe")
  public open fun fleetVpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      fleetVpcConfig(VpcConfigProperty(`value`))

  /**
   * The Amazon Machine Image (AMI) of the compute fleet.
   */
  public open fun imageId(): String? = unwrap(this).getImageId()

  /**
   * The Amazon Machine Image (AMI) of the compute fleet.
   */
  public open fun imageId(`value`: String) {
    unwrap(this).setImageId(`value`)
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
   * The name of the compute fleet.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the compute fleet.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The compute fleet overflow behavior.
   */
  public open fun overflowBehavior(): String? = unwrap(this).getOverflowBehavior()

  /**
   * The compute fleet overflow behavior.
   */
  public open fun overflowBehavior(`value`: String) {
    unwrap(this).setOverflowBehavior(`value`)
  }

  /**
   * The scaling configuration of the compute fleet.
   */
  public open fun scalingConfiguration(): Any? = unwrap(this).getScalingConfiguration()

  /**
   * The scaling configuration of the compute fleet.
   */
  public open fun scalingConfiguration(`value`: IResolvable) {
    unwrap(this).setScalingConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The scaling configuration of the compute fleet.
   */
  public open fun scalingConfiguration(`value`: ScalingConfigurationInputProperty) {
    unwrap(this).setScalingConfiguration(`value`.let(ScalingConfigurationInputProperty.Companion::unwrap))
  }

  /**
   * The scaling configuration of the compute fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa6942666d42992917d9bc2b1ac49d78c6414079a640569124ada6dbd56df027")
  public open
      fun scalingConfiguration(`value`: ScalingConfigurationInputProperty.Builder.() -> Unit): Unit
      = scalingConfiguration(ScalingConfigurationInputProperty(`value`))

  /**
   * A list of tag key and value pairs associated with this compute fleet.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tag key and value pairs associated with this compute fleet.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tag key and value pairs associated with this compute fleet.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.CfnFleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of
     * builds that can run in parallel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-basecapacity)
     * @param baseCapacity The initial number of machines allocated to the compute ﬂeet, which
     * deﬁnes the number of builds that can run in parallel. 
     */
    public fun baseCapacity(baseCapacity: Number)

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computeconfiguration)
     * @param computeConfiguration The compute configuration of the compute fleet. 
     */
    public fun computeConfiguration(computeConfiguration: IResolvable)

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computeconfiguration)
     * @param computeConfiguration The compute configuration of the compute fleet. 
     */
    public fun computeConfiguration(computeConfiguration: ComputeConfigurationProperty)

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computeconfiguration)
     * @param computeConfiguration The compute configuration of the compute fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f22f53c3a5666dfcbba65c1605efd18e2a5216e46148795f829059ed870e379")
    public
        fun computeConfiguration(computeConfiguration: ComputeConfigurationProperty.Builder.() -> Unit)

    /**
     * Information about the compute resources the compute fleet uses. Available values include:.
     *
     * * `ATTRIBUTE_BASED_COMPUTE` : Specify the amount of vCPUs, memory, disk space, and the type
     * of machine.
     *
     *
     * If you use `ATTRIBUTE_BASED_COMPUTE` , you must define your attributes by using
     * `computeConfiguration` . AWS CodeBuild will select the cheapest instance that satisfies your
     * specified attributes. For more information, see [Reserved capacity environment
     * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html#environment-reserved-capacity.types)
     * in the *AWS CodeBuild User Guide* .
     *
     *
     * * `BUILD_GENERAL1_SMALL` : Use up to 4 GiB memory and 2 vCPUs for builds.
     * * `BUILD_GENERAL1_MEDIUM` : Use up to 8 GiB memory and 4 vCPUs for builds.
     * * `BUILD_GENERAL1_LARGE` : Use up to 16 GiB memory and 8 vCPUs for builds, depending on your
     * environment type.
     * * `BUILD_GENERAL1_XLARGE` : Use up to 72 GiB memory and 36 vCPUs for builds, depending on
     * your environment type.
     * * `BUILD_GENERAL1_2XLARGE` : Use up to 144 GiB memory, 72 vCPUs, and 824 GB of SSD storage
     * for builds. This compute type supports Docker images up to 100 GB uncompressed.
     * * `BUILD_LAMBDA_1GB` : Use up to 1 GiB memory for builds. Only available for environment type
     * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
     * * `BUILD_LAMBDA_2GB` : Use up to 2 GiB memory for builds. Only available for environment type
     * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
     * * `BUILD_LAMBDA_4GB` : Use up to 4 GiB memory for builds. Only available for environment type
     * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
     * * `BUILD_LAMBDA_8GB` : Use up to 8 GiB memory for builds. Only available for environment type
     * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
     * * `BUILD_LAMBDA_10GB` : Use up to 10 GiB memory for builds. Only available for environment
     * type `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
     *
     * If you use `BUILD_GENERAL1_SMALL` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 4 GiB memory and 2 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 16 GiB memory, 4 vCPUs, and
     * 1 NVIDIA A10G Tensor Core GPU for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 4 GiB memory and 2 vCPUs on
     * ARM-based processors for builds.
     *
     * If you use `BUILD_GENERAL1_LARGE` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 16 GiB memory and 8 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 255 GiB memory, 32 vCPUs,
     * and 4 NVIDIA Tesla V100 GPUs for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 16 GiB memory and 8 vCPUs on
     * ARM-based processors for builds.
     *
     * For more information, see [On-demand environment
     * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html#environment.types)
     * in the *AWS CodeBuild User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computetype)
     * @param computeType Information about the compute resources the compute fleet uses. Available
     * values include:. 
     */
    public fun computeType(computeType: String)

    /**
     * The environment type of the compute fleet.
     *
     * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia), US
     * East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     * * The environment type `ARM_EC2` is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     * (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     * * The environment type `LINUX_CONTAINER` is available only in regions US East (N. Virginia),
     * US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific
     * (Mumbai).
     * * The environment type `LINUX_EC2` is available only in regions US East (N. Virginia), US
     * East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     * (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo),
     * and Asia Pacific (Sydney).
     * * The environment type `MAC_ARM` is available only in regions US East (Ohio), US East (N.
     * Virginia), US West (Oregon), Europe (Frankfurt), and Asia Pacific (Sydney).
     * * The environment type `WINDOWS_EC2` is available only in regions US East (N. Virginia), US
     * East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     * (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     * * The environment type `WINDOWS_SERVER_2019_CONTAINER` is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo),
     * Asia Pacific (Mumbai) and EU (Ireland).
     * * The environment type `WINDOWS_SERVER_2022_CONTAINER` is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific
     * (Sydney), Asia Pacific (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia
     * Pacific (Mumbai).
     *
     * For more information, see [Build environment compute
     * types](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-environmenttype)
     * @param environmentType The environment type of the compute fleet. 
     */
    public fun environmentType(environmentType: String)

    /**
     * Information about the proxy configurations that apply network access control to your reserved
     * capacity instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetproxyconfiguration)
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances. 
     */
    public fun fleetProxyConfiguration(fleetProxyConfiguration: IResolvable)

    /**
     * Information about the proxy configurations that apply network access control to your reserved
     * capacity instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetproxyconfiguration)
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances. 
     */
    public fun fleetProxyConfiguration(fleetProxyConfiguration: ProxyConfigurationProperty)

    /**
     * Information about the proxy configurations that apply network access control to your reserved
     * capacity instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetproxyconfiguration)
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7f466d9b685059567f31e91fcd6f5a3e72d80dae10726bd8069cdec656bbe0f")
    public
        fun fleetProxyConfiguration(fleetProxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit)

    /**
     * The service role associated with the compute fleet.
     *
     * For more information, see [Allow a user to add a permission policy for a fleet service
     * role](https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-permission-policy-fleet-service-role.html)
     * in the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetservicerole)
     * @param fleetServiceRole The service role associated with the compute fleet. 
     */
    public fun fleetServiceRole(fleetServiceRole: String)

    /**
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses. 
     */
    public fun fleetVpcConfig(fleetVpcConfig: IResolvable)

    /**
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses. 
     */
    public fun fleetVpcConfig(fleetVpcConfig: VpcConfigProperty)

    /**
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2364dacd7b4942e2f55e3813ce37e4e78473c73fbc2e69544b423c50f197c6c1")
    public fun fleetVpcConfig(fleetVpcConfig: VpcConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Machine Image (AMI) of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-imageid)
     * @param imageId The Amazon Machine Image (AMI) of the compute fleet. 
     */
    public fun imageId(imageId: String)

    /**
     * The name of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-name)
     * @param name The name of the compute fleet. 
     */
    public fun name(name: String)

    /**
     * The compute fleet overflow behavior.
     *
     * * For overflow behavior `QUEUE` , your overflow builds need to wait on the existing fleet
     * instance to become available.
     * * For overflow behavior `ON_DEMAND` , your overflow builds run on CodeBuild on-demand.
     *
     *
     * If you choose to set your overflow behavior to on-demand while creating a VPC-connected
     * fleet, make sure that you add the required VPC permissions to your project service role. For
     * more information, see [Example policy statement to allow CodeBuild access to AWS services
     * required to create a VPC network
     * interface](https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-overflowbehavior)
     * @param overflowBehavior The compute fleet overflow behavior. 
     */
    public fun overflowBehavior(overflowBehavior: String)

    /**
     * The scaling configuration of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-scalingconfiguration)
     * @param scalingConfiguration The scaling configuration of the compute fleet. 
     */
    public fun scalingConfiguration(scalingConfiguration: IResolvable)

    /**
     * The scaling configuration of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-scalingconfiguration)
     * @param scalingConfiguration The scaling configuration of the compute fleet. 
     */
    public fun scalingConfiguration(scalingConfiguration: ScalingConfigurationInputProperty)

    /**
     * The scaling configuration of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-scalingconfiguration)
     * @param scalingConfiguration The scaling configuration of the compute fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca8407e1aadcb082faf18bb1ece916833097131a551e0a7092a9dc552dcca1d8")
    public
        fun scalingConfiguration(scalingConfiguration: ScalingConfigurationInputProperty.Builder.() -> Unit)

    /**
     * A list of tag key and value pairs associated with this compute fleet.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-tags)
     * @param tags A list of tag key and value pairs associated with this compute fleet. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tag key and value pairs associated with this compute fleet.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-tags)
     * @param tags A list of tag key and value pairs associated with this compute fleet. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnFleet.Builder =
        software.amazon.awscdk.services.codebuild.CfnFleet.Builder.create(scope, id)

    /**
     * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of
     * builds that can run in parallel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-basecapacity)
     * @param baseCapacity The initial number of machines allocated to the compute ﬂeet, which
     * deﬁnes the number of builds that can run in parallel. 
     */
    override fun baseCapacity(baseCapacity: Number) {
      cdkBuilder.baseCapacity(baseCapacity)
    }

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computeconfiguration)
     * @param computeConfiguration The compute configuration of the compute fleet. 
     */
    override fun computeConfiguration(computeConfiguration: IResolvable) {
      cdkBuilder.computeConfiguration(computeConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computeconfiguration)
     * @param computeConfiguration The compute configuration of the compute fleet. 
     */
    override fun computeConfiguration(computeConfiguration: ComputeConfigurationProperty) {
      cdkBuilder.computeConfiguration(computeConfiguration.let(ComputeConfigurationProperty.Companion::unwrap))
    }

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computeconfiguration)
     * @param computeConfiguration The compute configuration of the compute fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f22f53c3a5666dfcbba65c1605efd18e2a5216e46148795f829059ed870e379")
    override
        fun computeConfiguration(computeConfiguration: ComputeConfigurationProperty.Builder.() -> Unit):
        Unit = computeConfiguration(ComputeConfigurationProperty(computeConfiguration))

    /**
     * Information about the compute resources the compute fleet uses. Available values include:.
     *
     * * `ATTRIBUTE_BASED_COMPUTE` : Specify the amount of vCPUs, memory, disk space, and the type
     * of machine.
     *
     *
     * If you use `ATTRIBUTE_BASED_COMPUTE` , you must define your attributes by using
     * `computeConfiguration` . AWS CodeBuild will select the cheapest instance that satisfies your
     * specified attributes. For more information, see [Reserved capacity environment
     * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html#environment-reserved-capacity.types)
     * in the *AWS CodeBuild User Guide* .
     *
     *
     * * `BUILD_GENERAL1_SMALL` : Use up to 4 GiB memory and 2 vCPUs for builds.
     * * `BUILD_GENERAL1_MEDIUM` : Use up to 8 GiB memory and 4 vCPUs for builds.
     * * `BUILD_GENERAL1_LARGE` : Use up to 16 GiB memory and 8 vCPUs for builds, depending on your
     * environment type.
     * * `BUILD_GENERAL1_XLARGE` : Use up to 72 GiB memory and 36 vCPUs for builds, depending on
     * your environment type.
     * * `BUILD_GENERAL1_2XLARGE` : Use up to 144 GiB memory, 72 vCPUs, and 824 GB of SSD storage
     * for builds. This compute type supports Docker images up to 100 GB uncompressed.
     * * `BUILD_LAMBDA_1GB` : Use up to 1 GiB memory for builds. Only available for environment type
     * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
     * * `BUILD_LAMBDA_2GB` : Use up to 2 GiB memory for builds. Only available for environment type
     * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
     * * `BUILD_LAMBDA_4GB` : Use up to 4 GiB memory for builds. Only available for environment type
     * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
     * * `BUILD_LAMBDA_8GB` : Use up to 8 GiB memory for builds. Only available for environment type
     * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
     * * `BUILD_LAMBDA_10GB` : Use up to 10 GiB memory for builds. Only available for environment
     * type `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
     *
     * If you use `BUILD_GENERAL1_SMALL` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 4 GiB memory and 2 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 16 GiB memory, 4 vCPUs, and
     * 1 NVIDIA A10G Tensor Core GPU for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 4 GiB memory and 2 vCPUs on
     * ARM-based processors for builds.
     *
     * If you use `BUILD_GENERAL1_LARGE` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 16 GiB memory and 8 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 255 GiB memory, 32 vCPUs,
     * and 4 NVIDIA Tesla V100 GPUs for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 16 GiB memory and 8 vCPUs on
     * ARM-based processors for builds.
     *
     * For more information, see [On-demand environment
     * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html#environment.types)
     * in the *AWS CodeBuild User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computetype)
     * @param computeType Information about the compute resources the compute fleet uses. Available
     * values include:. 
     */
    override fun computeType(computeType: String) {
      cdkBuilder.computeType(computeType)
    }

    /**
     * The environment type of the compute fleet.
     *
     * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia), US
     * East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     * * The environment type `ARM_EC2` is available only in regions US East (N. Virginia), US East
     * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     * (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     * * The environment type `LINUX_CONTAINER` is available only in regions US East (N. Virginia),
     * US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific
     * (Mumbai).
     * * The environment type `LINUX_EC2` is available only in regions US East (N. Virginia), US
     * East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     * (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo),
     * and Asia Pacific (Sydney).
     * * The environment type `MAC_ARM` is available only in regions US East (Ohio), US East (N.
     * Virginia), US West (Oregon), Europe (Frankfurt), and Asia Pacific (Sydney).
     * * The environment type `WINDOWS_EC2` is available only in regions US East (N. Virginia), US
     * East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     * (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
     * * The environment type `WINDOWS_SERVER_2019_CONTAINER` is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo),
     * Asia Pacific (Mumbai) and EU (Ireland).
     * * The environment type `WINDOWS_SERVER_2022_CONTAINER` is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific
     * (Sydney), Asia Pacific (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia
     * Pacific (Mumbai).
     *
     * For more information, see [Build environment compute
     * types](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-environmenttype)
     * @param environmentType The environment type of the compute fleet. 
     */
    override fun environmentType(environmentType: String) {
      cdkBuilder.environmentType(environmentType)
    }

    /**
     * Information about the proxy configurations that apply network access control to your reserved
     * capacity instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetproxyconfiguration)
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances. 
     */
    override fun fleetProxyConfiguration(fleetProxyConfiguration: IResolvable) {
      cdkBuilder.fleetProxyConfiguration(fleetProxyConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about the proxy configurations that apply network access control to your reserved
     * capacity instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetproxyconfiguration)
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances. 
     */
    override fun fleetProxyConfiguration(fleetProxyConfiguration: ProxyConfigurationProperty) {
      cdkBuilder.fleetProxyConfiguration(fleetProxyConfiguration.let(ProxyConfigurationProperty.Companion::unwrap))
    }

    /**
     * Information about the proxy configurations that apply network access control to your reserved
     * capacity instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetproxyconfiguration)
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7f466d9b685059567f31e91fcd6f5a3e72d80dae10726bd8069cdec656bbe0f")
    override
        fun fleetProxyConfiguration(fleetProxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit):
        Unit = fleetProxyConfiguration(ProxyConfigurationProperty(fleetProxyConfiguration))

    /**
     * The service role associated with the compute fleet.
     *
     * For more information, see [Allow a user to add a permission policy for a fleet service
     * role](https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-permission-policy-fleet-service-role.html)
     * in the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetservicerole)
     * @param fleetServiceRole The service role associated with the compute fleet. 
     */
    override fun fleetServiceRole(fleetServiceRole: String) {
      cdkBuilder.fleetServiceRole(fleetServiceRole)
    }

    /**
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses. 
     */
    override fun fleetVpcConfig(fleetVpcConfig: IResolvable) {
      cdkBuilder.fleetVpcConfig(fleetVpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses. 
     */
    override fun fleetVpcConfig(fleetVpcConfig: VpcConfigProperty) {
      cdkBuilder.fleetVpcConfig(fleetVpcConfig.let(VpcConfigProperty.Companion::unwrap))
    }

    /**
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2364dacd7b4942e2f55e3813ce37e4e78473c73fbc2e69544b423c50f197c6c1")
    override fun fleetVpcConfig(fleetVpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        fleetVpcConfig(VpcConfigProperty(fleetVpcConfig))

    /**
     * The Amazon Machine Image (AMI) of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-imageid)
     * @param imageId The Amazon Machine Image (AMI) of the compute fleet. 
     */
    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    /**
     * The name of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-name)
     * @param name The name of the compute fleet. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The compute fleet overflow behavior.
     *
     * * For overflow behavior `QUEUE` , your overflow builds need to wait on the existing fleet
     * instance to become available.
     * * For overflow behavior `ON_DEMAND` , your overflow builds run on CodeBuild on-demand.
     *
     *
     * If you choose to set your overflow behavior to on-demand while creating a VPC-connected
     * fleet, make sure that you add the required VPC permissions to your project service role. For
     * more information, see [Example policy statement to allow CodeBuild access to AWS services
     * required to create a VPC network
     * interface](https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-overflowbehavior)
     * @param overflowBehavior The compute fleet overflow behavior. 
     */
    override fun overflowBehavior(overflowBehavior: String) {
      cdkBuilder.overflowBehavior(overflowBehavior)
    }

    /**
     * The scaling configuration of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-scalingconfiguration)
     * @param scalingConfiguration The scaling configuration of the compute fleet. 
     */
    override fun scalingConfiguration(scalingConfiguration: IResolvable) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The scaling configuration of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-scalingconfiguration)
     * @param scalingConfiguration The scaling configuration of the compute fleet. 
     */
    override fun scalingConfiguration(scalingConfiguration: ScalingConfigurationInputProperty) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(ScalingConfigurationInputProperty.Companion::unwrap))
    }

    /**
     * The scaling configuration of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-scalingconfiguration)
     * @param scalingConfiguration The scaling configuration of the compute fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca8407e1aadcb082faf18bb1ece916833097131a551e0a7092a9dc552dcca1d8")
    override
        fun scalingConfiguration(scalingConfiguration: ScalingConfigurationInputProperty.Builder.() -> Unit):
        Unit = scalingConfiguration(ScalingConfigurationInputProperty(scalingConfiguration))

    /**
     * A list of tag key and value pairs associated with this compute fleet.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-tags)
     * @param tags A list of tag key and value pairs associated with this compute fleet. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tag key and value pairs associated with this compute fleet.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-tags)
     * @param tags A list of tag key and value pairs associated with this compute fleet. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codebuild.CfnFleet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codebuild.CfnFleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet): CfnFleet =
        CfnFleet(cdkObject)

    internal fun unwrap(wrapped: CfnFleet): software.amazon.awscdk.services.codebuild.CfnFleet =
        wrapped.cdkObject as software.amazon.awscdk.services.codebuild.CfnFleet
  }

  /**
   * Contains compute attributes.
   *
   * These attributes only need be specified when your project's or fleet's `computeType` is set to
   * `ATTRIBUTE_BASED_COMPUTE` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * ComputeConfigurationProperty computeConfigurationProperty =
   * ComputeConfigurationProperty.builder()
   * .disk(123)
   * .machineType("machineType")
   * .memory(123)
   * .vCpu(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-computeconfiguration.html)
   */
  public interface ComputeConfigurationProperty {
    /**
     * The amount of disk space of the instance type included in your fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-computeconfiguration.html#cfn-codebuild-fleet-computeconfiguration-disk)
     */
    public fun disk(): Number? = unwrap(this).getDisk()

    /**
     * The machine type of the instance type included in your fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-computeconfiguration.html#cfn-codebuild-fleet-computeconfiguration-machinetype)
     */
    public fun machineType(): String? = unwrap(this).getMachineType()

    /**
     * The amount of memory of the instance type included in your fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-computeconfiguration.html#cfn-codebuild-fleet-computeconfiguration-memory)
     */
    public fun memory(): Number? = unwrap(this).getMemory()

    /**
     * The number of vCPUs of the instance type included in your fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-computeconfiguration.html#cfn-codebuild-fleet-computeconfiguration-vcpu)
     */
    public fun vCpu(): Number? = unwrap(this).getVCpu()

    /**
     * A builder for [ComputeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param disk The amount of disk space of the instance type included in your fleet.
       */
      public fun disk(disk: Number)

      /**
       * @param machineType The machine type of the instance type included in your fleet.
       */
      public fun machineType(machineType: String)

      /**
       * @param memory The amount of memory of the instance type included in your fleet.
       */
      public fun memory(memory: Number)

      /**
       * @param vCpu The number of vCPUs of the instance type included in your fleet.
       */
      public fun vCpu(vCpu: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnFleet.ComputeConfigurationProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnFleet.ComputeConfigurationProperty.builder()

      /**
       * @param disk The amount of disk space of the instance type included in your fleet.
       */
      override fun disk(disk: Number) {
        cdkBuilder.disk(disk)
      }

      /**
       * @param machineType The machine type of the instance type included in your fleet.
       */
      override fun machineType(machineType: String) {
        cdkBuilder.machineType(machineType)
      }

      /**
       * @param memory The amount of memory of the instance type included in your fleet.
       */
      override fun memory(memory: Number) {
        cdkBuilder.memory(memory)
      }

      /**
       * @param vCpu The number of vCPUs of the instance type included in your fleet.
       */
      override fun vCpu(vCpu: Number) {
        cdkBuilder.vCpu(vCpu)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnFleet.ComputeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.ComputeConfigurationProperty,
    ) : CdkObject(cdkObject),
        ComputeConfigurationProperty {
      /**
       * The amount of disk space of the instance type included in your fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-computeconfiguration.html#cfn-codebuild-fleet-computeconfiguration-disk)
       */
      override fun disk(): Number? = unwrap(this).getDisk()

      /**
       * The machine type of the instance type included in your fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-computeconfiguration.html#cfn-codebuild-fleet-computeconfiguration-machinetype)
       */
      override fun machineType(): String? = unwrap(this).getMachineType()

      /**
       * The amount of memory of the instance type included in your fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-computeconfiguration.html#cfn-codebuild-fleet-computeconfiguration-memory)
       */
      override fun memory(): Number? = unwrap(this).getMemory()

      /**
       * The number of vCPUs of the instance type included in your fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-computeconfiguration.html#cfn-codebuild-fleet-computeconfiguration-vcpu)
       */
      override fun vCpu(): Number? = unwrap(this).getVCpu()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.ComputeConfigurationProperty):
          ComputeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComputeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeConfigurationProperty):
          software.amazon.awscdk.services.codebuild.CfnFleet.ComputeConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnFleet.ComputeConfigurationProperty
    }
  }

  /**
   * Information about the proxy rule for your reserved capacity instances.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * FleetProxyRuleProperty fleetProxyRuleProperty = FleetProxyRuleProperty.builder()
   * .effect("effect")
   * .entities(List.of("entities"))
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-fleetproxyrule.html)
   */
  public interface FleetProxyRuleProperty {
    /**
     * The behavior of the proxy rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-fleetproxyrule.html#cfn-codebuild-fleet-fleetproxyrule-effect)
     */
    public fun effect(): String? = unwrap(this).getEffect()

    /**
     * The destination of the proxy rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-fleetproxyrule.html#cfn-codebuild-fleet-fleetproxyrule-entities)
     */
    public fun entities(): List<String> = unwrap(this).getEntities() ?: emptyList()

    /**
     * The type of proxy rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-fleetproxyrule.html#cfn-codebuild-fleet-fleetproxyrule-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [FleetProxyRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param effect The behavior of the proxy rule.
       */
      public fun effect(effect: String)

      /**
       * @param entities The destination of the proxy rule.
       */
      public fun entities(entities: List<String>)

      /**
       * @param entities The destination of the proxy rule.
       */
      public fun entities(vararg entities: String)

      /**
       * @param type The type of proxy rule.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnFleet.FleetProxyRuleProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnFleet.FleetProxyRuleProperty.builder()

      /**
       * @param effect The behavior of the proxy rule.
       */
      override fun effect(effect: String) {
        cdkBuilder.effect(effect)
      }

      /**
       * @param entities The destination of the proxy rule.
       */
      override fun entities(entities: List<String>) {
        cdkBuilder.entities(entities)
      }

      /**
       * @param entities The destination of the proxy rule.
       */
      override fun entities(vararg entities: String): Unit = entities(entities.toList())

      /**
       * @param type The type of proxy rule.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnFleet.FleetProxyRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.FleetProxyRuleProperty,
    ) : CdkObject(cdkObject),
        FleetProxyRuleProperty {
      /**
       * The behavior of the proxy rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-fleetproxyrule.html#cfn-codebuild-fleet-fleetproxyrule-effect)
       */
      override fun effect(): String? = unwrap(this).getEffect()

      /**
       * The destination of the proxy rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-fleetproxyrule.html#cfn-codebuild-fleet-fleetproxyrule-entities)
       */
      override fun entities(): List<String> = unwrap(this).getEntities() ?: emptyList()

      /**
       * The type of proxy rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-fleetproxyrule.html#cfn-codebuild-fleet-fleetproxyrule-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FleetProxyRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.FleetProxyRuleProperty):
          FleetProxyRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? FleetProxyRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetProxyRuleProperty):
          software.amazon.awscdk.services.codebuild.CfnFleet.FleetProxyRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnFleet.FleetProxyRuleProperty
    }
  }

  /**
   * Information about the proxy configurations that apply network access control to your reserved
   * capacity instances.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * ProxyConfigurationProperty proxyConfigurationProperty = ProxyConfigurationProperty.builder()
   * .defaultBehavior("defaultBehavior")
   * .orderedProxyRules(List.of(FleetProxyRuleProperty.builder()
   * .effect("effect")
   * .entities(List.of("entities"))
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-proxyconfiguration.html)
   */
  public interface ProxyConfigurationProperty {
    /**
     * The default behavior of outgoing traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-proxyconfiguration.html#cfn-codebuild-fleet-proxyconfiguration-defaultbehavior)
     */
    public fun defaultBehavior(): String? = unwrap(this).getDefaultBehavior()

    /**
     * An array of `FleetProxyRule` objects that represent the specified destination domains or IPs
     * to allow or deny network access control to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-proxyconfiguration.html#cfn-codebuild-fleet-proxyconfiguration-orderedproxyrules)
     */
    public fun orderedProxyRules(): Any? = unwrap(this).getOrderedProxyRules()

    /**
     * A builder for [ProxyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultBehavior The default behavior of outgoing traffic.
       */
      public fun defaultBehavior(defaultBehavior: String)

      /**
       * @param orderedProxyRules An array of `FleetProxyRule` objects that represent the specified
       * destination domains or IPs to allow or deny network access control to.
       */
      public fun orderedProxyRules(orderedProxyRules: IResolvable)

      /**
       * @param orderedProxyRules An array of `FleetProxyRule` objects that represent the specified
       * destination domains or IPs to allow or deny network access control to.
       */
      public fun orderedProxyRules(orderedProxyRules: List<Any>)

      /**
       * @param orderedProxyRules An array of `FleetProxyRule` objects that represent the specified
       * destination domains or IPs to allow or deny network access control to.
       */
      public fun orderedProxyRules(vararg orderedProxyRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnFleet.ProxyConfigurationProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnFleet.ProxyConfigurationProperty.builder()

      /**
       * @param defaultBehavior The default behavior of outgoing traffic.
       */
      override fun defaultBehavior(defaultBehavior: String) {
        cdkBuilder.defaultBehavior(defaultBehavior)
      }

      /**
       * @param orderedProxyRules An array of `FleetProxyRule` objects that represent the specified
       * destination domains or IPs to allow or deny network access control to.
       */
      override fun orderedProxyRules(orderedProxyRules: IResolvable) {
        cdkBuilder.orderedProxyRules(orderedProxyRules.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param orderedProxyRules An array of `FleetProxyRule` objects that represent the specified
       * destination domains or IPs to allow or deny network access control to.
       */
      override fun orderedProxyRules(orderedProxyRules: List<Any>) {
        cdkBuilder.orderedProxyRules(orderedProxyRules.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param orderedProxyRules An array of `FleetProxyRule` objects that represent the specified
       * destination domains or IPs to allow or deny network access control to.
       */
      override fun orderedProxyRules(vararg orderedProxyRules: Any): Unit =
          orderedProxyRules(orderedProxyRules.toList())

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnFleet.ProxyConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.ProxyConfigurationProperty,
    ) : CdkObject(cdkObject),
        ProxyConfigurationProperty {
      /**
       * The default behavior of outgoing traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-proxyconfiguration.html#cfn-codebuild-fleet-proxyconfiguration-defaultbehavior)
       */
      override fun defaultBehavior(): String? = unwrap(this).getDefaultBehavior()

      /**
       * An array of `FleetProxyRule` objects that represent the specified destination domains or
       * IPs to allow or deny network access control to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-proxyconfiguration.html#cfn-codebuild-fleet-proxyconfiguration-orderedproxyrules)
       */
      override fun orderedProxyRules(): Any? = unwrap(this).getOrderedProxyRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProxyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.ProxyConfigurationProperty):
          ProxyConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProxyConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProxyConfigurationProperty):
          software.amazon.awscdk.services.codebuild.CfnFleet.ProxyConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnFleet.ProxyConfigurationProperty
    }
  }

  /**
   * The scaling configuration input of a compute fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * ScalingConfigurationInputProperty scalingConfigurationInputProperty =
   * ScalingConfigurationInputProperty.builder()
   * .maxCapacity(123)
   * .scalingType("scalingType")
   * .targetTrackingScalingConfigs(List.of(TargetTrackingScalingConfigurationProperty.builder()
   * .metricType("metricType")
   * .targetValue(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-scalingconfigurationinput.html)
   */
  public interface ScalingConfigurationInputProperty {
    /**
     * The maximum number of instances in the ﬂeet when auto-scaling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-scalingconfigurationinput.html#cfn-codebuild-fleet-scalingconfigurationinput-maxcapacity)
     */
    public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The scaling type for a compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-scalingconfigurationinput.html#cfn-codebuild-fleet-scalingconfigurationinput-scalingtype)
     */
    public fun scalingType(): String? = unwrap(this).getScalingType()

    /**
     * A list of `TargetTrackingScalingConfiguration` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-scalingconfigurationinput.html#cfn-codebuild-fleet-scalingconfigurationinput-targettrackingscalingconfigs)
     */
    public fun targetTrackingScalingConfigs(): Any? = unwrap(this).getTargetTrackingScalingConfigs()

    /**
     * A builder for [ScalingConfigurationInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxCapacity The maximum number of instances in the ﬂeet when auto-scaling.
       */
      public fun maxCapacity(maxCapacity: Number)

      /**
       * @param scalingType The scaling type for a compute fleet.
       */
      public fun scalingType(scalingType: String)

      /**
       * @param targetTrackingScalingConfigs A list of `TargetTrackingScalingConfiguration` objects.
       */
      public fun targetTrackingScalingConfigs(targetTrackingScalingConfigs: IResolvable)

      /**
       * @param targetTrackingScalingConfigs A list of `TargetTrackingScalingConfiguration` objects.
       */
      public fun targetTrackingScalingConfigs(targetTrackingScalingConfigs: List<Any>)

      /**
       * @param targetTrackingScalingConfigs A list of `TargetTrackingScalingConfiguration` objects.
       */
      public fun targetTrackingScalingConfigs(vararg targetTrackingScalingConfigs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnFleet.ScalingConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnFleet.ScalingConfigurationInputProperty.builder()

      /**
       * @param maxCapacity The maximum number of instances in the ﬂeet when auto-scaling.
       */
      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      /**
       * @param scalingType The scaling type for a compute fleet.
       */
      override fun scalingType(scalingType: String) {
        cdkBuilder.scalingType(scalingType)
      }

      /**
       * @param targetTrackingScalingConfigs A list of `TargetTrackingScalingConfiguration` objects.
       */
      override fun targetTrackingScalingConfigs(targetTrackingScalingConfigs: IResolvable) {
        cdkBuilder.targetTrackingScalingConfigs(targetTrackingScalingConfigs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param targetTrackingScalingConfigs A list of `TargetTrackingScalingConfiguration` objects.
       */
      override fun targetTrackingScalingConfigs(targetTrackingScalingConfigs: List<Any>) {
        cdkBuilder.targetTrackingScalingConfigs(targetTrackingScalingConfigs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param targetTrackingScalingConfigs A list of `TargetTrackingScalingConfiguration` objects.
       */
      override fun targetTrackingScalingConfigs(vararg targetTrackingScalingConfigs: Any): Unit =
          targetTrackingScalingConfigs(targetTrackingScalingConfigs.toList())

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnFleet.ScalingConfigurationInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.ScalingConfigurationInputProperty,
    ) : CdkObject(cdkObject),
        ScalingConfigurationInputProperty {
      /**
       * The maximum number of instances in the ﬂeet when auto-scaling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-scalingconfigurationinput.html#cfn-codebuild-fleet-scalingconfigurationinput-maxcapacity)
       */
      override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

      /**
       * The scaling type for a compute fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-scalingconfigurationinput.html#cfn-codebuild-fleet-scalingconfigurationinput-scalingtype)
       */
      override fun scalingType(): String? = unwrap(this).getScalingType()

      /**
       * A list of `TargetTrackingScalingConfiguration` objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-scalingconfigurationinput.html#cfn-codebuild-fleet-scalingconfigurationinput-targettrackingscalingconfigs)
       */
      override fun targetTrackingScalingConfigs(): Any? =
          unwrap(this).getTargetTrackingScalingConfigs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ScalingConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.ScalingConfigurationInputProperty):
          ScalingConfigurationInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScalingConfigurationInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConfigurationInputProperty):
          software.amazon.awscdk.services.codebuild.CfnFleet.ScalingConfigurationInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnFleet.ScalingConfigurationInputProperty
    }
  }

  /**
   * Defines when a new instance is auto-scaled into the compute fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * TargetTrackingScalingConfigurationProperty targetTrackingScalingConfigurationProperty =
   * TargetTrackingScalingConfigurationProperty.builder()
   * .metricType("metricType")
   * .targetValue(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-targettrackingscalingconfiguration.html)
   */
  public interface TargetTrackingScalingConfigurationProperty {
    /**
     * The metric type to determine auto-scaling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-targettrackingscalingconfiguration.html#cfn-codebuild-fleet-targettrackingscalingconfiguration-metrictype)
     */
    public fun metricType(): String? = unwrap(this).getMetricType()

    /**
     * The value of `metricType` when to start scaling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-targettrackingscalingconfiguration.html#cfn-codebuild-fleet-targettrackingscalingconfiguration-targetvalue)
     */
    public fun targetValue(): Number? = unwrap(this).getTargetValue()

    /**
     * A builder for [TargetTrackingScalingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricType The metric type to determine auto-scaling.
       */
      public fun metricType(metricType: String)

      /**
       * @param targetValue The value of `metricType` when to start scaling.
       */
      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnFleet.TargetTrackingScalingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnFleet.TargetTrackingScalingConfigurationProperty.builder()

      /**
       * @param metricType The metric type to determine auto-scaling.
       */
      override fun metricType(metricType: String) {
        cdkBuilder.metricType(metricType)
      }

      /**
       * @param targetValue The value of `metricType` when to start scaling.
       */
      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnFleet.TargetTrackingScalingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.TargetTrackingScalingConfigurationProperty,
    ) : CdkObject(cdkObject),
        TargetTrackingScalingConfigurationProperty {
      /**
       * The metric type to determine auto-scaling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-targettrackingscalingconfiguration.html#cfn-codebuild-fleet-targettrackingscalingconfiguration-metrictype)
       */
      override fun metricType(): String? = unwrap(this).getMetricType()

      /**
       * The value of `metricType` when to start scaling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-targettrackingscalingconfiguration.html#cfn-codebuild-fleet-targettrackingscalingconfiguration-targetvalue)
       */
      override fun targetValue(): Number? = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingScalingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.TargetTrackingScalingConfigurationProperty):
          TargetTrackingScalingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetTrackingScalingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingScalingConfigurationProperty):
          software.amazon.awscdk.services.codebuild.CfnFleet.TargetTrackingScalingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnFleet.TargetTrackingScalingConfigurationProperty
    }
  }

  /**
   * Information about the VPC configuration that AWS CodeBuild accesses.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * A list of one or more security groups IDs in your Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-vpcconfig.html#cfn-codebuild-fleet-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * A list of one or more subnet IDs in your Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-vpcconfig.html#cfn-codebuild-fleet-vpcconfig-subnets)
     */
    public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    /**
     * The ID of the Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-vpcconfig.html#cfn-codebuild-fleet-vpcconfig-vpcid)
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds A list of one or more security groups IDs in your Amazon VPC.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds A list of one or more security groups IDs in your Amazon VPC.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnets A list of one or more subnet IDs in your Amazon VPC.
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets A list of one or more subnet IDs in your Amazon VPC.
       */
      public fun subnets(vararg subnets: String)

      /**
       * @param vpcId The ID of the Amazon VPC.
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnFleet.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnFleet.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds A list of one or more security groups IDs in your Amazon VPC.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds A list of one or more security groups IDs in your Amazon VPC.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnets A list of one or more subnet IDs in your Amazon VPC.
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets A list of one or more subnet IDs in your Amazon VPC.
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      /**
       * @param vpcId The ID of the Amazon VPC.
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnFleet.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.VpcConfigProperty,
    ) : CdkObject(cdkObject),
        VpcConfigProperty {
      /**
       * A list of one or more security groups IDs in your Amazon VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-vpcconfig.html#cfn-codebuild-fleet-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * A list of one or more subnet IDs in your Amazon VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-vpcconfig.html#cfn-codebuild-fleet-vpcconfig-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

      /**
       * The ID of the Amazon VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-fleet-vpcconfig.html#cfn-codebuild-fleet-vpcconfig-vpcid)
       */
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnFleet.VpcConfigProperty):
          VpcConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnFleet.VpcConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnFleet.VpcConfigProperty
    }
  }
}

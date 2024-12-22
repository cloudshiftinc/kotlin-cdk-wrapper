@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFleet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * CfnFleetProps cfnFleetProps = CfnFleetProps.builder()
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
public interface CfnFleetProps {
  /**
   * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of builds
   * that can run in parallel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-basecapacity)
   */
  public fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

  /**
   * The compute configuration of the compute fleet.
   *
   * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computeconfiguration)
   */
  public fun computeConfiguration(): Any? = unwrap(this).getComputeConfiguration()

  /**
   * Information about the compute resources the compute fleet uses. Available values include:.
   *
   * * `ATTRIBUTE_BASED_COMPUTE` : Specify the amount of vCPUs, memory, disk space, and the type of
   * machine.
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
   * * `BUILD_GENERAL1_XLARGE` : Use up to 72 GiB memory and 36 vCPUs for builds, depending on your
   * environment type.
   * * `BUILD_GENERAL1_2XLARGE` : Use up to 144 GiB memory, 72 vCPUs, and 824 GB of SSD storage for
   * builds. This compute type supports Docker images up to 100 GB uncompressed.
   * * `BUILD_LAMBDA_1GB` : Use up to 1 GiB memory for builds. Only available for environment type
   * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
   * * `BUILD_LAMBDA_2GB` : Use up to 2 GiB memory for builds. Only available for environment type
   * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
   * * `BUILD_LAMBDA_4GB` : Use up to 4 GiB memory for builds. Only available for environment type
   * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
   * * `BUILD_LAMBDA_8GB` : Use up to 8 GiB memory for builds. Only available for environment type
   * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
   * * `BUILD_LAMBDA_10GB` : Use up to 10 GiB memory for builds. Only available for environment type
   * `LINUX_LAMBDA_CONTAINER` and `ARM_LAMBDA_CONTAINER` .
   *
   * If you use `BUILD_GENERAL1_SMALL` :
   *
   * * For environment type `LINUX_CONTAINER` , you can use up to 4 GiB memory and 2 vCPUs for
   * builds.
   * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 16 GiB memory, 4 vCPUs, and 1
   * NVIDIA A10G Tensor Core GPU for builds.
   * * For environment type `ARM_CONTAINER` , you can use up to 4 GiB memory and 2 vCPUs on
   * ARM-based processors for builds.
   *
   * If you use `BUILD_GENERAL1_LARGE` :
   *
   * * For environment type `LINUX_CONTAINER` , you can use up to 16 GiB memory and 8 vCPUs for
   * builds.
   * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 255 GiB memory, 32 vCPUs, and
   * 4 NVIDIA Tesla V100 GPUs for builds.
   * * For environment type `ARM_CONTAINER` , you can use up to 16 GiB memory and 8 vCPUs on
   * ARM-based processors for builds.
   *
   * For more information, see [On-demand environment
   * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html#environment.types)
   * in the *AWS CodeBuild User Guide.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computetype)
   */
  public fun computeType(): String? = unwrap(this).getComputeType()

  /**
   * The environment type of the compute fleet.
   *
   * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia), US
   * East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia
   * Pacific (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
   * * The environment type `ARM_EC2` is available only in regions US East (N. Virginia), US East
   * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
   * (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
   * * The environment type `LINUX_CONTAINER` is available only in regions US East (N. Virginia), US
   * East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
   * (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
   * * The environment type `LINUX_EC2` is available only in regions US East (N. Virginia), US East
   * (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
   * (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
   * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
   * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo),
   * and Asia Pacific (Sydney).
   * * The environment type `MAC_ARM` is available only in regions US East (Ohio), US East (N.
   * Virginia), US West (Oregon), Europe (Frankfurt), and Asia Pacific (Sydney).
   * * The environment type `WINDOWS_EC2` is available only in regions US East (N. Virginia), US
   * East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
   * (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific (Mumbai).
   * * The environment type `WINDOWS_SERVER_2019_CONTAINER` is available only in regions US East (N.
   * Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Sydney), Asia Pacific (Tokyo), Asia
   * Pacific (Mumbai) and EU (Ireland).
   * * The environment type `WINDOWS_SERVER_2022_CONTAINER` is available only in regions US East (N.
   * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Sydney),
   * Asia Pacific (Singapore), Asia Pacific (Tokyo), South America (São Paulo) and Asia Pacific
   * (Mumbai).
   *
   * For more information, see [Build environment compute
   * types](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-compute-types.html)
   * in the *AWS CodeBuild user guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-environmenttype)
   */
  public fun environmentType(): String? = unwrap(this).getEnvironmentType()

  /**
   * Information about the proxy configurations that apply network access control to your reserved
   * capacity instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetproxyconfiguration)
   */
  public fun fleetProxyConfiguration(): Any? = unwrap(this).getFleetProxyConfiguration()

  /**
   * The service role associated with the compute fleet.
   *
   * For more information, see [Allow a user to add a permission policy for a fleet service
   * role](https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-permission-policy-fleet-service-role.html)
   * in the *AWS CodeBuild User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetservicerole)
   */
  public fun fleetServiceRole(): String? = unwrap(this).getFleetServiceRole()

  /**
   * Information about the VPC configuration that AWS CodeBuild accesses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
   */
  public fun fleetVpcConfig(): Any? = unwrap(this).getFleetVpcConfig()

  /**
   * The Amazon Machine Image (AMI) of the compute fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-imageid)
   */
  public fun imageId(): String? = unwrap(this).getImageId()

  /**
   * The name of the compute fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The compute fleet overflow behavior.
   *
   * * For overflow behavior `QUEUE` , your overflow builds need to wait on the existing fleet
   * instance to become available.
   * * For overflow behavior `ON_DEMAND` , your overflow builds run on CodeBuild on-demand.
   *
   *
   * If you choose to set your overflow behavior to on-demand while creating a VPC-connected fleet,
   * make sure that you add the required VPC permissions to your project service role. For more
   * information, see [Example policy statement to allow CodeBuild access to AWS services required to
   * create a VPC network
   * interface](https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-create-vpc-network-interface)
   * .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-overflowbehavior)
   */
  public fun overflowBehavior(): String? = unwrap(this).getOverflowBehavior()

  /**
   * The scaling configuration of the compute fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-scalingconfiguration)
   */
  public fun scalingConfiguration(): Any? = unwrap(this).getScalingConfiguration()

  /**
   * A list of tag key and value pairs associated with this compute fleet.
   *
   * These tags are available for use by AWS services that support AWS CodeBuild compute fleet tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param baseCapacity The initial number of machines allocated to the compute ﬂeet, which
     * deﬁnes the number of builds that can run in parallel.
     */
    public fun baseCapacity(baseCapacity: Number)

    /**
     * @param computeConfiguration The compute configuration of the compute fleet.
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     */
    public fun computeConfiguration(computeConfiguration: IResolvable)

    /**
     * @param computeConfiguration The compute configuration of the compute fleet.
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     */
    public fun computeConfiguration(computeConfiguration: CfnFleet.ComputeConfigurationProperty)

    /**
     * @param computeConfiguration The compute configuration of the compute fleet.
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eef64696e9e535b61b2ca5b72ad98eff19cde3053d2afa5324d2b74b708e5ce3")
    public
        fun computeConfiguration(computeConfiguration: CfnFleet.ComputeConfigurationProperty.Builder.() -> Unit)

    /**
     * @param computeType Information about the compute resources the compute fleet uses. Available
     * values include:.
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
     */
    public fun computeType(computeType: String)

    /**
     * @param environmentType The environment type of the compute fleet.
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
     */
    public fun environmentType(environmentType: String)

    /**
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances.
     */
    public fun fleetProxyConfiguration(fleetProxyConfiguration: IResolvable)

    /**
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances.
     */
    public fun fleetProxyConfiguration(fleetProxyConfiguration: CfnFleet.ProxyConfigurationProperty)

    /**
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4411483786b1ab46d2a83e0409335743763f573c1a4d016eb9bc44fc0c2d8c2a")
    public
        fun fleetProxyConfiguration(fleetProxyConfiguration: CfnFleet.ProxyConfigurationProperty.Builder.() -> Unit)

    /**
     * @param fleetServiceRole The service role associated with the compute fleet.
     * For more information, see [Allow a user to add a permission policy for a fleet service
     * role](https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-permission-policy-fleet-service-role.html)
     * in the *AWS CodeBuild User Guide* .
     */
    public fun fleetServiceRole(fleetServiceRole: String)

    /**
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses.
     */
    public fun fleetVpcConfig(fleetVpcConfig: IResolvable)

    /**
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses.
     */
    public fun fleetVpcConfig(fleetVpcConfig: CfnFleet.VpcConfigProperty)

    /**
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96864873899211179322b87b275320a614a489c634c0f5bb1179b4e38eb01619")
    public fun fleetVpcConfig(fleetVpcConfig: CfnFleet.VpcConfigProperty.Builder.() -> Unit)

    /**
     * @param imageId The Amazon Machine Image (AMI) of the compute fleet.
     */
    public fun imageId(imageId: String)

    /**
     * @param name The name of the compute fleet.
     */
    public fun name(name: String)

    /**
     * @param overflowBehavior The compute fleet overflow behavior.
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
     */
    public fun overflowBehavior(overflowBehavior: String)

    /**
     * @param scalingConfiguration The scaling configuration of the compute fleet.
     */
    public fun scalingConfiguration(scalingConfiguration: IResolvable)

    /**
     * @param scalingConfiguration The scaling configuration of the compute fleet.
     */
    public
        fun scalingConfiguration(scalingConfiguration: CfnFleet.ScalingConfigurationInputProperty)

    /**
     * @param scalingConfiguration The scaling configuration of the compute fleet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34a97e69de5a6087977ada5768cf0bd9e4650196f1e22952b2df0bff82b9ee46")
    public
        fun scalingConfiguration(scalingConfiguration: CfnFleet.ScalingConfigurationInputProperty.Builder.() -> Unit)

    /**
     * @param tags A list of tag key and value pairs associated with this compute fleet.
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tag key and value pairs associated with this compute fleet.
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnFleetProps.Builder =
        software.amazon.awscdk.services.codebuild.CfnFleetProps.builder()

    /**
     * @param baseCapacity The initial number of machines allocated to the compute ﬂeet, which
     * deﬁnes the number of builds that can run in parallel.
     */
    override fun baseCapacity(baseCapacity: Number) {
      cdkBuilder.baseCapacity(baseCapacity)
    }

    /**
     * @param computeConfiguration The compute configuration of the compute fleet.
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     */
    override fun computeConfiguration(computeConfiguration: IResolvable) {
      cdkBuilder.computeConfiguration(computeConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param computeConfiguration The compute configuration of the compute fleet.
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     */
    override fun computeConfiguration(computeConfiguration: CfnFleet.ComputeConfigurationProperty) {
      cdkBuilder.computeConfiguration(computeConfiguration.let(CfnFleet.ComputeConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param computeConfiguration The compute configuration of the compute fleet.
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eef64696e9e535b61b2ca5b72ad98eff19cde3053d2afa5324d2b74b708e5ce3")
    override
        fun computeConfiguration(computeConfiguration: CfnFleet.ComputeConfigurationProperty.Builder.() -> Unit):
        Unit = computeConfiguration(CfnFleet.ComputeConfigurationProperty(computeConfiguration))

    /**
     * @param computeType Information about the compute resources the compute fleet uses. Available
     * values include:.
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
     */
    override fun computeType(computeType: String) {
      cdkBuilder.computeType(computeType)
    }

    /**
     * @param environmentType The environment type of the compute fleet.
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
     */
    override fun environmentType(environmentType: String) {
      cdkBuilder.environmentType(environmentType)
    }

    /**
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances.
     */
    override fun fleetProxyConfiguration(fleetProxyConfiguration: IResolvable) {
      cdkBuilder.fleetProxyConfiguration(fleetProxyConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances.
     */
    override
        fun fleetProxyConfiguration(fleetProxyConfiguration: CfnFleet.ProxyConfigurationProperty) {
      cdkBuilder.fleetProxyConfiguration(fleetProxyConfiguration.let(CfnFleet.ProxyConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param fleetProxyConfiguration Information about the proxy configurations that apply network
     * access control to your reserved capacity instances.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4411483786b1ab46d2a83e0409335743763f573c1a4d016eb9bc44fc0c2d8c2a")
    override
        fun fleetProxyConfiguration(fleetProxyConfiguration: CfnFleet.ProxyConfigurationProperty.Builder.() -> Unit):
        Unit = fleetProxyConfiguration(CfnFleet.ProxyConfigurationProperty(fleetProxyConfiguration))

    /**
     * @param fleetServiceRole The service role associated with the compute fleet.
     * For more information, see [Allow a user to add a permission policy for a fleet service
     * role](https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-permission-policy-fleet-service-role.html)
     * in the *AWS CodeBuild User Guide* .
     */
    override fun fleetServiceRole(fleetServiceRole: String) {
      cdkBuilder.fleetServiceRole(fleetServiceRole)
    }

    /**
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses.
     */
    override fun fleetVpcConfig(fleetVpcConfig: IResolvable) {
      cdkBuilder.fleetVpcConfig(fleetVpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses.
     */
    override fun fleetVpcConfig(fleetVpcConfig: CfnFleet.VpcConfigProperty) {
      cdkBuilder.fleetVpcConfig(fleetVpcConfig.let(CfnFleet.VpcConfigProperty.Companion::unwrap))
    }

    /**
     * @param fleetVpcConfig Information about the VPC configuration that AWS CodeBuild accesses.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96864873899211179322b87b275320a614a489c634c0f5bb1179b4e38eb01619")
    override fun fleetVpcConfig(fleetVpcConfig: CfnFleet.VpcConfigProperty.Builder.() -> Unit): Unit
        = fleetVpcConfig(CfnFleet.VpcConfigProperty(fleetVpcConfig))

    /**
     * @param imageId The Amazon Machine Image (AMI) of the compute fleet.
     */
    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    /**
     * @param name The name of the compute fleet.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param overflowBehavior The compute fleet overflow behavior.
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
     */
    override fun overflowBehavior(overflowBehavior: String) {
      cdkBuilder.overflowBehavior(overflowBehavior)
    }

    /**
     * @param scalingConfiguration The scaling configuration of the compute fleet.
     */
    override fun scalingConfiguration(scalingConfiguration: IResolvable) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scalingConfiguration The scaling configuration of the compute fleet.
     */
    override
        fun scalingConfiguration(scalingConfiguration: CfnFleet.ScalingConfigurationInputProperty) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(CfnFleet.ScalingConfigurationInputProperty.Companion::unwrap))
    }

    /**
     * @param scalingConfiguration The scaling configuration of the compute fleet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34a97e69de5a6087977ada5768cf0bd9e4650196f1e22952b2df0bff82b9ee46")
    override
        fun scalingConfiguration(scalingConfiguration: CfnFleet.ScalingConfigurationInputProperty.Builder.() -> Unit):
        Unit =
        scalingConfiguration(CfnFleet.ScalingConfigurationInputProperty(scalingConfiguration))

    /**
     * @param tags A list of tag key and value pairs associated with this compute fleet.
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tag key and value pairs associated with this compute fleet.
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codebuild.CfnFleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.CfnFleetProps,
  ) : CdkObject(cdkObject),
      CfnFleetProps {
    /**
     * The initial number of machines allocated to the compute ﬂeet, which deﬁnes the number of
     * builds that can run in parallel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-basecapacity)
     */
    override fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to `ATTRIBUTE_BASED_COMPUTE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computeconfiguration)
     */
    override fun computeConfiguration(): Any? = unwrap(this).getComputeConfiguration()

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
     */
    override fun computeType(): String? = unwrap(this).getComputeType()

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
     */
    override fun environmentType(): String? = unwrap(this).getEnvironmentType()

    /**
     * Information about the proxy configurations that apply network access control to your reserved
     * capacity instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetproxyconfiguration)
     */
    override fun fleetProxyConfiguration(): Any? = unwrap(this).getFleetProxyConfiguration()

    /**
     * The service role associated with the compute fleet.
     *
     * For more information, see [Allow a user to add a permission policy for a fleet service
     * role](https://docs.aws.amazon.com/codebuild/latest/userguide/auth-and-access-control-iam-identity-based-access-control.html#customer-managed-policies-example-permission-policy-fleet-service-role.html)
     * in the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetservicerole)
     */
    override fun fleetServiceRole(): String? = unwrap(this).getFleetServiceRole()

    /**
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     */
    override fun fleetVpcConfig(): Any? = unwrap(this).getFleetVpcConfig()

    /**
     * The Amazon Machine Image (AMI) of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-imageid)
     */
    override fun imageId(): String? = unwrap(this).getImageId()

    /**
     * The name of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-name)
     */
    override fun name(): String? = unwrap(this).getName()

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
     */
    override fun overflowBehavior(): String? = unwrap(this).getOverflowBehavior()

    /**
     * The scaling configuration of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-scalingconfiguration)
     */
    override fun scalingConfiguration(): Any? = unwrap(this).getScalingConfiguration()

    /**
     * A list of tag key and value pairs associated with this compute fleet.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild compute fleet
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnFleetProps):
        CfnFleetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFleetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFleetProps):
        software.amazon.awscdk.services.codebuild.CfnFleetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codebuild.CfnFleetProps
  }
}

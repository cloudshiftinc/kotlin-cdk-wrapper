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
 * .computeType("computeType")
 * .environmentType("environmentType")
 * .fleetServiceRole("fleetServiceRole")
 * .fleetVpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .vpcId("vpcId")
 * .build())
 * .imageId("imageId")
 * .name("name")
 * .overflowBehavior("overflowBehavior")
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
   * Updating this field is not allowed for `MAC_ARM` .
   */
  public open fun computeType(): String? = unwrap(this).getComputeType()

  /**
   * Updating this field is not allowed for `MAC_ARM` .
   */
  public open fun computeType(`value`: String) {
    unwrap(this).setComputeType(`value`)
  }

  /**
   * Updating this field is not allowed for `MAC_ARM` .
   */
  public open fun environmentType(): String? = unwrap(this).getEnvironmentType()

  /**
   * Updating this field is not allowed for `MAC_ARM` .
   */
  public open fun environmentType(`value`: String) {
    unwrap(this).setEnvironmentType(`value`)
  }

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
   * Updating this field is not allowed for `MAC_ARM` .
   */
  public open fun fleetVpcConfig(): Any? = unwrap(this).getFleetVpcConfig()

  /**
   * Updating this field is not allowed for `MAC_ARM` .
   */
  public open fun fleetVpcConfig(`value`: IResolvable) {
    unwrap(this).setFleetVpcConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Updating this field is not allowed for `MAC_ARM` .
   */
  public open fun fleetVpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setFleetVpcConfig(`value`.let(VpcConfigProperty.Companion::unwrap))
  }

  /**
   * Updating this field is not allowed for `MAC_ARM` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ae880fbe2c1ab8b417e5fafe263789c3105b4e087fa381af6efbae306dd1cbe")
  public open fun fleetVpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      fleetVpcConfig(VpcConfigProperty(`value`))

  /**
   * Updating this field is not allowed for `MAC_ARM` .
   */
  public open fun imageId(): String? = unwrap(this).getImageId()

  /**
   * Updating this field is not allowed for `MAC_ARM` .
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
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * Information about the compute resources the compute fleet uses. Available values include:
     *
     * * `BUILD_GENERAL1_SMALL` : Use up to 3 GB memory and 2 vCPUs for builds.
     * * `BUILD_GENERAL1_MEDIUM` : Use up to 7 GB memory and 4 vCPUs for builds.
     * * `BUILD_GENERAL1_LARGE` : Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     * environment type.
     * * `BUILD_GENERAL1_XLARGE` : Use up to 70 GB memory and 36 vCPUs for builds, depending on your
     * environment type.
     * * `BUILD_GENERAL1_2XLARGE` : Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     * builds. This compute type supports Docker images up to 100 GB uncompressed.
     *
     * If you use `BUILD_GENERAL1_SMALL` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 3 GB memory and 2 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 16 GB memory, 4 vCPUs, and 1
     * NVIDIA A10G Tensor Core GPU for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 4 GB memory and 2 vCPUs on
     * ARM-based processors for builds.
     *
     * If you use `BUILD_GENERAL1_LARGE` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 15 GB memory and 8 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 255 GB memory, 32 vCPUs, and
     * 4 NVIDIA Tesla V100 GPUs for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 16 GB memory and 8 vCPUs on
     * ARM-based processors for builds.
     *
     * For more information, see [Build environment compute
     * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computetype)
     * @param computeType Updating this field is not allowed for `MAC_ARM` . 
     */
    public fun computeType(computeType: String)

    /**
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * The environment type of the compute fleet.
     *
     * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia), US
     * East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     * * The environment type `LINUX_CONTAINER` is available only in regions US East (N. Virginia),
     * US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific
     * (Mumbai).
     * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo),
     * and Asia Pacific (Sydney).
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
     * @param environmentType Updating this field is not allowed for `MAC_ARM` . 
     */
    public fun environmentType(environmentType: String)

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
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Updating this field is not allowed for `MAC_ARM` . 
     */
    public fun fleetVpcConfig(fleetVpcConfig: IResolvable)

    /**
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Updating this field is not allowed for `MAC_ARM` . 
     */
    public fun fleetVpcConfig(fleetVpcConfig: VpcConfigProperty)

    /**
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Updating this field is not allowed for `MAC_ARM` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2364dacd7b4942e2f55e3813ce37e4e78473c73fbc2e69544b423c50f197c6c1")
    public fun fleetVpcConfig(fleetVpcConfig: VpcConfigProperty.Builder.() -> Unit)

    /**
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * The Amazon Machine Image (AMI) of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-imageid)
     * @param imageId Updating this field is not allowed for `MAC_ARM` . 
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
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * Information about the compute resources the compute fleet uses. Available values include:
     *
     * * `BUILD_GENERAL1_SMALL` : Use up to 3 GB memory and 2 vCPUs for builds.
     * * `BUILD_GENERAL1_MEDIUM` : Use up to 7 GB memory and 4 vCPUs for builds.
     * * `BUILD_GENERAL1_LARGE` : Use up to 16 GB memory and 8 vCPUs for builds, depending on your
     * environment type.
     * * `BUILD_GENERAL1_XLARGE` : Use up to 70 GB memory and 36 vCPUs for builds, depending on your
     * environment type.
     * * `BUILD_GENERAL1_2XLARGE` : Use up to 145 GB memory, 72 vCPUs, and 824 GB of SSD storage for
     * builds. This compute type supports Docker images up to 100 GB uncompressed.
     *
     * If you use `BUILD_GENERAL1_SMALL` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 3 GB memory and 2 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 16 GB memory, 4 vCPUs, and 1
     * NVIDIA A10G Tensor Core GPU for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 4 GB memory and 2 vCPUs on
     * ARM-based processors for builds.
     *
     * If you use `BUILD_GENERAL1_LARGE` :
     *
     * * For environment type `LINUX_CONTAINER` , you can use up to 15 GB memory and 8 vCPUs for
     * builds.
     * * For environment type `LINUX_GPU_CONTAINER` , you can use up to 255 GB memory, 32 vCPUs, and
     * 4 NVIDIA Tesla V100 GPUs for builds.
     * * For environment type `ARM_CONTAINER` , you can use up to 16 GB memory and 8 vCPUs on
     * ARM-based processors for builds.
     *
     * For more information, see [Build environment compute
     * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-computetype)
     * @param computeType Updating this field is not allowed for `MAC_ARM` . 
     */
    override fun computeType(computeType: String) {
      cdkBuilder.computeType(computeType)
    }

    /**
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * The environment type of the compute fleet.
     *
     * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia), US
     * East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), EU (Frankfurt), and South America (São Paulo).
     * * The environment type `LINUX_CONTAINER` is available only in regions US East (N. Virginia),
     * US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Singapore), Asia Pacific (Sydney), South America (São Paulo), and Asia Pacific
     * (Mumbai).
     * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), EU (Ireland), EU (Frankfurt), Asia Pacific (Tokyo),
     * and Asia Pacific (Sydney).
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
     * @param environmentType Updating this field is not allowed for `MAC_ARM` . 
     */
    override fun environmentType(environmentType: String) {
      cdkBuilder.environmentType(environmentType)
    }

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
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Updating this field is not allowed for `MAC_ARM` . 
     */
    override fun fleetVpcConfig(fleetVpcConfig: IResolvable) {
      cdkBuilder.fleetVpcConfig(fleetVpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Updating this field is not allowed for `MAC_ARM` . 
     */
    override fun fleetVpcConfig(fleetVpcConfig: VpcConfigProperty) {
      cdkBuilder.fleetVpcConfig(fleetVpcConfig.let(VpcConfigProperty.Companion::unwrap))
    }

    /**
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * Information about the VPC configuration that AWS CodeBuild accesses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-fleetvpcconfig)
     * @param fleetVpcConfig Updating this field is not allowed for `MAC_ARM` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2364dacd7b4942e2f55e3813ce37e4e78473c73fbc2e69544b423c50f197c6c1")
    override fun fleetVpcConfig(fleetVpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        fleetVpcConfig(VpcConfigProperty(fleetVpcConfig))

    /**
     * Updating this field is not allowed for `MAC_ARM` .
     *
     * The Amazon Machine Image (AMI) of the compute fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-fleet.html#cfn-codebuild-fleet-imageid)
     * @param imageId Updating this field is not allowed for `MAC_ARM` . 
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

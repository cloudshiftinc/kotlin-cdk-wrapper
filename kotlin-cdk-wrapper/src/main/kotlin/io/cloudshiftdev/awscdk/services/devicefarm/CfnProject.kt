@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a project.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.devicefarm.*;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
 * .name("name")
 * // the properties below are optional
 * .defaultJobTimeoutMinutes(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html)
 */
public open class CfnProject(
  cdkObject: software.amazon.awscdk.services.devicefarm.CfnProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProps,
  ) :
      this(software.amazon.awscdk.services.devicefarm.CfnProject(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnProjectProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProjectProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the project.
   *
   * See [Amazon resource
   * names](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *General
   * Reference guide* .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Sets the execution timeout value (in minutes) for a project.
   */
  public open fun defaultJobTimeoutMinutes(): Number? = unwrap(this).getDefaultJobTimeoutMinutes()

  /**
   * Sets the execution timeout value (in minutes) for a project.
   */
  public open fun defaultJobTimeoutMinutes(`value`: Number) {
    unwrap(this).setDefaultJobTimeoutMinutes(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The project's name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The project's name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to add to the resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to add to the resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to add to the resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The VPC security groups and subnets that are attached to a project.
   */
  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * The VPC security groups and subnets that are attached to a project.
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The VPC security groups and subnets that are attached to a project.
   */
  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  /**
   * The VPC security groups and subnets that are attached to a project.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("742f01f1226fb776154a55aafd23dc35e7722802117fcf6601195ae9399fe80b")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.devicefarm.CfnProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Sets the execution timeout value (in minutes) for a project.
     *
     * All test runs in this project use the specified execution timeout value unless overridden
     * when scheduling a run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-defaultjobtimeoutminutes)
     * @param defaultJobTimeoutMinutes Sets the execution timeout value (in minutes) for a project. 
     */
    public fun defaultJobTimeoutMinutes(defaultJobTimeoutMinutes: Number)

    /**
     * The project's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-name)
     * @param name The project's name. 
     */
    public fun name(name: String)

    /**
     * The tags to add to the resource.
     *
     * A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128
     * characters. Tag values can have a maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-tags)
     * @param tags The tags to add to the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to the resource.
     *
     * A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128
     * characters. Tag values can have a maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-tags)
     * @param tags The tags to add to the resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b286c38a5590437dc62b1c077d69224e8e28cd6e527b3cec99b1dc07a67499f3")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnProject.Builder =
        software.amazon.awscdk.services.devicefarm.CfnProject.Builder.create(scope, id)

    /**
     * Sets the execution timeout value (in minutes) for a project.
     *
     * All test runs in this project use the specified execution timeout value unless overridden
     * when scheduling a run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-defaultjobtimeoutminutes)
     * @param defaultJobTimeoutMinutes Sets the execution timeout value (in minutes) for a project. 
     */
    override fun defaultJobTimeoutMinutes(defaultJobTimeoutMinutes: Number) {
      cdkBuilder.defaultJobTimeoutMinutes(defaultJobTimeoutMinutes)
    }

    /**
     * The project's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-name)
     * @param name The project's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags to add to the resource.
     *
     * A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128
     * characters. Tag values can have a maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-tags)
     * @param tags The tags to add to the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to add to the resource.
     *
     * A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128
     * characters. Tag values can have a maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-tags)
     * @param tags The tags to add to the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b286c38a5590437dc62b1c077d69224e8e28cd6e527b3cec99b1dc07a67499f3")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnProject = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.devicefarm.CfnProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnProject): CfnProject
        = CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.devicefarm.CfnProject
        = wrapped.cdkObject as software.amazon.awscdk.services.devicefarm.CfnProject
  }

  /**
   * The VPC security groups and subnets that are attached to a project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.devicefarm.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-project-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * A list of VPC security group IDs.
     *
     * A security group allows inbound traffic from network interfaces (and their associated
     * instances) that are assigned to the same security group. See [Security
     * groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
     * Virtual Private Cloud user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-project-vpcconfig.html#cfn-devicefarm-project-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * A subnet is a range of IP addresses in your VPC.
     *
     * You can launch Amazon resources, such as EC2 instances, into a specific subnet. When you
     * create a subnet, you specify the IPv4 CIDR block for the subnet, which is a subset of the VPC
     * CIDR block. See [VPCs and
     * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon
     * Virtual Private Cloud user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-project-vpcconfig.html#cfn-devicefarm-project-vpcconfig-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * A list of VPC IDs.
     *
     * Each VPC is given a unique ID upon creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-project-vpcconfig.html#cfn-devicefarm-project-vpcconfig-vpcid)
     */
    public fun vpcId(): String

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds A list of VPC security group IDs. 
       * A security group allows inbound traffic from network interfaces (and their associated
       * instances) that are assigned to the same security group. See [Security
       * groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the
       * *Amazon Virtual Private Cloud user guide* .
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds A list of VPC security group IDs. 
       * A security group allows inbound traffic from network interfaces (and their associated
       * instances) that are assigned to the same security group. See [Security
       * groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the
       * *Amazon Virtual Private Cloud user guide* .
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds A subnet is a range of IP addresses in your VPC. 
       * You can launch Amazon resources, such as EC2 instances, into a specific subnet. When you
       * create a subnet, you specify the IPv4 CIDR block for the subnet, which is a subset of the VPC
       * CIDR block. See [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon
       * Virtual Private Cloud user guide* .
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds A subnet is a range of IP addresses in your VPC. 
       * You can launch Amazon resources, such as EC2 instances, into a specific subnet. When you
       * create a subnet, you specify the IPv4 CIDR block for the subnet, which is a subset of the VPC
       * CIDR block. See [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon
       * Virtual Private Cloud user guide* .
       */
      public fun subnetIds(vararg subnetIds: String)

      /**
       * @param vpcId A list of VPC IDs. 
       * Each VPC is given a unique ID upon creation.
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds A list of VPC security group IDs. 
       * A security group allows inbound traffic from network interfaces (and their associated
       * instances) that are assigned to the same security group. See [Security
       * groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the
       * *Amazon Virtual Private Cloud user guide* .
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds A list of VPC security group IDs. 
       * A security group allows inbound traffic from network interfaces (and their associated
       * instances) that are assigned to the same security group. See [Security
       * groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the
       * *Amazon Virtual Private Cloud user guide* .
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds A subnet is a range of IP addresses in your VPC. 
       * You can launch Amazon resources, such as EC2 instances, into a specific subnet. When you
       * create a subnet, you specify the IPv4 CIDR block for the subnet, which is a subset of the VPC
       * CIDR block. See [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon
       * Virtual Private Cloud user guide* .
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds A subnet is a range of IP addresses in your VPC. 
       * You can launch Amazon resources, such as EC2 instances, into a specific subnet. When you
       * create a subnet, you specify the IPv4 CIDR block for the subnet, which is a subset of the VPC
       * CIDR block. See [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon
       * Virtual Private Cloud user guide* .
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      /**
       * @param vpcId A list of VPC IDs. 
       * Each VPC is given a unique ID upon creation.
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build(): software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * A list of VPC security group IDs.
       *
       * A security group allows inbound traffic from network interfaces (and their associated
       * instances) that are assigned to the same security group. See [Security
       * groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the
       * *Amazon Virtual Private Cloud user guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-project-vpcconfig.html#cfn-devicefarm-project-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * A subnet is a range of IP addresses in your VPC.
       *
       * You can launch Amazon resources, such as EC2 instances, into a specific subnet. When you
       * create a subnet, you specify the IPv4 CIDR block for the subnet, which is a subset of the VPC
       * CIDR block. See [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon
       * Virtual Private Cloud user guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-project-vpcconfig.html#cfn-devicefarm-project-vpcconfig-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

      /**
       * A list of VPC IDs.
       *
       * Each VPC is given a unique ID upon creation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-project-vpcconfig.html#cfn-devicefarm-project-vpcconfig-vpcid)
       */
      override fun vpcId(): String = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty):
          VpcConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty
    }
  }
}

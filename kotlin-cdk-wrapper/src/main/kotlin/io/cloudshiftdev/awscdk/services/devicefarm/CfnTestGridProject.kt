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
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Selenium testing project.
 *
 * Projects are used to collect and collate sessions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.devicefarm.*;
 * CfnTestGridProject cfnTestGridProject = CfnTestGridProject.Builder.create(this,
 * "MyCfnTestGridProject")
 * .name("name")
 * // the properties below are optional
 * .description("description")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html)
 */
public open class CfnTestGridProject internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnTestGridProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the `TestGrid` project.
   *
   * See [Amazon resource
   * names](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *General
   * Reference guide* .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A human-readable description for the project.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A human-readable description for the project.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * A human-readable name for the project.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A human-readable name for the project.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
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
  @JvmName("37379b4e550024496db38785925af1004b8f8e8ea62dff2505dc038a17911660")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.devicefarm.CfnTestGridProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A human-readable description for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-description)
     * @param description A human-readable description for the project. 
     */
    public fun description(description: String)

    /**
     * A human-readable name for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-name)
     * @param name A human-readable name for the project. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df2a2d2ae5f1ca61f8c8ff9591f17a830493355ada3b5763b8dae3c57d42ea1c")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnTestGridProject.Builder =
        software.amazon.awscdk.services.devicefarm.CfnTestGridProject.Builder.create(scope, id)

    /**
     * A human-readable description for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-description)
     * @param description A human-readable description for the project. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A human-readable name for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-name)
     * @param name A human-readable name for the project. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html#cfn-devicefarm-testgridproject-vpcconfig)
     * @param vpcConfig The VPC security groups and subnets that are attached to a project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df2a2d2ae5f1ca61f8c8ff9591f17a830493355ada3b5763b8dae3c57d42ea1c")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnTestGridProject =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.devicefarm.CfnTestGridProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTestGridProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTestGridProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnTestGridProject):
        CfnTestGridProject = CfnTestGridProject(cdkObject)

    internal fun unwrap(wrapped: CfnTestGridProject):
        software.amazon.awscdk.services.devicefarm.CfnTestGridProject = wrapped.cdkObject
  }

  /**
   * The VPC security groups and subnets attached to the `TestGrid` project.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-testgridproject-vpcconfig.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-testgridproject-vpcconfig.html#cfn-devicefarm-testgridproject-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * A list of VPC subnet IDs.
     *
     * A subnet is a range of IP addresses in your VPC. You can launch Amazon resources, such as EC2
     * instances, into a specific subnet. When you create a subnet, you specify the IPv4 CIDR block for
     * the subnet, which is a subset of the VPC CIDR block. See [VPCs and
     * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon
     * Virtual Private Cloud user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-testgridproject-vpcconfig.html#cfn-devicefarm-testgridproject-vpcconfig-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * A list of VPC IDs.
     *
     * Each VPC is given a unique ID upon creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-testgridproject-vpcconfig.html#cfn-devicefarm-testgridproject-vpcconfig-vpcid)
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
       * @param subnetIds A list of VPC subnet IDs. 
       * A subnet is a range of IP addresses in your VPC. You can launch Amazon resources, such as
       * EC2 instances, into a specific subnet. When you create a subnet, you specify the IPv4 CIDR
       * block for the subnet, which is a subset of the VPC CIDR block. See [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon
       * Virtual Private Cloud user guide* .
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds A list of VPC subnet IDs. 
       * A subnet is a range of IP addresses in your VPC. You can launch Amazon resources, such as
       * EC2 instances, into a specific subnet. When you create a subnet, you specify the IPv4 CIDR
       * block for the subnet, which is a subset of the VPC CIDR block. See [VPCs and
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
          software.amazon.awscdk.services.devicefarm.CfnTestGridProject.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.devicefarm.CfnTestGridProject.VpcConfigProperty.builder()

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
       * @param subnetIds A list of VPC subnet IDs. 
       * A subnet is a range of IP addresses in your VPC. You can launch Amazon resources, such as
       * EC2 instances, into a specific subnet. When you create a subnet, you specify the IPv4 CIDR
       * block for the subnet, which is a subset of the VPC CIDR block. See [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon
       * Virtual Private Cloud user guide* .
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds A list of VPC subnet IDs. 
       * A subnet is a range of IP addresses in your VPC. You can launch Amazon resources, such as
       * EC2 instances, into a specific subnet. When you create a subnet, you specify the IPv4 CIDR
       * block for the subnet, which is a subset of the VPC CIDR block. See [VPCs and
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

      public fun build():
          software.amazon.awscdk.services.devicefarm.CfnTestGridProject.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.devicefarm.CfnTestGridProject.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * A list of VPC security group IDs.
       *
       * A security group allows inbound traffic from network interfaces (and their associated
       * instances) that are assigned to the same security group. See [Security
       * groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the
       * *Amazon Virtual Private Cloud user guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-testgridproject-vpcconfig.html#cfn-devicefarm-testgridproject-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * A list of VPC subnet IDs.
       *
       * A subnet is a range of IP addresses in your VPC. You can launch Amazon resources, such as
       * EC2 instances, into a specific subnet. When you create a subnet, you specify the IPv4 CIDR
       * block for the subnet, which is a subset of the VPC CIDR block. See [VPCs and
       * subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the *Amazon
       * Virtual Private Cloud user guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-testgridproject-vpcconfig.html#cfn-devicefarm-testgridproject-vpcconfig-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

      /**
       * A list of VPC IDs.
       *
       * Each VPC is given a unique ID upon creation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-testgridproject-vpcconfig.html#cfn-devicefarm-testgridproject-vpcconfig-vpcid)
       */
      override fun vpcId(): String = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnTestGridProject.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.devicefarm.CfnTestGridProject.VpcConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.devicefarm.CfnTestGridProject.VpcConfigProperty
    }
  }
}

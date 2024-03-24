@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStack`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opsworks.*;
 * Object customJson;
 * CfnStackProps cfnStackProps = CfnStackProps.builder()
 * .defaultInstanceProfileArn("defaultInstanceProfileArn")
 * .name("name")
 * .serviceRoleArn("serviceRoleArn")
 * // the properties below are optional
 * .agentVersion("agentVersion")
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .chefConfiguration(ChefConfigurationProperty.builder()
 * .berkshelfVersion("berkshelfVersion")
 * .manageBerkshelf(false)
 * .build())
 * .cloneAppIds(List.of("cloneAppIds"))
 * .clonePermissions(false)
 * .configurationManager(StackConfigurationManagerProperty.builder()
 * .name("name")
 * .version("version")
 * .build())
 * .customCookbooksSource(SourceProperty.builder()
 * .password("password")
 * .revision("revision")
 * .sshKey("sshKey")
 * .type("type")
 * .url("url")
 * .username("username")
 * .build())
 * .customJson(customJson)
 * .defaultAvailabilityZone("defaultAvailabilityZone")
 * .defaultOs("defaultOs")
 * .defaultRootDeviceType("defaultRootDeviceType")
 * .defaultSshKeyName("defaultSshKeyName")
 * .defaultSubnetId("defaultSubnetId")
 * .ecsClusterArn("ecsClusterArn")
 * .elasticIps(List.of(ElasticIpProperty.builder()
 * .ip("ip")
 * // the properties below are optional
 * .name("name")
 * .build()))
 * .hostnameTheme("hostnameTheme")
 * .rdsDbInstances(List.of(RdsDbInstanceProperty.builder()
 * .dbPassword("dbPassword")
 * .dbUser("dbUser")
 * .rdsDbInstanceArn("rdsDbInstanceArn")
 * .build()))
 * .sourceStackId("sourceStackId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .useCustomCookbooks(false)
 * .useOpsworksSecurityGroups(false)
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html)
 */
public interface CfnStackProps {
  /**
   * The default AWS OpsWorks Stacks agent version. You have the following options:.
   *
   * * Auto-update - Set this parameter to `LATEST` . AWS OpsWorks Stacks automatically installs new
   * agent versions on the stack's instances as soon as they are available.
   * * Fixed version - Set this parameter to your preferred agent version. To update the agent
   * version, you must edit the stack configuration and specify a new version. AWS OpsWorks Stacks
   * installs that version on the stack's instances.
   *
   * The default setting is the most recent release of the agent. To specify an agent version, you
   * must use the complete version number, not the abbreviated number shown on the console. For a list
   * of available agent version numbers, call `DescribeAgentVersions` . AgentVersion cannot be set to
   * Chef 12.2.
   *
   *
   * You can also specify an agent version when you create or update an instance, which overrides
   * the stack's default setting.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion)
   */
  public fun agentVersion(): String? = unwrap(this).getAgentVersion()

  /**
   * One or more user-defined key-value pairs to be added to the stack attributes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes)
   */
  public fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
   * version on Chef 11.10 stacks. For more information, see [Create a New
   * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
   */
  public fun chefConfiguration(): Any? = unwrap(this).getChefConfiguration()

  /**
   * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from the
   * source stack to include in the cloned stack.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids)
   */
  public fun cloneAppIds(): List<String> = unwrap(this).getCloneAppIds() ?: emptyList()

  /**
   * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's
   * permissions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions)
   */
  public fun clonePermissions(): Any? = unwrap(this).getClonePermissions()

  /**
   * The configuration manager.
   *
   * When you create a stack we recommend that you use the configuration manager to specify the Chef
   * version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for
   * Linux stacks is currently 12.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configurationmanager)
   */
  public fun configurationManager(): Any? = unwrap(this).getConfigurationManager()

  /**
   * Contains the information required to retrieve an app or cookbook from a repository.
   *
   * For more information, see [Adding
   * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
   * [Cookbooks and
   * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customcookbookssource)
   */
  public fun customCookbooksSource(): Any? = unwrap(this).getCustomCookbooksSource()

  /**
   * A string that contains user-defined, custom JSON.
   *
   * It can be used to override the corresponding default stack configuration attribute values or to
   * pass data to recipes. The string should be in the following format:
   *
   * `"{\"key1\": \"value1\", \"key2\": \"value2\",...}"`
   *
   * For more information about custom JSON, see [Use Custom JSON to Modify the Stack Configuration
   * Attributes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customjson)
   */
  public fun customJson(): Any? = unwrap(this).getCustomJson()

  /**
   * The stack's default Availability Zone, which must be in the specified region.
   *
   * For more information, see [Regions and
   * Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html) . If you also specify a value
   * for `DefaultSubnetId` , the subnet must be in the same zone. For more information, see the `VpcId`
   * parameter description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultavailabilityzone)
   */
  public fun defaultAvailabilityZone(): String? = unwrap(this).getDefaultAvailabilityZone()

  /**
   * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the
   * stack's EC2 instances.
   *
   * For more information about IAM ARNs, see [Using
   * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprofilearn)
   */
  public fun defaultInstanceProfileArn(): String

  /**
   * The stack's default operating system, which is installed on every instance unless you specify a
   * different operating system when you create the instance.
   *
   * You can specify one of the following.
   *
   * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
   * `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon Linux 2016.09`
   * , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux 2015.03` .
   * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
   * `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
   * * `CentOS Linux 7`
   * * `Red Hat Enterprise Linux 7`
   * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
   * `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server 2012 R2
   * with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL Server Web` .
   * * A custom AMI: `Custom` . You specify the custom AMI you want to use when you create
   * instances. For more information, see [Using Custom
   * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
   *
   * The default option is the current Amazon Linux version. Not all operating systems are supported
   * with all versions of Chef. For more information about supported operating systems, see [AWS
   * OpsWorks Stacks Operating
   * Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos)
   */
  public fun defaultOs(): String? = unwrap(this).getDefaultOs()

  /**
   * The default root device type.
   *
   * This value is the default for all instances in the stack, but you can override it when you
   * create an instance. The default option is `instance-store` . For more information, see [Storage
   * for the Root
   * Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype)
   */
  public fun defaultRootDeviceType(): String? = unwrap(this).getDefaultRootDeviceType()

  /**
   * A default Amazon EC2 key pair name.
   *
   * The default value is none. If you specify a key pair name, AWS OpsWorks installs the public key
   * on the instance and you can use the private key with an SSH client to log in to the instance. For
   * more information, see [Using SSH to Communicate with an
   * Instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html) and
   * [Managing SSH
   * Access](https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html) . You can
   * override this setting by specifying a different key pair, or no key pair, when you [create an
   * instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname)
   */
  public fun defaultSshKeyName(): String? = unwrap(this).getDefaultSshKeyName()

  /**
   * The stack's default subnet ID.
   *
   * All instances are launched into this subnet unless you specify another subnet ID when you
   * create the instance. This parameter is required if you specify a value for the `VpcId` parameter.
   * If you also specify a value for `DefaultAvailabilityZone` , the subnet must be in that zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsubnetid)
   */
  public fun defaultSubnetId(): String? = unwrap(this).getDefaultSubnetId()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Elastic Container Service ( Amazon ECS ) cluster
   * to register with the AWS OpsWorks stack.
   *
   *
   * If you specify a cluster that's registered with another AWS OpsWorks stack, AWS CloudFormation
   * deregisters the existing association before registering the cluster.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn)
   */
  public fun ecsClusterArn(): String? = unwrap(this).getEcsClusterArn()

  /**
   * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
   *
   *
   * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
   * CloudFormation deregisters the existing association before registering the IP address.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
   */
  public fun elasticIps(): Any? = unwrap(this).getElasticIps()

  /**
   * The stack's host name theme, with spaces replaced by underscores.
   *
   * The theme is used to generate host names for the stack's instances. By default, `HostnameTheme`
   * is set to `Layer_Dependent` , which creates host names by appending integers to the layer's short
   * name. The other themes are:
   *
   * * `Baked_Goods`
   * * `Clouds`
   * * `Europe_Cities`
   * * `Fruits`
   * * `Greek_Deities_and_Titans`
   * * `Legendary_creatures_from_Japan`
   * * `Planets_and_Moons`
   * * `Roman_Deities`
   * * `Scottish_Islands`
   * * `US_Cities`
   * * `Wild_Cats`
   *
   * To obtain a generated host name, call `GetHostNameSuggestion` , which returns a host name based
   * on the current theme.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme)
   */
  public fun hostnameTheme(): String? = unwrap(this).getHostnameTheme()

  /**
   * The stack name.
   *
   * Stack names can be a maximum of 64 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name)
   */
  public fun name(): String

  /**
   * The Amazon Relational Database Service ( Amazon RDS ) database instance to register with the
   * AWS OpsWorks stack.
   *
   *
   * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
   * CloudFormation deregisters the existing association before registering the database instance.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances)
   */
  public fun rdsDbInstances(): Any? = unwrap(this).getRdsDbInstances()

  /**
   * The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS resources on your
   * behalf.
   *
   * You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. For
   * more information about IAM ARNs, see [Using
   * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn)
   */
  public fun serviceRoleArn(): String

  /**
   * If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS OpsWorks stack to
   * clone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid)
   */
  public fun sourceStackId(): String? = unwrap(this).getSourceStackId()

  /**
   * A map that contains tag keys and tag values that are attached to a stack or layer.
   *
   * * The key cannot be empty.
   * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or
   * separators, or the following special characters: `+ - = . _ : /`
   * * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or
   * separators, or the following special characters: `+ - = . _ : /`
   * * Leading and trailing white spaces are trimmed from both the key and value.
   * * A maximum of 40 tags is allowed for any resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Whether the stack uses custom cookbooks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-usecustomcookbooks)
   */
  public fun useCustomCookbooks(): Any? = unwrap(this).getUseCustomCookbooks()

  /**
   * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.
   *
   * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer,
   * which are associated with layers by default. With `UseOpsworksSecurityGroups` you can instead
   * provide your own custom security groups. `UseOpsworksSecurityGroups` has the following settings:
   *
   * * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group
   * with each layer (default setting). You can associate additional security groups with a layer after
   * you create it, but you cannot delete the built-in security group.
   * * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must
   * create appropriate EC2 security groups and associate a security group with each layer that you
   * create. However, you can still manually associate a built-in security group with a layer on
   * creation; custom security groups are required only for those layers that need custom settings.
   *
   * For more information, see [Create a New
   * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups)
   */
  public fun useOpsworksSecurityGroups(): Any? = unwrap(this).getUseOpsworksSecurityGroups()

  /**
   * The ID of the VPC that the stack is to be launched into.
   *
   * The VPC must be in the stack's region. All instances are launched into this VPC. You cannot
   * change the ID later.
   *
   * * If your account supports EC2-Classic, the default value is `no VPC` .
   * * If your account does not support EC2-Classic, the default value is the default VPC for the
   * specified region.
   *
   * If the VPC ID corresponds to a default VPC and you have specified either the
   * `DefaultAvailabilityZone` or the `DefaultSubnetId` parameter only, AWS OpsWorks Stacks infers the
   * value of the other parameter. If you specify neither parameter, AWS OpsWorks Stacks sets these
   * parameters to the first valid Availability Zone for the specified region and the corresponding
   * default VPC subnet ID, respectively.
   *
   * If you specify a nondefault VPC ID, note the following:
   *
   * * It must belong to a VPC in your account that is in the specified region.
   * * You must specify a value for `DefaultSubnetId` .
   *
   * For more information about how to use AWS OpsWorks Stacks with a VPC, see [Running a Stack in a
   * VPC](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html) . For more
   * information about default VPC and EC2-Classic, see [Supported
   * Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid)
   */
  public fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * A builder for [CfnStackProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param agentVersion The default AWS OpsWorks Stacks agent version. You have the following
     * options:.
     * * Auto-update - Set this parameter to `LATEST` . AWS OpsWorks Stacks automatically installs
     * new agent versions on the stack's instances as soon as they are available.
     * * Fixed version - Set this parameter to your preferred agent version. To update the agent
     * version, you must edit the stack configuration and specify a new version. AWS OpsWorks Stacks
     * installs that version on the stack's instances.
     *
     * The default setting is the most recent release of the agent. To specify an agent version, you
     * must use the complete version number, not the abbreviated number shown on the console. For a
     * list of available agent version numbers, call `DescribeAgentVersions` . AgentVersion cannot be
     * set to Chef 12.2.
     *
     *
     * You can also specify an agent version when you create or update an instance, which overrides
     * the stack's default setting.
     */
    public fun agentVersion(agentVersion: String)

    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes.
     */
    public fun attributes(attributes: IResolvable)

    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes.
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     */
    public fun chefConfiguration(chefConfiguration: IResolvable)

    /**
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     */
    public fun chefConfiguration(chefConfiguration: CfnStack.ChefConfigurationProperty)

    /**
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce5b2ed84bf8a02581536d76d9ffcb6a2544382d6574f369d866043395824fee")
    public
        fun chefConfiguration(chefConfiguration: CfnStack.ChefConfigurationProperty.Builder.() -> Unit)

    /**
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     * application stack IDs from the source stack to include in the cloned stack.
     */
    public fun cloneAppIds(cloneAppIds: List<String>)

    /**
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     * application stack IDs from the source stack to include in the cloned stack.
     */
    public fun cloneAppIds(vararg cloneAppIds: String)

    /**
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     * the source stack's permissions.
     */
    public fun clonePermissions(clonePermissions: Boolean)

    /**
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     * the source stack's permissions.
     */
    public fun clonePermissions(clonePermissions: IResolvable)

    /**
     * @param configurationManager The configuration manager.
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     */
    public fun configurationManager(configurationManager: IResolvable)

    /**
     * @param configurationManager The configuration manager.
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     */
    public
        fun configurationManager(configurationManager: CfnStack.StackConfigurationManagerProperty)

    /**
     * @param configurationManager The configuration manager.
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ec23e002717b9da62167eef1b3c231d2ae8b8bcd33230dc6018893d5f2bfb1b")
    public
        fun configurationManager(configurationManager: CfnStack.StackConfigurationManagerProperty.Builder.() -> Unit)

    /**
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository.
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     */
    public fun customCookbooksSource(customCookbooksSource: IResolvable)

    /**
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository.
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     */
    public fun customCookbooksSource(customCookbooksSource: CfnStack.SourceProperty)

    /**
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository.
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e8d5340deac08f795f23fc538b30c0c2287f7297f6bf120afcbe8746b3a6868")
    public
        fun customCookbooksSource(customCookbooksSource: CfnStack.SourceProperty.Builder.() -> Unit)

    /**
     * @param customJson A string that contains user-defined, custom JSON.
     * It can be used to override the corresponding default stack configuration attribute values or
     * to pass data to recipes. The string should be in the following format:
     *
     * `"{\"key1\": \"value1\", \"key2\": \"value2\",...}"`
     *
     * For more information about custom JSON, see [Use Custom JSON to Modify the Stack
     * Configuration
     * Attributes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html) .
     */
    public fun customJson(customJson: Any)

    /**
     * @param defaultAvailabilityZone The stack's default Availability Zone, which must be in the
     * specified region.
     * For more information, see [Regions and
     * Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html) . If you also specify a
     * value for `DefaultSubnetId` , the subnet must be in the same zone. For more information, see the
     * `VpcId` parameter description.
     */
    public fun defaultAvailabilityZone(defaultAvailabilityZone: String)

    /**
     * @param defaultInstanceProfileArn The Amazon Resource Name (ARN) of an IAM profile that is the
     * default profile for all of the stack's EC2 instances. 
     * For more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     */
    public fun defaultInstanceProfileArn(defaultInstanceProfileArn: String)

    /**
     * @param defaultOs The stack's default operating system, which is installed on every instance
     * unless you specify a different operating system when you create the instance.
     * You can specify one of the following.
     *
     * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
     * `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon Linux
     * 2016.09` , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux 2015.03` .
     * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
     * `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
     * * `CentOS Linux 7`
     * * `Red Hat Enterprise Linux 7`
     * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
     * `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server 2012 R2
     * with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL Server Web` .
     * * A custom AMI: `Custom` . You specify the custom AMI you want to use when you create
     * instances. For more information, see [Using Custom
     * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
     *
     * The default option is the current Amazon Linux version. Not all operating systems are
     * supported with all versions of Chef. For more information about supported operating systems, see
     * [AWS OpsWorks Stacks Operating
     * Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html) .
     */
    public fun defaultOs(defaultOs: String)

    /**
     * @param defaultRootDeviceType The default root device type.
     * This value is the default for all instances in the stack, but you can override it when you
     * create an instance. The default option is `instance-store` . For more information, see [Storage
     * for the Root
     * Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
     * .
     */
    public fun defaultRootDeviceType(defaultRootDeviceType: String)

    /**
     * @param defaultSshKeyName A default Amazon EC2 key pair name.
     * The default value is none. If you specify a key pair name, AWS OpsWorks installs the public
     * key on the instance and you can use the private key with an SSH client to log in to the
     * instance. For more information, see [Using SSH to Communicate with an
     * Instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html) and
     * [Managing SSH
     * Access](https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html) . You
     * can override this setting by specifying a different key pair, or no key pair, when you [create
     * an instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html) .
     */
    public fun defaultSshKeyName(defaultSshKeyName: String)

    /**
     * @param defaultSubnetId The stack's default subnet ID.
     * All instances are launched into this subnet unless you specify another subnet ID when you
     * create the instance. This parameter is required if you specify a value for the `VpcId`
     * parameter. If you also specify a value for `DefaultAvailabilityZone` , the subnet must be in
     * that zone.
     */
    public fun defaultSubnetId(defaultSubnetId: String)

    /**
     * @param ecsClusterArn The Amazon Resource Name (ARN) of the Amazon Elastic Container Service (
     * Amazon ECS ) cluster to register with the AWS OpsWorks stack.
     *
     * If you specify a cluster that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the cluster.
     */
    public fun ecsClusterArn(ecsClusterArn: String)

    /**
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     */
    public fun elasticIps(elasticIps: IResolvable)

    /**
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     */
    public fun elasticIps(elasticIps: List<Any>)

    /**
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     */
    public fun elasticIps(vararg elasticIps: Any)

    /**
     * @param hostnameTheme The stack's host name theme, with spaces replaced by underscores.
     * The theme is used to generate host names for the stack's instances. By default,
     * `HostnameTheme` is set to `Layer_Dependent` , which creates host names by appending integers to
     * the layer's short name. The other themes are:
     *
     * * `Baked_Goods`
     * * `Clouds`
     * * `Europe_Cities`
     * * `Fruits`
     * * `Greek_Deities_and_Titans`
     * * `Legendary_creatures_from_Japan`
     * * `Planets_and_Moons`
     * * `Roman_Deities`
     * * `Scottish_Islands`
     * * `US_Cities`
     * * `Wild_Cats`
     *
     * To obtain a generated host name, call `GetHostNameSuggestion` , which returns a host name
     * based on the current theme.
     */
    public fun hostnameTheme(hostnameTheme: String)

    /**
     * @param name The stack name. 
     * Stack names can be a maximum of 64 characters.
     */
    public fun name(name: String)

    /**
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     */
    public fun rdsDbInstances(rdsDbInstances: IResolvable)

    /**
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     */
    public fun rdsDbInstances(rdsDbInstances: List<Any>)

    /**
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     */
    public fun rdsDbInstances(vararg rdsDbInstances: Any)

    /**
     * @param serviceRoleArn The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS
     * resources on your behalf. 
     * You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. For
     * more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     */
    public fun serviceRoleArn(serviceRoleArn: String)

    /**
     * @param sourceStackId If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS
     * OpsWorks stack to clone.
     */
    public fun sourceStackId(sourceStackId: String)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     * layer.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /`
     * * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or
     * separators, or the following special characters: `+ - = . _ : /`
     * * Leading and trailing white spaces are trimmed from both the key and value.
     * * A maximum of 40 tags is allowed for any resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     * layer.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /`
     * * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or
     * separators, or the following special characters: `+ - = . _ : /`
     * * Leading and trailing white spaces are trimmed from both the key and value.
     * * A maximum of 40 tags is allowed for any resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param useCustomCookbooks Whether the stack uses custom cookbooks.
     */
    public fun useCustomCookbooks(useCustomCookbooks: Boolean)

    /**
     * @param useCustomCookbooks Whether the stack uses custom cookbooks.
     */
    public fun useCustomCookbooks(useCustomCookbooks: IResolvable)

    /**
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     * security groups with the stack's layers.
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer,
     * which are associated with layers by default. With `UseOpsworksSecurityGroups` you can instead
     * provide your own custom security groups. `UseOpsworksSecurityGroups` has the following settings:
     *
     * * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group
     * with each layer (default setting). You can associate additional security groups with a layer
     * after you create it, but you cannot delete the built-in security group.
     * * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You
     * must create appropriate EC2 security groups and associate a security group with each layer that
     * you create. However, you can still manually associate a built-in security group with a layer on
     * creation; custom security groups are required only for those layers that need custom settings.
     *
     * For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     */
    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: Boolean)

    /**
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     * security groups with the stack's layers.
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer,
     * which are associated with layers by default. With `UseOpsworksSecurityGroups` you can instead
     * provide your own custom security groups. `UseOpsworksSecurityGroups` has the following settings:
     *
     * * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group
     * with each layer (default setting). You can associate additional security groups with a layer
     * after you create it, but you cannot delete the built-in security group.
     * * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You
     * must create appropriate EC2 security groups and associate a security group with each layer that
     * you create. However, you can still manually associate a built-in security group with a layer on
     * creation; custom security groups are required only for those layers that need custom settings.
     *
     * For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     */
    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: IResolvable)

    /**
     * @param vpcId The ID of the VPC that the stack is to be launched into.
     * The VPC must be in the stack's region. All instances are launched into this VPC. You cannot
     * change the ID later.
     *
     * * If your account supports EC2-Classic, the default value is `no VPC` .
     * * If your account does not support EC2-Classic, the default value is the default VPC for the
     * specified region.
     *
     * If the VPC ID corresponds to a default VPC and you have specified either the
     * `DefaultAvailabilityZone` or the `DefaultSubnetId` parameter only, AWS OpsWorks Stacks infers
     * the value of the other parameter. If you specify neither parameter, AWS OpsWorks Stacks sets
     * these parameters to the first valid Availability Zone for the specified region and the
     * corresponding default VPC subnet ID, respectively.
     *
     * If you specify a nondefault VPC ID, note the following:
     *
     * * It must belong to a VPC in your account that is in the specified region.
     * * You must specify a value for `DefaultSubnetId` .
     *
     * For more information about how to use AWS OpsWorks Stacks with a VPC, see [Running a Stack in
     * a VPC](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html) . For more
     * information about default VPC and EC2-Classic, see [Supported
     * Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html) .
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnStackProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnStackProps.builder()

    /**
     * @param agentVersion The default AWS OpsWorks Stacks agent version. You have the following
     * options:.
     * * Auto-update - Set this parameter to `LATEST` . AWS OpsWorks Stacks automatically installs
     * new agent versions on the stack's instances as soon as they are available.
     * * Fixed version - Set this parameter to your preferred agent version. To update the agent
     * version, you must edit the stack configuration and specify a new version. AWS OpsWorks Stacks
     * installs that version on the stack's instances.
     *
     * The default setting is the most recent release of the agent. To specify an agent version, you
     * must use the complete version number, not the abbreviated number shown on the console. For a
     * list of available agent version numbers, call `DescribeAgentVersions` . AgentVersion cannot be
     * set to Chef 12.2.
     *
     *
     * You can also specify an agent version when you create or update an instance, which overrides
     * the stack's default setting.
     */
    override fun agentVersion(agentVersion: String) {
      cdkBuilder.agentVersion(agentVersion)
    }

    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes.
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes.
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     */
    override fun chefConfiguration(chefConfiguration: IResolvable) {
      cdkBuilder.chefConfiguration(chefConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     */
    override fun chefConfiguration(chefConfiguration: CfnStack.ChefConfigurationProperty) {
      cdkBuilder.chefConfiguration(chefConfiguration.let(CfnStack.ChefConfigurationProperty::unwrap))
    }

    /**
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce5b2ed84bf8a02581536d76d9ffcb6a2544382d6574f369d866043395824fee")
    override
        fun chefConfiguration(chefConfiguration: CfnStack.ChefConfigurationProperty.Builder.() -> Unit):
        Unit = chefConfiguration(CfnStack.ChefConfigurationProperty(chefConfiguration))

    /**
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     * application stack IDs from the source stack to include in the cloned stack.
     */
    override fun cloneAppIds(cloneAppIds: List<String>) {
      cdkBuilder.cloneAppIds(cloneAppIds)
    }

    /**
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     * application stack IDs from the source stack to include in the cloned stack.
     */
    override fun cloneAppIds(vararg cloneAppIds: String): Unit = cloneAppIds(cloneAppIds.toList())

    /**
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     * the source stack's permissions.
     */
    override fun clonePermissions(clonePermissions: Boolean) {
      cdkBuilder.clonePermissions(clonePermissions)
    }

    /**
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     * the source stack's permissions.
     */
    override fun clonePermissions(clonePermissions: IResolvable) {
      cdkBuilder.clonePermissions(clonePermissions.let(IResolvable::unwrap))
    }

    /**
     * @param configurationManager The configuration manager.
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     */
    override fun configurationManager(configurationManager: IResolvable) {
      cdkBuilder.configurationManager(configurationManager.let(IResolvable::unwrap))
    }

    /**
     * @param configurationManager The configuration manager.
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     */
    override
        fun configurationManager(configurationManager: CfnStack.StackConfigurationManagerProperty) {
      cdkBuilder.configurationManager(configurationManager.let(CfnStack.StackConfigurationManagerProperty::unwrap))
    }

    /**
     * @param configurationManager The configuration manager.
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ec23e002717b9da62167eef1b3c231d2ae8b8bcd33230dc6018893d5f2bfb1b")
    override
        fun configurationManager(configurationManager: CfnStack.StackConfigurationManagerProperty.Builder.() -> Unit):
        Unit =
        configurationManager(CfnStack.StackConfigurationManagerProperty(configurationManager))

    /**
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository.
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     */
    override fun customCookbooksSource(customCookbooksSource: IResolvable) {
      cdkBuilder.customCookbooksSource(customCookbooksSource.let(IResolvable::unwrap))
    }

    /**
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository.
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     */
    override fun customCookbooksSource(customCookbooksSource: CfnStack.SourceProperty) {
      cdkBuilder.customCookbooksSource(customCookbooksSource.let(CfnStack.SourceProperty::unwrap))
    }

    /**
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository.
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e8d5340deac08f795f23fc538b30c0c2287f7297f6bf120afcbe8746b3a6868")
    override
        fun customCookbooksSource(customCookbooksSource: CfnStack.SourceProperty.Builder.() -> Unit):
        Unit = customCookbooksSource(CfnStack.SourceProperty(customCookbooksSource))

    /**
     * @param customJson A string that contains user-defined, custom JSON.
     * It can be used to override the corresponding default stack configuration attribute values or
     * to pass data to recipes. The string should be in the following format:
     *
     * `"{\"key1\": \"value1\", \"key2\": \"value2\",...}"`
     *
     * For more information about custom JSON, see [Use Custom JSON to Modify the Stack
     * Configuration
     * Attributes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html) .
     */
    override fun customJson(customJson: Any) {
      cdkBuilder.customJson(customJson)
    }

    /**
     * @param defaultAvailabilityZone The stack's default Availability Zone, which must be in the
     * specified region.
     * For more information, see [Regions and
     * Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html) . If you also specify a
     * value for `DefaultSubnetId` , the subnet must be in the same zone. For more information, see the
     * `VpcId` parameter description.
     */
    override fun defaultAvailabilityZone(defaultAvailabilityZone: String) {
      cdkBuilder.defaultAvailabilityZone(defaultAvailabilityZone)
    }

    /**
     * @param defaultInstanceProfileArn The Amazon Resource Name (ARN) of an IAM profile that is the
     * default profile for all of the stack's EC2 instances. 
     * For more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     */
    override fun defaultInstanceProfileArn(defaultInstanceProfileArn: String) {
      cdkBuilder.defaultInstanceProfileArn(defaultInstanceProfileArn)
    }

    /**
     * @param defaultOs The stack's default operating system, which is installed on every instance
     * unless you specify a different operating system when you create the instance.
     * You can specify one of the following.
     *
     * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
     * `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon Linux
     * 2016.09` , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux 2015.03` .
     * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
     * `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
     * * `CentOS Linux 7`
     * * `Red Hat Enterprise Linux 7`
     * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
     * `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server 2012 R2
     * with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL Server Web` .
     * * A custom AMI: `Custom` . You specify the custom AMI you want to use when you create
     * instances. For more information, see [Using Custom
     * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
     *
     * The default option is the current Amazon Linux version. Not all operating systems are
     * supported with all versions of Chef. For more information about supported operating systems, see
     * [AWS OpsWorks Stacks Operating
     * Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html) .
     */
    override fun defaultOs(defaultOs: String) {
      cdkBuilder.defaultOs(defaultOs)
    }

    /**
     * @param defaultRootDeviceType The default root device type.
     * This value is the default for all instances in the stack, but you can override it when you
     * create an instance. The default option is `instance-store` . For more information, see [Storage
     * for the Root
     * Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
     * .
     */
    override fun defaultRootDeviceType(defaultRootDeviceType: String) {
      cdkBuilder.defaultRootDeviceType(defaultRootDeviceType)
    }

    /**
     * @param defaultSshKeyName A default Amazon EC2 key pair name.
     * The default value is none. If you specify a key pair name, AWS OpsWorks installs the public
     * key on the instance and you can use the private key with an SSH client to log in to the
     * instance. For more information, see [Using SSH to Communicate with an
     * Instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html) and
     * [Managing SSH
     * Access](https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html) . You
     * can override this setting by specifying a different key pair, or no key pair, when you [create
     * an instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html) .
     */
    override fun defaultSshKeyName(defaultSshKeyName: String) {
      cdkBuilder.defaultSshKeyName(defaultSshKeyName)
    }

    /**
     * @param defaultSubnetId The stack's default subnet ID.
     * All instances are launched into this subnet unless you specify another subnet ID when you
     * create the instance. This parameter is required if you specify a value for the `VpcId`
     * parameter. If you also specify a value for `DefaultAvailabilityZone` , the subnet must be in
     * that zone.
     */
    override fun defaultSubnetId(defaultSubnetId: String) {
      cdkBuilder.defaultSubnetId(defaultSubnetId)
    }

    /**
     * @param ecsClusterArn The Amazon Resource Name (ARN) of the Amazon Elastic Container Service (
     * Amazon ECS ) cluster to register with the AWS OpsWorks stack.
     *
     * If you specify a cluster that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the cluster.
     */
    override fun ecsClusterArn(ecsClusterArn: String) {
      cdkBuilder.ecsClusterArn(ecsClusterArn)
    }

    /**
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     */
    override fun elasticIps(elasticIps: IResolvable) {
      cdkBuilder.elasticIps(elasticIps.let(IResolvable::unwrap))
    }

    /**
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     */
    override fun elasticIps(elasticIps: List<Any>) {
      cdkBuilder.elasticIps(elasticIps.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     */
    override fun elasticIps(vararg elasticIps: Any): Unit = elasticIps(elasticIps.toList())

    /**
     * @param hostnameTheme The stack's host name theme, with spaces replaced by underscores.
     * The theme is used to generate host names for the stack's instances. By default,
     * `HostnameTheme` is set to `Layer_Dependent` , which creates host names by appending integers to
     * the layer's short name. The other themes are:
     *
     * * `Baked_Goods`
     * * `Clouds`
     * * `Europe_Cities`
     * * `Fruits`
     * * `Greek_Deities_and_Titans`
     * * `Legendary_creatures_from_Japan`
     * * `Planets_and_Moons`
     * * `Roman_Deities`
     * * `Scottish_Islands`
     * * `US_Cities`
     * * `Wild_Cats`
     *
     * To obtain a generated host name, call `GetHostNameSuggestion` , which returns a host name
     * based on the current theme.
     */
    override fun hostnameTheme(hostnameTheme: String) {
      cdkBuilder.hostnameTheme(hostnameTheme)
    }

    /**
     * @param name The stack name. 
     * Stack names can be a maximum of 64 characters.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     */
    override fun rdsDbInstances(rdsDbInstances: IResolvable) {
      cdkBuilder.rdsDbInstances(rdsDbInstances.let(IResolvable::unwrap))
    }

    /**
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     */
    override fun rdsDbInstances(rdsDbInstances: List<Any>) {
      cdkBuilder.rdsDbInstances(rdsDbInstances.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     */
    override fun rdsDbInstances(vararg rdsDbInstances: Any): Unit =
        rdsDbInstances(rdsDbInstances.toList())

    /**
     * @param serviceRoleArn The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS
     * resources on your behalf. 
     * You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. For
     * more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     */
    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * @param sourceStackId If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS
     * OpsWorks stack to clone.
     */
    override fun sourceStackId(sourceStackId: String) {
      cdkBuilder.sourceStackId(sourceStackId)
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     * layer.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /`
     * * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or
     * separators, or the following special characters: `+ - = . _ : /`
     * * Leading and trailing white spaces are trimmed from both the key and value.
     * * A maximum of 40 tags is allowed for any resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     * layer.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /`
     * * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or
     * separators, or the following special characters: `+ - = . _ : /`
     * * Leading and trailing white spaces are trimmed from both the key and value.
     * * A maximum of 40 tags is allowed for any resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param useCustomCookbooks Whether the stack uses custom cookbooks.
     */
    override fun useCustomCookbooks(useCustomCookbooks: Boolean) {
      cdkBuilder.useCustomCookbooks(useCustomCookbooks)
    }

    /**
     * @param useCustomCookbooks Whether the stack uses custom cookbooks.
     */
    override fun useCustomCookbooks(useCustomCookbooks: IResolvable) {
      cdkBuilder.useCustomCookbooks(useCustomCookbooks.let(IResolvable::unwrap))
    }

    /**
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     * security groups with the stack's layers.
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer,
     * which are associated with layers by default. With `UseOpsworksSecurityGroups` you can instead
     * provide your own custom security groups. `UseOpsworksSecurityGroups` has the following settings:
     *
     * * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group
     * with each layer (default setting). You can associate additional security groups with a layer
     * after you create it, but you cannot delete the built-in security group.
     * * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You
     * must create appropriate EC2 security groups and associate a security group with each layer that
     * you create. However, you can still manually associate a built-in security group with a layer on
     * creation; custom security groups are required only for those layers that need custom settings.
     *
     * For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     */
    override fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: Boolean) {
      cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups)
    }

    /**
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     * security groups with the stack's layers.
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer,
     * which are associated with layers by default. With `UseOpsworksSecurityGroups` you can instead
     * provide your own custom security groups. `UseOpsworksSecurityGroups` has the following settings:
     *
     * * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group
     * with each layer (default setting). You can associate additional security groups with a layer
     * after you create it, but you cannot delete the built-in security group.
     * * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You
     * must create appropriate EC2 security groups and associate a security group with each layer that
     * you create. However, you can still manually associate a built-in security group with a layer on
     * creation; custom security groups are required only for those layers that need custom settings.
     *
     * For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     */
    override fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: IResolvable) {
      cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups.let(IResolvable::unwrap))
    }

    /**
     * @param vpcId The ID of the VPC that the stack is to be launched into.
     * The VPC must be in the stack's region. All instances are launched into this VPC. You cannot
     * change the ID later.
     *
     * * If your account supports EC2-Classic, the default value is `no VPC` .
     * * If your account does not support EC2-Classic, the default value is the default VPC for the
     * specified region.
     *
     * If the VPC ID corresponds to a default VPC and you have specified either the
     * `DefaultAvailabilityZone` or the `DefaultSubnetId` parameter only, AWS OpsWorks Stacks infers
     * the value of the other parameter. If you specify neither parameter, AWS OpsWorks Stacks sets
     * these parameters to the first valid Availability Zone for the specified region and the
     * corresponding default VPC subnet ID, respectively.
     *
     * If you specify a nondefault VPC ID, note the following:
     *
     * * It must belong to a VPC in your account that is in the specified region.
     * * You must specify a value for `DefaultSubnetId` .
     *
     * For more information about how to use AWS OpsWorks Stacks with a VPC, see [Running a Stack in
     * a VPC](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html) . For more
     * information about default VPC and EC2-Classic, see [Supported
     * Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html) .
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnStackProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opsworks.CfnStackProps,
  ) : CdkObject(cdkObject), CfnStackProps {
    /**
     * The default AWS OpsWorks Stacks agent version. You have the following options:.
     *
     * * Auto-update - Set this parameter to `LATEST` . AWS OpsWorks Stacks automatically installs
     * new agent versions on the stack's instances as soon as they are available.
     * * Fixed version - Set this parameter to your preferred agent version. To update the agent
     * version, you must edit the stack configuration and specify a new version. AWS OpsWorks Stacks
     * installs that version on the stack's instances.
     *
     * The default setting is the most recent release of the agent. To specify an agent version, you
     * must use the complete version number, not the abbreviated number shown on the console. For a
     * list of available agent version numbers, call `DescribeAgentVersions` . AgentVersion cannot be
     * set to Chef 12.2.
     *
     *
     * You can also specify an agent version when you create or update an instance, which overrides
     * the stack's default setting.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion)
     */
    override fun agentVersion(): String? = unwrap(this).getAgentVersion()

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes)
     */
    override fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
     * version on Chef 11.10 stacks. For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
     */
    override fun chefConfiguration(): Any? = unwrap(this).getChefConfiguration()

    /**
     * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from
     * the source stack to include in the cloned stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids)
     */
    override fun cloneAppIds(): List<String> = unwrap(this).getCloneAppIds() ?: emptyList()

    /**
     * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's
     * permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions)
     */
    override fun clonePermissions(): Any? = unwrap(this).getClonePermissions()

    /**
     * The configuration manager.
     *
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configurationmanager)
     */
    override fun configurationManager(): Any? = unwrap(this).getConfigurationManager()

    /**
     * Contains the information required to retrieve an app or cookbook from a repository.
     *
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customcookbookssource)
     */
    override fun customCookbooksSource(): Any? = unwrap(this).getCustomCookbooksSource()

    /**
     * A string that contains user-defined, custom JSON.
     *
     * It can be used to override the corresponding default stack configuration attribute values or
     * to pass data to recipes. The string should be in the following format:
     *
     * `"{\"key1\": \"value1\", \"key2\": \"value2\",...}"`
     *
     * For more information about custom JSON, see [Use Custom JSON to Modify the Stack
     * Configuration
     * Attributes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customjson)
     */
    override fun customJson(): Any? = unwrap(this).getCustomJson()

    /**
     * The stack's default Availability Zone, which must be in the specified region.
     *
     * For more information, see [Regions and
     * Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html) . If you also specify a
     * value for `DefaultSubnetId` , the subnet must be in the same zone. For more information, see the
     * `VpcId` parameter description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultavailabilityzone)
     */
    override fun defaultAvailabilityZone(): String? = unwrap(this).getDefaultAvailabilityZone()

    /**
     * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the
     * stack's EC2 instances.
     *
     * For more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprofilearn)
     */
    override fun defaultInstanceProfileArn(): String = unwrap(this).getDefaultInstanceProfileArn()

    /**
     * The stack's default operating system, which is installed on every instance unless you specify
     * a different operating system when you create the instance.
     *
     * You can specify one of the following.
     *
     * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
     * `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon Linux
     * 2016.09` , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux 2015.03` .
     * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
     * `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
     * * `CentOS Linux 7`
     * * `Red Hat Enterprise Linux 7`
     * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
     * `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server 2012 R2
     * with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL Server Web` .
     * * A custom AMI: `Custom` . You specify the custom AMI you want to use when you create
     * instances. For more information, see [Using Custom
     * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
     *
     * The default option is the current Amazon Linux version. Not all operating systems are
     * supported with all versions of Chef. For more information about supported operating systems, see
     * [AWS OpsWorks Stacks Operating
     * Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos)
     */
    override fun defaultOs(): String? = unwrap(this).getDefaultOs()

    /**
     * The default root device type.
     *
     * This value is the default for all instances in the stack, but you can override it when you
     * create an instance. The default option is `instance-store` . For more information, see [Storage
     * for the Root
     * Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype)
     */
    override fun defaultRootDeviceType(): String? = unwrap(this).getDefaultRootDeviceType()

    /**
     * A default Amazon EC2 key pair name.
     *
     * The default value is none. If you specify a key pair name, AWS OpsWorks installs the public
     * key on the instance and you can use the private key with an SSH client to log in to the
     * instance. For more information, see [Using SSH to Communicate with an
     * Instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html) and
     * [Managing SSH
     * Access](https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html) . You
     * can override this setting by specifying a different key pair, or no key pair, when you [create
     * an instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname)
     */
    override fun defaultSshKeyName(): String? = unwrap(this).getDefaultSshKeyName()

    /**
     * The stack's default subnet ID.
     *
     * All instances are launched into this subnet unless you specify another subnet ID when you
     * create the instance. This parameter is required if you specify a value for the `VpcId`
     * parameter. If you also specify a value for `DefaultAvailabilityZone` , the subnet must be in
     * that zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsubnetid)
     */
    override fun defaultSubnetId(): String? = unwrap(this).getDefaultSubnetId()

    /**
     * The Amazon Resource Name (ARN) of the Amazon Elastic Container Service ( Amazon ECS ) cluster
     * to register with the AWS OpsWorks stack.
     *
     *
     * If you specify a cluster that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the cluster.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn)
     */
    override fun ecsClusterArn(): String? = unwrap(this).getEcsClusterArn()

    /**
     * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
     */
    override fun elasticIps(): Any? = unwrap(this).getElasticIps()

    /**
     * The stack's host name theme, with spaces replaced by underscores.
     *
     * The theme is used to generate host names for the stack's instances. By default,
     * `HostnameTheme` is set to `Layer_Dependent` , which creates host names by appending integers to
     * the layer's short name. The other themes are:
     *
     * * `Baked_Goods`
     * * `Clouds`
     * * `Europe_Cities`
     * * `Fruits`
     * * `Greek_Deities_and_Titans`
     * * `Legendary_creatures_from_Japan`
     * * `Planets_and_Moons`
     * * `Roman_Deities`
     * * `Scottish_Islands`
     * * `US_Cities`
     * * `Wild_Cats`
     *
     * To obtain a generated host name, call `GetHostNameSuggestion` , which returns a host name
     * based on the current theme.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme)
     */
    override fun hostnameTheme(): String? = unwrap(this).getHostnameTheme()

    /**
     * The stack name.
     *
     * Stack names can be a maximum of 64 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Relational Database Service ( Amazon RDS ) database instance to register with the
     * AWS OpsWorks stack.
     *
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances)
     */
    override fun rdsDbInstances(): Any? = unwrap(this).getRdsDbInstances()

    /**
     * The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS resources on your
     * behalf.
     *
     * You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. For
     * more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn)
     */
    override fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

    /**
     * If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS OpsWorks stack to
     * clone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid)
     */
    override fun sourceStackId(): String? = unwrap(this).getSourceStackId()

    /**
     * A map that contains tag keys and tag values that are attached to a stack or layer.
     *
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     * or separators, or the following special characters: `+ - = . _ : /`
     * * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or
     * separators, or the following special characters: `+ - = . _ : /`
     * * Leading and trailing white spaces are trimmed from both the key and value.
     * * A maximum of 40 tags is allowed for any resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Whether the stack uses custom cookbooks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-usecustomcookbooks)
     */
    override fun useCustomCookbooks(): Any? = unwrap(this).getUseCustomCookbooks()

    /**
     * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's
     * layers.
     *
     * AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer,
     * which are associated with layers by default. With `UseOpsworksSecurityGroups` you can instead
     * provide your own custom security groups. `UseOpsworksSecurityGroups` has the following settings:
     *
     * * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group
     * with each layer (default setting). You can associate additional security groups with a layer
     * after you create it, but you cannot delete the built-in security group.
     * * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You
     * must create appropriate EC2 security groups and associate a security group with each layer that
     * you create. However, you can still manually associate a built-in security group with a layer on
     * creation; custom security groups are required only for those layers that need custom settings.
     *
     * For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups)
     */
    override fun useOpsworksSecurityGroups(): Any? = unwrap(this).getUseOpsworksSecurityGroups()

    /**
     * The ID of the VPC that the stack is to be launched into.
     *
     * The VPC must be in the stack's region. All instances are launched into this VPC. You cannot
     * change the ID later.
     *
     * * If your account supports EC2-Classic, the default value is `no VPC` .
     * * If your account does not support EC2-Classic, the default value is the default VPC for the
     * specified region.
     *
     * If the VPC ID corresponds to a default VPC and you have specified either the
     * `DefaultAvailabilityZone` or the `DefaultSubnetId` parameter only, AWS OpsWorks Stacks infers
     * the value of the other parameter. If you specify neither parameter, AWS OpsWorks Stacks sets
     * these parameters to the first valid Availability Zone for the specified region and the
     * corresponding default VPC subnet ID, respectively.
     *
     * If you specify a nondefault VPC ID, note the following:
     *
     * * It must belong to a VPC in your account that is in the specified region.
     * * You must specify a value for `DefaultSubnetId` .
     *
     * For more information about how to use AWS OpsWorks Stacks with a VPC, see [Running a Stack in
     * a VPC](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html) . For more
     * information about default VPC and EC2-Classic, see [Supported
     * Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid)
     */
    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStackProps):
        CfnStackProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStackProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackProps):
        software.amazon.awscdk.services.opsworks.CfnStackProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.opsworks.CfnStackProps
  }
}

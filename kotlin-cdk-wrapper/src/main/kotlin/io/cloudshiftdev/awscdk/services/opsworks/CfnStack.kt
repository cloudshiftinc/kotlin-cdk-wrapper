@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opsworks.*;
 * Object customJson;
 * CfnStack cfnStack = CfnStack.Builder.create(this, "MyCfnStack")
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
public open class CfnStack(
  cdkObject: software.amazon.awscdk.services.opsworks.CfnStack,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStackProps,
  ) :
      this(software.amazon.awscdk.services.opsworks.CfnStack(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStackProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStackProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStackProps(props)
  )

  /**
   * The default AWS OpsWorks Stacks agent version.
   *
   * You have the following options:.
   */
  public open fun agentVersion(): String? = unwrap(this).getAgentVersion()

  /**
   * The default AWS OpsWorks Stacks agent version.
   *
   * You have the following options:.
   */
  public open fun agentVersion(`value`: String) {
    unwrap(this).setAgentVersion(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * One or more user-defined key-value pairs to be added to the stack attributes.
   */
  public open fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * One or more user-defined key-value pairs to be added to the stack attributes.
   */
  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
  }

  /**
   * One or more user-defined key-value pairs to be added to the stack attributes.
   */
  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
   * version on Chef 11.10 stacks. For more information, see [Create a New
   * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
   */
  public open fun chefConfiguration(): Any? = unwrap(this).getChefConfiguration()

  /**
   * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
   * version on Chef 11.10 stacks. For more information, see [Create a New
   * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
   */
  public open fun chefConfiguration(`value`: IResolvable) {
    unwrap(this).setChefConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
   * version on Chef 11.10 stacks. For more information, see [Create a New
   * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
   */
  public open fun chefConfiguration(`value`: ChefConfigurationProperty) {
    unwrap(this).setChefConfiguration(`value`.let(ChefConfigurationProperty.Companion::unwrap))
  }

  /**
   * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
   * version on Chef 11.10 stacks. For more information, see [Create a New
   * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("22366ece289ebaeddc97c549e01146e6e8826a0baee8a182c309f73a27a12080")
  public open fun chefConfiguration(`value`: ChefConfigurationProperty.Builder.() -> Unit): Unit =
      chefConfiguration(ChefConfigurationProperty(`value`))

  /**
   * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from the
   * source stack to include in the cloned stack.
   */
  public open fun cloneAppIds(): List<String> = unwrap(this).getCloneAppIds() ?: emptyList()

  /**
   * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from the
   * source stack to include in the cloned stack.
   */
  public open fun cloneAppIds(`value`: List<String>) {
    unwrap(this).setCloneAppIds(`value`)
  }

  /**
   * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from the
   * source stack to include in the cloned stack.
   */
  public open fun cloneAppIds(vararg `value`: String): Unit = cloneAppIds(`value`.toList())

  /**
   * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's
   * permissions.
   */
  public open fun clonePermissions(): Any? = unwrap(this).getClonePermissions()

  /**
   * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's
   * permissions.
   */
  public open fun clonePermissions(`value`: Boolean) {
    unwrap(this).setClonePermissions(`value`)
  }

  /**
   * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's
   * permissions.
   */
  public open fun clonePermissions(`value`: IResolvable) {
    unwrap(this).setClonePermissions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration manager.
   */
  public open fun configurationManager(): Any? = unwrap(this).getConfigurationManager()

  /**
   * The configuration manager.
   */
  public open fun configurationManager(`value`: IResolvable) {
    unwrap(this).setConfigurationManager(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration manager.
   */
  public open fun configurationManager(`value`: StackConfigurationManagerProperty) {
    unwrap(this).setConfigurationManager(`value`.let(StackConfigurationManagerProperty.Companion::unwrap))
  }

  /**
   * The configuration manager.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("971da53eb407c5f3dda86ee8db18517ce2ddd693f422aa5ac1aa90c470d67a71")
  public open
      fun configurationManager(`value`: StackConfigurationManagerProperty.Builder.() -> Unit): Unit
      = configurationManager(StackConfigurationManagerProperty(`value`))

  /**
   * Contains the information required to retrieve an app or cookbook from a repository.
   */
  public open fun customCookbooksSource(): Any? = unwrap(this).getCustomCookbooksSource()

  /**
   * Contains the information required to retrieve an app or cookbook from a repository.
   */
  public open fun customCookbooksSource(`value`: IResolvable) {
    unwrap(this).setCustomCookbooksSource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains the information required to retrieve an app or cookbook from a repository.
   */
  public open fun customCookbooksSource(`value`: SourceProperty) {
    unwrap(this).setCustomCookbooksSource(`value`.let(SourceProperty.Companion::unwrap))
  }

  /**
   * Contains the information required to retrieve an app or cookbook from a repository.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04c3f24ad26e530ea6834ab30654b092418a3c2e86153e6aade61504a2b8fcc6")
  public open fun customCookbooksSource(`value`: SourceProperty.Builder.() -> Unit): Unit =
      customCookbooksSource(SourceProperty(`value`))

  /**
   * A string that contains user-defined, custom JSON.
   */
  public open fun customJson(): Any? = unwrap(this).getCustomJson()

  /**
   * A string that contains user-defined, custom JSON.
   */
  public open fun customJson(`value`: Any) {
    unwrap(this).setCustomJson(`value`)
  }

  /**
   * The stack's default Availability Zone, which must be in the specified region.
   */
  public open fun defaultAvailabilityZone(): String? = unwrap(this).getDefaultAvailabilityZone()

  /**
   * The stack's default Availability Zone, which must be in the specified region.
   */
  public open fun defaultAvailabilityZone(`value`: String) {
    unwrap(this).setDefaultAvailabilityZone(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the
   * stack's EC2 instances.
   */
  public open fun defaultInstanceProfileArn(): String = unwrap(this).getDefaultInstanceProfileArn()

  /**
   * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the
   * stack's EC2 instances.
   */
  public open fun defaultInstanceProfileArn(`value`: String) {
    unwrap(this).setDefaultInstanceProfileArn(`value`)
  }

  /**
   * The stack's default operating system, which is installed on every instance unless you specify a
   * different operating system when you create the instance.
   */
  public open fun defaultOs(): String? = unwrap(this).getDefaultOs()

  /**
   * The stack's default operating system, which is installed on every instance unless you specify a
   * different operating system when you create the instance.
   */
  public open fun defaultOs(`value`: String) {
    unwrap(this).setDefaultOs(`value`)
  }

  /**
   * The default root device type.
   */
  public open fun defaultRootDeviceType(): String? = unwrap(this).getDefaultRootDeviceType()

  /**
   * The default root device type.
   */
  public open fun defaultRootDeviceType(`value`: String) {
    unwrap(this).setDefaultRootDeviceType(`value`)
  }

  /**
   * A default Amazon EC2 key pair name.
   */
  public open fun defaultSshKeyName(): String? = unwrap(this).getDefaultSshKeyName()

  /**
   * A default Amazon EC2 key pair name.
   */
  public open fun defaultSshKeyName(`value`: String) {
    unwrap(this).setDefaultSshKeyName(`value`)
  }

  /**
   * The stack's default subnet ID.
   */
  public open fun defaultSubnetId(): String? = unwrap(this).getDefaultSubnetId()

  /**
   * The stack's default subnet ID.
   */
  public open fun defaultSubnetId(`value`: String) {
    unwrap(this).setDefaultSubnetId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the Amazon Elastic Container Service ( Amazon ECS ) cluster
   * to register with the AWS OpsWorks stack.
   */
  public open fun ecsClusterArn(): String? = unwrap(this).getEcsClusterArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Elastic Container Service ( Amazon ECS ) cluster
   * to register with the AWS OpsWorks stack.
   */
  public open fun ecsClusterArn(`value`: String) {
    unwrap(this).setEcsClusterArn(`value`)
  }

  /**
   * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
   */
  public open fun elasticIps(): Any? = unwrap(this).getElasticIps()

  /**
   * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
   */
  public open fun elasticIps(`value`: IResolvable) {
    unwrap(this).setElasticIps(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
   */
  public open fun elasticIps(`value`: List<Any>) {
    unwrap(this).setElasticIps(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
   */
  public open fun elasticIps(vararg `value`: Any): Unit = elasticIps(`value`.toList())

  /**
   * The stack's host name theme, with spaces replaced by underscores.
   */
  public open fun hostnameTheme(): String? = unwrap(this).getHostnameTheme()

  /**
   * The stack's host name theme, with spaces replaced by underscores.
   */
  public open fun hostnameTheme(`value`: String) {
    unwrap(this).setHostnameTheme(`value`)
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
   * The stack name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The stack name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Relational Database Service ( Amazon RDS ) database instance to register with the
   * AWS OpsWorks stack.
   */
  public open fun rdsDbInstances(): Any? = unwrap(this).getRdsDbInstances()

  /**
   * The Amazon Relational Database Service ( Amazon RDS ) database instance to register with the
   * AWS OpsWorks stack.
   */
  public open fun rdsDbInstances(`value`: IResolvable) {
    unwrap(this).setRdsDbInstances(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon Relational Database Service ( Amazon RDS ) database instance to register with the
   * AWS OpsWorks stack.
   */
  public open fun rdsDbInstances(`value`: List<Any>) {
    unwrap(this).setRdsDbInstances(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The Amazon Relational Database Service ( Amazon RDS ) database instance to register with the
   * AWS OpsWorks stack.
   */
  public open fun rdsDbInstances(vararg `value`: Any): Unit = rdsDbInstances(`value`.toList())

  /**
   * The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS resources on your
   * behalf.
   */
  public open fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

  /**
   * The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS resources on your
   * behalf.
   */
  public open fun serviceRoleArn(`value`: String) {
    unwrap(this).setServiceRoleArn(`value`)
  }

  /**
   * If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS OpsWorks stack to
   * clone.
   */
  public open fun sourceStackId(): String? = unwrap(this).getSourceStackId()

  /**
   * If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS OpsWorks stack to
   * clone.
   */
  public open fun sourceStackId(`value`: String) {
    unwrap(this).setSourceStackId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A map that contains tag keys and tag values that are attached to a stack or layer.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A map that contains tag keys and tag values that are attached to a stack or layer.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A map that contains tag keys and tag values that are attached to a stack or layer.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Whether the stack uses custom cookbooks.
   */
  public open fun useCustomCookbooks(): Any? = unwrap(this).getUseCustomCookbooks()

  /**
   * Whether the stack uses custom cookbooks.
   */
  public open fun useCustomCookbooks(`value`: Boolean) {
    unwrap(this).setUseCustomCookbooks(`value`)
  }

  /**
   * Whether the stack uses custom cookbooks.
   */
  public open fun useCustomCookbooks(`value`: IResolvable) {
    unwrap(this).setUseCustomCookbooks(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.
   */
  public open fun useOpsworksSecurityGroups(): Any? = unwrap(this).getUseOpsworksSecurityGroups()

  /**
   * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.
   */
  public open fun useOpsworksSecurityGroups(`value`: Boolean) {
    unwrap(this).setUseOpsworksSecurityGroups(`value`)
  }

  /**
   * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers.
   */
  public open fun useOpsworksSecurityGroups(`value`: IResolvable) {
    unwrap(this).setUseOpsworksSecurityGroups(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The ID of the VPC that the stack is to be launched into.
   */
  public open fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * The ID of the VPC that the stack is to be launched into.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opsworks.CfnStack].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param agentVersion The default AWS OpsWorks Stacks agent version. You have the following
     * options:. 
     */
    public fun agentVersion(agentVersion: String)

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes)
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes. 
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes)
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes. 
     */
    public fun attributes(attributes: IResolvable)

    /**
     * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
     * version on Chef 11.10 stacks. For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) . 
     */
    public fun chefConfiguration(chefConfiguration: IResolvable)

    /**
     * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
     * version on Chef 11.10 stacks. For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) . 
     */
    public fun chefConfiguration(chefConfiguration: ChefConfigurationProperty)

    /**
     * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
     * version on Chef 11.10 stacks. For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c52845227911481080e46e0f18dd87dd85091e61f37801c276c5b0d79512091")
    public fun chefConfiguration(chefConfiguration: ChefConfigurationProperty.Builder.() -> Unit)

    /**
     * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from
     * the source stack to include in the cloned stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids)
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     * application stack IDs from the source stack to include in the cloned stack. 
     */
    public fun cloneAppIds(cloneAppIds: List<String>)

    /**
     * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from
     * the source stack to include in the cloned stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids)
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     * application stack IDs from the source stack to include in the cloned stack. 
     */
    public fun cloneAppIds(vararg cloneAppIds: String)

    /**
     * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's
     * permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions)
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     * the source stack's permissions. 
     */
    public fun clonePermissions(clonePermissions: Boolean)

    /**
     * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's
     * permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions)
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     * the source stack's permissions. 
     */
    public fun clonePermissions(clonePermissions: IResolvable)

    /**
     * The configuration manager.
     *
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configurationmanager)
     * @param configurationManager The configuration manager. 
     */
    public fun configurationManager(configurationManager: IResolvable)

    /**
     * The configuration manager.
     *
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configurationmanager)
     * @param configurationManager The configuration manager. 
     */
    public fun configurationManager(configurationManager: StackConfigurationManagerProperty)

    /**
     * The configuration manager.
     *
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configurationmanager)
     * @param configurationManager The configuration manager. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63882aab79a73f1c4aeceacb3cf4156ba0b410ca519a816e8dfd0bb7802282b0")
    public
        fun configurationManager(configurationManager: StackConfigurationManagerProperty.Builder.() -> Unit)

    /**
     * Contains the information required to retrieve an app or cookbook from a repository.
     *
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customcookbookssource)
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository. 
     */
    public fun customCookbooksSource(customCookbooksSource: IResolvable)

    /**
     * Contains the information required to retrieve an app or cookbook from a repository.
     *
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customcookbookssource)
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository. 
     */
    public fun customCookbooksSource(customCookbooksSource: SourceProperty)

    /**
     * Contains the information required to retrieve an app or cookbook from a repository.
     *
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customcookbookssource)
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02814ce37b712fafba48ed90650097bc884bff764f2d799c44da9700d64e12bc")
    public fun customCookbooksSource(customCookbooksSource: SourceProperty.Builder.() -> Unit)

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
     * @param customJson A string that contains user-defined, custom JSON. 
     */
    public fun customJson(customJson: Any)

    /**
     * The stack's default Availability Zone, which must be in the specified region.
     *
     * For more information, see [Regions and
     * Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html) . If you also specify a
     * value for `DefaultSubnetId` , the subnet must be in the same zone. For more information, see the
     * `VpcId` parameter description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultavailabilityzone)
     * @param defaultAvailabilityZone The stack's default Availability Zone, which must be in the
     * specified region. 
     */
    public fun defaultAvailabilityZone(defaultAvailabilityZone: String)

    /**
     * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the
     * stack's EC2 instances.
     *
     * For more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprofilearn)
     * @param defaultInstanceProfileArn The Amazon Resource Name (ARN) of an IAM profile that is the
     * default profile for all of the stack's EC2 instances. 
     */
    public fun defaultInstanceProfileArn(defaultInstanceProfileArn: String)

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
     * @param defaultOs The stack's default operating system, which is installed on every instance
     * unless you specify a different operating system when you create the instance. 
     */
    public fun defaultOs(defaultOs: String)

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
     * @param defaultRootDeviceType The default root device type. 
     */
    public fun defaultRootDeviceType(defaultRootDeviceType: String)

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
     * @param defaultSshKeyName A default Amazon EC2 key pair name. 
     */
    public fun defaultSshKeyName(defaultSshKeyName: String)

    /**
     * The stack's default subnet ID.
     *
     * All instances are launched into this subnet unless you specify another subnet ID when you
     * create the instance. This parameter is required if you specify a value for the `VpcId`
     * parameter. If you also specify a value for `DefaultAvailabilityZone` , the subnet must be in
     * that zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsubnetid)
     * @param defaultSubnetId The stack's default subnet ID. 
     */
    public fun defaultSubnetId(defaultSubnetId: String)

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
     * @param ecsClusterArn The Amazon Resource Name (ARN) of the Amazon Elastic Container Service (
     * Amazon ECS ) cluster to register with the AWS OpsWorks stack. 
     */
    public fun ecsClusterArn(ecsClusterArn: String)

    /**
     * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack. 
     */
    public fun elasticIps(elasticIps: IResolvable)

    /**
     * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack. 
     */
    public fun elasticIps(elasticIps: List<Any>)

    /**
     * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack. 
     */
    public fun elasticIps(vararg elasticIps: Any)

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
     * @param hostnameTheme The stack's host name theme, with spaces replaced by underscores. 
     */
    public fun hostnameTheme(hostnameTheme: String)

    /**
     * The stack name.
     *
     * Stack names can be a maximum of 64 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name)
     * @param name The stack name. 
     */
    public fun name(name: String)

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
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack. 
     */
    public fun rdsDbInstances(rdsDbInstances: IResolvable)

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
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack. 
     */
    public fun rdsDbInstances(rdsDbInstances: List<Any>)

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
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack. 
     */
    public fun rdsDbInstances(vararg rdsDbInstances: Any)

    /**
     * The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS resources on your
     * behalf.
     *
     * You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. For
     * more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn)
     * @param serviceRoleArn The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS
     * resources on your behalf. 
     */
    public fun serviceRoleArn(serviceRoleArn: String)

    /**
     * If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS OpsWorks stack to
     * clone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid)
     * @param sourceStackId If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS
     * OpsWorks stack to clone. 
     */
    public fun sourceStackId(sourceStackId: String)

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
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     * layer. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     * layer. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Whether the stack uses custom cookbooks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-usecustomcookbooks)
     * @param useCustomCookbooks Whether the stack uses custom cookbooks. 
     */
    public fun useCustomCookbooks(useCustomCookbooks: Boolean)

    /**
     * Whether the stack uses custom cookbooks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-usecustomcookbooks)
     * @param useCustomCookbooks Whether the stack uses custom cookbooks. 
     */
    public fun useCustomCookbooks(useCustomCookbooks: IResolvable)

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
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     * security groups with the stack's layers. 
     */
    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: Boolean)

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
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     * security groups with the stack's layers. 
     */
    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: IResolvable)

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
     * @param vpcId The ID of the VPC that the stack is to be launched into. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnStack.Builder =
        software.amazon.awscdk.services.opsworks.CfnStack.Builder.create(scope, id)

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
     * @param agentVersion The default AWS OpsWorks Stacks agent version. You have the following
     * options:. 
     */
    override fun agentVersion(agentVersion: String) {
      cdkBuilder.agentVersion(agentVersion)
    }

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes)
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes. 
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes)
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     * attributes. 
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
     * version on Chef 11.10 stacks. For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) . 
     */
    override fun chefConfiguration(chefConfiguration: IResolvable) {
      cdkBuilder.chefConfiguration(chefConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
     * version on Chef 11.10 stacks. For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) . 
     */
    override fun chefConfiguration(chefConfiguration: ChefConfigurationProperty) {
      cdkBuilder.chefConfiguration(chefConfiguration.let(ChefConfigurationProperty.Companion::unwrap))
    }

    /**
     * A `ChefConfiguration` object that specifies whether to enable Berkshelf and the Berkshelf
     * version on Chef 11.10 stacks. For more information, see [Create a New
     * Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-chefconfiguration)
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     * Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see [Create a
     * New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html) . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c52845227911481080e46e0f18dd87dd85091e61f37801c276c5b0d79512091")
    override fun chefConfiguration(chefConfiguration: ChefConfigurationProperty.Builder.() -> Unit):
        Unit = chefConfiguration(ChefConfigurationProperty(chefConfiguration))

    /**
     * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from
     * the source stack to include in the cloned stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids)
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     * application stack IDs from the source stack to include in the cloned stack. 
     */
    override fun cloneAppIds(cloneAppIds: List<String>) {
      cdkBuilder.cloneAppIds(cloneAppIds)
    }

    /**
     * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from
     * the source stack to include in the cloned stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids)
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     * application stack IDs from the source stack to include in the cloned stack. 
     */
    override fun cloneAppIds(vararg cloneAppIds: String): Unit = cloneAppIds(cloneAppIds.toList())

    /**
     * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's
     * permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions)
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     * the source stack's permissions. 
     */
    override fun clonePermissions(clonePermissions: Boolean) {
      cdkBuilder.clonePermissions(clonePermissions)
    }

    /**
     * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's
     * permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions)
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     * the source stack's permissions. 
     */
    override fun clonePermissions(clonePermissions: IResolvable) {
      cdkBuilder.clonePermissions(clonePermissions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration manager.
     *
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configurationmanager)
     * @param configurationManager The configuration manager. 
     */
    override fun configurationManager(configurationManager: IResolvable) {
      cdkBuilder.configurationManager(configurationManager.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration manager.
     *
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configurationmanager)
     * @param configurationManager The configuration manager. 
     */
    override fun configurationManager(configurationManager: StackConfigurationManagerProperty) {
      cdkBuilder.configurationManager(configurationManager.let(StackConfigurationManagerProperty.Companion::unwrap))
    }

    /**
     * The configuration manager.
     *
     * When you create a stack we recommend that you use the configuration manager to specify the
     * Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value
     * for Linux stacks is currently 12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-configurationmanager)
     * @param configurationManager The configuration manager. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63882aab79a73f1c4aeceacb3cf4156ba0b410ca519a816e8dfd0bb7802282b0")
    override
        fun configurationManager(configurationManager: StackConfigurationManagerProperty.Builder.() -> Unit):
        Unit = configurationManager(StackConfigurationManagerProperty(configurationManager))

    /**
     * Contains the information required to retrieve an app or cookbook from a repository.
     *
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customcookbookssource)
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository. 
     */
    override fun customCookbooksSource(customCookbooksSource: IResolvable) {
      cdkBuilder.customCookbooksSource(customCookbooksSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains the information required to retrieve an app or cookbook from a repository.
     *
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customcookbookssource)
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository. 
     */
    override fun customCookbooksSource(customCookbooksSource: SourceProperty) {
      cdkBuilder.customCookbooksSource(customCookbooksSource.let(SourceProperty.Companion::unwrap))
    }

    /**
     * Contains the information required to retrieve an app or cookbook from a repository.
     *
     * For more information, see [Adding
     * Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html) or
     * [Cookbooks and
     * Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-customcookbookssource)
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     * from a repository. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02814ce37b712fafba48ed90650097bc884bff764f2d799c44da9700d64e12bc")
    override fun customCookbooksSource(customCookbooksSource: SourceProperty.Builder.() -> Unit):
        Unit = customCookbooksSource(SourceProperty(customCookbooksSource))

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
     * @param customJson A string that contains user-defined, custom JSON. 
     */
    override fun customJson(customJson: Any) {
      cdkBuilder.customJson(customJson)
    }

    /**
     * The stack's default Availability Zone, which must be in the specified region.
     *
     * For more information, see [Regions and
     * Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html) . If you also specify a
     * value for `DefaultSubnetId` , the subnet must be in the same zone. For more information, see the
     * `VpcId` parameter description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultavailabilityzone)
     * @param defaultAvailabilityZone The stack's default Availability Zone, which must be in the
     * specified region. 
     */
    override fun defaultAvailabilityZone(defaultAvailabilityZone: String) {
      cdkBuilder.defaultAvailabilityZone(defaultAvailabilityZone)
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the
     * stack's EC2 instances.
     *
     * For more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprofilearn)
     * @param defaultInstanceProfileArn The Amazon Resource Name (ARN) of an IAM profile that is the
     * default profile for all of the stack's EC2 instances. 
     */
    override fun defaultInstanceProfileArn(defaultInstanceProfileArn: String) {
      cdkBuilder.defaultInstanceProfileArn(defaultInstanceProfileArn)
    }

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
     * @param defaultOs The stack's default operating system, which is installed on every instance
     * unless you specify a different operating system when you create the instance. 
     */
    override fun defaultOs(defaultOs: String) {
      cdkBuilder.defaultOs(defaultOs)
    }

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
     * @param defaultRootDeviceType The default root device type. 
     */
    override fun defaultRootDeviceType(defaultRootDeviceType: String) {
      cdkBuilder.defaultRootDeviceType(defaultRootDeviceType)
    }

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
     * @param defaultSshKeyName A default Amazon EC2 key pair name. 
     */
    override fun defaultSshKeyName(defaultSshKeyName: String) {
      cdkBuilder.defaultSshKeyName(defaultSshKeyName)
    }

    /**
     * The stack's default subnet ID.
     *
     * All instances are launched into this subnet unless you specify another subnet ID when you
     * create the instance. This parameter is required if you specify a value for the `VpcId`
     * parameter. If you also specify a value for `DefaultAvailabilityZone` , the subnet must be in
     * that zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsubnetid)
     * @param defaultSubnetId The stack's default subnet ID. 
     */
    override fun defaultSubnetId(defaultSubnetId: String) {
      cdkBuilder.defaultSubnetId(defaultSubnetId)
    }

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
     * @param ecsClusterArn The Amazon Resource Name (ARN) of the Amazon Elastic Container Service (
     * Amazon ECS ) cluster to register with the AWS OpsWorks stack. 
     */
    override fun ecsClusterArn(ecsClusterArn: String) {
      cdkBuilder.ecsClusterArn(ecsClusterArn)
    }

    /**
     * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack. 
     */
    override fun elasticIps(elasticIps: IResolvable) {
      cdkBuilder.elasticIps(elasticIps.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack. 
     */
    override fun elasticIps(elasticIps: List<Any>) {
      cdkBuilder.elasticIps(elasticIps.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips)
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack. 
     */
    override fun elasticIps(vararg elasticIps: Any): Unit = elasticIps(elasticIps.toList())

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
     * @param hostnameTheme The stack's host name theme, with spaces replaced by underscores. 
     */
    override fun hostnameTheme(hostnameTheme: String) {
      cdkBuilder.hostnameTheme(hostnameTheme)
    }

    /**
     * The stack name.
     *
     * Stack names can be a maximum of 64 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name)
     * @param name The stack name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack. 
     */
    override fun rdsDbInstances(rdsDbInstances: IResolvable) {
      cdkBuilder.rdsDbInstances(rdsDbInstances.let(IResolvable.Companion::unwrap))
    }

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
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack. 
     */
    override fun rdsDbInstances(rdsDbInstances: List<Any>) {
      cdkBuilder.rdsDbInstances(rdsDbInstances.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     * to register with the AWS OpsWorks stack. 
     */
    override fun rdsDbInstances(vararg rdsDbInstances: Any): Unit =
        rdsDbInstances(rdsDbInstances.toList())

    /**
     * The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS resources on your
     * behalf.
     *
     * You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. For
     * more information about IAM ARNs, see [Using
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn)
     * @param serviceRoleArn The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS
     * resources on your behalf. 
     */
    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS OpsWorks stack to
     * clone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid)
     * @param sourceStackId If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS
     * OpsWorks stack to clone. 
     */
    override fun sourceStackId(sourceStackId: String) {
      cdkBuilder.sourceStackId(sourceStackId)
    }

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
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     * layer. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

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
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     * layer. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Whether the stack uses custom cookbooks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-usecustomcookbooks)
     * @param useCustomCookbooks Whether the stack uses custom cookbooks. 
     */
    override fun useCustomCookbooks(useCustomCookbooks: Boolean) {
      cdkBuilder.useCustomCookbooks(useCustomCookbooks)
    }

    /**
     * Whether the stack uses custom cookbooks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-usecustomcookbooks)
     * @param useCustomCookbooks Whether the stack uses custom cookbooks. 
     */
    override fun useCustomCookbooks(useCustomCookbooks: IResolvable) {
      cdkBuilder.useCustomCookbooks(useCustomCookbooks.let(IResolvable.Companion::unwrap))
    }

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
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     * security groups with the stack's layers. 
     */
    override fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: Boolean) {
      cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups)
    }

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
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     * security groups with the stack's layers. 
     */
    override fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: IResolvable) {
      cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups.let(IResolvable.Companion::unwrap))
    }

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
     * @param vpcId The ID of the VPC that the stack is to be launched into. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnStack = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opsworks.CfnStack.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack): CfnStack =
        CfnStack(cdkObject)

    internal fun unwrap(wrapped: CfnStack): software.amazon.awscdk.services.opsworks.CfnStack =
        wrapped.cdkObject as software.amazon.awscdk.services.opsworks.CfnStack
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opsworks.*;
   * ChefConfigurationProperty chefConfigurationProperty = ChefConfigurationProperty.builder()
   * .berkshelfVersion("berkshelfVersion")
   * .manageBerkshelf(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html)
   */
  public interface ChefConfigurationProperty {
    /**
     * The Berkshelf version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-stack-chefconfiguration-berkshelfversion)
     */
    public fun berkshelfVersion(): String? = unwrap(this).getBerkshelfVersion()

    /**
     * Whether to enable Berkshelf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-stack-chefconfiguration-manageberkshelf)
     */
    public fun manageBerkshelf(): Any? = unwrap(this).getManageBerkshelf()

    /**
     * A builder for [ChefConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param berkshelfVersion The Berkshelf version.
       */
      public fun berkshelfVersion(berkshelfVersion: String)

      /**
       * @param manageBerkshelf Whether to enable Berkshelf.
       */
      public fun manageBerkshelf(manageBerkshelf: Boolean)

      /**
       * @param manageBerkshelf Whether to enable Berkshelf.
       */
      public fun manageBerkshelf(manageBerkshelf: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.builder()

      /**
       * @param berkshelfVersion The Berkshelf version.
       */
      override fun berkshelfVersion(berkshelfVersion: String) {
        cdkBuilder.berkshelfVersion(berkshelfVersion)
      }

      /**
       * @param manageBerkshelf Whether to enable Berkshelf.
       */
      override fun manageBerkshelf(manageBerkshelf: Boolean) {
        cdkBuilder.manageBerkshelf(manageBerkshelf)
      }

      /**
       * @param manageBerkshelf Whether to enable Berkshelf.
       */
      override fun manageBerkshelf(manageBerkshelf: IResolvable) {
        cdkBuilder.manageBerkshelf(manageBerkshelf.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty,
    ) : CdkObject(cdkObject),
        ChefConfigurationProperty {
      /**
       * The Berkshelf version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-stack-chefconfiguration-berkshelfversion)
       */
      override fun berkshelfVersion(): String? = unwrap(this).getBerkshelfVersion()

      /**
       * Whether to enable Berkshelf.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-stack-chefconfiguration-manageberkshelf)
       */
      override fun manageBerkshelf(): Any? = unwrap(this).getManageBerkshelf()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChefConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty):
          ChefConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ChefConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChefConfigurationProperty):
          software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opsworks.*;
   * ElasticIpProperty elasticIpProperty = ElasticIpProperty.builder()
   * .ip("ip")
   * // the properties below are optional
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html)
   */
  public interface ElasticIpProperty {
    /**
     * The IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-ip)
     */
    public fun ip(): String

    /**
     * The name, which can be a maximum of 32 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [ElasticIpProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ip The IP address. 
       */
      public fun ip(ip: String)

      /**
       * @param name The name, which can be a maximum of 32 characters.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.builder()

      /**
       * @param ip The IP address. 
       */
      override fun ip(ip: String) {
        cdkBuilder.ip(ip)
      }

      /**
       * @param name The name, which can be a maximum of 32 characters.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty,
    ) : CdkObject(cdkObject),
        ElasticIpProperty {
      /**
       * The IP address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-ip)
       */
      override fun ip(): String = unwrap(this).getIp()

      /**
       * The name, which can be a maximum of 32 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-elasticip.html#cfn-opsworks-stack-elasticip-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticIpProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty):
          ElasticIpProperty = CdkObjectWrappers.wrap(cdkObject) as? ElasticIpProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticIpProperty):
          software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opsworks.*;
   * RdsDbInstanceProperty rdsDbInstanceProperty = RdsDbInstanceProperty.builder()
   * .dbPassword("dbPassword")
   * .dbUser("dbUser")
   * .rdsDbInstanceArn("rdsDbInstanceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html)
   */
  public interface RdsDbInstanceProperty {
    /**
     * AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbpassword)
     */
    public fun dbPassword(): String

    /**
     * The master user name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbuser)
     */
    public fun dbUser(): String

    /**
     * The instance's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-rdsdbinstancearn)
     */
    public fun rdsDbInstanceArn(): String

    /**
     * A builder for [RdsDbInstanceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dbPassword AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual
       * value. 
       */
      public fun dbPassword(dbPassword: String)

      /**
       * @param dbUser The master user name. 
       */
      public fun dbUser(dbUser: String)

      /**
       * @param rdsDbInstanceArn The instance's ARN. 
       */
      public fun rdsDbInstanceArn(rdsDbInstanceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.builder()

      /**
       * @param dbPassword AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual
       * value. 
       */
      override fun dbPassword(dbPassword: String) {
        cdkBuilder.dbPassword(dbPassword)
      }

      /**
       * @param dbUser The master user name. 
       */
      override fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
      }

      /**
       * @param rdsDbInstanceArn The instance's ARN. 
       */
      override fun rdsDbInstanceArn(rdsDbInstanceArn: String) {
        cdkBuilder.rdsDbInstanceArn(rdsDbInstanceArn)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty,
    ) : CdkObject(cdkObject),
        RdsDbInstanceProperty {
      /**
       * AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbpassword)
       */
      override fun dbPassword(): String = unwrap(this).getDbPassword()

      /**
       * The master user name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-dbuser)
       */
      override fun dbUser(): String = unwrap(this).getDbUser()

      /**
       * The instance's ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html#cfn-opsworks-stack-rdsdbinstance-rdsdbinstancearn)
       */
      override fun rdsDbInstanceArn(): String = unwrap(this).getRdsDbInstanceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RdsDbInstanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty):
          RdsDbInstanceProperty = CdkObjectWrappers.wrap(cdkObject) as? RdsDbInstanceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RdsDbInstanceProperty):
          software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opsworks.*;
   * SourceProperty sourceProperty = SourceProperty.builder()
   * .password("password")
   * .revision("revision")
   * .sshKey("sshKey")
   * .type("type")
   * .url("url")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html)
   */
  public interface SourceProperty {
    /**
     * When included in a request, the parameter depends on the repository type.
     *
     * * For Amazon S3 bundles, set `Password` to the appropriate IAM secret access key.
     * * For HTTP bundles and Subversion repositories, set `Password` to the password.
     *
     * For more information on how to safely handle IAM credentials, see
     * [](https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html) .
     *
     * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-password)
     */
    public fun password(): String? = unwrap(this).getPassword()

    /**
     * The application's version.
     *
     * AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the
     * simplest approaches is to have branches or revisions in your repository that represent different
     * versions that can potentially be deployed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-revision)
     */
    public fun revision(): String? = unwrap(this).getRevision()

    /**
     * The repository's SSH key.
     *
     * For more information, see [Using Git Repository SSH
     * Keys](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploykeys.html) in the
     * *AWS OpsWorks User Guide* . To pass in an SSH key as a parameter, see the following example:
     *
     * `"Parameters" : { "GitSSHKey" : { "Description" : "Change SSH key newlines to commas.",
     * "Type" : "CommaDelimitedList", "NoEcho" : "true" }, ... "CustomCookbooksSource": { "Revision" :
     * { "Ref": "GitRevision"}, "SshKey" : { "Fn::Join" : [ "\n", { "Ref": "GitSSHKey"} ] }, "Type":
     * "git", "Url": { "Ref": "GitURL"} } ...`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-sshkey)
     */
    public fun sshKey(): String? = unwrap(this).getSshKey()

    /**
     * The repository type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The source URL.
     *
     * The following is an example of an Amazon S3 source URL:
     * `https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * This parameter depends on the repository type.
     *
     * * For Amazon S3 bundles, set `Username` to the appropriate IAM access key ID.
     * * For HTTP bundles, Git repositories, and Subversion repositories, set `Username` to the user
     * name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-username)
     */
    public fun username(): String? = unwrap(this).getUsername()

    /**
     * A builder for [SourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password When included in a request, the parameter depends on the repository type.
       * * For Amazon S3 bundles, set `Password` to the appropriate IAM secret access key.
       * * For HTTP bundles and Subversion repositories, set `Password` to the password.
       *
       * For more information on how to safely handle IAM credentials, see
       * [](https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html) .
       *
       * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
       */
      public fun password(password: String)

      /**
       * @param revision The application's version.
       * AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the
       * simplest approaches is to have branches or revisions in your repository that represent
       * different versions that can potentially be deployed.
       */
      public fun revision(revision: String)

      /**
       * @param sshKey The repository's SSH key.
       * For more information, see [Using Git Repository SSH
       * Keys](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploykeys.html) in
       * the *AWS OpsWorks User Guide* . To pass in an SSH key as a parameter, see the following
       * example:
       *
       * `"Parameters" : { "GitSSHKey" : { "Description" : "Change SSH key newlines to commas.",
       * "Type" : "CommaDelimitedList", "NoEcho" : "true" }, ... "CustomCookbooksSource": { "Revision"
       * : { "Ref": "GitRevision"}, "SshKey" : { "Fn::Join" : [ "\n", { "Ref": "GitSSHKey"} ] },
       * "Type": "git", "Url": { "Ref": "GitURL"} } ...`
       */
      public fun sshKey(sshKey: String)

      /**
       * @param type The repository type.
       */
      public fun type(type: String)

      /**
       * @param url The source URL.
       * The following is an example of an Amazon S3 source URL:
       * `https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz` .
       */
      public fun url(url: String)

      /**
       * @param username This parameter depends on the repository type.
       * * For Amazon S3 bundles, set `Username` to the appropriate IAM access key ID.
       * * For HTTP bundles, Git repositories, and Subversion repositories, set `Username` to the
       * user name.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.builder()

      /**
       * @param password When included in a request, the parameter depends on the repository type.
       * * For Amazon S3 bundles, set `Password` to the appropriate IAM secret access key.
       * * For HTTP bundles and Subversion repositories, set `Password` to the password.
       *
       * For more information on how to safely handle IAM credentials, see
       * [](https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html) .
       *
       * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param revision The application's version.
       * AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the
       * simplest approaches is to have branches or revisions in your repository that represent
       * different versions that can potentially be deployed.
       */
      override fun revision(revision: String) {
        cdkBuilder.revision(revision)
      }

      /**
       * @param sshKey The repository's SSH key.
       * For more information, see [Using Git Repository SSH
       * Keys](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploykeys.html) in
       * the *AWS OpsWorks User Guide* . To pass in an SSH key as a parameter, see the following
       * example:
       *
       * `"Parameters" : { "GitSSHKey" : { "Description" : "Change SSH key newlines to commas.",
       * "Type" : "CommaDelimitedList", "NoEcho" : "true" }, ... "CustomCookbooksSource": { "Revision"
       * : { "Ref": "GitRevision"}, "SshKey" : { "Fn::Join" : [ "\n", { "Ref": "GitSSHKey"} ] },
       * "Type": "git", "Url": { "Ref": "GitURL"} } ...`
       */
      override fun sshKey(sshKey: String) {
        cdkBuilder.sshKey(sshKey)
      }

      /**
       * @param type The repository type.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param url The source URL.
       * The following is an example of an Amazon S3 source URL:
       * `https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz` .
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      /**
       * @param username This parameter depends on the repository type.
       * * For Amazon S3 bundles, set `Username` to the appropriate IAM access key ID.
       * * For HTTP bundles, Git repositories, and Subversion repositories, set `Username` to the
       * user name.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty,
    ) : CdkObject(cdkObject),
        SourceProperty {
      /**
       * When included in a request, the parameter depends on the repository type.
       *
       * * For Amazon S3 bundles, set `Password` to the appropriate IAM secret access key.
       * * For HTTP bundles and Subversion repositories, set `Password` to the password.
       *
       * For more information on how to safely handle IAM credentials, see
       * [](https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html) .
       *
       * In responses, AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-password)
       */
      override fun password(): String? = unwrap(this).getPassword()

      /**
       * The application's version.
       *
       * AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the
       * simplest approaches is to have branches or revisions in your repository that represent
       * different versions that can potentially be deployed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-revision)
       */
      override fun revision(): String? = unwrap(this).getRevision()

      /**
       * The repository's SSH key.
       *
       * For more information, see [Using Git Repository SSH
       * Keys](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploykeys.html) in
       * the *AWS OpsWorks User Guide* . To pass in an SSH key as a parameter, see the following
       * example:
       *
       * `"Parameters" : { "GitSSHKey" : { "Description" : "Change SSH key newlines to commas.",
       * "Type" : "CommaDelimitedList", "NoEcho" : "true" }, ... "CustomCookbooksSource": { "Revision"
       * : { "Ref": "GitRevision"}, "SshKey" : { "Fn::Join" : [ "\n", { "Ref": "GitSSHKey"} ] },
       * "Type": "git", "Url": { "Ref": "GitURL"} } ...`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-sshkey)
       */
      override fun sshKey(): String? = unwrap(this).getSshKey()

      /**
       * The repository type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The source URL.
       *
       * The following is an example of an Amazon S3 source URL:
       * `https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-url)
       */
      override fun url(): String? = unwrap(this).getUrl()

      /**
       * This parameter depends on the repository type.
       *
       * * For Amazon S3 bundles, set `Username` to the appropriate IAM access key ID.
       * * For HTTP bundles, Git repositories, and Subversion repositories, set `Username` to the
       * user name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html#cfn-opsworks-stack-source-username)
       */
      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty):
          SourceProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opsworks.*;
   * StackConfigurationManagerProperty stackConfigurationManagerProperty =
   * StackConfigurationManagerProperty.builder()
   * .name("name")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigurationmanager.html)
   */
  public interface StackConfigurationManagerProperty {
    /**
     * The name.
     *
     * This parameter must be set to `Chef` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigurationmanager.html#cfn-opsworks-stack-stackconfigurationmanager-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The Chef version.
     *
     * This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows
     * stacks. The default value for Linux stacks is 12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigurationmanager.html#cfn-opsworks-stack-stackconfigurationmanager-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [StackConfigurationManagerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name.
       * This parameter must be set to `Chef` .
       */
      public fun name(name: String)

      /**
       * @param version The Chef version.
       * This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows
       * stacks. The default value for Linux stacks is 12.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.Builder
          =
          software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.builder()

      /**
       * @param name The name.
       * This parameter must be set to `Chef` .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param version The Chef version.
       * This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows
       * stacks. The default value for Linux stacks is 12.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty,
    ) : CdkObject(cdkObject),
        StackConfigurationManagerProperty {
      /**
       * The name.
       *
       * This parameter must be set to `Chef` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigurationmanager.html#cfn-opsworks-stack-stackconfigurationmanager-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The Chef version.
       *
       * This parameter must be set to 12, 11.10, or 11.4 for Linux stacks, and to 12.2 for Windows
       * stacks. The default value for Linux stacks is 12.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigurationmanager.html#cfn-opsworks-stack-stackconfigurationmanager-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StackConfigurationManagerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty):
          StackConfigurationManagerProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StackConfigurationManagerProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StackConfigurationManagerProperty):
          software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty
    }
  }
}

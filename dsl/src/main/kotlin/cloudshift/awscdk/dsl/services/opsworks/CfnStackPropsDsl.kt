@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnStack
import software.amazon.awscdk.services.opsworks.CfnStackProps

/**
 * Properties for defining a `CfnStack`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
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
@CdkDslMarker
public class CfnStackPropsDsl {
    private val cdkBuilder: CfnStackProps.Builder = CfnStackProps.builder()

    private val _cloneAppIds: MutableList<String> = mutableListOf()

    private val _elasticIps: MutableList<Any> = mutableListOf()

    private val _rdsDbInstances: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param agentVersion The default AWS OpsWorks Stacks agent version. You have the following
     *   options:.
     * * Auto-update - Set this parameter to `LATEST` . AWS OpsWorks Stacks automatically installs
     *   new agent versions on the stack's instances as soon as they are available.
     * * Fixed version - Set this parameter to your preferred agent version. To update the agent
     *   version, you must edit the stack configuration and specify a new version. AWS OpsWorks
     *   Stacks installs that version on the stack's instances.
     *
     * The default setting is the most recent release of the agent. To specify an agent version, you
     * must use the complete version number, not the abbreviated number shown on the console. For a
     * list of available agent version numbers, call
     * [DescribeAgentVersions](https://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeAgentVersions)
     * . AgentVersion cannot be set to Chef 12.2.
     *
     * You can also specify an agent version when you create or update an instance, which overrides
     * the stack's default setting.
     */
    public fun agentVersion(agentVersion: String) {
        cdkBuilder.agentVersion(agentVersion)
    }

    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     *   attributes.
     */
    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     *   attributes.
     */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     *   Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see
     *   [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html)
     *   .
     */
    public fun chefConfiguration(chefConfiguration: IResolvable) {
        cdkBuilder.chefConfiguration(chefConfiguration)
    }

    /**
     * @param chefConfiguration A `ChefConfiguration` object that specifies whether to enable
     *   Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see
     *   [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html)
     *   .
     */
    public fun chefConfiguration(chefConfiguration: CfnStack.ChefConfigurationProperty) {
        cdkBuilder.chefConfiguration(chefConfiguration)
    }

    /**
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     *   application stack IDs from the source stack to include in the cloned stack.
     */
    public fun cloneAppIds(vararg cloneAppIds: String) {
        _cloneAppIds.addAll(listOf(*cloneAppIds))
    }

    /**
     * @param cloneAppIds If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks
     *   application stack IDs from the source stack to include in the cloned stack.
     */
    public fun cloneAppIds(cloneAppIds: Collection<String>) {
        _cloneAppIds.addAll(cloneAppIds)
    }

    /**
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     *   the source stack's permissions.
     */
    public fun clonePermissions(clonePermissions: Boolean) {
        cdkBuilder.clonePermissions(clonePermissions)
    }

    /**
     * @param clonePermissions If you're cloning an AWS OpsWorks stack, indicates whether to clone
     *   the source stack's permissions.
     */
    public fun clonePermissions(clonePermissions: IResolvable) {
        cdkBuilder.clonePermissions(clonePermissions)
    }

    /**
     * @param configurationManager The configuration manager. When you create a stack we recommend
     *   that you use the configuration manager to specify the Chef version: 12, 11.10, or 11.4 for
     *   Linux stacks, or 12.2 for Windows stacks. The default value for Linux stacks is
     *   currently 12.
     */
    public fun configurationManager(configurationManager: IResolvable) {
        cdkBuilder.configurationManager(configurationManager)
    }

    /**
     * @param configurationManager The configuration manager. When you create a stack we recommend
     *   that you use the configuration manager to specify the Chef version: 12, 11.10, or 11.4 for
     *   Linux stacks, or 12.2 for Windows stacks. The default value for Linux stacks is
     *   currently 12.
     */
    public fun configurationManager(
        configurationManager: CfnStack.StackConfigurationManagerProperty
    ) {
        cdkBuilder.configurationManager(configurationManager)
    }

    /**
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     *   from a repository. For more information, see
     *   [Adding Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html)
     *   or
     *   [Cookbooks and Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html)
     *   .
     */
    public fun customCookbooksSource(customCookbooksSource: IResolvable) {
        cdkBuilder.customCookbooksSource(customCookbooksSource)
    }

    /**
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook
     *   from a repository. For more information, see
     *   [Adding Apps](https://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html)
     *   or
     *   [Cookbooks and Recipes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook.html)
     *   .
     */
    public fun customCookbooksSource(customCookbooksSource: CfnStack.SourceProperty) {
        cdkBuilder.customCookbooksSource(customCookbooksSource)
    }

    /**
     * @param customJson A string that contains user-defined, custom JSON. It can be used to
     *   override the corresponding default stack configuration attribute values or to pass data to
     *   recipes. The string should be in the following format:
     *
     * `"{\"key1\": \"value1\", \"key2\": \"value2\",...}"`
     *
     * For more information about custom JSON, see
     * [Use Custom JSON to Modify the Stack Configuration Attributes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html)
     * .
     */
    public fun customJson(customJson: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(customJson)
        cdkBuilder.customJson(builder.map)
    }

    /**
     * @param customJson A string that contains user-defined, custom JSON. It can be used to
     *   override the corresponding default stack configuration attribute values or to pass data to
     *   recipes. The string should be in the following format:
     *
     * `"{\"key1\": \"value1\", \"key2\": \"value2\",...}"`
     *
     * For more information about custom JSON, see
     * [Use Custom JSON to Modify the Stack Configuration Attributes](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html)
     * .
     */
    public fun customJson(customJson: Any) {
        cdkBuilder.customJson(customJson)
    }

    /**
     * @param defaultAvailabilityZone The stack's default Availability Zone, which must be in the
     *   specified region. For more information, see
     *   [Regions and Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html) . If you
     *   also specify a value for `DefaultSubnetId` , the subnet must be in the same zone. For more
     *   information, see the `VpcId` parameter description.
     */
    public fun defaultAvailabilityZone(defaultAvailabilityZone: String) {
        cdkBuilder.defaultAvailabilityZone(defaultAvailabilityZone)
    }

    /**
     * @param defaultInstanceProfileArn The Amazon Resource Name (ARN) of an IAM profile that is the
     *   default profile for all of the stack's EC2 instances. For more information about IAM ARNs,
     *   see
     *   [Using Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
     *   .
     */
    public fun defaultInstanceProfileArn(defaultInstanceProfileArn: String) {
        cdkBuilder.defaultInstanceProfileArn(defaultInstanceProfileArn)
    }

    /**
     * @param defaultOs The stack's default operating system, which is installed on every instance
     *   unless you specify a different operating system when you create the instance. You can
     *   specify one of the following.
     * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
     *   `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon Linux
     *   2016.09` , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux 2015.03` .
     * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
     *   `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
     * * `CentOS Linux 7`
     * * `Red Hat Enterprise Linux 7`
     * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
     *   `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server 2012
     *   R2 with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL Server Web` .
     * * A custom AMI: `Custom` . You specify the custom AMI you want to use when you create
     *   instances. For more information, see
     *   [Using Custom AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html)
     *   .
     *
     * The default option is the current Amazon Linux version. Not all operating systems are
     * supported with all versions of Chef. For more information about supported operating systems,
     * see
     * [AWS OpsWorks Stacks Operating Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html)
     * .
     */
    public fun defaultOs(defaultOs: String) {
        cdkBuilder.defaultOs(defaultOs)
    }

    /**
     * @param defaultRootDeviceType The default root device type. This value is the default for all
     *   instances in the stack, but you can override it when you create an instance. The default
     *   option is `instance-store` . For more information, see
     *   [Storage for the Root Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
     *   .
     */
    public fun defaultRootDeviceType(defaultRootDeviceType: String) {
        cdkBuilder.defaultRootDeviceType(defaultRootDeviceType)
    }

    /**
     * @param defaultSshKeyName A default Amazon EC2 key pair name. The default value is none. If
     *   you specify a key pair name, AWS OpsWorks installs the public key on the instance and you
     *   can use the private key with an SSH client to log in to the instance. For more information,
     *   see
     *   [Using SSH to Communicate with an Instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html)
     *   and
     *   [Managing SSH Access](https://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html)
     *   . You can override this setting by specifying a different key pair, or no key pair, when
     *   you
     *   [create an instance](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html)
     *   .
     */
    public fun defaultSshKeyName(defaultSshKeyName: String) {
        cdkBuilder.defaultSshKeyName(defaultSshKeyName)
    }

    /**
     * @param defaultSubnetId The stack's default subnet ID. All instances are launched into this
     *   subnet unless you specify another subnet ID when you create the instance. This parameter is
     *   required if you specify a value for the `VpcId` parameter. If you also specify a value for
     *   `DefaultAvailabilityZone` , the subnet must be in that zone.
     */
    public fun defaultSubnetId(defaultSubnetId: String) {
        cdkBuilder.defaultSubnetId(defaultSubnetId)
    }

    /**
     * @param ecsClusterArn The Amazon Resource Name (ARN) of the Amazon Elastic Container Service (
     *   Amazon ECS ) cluster to register with the AWS OpsWorks stack.
     *
     * If you specify a cluster that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the cluster.
     */
    public fun ecsClusterArn(ecsClusterArn: String) {
        cdkBuilder.ecsClusterArn(ecsClusterArn)
    }

    /**
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     */
    public fun elasticIps(vararg elasticIps: Any) {
        _elasticIps.addAll(listOf(*elasticIps))
    }

    /**
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     */
    public fun elasticIps(elasticIps: Collection<Any>) {
        _elasticIps.addAll(elasticIps)
    }

    /**
     * @param elasticIps A list of Elastic IP addresses to register with the AWS OpsWorks stack.
     *
     * If you specify an IP address that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the IP address.
     */
    public fun elasticIps(elasticIps: IResolvable) {
        cdkBuilder.elasticIps(elasticIps)
    }

    /**
     * @param hostnameTheme The stack's host name theme, with spaces replaced by underscores. The
     *   theme is used to generate host names for the stack's instances. By default, `HostnameTheme`
     *   is set to `Layer_Dependent` , which creates host names by appending integers to the layer's
     *   short name. The other themes are:
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
    public fun hostnameTheme(hostnameTheme: String) {
        cdkBuilder.hostnameTheme(hostnameTheme)
    }

    /** @param name The stack name. Stack names can be a maximum of 64 characters. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     *   to register with the AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     */
    public fun rdsDbInstances(vararg rdsDbInstances: Any) {
        _rdsDbInstances.addAll(listOf(*rdsDbInstances))
    }

    /**
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     *   to register with the AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     */
    public fun rdsDbInstances(rdsDbInstances: Collection<Any>) {
        _rdsDbInstances.addAll(rdsDbInstances)
    }

    /**
     * @param rdsDbInstances The Amazon Relational Database Service ( Amazon RDS ) database instance
     *   to register with the AWS OpsWorks stack.
     *
     * If you specify a database instance that's registered with another AWS OpsWorks stack, AWS
     * CloudFormation deregisters the existing association before registering the database instance.
     */
    public fun rdsDbInstances(rdsDbInstances: IResolvable) {
        cdkBuilder.rdsDbInstances(rdsDbInstances)
    }

    /**
     * @param serviceRoleArn The stack's IAM role, which allows AWS OpsWorks Stacks to work with AWS
     *   resources on your behalf. You must set this parameter to the Amazon Resource Name (ARN) for
     *   an existing IAM role. For more information about IAM ARNs, see
     *   [Using Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
     *   .
     */
    public fun serviceRoleArn(serviceRoleArn: String) {
        cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * @param sourceStackId If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS
     *   OpsWorks stack to clone.
     */
    public fun sourceStackId(sourceStackId: String) {
        cdkBuilder.sourceStackId(sourceStackId)
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     *   layer.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     *   or separators, or the following special characters: `+ - = . _ : /`
     * * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or
     *   separators, or the following special characters: `+ - = . _ : /`
     * * Leading and trailing white spaces are trimmed from both the key and value.
     * * A maximum of 40 tags is allowed for any resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a stack or
     *   layer.
     * * The key cannot be empty.
     * * The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers,
     *   or separators, or the following special characters: `+ - = . _ : /`
     * * The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or
     *   separators, or the following special characters: `+ - = . _ : /`
     * * Leading and trailing white spaces are trimmed from both the key and value.
     * * A maximum of 40 tags is allowed for any resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param useCustomCookbooks Whether the stack uses custom cookbooks. */
    public fun useCustomCookbooks(useCustomCookbooks: Boolean) {
        cdkBuilder.useCustomCookbooks(useCustomCookbooks)
    }

    /** @param useCustomCookbooks Whether the stack uses custom cookbooks. */
    public fun useCustomCookbooks(useCustomCookbooks: IResolvable) {
        cdkBuilder.useCustomCookbooks(useCustomCookbooks)
    }

    /**
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     *   security groups with the stack's layers. AWS OpsWorks Stacks provides a standard set of
     *   built-in security groups, one for each layer, which are associated with layers by default.
     *   With `UseOpsworksSecurityGroups` you can instead provide your own custom security groups.
     *   `UseOpsworksSecurityGroups` has the following settings:
     * * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group
     *   with each layer (default setting). You can associate additional security groups with a
     *   layer after you create it, but you cannot delete the built-in security group.
     * * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You
     *   must create appropriate EC2 security groups and associate a security group with each layer
     *   that you create. However, you can still manually associate a built-in security group with a
     *   layer on creation; custom security groups are required only for those layers that need
     *   custom settings.
     *
     * For more information, see
     * [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html)
     * .
     */
    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: Boolean) {
        cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups)
    }

    /**
     * @param useOpsworksSecurityGroups Whether to associate the AWS OpsWorks Stacks built-in
     *   security groups with the stack's layers. AWS OpsWorks Stacks provides a standard set of
     *   built-in security groups, one for each layer, which are associated with layers by default.
     *   With `UseOpsworksSecurityGroups` you can instead provide your own custom security groups.
     *   `UseOpsworksSecurityGroups` has the following settings:
     * * True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group
     *   with each layer (default setting). You can associate additional security groups with a
     *   layer after you create it, but you cannot delete the built-in security group.
     * * False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You
     *   must create appropriate EC2 security groups and associate a security group with each layer
     *   that you create. However, you can still manually associate a built-in security group with a
     *   layer on creation; custom security groups are required only for those layers that need
     *   custom settings.
     *
     * For more information, see
     * [Create a New Stack](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html)
     * .
     */
    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: IResolvable) {
        cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups)
    }

    /**
     * @param vpcId The ID of the VPC that the stack is to be launched into. The VPC must be in the
     *   stack's region. All instances are launched into this VPC. You cannot change the ID later.
     * * If your account supports EC2-Classic, the default value is `no VPC` .
     * * If your account does not support EC2-Classic, the default value is the default VPC for the
     *   specified region.
     *
     * If the VPC ID corresponds to a default VPC and you have specified either the
     * `DefaultAvailabilityZone` or the `DefaultSubnetId` parameter only, AWS OpsWorks Stacks infers
     * the value of the other parameter. If you specify neither parameter, AWS OpsWorks Stacks sets
     * these parameters to the first valid Availability Zone for the specified region and the
     * corresponding default VPC subnet ID, respectively.
     *
     * If you specify a nondefault VPC ID, note the following:
     * * It must belong to a VPC in your account that is in the specified region.
     * * You must specify a value for `DefaultSubnetId` .
     *
     * For more information about how to use AWS OpsWorks Stacks with a VPC, see
     * [Running a Stack in a VPC](https://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html)
     * . For more information about default VPC and EC2-Classic, see
     * [Supported Platforms](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html)
     * .
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnStackProps {
        if (_cloneAppIds.isNotEmpty()) cdkBuilder.cloneAppIds(_cloneAppIds)
        if (_elasticIps.isNotEmpty()) cdkBuilder.elasticIps(_elasticIps)
        if (_rdsDbInstances.isNotEmpty()) cdkBuilder.rdsDbInstances(_rdsDbInstances)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

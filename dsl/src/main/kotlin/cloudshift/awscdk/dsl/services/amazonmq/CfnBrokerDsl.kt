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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnBroker
import software.constructs.Construct

/**
 * A *broker* is a message broker environment running on Amazon MQ .
 *
 * It is the basic building block of Amazon MQ .
 *
 * The `AWS::AmazonMQ::Broker` resource lets you create Amazon MQ for ActiveMQ and Amazon MQ for
 * RabbitMQ brokers, add configuration changes or modify users for a speified ActiveMQ broker,
 * return information about the specified broker, and delete the broker. For more information, see
 * [How Amazon MQ works](https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/amazon-mq-how-it-works.html)
 * in the *Amazon MQ Developer Guide* .
 * * `ec2:CreateNetworkInterface`
 *
 * This permission is required to allow Amazon MQ to create an elastic network interface (ENI) on
 * behalf of your account.
 * * `ec2:CreateNetworkInterfacePermission`
 *
 * This permission is required to attach the ENI to the broker instance.
 * * `ec2:DeleteNetworkInterface`
 * * `ec2:DeleteNetworkInterfacePermission`
 * * `ec2:DetachNetworkInterface`
 * * `ec2:DescribeInternetGateways`
 * * `ec2:DescribeNetworkInterfaces`
 * * `ec2:DescribeNetworkInterfacePermissions`
 * * `ec2:DescribeRouteTables`
 * * `ec2:DescribeSecurityGroups`
 * * `ec2:DescribeSubnets`
 * * `ec2:DescribeVpcs`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * CfnBroker cfnBroker = CfnBroker.Builder.create(this, "MyCfnBroker")
 * .autoMinorVersionUpgrade(false)
 * .brokerName("brokerName")
 * .deploymentMode("deploymentMode")
 * .engineType("engineType")
 * .engineVersion("engineVersion")
 * .hostInstanceType("hostInstanceType")
 * .publiclyAccessible(false)
 * .users(List.of(UserProperty.builder()
 * .password("password")
 * .username("username")
 * // the properties below are optional
 * .consoleAccess(false)
 * .groups(List.of("groups"))
 * .build()))
 * // the properties below are optional
 * .authenticationStrategy("authenticationStrategy")
 * .configuration(ConfigurationIdProperty.builder()
 * .id("id")
 * .revision(123)
 * .build())
 * .encryptionOptions(EncryptionOptionsProperty.builder()
 * .useAwsOwnedKey(false)
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .ldapServerMetadata(LdapServerMetadataProperty.builder()
 * .hosts(List.of("hosts"))
 * .roleBase("roleBase")
 * .roleSearchMatching("roleSearchMatching")
 * .serviceAccountPassword("serviceAccountPassword")
 * .serviceAccountUsername("serviceAccountUsername")
 * .userBase("userBase")
 * .userSearchMatching("userSearchMatching")
 * // the properties below are optional
 * .roleName("roleName")
 * .roleSearchSubtree(false)
 * .userRoleName("userRoleName")
 * .userSearchSubtree(false)
 * .build())
 * .logs(LogListProperty.builder()
 * .audit(false)
 * .general(false)
 * .build())
 * .maintenanceWindowStartTime(MaintenanceWindowProperty.builder()
 * .dayOfWeek("dayOfWeek")
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .securityGroups(List.of("securityGroups"))
 * .storageType("storageType")
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html)
 */
@CdkDslMarker
public class CfnBrokerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBroker.Builder = CfnBroker.Builder.create(scope, id)

    private val _securityGroups: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnBroker.TagsEntryProperty> = mutableListOf()

    private val _users: MutableList<Any> = mutableListOf()

    /**
     * Optional.
     *
     * The authentication strategy used to secure the broker. The default is `SIMPLE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-authenticationstrategy)
     *
     * @param authenticationStrategy Optional.
     */
    public fun authenticationStrategy(authenticationStrategy: String) {
        cdkBuilder.authenticationStrategy(authenticationStrategy)
    }

    /**
     * Enables automatic upgrades to new minor versions for brokers, as new broker engine versions
     * are released and supported by Amazon MQ.
     *
     * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     * manual broker reboot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade)
     *
     * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers,
     *   as new broker engine versions are released and supported by Amazon MQ.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * Enables automatic upgrades to new minor versions for brokers, as new broker engine versions
     * are released and supported by Amazon MQ.
     *
     * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     * manual broker reboot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade)
     *
     * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers,
     *   as new broker engine versions are released and supported by Amazon MQ.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * The name of the broker.
     *
     * This value must be unique in your AWS account , 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain white spaces, brackets,
     * wildcard characters, or special characters.
     *
     * Do not add personally identifiable information (PII) or other confidential or sensitive
     * information in broker names. Broker names are accessible to other AWS services, including C
     * CloudWatch Logs . Broker names are not intended to be used for private or sensitive data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-brokername)
     *
     * @param brokerName The name of the broker.
     */
    public fun brokerName(brokerName: String) {
        cdkBuilder.brokerName(brokerName)
    }

    /**
     * A list of information about the configuration.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
     *
     * @param configuration A list of information about the configuration.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * A list of information about the configuration.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
     *
     * @param configuration A list of information about the configuration.
     */
    public fun configuration(configuration: CfnBroker.ConfigurationIdProperty) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * The deployment mode of the broker. Available values:.
     * * `SINGLE_INSTANCE`
     * * `ACTIVE_STANDBY_MULTI_AZ`
     * * `CLUSTER_MULTI_AZ`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode)
     *
     * @param deploymentMode The deployment mode of the broker. Available values:.
     */
    public fun deploymentMode(deploymentMode: String) {
        cdkBuilder.deploymentMode(deploymentMode)
    }

    /**
     * Encryption options for the broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-encryptionoptions)
     *
     * @param encryptionOptions Encryption options for the broker.
     */
    public fun encryptionOptions(encryptionOptions: IResolvable) {
        cdkBuilder.encryptionOptions(encryptionOptions)
    }

    /**
     * Encryption options for the broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-encryptionoptions)
     *
     * @param encryptionOptions Encryption options for the broker.
     */
    public fun encryptionOptions(encryptionOptions: CfnBroker.EncryptionOptionsProperty) {
        cdkBuilder.encryptionOptions(encryptionOptions)
    }

    /**
     * The type of broker engine.
     *
     * Currently, Amazon MQ supports `ACTIVEMQ` and `RABBITMQ` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype)
     *
     * @param engineType The type of broker engine.
     */
    public fun engineType(engineType: String) {
        cdkBuilder.engineType(engineType)
    }

    /**
     * The version of the broker engine.
     *
     * For a list of supported engine versions, see
     * [Engine](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) in
     * the *Amazon MQ Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion)
     *
     * @param engineVersion The version of the broker engine.
     */
    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The broker's instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype)
     *
     * @param hostInstanceType The broker's instance type.
     */
    public fun hostInstanceType(hostInstanceType: String) {
        cdkBuilder.hostInstanceType(hostInstanceType)
    }

    /**
     * Optional.
     *
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-ldapservermetadata)
     *
     * @param ldapServerMetadata Optional.
     */
    public fun ldapServerMetadata(ldapServerMetadata: IResolvable) {
        cdkBuilder.ldapServerMetadata(ldapServerMetadata)
    }

    /**
     * Optional.
     *
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-ldapservermetadata)
     *
     * @param ldapServerMetadata Optional.
     */
    public fun ldapServerMetadata(ldapServerMetadata: CfnBroker.LdapServerMetadataProperty) {
        cdkBuilder.ldapServerMetadata(ldapServerMetadata)
    }

    /**
     * Enables Amazon CloudWatch logging for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-logs)
     *
     * @param logs Enables Amazon CloudWatch logging for brokers.
     */
    public fun logs(logs: IResolvable) {
        cdkBuilder.logs(logs)
    }

    /**
     * Enables Amazon CloudWatch logging for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-logs)
     *
     * @param logs Enables Amazon CloudWatch logging for brokers.
     */
    public fun logs(logs: CfnBroker.LogListProperty) {
        cdkBuilder.logs(logs)
    }

    /**
     * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
     * updates or patches to the broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
     *
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     *   Amazon MQ begins to apply pending updates or patches to the broker.
     */
    public fun maintenanceWindowStartTime(maintenanceWindowStartTime: IResolvable) {
        cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime)
    }

    /**
     * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
     * updates or patches to the broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
     *
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     *   Amazon MQ begins to apply pending updates or patches to the broker.
     */
    public fun maintenanceWindowStartTime(
        maintenanceWindowStartTime: CfnBroker.MaintenanceWindowProperty
    ) {
        cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime)
    }

    /**
     * Enables connections from applications outside of the VPC that hosts the broker's subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible)
     *
     * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
     *   the broker's subnets.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * Enables connections from applications outside of the VPC that hosts the broker's subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible)
     *
     * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
     *   the broker's subnets.
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups)
     *
     * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections
     *   to brokers.
     */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups)
     *
     * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections
     *   to brokers.
     */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * The broker's storage type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-storagetype)
     *
     * @param storageType The broker's storage type.
     */
    public fun storageType(storageType: String) {
        cdkBuilder.storageType(storageType)
    }

    /**
     * The list of groups that define which subnets and IP ranges the broker can use from different
     * Availability Zones.
     *
     * If you specify more than one subnet, the subnets must be in different Availability Zones.
     * Amazon MQ will not be able to create VPC endpoints for your broker with multiple subnets in
     * the same Availability Zone. A SINGLE_INSTANCE deployment requires one subnet (for example,
     * the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A
     * CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements when deployed with public
     * accessibility, deployment without public accessibility requires at least one subnet.
     *
     * If you specify subnets in a shared VPC for a RabbitMQ broker, the associated VPC to which the
     * specified subnets belong must be owned by your AWS account . Amazon MQ will not be able to
     * create VPC enpoints in VPCs that are not owned by your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids)
     *
     * @param subnetIds The list of groups that define which subnets and IP ranges the broker can
     *   use from different Availability Zones.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * The list of groups that define which subnets and IP ranges the broker can use from different
     * Availability Zones.
     *
     * If you specify more than one subnet, the subnets must be in different Availability Zones.
     * Amazon MQ will not be able to create VPC endpoints for your broker with multiple subnets in
     * the same Availability Zone. A SINGLE_INSTANCE deployment requires one subnet (for example,
     * the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A
     * CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements when deployed with public
     * accessibility, deployment without public accessibility requires at least one subnet.
     *
     * If you specify subnets in a shared VPC for a RabbitMQ broker, the associated VPC to which the
     * specified subnets belong must be owned by your AWS account . Amazon MQ will not be able to
     * create VPC enpoints in VPCs that are not owned by your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids)
     *
     * @param subnetIds The list of groups that define which subnets and IP ranges the broker can
     *   use from different Availability Zones.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * An array of key-value pairs.
     *
     * For more information, see
     * [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)
     * in the *Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags)
     *
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: CfnBrokerTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnBrokerTagsEntryPropertyDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs.
     *
     * For more information, see
     * [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)
     * in the *Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags)
     *
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: Collection<CfnBroker.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    /**
     * The list of broker users (persons or applications) who can access queues and topics.
     *
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via
     * the RabbitMQ web console or by using the RabbitMQ management API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
     *
     * @param users The list of broker users (persons or applications) who can access queues and
     *   topics.
     */
    public fun users(vararg users: Any) {
        _users.addAll(listOf(*users))
    }

    /**
     * The list of broker users (persons or applications) who can access queues and topics.
     *
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via
     * the RabbitMQ web console or by using the RabbitMQ management API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
     *
     * @param users The list of broker users (persons or applications) who can access queues and
     *   topics.
     */
    public fun users(users: Collection<Any>) {
        _users.addAll(users)
    }

    /**
     * The list of broker users (persons or applications) who can access queues and topics.
     *
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via
     * the RabbitMQ web console or by using the RabbitMQ management API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
     *
     * @param users The list of broker users (persons or applications) who can access queues and
     *   topics.
     */
    public fun users(users: IResolvable) {
        cdkBuilder.users(users)
    }

    public fun build(): CfnBroker {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_users.isNotEmpty()) cdkBuilder.users(_users)
        return cdkBuilder.build()
    }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amazonmq

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A *broker* is a message broker environment running on Amazon MQ .
 *
 * It is the basic building block of Amazon MQ .
 *
 * The `AWS::AmazonMQ::Broker` resource lets you create Amazon MQ for ActiveMQ and Amazon MQ for
 * RabbitMQ brokers, add configuration changes or modify users for a speified ActiveMQ broker, return
 * information about the specified broker, and delete the broker. For more information, see [How Amazon
 * MQ works](https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/amazon-mq-how-it-works.html)
 * in the *Amazon MQ Developer Guide* .
 *
 * * `ec2:CreateNetworkInterface`
 *
 * This permission is required to allow Amazon MQ to create an elastic network interface (ENI) on
 * behalf of your account.
 *
 * * `ec2:CreateNetworkInterfacePermission`
 *
 * This permission is required to attach the ENI to the broker instance.
 *
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
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amazonmq.*;
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
 * .replicationUser(false)
 * .build()))
 * // the properties below are optional
 * .authenticationStrategy("authenticationStrategy")
 * .configuration(ConfigurationIdProperty.builder()
 * .id("id")
 * .revision(123)
 * .build())
 * .dataReplicationMode("dataReplicationMode")
 * .dataReplicationPrimaryBrokerArn("dataReplicationPrimaryBrokerArn")
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
public open class CfnBroker internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The AMQP endpoints of each broker instance as a list of strings.
   *
   * `amqp+ssl://b-4aada85d-a80c-4be0-9d30-e344a01b921e-1.mq.eu-central-amazonaws.com:5671`
   */
  public open fun attrAmqpEndpoints(): List<String> = unwrap(this).getAttrAmqpEndpoints()

  /**
   * The Amazon Resource Name (ARN) of the Amazon MQ broker.
   *
   * `arn:aws:mq:us-east-2:123456789012:broker:MyBroker:b-1234a5b6-78cd-901e-2fgh-3i45j6k178l9`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique ID that Amazon MQ generates for the configuration.
   *
   * `c-1234a5b6-78cd-901e-2fgh-3i45j6k178l9`
   */
  public open fun attrConfigurationId(): String = unwrap(this).getAttrConfigurationId()

  /**
   * The revision number of the configuration.
   *
   * `1`
   */
  public open fun attrConfigurationRevision(): Number = unwrap(this).getAttrConfigurationRevision()

  /**
   * Required.
   *
   * The unique ID that Amazon MQ generates for the configuration.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The IP addresses of each broker instance as a list of strings. Does not apply to RabbitMQ
   * brokers.
   *
   * `['198.51.100.2', '203.0.113.9']`
   */
  public open fun attrIpAddresses(): List<String> = unwrap(this).getAttrIpAddresses()

  /**
   * The MQTT endpoints of each broker instance as a list of strings.
   *
   * `mqtt+ssl://b-4aada85d-a80c-4be0-9d30-e344a01b921e-1.mq.eu-central-amazonaws.com:8883`
   */
  public open fun attrMqttEndpoints(): List<String> = unwrap(this).getAttrMqttEndpoints()

  /**
   * The OpenWire endpoints of each broker instance as a list of strings.
   *
   * `ssl://b-4aada85d-a80c-4be0-9d30-e344a01b921e-1.mq.eu-central-amazonaws.com:61617`
   */
  public open fun attrOpenWireEndpoints(): List<String> = unwrap(this).getAttrOpenWireEndpoints()

  /**
   * The STOMP endpoints of each broker instance as a list of strings.
   *
   * `stomp+ssl://b-4aada85d-a80c-4be0-9d30-e344a01b921e-1.mq.eu-central-amazonaws.com:61614`
   */
  public open fun attrStompEndpoints(): List<String> = unwrap(this).getAttrStompEndpoints()

  /**
   * The WSS endpoints of each broker instance as a list of strings.
   *
   * `wss://b-4aada85d-a80c-4be0-9d30-e344a01b921e-1.mq.eu-central-amazonaws.com:61619`
   */
  public open fun attrWssEndpoints(): List<String> = unwrap(this).getAttrWssEndpoints()

  /**
   * Optional.
   */
  public open fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

  /**
   * Optional.
   */
  public open fun authenticationStrategy(`value`: String) {
    unwrap(this).setAuthenticationStrategy(`value`)
  }

  /**
   * Enables automatic upgrades to new minor versions for brokers, as new broker engine versions are
   * released and supported by Amazon MQ.
   */
  public open fun autoMinorVersionUpgrade(): Any = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * Enables automatic upgrades to new minor versions for brokers, as new broker engine versions are
   * released and supported by Amazon MQ.
   */
  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  /**
   * Enables automatic upgrades to new minor versions for brokers, as new broker engine versions are
   * released and supported by Amazon MQ.
   */
  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the broker.
   */
  public open fun brokerName(): String = unwrap(this).getBrokerName()

  /**
   * The name of the broker.
   */
  public open fun brokerName(`value`: String) {
    unwrap(this).setBrokerName(`value`)
  }

  /**
   * A list of information about the configuration.
   */
  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * A list of information about the configuration.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of information about the configuration.
   */
  public open fun configuration(`value`: ConfigurationIdProperty) {
    unwrap(this).setConfiguration(`value`.let(ConfigurationIdProperty::unwrap))
  }

  /**
   * A list of information about the configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95ab61e63aa788252f5ea1259bd75515dc74f2818b183efaeafb6a340be9374b")
  public open fun configuration(`value`: ConfigurationIdProperty.Builder.() -> Unit): Unit =
      configuration(ConfigurationIdProperty(`value`))

  /**
   * Defines whether this broker is a part of a data replication pair.
   */
  public open fun dataReplicationMode(): String? = unwrap(this).getDataReplicationMode()

  /**
   * Defines whether this broker is a part of a data replication pair.
   */
  public open fun dataReplicationMode(`value`: String) {
    unwrap(this).setDataReplicationMode(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the primary broker that is used to replicate data from in a
   * data replication pair, and is applied to the replica broker.
   */
  public open fun dataReplicationPrimaryBrokerArn(): String? =
      unwrap(this).getDataReplicationPrimaryBrokerArn()

  /**
   * The Amazon Resource Name (ARN) of the primary broker that is used to replicate data from in a
   * data replication pair, and is applied to the replica broker.
   */
  public open fun dataReplicationPrimaryBrokerArn(`value`: String) {
    unwrap(this).setDataReplicationPrimaryBrokerArn(`value`)
  }

  /**
   * The deployment mode of the broker.
   *
   * Available values:.
   */
  public open fun deploymentMode(): String = unwrap(this).getDeploymentMode()

  /**
   * The deployment mode of the broker.
   *
   * Available values:.
   */
  public open fun deploymentMode(`value`: String) {
    unwrap(this).setDeploymentMode(`value`)
  }

  /**
   * Encryption options for the broker.
   */
  public open fun encryptionOptions(): Any? = unwrap(this).getEncryptionOptions()

  /**
   * Encryption options for the broker.
   */
  public open fun encryptionOptions(`value`: IResolvable) {
    unwrap(this).setEncryptionOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Encryption options for the broker.
   */
  public open fun encryptionOptions(`value`: EncryptionOptionsProperty) {
    unwrap(this).setEncryptionOptions(`value`.let(EncryptionOptionsProperty::unwrap))
  }

  /**
   * Encryption options for the broker.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0f4f3c6e10f215be5303a65c912a5dddbac0af898de03b9257293dc357452c14")
  public open fun encryptionOptions(`value`: EncryptionOptionsProperty.Builder.() -> Unit): Unit =
      encryptionOptions(EncryptionOptionsProperty(`value`))

  /**
   * The type of broker engine.
   */
  public open fun engineType(): String = unwrap(this).getEngineType()

  /**
   * The type of broker engine.
   */
  public open fun engineType(`value`: String) {
    unwrap(this).setEngineType(`value`)
  }

  /**
   * The version of the broker engine.
   */
  public open fun engineVersion(): String = unwrap(this).getEngineVersion()

  /**
   * The version of the broker engine.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * The broker's instance type.
   */
  public open fun hostInstanceType(): String = unwrap(this).getHostInstanceType()

  /**
   * The broker's instance type.
   */
  public open fun hostInstanceType(`value`: String) {
    unwrap(this).setHostInstanceType(`value`)
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
   * Optional.
   */
  public open fun ldapServerMetadata(): Any? = unwrap(this).getLdapServerMetadata()

  /**
   * Optional.
   */
  public open fun ldapServerMetadata(`value`: IResolvable) {
    unwrap(this).setLdapServerMetadata(`value`.let(IResolvable::unwrap))
  }

  /**
   * Optional.
   */
  public open fun ldapServerMetadata(`value`: LdapServerMetadataProperty) {
    unwrap(this).setLdapServerMetadata(`value`.let(LdapServerMetadataProperty::unwrap))
  }

  /**
   * Optional.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b90d1a5e7e8c67854a133d01185cf2729b0ccb1bc750960f2c39769256560f4c")
  public open fun ldapServerMetadata(`value`: LdapServerMetadataProperty.Builder.() -> Unit): Unit =
      ldapServerMetadata(LdapServerMetadataProperty(`value`))

  /**
   * Enables Amazon CloudWatch logging for brokers.
   */
  public open fun logs(): Any? = unwrap(this).getLogs()

  /**
   * Enables Amazon CloudWatch logging for brokers.
   */
  public open fun logs(`value`: IResolvable) {
    unwrap(this).setLogs(`value`.let(IResolvable::unwrap))
  }

  /**
   * Enables Amazon CloudWatch logging for brokers.
   */
  public open fun logs(`value`: LogListProperty) {
    unwrap(this).setLogs(`value`.let(LogListProperty::unwrap))
  }

  /**
   * Enables Amazon CloudWatch logging for brokers.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbc9ee5548c2cae1e112fbfef91291ede2c30687d82637d71e8e6ea4ebe67c0f")
  public open fun logs(`value`: LogListProperty.Builder.() -> Unit): Unit =
      logs(LogListProperty(`value`))

  /**
   * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
   * updates or patches to the broker.
   */
  public open fun maintenanceWindowStartTime(): Any? = unwrap(this).getMaintenanceWindowStartTime()

  /**
   * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
   * updates or patches to the broker.
   */
  public open fun maintenanceWindowStartTime(`value`: IResolvable) {
    unwrap(this).setMaintenanceWindowStartTime(`value`.let(IResolvable::unwrap))
  }

  /**
   * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
   * updates or patches to the broker.
   */
  public open fun maintenanceWindowStartTime(`value`: MaintenanceWindowProperty) {
    unwrap(this).setMaintenanceWindowStartTime(`value`.let(MaintenanceWindowProperty::unwrap))
  }

  /**
   * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
   * updates or patches to the broker.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10082861b49fcb46b80da6dbfe49cf8ce46398ab8cbc5bc3f6bd2a15b75c5a6f")
  public open fun maintenanceWindowStartTime(`value`: MaintenanceWindowProperty.Builder.() -> Unit):
      Unit = maintenanceWindowStartTime(MaintenanceWindowProperty(`value`))

  /**
   * Enables connections from applications outside of the VPC that hosts the broker's subnets.
   */
  public open fun publiclyAccessible(): Any = unwrap(this).getPubliclyAccessible()

  /**
   * Enables connections from applications outside of the VPC that hosts the broker's subnets.
   */
  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  /**
   * Enables connections from applications outside of the VPC that hosts the broker's subnets.
   */
  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
   */
  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
   */
  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  /**
   * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
   */
  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  /**
   * The broker's storage type.
   */
  public open fun storageType(): String? = unwrap(this).getStorageType()

  /**
   * The broker's storage type.
   */
  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
  }

  /**
   * The list of groups that define which subnets and IP ranges the broker can use from different
   * Availability Zones.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * The list of groups that define which subnets and IP ranges the broker can use from different
   * Availability Zones.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The list of groups that define which subnets and IP ranges the broker can use from different
   * Availability Zones.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty::unwrap))
  }

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(vararg `value`: TagsEntryProperty): Unit = tagsRaw(`value`.toList())

  /**
   * The list of broker users (persons or applications) who can access queues and topics.
   */
  public open fun users(): Any = unwrap(this).getUsers()

  /**
   * The list of broker users (persons or applications) who can access queues and topics.
   */
  public open fun users(`value`: IResolvable) {
    unwrap(this).setUsers(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of broker users (persons or applications) who can access queues and topics.
   */
  public open fun users(_idx_ac66f0: List<Any>) {
    unwrap(this).setUsers(_idx_ac66f0)
  }

  /**
   * The list of broker users (persons or applications) who can access queues and topics.
   */
  public open fun users(vararg _idx_ac66f0: Any): Unit = users(_idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.amazonmq.CfnBroker].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Optional.
     *
     * The authentication strategy used to secure the broker. The default is `SIMPLE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-authenticationstrategy)
     * @param authenticationStrategy Optional. 
     */
    public fun authenticationStrategy(authenticationStrategy: String)

    /**
     * Enables automatic upgrades to new minor versions for brokers, as new broker engine versions
     * are released and supported by Amazon MQ.
     *
     * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     * manual broker reboot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade)
     * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers,
     * as new broker engine versions are released and supported by Amazon MQ. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * Enables automatic upgrades to new minor versions for brokers, as new broker engine versions
     * are released and supported by Amazon MQ.
     *
     * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     * manual broker reboot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade)
     * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers,
     * as new broker engine versions are released and supported by Amazon MQ. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * The name of the broker.
     *
     * This value must be unique in your AWS account , 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard
     * characters, or special characters.
     *
     *
     * Do not add personally identifiable information (PII) or other confidential or sensitive
     * information in broker names. Broker names are accessible to other AWS services, including C
     * CloudWatch Logs . Broker names are not intended to be used for private or sensitive data.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-brokername)
     * @param brokerName The name of the broker. 
     */
    public fun brokerName(brokerName: String)

    /**
     * A list of information about the configuration.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
     * @param configuration A list of information about the configuration. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * A list of information about the configuration.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
     * @param configuration A list of information about the configuration. 
     */
    public fun configuration(configuration: ConfigurationIdProperty)

    /**
     * A list of information about the configuration.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
     * @param configuration A list of information about the configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9934c043a276b6709f5df61ad8956b4a997d673a5084d85433779600a5e4360")
    public fun configuration(configuration: ConfigurationIdProperty.Builder.() -> Unit)

    /**
     * Defines whether this broker is a part of a data replication pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-datareplicationmode)
     * @param dataReplicationMode Defines whether this broker is a part of a data replication pair. 
     */
    public fun dataReplicationMode(dataReplicationMode: String)

    /**
     * The Amazon Resource Name (ARN) of the primary broker that is used to replicate data from in a
     * data replication pair, and is applied to the replica broker.
     *
     * Must be set when dataReplicationMode is set to CRDR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-datareplicationprimarybrokerarn)
     * @param dataReplicationPrimaryBrokerArn The Amazon Resource Name (ARN) of the primary broker
     * that is used to replicate data from in a data replication pair, and is applied to the replica
     * broker. 
     */
    public fun dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn: String)

    /**
     * The deployment mode of the broker. Available values:.
     *
     * * `SINGLE_INSTANCE`
     * * `ACTIVE_STANDBY_MULTI_AZ`
     * * `CLUSTER_MULTI_AZ`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode)
     * @param deploymentMode The deployment mode of the broker. Available values:. 
     */
    public fun deploymentMode(deploymentMode: String)

    /**
     * Encryption options for the broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-encryptionoptions)
     * @param encryptionOptions Encryption options for the broker. 
     */
    public fun encryptionOptions(encryptionOptions: IResolvable)

    /**
     * Encryption options for the broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-encryptionoptions)
     * @param encryptionOptions Encryption options for the broker. 
     */
    public fun encryptionOptions(encryptionOptions: EncryptionOptionsProperty)

    /**
     * Encryption options for the broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-encryptionoptions)
     * @param encryptionOptions Encryption options for the broker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27fe168ca245b68292bfdf48ec00a367af07255b6f406ed3296fa43c1a3547da")
    public fun encryptionOptions(encryptionOptions: EncryptionOptionsProperty.Builder.() -> Unit)

    /**
     * The type of broker engine.
     *
     * Currently, Amazon MQ supports `ACTIVEMQ` and `RABBITMQ` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype)
     * @param engineType The type of broker engine. 
     */
    public fun engineType(engineType: String)

    /**
     * The version of the broker engine.
     *
     * For a list of supported engine versions, see
     * [Engine](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) in the
     * *Amazon MQ Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion)
     * @param engineVersion The version of the broker engine. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * The broker's instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype)
     * @param hostInstanceType The broker's instance type. 
     */
    public fun hostInstanceType(hostInstanceType: String)

    /**
     * Optional.
     *
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-ldapservermetadata)
     * @param ldapServerMetadata Optional. 
     */
    public fun ldapServerMetadata(ldapServerMetadata: IResolvable)

    /**
     * Optional.
     *
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-ldapservermetadata)
     * @param ldapServerMetadata Optional. 
     */
    public fun ldapServerMetadata(ldapServerMetadata: LdapServerMetadataProperty)

    /**
     * Optional.
     *
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-ldapservermetadata)
     * @param ldapServerMetadata Optional. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d49dc3540c98e0160a80f08fb28165514a9e96f98b851cadb657f7d784c7ecfd")
    public fun ldapServerMetadata(ldapServerMetadata: LdapServerMetadataProperty.Builder.() -> Unit)

    /**
     * Enables Amazon CloudWatch logging for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-logs)
     * @param logs Enables Amazon CloudWatch logging for brokers. 
     */
    public fun logs(logs: IResolvable)

    /**
     * Enables Amazon CloudWatch logging for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-logs)
     * @param logs Enables Amazon CloudWatch logging for brokers. 
     */
    public fun logs(logs: LogListProperty)

    /**
     * Enables Amazon CloudWatch logging for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-logs)
     * @param logs Enables Amazon CloudWatch logging for brokers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c46ecfc3b2482edc22ff6cd2af903a75fe8815c2089bb6ed4e59dd3de838727")
    public fun logs(logs: LogListProperty.Builder.() -> Unit)

    /**
     * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
     * updates or patches to the broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker. 
     */
    public fun maintenanceWindowStartTime(maintenanceWindowStartTime: IResolvable)

    /**
     * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
     * updates or patches to the broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker. 
     */
    public fun maintenanceWindowStartTime(maintenanceWindowStartTime: MaintenanceWindowProperty)

    /**
     * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
     * updates or patches to the broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9e364ba9d656fb70437fef551cc2a021ac7724c333fae215ce78db727d7215")
    public
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: MaintenanceWindowProperty.Builder.() -> Unit)

    /**
     * Enables connections from applications outside of the VPC that hosts the broker's subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible)
     * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
     * the broker's subnets. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * Enables connections from applications outside of the VPC that hosts the broker's subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible)
     * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
     * the broker's subnets. 
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups)
     * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections
     * to brokers. 
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups)
     * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections
     * to brokers. 
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * The broker's storage type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-storagetype)
     * @param storageType The broker's storage type. 
     */
    public fun storageType(storageType: String)

    /**
     * The list of groups that define which subnets and IP ranges the broker can use from different
     * Availability Zones.
     *
     * If you specify more than one subnet, the subnets must be in different Availability Zones.
     * Amazon MQ will not be able to create VPC endpoints for your broker with multiple subnets in the
     * same Availability Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the
     * default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A
     * CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements when deployed with public
     * accessibility, deployment without public accessibility requires at least one subnet.
     *
     *
     * If you specify subnets in a shared VPC for a RabbitMQ broker, the associated VPC to which the
     * specified subnets belong must be owned by your AWS account . Amazon MQ will not be able to
     * create VPC enpoints in VPCs that are not owned by your AWS account .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids)
     * @param subnetIds The list of groups that define which subnets and IP ranges the broker can
     * use from different Availability Zones. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The list of groups that define which subnets and IP ranges the broker can use from different
     * Availability Zones.
     *
     * If you specify more than one subnet, the subnets must be in different Availability Zones.
     * Amazon MQ will not be able to create VPC endpoints for your broker with multiple subnets in the
     * same Availability Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the
     * default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A
     * CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements when deployed with public
     * accessibility, deployment without public accessibility requires at least one subnet.
     *
     *
     * If you specify subnets in a shared VPC for a RabbitMQ broker, the associated VPC to which the
     * specified subnets belong must be owned by your AWS account . Amazon MQ will not be able to
     * create VPC enpoints in VPCs that are not owned by your AWS account .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids)
     * @param subnetIds The list of groups that define which subnets and IP ranges the broker can
     * use from different Availability Zones. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * An array of key-value pairs.
     *
     * For more information, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags)
     * @param tags An array of key-value pairs. 
     */
    public fun tags(tags: List<TagsEntryProperty>)

    /**
     * An array of key-value pairs.
     *
     * For more information, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags)
     * @param tags An array of key-value pairs. 
     */
    public fun tags(vararg tags: TagsEntryProperty)

    /**
     * The list of broker users (persons or applications) who can access queues and topics.
     *
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     */
    public fun users(users: IResolvable)

    /**
     * The list of broker users (persons or applications) who can access queues and topics.
     *
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     */
    public fun users(users: List<Any>)

    /**
     * The list of broker users (persons or applications) who can access queues and topics.
     *
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     */
    public fun users(vararg users: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amazonmq.CfnBroker.Builder =
        software.amazon.awscdk.services.amazonmq.CfnBroker.Builder.create(scope, id)

    /**
     * Optional.
     *
     * The authentication strategy used to secure the broker. The default is `SIMPLE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-authenticationstrategy)
     * @param authenticationStrategy Optional. 
     */
    override fun authenticationStrategy(authenticationStrategy: String) {
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
     * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers,
     * as new broker engine versions are released and supported by Amazon MQ. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
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
     * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers,
     * as new broker engine versions are released and supported by Amazon MQ. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * The name of the broker.
     *
     * This value must be unique in your AWS account , 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard
     * characters, or special characters.
     *
     *
     * Do not add personally identifiable information (PII) or other confidential or sensitive
     * information in broker names. Broker names are accessible to other AWS services, including C
     * CloudWatch Logs . Broker names are not intended to be used for private or sensitive data.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-brokername)
     * @param brokerName The name of the broker. 
     */
    override fun brokerName(brokerName: String) {
      cdkBuilder.brokerName(brokerName)
    }

    /**
     * A list of information about the configuration.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
     * @param configuration A list of information about the configuration. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * A list of information about the configuration.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
     * @param configuration A list of information about the configuration. 
     */
    override fun configuration(configuration: ConfigurationIdProperty) {
      cdkBuilder.configuration(configuration.let(ConfigurationIdProperty::unwrap))
    }

    /**
     * A list of information about the configuration.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
     * @param configuration A list of information about the configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9934c043a276b6709f5df61ad8956b4a997d673a5084d85433779600a5e4360")
    override fun configuration(configuration: ConfigurationIdProperty.Builder.() -> Unit): Unit =
        configuration(ConfigurationIdProperty(configuration))

    /**
     * Defines whether this broker is a part of a data replication pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-datareplicationmode)
     * @param dataReplicationMode Defines whether this broker is a part of a data replication pair. 
     */
    override fun dataReplicationMode(dataReplicationMode: String) {
      cdkBuilder.dataReplicationMode(dataReplicationMode)
    }

    /**
     * The Amazon Resource Name (ARN) of the primary broker that is used to replicate data from in a
     * data replication pair, and is applied to the replica broker.
     *
     * Must be set when dataReplicationMode is set to CRDR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-datareplicationprimarybrokerarn)
     * @param dataReplicationPrimaryBrokerArn The Amazon Resource Name (ARN) of the primary broker
     * that is used to replicate data from in a data replication pair, and is applied to the replica
     * broker. 
     */
    override fun dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn: String) {
      cdkBuilder.dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn)
    }

    /**
     * The deployment mode of the broker. Available values:.
     *
     * * `SINGLE_INSTANCE`
     * * `ACTIVE_STANDBY_MULTI_AZ`
     * * `CLUSTER_MULTI_AZ`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode)
     * @param deploymentMode The deployment mode of the broker. Available values:. 
     */
    override fun deploymentMode(deploymentMode: String) {
      cdkBuilder.deploymentMode(deploymentMode)
    }

    /**
     * Encryption options for the broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-encryptionoptions)
     * @param encryptionOptions Encryption options for the broker. 
     */
    override fun encryptionOptions(encryptionOptions: IResolvable) {
      cdkBuilder.encryptionOptions(encryptionOptions.let(IResolvable::unwrap))
    }

    /**
     * Encryption options for the broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-encryptionoptions)
     * @param encryptionOptions Encryption options for the broker. 
     */
    override fun encryptionOptions(encryptionOptions: EncryptionOptionsProperty) {
      cdkBuilder.encryptionOptions(encryptionOptions.let(EncryptionOptionsProperty::unwrap))
    }

    /**
     * Encryption options for the broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-encryptionoptions)
     * @param encryptionOptions Encryption options for the broker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27fe168ca245b68292bfdf48ec00a367af07255b6f406ed3296fa43c1a3547da")
    override fun encryptionOptions(encryptionOptions: EncryptionOptionsProperty.Builder.() -> Unit):
        Unit = encryptionOptions(EncryptionOptionsProperty(encryptionOptions))

    /**
     * The type of broker engine.
     *
     * Currently, Amazon MQ supports `ACTIVEMQ` and `RABBITMQ` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype)
     * @param engineType The type of broker engine. 
     */
    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    /**
     * The version of the broker engine.
     *
     * For a list of supported engine versions, see
     * [Engine](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) in the
     * *Amazon MQ Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion)
     * @param engineVersion The version of the broker engine. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The broker's instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype)
     * @param hostInstanceType The broker's instance type. 
     */
    override fun hostInstanceType(hostInstanceType: String) {
      cdkBuilder.hostInstanceType(hostInstanceType)
    }

    /**
     * Optional.
     *
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-ldapservermetadata)
     * @param ldapServerMetadata Optional. 
     */
    override fun ldapServerMetadata(ldapServerMetadata: IResolvable) {
      cdkBuilder.ldapServerMetadata(ldapServerMetadata.let(IResolvable::unwrap))
    }

    /**
     * Optional.
     *
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-ldapservermetadata)
     * @param ldapServerMetadata Optional. 
     */
    override fun ldapServerMetadata(ldapServerMetadata: LdapServerMetadataProperty) {
      cdkBuilder.ldapServerMetadata(ldapServerMetadata.let(LdapServerMetadataProperty::unwrap))
    }

    /**
     * Optional.
     *
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-ldapservermetadata)
     * @param ldapServerMetadata Optional. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d49dc3540c98e0160a80f08fb28165514a9e96f98b851cadb657f7d784c7ecfd")
    override
        fun ldapServerMetadata(ldapServerMetadata: LdapServerMetadataProperty.Builder.() -> Unit):
        Unit = ldapServerMetadata(LdapServerMetadataProperty(ldapServerMetadata))

    /**
     * Enables Amazon CloudWatch logging for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-logs)
     * @param logs Enables Amazon CloudWatch logging for brokers. 
     */
    override fun logs(logs: IResolvable) {
      cdkBuilder.logs(logs.let(IResolvable::unwrap))
    }

    /**
     * Enables Amazon CloudWatch logging for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-logs)
     * @param logs Enables Amazon CloudWatch logging for brokers. 
     */
    override fun logs(logs: LogListProperty) {
      cdkBuilder.logs(logs.let(LogListProperty::unwrap))
    }

    /**
     * Enables Amazon CloudWatch logging for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-logs)
     * @param logs Enables Amazon CloudWatch logging for brokers. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4c46ecfc3b2482edc22ff6cd2af903a75fe8815c2089bb6ed4e59dd3de838727")
    override fun logs(logs: LogListProperty.Builder.() -> Unit): Unit = logs(LogListProperty(logs))

    /**
     * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
     * updates or patches to the broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker. 
     */
    override fun maintenanceWindowStartTime(maintenanceWindowStartTime: IResolvable) {
      cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime.let(IResolvable::unwrap))
    }

    /**
     * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
     * updates or patches to the broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker. 
     */
    override fun maintenanceWindowStartTime(maintenanceWindowStartTime: MaintenanceWindowProperty) {
      cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime.let(MaintenanceWindowProperty::unwrap))
    }

    /**
     * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
     * updates or patches to the broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d9e364ba9d656fb70437fef551cc2a021ac7724c333fae215ce78db727d7215")
    override
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: MaintenanceWindowProperty.Builder.() -> Unit):
        Unit = maintenanceWindowStartTime(MaintenanceWindowProperty(maintenanceWindowStartTime))

    /**
     * Enables connections from applications outside of the VPC that hosts the broker's subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible)
     * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
     * the broker's subnets. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * Enables connections from applications outside of the VPC that hosts the broker's subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible)
     * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
     * the broker's subnets. 
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups)
     * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections
     * to brokers. 
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups)
     * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections
     * to brokers. 
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * The broker's storage type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-storagetype)
     * @param storageType The broker's storage type. 
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    /**
     * The list of groups that define which subnets and IP ranges the broker can use from different
     * Availability Zones.
     *
     * If you specify more than one subnet, the subnets must be in different Availability Zones.
     * Amazon MQ will not be able to create VPC endpoints for your broker with multiple subnets in the
     * same Availability Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the
     * default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A
     * CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements when deployed with public
     * accessibility, deployment without public accessibility requires at least one subnet.
     *
     *
     * If you specify subnets in a shared VPC for a RabbitMQ broker, the associated VPC to which the
     * specified subnets belong must be owned by your AWS account . Amazon MQ will not be able to
     * create VPC enpoints in VPCs that are not owned by your AWS account .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids)
     * @param subnetIds The list of groups that define which subnets and IP ranges the broker can
     * use from different Availability Zones. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The list of groups that define which subnets and IP ranges the broker can use from different
     * Availability Zones.
     *
     * If you specify more than one subnet, the subnets must be in different Availability Zones.
     * Amazon MQ will not be able to create VPC endpoints for your broker with multiple subnets in the
     * same Availability Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the
     * default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A
     * CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements when deployed with public
     * accessibility, deployment without public accessibility requires at least one subnet.
     *
     *
     * If you specify subnets in a shared VPC for a RabbitMQ broker, the associated VPC to which the
     * specified subnets belong must be owned by your AWS account . Amazon MQ will not be able to
     * create VPC enpoints in VPCs that are not owned by your AWS account .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids)
     * @param subnetIds The list of groups that define which subnets and IP ranges the broker can
     * use from different Availability Zones. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * An array of key-value pairs.
     *
     * For more information, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags)
     * @param tags An array of key-value pairs. 
     */
    override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
    }

    /**
     * An array of key-value pairs.
     *
     * For more information, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags)
     * @param tags An array of key-value pairs. 
     */
    override fun tags(vararg tags: TagsEntryProperty): Unit = tags(tags.toList())

    /**
     * The list of broker users (persons or applications) who can access queues and topics.
     *
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     */
    override fun users(users: IResolvable) {
      cdkBuilder.users(users.let(IResolvable::unwrap))
    }

    /**
     * The list of broker users (persons or applications) who can access queues and topics.
     *
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     */
    override fun users(users: List<Any>) {
      cdkBuilder.users(users)
    }

    /**
     * The list of broker users (persons or applications) who can access queues and topics.
     *
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     */
    override fun users(vararg users: Any): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnBroker = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.amazonmq.CfnBroker.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBroker {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBroker(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker): CfnBroker =
        CfnBroker(cdkObject)

    internal fun unwrap(wrapped: CfnBroker): software.amazon.awscdk.services.amazonmq.CfnBroker =
        wrapped.cdkObject
  }

  /**
   * Optional. The metadata of the LDAP server used to authenticate and authorize connections to the
   * broker.
   *
   *
   * Does not apply to RabbitMQ brokers.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amazonmq.*;
   * LdapServerMetadataProperty ldapServerMetadataProperty = LdapServerMetadataProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html)
   */
  public interface LdapServerMetadataProperty {
    /**
     * Specifies the location of the LDAP server such as AWS Directory Service for Microsoft Active
     * Directory .
     *
     * Optional failover server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-hosts)
     */
    public fun hosts(): List<String>

    /**
     * The distinguished name of the node in the directory information tree (DIT) to search for
     * roles or groups.
     *
     * For example, `ou=group` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-rolebase)
     */
    public fun roleBase(): String

    /**
     * The group name attribute in a role entry whose value is the name of that role.
     *
     * For example, you can specify `cn` for a group entry's common name. If authentication
     * succeeds, then the user is assigned the the value of the `cn` attribute for each role entry that
     * they are a member of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-rolename)
     */
    public fun roleName(): String? = unwrap(this).getRoleName()

    /**
     * The LDAP search filter used to find roles within the roleBase.
     *
     * The distinguished name of the user matched by userSearchMatching is substituted into the
     * `{0}` placeholder in the search filter. The client's username is substituted into the `{1}`
     * placeholder. For example, if you set this option to `(member=uid={1})` for the user janedoe, the
     * search filter becomes `(member=uid=janedoe)` after string substitution. It matches all role
     * entries that have a member attribute equal to `uid=janedoe` under the subtree selected by the
     * `RoleBases` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-rolesearchmatching)
     */
    public fun roleSearchMatching(): String

    /**
     * The directory search scope for the role.
     *
     * If set to true, scope is to search the entire subtree.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-rolesearchsubtree)
     */
    public fun roleSearchSubtree(): Any? = unwrap(this).getRoleSearchSubtree()

    /**
     * Service account password.
     *
     * A service account is an account in your LDAP server that has access to initiate a connection.
     * For example, `cn=admin` , `dc=corp` , `dc=example` , `dc=com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-serviceaccountpassword)
     */
    public fun serviceAccountPassword(): String

    /**
     * Service account username.
     *
     * A service account is an account in your LDAP server that has access to initiate a connection.
     * For example, `cn=admin` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-serviceaccountusername)
     */
    public fun serviceAccountUsername(): String

    /**
     * Select a particular subtree of the directory information tree (DIT) to search for user
     * entries.
     *
     * The subtree is specified by a DN, which specifies the base node of the subtree. For example,
     * by setting this option to `ou=Users` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` , the
     * search for user entries is restricted to the subtree beneath `ou=Users` , `ou=corp` , `dc=corp`
     * , `dc=example` , `dc=com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-userbase)
     */
    public fun userBase(): String

    /**
     * The name of the LDAP attribute in the user's directory entry for the user's group membership.
     *
     * In some cases, user roles may be identified by the value of an attribute in the user's
     * directory entry. The `UserRoleName` option allows you to provide the name of this attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-userrolename)
     */
    public fun userRoleName(): String? = unwrap(this).getUserRoleName()

    /**
     * The LDAP search filter used to find users within the `userBase` .
     *
     * The client's username is substituted into the `{0}` placeholder in the search filter. For
     * example, if this option is set to `(uid={0})` and the received username is `janedoe` , the
     * search filter becomes `(uid=janedoe)` after string substitution. It will result in matching an
     * entry like `uid=janedoe` , `ou=Users` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-usersearchmatching)
     */
    public fun userSearchMatching(): String

    /**
     * The directory search scope for the user.
     *
     * If set to true, scope is to search the entire subtree.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-usersearchsubtree)
     */
    public fun userSearchSubtree(): Any? = unwrap(this).getUserSearchSubtree()

    /**
     * A builder for [LdapServerMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hosts Specifies the location of the LDAP server such as AWS Directory Service for
       * Microsoft Active Directory . 
       * Optional failover server.
       */
      public fun hosts(hosts: List<String>)

      /**
       * @param hosts Specifies the location of the LDAP server such as AWS Directory Service for
       * Microsoft Active Directory . 
       * Optional failover server.
       */
      public fun hosts(vararg hosts: String)

      /**
       * @param roleBase The distinguished name of the node in the directory information tree (DIT)
       * to search for roles or groups. 
       * For example, `ou=group` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       */
      public fun roleBase(roleBase: String)

      /**
       * @param roleName The group name attribute in a role entry whose value is the name of that
       * role.
       * For example, you can specify `cn` for a group entry's common name. If authentication
       * succeeds, then the user is assigned the the value of the `cn` attribute for each role entry
       * that they are a member of.
       */
      public fun roleName(roleName: String)

      /**
       * @param roleSearchMatching The LDAP search filter used to find roles within the roleBase. 
       * The distinguished name of the user matched by userSearchMatching is substituted into the
       * `{0}` placeholder in the search filter. The client's username is substituted into the `{1}`
       * placeholder. For example, if you set this option to `(member=uid={1})` for the user janedoe,
       * the search filter becomes `(member=uid=janedoe)` after string substitution. It matches all
       * role entries that have a member attribute equal to `uid=janedoe` under the subtree selected by
       * the `RoleBases` .
       */
      public fun roleSearchMatching(roleSearchMatching: String)

      /**
       * @param roleSearchSubtree The directory search scope for the role.
       * If set to true, scope is to search the entire subtree.
       */
      public fun roleSearchSubtree(roleSearchSubtree: Boolean)

      /**
       * @param roleSearchSubtree The directory search scope for the role.
       * If set to true, scope is to search the entire subtree.
       */
      public fun roleSearchSubtree(roleSearchSubtree: IResolvable)

      /**
       * @param serviceAccountPassword Service account password. 
       * A service account is an account in your LDAP server that has access to initiate a
       * connection. For example, `cn=admin` , `dc=corp` , `dc=example` , `dc=com` .
       */
      public fun serviceAccountPassword(serviceAccountPassword: String)

      /**
       * @param serviceAccountUsername Service account username. 
       * A service account is an account in your LDAP server that has access to initiate a
       * connection. For example, `cn=admin` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       */
      public fun serviceAccountUsername(serviceAccountUsername: String)

      /**
       * @param userBase Select a particular subtree of the directory information tree (DIT) to
       * search for user entries. 
       * The subtree is specified by a DN, which specifies the base node of the subtree. For
       * example, by setting this option to `ou=Users` , `ou=corp` , `dc=corp` , `dc=example` ,
       * `dc=com` , the search for user entries is restricted to the subtree beneath `ou=Users` ,
       * `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       */
      public fun userBase(userBase: String)

      /**
       * @param userRoleName The name of the LDAP attribute in the user's directory entry for the
       * user's group membership.
       * In some cases, user roles may be identified by the value of an attribute in the user's
       * directory entry. The `UserRoleName` option allows you to provide the name of this attribute.
       */
      public fun userRoleName(userRoleName: String)

      /**
       * @param userSearchMatching The LDAP search filter used to find users within the `userBase` .
       * 
       * The client's username is substituted into the `{0}` placeholder in the search filter. For
       * example, if this option is set to `(uid={0})` and the received username is `janedoe` , the
       * search filter becomes `(uid=janedoe)` after string substitution. It will result in matching an
       * entry like `uid=janedoe` , `ou=Users` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       */
      public fun userSearchMatching(userSearchMatching: String)

      /**
       * @param userSearchSubtree The directory search scope for the user.
       * If set to true, scope is to search the entire subtree.
       */
      public fun userSearchSubtree(userSearchSubtree: Boolean)

      /**
       * @param userSearchSubtree The directory search scope for the user.
       * If set to true, scope is to search the entire subtree.
       */
      public fun userSearchSubtree(userSearchSubtree: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty.builder()

      /**
       * @param hosts Specifies the location of the LDAP server such as AWS Directory Service for
       * Microsoft Active Directory . 
       * Optional failover server.
       */
      override fun hosts(hosts: List<String>) {
        cdkBuilder.hosts(hosts)
      }

      /**
       * @param hosts Specifies the location of the LDAP server such as AWS Directory Service for
       * Microsoft Active Directory . 
       * Optional failover server.
       */
      override fun hosts(vararg hosts: String): Unit = hosts(hosts.toList())

      /**
       * @param roleBase The distinguished name of the node in the directory information tree (DIT)
       * to search for roles or groups. 
       * For example, `ou=group` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       */
      override fun roleBase(roleBase: String) {
        cdkBuilder.roleBase(roleBase)
      }

      /**
       * @param roleName The group name attribute in a role entry whose value is the name of that
       * role.
       * For example, you can specify `cn` for a group entry's common name. If authentication
       * succeeds, then the user is assigned the the value of the `cn` attribute for each role entry
       * that they are a member of.
       */
      override fun roleName(roleName: String) {
        cdkBuilder.roleName(roleName)
      }

      /**
       * @param roleSearchMatching The LDAP search filter used to find roles within the roleBase. 
       * The distinguished name of the user matched by userSearchMatching is substituted into the
       * `{0}` placeholder in the search filter. The client's username is substituted into the `{1}`
       * placeholder. For example, if you set this option to `(member=uid={1})` for the user janedoe,
       * the search filter becomes `(member=uid=janedoe)` after string substitution. It matches all
       * role entries that have a member attribute equal to `uid=janedoe` under the subtree selected by
       * the `RoleBases` .
       */
      override fun roleSearchMatching(roleSearchMatching: String) {
        cdkBuilder.roleSearchMatching(roleSearchMatching)
      }

      /**
       * @param roleSearchSubtree The directory search scope for the role.
       * If set to true, scope is to search the entire subtree.
       */
      override fun roleSearchSubtree(roleSearchSubtree: Boolean) {
        cdkBuilder.roleSearchSubtree(roleSearchSubtree)
      }

      /**
       * @param roleSearchSubtree The directory search scope for the role.
       * If set to true, scope is to search the entire subtree.
       */
      override fun roleSearchSubtree(roleSearchSubtree: IResolvable) {
        cdkBuilder.roleSearchSubtree(roleSearchSubtree.let(IResolvable::unwrap))
      }

      /**
       * @param serviceAccountPassword Service account password. 
       * A service account is an account in your LDAP server that has access to initiate a
       * connection. For example, `cn=admin` , `dc=corp` , `dc=example` , `dc=com` .
       */
      override fun serviceAccountPassword(serviceAccountPassword: String) {
        cdkBuilder.serviceAccountPassword(serviceAccountPassword)
      }

      /**
       * @param serviceAccountUsername Service account username. 
       * A service account is an account in your LDAP server that has access to initiate a
       * connection. For example, `cn=admin` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       */
      override fun serviceAccountUsername(serviceAccountUsername: String) {
        cdkBuilder.serviceAccountUsername(serviceAccountUsername)
      }

      /**
       * @param userBase Select a particular subtree of the directory information tree (DIT) to
       * search for user entries. 
       * The subtree is specified by a DN, which specifies the base node of the subtree. For
       * example, by setting this option to `ou=Users` , `ou=corp` , `dc=corp` , `dc=example` ,
       * `dc=com` , the search for user entries is restricted to the subtree beneath `ou=Users` ,
       * `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       */
      override fun userBase(userBase: String) {
        cdkBuilder.userBase(userBase)
      }

      /**
       * @param userRoleName The name of the LDAP attribute in the user's directory entry for the
       * user's group membership.
       * In some cases, user roles may be identified by the value of an attribute in the user's
       * directory entry. The `UserRoleName` option allows you to provide the name of this attribute.
       */
      override fun userRoleName(userRoleName: String) {
        cdkBuilder.userRoleName(userRoleName)
      }

      /**
       * @param userSearchMatching The LDAP search filter used to find users within the `userBase` .
       * 
       * The client's username is substituted into the `{0}` placeholder in the search filter. For
       * example, if this option is set to `(uid={0})` and the received username is `janedoe` , the
       * search filter becomes `(uid=janedoe)` after string substitution. It will result in matching an
       * entry like `uid=janedoe` , `ou=Users` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       */
      override fun userSearchMatching(userSearchMatching: String) {
        cdkBuilder.userSearchMatching(userSearchMatching)
      }

      /**
       * @param userSearchSubtree The directory search scope for the user.
       * If set to true, scope is to search the entire subtree.
       */
      override fun userSearchSubtree(userSearchSubtree: Boolean) {
        cdkBuilder.userSearchSubtree(userSearchSubtree)
      }

      /**
       * @param userSearchSubtree The directory search scope for the user.
       * If set to true, scope is to search the entire subtree.
       */
      override fun userSearchSubtree(userSearchSubtree: IResolvable) {
        cdkBuilder.userSearchSubtree(userSearchSubtree.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty,
    ) : CdkObject(cdkObject), LdapServerMetadataProperty {
      /**
       * Specifies the location of the LDAP server such as AWS Directory Service for Microsoft
       * Active Directory .
       *
       * Optional failover server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-hosts)
       */
      override fun hosts(): List<String> = unwrap(this).getHosts()

      /**
       * The distinguished name of the node in the directory information tree (DIT) to search for
       * roles or groups.
       *
       * For example, `ou=group` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-rolebase)
       */
      override fun roleBase(): String = unwrap(this).getRoleBase()

      /**
       * The group name attribute in a role entry whose value is the name of that role.
       *
       * For example, you can specify `cn` for a group entry's common name. If authentication
       * succeeds, then the user is assigned the the value of the `cn` attribute for each role entry
       * that they are a member of.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-rolename)
       */
      override fun roleName(): String? = unwrap(this).getRoleName()

      /**
       * The LDAP search filter used to find roles within the roleBase.
       *
       * The distinguished name of the user matched by userSearchMatching is substituted into the
       * `{0}` placeholder in the search filter. The client's username is substituted into the `{1}`
       * placeholder. For example, if you set this option to `(member=uid={1})` for the user janedoe,
       * the search filter becomes `(member=uid=janedoe)` after string substitution. It matches all
       * role entries that have a member attribute equal to `uid=janedoe` under the subtree selected by
       * the `RoleBases` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-rolesearchmatching)
       */
      override fun roleSearchMatching(): String = unwrap(this).getRoleSearchMatching()

      /**
       * The directory search scope for the role.
       *
       * If set to true, scope is to search the entire subtree.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-rolesearchsubtree)
       */
      override fun roleSearchSubtree(): Any? = unwrap(this).getRoleSearchSubtree()

      /**
       * Service account password.
       *
       * A service account is an account in your LDAP server that has access to initiate a
       * connection. For example, `cn=admin` , `dc=corp` , `dc=example` , `dc=com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-serviceaccountpassword)
       */
      override fun serviceAccountPassword(): String = unwrap(this).getServiceAccountPassword()

      /**
       * Service account username.
       *
       * A service account is an account in your LDAP server that has access to initiate a
       * connection. For example, `cn=admin` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-serviceaccountusername)
       */
      override fun serviceAccountUsername(): String = unwrap(this).getServiceAccountUsername()

      /**
       * Select a particular subtree of the directory information tree (DIT) to search for user
       * entries.
       *
       * The subtree is specified by a DN, which specifies the base node of the subtree. For
       * example, by setting this option to `ou=Users` , `ou=corp` , `dc=corp` , `dc=example` ,
       * `dc=com` , the search for user entries is restricted to the subtree beneath `ou=Users` ,
       * `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-userbase)
       */
      override fun userBase(): String = unwrap(this).getUserBase()

      /**
       * The name of the LDAP attribute in the user's directory entry for the user's group
       * membership.
       *
       * In some cases, user roles may be identified by the value of an attribute in the user's
       * directory entry. The `UserRoleName` option allows you to provide the name of this attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-userrolename)
       */
      override fun userRoleName(): String? = unwrap(this).getUserRoleName()

      /**
       * The LDAP search filter used to find users within the `userBase` .
       *
       * The client's username is substituted into the `{0}` placeholder in the search filter. For
       * example, if this option is set to `(uid={0})` and the received username is `janedoe` , the
       * search filter becomes `(uid=janedoe)` after string substitution. It will result in matching an
       * entry like `uid=janedoe` , `ou=Users` , `ou=corp` , `dc=corp` , `dc=example` , `dc=com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-usersearchmatching)
       */
      override fun userSearchMatching(): String = unwrap(this).getUserSearchMatching()

      /**
       * The directory search scope for the user.
       *
       * If set to true, scope is to search the entire subtree.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-ldapservermetadata.html#cfn-amazonmq-broker-ldapservermetadata-usersearchsubtree)
       */
      override fun userSearchSubtree(): Any? = unwrap(this).getUserSearchSubtree()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LdapServerMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty):
          LdapServerMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LdapServerMetadataProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty
    }
  }

  /**
   * A key-value pair to associate with the broker.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amazonmq.*;
   * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-tagsentry.html)
   */
  public interface TagsEntryProperty {
    /**
     * The key in a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-tagsentry.html#cfn-amazonmq-broker-tagsentry-key)
     */
    public fun key(): String

    /**
     * The value in a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-tagsentry.html#cfn-amazonmq-broker-tagsentry-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TagsEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key in a key-value pair. 
       */
      public fun key(key: String)

      /**
       * @param value The value in a key-value pair. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty.builder()

      /**
       * @param key The key in a key-value pair. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value in a key-value pair. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty,
    ) : CdkObject(cdkObject), TagsEntryProperty {
      /**
       * The key in a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-tagsentry.html#cfn-amazonmq-broker-tagsentry-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value in a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-tagsentry.html#cfn-amazonmq-broker-tagsentry-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty):
          TagsEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amazonmq.CfnBroker.TagsEntryProperty
    }
  }

  /**
   * The list of broker users (persons or applications) who can access queues and topics.
   *
   * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
   * created when a broker is first provisioned. All subsequent broker users are created via the
   * RabbitMQ web console or by using the RabbitMQ management API.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amazonmq.*;
   * UserProperty userProperty = UserProperty.builder()
   * .password("password")
   * .username("username")
   * // the properties below are optional
   * .consoleAccess(false)
   * .groups(List.of("groups"))
   * .replicationUser(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html)
   */
  public interface UserProperty {
    /**
     * Enables access to the ActiveMQ web console for the ActiveMQ user.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-consoleaccess)
     */
    public fun consoleAccess(): Any? = unwrap(this).getConsoleAccess()

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs.
     *
     * This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes
     * (- . _ ~). This value must be 2-100 characters long. Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-groups)
     */
    public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    /**
     * The password of the user.
     *
     * This value must be at least 12 characters long, must contain at least 4 unique characters,
     * and must not contain commas, colons, or equal signs (,:=).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-password)
     */
    public fun password(): String

    /**
     * Defines if this user is intended for CRDR replication purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-replicationuser)
     */
    public fun replicationUser(): Any? = unwrap(this).getReplicationUser()

    /**
     * The username of the broker user.
     *
     * For Amazon MQ for ActiveMQ brokers, this value can contain only alphanumeric characters,
     * dashes, periods, underscores, and tildes (- . _ ~). For Amazon MQ for RabbitMQ brokers, this
     * value can contain only alphanumeric characters, dashes, periods, underscores (- . _). This value
     * must not contain a tilde (~) character. Amazon MQ prohibts using guest as a valid usename. This
     * value must be 2-100 characters long.
     *
     *
     * Do not add personally identifiable information (PII) or other confidential or sensitive
     * information in broker usernames. Broker usernames are accessible to other AWS services,
     * including CloudWatch Logs . Broker usernames are not intended to be used for private or
     * sensitive data.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-username)
     */
    public fun username(): String

    /**
     * A builder for [UserProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param consoleAccess Enables access to the ActiveMQ web console for the ActiveMQ user.
       * Does not apply to RabbitMQ brokers.
       */
      public fun consoleAccess(consoleAccess: Boolean)

      /**
       * @param consoleAccess Enables access to the ActiveMQ web console for the ActiveMQ user.
       * Does not apply to RabbitMQ brokers.
       */
      public fun consoleAccess(consoleAccess: IResolvable)

      /**
       * @param groups The list of groups (20 maximum) to which the ActiveMQ user belongs.
       * This value can contain only alphanumeric characters, dashes, periods, underscores, and
       * tildes (- . _ ~). This value must be 2-100 characters long. Does not apply to RabbitMQ
       * brokers.
       */
      public fun groups(groups: List<String>)

      /**
       * @param groups The list of groups (20 maximum) to which the ActiveMQ user belongs.
       * This value can contain only alphanumeric characters, dashes, periods, underscores, and
       * tildes (- . _ ~). This value must be 2-100 characters long. Does not apply to RabbitMQ
       * brokers.
       */
      public fun groups(vararg groups: String)

      /**
       * @param password The password of the user. 
       * This value must be at least 12 characters long, must contain at least 4 unique characters,
       * and must not contain commas, colons, or equal signs (,:=).
       */
      public fun password(password: String)

      /**
       * @param replicationUser Defines if this user is intended for CRDR replication purposes.
       */
      public fun replicationUser(replicationUser: Boolean)

      /**
       * @param replicationUser Defines if this user is intended for CRDR replication purposes.
       */
      public fun replicationUser(replicationUser: IResolvable)

      /**
       * @param username The username of the broker user. 
       * For Amazon MQ for ActiveMQ brokers, this value can contain only alphanumeric characters,
       * dashes, periods, underscores, and tildes (- . _ ~). For Amazon MQ for RabbitMQ brokers, this
       * value can contain only alphanumeric characters, dashes, periods, underscores (- . _). This
       * value must not contain a tilde (~) character. Amazon MQ prohibts using guest as a valid
       * usename. This value must be 2-100 characters long.
       *
       *
       * Do not add personally identifiable information (PII) or other confidential or sensitive
       * information in broker usernames. Broker usernames are accessible to other AWS services,
       * including CloudWatch Logs . Broker usernames are not intended to be used for private or
       * sensitive data.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty.builder()

      /**
       * @param consoleAccess Enables access to the ActiveMQ web console for the ActiveMQ user.
       * Does not apply to RabbitMQ brokers.
       */
      override fun consoleAccess(consoleAccess: Boolean) {
        cdkBuilder.consoleAccess(consoleAccess)
      }

      /**
       * @param consoleAccess Enables access to the ActiveMQ web console for the ActiveMQ user.
       * Does not apply to RabbitMQ brokers.
       */
      override fun consoleAccess(consoleAccess: IResolvable) {
        cdkBuilder.consoleAccess(consoleAccess.let(IResolvable::unwrap))
      }

      /**
       * @param groups The list of groups (20 maximum) to which the ActiveMQ user belongs.
       * This value can contain only alphanumeric characters, dashes, periods, underscores, and
       * tildes (- . _ ~). This value must be 2-100 characters long. Does not apply to RabbitMQ
       * brokers.
       */
      override fun groups(groups: List<String>) {
        cdkBuilder.groups(groups)
      }

      /**
       * @param groups The list of groups (20 maximum) to which the ActiveMQ user belongs.
       * This value can contain only alphanumeric characters, dashes, periods, underscores, and
       * tildes (- . _ ~). This value must be 2-100 characters long. Does not apply to RabbitMQ
       * brokers.
       */
      override fun groups(vararg groups: String): Unit = groups(groups.toList())

      /**
       * @param password The password of the user. 
       * This value must be at least 12 characters long, must contain at least 4 unique characters,
       * and must not contain commas, colons, or equal signs (,:=).
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param replicationUser Defines if this user is intended for CRDR replication purposes.
       */
      override fun replicationUser(replicationUser: Boolean) {
        cdkBuilder.replicationUser(replicationUser)
      }

      /**
       * @param replicationUser Defines if this user is intended for CRDR replication purposes.
       */
      override fun replicationUser(replicationUser: IResolvable) {
        cdkBuilder.replicationUser(replicationUser.let(IResolvable::unwrap))
      }

      /**
       * @param username The username of the broker user. 
       * For Amazon MQ for ActiveMQ brokers, this value can contain only alphanumeric characters,
       * dashes, periods, underscores, and tildes (- . _ ~). For Amazon MQ for RabbitMQ brokers, this
       * value can contain only alphanumeric characters, dashes, periods, underscores (- . _). This
       * value must not contain a tilde (~) character. Amazon MQ prohibts using guest as a valid
       * usename. This value must be 2-100 characters long.
       *
       *
       * Do not add personally identifiable information (PII) or other confidential or sensitive
       * information in broker usernames. Broker usernames are accessible to other AWS services,
       * including CloudWatch Logs . Broker usernames are not intended to be used for private or
       * sensitive data.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty,
    ) : CdkObject(cdkObject), UserProperty {
      /**
       * Enables access to the ActiveMQ web console for the ActiveMQ user.
       *
       * Does not apply to RabbitMQ brokers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-consoleaccess)
       */
      override fun consoleAccess(): Any? = unwrap(this).getConsoleAccess()

      /**
       * The list of groups (20 maximum) to which the ActiveMQ user belongs.
       *
       * This value can contain only alphanumeric characters, dashes, periods, underscores, and
       * tildes (- . _ ~). This value must be 2-100 characters long. Does not apply to RabbitMQ
       * brokers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-groups)
       */
      override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

      /**
       * The password of the user.
       *
       * This value must be at least 12 characters long, must contain at least 4 unique characters,
       * and must not contain commas, colons, or equal signs (,:=).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * Defines if this user is intended for CRDR replication purposes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-replicationuser)
       */
      override fun replicationUser(): Any? = unwrap(this).getReplicationUser()

      /**
       * The username of the broker user.
       *
       * For Amazon MQ for ActiveMQ brokers, this value can contain only alphanumeric characters,
       * dashes, periods, underscores, and tildes (- . _ ~). For Amazon MQ for RabbitMQ brokers, this
       * value can contain only alphanumeric characters, dashes, periods, underscores (- . _). This
       * value must not contain a tilde (~) character. Amazon MQ prohibts using guest as a valid
       * usename. This value must be 2-100 characters long.
       *
       *
       * Do not add personally identifiable information (PII) or other confidential or sensitive
       * information in broker usernames. Broker usernames are accessible to other AWS services,
       * including CloudWatch Logs . Broker usernames are not intended to be used for private or
       * sensitive data.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html#cfn-amazonmq-broker-user-username)
       */
      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty):
          UserProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.amazonmq.CfnBroker.UserProperty
    }
  }

  /**
   * Encryption options for the broker.
   *
   *
   * Does not apply to RabbitMQ brokers.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amazonmq.*;
   * EncryptionOptionsProperty encryptionOptionsProperty = EncryptionOptionsProperty.builder()
   * .useAwsOwnedKey(false)
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-encryptionoptions.html)
   */
  public interface EncryptionOptionsProperty {
    /**
     * The customer master key (CMK) to use for the A AWS KMS (KMS).
     *
     * This key is used to encrypt your data at rest. If not provided, Amazon MQ will use a default
     * CMK to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-encryptionoptions.html#cfn-amazonmq-broker-encryptionoptions-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Enables the use of an AWS owned CMK using AWS KMS (KMS).
     *
     * Set to `true` by default, if no value is provided, for example, for RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-encryptionoptions.html#cfn-amazonmq-broker-encryptionoptions-useawsownedkey)
     */
    public fun useAwsOwnedKey(): Any

    /**
     * A builder for [EncryptionOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The customer master key (CMK) to use for the A AWS KMS (KMS).
       * This key is used to encrypt your data at rest. If not provided, Amazon MQ will use a
       * default CMK to encrypt your data.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param useAwsOwnedKey Enables the use of an AWS owned CMK using AWS KMS (KMS). 
       * Set to `true` by default, if no value is provided, for example, for RabbitMQ brokers.
       */
      public fun useAwsOwnedKey(useAwsOwnedKey: Boolean)

      /**
       * @param useAwsOwnedKey Enables the use of an AWS owned CMK using AWS KMS (KMS). 
       * Set to `true` by default, if no value is provided, for example, for RabbitMQ brokers.
       */
      public fun useAwsOwnedKey(useAwsOwnedKey: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty.builder()

      /**
       * @param kmsKeyId The customer master key (CMK) to use for the A AWS KMS (KMS).
       * This key is used to encrypt your data at rest. If not provided, Amazon MQ will use a
       * default CMK to encrypt your data.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param useAwsOwnedKey Enables the use of an AWS owned CMK using AWS KMS (KMS). 
       * Set to `true` by default, if no value is provided, for example, for RabbitMQ brokers.
       */
      override fun useAwsOwnedKey(useAwsOwnedKey: Boolean) {
        cdkBuilder.useAwsOwnedKey(useAwsOwnedKey)
      }

      /**
       * @param useAwsOwnedKey Enables the use of an AWS owned CMK using AWS KMS (KMS). 
       * Set to `true` by default, if no value is provided, for example, for RabbitMQ brokers.
       */
      override fun useAwsOwnedKey(useAwsOwnedKey: IResolvable) {
        cdkBuilder.useAwsOwnedKey(useAwsOwnedKey.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty,
    ) : CdkObject(cdkObject), EncryptionOptionsProperty {
      /**
       * The customer master key (CMK) to use for the A AWS KMS (KMS).
       *
       * This key is used to encrypt your data at rest. If not provided, Amazon MQ will use a
       * default CMK to encrypt your data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-encryptionoptions.html#cfn-amazonmq-broker-encryptionoptions-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * Enables the use of an AWS owned CMK using AWS KMS (KMS).
       *
       * Set to `true` by default, if no value is provided, for example, for RabbitMQ brokers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-encryptionoptions.html#cfn-amazonmq-broker-encryptionoptions-useawsownedkey)
       */
      override fun useAwsOwnedKey(): Any = unwrap(this).getUseAwsOwnedKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty):
          EncryptionOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionOptionsProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amazonmq.CfnBroker.EncryptionOptionsProperty
    }
  }

  /**
   * The list of information about logs to be enabled for the specified broker.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amazonmq.*;
   * LogListProperty logListProperty = LogListProperty.builder()
   * .audit(false)
   * .general(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html)
   */
  public interface LogListProperty {
    /**
     * Enables audit logging.
     *
     * Every user management action made using JMX or the ActiveMQ Web Console is logged. Does not
     * apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-audit)
     */
    public fun audit(): Any? = unwrap(this).getAudit()

    /**
     * Enables general logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-general)
     */
    public fun general(): Any? = unwrap(this).getGeneral()

    /**
     * A builder for [LogListProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audit Enables audit logging.
       * Every user management action made using JMX or the ActiveMQ Web Console is logged. Does not
       * apply to RabbitMQ brokers.
       */
      public fun audit(audit: Boolean)

      /**
       * @param audit Enables audit logging.
       * Every user management action made using JMX or the ActiveMQ Web Console is logged. Does not
       * apply to RabbitMQ brokers.
       */
      public fun audit(audit: IResolvable)

      /**
       * @param general Enables general logging.
       */
      public fun general(general: Boolean)

      /**
       * @param general Enables general logging.
       */
      public fun general(general: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty.builder()

      /**
       * @param audit Enables audit logging.
       * Every user management action made using JMX or the ActiveMQ Web Console is logged. Does not
       * apply to RabbitMQ brokers.
       */
      override fun audit(audit: Boolean) {
        cdkBuilder.audit(audit)
      }

      /**
       * @param audit Enables audit logging.
       * Every user management action made using JMX or the ActiveMQ Web Console is logged. Does not
       * apply to RabbitMQ brokers.
       */
      override fun audit(audit: IResolvable) {
        cdkBuilder.audit(audit.let(IResolvable::unwrap))
      }

      /**
       * @param general Enables general logging.
       */
      override fun general(general: Boolean) {
        cdkBuilder.general(general)
      }

      /**
       * @param general Enables general logging.
       */
      override fun general(general: IResolvable) {
        cdkBuilder.general(general.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty,
    ) : CdkObject(cdkObject), LogListProperty {
      /**
       * Enables audit logging.
       *
       * Every user management action made using JMX or the ActiveMQ Web Console is logged. Does not
       * apply to RabbitMQ brokers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-audit)
       */
      override fun audit(): Any? = unwrap(this).getAudit()

      /**
       * Enables general logging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html#cfn-amazonmq-broker-loglist-general)
       */
      override fun general(): Any? = unwrap(this).getGeneral()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty):
          LogListProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogListProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.amazonmq.CfnBroker.LogListProperty
    }
  }

  /**
   * The parameters that determine the `WeeklyStartTime` to apply pending updates or patches to the
   * broker.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amazonmq.*;
   * MaintenanceWindowProperty maintenanceWindowProperty = MaintenanceWindowProperty.builder()
   * .dayOfWeek("dayOfWeek")
   * .timeOfDay("timeOfDay")
   * .timeZone("timeZone")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html)
   */
  public interface MaintenanceWindowProperty {
    /**
     * The day of the week.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-dayofweek)
     */
    public fun dayOfWeek(): String

    /**
     * The time, in 24-hour format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timeofday)
     */
    public fun timeOfDay(): String

    /**
     * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timezone)
     */
    public fun timeZone(): String

    /**
     * A builder for [MaintenanceWindowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dayOfWeek The day of the week. 
       */
      public fun dayOfWeek(dayOfWeek: String)

      /**
       * @param timeOfDay The time, in 24-hour format. 
       */
      public fun timeOfDay(timeOfDay: String)

      /**
       * @param timeZone The time zone, UTC by default, in either the Country/City format, or the
       * UTC offset format. 
       */
      public fun timeZone(timeZone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty.builder()

      /**
       * @param dayOfWeek The day of the week. 
       */
      override fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
      }

      /**
       * @param timeOfDay The time, in 24-hour format. 
       */
      override fun timeOfDay(timeOfDay: String) {
        cdkBuilder.timeOfDay(timeOfDay)
      }

      /**
       * @param timeZone The time zone, UTC by default, in either the Country/City format, or the
       * UTC offset format. 
       */
      override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      public fun build():
          software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty,
    ) : CdkObject(cdkObject), MaintenanceWindowProperty {
      /**
       * The day of the week.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-dayofweek)
       */
      override fun dayOfWeek(): String = unwrap(this).getDayOfWeek()

      /**
       * The time, in 24-hour format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timeofday)
       */
      override fun timeOfDay(): String = unwrap(this).getTimeOfDay()

      /**
       * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html#cfn-amazonmq-broker-maintenancewindow-timezone)
       */
      override fun timeZone(): String = unwrap(this).getTimeZone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty):
          MaintenanceWindowProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceWindowProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amazonmq.CfnBroker.MaintenanceWindowProperty
    }
  }

  /**
   * A list of information about the configuration.
   *
   *
   * Does not apply to RabbitMQ brokers.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amazonmq.*;
   * ConfigurationIdProperty configurationIdProperty = ConfigurationIdProperty.builder()
   * .id("id")
   * .revision(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html)
   */
  public interface ConfigurationIdProperty {
    /**
     * The unique ID that Amazon MQ generates for the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-id)
     */
    public fun id(): String

    /**
     * The revision number of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-revision)
     */
    public fun revision(): Number

    /**
     * A builder for [ConfigurationIdProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The unique ID that Amazon MQ generates for the configuration. 
       */
      public fun id(id: String)

      /**
       * @param revision The revision number of the configuration. 
       */
      public fun revision(revision: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty.builder()

      /**
       * @param id The unique ID that Amazon MQ generates for the configuration. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param revision The revision number of the configuration. 
       */
      override fun revision(revision: Number) {
        cdkBuilder.revision(revision)
      }

      public fun build(): software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty,
    ) : CdkObject(cdkObject), ConfigurationIdProperty {
      /**
       * The unique ID that Amazon MQ generates for the configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The revision number of the configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html#cfn-amazonmq-broker-configurationid-revision)
       */
      override fun revision(): Number = unwrap(this).getRevision()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty):
          ConfigurationIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationIdProperty):
          software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amazonmq.CfnBroker.ConfigurationIdProperty
    }
  }
}

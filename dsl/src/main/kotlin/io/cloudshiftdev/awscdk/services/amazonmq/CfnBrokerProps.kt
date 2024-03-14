package io.cloudshiftdev.awscdk.services.amazonmq

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBrokerProps {
  /**
   * Optional.
   *
   * The authentication strategy used to secure the broker. The default is `SIMPLE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-authenticationstrategy)
   */
  public fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

  /**
   * Enables automatic upgrades to new minor versions for brokers, as new broker engine versions are
   * released and supported by Amazon MQ.
   *
   * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
   * manual broker reboot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade)
   */
  public fun autoMinorVersionUpgrade(): Any

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
   */
  public fun brokerName(): String

  /**
   * A list of information about the configuration.
   *
   * Does not apply to RabbitMQ brokers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
   */
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * Defines whether this broker is a part of a data replication pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-datareplicationmode)
   */
  public fun dataReplicationMode(): String? = unwrap(this).getDataReplicationMode()

  /**
   * The Amazon Resource Name (ARN) of the primary broker that is used to replicate data from in a
   * data replication pair, and is applied to the replica broker.
   *
   * Must be set when dataReplicationMode is set to CRDR.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-datareplicationprimarybrokerarn)
   */
  public fun dataReplicationPrimaryBrokerArn(): String? =
      unwrap(this).getDataReplicationPrimaryBrokerArn()

  /**
   * The deployment mode of the broker. Available values:.
   *
   * * `SINGLE_INSTANCE`
   * * `ACTIVE_STANDBY_MULTI_AZ`
   * * `CLUSTER_MULTI_AZ`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode)
   */
  public fun deploymentMode(): String

  /**
   * Encryption options for the broker.
   *
   * Does not apply to RabbitMQ brokers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-encryptionoptions)
   */
  public fun encryptionOptions(): Any? = unwrap(this).getEncryptionOptions()

  /**
   * The type of broker engine.
   *
   * Currently, Amazon MQ supports `ACTIVEMQ` and `RABBITMQ` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype)
   */
  public fun engineType(): String

  /**
   * The version of the broker engine.
   *
   * For a list of supported engine versions, see
   * [Engine](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) in the
   * *Amazon MQ Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion)
   */
  public fun engineVersion(): String

  /**
   * The broker's instance type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype)
   */
  public fun hostInstanceType(): String

  /**
   * Optional.
   *
   * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
   * Does not apply to RabbitMQ brokers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-ldapservermetadata)
   */
  public fun ldapServerMetadata(): Any? = unwrap(this).getLdapServerMetadata()

  /**
   * Enables Amazon CloudWatch logging for brokers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-logs)
   */
  public fun logs(): Any? = unwrap(this).getLogs()

  /**
   * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
   * updates or patches to the broker.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
   */
  public fun maintenanceWindowStartTime(): Any? = unwrap(this).getMaintenanceWindowStartTime()

  /**
   * Enables connections from applications outside of the VPC that hosts the broker's subnets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible)
   */
  public fun publiclyAccessible(): Any

  /**
   * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups)
   */
  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * The broker's storage type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-storagetype)
   */
  public fun storageType(): String? = unwrap(this).getStorageType()

  /**
   * The list of groups that define which subnets and IP ranges the broker can use from different
   * Availability Zones.
   *
   * If you specify more than one subnet, the subnets must be in different Availability Zones.
   * Amazon MQ will not be able to create VPC endpoints for your broker with multiple subnets in the
   * same Availability Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the default
   * subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ
   * deployment (RABBITMQ) has no subnet requirements when deployed with public accessibility,
   * deployment without public accessibility requires at least one subnet.
   *
   *
   * If you specify subnets in a shared VPC for a RabbitMQ broker, the associated VPC to which the
   * specified subnets belong must be owned by your AWS account . Amazon MQ will not be able to create
   * VPC enpoints in VPCs that are not owned by your AWS account .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids)
   */
  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * An array of key-value pairs.
   *
   * For more information, see [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
   * *Billing and Cost Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags)
   */
  public fun tags(): List<CfnBroker.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnBroker.TagsEntryProperty::wrap) ?: emptyList()

  /**
   * The list of broker users (persons or applications) who can access queues and topics.
   *
   * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
   * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
   * RabbitMQ web console or by using the RabbitMQ management API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
   */
  public fun users(): Any

  /**
   * A builder for [CfnBrokerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authenticationStrategy Optional.
     * The authentication strategy used to secure the broker. The default is `SIMPLE` .
     */
    public fun authenticationStrategy(authenticationStrategy: String)

    /**
     * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers,
     * as new broker engine versions are released and supported by Amazon MQ. 
     * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     * manual broker reboot.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers,
     * as new broker engine versions are released and supported by Amazon MQ. 
     * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     * manual broker reboot.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * @param brokerName The name of the broker. 
     * This value must be unique in your AWS account , 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard
     * characters, or special characters.
     *
     *
     * Do not add personally identifiable information (PII) or other confidential or sensitive
     * information in broker names. Broker names are accessible to other AWS services, including C
     * CloudWatch Logs . Broker names are not intended to be used for private or sensitive data.
     */
    public fun brokerName(brokerName: String)

    /**
     * @param configuration A list of information about the configuration.
     * Does not apply to RabbitMQ brokers.
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration A list of information about the configuration.
     * Does not apply to RabbitMQ brokers.
     */
    public fun configuration(configuration: CfnBroker.ConfigurationIdProperty)

    /**
     * @param configuration A list of information about the configuration.
     * Does not apply to RabbitMQ brokers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85ce35c3dd8412acbc332227ff1ec05a2793e0f89faf903727e0bd38df04be63")
    public fun configuration(configuration: CfnBroker.ConfigurationIdProperty.Builder.() -> Unit)

    /**
     * @param dataReplicationMode Defines whether this broker is a part of a data replication pair.
     */
    public fun dataReplicationMode(dataReplicationMode: String)

    /**
     * @param dataReplicationPrimaryBrokerArn The Amazon Resource Name (ARN) of the primary broker
     * that is used to replicate data from in a data replication pair, and is applied to the replica
     * broker.
     * Must be set when dataReplicationMode is set to CRDR.
     */
    public fun dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn: String)

    /**
     * @param deploymentMode The deployment mode of the broker. Available values:. 
     * * `SINGLE_INSTANCE`
     * * `ACTIVE_STANDBY_MULTI_AZ`
     * * `CLUSTER_MULTI_AZ`
     */
    public fun deploymentMode(deploymentMode: String)

    /**
     * @param encryptionOptions Encryption options for the broker.
     * Does not apply to RabbitMQ brokers.
     */
    public fun encryptionOptions(encryptionOptions: IResolvable)

    /**
     * @param encryptionOptions Encryption options for the broker.
     * Does not apply to RabbitMQ brokers.
     */
    public fun encryptionOptions(encryptionOptions: CfnBroker.EncryptionOptionsProperty)

    /**
     * @param encryptionOptions Encryption options for the broker.
     * Does not apply to RabbitMQ brokers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed587c05f8c37ed89ca566d62bf019ebe88fc92d4829241d18f9161c9015b8c0")
    public
        fun encryptionOptions(encryptionOptions: CfnBroker.EncryptionOptionsProperty.Builder.() -> Unit)

    /**
     * @param engineType The type of broker engine. 
     * Currently, Amazon MQ supports `ACTIVEMQ` and `RABBITMQ` .
     */
    public fun engineType(engineType: String)

    /**
     * @param engineVersion The version of the broker engine. 
     * For a list of supported engine versions, see
     * [Engine](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) in the
     * *Amazon MQ Developer Guide* .
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param hostInstanceType The broker's instance type. 
     */
    public fun hostInstanceType(hostInstanceType: String)

    /**
     * @param ldapServerMetadata Optional.
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     */
    public fun ldapServerMetadata(ldapServerMetadata: IResolvable)

    /**
     * @param ldapServerMetadata Optional.
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     */
    public fun ldapServerMetadata(ldapServerMetadata: CfnBroker.LdapServerMetadataProperty)

    /**
     * @param ldapServerMetadata Optional.
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8209a5f89dc3449517df516b1711d1e93167f576dd6a9ad193a99f85c3a798dc")
    public
        fun ldapServerMetadata(ldapServerMetadata: CfnBroker.LdapServerMetadataProperty.Builder.() -> Unit)

    /**
     * @param logs Enables Amazon CloudWatch logging for brokers.
     */
    public fun logs(logs: IResolvable)

    /**
     * @param logs Enables Amazon CloudWatch logging for brokers.
     */
    public fun logs(logs: CfnBroker.LogListProperty)

    /**
     * @param logs Enables Amazon CloudWatch logging for brokers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("583aa0b11ed80ce308a7d1c1e77cc8f3475d9fab9bc7314e88dceaa35f380732")
    public fun logs(logs: CfnBroker.LogListProperty.Builder.() -> Unit)

    /**
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker.
     */
    public fun maintenanceWindowStartTime(maintenanceWindowStartTime: IResolvable)

    /**
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker.
     */
    public
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: CfnBroker.MaintenanceWindowProperty)

    /**
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4775557514f76715252b70f99f62eccfcb6ce3a2e123da23734082bccd31de11")
    public
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: CfnBroker.MaintenanceWindowProperty.Builder.() -> Unit)

    /**
     * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
     * the broker's subnets. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
     * the broker's subnets. 
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections
     * to brokers.
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections
     * to brokers.
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * @param storageType The broker's storage type.
     */
    public fun storageType(storageType: String)

    /**
     * @param subnetIds The list of groups that define which subnets and IP ranges the broker can
     * use from different Availability Zones.
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
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The list of groups that define which subnets and IP ranges the broker can
     * use from different Availability Zones.
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
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags An array of key-value pairs.
     * For more information, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *Billing and Cost Management User Guide* .
     */
    public fun tags(tags: List<CfnBroker.TagsEntryProperty>)

    /**
     * @param tags An array of key-value pairs.
     * For more information, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *Billing and Cost Management User Guide* .
     */
    public fun tags(vararg tags: CfnBroker.TagsEntryProperty)

    /**
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     */
    public fun users(users: IResolvable)

    /**
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     */
    public fun users(users: List<Any>)

    /**
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     */
    public fun users(vararg users: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amazonmq.CfnBrokerProps.Builder =
        software.amazon.awscdk.services.amazonmq.CfnBrokerProps.builder()

    /**
     * @param authenticationStrategy Optional.
     * The authentication strategy used to secure the broker. The default is `SIMPLE` .
     */
    override fun authenticationStrategy(authenticationStrategy: String) {
      cdkBuilder.authenticationStrategy(authenticationStrategy)
    }

    /**
     * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers,
     * as new broker engine versions are released and supported by Amazon MQ. 
     * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     * manual broker reboot.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade Enables automatic upgrades to new minor versions for brokers,
     * as new broker engine versions are released and supported by Amazon MQ. 
     * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     * manual broker reboot.
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * @param brokerName The name of the broker. 
     * This value must be unique in your AWS account , 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard
     * characters, or special characters.
     *
     *
     * Do not add personally identifiable information (PII) or other confidential or sensitive
     * information in broker names. Broker names are accessible to other AWS services, including C
     * CloudWatch Logs . Broker names are not intended to be used for private or sensitive data.
     */
    override fun brokerName(brokerName: String) {
      cdkBuilder.brokerName(brokerName)
    }

    /**
     * @param configuration A list of information about the configuration.
     * Does not apply to RabbitMQ brokers.
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * @param configuration A list of information about the configuration.
     * Does not apply to RabbitMQ brokers.
     */
    override fun configuration(configuration: CfnBroker.ConfigurationIdProperty) {
      cdkBuilder.configuration(configuration.let(CfnBroker.ConfigurationIdProperty::unwrap))
    }

    /**
     * @param configuration A list of information about the configuration.
     * Does not apply to RabbitMQ brokers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85ce35c3dd8412acbc332227ff1ec05a2793e0f89faf903727e0bd38df04be63")
    override fun configuration(configuration: CfnBroker.ConfigurationIdProperty.Builder.() -> Unit):
        Unit = configuration(CfnBroker.ConfigurationIdProperty(configuration))

    /**
     * @param dataReplicationMode Defines whether this broker is a part of a data replication pair.
     */
    override fun dataReplicationMode(dataReplicationMode: String) {
      cdkBuilder.dataReplicationMode(dataReplicationMode)
    }

    /**
     * @param dataReplicationPrimaryBrokerArn The Amazon Resource Name (ARN) of the primary broker
     * that is used to replicate data from in a data replication pair, and is applied to the replica
     * broker.
     * Must be set when dataReplicationMode is set to CRDR.
     */
    override fun dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn: String) {
      cdkBuilder.dataReplicationPrimaryBrokerArn(dataReplicationPrimaryBrokerArn)
    }

    /**
     * @param deploymentMode The deployment mode of the broker. Available values:. 
     * * `SINGLE_INSTANCE`
     * * `ACTIVE_STANDBY_MULTI_AZ`
     * * `CLUSTER_MULTI_AZ`
     */
    override fun deploymentMode(deploymentMode: String) {
      cdkBuilder.deploymentMode(deploymentMode)
    }

    /**
     * @param encryptionOptions Encryption options for the broker.
     * Does not apply to RabbitMQ brokers.
     */
    override fun encryptionOptions(encryptionOptions: IResolvable) {
      cdkBuilder.encryptionOptions(encryptionOptions.let(IResolvable::unwrap))
    }

    /**
     * @param encryptionOptions Encryption options for the broker.
     * Does not apply to RabbitMQ brokers.
     */
    override fun encryptionOptions(encryptionOptions: CfnBroker.EncryptionOptionsProperty) {
      cdkBuilder.encryptionOptions(encryptionOptions.let(CfnBroker.EncryptionOptionsProperty::unwrap))
    }

    /**
     * @param encryptionOptions Encryption options for the broker.
     * Does not apply to RabbitMQ brokers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed587c05f8c37ed89ca566d62bf019ebe88fc92d4829241d18f9161c9015b8c0")
    override
        fun encryptionOptions(encryptionOptions: CfnBroker.EncryptionOptionsProperty.Builder.() -> Unit):
        Unit = encryptionOptions(CfnBroker.EncryptionOptionsProperty(encryptionOptions))

    /**
     * @param engineType The type of broker engine. 
     * Currently, Amazon MQ supports `ACTIVEMQ` and `RABBITMQ` .
     */
    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    /**
     * @param engineVersion The version of the broker engine. 
     * For a list of supported engine versions, see
     * [Engine](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) in the
     * *Amazon MQ Developer Guide* .
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param hostInstanceType The broker's instance type. 
     */
    override fun hostInstanceType(hostInstanceType: String) {
      cdkBuilder.hostInstanceType(hostInstanceType)
    }

    /**
     * @param ldapServerMetadata Optional.
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     */
    override fun ldapServerMetadata(ldapServerMetadata: IResolvable) {
      cdkBuilder.ldapServerMetadata(ldapServerMetadata.let(IResolvable::unwrap))
    }

    /**
     * @param ldapServerMetadata Optional.
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     */
    override fun ldapServerMetadata(ldapServerMetadata: CfnBroker.LdapServerMetadataProperty) {
      cdkBuilder.ldapServerMetadata(ldapServerMetadata.let(CfnBroker.LdapServerMetadataProperty::unwrap))
    }

    /**
     * @param ldapServerMetadata Optional.
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8209a5f89dc3449517df516b1711d1e93167f576dd6a9ad193a99f85c3a798dc")
    override
        fun ldapServerMetadata(ldapServerMetadata: CfnBroker.LdapServerMetadataProperty.Builder.() -> Unit):
        Unit = ldapServerMetadata(CfnBroker.LdapServerMetadataProperty(ldapServerMetadata))

    /**
     * @param logs Enables Amazon CloudWatch logging for brokers.
     */
    override fun logs(logs: IResolvable) {
      cdkBuilder.logs(logs.let(IResolvable::unwrap))
    }

    /**
     * @param logs Enables Amazon CloudWatch logging for brokers.
     */
    override fun logs(logs: CfnBroker.LogListProperty) {
      cdkBuilder.logs(logs.let(CfnBroker.LogListProperty::unwrap))
    }

    /**
     * @param logs Enables Amazon CloudWatch logging for brokers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("583aa0b11ed80ce308a7d1c1e77cc8f3475d9fab9bc7314e88dceaa35f380732")
    override fun logs(logs: CfnBroker.LogListProperty.Builder.() -> Unit): Unit =
        logs(CfnBroker.LogListProperty(logs))

    /**
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker.
     */
    override fun maintenanceWindowStartTime(maintenanceWindowStartTime: IResolvable) {
      cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime.let(IResolvable::unwrap))
    }

    /**
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker.
     */
    override
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: CfnBroker.MaintenanceWindowProperty) {
      cdkBuilder.maintenanceWindowStartTime(maintenanceWindowStartTime.let(CfnBroker.MaintenanceWindowProperty::unwrap))
    }

    /**
     * @param maintenanceWindowStartTime The scheduled time period relative to UTC during which
     * Amazon MQ begins to apply pending updates or patches to the broker.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4775557514f76715252b70f99f62eccfcb6ce3a2e123da23734082bccd31de11")
    override
        fun maintenanceWindowStartTime(maintenanceWindowStartTime: CfnBroker.MaintenanceWindowProperty.Builder.() -> Unit):
        Unit =
        maintenanceWindowStartTime(CfnBroker.MaintenanceWindowProperty(maintenanceWindowStartTime))

    /**
     * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
     * the broker's subnets. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible Enables connections from applications outside of the VPC that hosts
     * the broker's subnets. 
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections
     * to brokers.
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * @param securityGroups The list of rules (1 minimum, 125 maximum) that authorize connections
     * to brokers.
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param storageType The broker's storage type.
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    /**
     * @param subnetIds The list of groups that define which subnets and IP ranges the broker can
     * use from different Availability Zones.
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
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The list of groups that define which subnets and IP ranges the broker can
     * use from different Availability Zones.
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
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags An array of key-value pairs.
     * For more information, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *Billing and Cost Management User Guide* .
     */
    override fun tags(tags: List<CfnBroker.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnBroker.TagsEntryProperty::unwrap))
    }

    /**
     * @param tags An array of key-value pairs.
     * For more information, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *Billing and Cost Management User Guide* .
     */
    override fun tags(vararg tags: CfnBroker.TagsEntryProperty): Unit = tags(tags.toList())

    /**
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     */
    override fun users(users: IResolvable) {
      cdkBuilder.users(users.let(IResolvable::unwrap))
    }

    /**
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     */
    override fun users(users: List<Any>) {
      cdkBuilder.users(users)
    }

    /**
     * @param users The list of broker users (persons or applications) who can access queues and
     * topics. 
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     */
    override fun users(vararg users: Any): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnBrokerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amazonmq.CfnBrokerProps,
  ) : CdkObject(cdkObject), CfnBrokerProps {
    /**
     * Optional.
     *
     * The authentication strategy used to secure the broker. The default is `SIMPLE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-authenticationstrategy)
     */
    override fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

    /**
     * Enables automatic upgrades to new minor versions for brokers, as new broker engine versions
     * are released and supported by Amazon MQ.
     *
     * Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     * manual broker reboot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade)
     */
    override fun autoMinorVersionUpgrade(): Any = unwrap(this).getAutoMinorVersionUpgrade()

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
     */
    override fun brokerName(): String = unwrap(this).getBrokerName()

    /**
     * A list of information about the configuration.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-configuration)
     */
    override fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * Defines whether this broker is a part of a data replication pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-datareplicationmode)
     */
    override fun dataReplicationMode(): String? = unwrap(this).getDataReplicationMode()

    /**
     * The Amazon Resource Name (ARN) of the primary broker that is used to replicate data from in a
     * data replication pair, and is applied to the replica broker.
     *
     * Must be set when dataReplicationMode is set to CRDR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-datareplicationprimarybrokerarn)
     */
    override fun dataReplicationPrimaryBrokerArn(): String? =
        unwrap(this).getDataReplicationPrimaryBrokerArn()

    /**
     * The deployment mode of the broker. Available values:.
     *
     * * `SINGLE_INSTANCE`
     * * `ACTIVE_STANDBY_MULTI_AZ`
     * * `CLUSTER_MULTI_AZ`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode)
     */
    override fun deploymentMode(): String = unwrap(this).getDeploymentMode()

    /**
     * Encryption options for the broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-encryptionoptions)
     */
    override fun encryptionOptions(): Any? = unwrap(this).getEncryptionOptions()

    /**
     * The type of broker engine.
     *
     * Currently, Amazon MQ supports `ACTIVEMQ` and `RABBITMQ` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype)
     */
    override fun engineType(): String = unwrap(this).getEngineType()

    /**
     * The version of the broker engine.
     *
     * For a list of supported engine versions, see
     * [Engine](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) in the
     * *Amazon MQ Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion)
     */
    override fun engineVersion(): String = unwrap(this).getEngineVersion()

    /**
     * The broker's instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype)
     */
    override fun hostInstanceType(): String = unwrap(this).getHostInstanceType()

    /**
     * Optional.
     *
     * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     * Does not apply to RabbitMQ brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-ldapservermetadata)
     */
    override fun ldapServerMetadata(): Any? = unwrap(this).getLdapServerMetadata()

    /**
     * Enables Amazon CloudWatch logging for brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-logs)
     */
    override fun logs(): Any? = unwrap(this).getLogs()

    /**
     * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending
     * updates or patches to the broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-maintenancewindowstarttime)
     */
    override fun maintenanceWindowStartTime(): Any? = unwrap(this).getMaintenanceWindowStartTime()

    /**
     * Enables connections from applications outside of the VPC that hosts the broker's subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any = unwrap(this).getPubliclyAccessible()

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups)
     */
    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * The broker's storage type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-storagetype)
     */
    override fun storageType(): String? = unwrap(this).getStorageType()

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
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * An array of key-value pairs.
     *
     * For more information, see [Using Cost Allocation
     * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html) in the
     * *Billing and Cost Management User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags)
     */
    override fun tags(): List<CfnBroker.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnBroker.TagsEntryProperty::wrap) ?: emptyList()

    /**
     * The list of broker users (persons or applications) who can access queues and topics.
     *
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent RabbitMQ users are created by via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users)
     */
    override fun users(): Any = unwrap(this).getUsers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBrokerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnBrokerProps):
        CfnBrokerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBrokerProps):
        software.amazon.awscdk.services.amazonmq.CfnBrokerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.amazonmq.CfnBrokerProps
  }
}

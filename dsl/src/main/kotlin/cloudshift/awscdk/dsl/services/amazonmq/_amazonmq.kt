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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnBroker
import software.amazon.awscdk.services.amazonmq.CfnBrokerProps
import software.amazon.awscdk.services.amazonmq.CfnConfiguration
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps
import software.amazon.awscdk.services.amazonmq.CfnConfigurationProps
import software.constructs.Construct

public object amazonmq {
    /**
     * A *broker* is a message broker environment running on Amazon MQ .
     *
     * It is the basic building block of Amazon MQ .
     *
     * The `AWS::AmazonMQ::Broker` resource lets you create Amazon MQ for ActiveMQ and Amazon MQ for
     * RabbitMQ brokers, add configuration changes or modify users for a speified ActiveMQ broker,
     * return information about the specified broker, and delete the broker. For more information,
     * see
     * [How Amazon MQ works](https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/amazon-mq-how-it-works.html)
     * in the *Amazon MQ Developer Guide* .
     * * `ec2:CreateNetworkInterface`
     *
     * This permission is required to allow Amazon MQ to create an elastic network interface (ENI)
     * on behalf of your account.
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
    public inline fun cfnBroker(
        scope: Construct,
        id: String,
        block: CfnBrokerDsl.() -> Unit = {},
    ): CfnBroker {
        val builder = CfnBrokerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of information about the configuration.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * ConfigurationIdProperty configurationIdProperty = ConfigurationIdProperty.builder()
     * .id("id")
     * .revision(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html)
     */
    public inline fun cfnBrokerConfigurationIdProperty(
        block: CfnBrokerConfigurationIdPropertyDsl.() -> Unit = {}
    ): CfnBroker.ConfigurationIdProperty {
        val builder = CfnBrokerConfigurationIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Encryption options for the broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * EncryptionOptionsProperty encryptionOptionsProperty = EncryptionOptionsProperty.builder()
     * .useAwsOwnedKey(false)
     * // the properties below are optional
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-encryptionoptions.html)
     */
    public inline fun cfnBrokerEncryptionOptionsProperty(
        block: CfnBrokerEncryptionOptionsPropertyDsl.() -> Unit = {}
    ): CfnBroker.EncryptionOptionsProperty {
        val builder = CfnBrokerEncryptionOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Optional. The metadata of the LDAP server used to authenticate and authorize connections to
     * the broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
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
    public inline fun cfnBrokerLdapServerMetadataProperty(
        block: CfnBrokerLdapServerMetadataPropertyDsl.() -> Unit = {}
    ): CfnBroker.LdapServerMetadataProperty {
        val builder = CfnBrokerLdapServerMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The list of information about logs to be enabled for the specified broker.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * LogListProperty logListProperty = LogListProperty.builder()
     * .audit(false)
     * .general(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html)
     */
    public inline fun cfnBrokerLogListProperty(
        block: CfnBrokerLogListPropertyDsl.() -> Unit = {}
    ): CfnBroker.LogListProperty {
        val builder = CfnBrokerLogListPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parameters that determine the `WeeklyStartTime` to apply pending updates or patches to
     * the broker.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * MaintenanceWindowProperty maintenanceWindowProperty = MaintenanceWindowProperty.builder()
     * .dayOfWeek("dayOfWeek")
     * .timeOfDay("timeOfDay")
     * .timeZone("timeZone")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html)
     */
    public inline fun cfnBrokerMaintenanceWindowProperty(
        block: CfnBrokerMaintenanceWindowPropertyDsl.() -> Unit = {}
    ): CfnBroker.MaintenanceWindowProperty {
        val builder = CfnBrokerMaintenanceWindowPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnBroker`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * CfnBrokerProps cfnBrokerProps = CfnBrokerProps.builder()
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
    public inline fun cfnBrokerProps(block: CfnBrokerPropsDsl.() -> Unit = {}): CfnBrokerProps {
        val builder = CfnBrokerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key-value pair to associate with the broker.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-tagsentry.html)
     */
    public inline fun cfnBrokerTagsEntryProperty(
        block: CfnBrokerTagsEntryPropertyDsl.() -> Unit = {}
    ): CfnBroker.TagsEntryProperty {
        val builder = CfnBrokerTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The list of broker users (persons or applications) who can access queues and topics.
     *
     * For Amazon MQ for RabbitMQ brokers, one and only one administrative user is accepted and
     * created when a broker is first provisioned. All subsequent broker users are created via the
     * RabbitMQ web console or by using the RabbitMQ management API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * UserProperty userProperty = UserProperty.builder()
     * .password("password")
     * .username("username")
     * // the properties below are optional
     * .consoleAccess(false)
     * .groups(List.of("groups"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-user.html)
     */
    public inline fun cfnBrokerUserProperty(
        block: CfnBrokerUserPropertyDsl.() -> Unit = {}
    ): CfnBroker.UserProperty {
        val builder = CfnBrokerUserPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new configuration for the specified configuration name.
     *
     * Amazon MQ uses the default configuration (the engine type and version).
     *
     * Does not apply to RabbitMQ brokers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * CfnConfiguration cfnConfiguration = CfnConfiguration.Builder.create(this, "MyCfnConfiguration")
     * .data("data")
     * .engineType("engineType")
     * .engineVersion("engineVersion")
     * .name("name")
     * // the properties below are optional
     * .authenticationStrategy("authenticationStrategy")
     * .description("description")
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html)
     */
    public inline fun cfnConfiguration(
        scope: Construct,
        id: String,
        block: CfnConfigurationDsl.() -> Unit = {},
    ): CfnConfiguration {
        val builder = CfnConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the AWS CloudFormation `AWS::AmazonMQ::ConfigurationAssociation` resource to associate a
     * configuration with a broker, or return information about the specified
     * ConfigurationAssociation.
     *
     * Only use one per broker, and don't use a configuration on the broker resource if you have
     * associated a configuration with that broker.
     *
     * Does not apply to RabbitMQ brokers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * CfnConfigurationAssociation cfnConfigurationAssociation =
     * CfnConfigurationAssociation.Builder.create(this, "MyCfnConfigurationAssociation")
     * .broker("broker")
     * .configuration(ConfigurationIdProperty.builder()
     * .id("id")
     * .revision(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html)
     */
    public inline fun cfnConfigurationAssociation(
        scope: Construct,
        id: String,
        block: CfnConfigurationAssociationDsl.() -> Unit = {},
    ): CfnConfigurationAssociation {
        val builder = CfnConfigurationAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ConfigurationId` property type specifies a configuration Id and the revision of a
     * configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * ConfigurationIdProperty configurationIdProperty = ConfigurationIdProperty.builder()
     * .id("id")
     * .revision(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configurationassociation-configurationid.html)
     */
    public inline fun cfnConfigurationAssociationConfigurationIdProperty(
        block: CfnConfigurationAssociationConfigurationIdPropertyDsl.() -> Unit = {}
    ): CfnConfigurationAssociation.ConfigurationIdProperty {
        val builder = CfnConfigurationAssociationConfigurationIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConfigurationAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * CfnConfigurationAssociationProps cfnConfigurationAssociationProps =
     * CfnConfigurationAssociationProps.builder()
     * .broker("broker")
     * .configuration(ConfigurationIdProperty.builder()
     * .id("id")
     * .revision(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html)
     */
    public inline fun cfnConfigurationAssociationProps(
        block: CfnConfigurationAssociationPropsDsl.() -> Unit = {}
    ): CfnConfigurationAssociationProps {
        val builder = CfnConfigurationAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * CfnConfigurationProps cfnConfigurationProps = CfnConfigurationProps.builder()
     * .data("data")
     * .engineType("engineType")
     * .engineVersion("engineVersion")
     * .name("name")
     * // the properties below are optional
     * .authenticationStrategy("authenticationStrategy")
     * .description("description")
     * .tags(List.of(TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html)
     */
    public inline fun cfnConfigurationProps(
        block: CfnConfigurationPropsDsl.() -> Unit = {}
    ): CfnConfigurationProps {
        val builder = CfnConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key-value pair to associate with the configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.amazonmq.*;
     * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configuration-tagsentry.html)
     */
    public inline fun cfnConfigurationTagsEntryProperty(
        block: CfnConfigurationTagsEntryPropertyDsl.() -> Unit = {}
    ): CfnConfiguration.TagsEntryProperty {
        val builder = CfnConfigurationTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}

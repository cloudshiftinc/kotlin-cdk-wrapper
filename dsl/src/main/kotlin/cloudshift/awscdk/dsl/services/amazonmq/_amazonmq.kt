@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.amazonmq

import software.amazon.awscdk.services.amazonmq.CfnBroker
import software.amazon.awscdk.services.amazonmq.CfnBrokerProps
import software.amazon.awscdk.services.amazonmq.CfnConfiguration
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps
import software.amazon.awscdk.services.amazonmq.CfnConfigurationProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object amazonmq {
    public inline fun cfnBroker(
        scope: Construct,
        id: String,
        block: CfnBrokerDsl.() -> Unit = {},
    ): CfnBroker {
        val builder = CfnBrokerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBrokerConfigurationIdProperty(
        block: CfnBrokerConfigurationIdPropertyDsl.() -> Unit =
            {},
    ): CfnBroker.ConfigurationIdProperty {
        val builder = CfnBrokerConfigurationIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBrokerEncryptionOptionsProperty(
        block: CfnBrokerEncryptionOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnBroker.EncryptionOptionsProperty {
        val builder = CfnBrokerEncryptionOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBrokerLdapServerMetadataProperty(
        block: CfnBrokerLdapServerMetadataPropertyDsl.() -> Unit =
            {},
    ): CfnBroker.LdapServerMetadataProperty {
        val builder = CfnBrokerLdapServerMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBrokerLogListProperty(block: CfnBrokerLogListPropertyDsl.() -> Unit = {}): CfnBroker.LogListProperty {
        val builder = CfnBrokerLogListPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBrokerMaintenanceWindowProperty(
        block: CfnBrokerMaintenanceWindowPropertyDsl.() -> Unit =
            {},
    ): CfnBroker.MaintenanceWindowProperty {
        val builder = CfnBrokerMaintenanceWindowPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBrokerProps(block: CfnBrokerPropsDsl.() -> Unit = {}): CfnBrokerProps {
        val builder = CfnBrokerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBrokerTagsEntryProperty(
        block: CfnBrokerTagsEntryPropertyDsl.() -> Unit =
            {},
    ): CfnBroker.TagsEntryProperty {
        val builder = CfnBrokerTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBrokerUserProperty(block: CfnBrokerUserPropertyDsl.() -> Unit = {}): CfnBroker.UserProperty {
        val builder = CfnBrokerUserPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfiguration(
        scope: Construct,
        id: String,
        block: CfnConfigurationDsl.() -> Unit = {},
    ): CfnConfiguration {
        val builder = CfnConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationAssociation(
        scope: Construct,
        id: String,
        block: CfnConfigurationAssociationDsl.() -> Unit = {},
    ): CfnConfigurationAssociation {
        val builder = CfnConfigurationAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationAssociationConfigurationIdProperty(
        block: CfnConfigurationAssociationConfigurationIdPropertyDsl.() -> Unit =
            {},
    ): CfnConfigurationAssociation.ConfigurationIdProperty {
        val builder = CfnConfigurationAssociationConfigurationIdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationAssociationProps(
        block: CfnConfigurationAssociationPropsDsl.() -> Unit =
            {},
    ): CfnConfigurationAssociationProps {
        val builder = CfnConfigurationAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationProps(block: CfnConfigurationPropsDsl.() -> Unit = {}): CfnConfigurationProps {
        val builder = CfnConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConfigurationTagsEntryProperty(
        block: CfnConfigurationTagsEntryPropertyDsl.() -> Unit =
            {},
    ): CfnConfiguration.TagsEntryProperty {
        val builder = CfnConfigurationTagsEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}

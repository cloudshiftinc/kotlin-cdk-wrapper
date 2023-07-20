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

package cloudshift.awscdk.dsl.services.appstream

import software.amazon.awscdk.services.appstream.CfnAppBlock
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilder
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilderProps
import software.amazon.awscdk.services.appstream.CfnAppBlockProps
import software.amazon.awscdk.services.appstream.CfnApplication
import software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation
import software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation
import software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociationProps
import software.amazon.awscdk.services.appstream.CfnApplicationProps
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig
import software.amazon.awscdk.services.appstream.CfnDirectoryConfigProps
import software.amazon.awscdk.services.appstream.CfnEntitlement
import software.amazon.awscdk.services.appstream.CfnEntitlementProps
import software.amazon.awscdk.services.appstream.CfnFleet
import software.amazon.awscdk.services.appstream.CfnFleetProps
import software.amazon.awscdk.services.appstream.CfnImageBuilder
import software.amazon.awscdk.services.appstream.CfnImageBuilderProps
import software.amazon.awscdk.services.appstream.CfnStack
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociation
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps
import software.amazon.awscdk.services.appstream.CfnStackProps
import software.amazon.awscdk.services.appstream.CfnStackUserAssociation
import software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps
import software.amazon.awscdk.services.appstream.CfnUser
import software.amazon.awscdk.services.appstream.CfnUserProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object appstream {
    public inline fun cfnAppBlock(
        scope: Construct,
        id: String,
        block: CfnAppBlockDsl.() -> Unit = {},
    ): CfnAppBlock {
        val builder = CfnAppBlockDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppBlockBuilder(
        scope: Construct,
        id: String,
        block: CfnAppBlockBuilderDsl.() -> Unit = {},
    ): CfnAppBlockBuilder {
        val builder = CfnAppBlockBuilderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppBlockBuilderAccessEndpointProperty(
        block: CfnAppBlockBuilderAccessEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnAppBlockBuilder.AccessEndpointProperty {
        val builder = CfnAppBlockBuilderAccessEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppBlockBuilderProps(block: CfnAppBlockBuilderPropsDsl.() -> Unit = {}): CfnAppBlockBuilderProps {
        val builder = CfnAppBlockBuilderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppBlockBuilderVpcConfigProperty(
        block: CfnAppBlockBuilderVpcConfigPropertyDsl.() -> Unit =
            {},
    ): CfnAppBlockBuilder.VpcConfigProperty {
        val builder = CfnAppBlockBuilderVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppBlockProps(block: CfnAppBlockPropsDsl.() -> Unit = {}): CfnAppBlockProps {
        val builder = CfnAppBlockPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppBlockS3LocationProperty(
        block: CfnAppBlockS3LocationPropertyDsl.() -> Unit =
            {},
    ): CfnAppBlock.S3LocationProperty {
        val builder = CfnAppBlockS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppBlockScriptDetailsProperty(
        block: CfnAppBlockScriptDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnAppBlock.ScriptDetailsProperty {
        val builder = CfnAppBlockScriptDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationEntitlementAssociation(
        scope: Construct,
        id: String,
        block: CfnApplicationEntitlementAssociationDsl.() -> Unit = {},
    ): CfnApplicationEntitlementAssociation {
        val builder = CfnApplicationEntitlementAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationEntitlementAssociationProps(
        block: CfnApplicationEntitlementAssociationPropsDsl.() -> Unit =
            {},
    ): CfnApplicationEntitlementAssociationProps {
        val builder = CfnApplicationEntitlementAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationFleetAssociation(
        scope: Construct,
        id: String,
        block: CfnApplicationFleetAssociationDsl.() -> Unit = {},
    ): CfnApplicationFleetAssociation {
        val builder = CfnApplicationFleetAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationFleetAssociationProps(
        block: CfnApplicationFleetAssociationPropsDsl.() -> Unit =
            {},
    ): CfnApplicationFleetAssociationProps {
        val builder = CfnApplicationFleetAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationS3LocationProperty(
        block: CfnApplicationS3LocationPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.S3LocationProperty {
        val builder = CfnApplicationS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDirectoryConfig(
        scope: Construct,
        id: String,
        block: CfnDirectoryConfigDsl.() -> Unit = {},
    ): CfnDirectoryConfig {
        val builder = CfnDirectoryConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDirectoryConfigCertificateBasedAuthPropertiesProperty(
        block: CfnDirectoryConfigCertificateBasedAuthPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty {
        val builder = CfnDirectoryConfigCertificateBasedAuthPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDirectoryConfigProps(block: CfnDirectoryConfigPropsDsl.() -> Unit = {}): CfnDirectoryConfigProps {
        val builder = CfnDirectoryConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDirectoryConfigServiceAccountCredentialsProperty(
        block: CfnDirectoryConfigServiceAccountCredentialsPropertyDsl.() -> Unit =
            {},
    ): CfnDirectoryConfig.ServiceAccountCredentialsProperty {
        val builder = CfnDirectoryConfigServiceAccountCredentialsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEntitlement(
        scope: Construct,
        id: String,
        block: CfnEntitlementDsl.() -> Unit = {},
    ): CfnEntitlement {
        val builder = CfnEntitlementDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEntitlementAttributeProperty(
        block: CfnEntitlementAttributePropertyDsl.() -> Unit =
            {},
    ): CfnEntitlement.AttributeProperty {
        val builder = CfnEntitlementAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEntitlementProps(block: CfnEntitlementPropsDsl.() -> Unit = {}): CfnEntitlementProps {
        val builder = CfnEntitlementPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFleet(
        scope: Construct,
        id: String,
        block: CfnFleetDsl.() -> Unit = {},
    ): CfnFleet {
        val builder = CfnFleetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFleetComputeCapacityProperty(
        block: CfnFleetComputeCapacityPropertyDsl.() -> Unit =
            {},
    ): CfnFleet.ComputeCapacityProperty {
        val builder = CfnFleetComputeCapacityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFleetDomainJoinInfoProperty(
        block: CfnFleetDomainJoinInfoPropertyDsl.() -> Unit = {
        },
    ): CfnFleet.DomainJoinInfoProperty {
        val builder = CfnFleetDomainJoinInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFleetProps(block: CfnFleetPropsDsl.() -> Unit = {}): CfnFleetProps {
        val builder = CfnFleetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFleetS3LocationProperty(
        block: CfnFleetS3LocationPropertyDsl.() -> Unit =
            {},
    ): CfnFleet.S3LocationProperty {
        val builder = CfnFleetS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFleetVpcConfigProperty(block: CfnFleetVpcConfigPropertyDsl.() -> Unit = {}): CfnFleet.VpcConfigProperty {
        val builder = CfnFleetVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageBuilder(
        scope: Construct,
        id: String,
        block: CfnImageBuilderDsl.() -> Unit = {},
    ): CfnImageBuilder {
        val builder = CfnImageBuilderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageBuilderAccessEndpointProperty(
        block: CfnImageBuilderAccessEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnImageBuilder.AccessEndpointProperty {
        val builder = CfnImageBuilderAccessEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageBuilderDomainJoinInfoProperty(
        block: CfnImageBuilderDomainJoinInfoPropertyDsl.() -> Unit =
            {},
    ): CfnImageBuilder.DomainJoinInfoProperty {
        val builder = CfnImageBuilderDomainJoinInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageBuilderProps(block: CfnImageBuilderPropsDsl.() -> Unit = {}): CfnImageBuilderProps {
        val builder = CfnImageBuilderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnImageBuilderVpcConfigProperty(
        block: CfnImageBuilderVpcConfigPropertyDsl.() -> Unit =
            {},
    ): CfnImageBuilder.VpcConfigProperty {
        val builder = CfnImageBuilderVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStack(
        scope: Construct,
        id: String,
        block: CfnStackDsl.() -> Unit = {},
    ): CfnStack {
        val builder = CfnStackDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackAccessEndpointProperty(
        block: CfnStackAccessEndpointPropertyDsl.() -> Unit = {
        },
    ): CfnStack.AccessEndpointProperty {
        val builder = CfnStackAccessEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackApplicationSettingsProperty(
        block: CfnStackApplicationSettingsPropertyDsl.() -> Unit =
            {},
    ): CfnStack.ApplicationSettingsProperty {
        val builder = CfnStackApplicationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackFleetAssociation(
        scope: Construct,
        id: String,
        block: CfnStackFleetAssociationDsl.() -> Unit = {},
    ): CfnStackFleetAssociation {
        val builder = CfnStackFleetAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackFleetAssociationProps(
        block: CfnStackFleetAssociationPropsDsl.() -> Unit =
            {},
    ): CfnStackFleetAssociationProps {
        val builder = CfnStackFleetAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackProps(block: CfnStackPropsDsl.() -> Unit = {}): CfnStackProps {
        val builder = CfnStackPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackStorageConnectorProperty(
        block: CfnStackStorageConnectorPropertyDsl.() -> Unit =
            {},
    ): CfnStack.StorageConnectorProperty {
        val builder = CfnStackStorageConnectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackStreamingExperienceSettingsProperty(
        block: CfnStackStreamingExperienceSettingsPropertyDsl.() -> Unit =
            {},
    ): CfnStack.StreamingExperienceSettingsProperty {
        val builder = CfnStackStreamingExperienceSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackUserAssociation(
        scope: Construct,
        id: String,
        block: CfnStackUserAssociationDsl.() -> Unit = {},
    ): CfnStackUserAssociation {
        val builder = CfnStackUserAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackUserAssociationProps(
        block: CfnStackUserAssociationPropsDsl.() -> Unit =
            {},
    ): CfnStackUserAssociationProps {
        val builder = CfnStackUserAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackUserSettingProperty(
        block: CfnStackUserSettingPropertyDsl.() -> Unit =
            {},
    ): CfnStack.UserSettingProperty {
        val builder = CfnStackUserSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnUser(
        scope: Construct,
        id: String,
        block: CfnUserDsl.() -> Unit = {},
    ): CfnUser {
        val builder = CfnUserDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
        val builder = CfnUserPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}

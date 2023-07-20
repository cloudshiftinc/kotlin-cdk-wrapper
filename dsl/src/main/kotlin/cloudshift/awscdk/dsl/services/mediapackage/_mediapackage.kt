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

package cloudshift.awscdk.dsl.services.mediapackage

import software.amazon.awscdk.services.mediapackage.CfnAsset
import software.amazon.awscdk.services.mediapackage.CfnAssetProps
import software.amazon.awscdk.services.mediapackage.CfnChannel
import software.amazon.awscdk.services.mediapackage.CfnChannelProps
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object mediapackage {
    public inline fun cfnAsset(
        scope: Construct,
        id: String,
        block: CfnAssetDsl.() -> Unit = {},
    ): CfnAsset {
        val builder = CfnAssetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAssetEgressEndpointProperty(
        block: CfnAssetEgressEndpointPropertyDsl.() -> Unit = {
        },
    ): CfnAsset.EgressEndpointProperty {
        val builder = CfnAssetEgressEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAssetProps(block: CfnAssetPropsDsl.() -> Unit = {}): CfnAssetProps {
        val builder = CfnAssetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnChannel(
        scope: Construct,
        id: String,
        block: CfnChannelDsl.() -> Unit = {},
    ): CfnChannel {
        val builder = CfnChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnChannelHlsIngestProperty(
        block: CfnChannelHlsIngestPropertyDsl.() -> Unit =
            {},
    ): CfnChannel.HlsIngestProperty {
        val builder = CfnChannelHlsIngestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnChannelIngestEndpointProperty(
        block: CfnChannelIngestEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnChannel.IngestEndpointProperty {
        val builder = CfnChannelIngestEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnChannelLogConfigurationProperty(
        block: CfnChannelLogConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnChannel.LogConfigurationProperty {
        val builder = CfnChannelLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
        val builder = CfnChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpoint(
        scope: Construct,
        id: String,
        block: CfnOriginEndpointDsl.() -> Unit = {},
    ): CfnOriginEndpoint {
        val builder = CfnOriginEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointAuthorizationProperty(
        block: CfnOriginEndpointAuthorizationPropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.AuthorizationProperty {
        val builder = CfnOriginEndpointAuthorizationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointCmafEncryptionProperty(
        block: CfnOriginEndpointCmafEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.CmafEncryptionProperty {
        val builder = CfnOriginEndpointCmafEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointCmafPackageProperty(
        block: CfnOriginEndpointCmafPackagePropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.CmafPackageProperty {
        val builder = CfnOriginEndpointCmafPackagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointDashEncryptionProperty(
        block: CfnOriginEndpointDashEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.DashEncryptionProperty {
        val builder = CfnOriginEndpointDashEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointDashPackageProperty(
        block: CfnOriginEndpointDashPackagePropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.DashPackageProperty {
        val builder = CfnOriginEndpointDashPackagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointEncryptionContractConfigurationProperty(
        block: CfnOriginEndpointEncryptionContractConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.EncryptionContractConfigurationProperty {
        val builder = CfnOriginEndpointEncryptionContractConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointHlsEncryptionProperty(
        block: CfnOriginEndpointHlsEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.HlsEncryptionProperty {
        val builder = CfnOriginEndpointHlsEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointHlsManifestProperty(
        block: CfnOriginEndpointHlsManifestPropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.HlsManifestProperty {
        val builder = CfnOriginEndpointHlsManifestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointHlsPackageProperty(
        block: CfnOriginEndpointHlsPackagePropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.HlsPackageProperty {
        val builder = CfnOriginEndpointHlsPackagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointMssEncryptionProperty(
        block: CfnOriginEndpointMssEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.MssEncryptionProperty {
        val builder = CfnOriginEndpointMssEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointMssPackageProperty(
        block: CfnOriginEndpointMssPackagePropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.MssPackageProperty {
        val builder = CfnOriginEndpointMssPackagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointProps(block: CfnOriginEndpointPropsDsl.() -> Unit = {}): CfnOriginEndpointProps {
        val builder = CfnOriginEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointSpekeKeyProviderProperty(
        block: CfnOriginEndpointSpekeKeyProviderPropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.SpekeKeyProviderProperty {
        val builder = CfnOriginEndpointSpekeKeyProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnOriginEndpointStreamSelectionProperty(
        block: CfnOriginEndpointStreamSelectionPropertyDsl.() -> Unit =
            {},
    ): CfnOriginEndpoint.StreamSelectionProperty {
        val builder = CfnOriginEndpointStreamSelectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfiguration(
        scope: Construct,
        id: String,
        block: CfnPackagingConfigurationDsl.() -> Unit = {},
    ): CfnPackagingConfiguration {
        val builder = CfnPackagingConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationCmafEncryptionProperty(
        block: CfnPackagingConfigurationCmafEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.CmafEncryptionProperty {
        val builder = CfnPackagingConfigurationCmafEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationCmafPackageProperty(
        block: CfnPackagingConfigurationCmafPackagePropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.CmafPackageProperty {
        val builder = CfnPackagingConfigurationCmafPackagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationDashEncryptionProperty(
        block: CfnPackagingConfigurationDashEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.DashEncryptionProperty {
        val builder = CfnPackagingConfigurationDashEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationDashManifestProperty(
        block: CfnPackagingConfigurationDashManifestPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.DashManifestProperty {
        val builder = CfnPackagingConfigurationDashManifestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationDashPackageProperty(
        block: CfnPackagingConfigurationDashPackagePropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.DashPackageProperty {
        val builder = CfnPackagingConfigurationDashPackagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationEncryptionContractConfigurationProperty(
        block: CfnPackagingConfigurationEncryptionContractConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.EncryptionContractConfigurationProperty {
        val builder = CfnPackagingConfigurationEncryptionContractConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationHlsEncryptionProperty(
        block: CfnPackagingConfigurationHlsEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.HlsEncryptionProperty {
        val builder = CfnPackagingConfigurationHlsEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationHlsManifestProperty(
        block: CfnPackagingConfigurationHlsManifestPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.HlsManifestProperty {
        val builder = CfnPackagingConfigurationHlsManifestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationHlsPackageProperty(
        block: CfnPackagingConfigurationHlsPackagePropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.HlsPackageProperty {
        val builder = CfnPackagingConfigurationHlsPackagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationMssEncryptionProperty(
        block: CfnPackagingConfigurationMssEncryptionPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.MssEncryptionProperty {
        val builder = CfnPackagingConfigurationMssEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationMssManifestProperty(
        block: CfnPackagingConfigurationMssManifestPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.MssManifestProperty {
        val builder = CfnPackagingConfigurationMssManifestPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationMssPackageProperty(
        block: CfnPackagingConfigurationMssPackagePropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.MssPackageProperty {
        val builder = CfnPackagingConfigurationMssPackagePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationProps(block: CfnPackagingConfigurationPropsDsl.() -> Unit = {}): CfnPackagingConfigurationProps {
        val builder = CfnPackagingConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationSpekeKeyProviderProperty(
        block: CfnPackagingConfigurationSpekeKeyProviderPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.SpekeKeyProviderProperty {
        val builder = CfnPackagingConfigurationSpekeKeyProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingConfigurationStreamSelectionProperty(
        block: CfnPackagingConfigurationStreamSelectionPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingConfiguration.StreamSelectionProperty {
        val builder = CfnPackagingConfigurationStreamSelectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingGroup(
        scope: Construct,
        id: String,
        block: CfnPackagingGroupDsl.() -> Unit = {},
    ): CfnPackagingGroup {
        val builder = CfnPackagingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingGroupAuthorizationProperty(
        block: CfnPackagingGroupAuthorizationPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingGroup.AuthorizationProperty {
        val builder = CfnPackagingGroupAuthorizationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingGroupLogConfigurationProperty(
        block: CfnPackagingGroupLogConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnPackagingGroup.LogConfigurationProperty {
        val builder = CfnPackagingGroupLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPackagingGroupProps(block: CfnPackagingGroupPropsDsl.() -> Unit = {}): CfnPackagingGroupProps {
        val builder = CfnPackagingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}

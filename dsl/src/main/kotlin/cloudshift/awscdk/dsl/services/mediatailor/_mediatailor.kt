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

package cloudshift.awscdk.dsl.services.mediatailor

import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object mediatailor {
    public inline fun cfnPlaybackConfiguration(
        scope: Construct,
        id: String,
        block: CfnPlaybackConfigurationDsl.() -> Unit = {},
    ): CfnPlaybackConfiguration {
        val builder = CfnPlaybackConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPlaybackConfigurationAdMarkerPassthroughProperty(
        block: CfnPlaybackConfigurationAdMarkerPassthroughPropertyDsl.() -> Unit =
            {},
    ): CfnPlaybackConfiguration.AdMarkerPassthroughProperty {
        val builder = CfnPlaybackConfigurationAdMarkerPassthroughPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPlaybackConfigurationAvailSuppressionProperty(
        block: CfnPlaybackConfigurationAvailSuppressionPropertyDsl.() -> Unit =
            {},
    ): CfnPlaybackConfiguration.AvailSuppressionProperty {
        val builder = CfnPlaybackConfigurationAvailSuppressionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPlaybackConfigurationBumperProperty(
        block: CfnPlaybackConfigurationBumperPropertyDsl.() -> Unit =
            {},
    ): CfnPlaybackConfiguration.BumperProperty {
        val builder = CfnPlaybackConfigurationBumperPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPlaybackConfigurationCdnConfigurationProperty(
        block: CfnPlaybackConfigurationCdnConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnPlaybackConfiguration.CdnConfigurationProperty {
        val builder = CfnPlaybackConfigurationCdnConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPlaybackConfigurationDashConfigurationProperty(
        block: CfnPlaybackConfigurationDashConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnPlaybackConfiguration.DashConfigurationProperty {
        val builder = CfnPlaybackConfigurationDashConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPlaybackConfigurationHlsConfigurationProperty(
        block: CfnPlaybackConfigurationHlsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnPlaybackConfiguration.HlsConfigurationProperty {
        val builder = CfnPlaybackConfigurationHlsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPlaybackConfigurationLivePreRollConfigurationProperty(
        block: CfnPlaybackConfigurationLivePreRollConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnPlaybackConfiguration.LivePreRollConfigurationProperty {
        val builder = CfnPlaybackConfigurationLivePreRollConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPlaybackConfigurationManifestProcessingRulesProperty(
        block: CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl.() -> Unit =
            {},
    ): CfnPlaybackConfiguration.ManifestProcessingRulesProperty {
        val builder = CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPlaybackConfigurationProps(
        block: CfnPlaybackConfigurationPropsDsl.() -> Unit =
            {},
    ): CfnPlaybackConfigurationProps {
        val builder = CfnPlaybackConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}

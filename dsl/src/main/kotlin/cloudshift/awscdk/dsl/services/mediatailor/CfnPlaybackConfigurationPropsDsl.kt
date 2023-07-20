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

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPlaybackConfigurationPropsDsl {
    private val cdkBuilder: CfnPlaybackConfigurationProps.Builder =
        CfnPlaybackConfigurationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun adDecisionServerUrl(adDecisionServerUrl: String) {
        cdkBuilder.adDecisionServerUrl(adDecisionServerUrl)
    }

    public fun availSuppression(availSuppression: IResolvable) {
        cdkBuilder.availSuppression(availSuppression)
    }

    public fun availSuppression(availSuppression: CfnPlaybackConfiguration.AvailSuppressionProperty) {
        cdkBuilder.availSuppression(availSuppression)
    }

    public fun bumper(bumper: IResolvable) {
        cdkBuilder.bumper(bumper)
    }

    public fun bumper(bumper: CfnPlaybackConfiguration.BumperProperty) {
        cdkBuilder.bumper(bumper)
    }

    public fun cdnConfiguration(cdnConfiguration: IResolvable) {
        cdkBuilder.cdnConfiguration(cdnConfiguration)
    }

    public fun cdnConfiguration(cdnConfiguration: CfnPlaybackConfiguration.CdnConfigurationProperty) {
        cdkBuilder.cdnConfiguration(cdnConfiguration)
    }

    public fun configurationAliases(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.configurationAliases(builder.map)
    }

    public fun configurationAliases(configurationAliases: Map<String, Any>) {
        cdkBuilder.configurationAliases(configurationAliases)
    }

    public fun configurationAliases(configurationAliases: IResolvable) {
        cdkBuilder.configurationAliases(configurationAliases)
    }

    public fun dashConfiguration(dashConfiguration: IResolvable) {
        cdkBuilder.dashConfiguration(dashConfiguration)
    }

    public fun dashConfiguration(dashConfiguration: CfnPlaybackConfiguration.DashConfigurationProperty) {
        cdkBuilder.dashConfiguration(dashConfiguration)
    }

    public fun hlsConfiguration(hlsConfiguration: IResolvable) {
        cdkBuilder.hlsConfiguration(hlsConfiguration)
    }

    public fun hlsConfiguration(hlsConfiguration: CfnPlaybackConfiguration.HlsConfigurationProperty) {
        cdkBuilder.hlsConfiguration(hlsConfiguration)
    }

    public fun livePreRollConfiguration(livePreRollConfiguration: IResolvable) {
        cdkBuilder.livePreRollConfiguration(livePreRollConfiguration)
    }

    public fun livePreRollConfiguration(livePreRollConfiguration: CfnPlaybackConfiguration.LivePreRollConfigurationProperty) {
        cdkBuilder.livePreRollConfiguration(livePreRollConfiguration)
    }

    public fun manifestProcessingRules(manifestProcessingRules: IResolvable) {
        cdkBuilder.manifestProcessingRules(manifestProcessingRules)
    }

    public fun manifestProcessingRules(manifestProcessingRules: CfnPlaybackConfiguration.ManifestProcessingRulesProperty) {
        cdkBuilder.manifestProcessingRules(manifestProcessingRules)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun personalizationThresholdSeconds(personalizationThresholdSeconds: Number) {
        cdkBuilder.personalizationThresholdSeconds(personalizationThresholdSeconds)
    }

    public fun slateAdUrl(slateAdUrl: String) {
        cdkBuilder.slateAdUrl(slateAdUrl)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun transcodeProfileName(transcodeProfileName: String) {
        cdkBuilder.transcodeProfileName(transcodeProfileName)
    }

    public fun videoContentSourceUrl(videoContentSourceUrl: String) {
        cdkBuilder.videoContentSourceUrl(videoContentSourceUrl)
    }

    public fun build(): CfnPlaybackConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnLayer
import software.amazon.awscdk.services.opsworks.CfnLayerProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLayerPropsDsl {
    private val cdkBuilder: CfnLayerProps.Builder = CfnLayerProps.builder()

    private val _customSecurityGroupIds: MutableList<String> = mutableListOf()

    private val _packages: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _volumeConfigurations: MutableList<Any> = mutableListOf()

    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    public fun autoAssignElasticIps(autoAssignElasticIps: Boolean) {
        cdkBuilder.autoAssignElasticIps(autoAssignElasticIps)
    }

    public fun autoAssignElasticIps(autoAssignElasticIps: IResolvable) {
        cdkBuilder.autoAssignElasticIps(autoAssignElasticIps)
    }

    public fun autoAssignPublicIps(autoAssignPublicIps: Boolean) {
        cdkBuilder.autoAssignPublicIps(autoAssignPublicIps)
    }

    public fun autoAssignPublicIps(autoAssignPublicIps: IResolvable) {
        cdkBuilder.autoAssignPublicIps(autoAssignPublicIps)
    }

    public fun customInstanceProfileArn(customInstanceProfileArn: String) {
        cdkBuilder.customInstanceProfileArn(customInstanceProfileArn)
    }

    public fun customJson(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.customJson(builder.map)
    }

    public fun customJson(customJson: Any) {
        cdkBuilder.customJson(customJson)
    }

    public fun customRecipes(customRecipes: IResolvable) {
        cdkBuilder.customRecipes(customRecipes)
    }

    public fun customRecipes(customRecipes: CfnLayer.RecipesProperty) {
        cdkBuilder.customRecipes(customRecipes)
    }

    public fun customSecurityGroupIds(vararg customSecurityGroupIds: String) {
        _customSecurityGroupIds.addAll(listOf(*customSecurityGroupIds))
    }

    public fun customSecurityGroupIds(customSecurityGroupIds: Collection<String>) {
        _customSecurityGroupIds.addAll(customSecurityGroupIds)
    }

    public fun enableAutoHealing(enableAutoHealing: Boolean) {
        cdkBuilder.enableAutoHealing(enableAutoHealing)
    }

    public fun enableAutoHealing(enableAutoHealing: IResolvable) {
        cdkBuilder.enableAutoHealing(enableAutoHealing)
    }

    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
        cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
        cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    public fun lifecycleEventConfiguration(lifecycleEventConfiguration: IResolvable) {
        cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration)
    }

    public fun lifecycleEventConfiguration(lifecycleEventConfiguration: CfnLayer.LifecycleEventConfigurationProperty) {
        cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration)
    }

    public fun loadBasedAutoScaling(loadBasedAutoScaling: IResolvable) {
        cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling)
    }

    public fun loadBasedAutoScaling(loadBasedAutoScaling: CfnLayer.LoadBasedAutoScalingProperty) {
        cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun packages(vararg packages: String) {
        _packages.addAll(listOf(*packages))
    }

    public fun packages(packages: Collection<String>) {
        _packages.addAll(packages)
    }

    public fun shortname(shortname: String) {
        cdkBuilder.shortname(shortname)
    }

    public fun stackId(stackId: String) {
        cdkBuilder.stackId(stackId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: Boolean) {
        cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances)
    }

    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: IResolvable) {
        cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances)
    }

    public fun volumeConfigurations(vararg volumeConfigurations: Any) {
        _volumeConfigurations.addAll(listOf(*volumeConfigurations))
    }

    public fun volumeConfigurations(volumeConfigurations: Collection<Any>) {
        _volumeConfigurations.addAll(volumeConfigurations)
    }

    public fun volumeConfigurations(volumeConfigurations: IResolvable) {
        cdkBuilder.volumeConfigurations(volumeConfigurations)
    }

    public fun build(): CfnLayerProps {
        if (_customSecurityGroupIds.isNotEmpty()) {
            cdkBuilder.customSecurityGroupIds(_customSecurityGroupIds)
        }
        if (_packages.isNotEmpty()) cdkBuilder.packages(_packages)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_volumeConfigurations.isNotEmpty()) cdkBuilder.volumeConfigurations(_volumeConfigurations)
        return cdkBuilder.build()
    }
}

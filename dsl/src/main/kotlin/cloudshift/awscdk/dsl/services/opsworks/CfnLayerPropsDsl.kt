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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnLayer
import software.amazon.awscdk.services.opsworks.CfnLayerProps

/**
 * Properties for defining a `CfnLayer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * Object customJson;
 * CfnLayerProps cfnLayerProps = CfnLayerProps.builder()
 * .autoAssignElasticIps(false)
 * .autoAssignPublicIps(false)
 * .enableAutoHealing(false)
 * .name("name")
 * .shortname("shortname")
 * .stackId("stackId")
 * .type("type")
 * // the properties below are optional
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .customInstanceProfileArn("customInstanceProfileArn")
 * .customJson(customJson)
 * .customRecipes(RecipesProperty.builder()
 * .configure(List.of("configure"))
 * .deploy(List.of("deploy"))
 * .setup(List.of("setup"))
 * .shutdown(List.of("shutdown"))
 * .undeploy(List.of("undeploy"))
 * .build())
 * .customSecurityGroupIds(List.of("customSecurityGroupIds"))
 * .installUpdatesOnBoot(false)
 * .lifecycleEventConfiguration(LifecycleEventConfigurationProperty.builder()
 * .shutdownEventConfiguration(ShutdownEventConfigurationProperty.builder()
 * .delayUntilElbConnectionsDrained(false)
 * .executionTimeout(123)
 * .build())
 * .build())
 * .loadBasedAutoScaling(LoadBasedAutoScalingProperty.builder()
 * .downScaling(AutoScalingThresholdsProperty.builder()
 * .cpuThreshold(123)
 * .ignoreMetricsTime(123)
 * .instanceCount(123)
 * .loadThreshold(123)
 * .memoryThreshold(123)
 * .thresholdsWaitTime(123)
 * .build())
 * .enable(false)
 * .upScaling(AutoScalingThresholdsProperty.builder()
 * .cpuThreshold(123)
 * .ignoreMetricsTime(123)
 * .instanceCount(123)
 * .loadThreshold(123)
 * .memoryThreshold(123)
 * .thresholdsWaitTime(123)
 * .build())
 * .build())
 * .packages(List.of("packages"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .useEbsOptimizedInstances(false)
 * .volumeConfigurations(List.of(VolumeConfigurationProperty.builder()
 * .encrypted(false)
 * .iops(123)
 * .mountPoint("mountPoint")
 * .numberOfDisks(123)
 * .raidLevel(123)
 * .size(123)
 * .volumeType("volumeType")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html)
 */
@CdkDslMarker
public class CfnLayerPropsDsl {
    private val cdkBuilder: CfnLayerProps.Builder = CfnLayerProps.builder()

    private val _customSecurityGroupIds: MutableList<String> = mutableListOf()

    private val _packages: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _volumeConfigurations: MutableList<Any> = mutableListOf()

    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     *   attributes. To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's
     *   ARN.
     */
    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     *   attributes. To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's
     *   ARN.
     */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param autoAssignElasticIps Whether to automatically assign an
     *   [Elastic IP address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html)
     *   to the layer's instances. For more information, see
     *   [How to Edit a Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html)
     *   .
     */
    public fun autoAssignElasticIps(autoAssignElasticIps: Boolean) {
        cdkBuilder.autoAssignElasticIps(autoAssignElasticIps)
    }

    /**
     * @param autoAssignElasticIps Whether to automatically assign an
     *   [Elastic IP address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html)
     *   to the layer's instances. For more information, see
     *   [How to Edit a Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html)
     *   .
     */
    public fun autoAssignElasticIps(autoAssignElasticIps: IResolvable) {
        cdkBuilder.autoAssignElasticIps(autoAssignElasticIps)
    }

    /**
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     *   assign a public IP address to the layer's instances. For more information, see
     *   [How to Edit a Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html)
     *   .
     */
    public fun autoAssignPublicIps(autoAssignPublicIps: Boolean) {
        cdkBuilder.autoAssignPublicIps(autoAssignPublicIps)
    }

    /**
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     *   assign a public IP address to the layer's instances. For more information, see
     *   [How to Edit a Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html)
     *   .
     */
    public fun autoAssignPublicIps(autoAssignPublicIps: IResolvable) {
        cdkBuilder.autoAssignPublicIps(autoAssignPublicIps)
    }

    /**
     * @param customInstanceProfileArn The ARN of an IAM profile to be used for the layer's EC2
     *   instances. For more information about IAM ARNs, see
     *   [Using Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
     *   .
     */
    public fun customInstanceProfileArn(customInstanceProfileArn: String) {
        cdkBuilder.customInstanceProfileArn(customInstanceProfileArn)
    }

    /**
     * @param customJson A JSON-formatted string containing custom stack configuration and
     *   deployment attributes to be installed on the layer's instances. For more information, see
     *   [Using Custom JSON](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html)
     *   . This feature is supported as of version 1.7.42 of the AWS CLI .
     */
    public fun customJson(customJson: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(customJson)
        cdkBuilder.customJson(builder.map)
    }

    /**
     * @param customJson A JSON-formatted string containing custom stack configuration and
     *   deployment attributes to be installed on the layer's instances. For more information, see
     *   [Using Custom JSON](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html)
     *   . This feature is supported as of version 1.7.42 of the AWS CLI .
     */
    public fun customJson(customJson: Any) {
        cdkBuilder.customJson(customJson)
    }

    /**
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes.
     */
    public fun customRecipes(customRecipes: IResolvable) {
        cdkBuilder.customRecipes(customRecipes)
    }

    /**
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes.
     */
    public fun customRecipes(customRecipes: CfnLayer.RecipesProperty) {
        cdkBuilder.customRecipes(customRecipes)
    }

    /** @param customSecurityGroupIds An array containing the layer custom security group IDs. */
    public fun customSecurityGroupIds(vararg customSecurityGroupIds: String) {
        _customSecurityGroupIds.addAll(listOf(*customSecurityGroupIds))
    }

    /** @param customSecurityGroupIds An array containing the layer custom security group IDs. */
    public fun customSecurityGroupIds(customSecurityGroupIds: Collection<String>) {
        _customSecurityGroupIds.addAll(customSecurityGroupIds)
    }

    /** @param enableAutoHealing Whether to disable auto healing for the layer. */
    public fun enableAutoHealing(enableAutoHealing: Boolean) {
        cdkBuilder.enableAutoHealing(enableAutoHealing)
    }

    /** @param enableAutoHealing Whether to disable auto healing for the layer. */
    public fun enableAutoHealing(enableAutoHealing: IResolvable) {
        cdkBuilder.enableAutoHealing(enableAutoHealing)
    }

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *   instance boots. The default value is `true` . To control when updates are installed, set
     *   this value to `false` . You must then update your instances manually by using
     *   [CreateDeployment](https://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateDeployment)
     *   to run the `update_dependencies` stack command or by manually running `yum` (Amazon Linux)
     *   or `apt-get` (Ubuntu) on the instances.
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
        cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *   instance boots. The default value is `true` . To control when updates are installed, set
     *   this value to `false` . You must then update your instances manually by using
     *   [CreateDeployment](https://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateDeployment)
     *   to run the `update_dependencies` stack command or by manually running `yum` (Amazon Linux)
     *   or `apt-get` (Ubuntu) on the instances.
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
        cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    /**
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     *   configure the Shutdown event to specify an execution timeout and enable or disable Elastic
     *   Load Balancer connection draining.
     */
    public fun lifecycleEventConfiguration(lifecycleEventConfiguration: IResolvable) {
        cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration)
    }

    /**
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     *   configure the Shutdown event to specify an execution timeout and enable or disable Elastic
     *   Load Balancer connection draining.
     */
    public fun lifecycleEventConfiguration(
        lifecycleEventConfiguration: CfnLayer.LifecycleEventConfigurationProperty
    ) {
        cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration)
    }

    /**
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer.
     */
    public fun loadBasedAutoScaling(loadBasedAutoScaling: IResolvable) {
        cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling)
    }

    /**
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer.
     */
    public fun loadBasedAutoScaling(loadBasedAutoScaling: CfnLayer.LoadBasedAutoScalingProperty) {
        cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling)
    }

    /**
     * @param name The layer name, which is used by the console. Layer names can be a maximum of 32
     *   characters.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param packages An array of `Package` objects that describes the layer packages. */
    public fun packages(vararg packages: String) {
        _packages.addAll(listOf(*packages))
    }

    /** @param packages An array of `Package` objects that describes the layer packages. */
    public fun packages(packages: Collection<String>) {
        _packages.addAll(packages)
    }

    /**
     * @param shortname For custom layers only, use this parameter to specify the layer's short
     *   name, which is used internally by AWS OpsWorks Stacks and by Chef recipes. The short name
     *   is also used as the name for the directory where your app files are installed. It can have
     *   a maximum of 32 characters, which are limited to the alphanumeric characters, '-', '_', and
     *   '.'.
     *
     * Built-in layer short names are defined by AWS OpsWorks Stacks. For more information, see the
     * [Layer Reference](https://docs.aws.amazon.com/opsworks/latest/userguide/layers.html) .
     */
    public fun shortname(shortname: String) {
        cdkBuilder.shortname(shortname)
    }

    /** @param stackId The layer stack ID. */
    public fun stackId(stackId: String) {
        cdkBuilder.stackId(stackId)
    }

    /**
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     *   OpsWorks layer. Use tags to manage your resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     *   OpsWorks layer. Use tags to manage your resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param type The layer type. A stack cannot have more than one built-in layer of the same
     *   type. It can have any number of custom layers. Built-in layers are not available in Chef 12
     *   stacks.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances. */
    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: Boolean) {
        cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances)
    }

    /** @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances. */
    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: IResolvable) {
        cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances)
    }

    /**
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     *   EBS volumes.
     */
    public fun volumeConfigurations(vararg volumeConfigurations: Any) {
        _volumeConfigurations.addAll(listOf(*volumeConfigurations))
    }

    /**
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     *   EBS volumes.
     */
    public fun volumeConfigurations(volumeConfigurations: Collection<Any>) {
        _volumeConfigurations.addAll(volumeConfigurations)
    }

    /**
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     *   EBS volumes.
     */
    public fun volumeConfigurations(volumeConfigurations: IResolvable) {
        cdkBuilder.volumeConfigurations(volumeConfigurations)
    }

    public fun build(): CfnLayerProps {
        if (_customSecurityGroupIds.isNotEmpty())
            cdkBuilder.customSecurityGroupIds(_customSecurityGroupIds)
        if (_packages.isNotEmpty()) cdkBuilder.packages(_packages)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_volumeConfigurations.isNotEmpty())
            cdkBuilder.volumeConfigurations(_volumeConfigurations)
        return cdkBuilder.build()
    }
}

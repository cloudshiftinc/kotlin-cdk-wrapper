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
import software.constructs.Construct

/**
 * Creates a layer. For more information, see
 * [How to Create a Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html)
 * .
 *
 * You should use *CreateLayer* for noncustom layer types such as PHP App Server only if the stack
 * does not have an existing layer of that type. A stack can have at most one instance of each
 * noncustom layer; if you attempt to create a second instance, *CreateLayer* fails. A stack can
 * have an arbitrary number of custom layers, so you can call *CreateLayer* as many times as you
 * like for that layer type.
 *
 * *Required Permissions* : To use this action, an IAM user must have a Manage permissions level for
 * the stack, or an attached policy that explicitly grants permissions. For more information on user
 * permissions, see
 * [Managing User Permissions](https://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * Object customJson;
 * CfnLayer cfnLayer = CfnLayer.Builder.create(this, "MyCfnLayer")
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
public class CfnLayerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLayer.Builder = CfnLayer.Builder.create(scope, id)

    private val _customSecurityGroupIds: MutableList<String> = mutableListOf()

    private val _packages: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _volumeConfigurations: MutableList<Any> = mutableListOf()

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes)
     *
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     *   attributes.
     */
    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes.
     *
     * To create a cluster layer, set the `EcsClusterArn` attribute to the cluster's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes)
     *
     * @param attributes One or more user-defined key-value pairs to be added to the stack
     *   attributes.
     */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * Whether to automatically assign an
     * [Elastic IP address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html)
     * to the layer's instances. For more information, see
     * [How to Edit a Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips)
     *
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
     * Whether to automatically assign an
     * [Elastic IP address](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html)
     * to the layer's instances. For more information, see
     * [How to Edit a Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips)
     *
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
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to
     * the layer's instances.
     *
     * For more information, see
     * [How to Edit a Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips)
     *
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     *   assign a public IP address to the layer's instances.
     */
    public fun autoAssignPublicIps(autoAssignPublicIps: Boolean) {
        cdkBuilder.autoAssignPublicIps(autoAssignPublicIps)
    }

    /**
     * For stacks that are running in a VPC, whether to automatically assign a public IP address to
     * the layer's instances.
     *
     * For more information, see
     * [How to Edit a Layer](https://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips)
     *
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically
     *   assign a public IP address to the layer's instances.
     */
    public fun autoAssignPublicIps(autoAssignPublicIps: IResolvable) {
        cdkBuilder.autoAssignPublicIps(autoAssignPublicIps)
    }

    /**
     * The ARN of an IAM profile to be used for the layer's EC2 instances.
     *
     * For more information about IAM ARNs, see
     * [Using Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn)
     *
     * @param customInstanceProfileArn The ARN of an IAM profile to be used for the layer's EC2
     *   instances.
     */
    public fun customInstanceProfileArn(customInstanceProfileArn: String) {
        cdkBuilder.customInstanceProfileArn(customInstanceProfileArn)
    }

    /**
     * A JSON-formatted string containing custom stack configuration and deployment attributes to be
     * installed on the layer's instances.
     *
     * For more information, see
     * [Using Custom JSON](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html)
     * . This feature is supported as of version 1.7.42 of the AWS CLI .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson)
     *
     * @param customJson A JSON-formatted string containing custom stack configuration and
     *   deployment attributes to be installed on the layer's instances.
     */
    public fun customJson(customJson: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(customJson)
        cdkBuilder.customJson(builder.map)
    }

    /**
     * A JSON-formatted string containing custom stack configuration and deployment attributes to be
     * installed on the layer's instances.
     *
     * For more information, see
     * [Using Custom JSON](https://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-json-override.html)
     * . This feature is supported as of version 1.7.42 of the AWS CLI .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson)
     *
     * @param customJson A JSON-formatted string containing custom stack configuration and
     *   deployment attributes to be installed on the layer's instances.
     */
    public fun customJson(customJson: Any) {
        cdkBuilder.customJson(customJson)
    }

    /**
     * A `LayerCustomRecipes` object that specifies the layer custom recipes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
     *
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes.
     */
    public fun customRecipes(customRecipes: IResolvable) {
        cdkBuilder.customRecipes(customRecipes)
    }

    /**
     * A `LayerCustomRecipes` object that specifies the layer custom recipes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customrecipes)
     *
     * @param customRecipes A `LayerCustomRecipes` object that specifies the layer custom recipes.
     */
    public fun customRecipes(customRecipes: CfnLayer.RecipesProperty) {
        cdkBuilder.customRecipes(customRecipes)
    }

    /**
     * An array containing the layer custom security group IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids)
     *
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     */
    public fun customSecurityGroupIds(vararg customSecurityGroupIds: String) {
        _customSecurityGroupIds.addAll(listOf(*customSecurityGroupIds))
    }

    /**
     * An array containing the layer custom security group IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids)
     *
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     */
    public fun customSecurityGroupIds(customSecurityGroupIds: Collection<String>) {
        _customSecurityGroupIds.addAll(customSecurityGroupIds)
    }

    /**
     * Whether to disable auto healing for the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing)
     *
     * @param enableAutoHealing Whether to disable auto healing for the layer.
     */
    public fun enableAutoHealing(enableAutoHealing: Boolean) {
        cdkBuilder.enableAutoHealing(enableAutoHealing)
    }

    /**
     * Whether to disable auto healing for the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing)
     *
     * @param enableAutoHealing Whether to disable auto healing for the layer.
     */
    public fun enableAutoHealing(enableAutoHealing: IResolvable) {
        cdkBuilder.enableAutoHealing(enableAutoHealing)
    }

    /**
     * Whether to install operating system and package updates when the instance boots.
     *
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using
     * [CreateDeployment](https://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateDeployment)
     * to run the `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or
     * `apt-get` (Ubuntu) on the instances.
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot)
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *   instance boots.
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
        cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    /**
     * Whether to install operating system and package updates when the instance boots.
     *
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using
     * [CreateDeployment](https://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateDeployment)
     * to run the `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or
     * `apt-get` (Ubuntu) on the instances.
     *
     * To ensure that your instances have the latest security updates, we strongly recommend using
     * the default value of `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot)
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *   instance boots.
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
        cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    /**
     * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
     * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
     *
     * @param lifecycleEventConfiguration A `LifeCycleEventConfiguration` object that you can use to
     *   configure the Shutdown event to specify an execution timeout and enable or disable Elastic
     *   Load Balancer connection draining.
     */
    public fun lifecycleEventConfiguration(lifecycleEventConfiguration: IResolvable) {
        cdkBuilder.lifecycleEventConfiguration(lifecycleEventConfiguration)
    }

    /**
     * A `LifeCycleEventConfiguration` object that you can use to configure the Shutdown event to
     * specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-lifecycleeventconfiguration)
     *
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
     * The load-based scaling configuration for the AWS OpsWorks layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
     *
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer.
     */
    public fun loadBasedAutoScaling(loadBasedAutoScaling: IResolvable) {
        cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling)
    }

    /**
     * The load-based scaling configuration for the AWS OpsWorks layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-loadbasedautoscaling)
     *
     * @param loadBasedAutoScaling The load-based scaling configuration for the AWS OpsWorks layer.
     */
    public fun loadBasedAutoScaling(loadBasedAutoScaling: CfnLayer.LoadBasedAutoScalingProperty) {
        cdkBuilder.loadBasedAutoScaling(loadBasedAutoScaling)
    }

    /**
     * The layer name, which is used by the console.
     *
     * Layer names can be a maximum of 32 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name)
     *
     * @param name The layer name, which is used by the console.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An array of `Package` objects that describes the layer packages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages)
     *
     * @param packages An array of `Package` objects that describes the layer packages.
     */
    public fun packages(vararg packages: String) {
        _packages.addAll(listOf(*packages))
    }

    /**
     * An array of `Package` objects that describes the layer packages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages)
     *
     * @param packages An array of `Package` objects that describes the layer packages.
     */
    public fun packages(packages: Collection<String>) {
        _packages.addAll(packages)
    }

    /**
     * For custom layers only, use this parameter to specify the layer's short name, which is used
     * internally by AWS OpsWorks Stacks and by Chef recipes.
     *
     * The short name is also used as the name for the directory where your app files are installed.
     * It can have a maximum of 32 characters, which are limited to the alphanumeric characters,
     * '-', '_', and '.'.
     *
     * Built-in layer short names are defined by AWS OpsWorks Stacks. For more information, see the
     * [Layer Reference](https://docs.aws.amazon.com/opsworks/latest/userguide/layers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname)
     *
     * @param shortname For custom layers only, use this parameter to specify the layer's short
     *   name, which is used internally by AWS OpsWorks Stacks and by Chef recipes.
     */
    public fun shortname(shortname: String) {
        cdkBuilder.shortname(shortname)
    }

    /**
     * The layer stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid)
     *
     * @param stackId The layer stack ID.
     */
    public fun stackId(stackId: String) {
        cdkBuilder.stackId(stackId)
    }

    /**
     * Specifies one or more sets of tags (key–value pairs) to associate with this AWS OpsWorks
     * layer.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags)
     *
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     *   OpsWorks layer.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Specifies one or more sets of tags (key–value pairs) to associate with this AWS OpsWorks
     * layer.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags)
     *
     * @param tags Specifies one or more sets of tags (key–value pairs) to associate with this AWS
     *   OpsWorks layer.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The layer type.
     *
     * A stack cannot have more than one built-in layer of the same type. It can have any number of
     * custom layers. Built-in layers are not available in Chef 12 stacks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type)
     *
     * @param type The layer type.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * Whether to use Amazon EBS-optimized instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances)
     *
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances.
     */
    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: Boolean) {
        cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances)
    }

    /**
     * Whether to use Amazon EBS-optimized instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances)
     *
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances.
     */
    public fun useEbsOptimizedInstances(useEbsOptimizedInstances: IResolvable) {
        cdkBuilder.useEbsOptimizedInstances(useEbsOptimizedInstances)
    }

    /**
     * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
     *
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     *   EBS volumes.
     */
    public fun volumeConfigurations(vararg volumeConfigurations: Any) {
        _volumeConfigurations.addAll(listOf(*volumeConfigurations))
    }

    /**
     * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
     *
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     *   EBS volumes.
     */
    public fun volumeConfigurations(volumeConfigurations: Collection<Any>) {
        _volumeConfigurations.addAll(volumeConfigurations)
    }

    /**
     * A `VolumeConfigurations` object that describes the layer's Amazon EBS volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations)
     *
     * @param volumeConfigurations A `VolumeConfigurations` object that describes the layer's Amazon
     *   EBS volumes.
     */
    public fun volumeConfigurations(volumeConfigurations: IResolvable) {
        cdkBuilder.volumeConfigurations(volumeConfigurations)
    }

    public fun build(): CfnLayer {
        if (_customSecurityGroupIds.isNotEmpty())
            cdkBuilder.customSecurityGroupIds(_customSecurityGroupIds)
        if (_packages.isNotEmpty()) cdkBuilder.packages(_packages)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_volumeConfigurations.isNotEmpty())
            cdkBuilder.volumeConfigurations(_volumeConfigurations)
        return cdkBuilder.build()
    }
}

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

import software.amazon.awscdk.services.opsworks.CfnApp
import software.amazon.awscdk.services.opsworks.CfnAppProps
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachment
import software.amazon.awscdk.services.opsworks.CfnElasticLoadBalancerAttachmentProps
import software.amazon.awscdk.services.opsworks.CfnInstance
import software.amazon.awscdk.services.opsworks.CfnInstanceProps
import software.amazon.awscdk.services.opsworks.CfnLayer
import software.amazon.awscdk.services.opsworks.CfnLayerProps
import software.amazon.awscdk.services.opsworks.CfnStack
import software.amazon.awscdk.services.opsworks.CfnStackProps
import software.amazon.awscdk.services.opsworks.CfnUserProfile
import software.amazon.awscdk.services.opsworks.CfnUserProfileProps
import software.amazon.awscdk.services.opsworks.CfnVolume
import software.amazon.awscdk.services.opsworks.CfnVolumeProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object opsworks {
    public inline fun cfnApp(
        scope: Construct,
        id: String,
        block: CfnAppDsl.() -> Unit = {},
    ): CfnApp {
        val builder = CfnAppDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppDataSourceProperty(block: CfnAppDataSourcePropertyDsl.() -> Unit = {}): CfnApp.DataSourceProperty {
        val builder = CfnAppDataSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppEnvironmentVariableProperty(
        block: CfnAppEnvironmentVariablePropertyDsl.() -> Unit =
            {},
    ): CfnApp.EnvironmentVariableProperty {
        val builder = CfnAppEnvironmentVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppProps(block: CfnAppPropsDsl.() -> Unit = {}): CfnAppProps {
        val builder = CfnAppPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppSourceProperty(block: CfnAppSourcePropertyDsl.() -> Unit = {}): CfnApp.SourceProperty {
        val builder = CfnAppSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAppSslConfigurationProperty(
        block: CfnAppSslConfigurationPropertyDsl.() -> Unit = {
        },
    ): CfnApp.SslConfigurationProperty {
        val builder = CfnAppSslConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnElasticLoadBalancerAttachment(
        scope: Construct,
        id: String,
        block: CfnElasticLoadBalancerAttachmentDsl.() -> Unit = {},
    ): CfnElasticLoadBalancerAttachment {
        val builder = CfnElasticLoadBalancerAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnElasticLoadBalancerAttachmentProps(
        block: CfnElasticLoadBalancerAttachmentPropsDsl.() -> Unit =
            {},
    ): CfnElasticLoadBalancerAttachmentProps {
        val builder = CfnElasticLoadBalancerAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstance(
        scope: Construct,
        id: String,
        block: CfnInstanceDsl.() -> Unit = {},
    ): CfnInstance {
        val builder = CfnInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceBlockDeviceMappingProperty(
        block: CfnInstanceBlockDeviceMappingPropertyDsl.() -> Unit =
            {},
    ): CfnInstance.BlockDeviceMappingProperty {
        val builder = CfnInstanceBlockDeviceMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceEbsBlockDeviceProperty(
        block: CfnInstanceEbsBlockDevicePropertyDsl.() -> Unit =
            {},
    ): CfnInstance.EbsBlockDeviceProperty {
        val builder = CfnInstanceEbsBlockDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceProps(block: CfnInstancePropsDsl.() -> Unit = {}): CfnInstanceProps {
        val builder = CfnInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceTimeBasedAutoScalingProperty(
        block: CfnInstanceTimeBasedAutoScalingPropertyDsl.() -> Unit =
            {},
    ): CfnInstance.TimeBasedAutoScalingProperty {
        val builder = CfnInstanceTimeBasedAutoScalingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLayer(
        scope: Construct,
        id: String,
        block: CfnLayerDsl.() -> Unit = {},
    ): CfnLayer {
        val builder = CfnLayerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLayerAutoScalingThresholdsProperty(
        block: CfnLayerAutoScalingThresholdsPropertyDsl.() -> Unit =
            {},
    ): CfnLayer.AutoScalingThresholdsProperty {
        val builder = CfnLayerAutoScalingThresholdsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLayerLifecycleEventConfigurationProperty(
        block: CfnLayerLifecycleEventConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnLayer.LifecycleEventConfigurationProperty {
        val builder = CfnLayerLifecycleEventConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLayerLoadBasedAutoScalingProperty(
        block: CfnLayerLoadBasedAutoScalingPropertyDsl.() -> Unit =
            {},
    ): CfnLayer.LoadBasedAutoScalingProperty {
        val builder = CfnLayerLoadBasedAutoScalingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLayerProps(block: CfnLayerPropsDsl.() -> Unit = {}): CfnLayerProps {
        val builder = CfnLayerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLayerRecipesProperty(block: CfnLayerRecipesPropertyDsl.() -> Unit = {}): CfnLayer.RecipesProperty {
        val builder = CfnLayerRecipesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLayerShutdownEventConfigurationProperty(
        block: CfnLayerShutdownEventConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnLayer.ShutdownEventConfigurationProperty {
        val builder = CfnLayerShutdownEventConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLayerVolumeConfigurationProperty(
        block: CfnLayerVolumeConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnLayer.VolumeConfigurationProperty {
        val builder = CfnLayerVolumeConfigurationPropertyDsl()
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

    public inline fun cfnStackChefConfigurationProperty(
        block: CfnStackChefConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnStack.ChefConfigurationProperty {
        val builder = CfnStackChefConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackElasticIpProperty(block: CfnStackElasticIpPropertyDsl.() -> Unit = {}): CfnStack.ElasticIpProperty {
        val builder = CfnStackElasticIpPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackProps(block: CfnStackPropsDsl.() -> Unit = {}): CfnStackProps {
        val builder = CfnStackPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackRdsDbInstanceProperty(
        block: CfnStackRdsDbInstancePropertyDsl.() -> Unit =
            {},
    ): CfnStack.RdsDbInstanceProperty {
        val builder = CfnStackRdsDbInstancePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackSourceProperty(block: CfnStackSourcePropertyDsl.() -> Unit = {}): CfnStack.SourceProperty {
        val builder = CfnStackSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackStackConfigurationManagerProperty(
        block: CfnStackStackConfigurationManagerPropertyDsl.() -> Unit =
            {},
    ): CfnStack.StackConfigurationManagerProperty {
        val builder = CfnStackStackConfigurationManagerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnUserProfile(
        scope: Construct,
        id: String,
        block: CfnUserProfileDsl.() -> Unit = {},
    ): CfnUserProfile {
        val builder = CfnUserProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnUserProfileProps(block: CfnUserProfilePropsDsl.() -> Unit = {}): CfnUserProfileProps {
        val builder = CfnUserProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVolume(
        scope: Construct,
        id: String,
        block: CfnVolumeDsl.() -> Unit = {},
    ): CfnVolume {
        val builder = CfnVolumeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVolumeProps(block: CfnVolumePropsDsl.() -> Unit = {}): CfnVolumeProps {
        val builder = CfnVolumePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}

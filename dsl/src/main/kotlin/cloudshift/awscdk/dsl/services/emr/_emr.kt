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

package cloudshift.awscdk.dsl.services.emr

import software.amazon.awscdk.services.emr.CfnCluster
import software.amazon.awscdk.services.emr.CfnClusterProps
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfigProps
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfigProps
import software.amazon.awscdk.services.emr.CfnSecurityConfiguration
import software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps
import software.amazon.awscdk.services.emr.CfnStep
import software.amazon.awscdk.services.emr.CfnStepProps
import software.amazon.awscdk.services.emr.CfnStudio
import software.amazon.awscdk.services.emr.CfnStudioProps
import software.amazon.awscdk.services.emr.CfnStudioSessionMapping
import software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object emr {
    public inline fun cfnCluster(
        scope: Construct,
        id: String,
        block: CfnClusterDsl.() -> Unit = {},
    ): CfnCluster {
        val builder = CfnClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterApplicationProperty(
        block: CfnClusterApplicationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ApplicationProperty {
        val builder = CfnClusterApplicationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterAutoScalingPolicyProperty(
        block: CfnClusterAutoScalingPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.AutoScalingPolicyProperty {
        val builder = CfnClusterAutoScalingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterAutoTerminationPolicyProperty(
        block: CfnClusterAutoTerminationPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.AutoTerminationPolicyProperty {
        val builder = CfnClusterAutoTerminationPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterBootstrapActionConfigProperty(
        block: CfnClusterBootstrapActionConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.BootstrapActionConfigProperty {
        val builder = CfnClusterBootstrapActionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterCloudWatchAlarmDefinitionProperty(
        block: CfnClusterCloudWatchAlarmDefinitionPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.CloudWatchAlarmDefinitionProperty {
        val builder = CfnClusterCloudWatchAlarmDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterComputeLimitsProperty(
        block: CfnClusterComputeLimitsPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ComputeLimitsProperty {
        val builder = CfnClusterComputeLimitsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterConfigurationProperty(
        block: CfnClusterConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ConfigurationProperty {
        val builder = CfnClusterConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterEbsBlockDeviceConfigProperty(
        block: CfnClusterEbsBlockDeviceConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.EbsBlockDeviceConfigProperty {
        val builder = CfnClusterEbsBlockDeviceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterEbsConfigurationProperty(
        block: CfnClusterEbsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.EbsConfigurationProperty {
        val builder = CfnClusterEbsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterHadoopJarStepConfigProperty(
        block: CfnClusterHadoopJarStepConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.HadoopJarStepConfigProperty {
        val builder = CfnClusterHadoopJarStepConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterInstanceFleetConfigProperty(
        block: CfnClusterInstanceFleetConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.InstanceFleetConfigProperty {
        val builder = CfnClusterInstanceFleetConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterInstanceFleetProvisioningSpecificationsProperty(
        block: CfnClusterInstanceFleetProvisioningSpecificationsPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.InstanceFleetProvisioningSpecificationsProperty {
        val builder = CfnClusterInstanceFleetProvisioningSpecificationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterInstanceGroupConfigProperty(
        block: CfnClusterInstanceGroupConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.InstanceGroupConfigProperty {
        val builder = CfnClusterInstanceGroupConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterInstanceTypeConfigProperty(
        block: CfnClusterInstanceTypeConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.InstanceTypeConfigProperty {
        val builder = CfnClusterInstanceTypeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterJobFlowInstancesConfigProperty(
        block: CfnClusterJobFlowInstancesConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.JobFlowInstancesConfigProperty {
        val builder = CfnClusterJobFlowInstancesConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterKerberosAttributesProperty(
        block: CfnClusterKerberosAttributesPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.KerberosAttributesProperty {
        val builder = CfnClusterKerberosAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterKeyValueProperty(
        block: CfnClusterKeyValuePropertyDsl.() -> Unit =
            {},
    ): CfnCluster.KeyValueProperty {
        val builder = CfnClusterKeyValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterManagedScalingPolicyProperty(
        block: CfnClusterManagedScalingPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ManagedScalingPolicyProperty {
        val builder = CfnClusterManagedScalingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterMetricDimensionProperty(
        block: CfnClusterMetricDimensionPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.MetricDimensionProperty {
        val builder = CfnClusterMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterOnDemandProvisioningSpecificationProperty(
        block: CfnClusterOnDemandProvisioningSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.OnDemandProvisioningSpecificationProperty {
        val builder = CfnClusterOnDemandProvisioningSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterPlacementTypeProperty(
        block: CfnClusterPlacementTypePropertyDsl.() -> Unit =
            {},
    ): CfnCluster.PlacementTypeProperty {
        val builder = CfnClusterPlacementTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterScalingActionProperty(
        block: CfnClusterScalingActionPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ScalingActionProperty {
        val builder = CfnClusterScalingActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterScalingConstraintsProperty(
        block: CfnClusterScalingConstraintsPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ScalingConstraintsProperty {
        val builder = CfnClusterScalingConstraintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterScalingRuleProperty(
        block: CfnClusterScalingRulePropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ScalingRuleProperty {
        val builder = CfnClusterScalingRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterScalingTriggerProperty(
        block: CfnClusterScalingTriggerPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ScalingTriggerProperty {
        val builder = CfnClusterScalingTriggerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterScriptBootstrapActionConfigProperty(
        block: CfnClusterScriptBootstrapActionConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ScriptBootstrapActionConfigProperty {
        val builder = CfnClusterScriptBootstrapActionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterSimpleScalingPolicyConfigurationProperty(
        block: CfnClusterSimpleScalingPolicyConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.SimpleScalingPolicyConfigurationProperty {
        val builder = CfnClusterSimpleScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterSpotProvisioningSpecificationProperty(
        block: CfnClusterSpotProvisioningSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.SpotProvisioningSpecificationProperty {
        val builder = CfnClusterSpotProvisioningSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterStepConfigProperty(
        block: CfnClusterStepConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.StepConfigProperty {
        val builder = CfnClusterStepConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterVolumeSpecificationProperty(
        block: CfnClusterVolumeSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.VolumeSpecificationProperty {
        val builder = CfnClusterVolumeSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceFleetConfig(
        scope: Construct,
        id: String,
        block: CfnInstanceFleetConfigDsl.() -> Unit = {},
    ): CfnInstanceFleetConfig {
        val builder = CfnInstanceFleetConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceFleetConfigConfigurationProperty(
        block: CfnInstanceFleetConfigConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceFleetConfig.ConfigurationProperty {
        val builder = CfnInstanceFleetConfigConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceFleetConfigEbsBlockDeviceConfigProperty(
        block: CfnInstanceFleetConfigEbsBlockDeviceConfigPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty {
        val builder = CfnInstanceFleetConfigEbsBlockDeviceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceFleetConfigEbsConfigurationProperty(
        block: CfnInstanceFleetConfigEbsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceFleetConfig.EbsConfigurationProperty {
        val builder = CfnInstanceFleetConfigEbsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsProperty(
        block: CfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty {
        val builder = CfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceFleetConfigInstanceTypeConfigProperty(
        block: CfnInstanceFleetConfigInstanceTypeConfigPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceFleetConfig.InstanceTypeConfigProperty {
        val builder = CfnInstanceFleetConfigInstanceTypeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceFleetConfigOnDemandProvisioningSpecificationProperty(
        block: CfnInstanceFleetConfigOnDemandProvisioningSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty {
        val builder = CfnInstanceFleetConfigOnDemandProvisioningSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceFleetConfigProps(
        block: CfnInstanceFleetConfigPropsDsl.() -> Unit =
            {},
    ): CfnInstanceFleetConfigProps {
        val builder = CfnInstanceFleetConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceFleetConfigSpotProvisioningSpecificationProperty(
        block: CfnInstanceFleetConfigSpotProvisioningSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty {
        val builder = CfnInstanceFleetConfigSpotProvisioningSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceFleetConfigVolumeSpecificationProperty(
        block: CfnInstanceFleetConfigVolumeSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceFleetConfig.VolumeSpecificationProperty {
        val builder = CfnInstanceFleetConfigVolumeSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfig(
        scope: Construct,
        id: String,
        block: CfnInstanceGroupConfigDsl.() -> Unit = {},
    ): CfnInstanceGroupConfig {
        val builder = CfnInstanceGroupConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigAutoScalingPolicyProperty(
        block: CfnInstanceGroupConfigAutoScalingPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.AutoScalingPolicyProperty {
        val builder = CfnInstanceGroupConfigAutoScalingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigCloudWatchAlarmDefinitionProperty(
        block: CfnInstanceGroupConfigCloudWatchAlarmDefinitionPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty {
        val builder = CfnInstanceGroupConfigCloudWatchAlarmDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigConfigurationProperty(
        block: CfnInstanceGroupConfigConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.ConfigurationProperty {
        val builder = CfnInstanceGroupConfigConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigEbsBlockDeviceConfigProperty(
        block: CfnInstanceGroupConfigEbsBlockDeviceConfigPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty {
        val builder = CfnInstanceGroupConfigEbsBlockDeviceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigEbsConfigurationProperty(
        block: CfnInstanceGroupConfigEbsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.EbsConfigurationProperty {
        val builder = CfnInstanceGroupConfigEbsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigMetricDimensionProperty(
        block: CfnInstanceGroupConfigMetricDimensionPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.MetricDimensionProperty {
        val builder = CfnInstanceGroupConfigMetricDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigProps(
        block: CfnInstanceGroupConfigPropsDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfigProps {
        val builder = CfnInstanceGroupConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigScalingActionProperty(
        block: CfnInstanceGroupConfigScalingActionPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.ScalingActionProperty {
        val builder = CfnInstanceGroupConfigScalingActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigScalingConstraintsProperty(
        block: CfnInstanceGroupConfigScalingConstraintsPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.ScalingConstraintsProperty {
        val builder = CfnInstanceGroupConfigScalingConstraintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigScalingRuleProperty(
        block: CfnInstanceGroupConfigScalingRulePropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.ScalingRuleProperty {
        val builder = CfnInstanceGroupConfigScalingRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigScalingTriggerProperty(
        block: CfnInstanceGroupConfigScalingTriggerPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.ScalingTriggerProperty {
        val builder = CfnInstanceGroupConfigScalingTriggerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigSimpleScalingPolicyConfigurationProperty(
        block: CfnInstanceGroupConfigSimpleScalingPolicyConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty {
        val builder = CfnInstanceGroupConfigSimpleScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceGroupConfigVolumeSpecificationProperty(
        block: CfnInstanceGroupConfigVolumeSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceGroupConfig.VolumeSpecificationProperty {
        val builder = CfnInstanceGroupConfigVolumeSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityConfiguration(
        scope: Construct,
        id: String,
        block: CfnSecurityConfigurationDsl.() -> Unit = {},
    ): CfnSecurityConfiguration {
        val builder = CfnSecurityConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityConfigurationProps(
        block: CfnSecurityConfigurationPropsDsl.() -> Unit =
            {},
    ): CfnSecurityConfigurationProps {
        val builder = CfnSecurityConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStep(
        scope: Construct,
        id: String,
        block: CfnStepDsl.() -> Unit = {},
    ): CfnStep {
        val builder = CfnStepDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStepHadoopJarStepConfigProperty(
        block: CfnStepHadoopJarStepConfigPropertyDsl.() -> Unit =
            {},
    ): CfnStep.HadoopJarStepConfigProperty {
        val builder = CfnStepHadoopJarStepConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStepKeyValueProperty(block: CfnStepKeyValuePropertyDsl.() -> Unit = {}): CfnStep.KeyValueProperty {
        val builder = CfnStepKeyValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStepProps(block: CfnStepPropsDsl.() -> Unit = {}): CfnStepProps {
        val builder = CfnStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStudio(
        scope: Construct,
        id: String,
        block: CfnStudioDsl.() -> Unit = {},
    ): CfnStudio {
        val builder = CfnStudioDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStudioProps(block: CfnStudioPropsDsl.() -> Unit = {}): CfnStudioProps {
        val builder = CfnStudioPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStudioSessionMapping(
        scope: Construct,
        id: String,
        block: CfnStudioSessionMappingDsl.() -> Unit = {},
    ): CfnStudioSessionMapping {
        val builder = CfnStudioSessionMappingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStudioSessionMappingProps(
        block: CfnStudioSessionMappingPropsDsl.() -> Unit =
            {},
    ): CfnStudioSessionMappingProps {
        val builder = CfnStudioSessionMappingPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}

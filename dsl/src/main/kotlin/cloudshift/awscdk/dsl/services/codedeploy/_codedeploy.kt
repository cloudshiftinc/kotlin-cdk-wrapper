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

package cloudshift.awscdk.dsl.services.codedeploy

import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig
import software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions
import software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps
import software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig
import software.amazon.awscdk.services.codedeploy.CfnApplication
import software.amazon.awscdk.services.codedeploy.CfnApplicationProps
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.EcsApplication
import software.amazon.awscdk.services.codedeploy.EcsApplicationProps
import software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.LambdaApplication
import software.amazon.awscdk.services.codedeploy.LambdaApplicationProps
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupAttributes
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig
import software.amazon.awscdk.services.codedeploy.ServerApplication
import software.amazon.awscdk.services.codedeploy.ServerApplicationProps
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps
import software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRouting
import software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps
import software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting
import software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps
import software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig
import software.constructs.Construct
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public object codedeploy {
    public inline fun autoRollbackConfig(block: AutoRollbackConfigDsl.() -> Unit = {}): AutoRollbackConfig {
        val builder = AutoRollbackConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseDeploymentConfigOptions(
        block: BaseDeploymentConfigOptionsDsl.() -> Unit =
            {},
    ): BaseDeploymentConfigOptions {
        val builder = BaseDeploymentConfigOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseDeploymentConfigProps(block: BaseDeploymentConfigPropsDsl.() -> Unit = {}): BaseDeploymentConfigProps {
        val builder = BaseDeploymentConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseTrafficShiftingConfigProps(block: BaseTrafficShiftingConfigPropsDsl.() -> Unit = {}): BaseTrafficShiftingConfigProps {
        val builder = BaseTrafficShiftingConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun canaryTrafficRoutingConfig(
        block: CanaryTrafficRoutingConfigDsl.() -> Unit =
            {},
    ): CanaryTrafficRoutingConfig {
        val builder = CanaryTrafficRoutingConfigDsl()
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

    public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentConfig(
        scope: Construct,
        id: String,
        block: CfnDeploymentConfigDsl.() -> Unit = {},
    ): CfnDeploymentConfig {
        val builder = CfnDeploymentConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentConfigMinimumHealthyHostsProperty(
        block: CfnDeploymentConfigMinimumHealthyHostsPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentConfig.MinimumHealthyHostsProperty {
        val builder = CfnDeploymentConfigMinimumHealthyHostsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentConfigProps(block: CfnDeploymentConfigPropsDsl.() -> Unit = {}): CfnDeploymentConfigProps {
        val builder = CfnDeploymentConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentConfigTimeBasedCanaryProperty(
        block: CfnDeploymentConfigTimeBasedCanaryPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentConfig.TimeBasedCanaryProperty {
        val builder = CfnDeploymentConfigTimeBasedCanaryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentConfigTimeBasedLinearProperty(
        block: CfnDeploymentConfigTimeBasedLinearPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentConfig.TimeBasedLinearProperty {
        val builder = CfnDeploymentConfigTimeBasedLinearPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentConfigTrafficRoutingConfigProperty(
        block: CfnDeploymentConfigTrafficRoutingConfigPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentConfig.TrafficRoutingConfigProperty {
        val builder = CfnDeploymentConfigTrafficRoutingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroup(
        scope: Construct,
        id: String,
        block: CfnDeploymentGroupDsl.() -> Unit = {},
    ): CfnDeploymentGroup {
        val builder = CfnDeploymentGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupAlarmConfigurationProperty(
        block: CfnDeploymentGroupAlarmConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.AlarmConfigurationProperty {
        val builder = CfnDeploymentGroupAlarmConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupAlarmProperty(
        block: CfnDeploymentGroupAlarmPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.AlarmProperty {
        val builder = CfnDeploymentGroupAlarmPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupAutoRollbackConfigurationProperty(
        block: CfnDeploymentGroupAutoRollbackConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.AutoRollbackConfigurationProperty {
        val builder = CfnDeploymentGroupAutoRollbackConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupBlueGreenDeploymentConfigurationProperty(
        block: CfnDeploymentGroupBlueGreenDeploymentConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty {
        val builder = CfnDeploymentGroupBlueGreenDeploymentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupBlueInstanceTerminationOptionProperty(
        block: CfnDeploymentGroupBlueInstanceTerminationOptionPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.BlueInstanceTerminationOptionProperty {
        val builder = CfnDeploymentGroupBlueInstanceTerminationOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupDeploymentProperty(
        block: CfnDeploymentGroupDeploymentPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.DeploymentProperty {
        val builder = CfnDeploymentGroupDeploymentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupDeploymentReadyOptionProperty(
        block: CfnDeploymentGroupDeploymentReadyOptionPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.DeploymentReadyOptionProperty {
        val builder = CfnDeploymentGroupDeploymentReadyOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupDeploymentStyleProperty(
        block: CfnDeploymentGroupDeploymentStylePropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.DeploymentStyleProperty {
        val builder = CfnDeploymentGroupDeploymentStylePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupEC2TagFilterProperty(
        block: CfnDeploymentGroupEC2TagFilterPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.EC2TagFilterProperty {
        val builder = CfnDeploymentGroupEC2TagFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupEC2TagSetListObjectProperty(
        block: CfnDeploymentGroupEC2TagSetListObjectPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.EC2TagSetListObjectProperty {
        val builder = CfnDeploymentGroupEC2TagSetListObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupEC2TagSetProperty(
        block: CfnDeploymentGroupEC2TagSetPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.EC2TagSetProperty {
        val builder = CfnDeploymentGroupEC2TagSetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupECSServiceProperty(
        block: CfnDeploymentGroupECSServicePropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.ECSServiceProperty {
        val builder = CfnDeploymentGroupECSServicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupELBInfoProperty(
        block: CfnDeploymentGroupELBInfoPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.ELBInfoProperty {
        val builder = CfnDeploymentGroupELBInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupGitHubLocationProperty(
        block: CfnDeploymentGroupGitHubLocationPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.GitHubLocationProperty {
        val builder = CfnDeploymentGroupGitHubLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupGreenFleetProvisioningOptionProperty(
        block: CfnDeploymentGroupGreenFleetProvisioningOptionPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.GreenFleetProvisioningOptionProperty {
        val builder = CfnDeploymentGroupGreenFleetProvisioningOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupLoadBalancerInfoProperty(
        block: CfnDeploymentGroupLoadBalancerInfoPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.LoadBalancerInfoProperty {
        val builder = CfnDeploymentGroupLoadBalancerInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupOnPremisesTagSetListObjectProperty(
        block: CfnDeploymentGroupOnPremisesTagSetListObjectPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.OnPremisesTagSetListObjectProperty {
        val builder = CfnDeploymentGroupOnPremisesTagSetListObjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupOnPremisesTagSetProperty(
        block: CfnDeploymentGroupOnPremisesTagSetPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.OnPremisesTagSetProperty {
        val builder = CfnDeploymentGroupOnPremisesTagSetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupProps(block: CfnDeploymentGroupPropsDsl.() -> Unit = {}): CfnDeploymentGroupProps {
        val builder = CfnDeploymentGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupRevisionLocationProperty(
        block: CfnDeploymentGroupRevisionLocationPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.RevisionLocationProperty {
        val builder = CfnDeploymentGroupRevisionLocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupS3LocationProperty(
        block: CfnDeploymentGroupS3LocationPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.S3LocationProperty {
        val builder = CfnDeploymentGroupS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupTagFilterProperty(
        block: CfnDeploymentGroupTagFilterPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.TagFilterProperty {
        val builder = CfnDeploymentGroupTagFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupTargetGroupInfoProperty(
        block: CfnDeploymentGroupTargetGroupInfoPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.TargetGroupInfoProperty {
        val builder = CfnDeploymentGroupTargetGroupInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupTargetGroupPairInfoProperty(
        block: CfnDeploymentGroupTargetGroupPairInfoPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.TargetGroupPairInfoProperty {
        val builder = CfnDeploymentGroupTargetGroupPairInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupTrafficRouteProperty(
        block: CfnDeploymentGroupTrafficRoutePropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.TrafficRouteProperty {
        val builder = CfnDeploymentGroupTrafficRoutePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDeploymentGroupTriggerConfigProperty(
        block: CfnDeploymentGroupTriggerConfigPropertyDsl.() -> Unit =
            {},
    ): CfnDeploymentGroup.TriggerConfigProperty {
        val builder = CfnDeploymentGroupTriggerConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    @Deprecated(message = "deprecated in CDK")
    public inline fun customLambdaDeploymentConfig(
        scope: Construct,
        id: String,
        block: CustomLambdaDeploymentConfigDsl.() -> Unit = {},
    ): CustomLambdaDeploymentConfig {
        val builder = CustomLambdaDeploymentConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    @Deprecated(message = "deprecated in CDK")
    public inline fun customLambdaDeploymentConfigProps(
        block: CustomLambdaDeploymentConfigPropsDsl.() -> Unit =
            {},
    ): CustomLambdaDeploymentConfigProps {
        val builder = CustomLambdaDeploymentConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsApplication(
        scope: Construct,
        id: String,
        block: EcsApplicationDsl.() -> Unit = {},
    ): EcsApplication {
        val builder = EcsApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsApplicationProps(block: EcsApplicationPropsDsl.() -> Unit = {}): EcsApplicationProps {
        val builder = EcsApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsBlueGreenDeploymentConfig(
        block: EcsBlueGreenDeploymentConfigDsl.() -> Unit =
            {},
    ): EcsBlueGreenDeploymentConfig {
        val builder = EcsBlueGreenDeploymentConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsDeploymentConfig(
        scope: Construct,
        id: String,
        block: EcsDeploymentConfigDsl.() -> Unit = {},
    ): EcsDeploymentConfig {
        val builder = EcsDeploymentConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsDeploymentConfigProps(block: EcsDeploymentConfigPropsDsl.() -> Unit = {}): EcsDeploymentConfigProps {
        val builder = EcsDeploymentConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsDeploymentGroup(
        scope: Construct,
        id: String,
        block: EcsDeploymentGroupDsl.() -> Unit = {},
    ): EcsDeploymentGroup {
        val builder = EcsDeploymentGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsDeploymentGroupAttributes(
        block: EcsDeploymentGroupAttributesDsl.() -> Unit =
            {},
    ): EcsDeploymentGroupAttributes {
        val builder = EcsDeploymentGroupAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsDeploymentGroupProps(block: EcsDeploymentGroupPropsDsl.() -> Unit = {}): EcsDeploymentGroupProps {
        val builder = EcsDeploymentGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaApplication(
        scope: Construct,
        id: String,
        block: LambdaApplicationDsl.() -> Unit = {},
    ): LambdaApplication {
        val builder = LambdaApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaApplicationProps(block: LambdaApplicationPropsDsl.() -> Unit = {}): LambdaApplicationProps {
        val builder = LambdaApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaDeploymentConfig(
        scope: Construct,
        id: String,
        block: LambdaDeploymentConfigDsl.() -> Unit = {},
    ): LambdaDeploymentConfig {
        val builder = LambdaDeploymentConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaDeploymentConfigImportProps(
        block: LambdaDeploymentConfigImportPropsDsl.() -> Unit =
            {},
    ): LambdaDeploymentConfigImportProps {
        val builder = LambdaDeploymentConfigImportPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaDeploymentConfigProps(
        block: LambdaDeploymentConfigPropsDsl.() -> Unit =
            {},
    ): LambdaDeploymentConfigProps {
        val builder = LambdaDeploymentConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaDeploymentGroup(
        scope: Construct,
        id: String,
        block: LambdaDeploymentGroupDsl.() -> Unit = {},
    ): LambdaDeploymentGroup {
        val builder = LambdaDeploymentGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaDeploymentGroupAttributes(
        block: LambdaDeploymentGroupAttributesDsl.() -> Unit =
            {},
    ): LambdaDeploymentGroupAttributes {
        val builder = LambdaDeploymentGroupAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaDeploymentGroupProps(
        block: LambdaDeploymentGroupPropsDsl.() -> Unit =
            {},
    ): LambdaDeploymentGroupProps {
        val builder = LambdaDeploymentGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun linearTrafficRoutingConfig(
        block: LinearTrafficRoutingConfigDsl.() -> Unit =
            {},
    ): LinearTrafficRoutingConfig {
        val builder = LinearTrafficRoutingConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverApplication(
        scope: Construct,
        id: String,
        block: ServerApplicationDsl.() -> Unit = {},
    ): ServerApplication {
        val builder = ServerApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverApplicationProps(block: ServerApplicationPropsDsl.() -> Unit = {}): ServerApplicationProps {
        val builder = ServerApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverDeploymentConfig(
        scope: Construct,
        id: String,
        block: ServerDeploymentConfigDsl.() -> Unit = {},
    ): ServerDeploymentConfig {
        val builder = ServerDeploymentConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverDeploymentConfigProps(
        block: ServerDeploymentConfigPropsDsl.() -> Unit =
            {},
    ): ServerDeploymentConfigProps {
        val builder = ServerDeploymentConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverDeploymentGroup(
        scope: Construct,
        id: String,
        block: ServerDeploymentGroupDsl.() -> Unit = {},
    ): ServerDeploymentGroup {
        val builder = ServerDeploymentGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverDeploymentGroupAttributes(
        block: ServerDeploymentGroupAttributesDsl.() -> Unit =
            {},
    ): ServerDeploymentGroupAttributes {
        val builder = ServerDeploymentGroupAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serverDeploymentGroupProps(
        block: ServerDeploymentGroupPropsDsl.() -> Unit =
            {},
    ): ServerDeploymentGroupProps {
        val builder = ServerDeploymentGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun timeBasedCanaryTrafficRouting(
        block: TimeBasedCanaryTrafficRoutingDsl.() -> Unit =
            {},
    ): TimeBasedCanaryTrafficRouting {
        val builder = TimeBasedCanaryTrafficRoutingDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun timeBasedCanaryTrafficRoutingProps(
        block: TimeBasedCanaryTrafficRoutingPropsDsl.() -> Unit =
            {},
    ): TimeBasedCanaryTrafficRoutingProps {
        val builder = TimeBasedCanaryTrafficRoutingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun timeBasedLinearTrafficRouting(
        block: TimeBasedLinearTrafficRoutingDsl.() -> Unit =
            {},
    ): TimeBasedLinearTrafficRouting {
        val builder = TimeBasedLinearTrafficRoutingDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun timeBasedLinearTrafficRoutingProps(
        block: TimeBasedLinearTrafficRoutingPropsDsl.() -> Unit =
            {},
    ): TimeBasedLinearTrafficRoutingProps {
        val builder = TimeBasedLinearTrafficRoutingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun trafficRoutingConfig(block: TrafficRoutingConfigDsl.() -> Unit = {}): TrafficRoutingConfig {
        val builder = TrafficRoutingConfigDsl()
        builder.apply(block)
        return builder.build()
    }
}

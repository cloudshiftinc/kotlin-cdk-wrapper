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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAliasProps

/**
 * Properties for defining a `CfnStateMachineAlias`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * CfnStateMachineAliasProps cfnStateMachineAliasProps = CfnStateMachineAliasProps.builder()
 * .deploymentPreference(DeploymentPreferenceProperty.builder()
 * .stateMachineVersionArn("stateMachineVersionArn")
 * .type("type")
 * // the properties below are optional
 * .alarms(List.of("alarms"))
 * .interval(123)
 * .percentage(123)
 * .build())
 * .description("description")
 * .name("name")
 * .routingConfiguration(List.of(RoutingConfigurationVersionProperty.builder()
 * .stateMachineVersionArn("stateMachineVersionArn")
 * .weight(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html)
 */
@CdkDslMarker
public class CfnStateMachineAliasPropsDsl {
    private val cdkBuilder: CfnStateMachineAliasProps.Builder = CfnStateMachineAliasProps.builder()

    private val _routingConfiguration: MutableList<Any> = mutableListOf()

    /**
     * @param deploymentPreference The settings that enable gradual state machine deployments. These
     *   settings include
     *   [Alarms](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-alarms)
     *   ,
     *   [Interval](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-interval)
     *   ,
     *   [Percentage](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-percentage)
     *   ,
     *   [StateMachineVersionArn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-statemachineversionarn)
     *   , and
     *   [Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-type)
     *   .
     *
     * CloudFormation automatically shifts traffic from the version an alias currently points to, to
     * a new state machine version that you specify.
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     * Based on the type of deployment you want to perform, you can specify one of the following
     * settings:
     * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
     *   minutes between each increment.
     *
     * For example, if you specify the increment percent as `20` with an interval of `600` minutes,
     * this deployment increases traffic by 20 percent every 600 minutes until the new version
     * receives 100 percent of the traffic. This deployment immediately rolls back the new version
     * if any Amazon CloudWatch alarms are triggered.
     * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
     *   CloudFormation monitors the new version and rolls it back automatically to the previous
     *   version if any CloudWatch alarms are triggered.
     * * `CANARY` - Shifts traffic in two increments.
     *
     * In the first increment, a small percentage of traffic, for example, 10 percent is shifted to
     * the new version. In the second increment, before a specified time interval in seconds gets
     * over, the remaining traffic is shifted to the new version. The shift to the new version for
     * the remaining traffic takes place only if no CloudWatch alarms are triggered during the
     * specified time interval.
     */
    public fun deploymentPreference(deploymentPreference: IResolvable) {
        cdkBuilder.deploymentPreference(deploymentPreference)
    }

    /**
     * @param deploymentPreference The settings that enable gradual state machine deployments. These
     *   settings include
     *   [Alarms](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-alarms)
     *   ,
     *   [Interval](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-interval)
     *   ,
     *   [Percentage](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-percentage)
     *   ,
     *   [StateMachineVersionArn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-statemachineversionarn)
     *   , and
     *   [Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-type)
     *   .
     *
     * CloudFormation automatically shifts traffic from the version an alias currently points to, to
     * a new state machine version that you specify.
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     * Based on the type of deployment you want to perform, you can specify one of the following
     * settings:
     * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
     *   minutes between each increment.
     *
     * For example, if you specify the increment percent as `20` with an interval of `600` minutes,
     * this deployment increases traffic by 20 percent every 600 minutes until the new version
     * receives 100 percent of the traffic. This deployment immediately rolls back the new version
     * if any Amazon CloudWatch alarms are triggered.
     * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
     *   CloudFormation monitors the new version and rolls it back automatically to the previous
     *   version if any CloudWatch alarms are triggered.
     * * `CANARY` - Shifts traffic in two increments.
     *
     * In the first increment, a small percentage of traffic, for example, 10 percent is shifted to
     * the new version. In the second increment, before a specified time interval in seconds gets
     * over, the remaining traffic is shifted to the new version. The shift to the new version for
     * the remaining traffic takes place only if no CloudWatch alarms are triggered during the
     * specified time interval.
     */
    public fun deploymentPreference(
        deploymentPreference: CfnStateMachineAlias.DeploymentPreferenceProperty
    ) {
        cdkBuilder.deploymentPreference(deploymentPreference)
    }

    /** @param description An optional description of the state machine alias. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name The name of the state machine alias. If you don't provide a name, it uses an
     *   automatically generated name based on the logical ID.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param routingConfiguration The routing configuration of an alias. Routing configuration
     *   splits
     *   [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     *   requests between one or two versions of the same state machine.
     *
     * Use `RoutingConfiguration` if you want to explicitly set the alias
     * [weights](https://docs.aws.amazon.com/step-functions/latest/apireference/API_RoutingConfigurationListItem.html#StepFunctions-Type-RoutingConfigurationListItem-weight)
     * . Weight is the percentage of traffic you want to route to a state machine version.
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     */
    public fun routingConfiguration(vararg routingConfiguration: Any) {
        _routingConfiguration.addAll(listOf(*routingConfiguration))
    }

    /**
     * @param routingConfiguration The routing configuration of an alias. Routing configuration
     *   splits
     *   [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     *   requests between one or two versions of the same state machine.
     *
     * Use `RoutingConfiguration` if you want to explicitly set the alias
     * [weights](https://docs.aws.amazon.com/step-functions/latest/apireference/API_RoutingConfigurationListItem.html#StepFunctions-Type-RoutingConfigurationListItem-weight)
     * . Weight is the percentage of traffic you want to route to a state machine version.
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     */
    public fun routingConfiguration(routingConfiguration: Collection<Any>) {
        _routingConfiguration.addAll(routingConfiguration)
    }

    /**
     * @param routingConfiguration The routing configuration of an alias. Routing configuration
     *   splits
     *   [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     *   requests between one or two versions of the same state machine.
     *
     * Use `RoutingConfiguration` if you want to explicitly set the alias
     * [weights](https://docs.aws.amazon.com/step-functions/latest/apireference/API_RoutingConfigurationListItem.html#StepFunctions-Type-RoutingConfigurationListItem-weight)
     * . Weight is the percentage of traffic you want to route to a state machine version.
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     */
    public fun routingConfiguration(routingConfiguration: IResolvable) {
        cdkBuilder.routingConfiguration(routingConfiguration)
    }

    public fun build(): CfnStateMachineAliasProps {
        if (_routingConfiguration.isNotEmpty())
            cdkBuilder.routingConfiguration(_routingConfiguration)
        return cdkBuilder.build()
    }
}

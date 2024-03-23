@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a state machine
 * [alias](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-alias.html) . An
 * alias routes traffic to one or two versions of the same state machine.
 *
 * You can create up to 100 aliases for each state machine.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * CfnStateMachineAlias cfnStateMachineAlias = CfnStateMachineAlias.Builder.create(this,
 * "MyCfnStateMachineAlias")
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
public open class CfnStateMachineAlias internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStateMachineAliasProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnStateMachineAliasProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStateMachineAliasProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStateMachineAliasProps(props)
  )

  /**
   * Returns the ARN of the state machine alias.
   *
   * For example, `arn:aws:states:us-east-1:123456789012:stateMachine:myStateMachine:PROD` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The settings that enable gradual state machine deployments.
   */
  public open fun deploymentPreference(): Any? = unwrap(this).getDeploymentPreference()

  /**
   * The settings that enable gradual state machine deployments.
   */
  public open fun deploymentPreference(`value`: IResolvable) {
    unwrap(this).setDeploymentPreference(`value`.let(IResolvable::unwrap))
  }

  /**
   * The settings that enable gradual state machine deployments.
   */
  public open fun deploymentPreference(`value`: DeploymentPreferenceProperty) {
    unwrap(this).setDeploymentPreference(`value`.let(DeploymentPreferenceProperty::unwrap))
  }

  /**
   * The settings that enable gradual state machine deployments.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8f2229c970014eb3d9445f097eb57ea8be893fbe4c782c5e101feade2737fb73")
  public open fun deploymentPreference(`value`: DeploymentPreferenceProperty.Builder.() -> Unit):
      Unit = deploymentPreference(DeploymentPreferenceProperty(`value`))

  /**
   * An optional description of the state machine alias.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description of the state machine alias.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the state machine alias.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the state machine alias.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The routing configuration of an alias.
   */
  public open fun routingConfiguration(): Any? = unwrap(this).getRoutingConfiguration()

  /**
   * The routing configuration of an alias.
   */
  public open fun routingConfiguration(`value`: IResolvable) {
    unwrap(this).setRoutingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The routing configuration of an alias.
   */
  public open fun routingConfiguration(`value`: List<Any>) {
    unwrap(this).setRoutingConfiguration(`value`)
  }

  /**
   * The routing configuration of an alias.
   */
  public open fun routingConfiguration(vararg `value`: Any): Unit =
      routingConfiguration(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.CfnStateMachineAlias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The settings that enable gradual state machine deployments.
     *
     * These settings include
     * [Alarms](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-alarms)
     * ,
     * [Interval](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-interval)
     * ,
     * [Percentage](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-percentage)
     * ,
     * [StateMachineVersionArn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-statemachineversionarn)
     * , and
     * [Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-type)
     * .
     *
     * CloudFormation automatically shifts traffic from the version an alias currently points to, to
     * a new state machine version that you specify.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * Based on the type of deployment you want to perform, you can specify one of the following
     * settings:
     *
     * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
     * minutes between each increment.
     *
     * For example, if you specify the increment percent as `20` with an interval of `600` minutes,
     * this deployment increases traffic by 20 percent every 600 minutes until the new version receives
     * 100 percent of the traffic. This deployment immediately rolls back the new version if any Amazon
     * CloudWatch alarms are triggered.
     *
     * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
     * CloudFormation monitors the new version and rolls it back automatically to the previous version
     * if any CloudWatch alarms are triggered.
     * * `CANARY` - Shifts traffic in two increments.
     *
     * In the first increment, a small percentage of traffic, for example, 10 percent is shifted to
     * the new version. In the second increment, before a specified time interval in seconds gets over,
     * the remaining traffic is shifted to the new version. The shift to the new version for the
     * remaining traffic takes place only if no CloudWatch alarms are triggered during the specified
     * time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-deploymentpreference)
     * @param deploymentPreference The settings that enable gradual state machine deployments. 
     */
    public fun deploymentPreference(deploymentPreference: IResolvable)

    /**
     * The settings that enable gradual state machine deployments.
     *
     * These settings include
     * [Alarms](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-alarms)
     * ,
     * [Interval](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-interval)
     * ,
     * [Percentage](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-percentage)
     * ,
     * [StateMachineVersionArn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-statemachineversionarn)
     * , and
     * [Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-type)
     * .
     *
     * CloudFormation automatically shifts traffic from the version an alias currently points to, to
     * a new state machine version that you specify.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * Based on the type of deployment you want to perform, you can specify one of the following
     * settings:
     *
     * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
     * minutes between each increment.
     *
     * For example, if you specify the increment percent as `20` with an interval of `600` minutes,
     * this deployment increases traffic by 20 percent every 600 minutes until the new version receives
     * 100 percent of the traffic. This deployment immediately rolls back the new version if any Amazon
     * CloudWatch alarms are triggered.
     *
     * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
     * CloudFormation monitors the new version and rolls it back automatically to the previous version
     * if any CloudWatch alarms are triggered.
     * * `CANARY` - Shifts traffic in two increments.
     *
     * In the first increment, a small percentage of traffic, for example, 10 percent is shifted to
     * the new version. In the second increment, before a specified time interval in seconds gets over,
     * the remaining traffic is shifted to the new version. The shift to the new version for the
     * remaining traffic takes place only if no CloudWatch alarms are triggered during the specified
     * time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-deploymentpreference)
     * @param deploymentPreference The settings that enable gradual state machine deployments. 
     */
    public fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty)

    /**
     * The settings that enable gradual state machine deployments.
     *
     * These settings include
     * [Alarms](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-alarms)
     * ,
     * [Interval](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-interval)
     * ,
     * [Percentage](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-percentage)
     * ,
     * [StateMachineVersionArn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-statemachineversionarn)
     * , and
     * [Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-type)
     * .
     *
     * CloudFormation automatically shifts traffic from the version an alias currently points to, to
     * a new state machine version that you specify.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * Based on the type of deployment you want to perform, you can specify one of the following
     * settings:
     *
     * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
     * minutes between each increment.
     *
     * For example, if you specify the increment percent as `20` with an interval of `600` minutes,
     * this deployment increases traffic by 20 percent every 600 minutes until the new version receives
     * 100 percent of the traffic. This deployment immediately rolls back the new version if any Amazon
     * CloudWatch alarms are triggered.
     *
     * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
     * CloudFormation monitors the new version and rolls it back automatically to the previous version
     * if any CloudWatch alarms are triggered.
     * * `CANARY` - Shifts traffic in two increments.
     *
     * In the first increment, a small percentage of traffic, for example, 10 percent is shifted to
     * the new version. In the second increment, before a specified time interval in seconds gets over,
     * the remaining traffic is shifted to the new version. The shift to the new version for the
     * remaining traffic takes place only if no CloudWatch alarms are triggered during the specified
     * time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-deploymentpreference)
     * @param deploymentPreference The settings that enable gradual state machine deployments. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1962753474155368b7bbfd69a608a1d69b2cf283bf9dc71d5338dcc916936569")
    public
        fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty.Builder.() -> Unit)

    /**
     * An optional description of the state machine alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-description)
     * @param description An optional description of the state machine alias. 
     */
    public fun description(description: String)

    /**
     * The name of the state machine alias.
     *
     * If you don't provide a name, it uses an automatically generated name based on the logical ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-name)
     * @param name The name of the state machine alias. 
     */
    public fun name(name: String)

    /**
     * The routing configuration of an alias.
     *
     * Routing configuration splits
     * [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     * requests between one or two versions of the same state machine.
     *
     * Use `RoutingConfiguration` if you want to explicitly set the alias
     * [weights](https://docs.aws.amazon.com/step-functions/latest/apireference/API_RoutingConfigurationListItem.html#StepFunctions-Type-RoutingConfigurationListItem-weight)
     * . Weight is the percentage of traffic you want to route to a state machine version.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-routingconfiguration)
     * @param routingConfiguration The routing configuration of an alias. 
     */
    public fun routingConfiguration(routingConfiguration: IResolvable)

    /**
     * The routing configuration of an alias.
     *
     * Routing configuration splits
     * [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     * requests between one or two versions of the same state machine.
     *
     * Use `RoutingConfiguration` if you want to explicitly set the alias
     * [weights](https://docs.aws.amazon.com/step-functions/latest/apireference/API_RoutingConfigurationListItem.html#StepFunctions-Type-RoutingConfigurationListItem-weight)
     * . Weight is the percentage of traffic you want to route to a state machine version.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-routingconfiguration)
     * @param routingConfiguration The routing configuration of an alias. 
     */
    public fun routingConfiguration(routingConfiguration: List<Any>)

    /**
     * The routing configuration of an alias.
     *
     * Routing configuration splits
     * [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     * requests between one or two versions of the same state machine.
     *
     * Use `RoutingConfiguration` if you want to explicitly set the alias
     * [weights](https://docs.aws.amazon.com/step-functions/latest/apireference/API_RoutingConfigurationListItem.html#StepFunctions-Type-RoutingConfigurationListItem-weight)
     * . Weight is the percentage of traffic you want to route to a state machine version.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-routingconfiguration)
     * @param routingConfiguration The routing configuration of an alias. 
     */
    public fun routingConfiguration(vararg routingConfiguration: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.Builder.create(scope, id)

    /**
     * The settings that enable gradual state machine deployments.
     *
     * These settings include
     * [Alarms](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-alarms)
     * ,
     * [Interval](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-interval)
     * ,
     * [Percentage](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-percentage)
     * ,
     * [StateMachineVersionArn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-statemachineversionarn)
     * , and
     * [Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-type)
     * .
     *
     * CloudFormation automatically shifts traffic from the version an alias currently points to, to
     * a new state machine version that you specify.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * Based on the type of deployment you want to perform, you can specify one of the following
     * settings:
     *
     * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
     * minutes between each increment.
     *
     * For example, if you specify the increment percent as `20` with an interval of `600` minutes,
     * this deployment increases traffic by 20 percent every 600 minutes until the new version receives
     * 100 percent of the traffic. This deployment immediately rolls back the new version if any Amazon
     * CloudWatch alarms are triggered.
     *
     * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
     * CloudFormation monitors the new version and rolls it back automatically to the previous version
     * if any CloudWatch alarms are triggered.
     * * `CANARY` - Shifts traffic in two increments.
     *
     * In the first increment, a small percentage of traffic, for example, 10 percent is shifted to
     * the new version. In the second increment, before a specified time interval in seconds gets over,
     * the remaining traffic is shifted to the new version. The shift to the new version for the
     * remaining traffic takes place only if no CloudWatch alarms are triggered during the specified
     * time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-deploymentpreference)
     * @param deploymentPreference The settings that enable gradual state machine deployments. 
     */
    override fun deploymentPreference(deploymentPreference: IResolvable) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(IResolvable::unwrap))
    }

    /**
     * The settings that enable gradual state machine deployments.
     *
     * These settings include
     * [Alarms](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-alarms)
     * ,
     * [Interval](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-interval)
     * ,
     * [Percentage](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-percentage)
     * ,
     * [StateMachineVersionArn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-statemachineversionarn)
     * , and
     * [Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-type)
     * .
     *
     * CloudFormation automatically shifts traffic from the version an alias currently points to, to
     * a new state machine version that you specify.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * Based on the type of deployment you want to perform, you can specify one of the following
     * settings:
     *
     * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
     * minutes between each increment.
     *
     * For example, if you specify the increment percent as `20` with an interval of `600` minutes,
     * this deployment increases traffic by 20 percent every 600 minutes until the new version receives
     * 100 percent of the traffic. This deployment immediately rolls back the new version if any Amazon
     * CloudWatch alarms are triggered.
     *
     * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
     * CloudFormation monitors the new version and rolls it back automatically to the previous version
     * if any CloudWatch alarms are triggered.
     * * `CANARY` - Shifts traffic in two increments.
     *
     * In the first increment, a small percentage of traffic, for example, 10 percent is shifted to
     * the new version. In the second increment, before a specified time interval in seconds gets over,
     * the remaining traffic is shifted to the new version. The shift to the new version for the
     * remaining traffic takes place only if no CloudWatch alarms are triggered during the specified
     * time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-deploymentpreference)
     * @param deploymentPreference The settings that enable gradual state machine deployments. 
     */
    override fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(DeploymentPreferenceProperty::unwrap))
    }

    /**
     * The settings that enable gradual state machine deployments.
     *
     * These settings include
     * [Alarms](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-alarms)
     * ,
     * [Interval](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-interval)
     * ,
     * [Percentage](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-percentage)
     * ,
     * [StateMachineVersionArn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-statemachineversionarn)
     * , and
     * [Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-type)
     * .
     *
     * CloudFormation automatically shifts traffic from the version an alias currently points to, to
     * a new state machine version that you specify.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * Based on the type of deployment you want to perform, you can specify one of the following
     * settings:
     *
     * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
     * minutes between each increment.
     *
     * For example, if you specify the increment percent as `20` with an interval of `600` minutes,
     * this deployment increases traffic by 20 percent every 600 minutes until the new version receives
     * 100 percent of the traffic. This deployment immediately rolls back the new version if any Amazon
     * CloudWatch alarms are triggered.
     *
     * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
     * CloudFormation monitors the new version and rolls it back automatically to the previous version
     * if any CloudWatch alarms are triggered.
     * * `CANARY` - Shifts traffic in two increments.
     *
     * In the first increment, a small percentage of traffic, for example, 10 percent is shifted to
     * the new version. In the second increment, before a specified time interval in seconds gets over,
     * the remaining traffic is shifted to the new version. The shift to the new version for the
     * remaining traffic takes place only if no CloudWatch alarms are triggered during the specified
     * time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-deploymentpreference)
     * @param deploymentPreference The settings that enable gradual state machine deployments. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1962753474155368b7bbfd69a608a1d69b2cf283bf9dc71d5338dcc916936569")
    override
        fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty.Builder.() -> Unit):
        Unit = deploymentPreference(DeploymentPreferenceProperty(deploymentPreference))

    /**
     * An optional description of the state machine alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-description)
     * @param description An optional description of the state machine alias. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the state machine alias.
     *
     * If you don't provide a name, it uses an automatically generated name based on the logical ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-name)
     * @param name The name of the state machine alias. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The routing configuration of an alias.
     *
     * Routing configuration splits
     * [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     * requests between one or two versions of the same state machine.
     *
     * Use `RoutingConfiguration` if you want to explicitly set the alias
     * [weights](https://docs.aws.amazon.com/step-functions/latest/apireference/API_RoutingConfigurationListItem.html#StepFunctions-Type-RoutingConfigurationListItem-weight)
     * . Weight is the percentage of traffic you want to route to a state machine version.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-routingconfiguration)
     * @param routingConfiguration The routing configuration of an alias. 
     */
    override fun routingConfiguration(routingConfiguration: IResolvable) {
      cdkBuilder.routingConfiguration(routingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The routing configuration of an alias.
     *
     * Routing configuration splits
     * [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     * requests between one or two versions of the same state machine.
     *
     * Use `RoutingConfiguration` if you want to explicitly set the alias
     * [weights](https://docs.aws.amazon.com/step-functions/latest/apireference/API_RoutingConfigurationListItem.html#StepFunctions-Type-RoutingConfigurationListItem-weight)
     * . Weight is the percentage of traffic you want to route to a state machine version.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-routingconfiguration)
     * @param routingConfiguration The routing configuration of an alias. 
     */
    override fun routingConfiguration(routingConfiguration: List<Any>) {
      cdkBuilder.routingConfiguration(routingConfiguration)
    }

    /**
     * The routing configuration of an alias.
     *
     * Routing configuration splits
     * [StartExecution](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)
     * requests between one or two versions of the same state machine.
     *
     * Use `RoutingConfiguration` if you want to explicitly set the alias
     * [weights](https://docs.aws.amazon.com/step-functions/latest/apireference/API_RoutingConfigurationListItem.html#StepFunctions-Type-RoutingConfigurationListItem-weight)
     * . Weight is the percentage of traffic you want to route to a state machine version.
     *
     *
     * `RoutingConfiguration` and `DeploymentPreference` are mutually exclusive properties. You must
     * define only one of these properties.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachinealias.html#cfn-stepfunctions-statemachinealias-routingconfiguration)
     * @param routingConfiguration The routing configuration of an alias. 
     */
    override fun routingConfiguration(vararg routingConfiguration: Any): Unit =
        routingConfiguration(routingConfiguration.toList())

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStateMachineAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStateMachineAlias(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias):
        CfnStateMachineAlias = CfnStateMachineAlias(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachineAlias):
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias = wrapped.cdkObject
  }

  /**
   * Enables gradual state machine deployments.
   *
   * CloudFormation automatically shifts traffic from the version the alias currently points to, to
   * a new state machine version that you specify.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
   * DeploymentPreferenceProperty deploymentPreferenceProperty =
   * DeploymentPreferenceProperty.builder()
   * .stateMachineVersionArn("stateMachineVersionArn")
   * .type("type")
   * // the properties below are optional
   * .alarms(List.of("alarms"))
   * .interval(123)
   * .percentage(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html)
   */
  public interface DeploymentPreferenceProperty {
    /**
     * A list of Amazon CloudWatch alarms to be monitored during the deployment.
     *
     * The deployment fails and rolls back if any of these alarms go into the `ALARM` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-alarms)
     */
    public fun alarms(): List<String> = unwrap(this).getAlarms() ?: emptyList()

    /**
     * The time in minutes between each traffic shifting increment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-interval)
     */
    public fun interval(): Number? = unwrap(this).getInterval()

    /**
     * The percentage of traffic to shift to the new version in each increment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-percentage)
     */
    public fun percentage(): Number? = unwrap(this).getPercentage()

    /**
     * The Amazon Resource Name (ARN) of the
     * [`AWS::StepFunctions::StateMachineVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html)
     * resource that will be the final version to which the alias points to when the traffic shifting
     * is complete.
     *
     * While performing gradual deployments, you can only provide a single state machine version
     * ARN. To explicitly set version weights in a CloudFormation template, use `RoutingConfiguration`
     * instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-statemachineversionarn)
     */
    public fun stateMachineVersionArn(): String

    /**
     * The type of deployment you want to perform. You can specify one of the following types:.
     *
     * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
     * minutes between each increment.
     *
     * For example, if you specify the increment percent as `20` with an interval of `600` minutes,
     * this deployment increases traffic by 20 percent every 600 minutes until the new version receives
     * 100 percent of the traffic. This deployment immediately rolls back the new version if any
     * CloudWatch alarms are triggered.
     *
     * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
     * CloudFormation monitors the new version and rolls it back automatically to the previous version
     * if any CloudWatch alarms are triggered.
     * * `CANARY` - Shifts traffic in two increments.
     *
     * In the first increment, a small percentage of traffic, for example, 10 percent is shifted to
     * the new version. In the second increment, before a specified time interval in seconds gets over,
     * the remaining traffic is shifted to the new version. The shift to the new version for the
     * remaining traffic takes place only if no CloudWatch alarms are triggered during the specified
     * time interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-type)
     */
    public fun type(): String

    /**
     * A builder for [DeploymentPreferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarms A list of Amazon CloudWatch alarms to be monitored during the deployment.
       * The deployment fails and rolls back if any of these alarms go into the `ALARM` state.
       */
      public fun alarms(alarms: List<String>)

      /**
       * @param alarms A list of Amazon CloudWatch alarms to be monitored during the deployment.
       * The deployment fails and rolls back if any of these alarms go into the `ALARM` state.
       */
      public fun alarms(vararg alarms: String)

      /**
       * @param interval The time in minutes between each traffic shifting increment.
       */
      public fun interval(interval: Number)

      /**
       * @param percentage The percentage of traffic to shift to the new version in each increment.
       */
      public fun percentage(percentage: Number)

      /**
       * @param stateMachineVersionArn The Amazon Resource Name (ARN) of the
       * [`AWS::StepFunctions::StateMachineVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html)
       * resource that will be the final version to which the alias points to when the traffic shifting
       * is complete. 
       * While performing gradual deployments, you can only provide a single state machine version
       * ARN. To explicitly set version weights in a CloudFormation template, use
       * `RoutingConfiguration` instead.
       */
      public fun stateMachineVersionArn(stateMachineVersionArn: String)

      /**
       * @param type The type of deployment you want to perform. You can specify one of the
       * following types:. 
       * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
       * minutes between each increment.
       *
       * For example, if you specify the increment percent as `20` with an interval of `600`
       * minutes, this deployment increases traffic by 20 percent every 600 minutes until the new
       * version receives 100 percent of the traffic. This deployment immediately rolls back the new
       * version if any CloudWatch alarms are triggered.
       *
       * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
       * CloudFormation monitors the new version and rolls it back automatically to the previous
       * version if any CloudWatch alarms are triggered.
       * * `CANARY` - Shifts traffic in two increments.
       *
       * In the first increment, a small percentage of traffic, for example, 10 percent is shifted
       * to the new version. In the second increment, before a specified time interval in seconds gets
       * over, the remaining traffic is shifted to the new version. The shift to the new version for
       * the remaining traffic takes place only if no CloudWatch alarms are triggered during the
       * specified time interval.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty.builder()

      /**
       * @param alarms A list of Amazon CloudWatch alarms to be monitored during the deployment.
       * The deployment fails and rolls back if any of these alarms go into the `ALARM` state.
       */
      override fun alarms(alarms: List<String>) {
        cdkBuilder.alarms(alarms)
      }

      /**
       * @param alarms A list of Amazon CloudWatch alarms to be monitored during the deployment.
       * The deployment fails and rolls back if any of these alarms go into the `ALARM` state.
       */
      override fun alarms(vararg alarms: String): Unit = alarms(alarms.toList())

      /**
       * @param interval The time in minutes between each traffic shifting increment.
       */
      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param percentage The percentage of traffic to shift to the new version in each increment.
       */
      override fun percentage(percentage: Number) {
        cdkBuilder.percentage(percentage)
      }

      /**
       * @param stateMachineVersionArn The Amazon Resource Name (ARN) of the
       * [`AWS::StepFunctions::StateMachineVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html)
       * resource that will be the final version to which the alias points to when the traffic shifting
       * is complete. 
       * While performing gradual deployments, you can only provide a single state machine version
       * ARN. To explicitly set version weights in a CloudFormation template, use
       * `RoutingConfiguration` instead.
       */
      override fun stateMachineVersionArn(stateMachineVersionArn: String) {
        cdkBuilder.stateMachineVersionArn(stateMachineVersionArn)
      }

      /**
       * @param type The type of deployment you want to perform. You can specify one of the
       * following types:. 
       * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
       * minutes between each increment.
       *
       * For example, if you specify the increment percent as `20` with an interval of `600`
       * minutes, this deployment increases traffic by 20 percent every 600 minutes until the new
       * version receives 100 percent of the traffic. This deployment immediately rolls back the new
       * version if any CloudWatch alarms are triggered.
       *
       * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
       * CloudFormation monitors the new version and rolls it back automatically to the previous
       * version if any CloudWatch alarms are triggered.
       * * `CANARY` - Shifts traffic in two increments.
       *
       * In the first increment, a small percentage of traffic, for example, 10 percent is shifted
       * to the new version. In the second increment, before a specified time interval in seconds gets
       * over, the remaining traffic is shifted to the new version. The shift to the new version for
       * the remaining traffic takes place only if no CloudWatch alarms are triggered during the
       * specified time interval.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty,
    ) : CdkObject(cdkObject), DeploymentPreferenceProperty {
      /**
       * A list of Amazon CloudWatch alarms to be monitored during the deployment.
       *
       * The deployment fails and rolls back if any of these alarms go into the `ALARM` state.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-alarms)
       */
      override fun alarms(): List<String> = unwrap(this).getAlarms() ?: emptyList()

      /**
       * The time in minutes between each traffic shifting increment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-interval)
       */
      override fun interval(): Number? = unwrap(this).getInterval()

      /**
       * The percentage of traffic to shift to the new version in each increment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-percentage)
       */
      override fun percentage(): Number? = unwrap(this).getPercentage()

      /**
       * The Amazon Resource Name (ARN) of the
       * [`AWS::StepFunctions::StateMachineVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html)
       * resource that will be the final version to which the alias points to when the traffic shifting
       * is complete.
       *
       * While performing gradual deployments, you can only provide a single state machine version
       * ARN. To explicitly set version weights in a CloudFormation template, use
       * `RoutingConfiguration` instead.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-statemachineversionarn)
       */
      override fun stateMachineVersionArn(): String = unwrap(this).getStateMachineVersionArn()

      /**
       * The type of deployment you want to perform. You can specify one of the following types:.
       *
       * * `LINEAR` - Shifts traffic to the new version in equal increments with an equal number of
       * minutes between each increment.
       *
       * For example, if you specify the increment percent as `20` with an interval of `600`
       * minutes, this deployment increases traffic by 20 percent every 600 minutes until the new
       * version receives 100 percent of the traffic. This deployment immediately rolls back the new
       * version if any CloudWatch alarms are triggered.
       *
       * * `ALL_AT_ONCE` - Shifts 100 percent of traffic to the new version immediately.
       * CloudFormation monitors the new version and rolls it back automatically to the previous
       * version if any CloudWatch alarms are triggered.
       * * `CANARY` - Shifts traffic in two increments.
       *
       * In the first increment, a small percentage of traffic, for example, 10 percent is shifted
       * to the new version. In the second increment, before a specified time interval in seconds gets
       * over, the remaining traffic is shifted to the new version. The shift to the new version for
       * the remaining traffic takes place only if no CloudWatch alarms are triggered during the
       * specified time interval.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-deploymentpreference.html#cfn-stepfunctions-statemachinealias-deploymentpreference-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentPreferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty):
          DeploymentPreferenceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentPreferenceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentPreferenceProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.DeploymentPreferenceProperty
    }
  }

  /**
   * The state machine version to which you want to route the execution traffic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
   * RoutingConfigurationVersionProperty routingConfigurationVersionProperty =
   * RoutingConfigurationVersionProperty.builder()
   * .stateMachineVersionArn("stateMachineVersionArn")
   * .weight(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-routingconfigurationversion.html)
   */
  public interface RoutingConfigurationVersionProperty {
    /**
     * The Amazon Resource Name (ARN) that identifies one or two state machine versions defined in
     * the routing configuration.
     *
     * If you specify the ARN of a second version, it must belong to the same state machine as the
     * first version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-routingconfigurationversion.html#cfn-stepfunctions-statemachinealias-routingconfigurationversion-statemachineversionarn)
     */
    public fun stateMachineVersionArn(): String

    /**
     * The percentage of traffic you want to route to the state machine version.
     *
     * The sum of the weights in the routing configuration must be equal to 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-routingconfigurationversion.html#cfn-stepfunctions-statemachinealias-routingconfigurationversion-weight)
     */
    public fun weight(): Number

    /**
     * A builder for [RoutingConfigurationVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param stateMachineVersionArn The Amazon Resource Name (ARN) that identifies one or two
       * state machine versions defined in the routing configuration. 
       * If you specify the ARN of a second version, it must belong to the same state machine as the
       * first version.
       */
      public fun stateMachineVersionArn(stateMachineVersionArn: String)

      /**
       * @param weight The percentage of traffic you want to route to the state machine version. 
       * The sum of the weights in the routing configuration must be equal to 100.
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty.builder()

      /**
       * @param stateMachineVersionArn The Amazon Resource Name (ARN) that identifies one or two
       * state machine versions defined in the routing configuration. 
       * If you specify the ARN of a second version, it must belong to the same state machine as the
       * first version.
       */
      override fun stateMachineVersionArn(stateMachineVersionArn: String) {
        cdkBuilder.stateMachineVersionArn(stateMachineVersionArn)
      }

      /**
       * @param weight The percentage of traffic you want to route to the state machine version. 
       * The sum of the weights in the routing configuration must be equal to 100.
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty,
    ) : CdkObject(cdkObject), RoutingConfigurationVersionProperty {
      /**
       * The Amazon Resource Name (ARN) that identifies one or two state machine versions defined in
       * the routing configuration.
       *
       * If you specify the ARN of a second version, it must belong to the same state machine as the
       * first version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-routingconfigurationversion.html#cfn-stepfunctions-statemachinealias-routingconfigurationversion-statemachineversionarn)
       */
      override fun stateMachineVersionArn(): String = unwrap(this).getStateMachineVersionArn()

      /**
       * The percentage of traffic you want to route to the state machine version.
       *
       * The sum of the weights in the routing configuration must be equal to 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachinealias-routingconfigurationversion.html#cfn-stepfunctions-statemachinealias-routingconfigurationversion-weight)
       */
      override fun weight(): Number = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RoutingConfigurationVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty):
          RoutingConfigurationVersionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RoutingConfigurationVersionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingConfigurationVersionProperty):
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias.RoutingConfigurationVersionProperty
    }
  }
}

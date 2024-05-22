@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Initialization properties for the `Provider` construct.
 *
 * Example:
 *
 * ```
 * Function onEvent;
 * Function isComplete;
 * Role myRole;
 * Provider myProvider = Provider.Builder.create(this, "MyProvider")
 * .onEventHandler(onEvent)
 * .isCompleteHandler(isComplete)
 * .logGroup(LogGroup.Builder.create(this, "MyProviderLogs")
 * .retention(RetentionDays.ONE_DAY)
 * .build())
 * .role(myRole)
 * .providerFunctionName("the-lambda-name")
 * .build();
 * ```
 */
public interface ProviderProps {
  /**
   * Whether logging for the waiter state machine is disabled.
   *
   * Default: - false
   */
  public fun disableWaiterStateMachineLogging(): Boolean? =
      unwrap(this).getDisableWaiterStateMachineLogging()

  /**
   * The AWS Lambda function to invoke in order to determine if the operation is complete.
   *
   * This function will be called immediately after `onEvent` and then
   * periodically based on the configured query interval as long as it returns
   * `false`. If the function still returns `false` and the alloted timeout has
   * passed, the operation will fail.
   *
   * Default: - provider is synchronous. This means that the `onEvent` handler
   * is expected to finish all lifecycle operations within the initial invocation.
   */
  public fun isCompleteHandler(): IFunction? =
      unwrap(this).getIsCompleteHandler()?.let(IFunction::wrap)

  /**
   * The Log Group used for logging of events emitted by the custom resource's lambda function.
   *
   * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
   * If you are deploying to another type of region, please check regional availability first.
   *
   * Default: - a default log group created by AWS Lambda
   */
  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * The number of days framework log events are kept in CloudWatch Logs.
   *
   * When
   * updating this property, unsetting it doesn't remove the log retention policy.
   * To remove the retention policy, set the value to `INFINITE`.
   *
   * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
   * `logGroup` allows you to create a fully customizable log group and instruct the Lambda function
   * to send logs to it.
   *
   * Default: logs.RetentionDays.INFINITE
   */
  public fun logRetention(): RetentionDays? =
      unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

  /**
   * The AWS Lambda function to invoke for all resource lifecycle operations (CREATE/UPDATE/DELETE).
   *
   * This function is responsible to begin the requested resource operation
   * (CREATE/UPDATE/DELETE) and return any additional properties to add to the
   * event, which will later be passed to `isComplete`. The `PhysicalResourceId`
   * property must be included in the response.
   */
  public fun onEventHandler(): IFunction

  /**
   * AWS KMS key used to encrypt provider lambda's environment variables.
   *
   * Default: -  AWS Lambda creates and uses an AWS managed customer master key (CMK)
   */
  public fun providerFunctionEnvEncryption(): IKey? =
      unwrap(this).getProviderFunctionEnvEncryption()?.let(IKey::wrap)

  /**
   * Provider Lambda name.
   *
   * The provider lambda function name.
   *
   * Default: -  CloudFormation default name from unique physical ID
   */
  public fun providerFunctionName(): String? = unwrap(this).getProviderFunctionName()

  /**
   * Time between calls to the `isComplete` handler which determines if the resource has been
   * stabilized.
   *
   * The first `isComplete` will be called immediately after `handler` and then
   * every `queryInterval` seconds, and until `timeout` has been reached or until
   * `isComplete` returns `true`.
   *
   * Default: Duration.seconds(5)
   */
  public fun queryInterval(): Duration? = unwrap(this).getQueryInterval()?.let(Duration::wrap)

  /**
   * AWS Lambda execution role.
   *
   * The role that will be assumed by the AWS Lambda.
   * Must be assumable by the 'lambda.amazonaws.com' service principal.
   *
   * Default: - A default role will be created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Security groups to attach to the provider functions.
   *
   * Only used if 'vpc' is supplied
   *
   * Default: - If `vpc` is not supplied, no security groups are attached. Otherwise, a dedicated
   * security
   * group is created for each function.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * Total timeout for the entire operation.
   *
   * The maximum timeout is 1 hour (yes, it can exceed the AWS Lambda 15 minutes)
   *
   * Default: Duration.minutes(30)
   */
  public fun totalTimeout(): Duration? = unwrap(this).getTotalTimeout()?.let(Duration::wrap)

  /**
   * The vpc to provision the lambda functions in.
   *
   * Default: - functions are not provisioned inside a vpc.
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * Which subnets from the VPC to place the lambda functions in.
   *
   * Only used if 'vpc' is supplied. Note: internet access for Lambdas
   * requires a NAT gateway, so picking Public subnets is not allowed.
   *
   * Default: - the Vpc default strategy if not specified
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * Defines what execution history events of the waiter state machine are logged and where they are
   * logged.
   *
   * Default: - A default log group will be created if logging for the waiter state machine is
   * enabled.
   */
  public fun waiterStateMachineLogOptions(): LogOptions? =
      unwrap(this).getWaiterStateMachineLogOptions()?.let(LogOptions::wrap)

  /**
   * A builder for [ProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param disableWaiterStateMachineLogging Whether logging for the waiter state machine is
     * disabled.
     */
    public fun disableWaiterStateMachineLogging(disableWaiterStateMachineLogging: Boolean)

    /**
     * @param isCompleteHandler The AWS Lambda function to invoke in order to determine if the
     * operation is complete.
     * This function will be called immediately after `onEvent` and then
     * periodically based on the configured query interval as long as it returns
     * `false`. If the function still returns `false` and the alloted timeout has
     * passed, the operation will fail.
     */
    public fun isCompleteHandler(isCompleteHandler: IFunction)

    /**
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function.
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param logRetention The number of days framework log events are kept in CloudWatch Logs.
     * When
     * updating this property, unsetting it doesn't remove the log retention policy.
     * To remove the retention policy, set the value to `INFINITE`.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * @param onEventHandler The AWS Lambda function to invoke for all resource lifecycle operations
     * (CREATE/UPDATE/DELETE). 
     * This function is responsible to begin the requested resource operation
     * (CREATE/UPDATE/DELETE) and return any additional properties to add to the
     * event, which will later be passed to `isComplete`. The `PhysicalResourceId`
     * property must be included in the response.
     */
    public fun onEventHandler(onEventHandler: IFunction)

    /**
     * @param providerFunctionEnvEncryption AWS KMS key used to encrypt provider lambda's
     * environment variables.
     */
    public fun providerFunctionEnvEncryption(providerFunctionEnvEncryption: IKey)

    /**
     * @param providerFunctionName Provider Lambda name.
     * The provider lambda function name.
     */
    public fun providerFunctionName(providerFunctionName: String)

    /**
     * @param queryInterval Time between calls to the `isComplete` handler which determines if the
     * resource has been stabilized.
     * The first `isComplete` will be called immediately after `handler` and then
     * every `queryInterval` seconds, and until `timeout` has been reached or until
     * `isComplete` returns `true`.
     */
    public fun queryInterval(queryInterval: Duration)

    /**
     * @param role AWS Lambda execution role.
     * The role that will be assumed by the AWS Lambda.
     * Must be assumable by the 'lambda.amazonaws.com' service principal.
     */
    public fun role(role: IRole)

    /**
     * @param securityGroups Security groups to attach to the provider functions.
     * Only used if 'vpc' is supplied
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Security groups to attach to the provider functions.
     * Only used if 'vpc' is supplied
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param totalTimeout Total timeout for the entire operation.
     * The maximum timeout is 1 hour (yes, it can exceed the AWS Lambda 15 minutes)
     */
    public fun totalTimeout(totalTimeout: Duration)

    /**
     * @param vpc The vpc to provision the lambda functions in.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c9969f7250ffe8bee78b1148f2db9967d4a930cea26f58371093c920fe06b0")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    /**
     * @param waiterStateMachineLogOptions Defines what execution history events of the waiter state
     * machine are logged and where they are logged.
     */
    public fun waiterStateMachineLogOptions(waiterStateMachineLogOptions: LogOptions)

    /**
     * @param waiterStateMachineLogOptions Defines what execution history events of the waiter state
     * machine are logged and where they are logged.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c647cf0aa085a82e42fa8bc2a90d827e8bc491c7057bf86e5287a9634946e94")
    public
        fun waiterStateMachineLogOptions(waiterStateMachineLogOptions: LogOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.ProviderProps.Builder =
        software.amazon.awscdk.customresources.ProviderProps.builder()

    /**
     * @param disableWaiterStateMachineLogging Whether logging for the waiter state machine is
     * disabled.
     */
    override fun disableWaiterStateMachineLogging(disableWaiterStateMachineLogging: Boolean) {
      cdkBuilder.disableWaiterStateMachineLogging(disableWaiterStateMachineLogging)
    }

    /**
     * @param isCompleteHandler The AWS Lambda function to invoke in order to determine if the
     * operation is complete.
     * This function will be called immediately after `onEvent` and then
     * periodically based on the configured query interval as long as it returns
     * `false`. If the function still returns `false` and the alloted timeout has
     * passed, the operation will fail.
     */
    override fun isCompleteHandler(isCompleteHandler: IFunction) {
      cdkBuilder.isCompleteHandler(isCompleteHandler.let(IFunction.Companion::unwrap))
    }

    /**
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function.
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup.Companion::unwrap))
    }

    /**
     * @param logRetention The number of days framework log events are kept in CloudWatch Logs.
     * When
     * updating this property, unsetting it doesn't remove the log retention policy.
     * To remove the retention policy, set the value to `INFINITE`.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays.Companion::unwrap))
    }

    /**
     * @param onEventHandler The AWS Lambda function to invoke for all resource lifecycle operations
     * (CREATE/UPDATE/DELETE). 
     * This function is responsible to begin the requested resource operation
     * (CREATE/UPDATE/DELETE) and return any additional properties to add to the
     * event, which will later be passed to `isComplete`. The `PhysicalResourceId`
     * property must be included in the response.
     */
    override fun onEventHandler(onEventHandler: IFunction) {
      cdkBuilder.onEventHandler(onEventHandler.let(IFunction.Companion::unwrap))
    }

    /**
     * @param providerFunctionEnvEncryption AWS KMS key used to encrypt provider lambda's
     * environment variables.
     */
    override fun providerFunctionEnvEncryption(providerFunctionEnvEncryption: IKey) {
      cdkBuilder.providerFunctionEnvEncryption(providerFunctionEnvEncryption.let(IKey.Companion::unwrap))
    }

    /**
     * @param providerFunctionName Provider Lambda name.
     * The provider lambda function name.
     */
    override fun providerFunctionName(providerFunctionName: String) {
      cdkBuilder.providerFunctionName(providerFunctionName)
    }

    /**
     * @param queryInterval Time between calls to the `isComplete` handler which determines if the
     * resource has been stabilized.
     * The first `isComplete` will be called immediately after `handler` and then
     * every `queryInterval` seconds, and until `timeout` has been reached or until
     * `isComplete` returns `true`.
     */
    override fun queryInterval(queryInterval: Duration) {
      cdkBuilder.queryInterval(queryInterval.let(Duration.Companion::unwrap))
    }

    /**
     * @param role AWS Lambda execution role.
     * The role that will be assumed by the AWS Lambda.
     * Must be assumable by the 'lambda.amazonaws.com' service principal.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param securityGroups Security groups to attach to the provider functions.
     * Only used if 'vpc' is supplied
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups Security groups to attach to the provider functions.
     * Only used if 'vpc' is supplied
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param totalTimeout Total timeout for the entire operation.
     * The maximum timeout is 1 hour (yes, it can exceed the AWS Lambda 15 minutes)
     */
    override fun totalTimeout(totalTimeout: Duration) {
      cdkBuilder.totalTimeout(totalTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param vpc The vpc to provision the lambda functions in.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c9969f7250ffe8bee78b1148f2db9967d4a930cea26f58371093c920fe06b0")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    /**
     * @param waiterStateMachineLogOptions Defines what execution history events of the waiter state
     * machine are logged and where they are logged.
     */
    override fun waiterStateMachineLogOptions(waiterStateMachineLogOptions: LogOptions) {
      cdkBuilder.waiterStateMachineLogOptions(waiterStateMachineLogOptions.let(LogOptions.Companion::unwrap))
    }

    /**
     * @param waiterStateMachineLogOptions Defines what execution history events of the waiter state
     * machine are logged and where they are logged.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c647cf0aa085a82e42fa8bc2a90d827e8bc491c7057bf86e5287a9634946e94")
    override
        fun waiterStateMachineLogOptions(waiterStateMachineLogOptions: LogOptions.Builder.() -> Unit):
        Unit = waiterStateMachineLogOptions(LogOptions(waiterStateMachineLogOptions))

    public fun build(): software.amazon.awscdk.customresources.ProviderProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.customresources.ProviderProps,
  ) : CdkObject(cdkObject), ProviderProps {
    /**
     * Whether logging for the waiter state machine is disabled.
     *
     * Default: - false
     */
    override fun disableWaiterStateMachineLogging(): Boolean? =
        unwrap(this).getDisableWaiterStateMachineLogging()

    /**
     * The AWS Lambda function to invoke in order to determine if the operation is complete.
     *
     * This function will be called immediately after `onEvent` and then
     * periodically based on the configured query interval as long as it returns
     * `false`. If the function still returns `false` and the alloted timeout has
     * passed, the operation will fail.
     *
     * Default: - provider is synchronous. This means that the `onEvent` handler
     * is expected to finish all lifecycle operations within the initial invocation.
     */
    override fun isCompleteHandler(): IFunction? =
        unwrap(this).getIsCompleteHandler()?.let(IFunction::wrap)

    /**
     * The Log Group used for logging of events emitted by the custom resource's lambda function.
     *
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     *
     * Default: - a default log group created by AWS Lambda
     */
    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    /**
     * The number of days framework log events are kept in CloudWatch Logs.
     *
     * When
     * updating this property, unsetting it doesn't remove the log retention policy.
     * To remove the retention policy, set the value to `INFINITE`.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: logs.RetentionDays.INFINITE
     */
    override fun logRetention(): RetentionDays? =
        unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

    /**
     * The AWS Lambda function to invoke for all resource lifecycle operations
     * (CREATE/UPDATE/DELETE).
     *
     * This function is responsible to begin the requested resource operation
     * (CREATE/UPDATE/DELETE) and return any additional properties to add to the
     * event, which will later be passed to `isComplete`. The `PhysicalResourceId`
     * property must be included in the response.
     */
    override fun onEventHandler(): IFunction = unwrap(this).getOnEventHandler().let(IFunction::wrap)

    /**
     * AWS KMS key used to encrypt provider lambda's environment variables.
     *
     * Default: -  AWS Lambda creates and uses an AWS managed customer master key (CMK)
     */
    override fun providerFunctionEnvEncryption(): IKey? =
        unwrap(this).getProviderFunctionEnvEncryption()?.let(IKey::wrap)

    /**
     * Provider Lambda name.
     *
     * The provider lambda function name.
     *
     * Default: -  CloudFormation default name from unique physical ID
     */
    override fun providerFunctionName(): String? = unwrap(this).getProviderFunctionName()

    /**
     * Time between calls to the `isComplete` handler which determines if the resource has been
     * stabilized.
     *
     * The first `isComplete` will be called immediately after `handler` and then
     * every `queryInterval` seconds, and until `timeout` has been reached or until
     * `isComplete` returns `true`.
     *
     * Default: Duration.seconds(5)
     */
    override fun queryInterval(): Duration? = unwrap(this).getQueryInterval()?.let(Duration::wrap)

    /**
     * AWS Lambda execution role.
     *
     * The role that will be assumed by the AWS Lambda.
     * Must be assumable by the 'lambda.amazonaws.com' service principal.
     *
     * Default: - A default role will be created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Security groups to attach to the provider functions.
     *
     * Only used if 'vpc' is supplied
     *
     * Default: - If `vpc` is not supplied, no security groups are attached. Otherwise, a dedicated
     * security
     * group is created for each function.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Total timeout for the entire operation.
     *
     * The maximum timeout is 1 hour (yes, it can exceed the AWS Lambda 15 minutes)
     *
     * Default: Duration.minutes(30)
     */
    override fun totalTimeout(): Duration? = unwrap(this).getTotalTimeout()?.let(Duration::wrap)

    /**
     * The vpc to provision the lambda functions in.
     *
     * Default: - functions are not provisioned inside a vpc.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * Which subnets from the VPC to place the lambda functions in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

    /**
     * Defines what execution history events of the waiter state machine are logged and where they
     * are logged.
     *
     * Default: - A default log group will be created if logging for the waiter state machine is
     * enabled.
     */
    override fun waiterStateMachineLogOptions(): LogOptions? =
        unwrap(this).getWaiterStateMachineLogOptions()?.let(LogOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.ProviderProps):
        ProviderProps = CdkObjectWrappers.wrap(cdkObject) as? ProviderProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProviderProps):
        software.amazon.awscdk.customresources.ProviderProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.customresources.ProviderProps
  }
}

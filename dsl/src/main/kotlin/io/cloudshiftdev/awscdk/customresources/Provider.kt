package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Provider internal constructor(
  internal override val cdkObject: software.amazon.awscdk.customresources.Provider,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  /**
   * The user-defined AWS Lambda function which is invoked asynchronously in order to determine if
   * the operation is complete.
   */
  public open fun isCompleteHandler(): IFunction? =
      unwrap(this).getIsCompleteHandler()?.let(IFunction::wrap)

  /**
   * The user-defined AWS Lambda function which is invoked for all resource lifecycle operations
   * (CREATE/UPDATE/DELETE).
   */
  public open fun onEventHandler(): IFunction =
      unwrap(this).getOnEventHandler().let(IFunction::wrap)

  /**
   * The service token to use in order to define custom resources that are backed by this provider.
   */
  public open fun serviceToken(): String = unwrap(this).getServiceToken()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.customresources.Provider].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param isCompleteHandler The AWS Lambda function to invoke in order to determine if the
     * operation is complete. 
     */
    public fun isCompleteHandler(isCompleteHandler: IFunction)

    /**
     * The Log Group used for logging of events emitted by the custom resource's lambda function.
     *
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     *
     * Default: - a default log group created by AWS Lambda
     *
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function. 
     */
    public fun logGroup(logGroup: ILogGroup)

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
     *
     * @param logRetention The number of days framework log events are kept in CloudWatch Logs. 
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * The AWS Lambda function to invoke for all resource lifecycle operations
     * (CREATE/UPDATE/DELETE).
     *
     * This function is responsible to begin the requested resource operation
     * (CREATE/UPDATE/DELETE) and return any additional properties to add to the
     * event, which will later be passed to `isComplete`. The `PhysicalResourceId`
     * property must be included in the response.
     *
     * @param onEventHandler The AWS Lambda function to invoke for all resource lifecycle operations
     * (CREATE/UPDATE/DELETE). 
     */
    public fun onEventHandler(onEventHandler: IFunction)

    /**
     * AWS KMS key used to encrypt provider lambda's environment variables.
     *
     * Default: -  AWS Lambda creates and uses an AWS managed customer master key (CMK)
     *
     * @param providerFunctionEnvEncryption AWS KMS key used to encrypt provider lambda's
     * environment variables. 
     */
    public fun providerFunctionEnvEncryption(providerFunctionEnvEncryption: IKey)

    /**
     * Provider Lambda name.
     *
     * The provider lambda function name.
     *
     * Default: -  CloudFormation default name from unique physical ID
     *
     * @param providerFunctionName Provider Lambda name. 
     */
    public fun providerFunctionName(providerFunctionName: String)

    /**
     * Time between calls to the `isComplete` handler which determines if the resource has been
     * stabilized.
     *
     * The first `isComplete` will be called immediately after `handler` and then
     * every `queryInterval` seconds, and until `timeout` has been reached or until
     * `isComplete` returns `true`.
     *
     * Default: Duration.seconds(5)
     *
     * @param queryInterval Time between calls to the `isComplete` handler which determines if the
     * resource has been stabilized. 
     */
    public fun queryInterval(queryInterval: Duration)

    /**
     * AWS Lambda execution role.
     *
     * The role that will be assumed by the AWS Lambda.
     * Must be assumable by the 'lambda.amazonaws.com' service principal.
     *
     * Default: - A default role will be created.
     *
     * @param role AWS Lambda execution role. 
     */
    public fun role(role: IRole)

    /**
     * Security groups to attach to the provider functions.
     *
     * Only used if 'vpc' is supplied
     *
     * Default: - If `vpc` is not supplied, no security groups are attached. Otherwise, a dedicated
     * security
     * group is created for each function.
     *
     * @param securityGroups Security groups to attach to the provider functions. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * Security groups to attach to the provider functions.
     *
     * Only used if 'vpc' is supplied
     *
     * Default: - If `vpc` is not supplied, no security groups are attached. Otherwise, a dedicated
     * security
     * group is created for each function.
     *
     * @param securityGroups Security groups to attach to the provider functions. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * Total timeout for the entire operation.
     *
     * The maximum timeout is 1 hour (yes, it can exceed the AWS Lambda 15 minutes)
     *
     * Default: Duration.minutes(30)
     *
     * @param totalTimeout Total timeout for the entire operation. 
     */
    public fun totalTimeout(totalTimeout: Duration)

    /**
     * The vpc to provision the lambda functions in.
     *
     * Default: - functions are not provisioned inside a vpc.
     *
     * @param vpc The vpc to provision the lambda functions in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Which subnets from the VPC to place the lambda functions in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Which subnets from the VPC to place the lambda functions in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84e3de72b4de6337b5fc519d0175efa34e4a5db977bc917b683cf8312d37469b")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.Provider.Builder =
        software.amazon.awscdk.customresources.Provider.Builder.create(scope, id)

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
     *
     * @param isCompleteHandler The AWS Lambda function to invoke in order to determine if the
     * operation is complete. 
     */
    override fun isCompleteHandler(isCompleteHandler: IFunction) {
      cdkBuilder.isCompleteHandler(isCompleteHandler.let(IFunction::unwrap))
    }

    /**
     * The Log Group used for logging of events emitted by the custom resource's lambda function.
     *
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     *
     * Default: - a default log group created by AWS Lambda
     *
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

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
     *
     * @param logRetention The number of days framework log events are kept in CloudWatch Logs. 
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    /**
     * The AWS Lambda function to invoke for all resource lifecycle operations
     * (CREATE/UPDATE/DELETE).
     *
     * This function is responsible to begin the requested resource operation
     * (CREATE/UPDATE/DELETE) and return any additional properties to add to the
     * event, which will later be passed to `isComplete`. The `PhysicalResourceId`
     * property must be included in the response.
     *
     * @param onEventHandler The AWS Lambda function to invoke for all resource lifecycle operations
     * (CREATE/UPDATE/DELETE). 
     */
    override fun onEventHandler(onEventHandler: IFunction) {
      cdkBuilder.onEventHandler(onEventHandler.let(IFunction::unwrap))
    }

    /**
     * AWS KMS key used to encrypt provider lambda's environment variables.
     *
     * Default: -  AWS Lambda creates and uses an AWS managed customer master key (CMK)
     *
     * @param providerFunctionEnvEncryption AWS KMS key used to encrypt provider lambda's
     * environment variables. 
     */
    override fun providerFunctionEnvEncryption(providerFunctionEnvEncryption: IKey) {
      cdkBuilder.providerFunctionEnvEncryption(providerFunctionEnvEncryption.let(IKey::unwrap))
    }

    /**
     * Provider Lambda name.
     *
     * The provider lambda function name.
     *
     * Default: -  CloudFormation default name from unique physical ID
     *
     * @param providerFunctionName Provider Lambda name. 
     */
    override fun providerFunctionName(providerFunctionName: String) {
      cdkBuilder.providerFunctionName(providerFunctionName)
    }

    /**
     * Time between calls to the `isComplete` handler which determines if the resource has been
     * stabilized.
     *
     * The first `isComplete` will be called immediately after `handler` and then
     * every `queryInterval` seconds, and until `timeout` has been reached or until
     * `isComplete` returns `true`.
     *
     * Default: Duration.seconds(5)
     *
     * @param queryInterval Time between calls to the `isComplete` handler which determines if the
     * resource has been stabilized. 
     */
    override fun queryInterval(queryInterval: Duration) {
      cdkBuilder.queryInterval(queryInterval.let(Duration::unwrap))
    }

    /**
     * AWS Lambda execution role.
     *
     * The role that will be assumed by the AWS Lambda.
     * Must be assumable by the 'lambda.amazonaws.com' service principal.
     *
     * Default: - A default role will be created.
     *
     * @param role AWS Lambda execution role. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * Security groups to attach to the provider functions.
     *
     * Only used if 'vpc' is supplied
     *
     * Default: - If `vpc` is not supplied, no security groups are attached. Otherwise, a dedicated
     * security
     * group is created for each function.
     *
     * @param securityGroups Security groups to attach to the provider functions. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * Security groups to attach to the provider functions.
     *
     * Only used if 'vpc' is supplied
     *
     * Default: - If `vpc` is not supplied, no security groups are attached. Otherwise, a dedicated
     * security
     * group is created for each function.
     *
     * @param securityGroups Security groups to attach to the provider functions. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Total timeout for the entire operation.
     *
     * The maximum timeout is 1 hour (yes, it can exceed the AWS Lambda 15 minutes)
     *
     * Default: Duration.minutes(30)
     *
     * @param totalTimeout Total timeout for the entire operation. 
     */
    override fun totalTimeout(totalTimeout: Duration) {
      cdkBuilder.totalTimeout(totalTimeout.let(Duration::unwrap))
    }

    /**
     * The vpc to provision the lambda functions in.
     *
     * Default: - functions are not provisioned inside a vpc.
     *
     * @param vpc The vpc to provision the lambda functions in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * Which subnets from the VPC to place the lambda functions in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * Which subnets from the VPC to place the lambda functions in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84e3de72b4de6337b5fc519d0175efa34e4a5db977bc917b683cf8312d37469b")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.customresources.Provider = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Provider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Provider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.Provider): Provider =
        Provider(cdkObject)

    internal fun unwrap(wrapped: Provider): software.amazon.awscdk.customresources.Provider =
        wrapped.cdkObject
  }
}

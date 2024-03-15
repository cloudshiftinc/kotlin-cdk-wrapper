@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for AwsCustomResource.
 *
 * Note that at least onCreate, onUpdate or onDelete must be specified.
 *
 * Example:
 *
 * ```
 * AwsCustomResource getParameter = AwsCustomResource.Builder.create(this,
 * "AssociateVPCWithHostedZone")
 * .onCreate(AwsSdkCall.builder()
 * .assumedRoleArn("arn:aws:iam::OTHERACCOUNT:role/CrossAccount/ManageHostedZoneConnections")
 * .service("Route53")
 * .action("AssociateVPCWithHostedZone")
 * .parameters(Map.of(
 * "HostedZoneId", "hz-123",
 * "VPC", Map.of(
 * "VPCId", "vpc-123",
 * "VPCRegion", "region-for-vpc")))
 * .physicalResourceId(PhysicalResourceId.of("${vpcStack.SharedVpc.VpcId}-${vpcStack.Region}-${PrivateHostedZone.HostedZoneId}"))
 * .build())
 * //Will ignore any resource and use the assumedRoleArn as resource and 'sts:AssumeRole' for
 * service:action
 * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
 * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
 * .build()))
 * .build();
 * ```
 */
public interface AwsCustomResourceProps {
  /**
   * A name for the singleton Lambda function implementing this custom resource.
   *
   * The function name will remain the same after the first AwsCustomResource is created in a stack.
   *
   * Default: - AWS CloudFormation generates a unique physical ID and uses that
   * ID for the function's name. For more information, see Name Type.
   */
  public fun functionName(): String? = unwrap(this).getFunctionName()

  /**
   * Whether to install the latest AWS SDK v2.
   *
   * If not specified, this uses whatever JavaScript SDK version is the default in
   * AWS Lambda at the time of execution.
   *
   * Otherwise, installs the latest version from 'npmjs.com'. The installation takes
   * around 60 seconds and requires internet connectivity.
   *
   * The default can be controlled using the context key
   * `&#64;aws-cdk/customresources:installLatestAwsSdkDefault` is.
   *
   * Default: - The value of `@aws-cdk/customresources:installLatestAwsSdkDefault`, otherwise `true`
   */
  public fun installLatestAwsSdk(): Boolean? = unwrap(this).getInstallLatestAwsSdk()

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
   * The number of days log events of the singleton Lambda function implementing this custom
   * resource are kept in CloudWatch Logs.
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
   * The AWS SDK call to make when the resource is created.
   *
   * Default: - the call when the resource is updated
   */
  public fun onCreate(): AwsSdkCall? = unwrap(this).getOnCreate()?.let(AwsSdkCall::wrap)

  /**
   * The AWS SDK call to make when the resource is deleted.
   *
   * Default: - no call
   */
  public fun onDelete(): AwsSdkCall? = unwrap(this).getOnDelete()?.let(AwsSdkCall::wrap)

  /**
   * The AWS SDK call to make when the resource is updated.
   *
   * Default: - no call
   */
  public fun onUpdate(): AwsSdkCall? = unwrap(this).getOnUpdate()?.let(AwsSdkCall::wrap)

  /**
   * The policy that will be added to the execution role of the Lambda function implementing this
   * custom resource provider.
   *
   * The custom resource also implements `iam.IGrantable`, making it possible
   * to use the `grantXxx()` methods.
   *
   * As this custom resource uses a singleton Lambda function, it's important
   * to note the that function's role will eventually accumulate the
   * permissions/grants from all resources.
   *
   * Note that a policy must be specified if `role` is not provided, as
   * by default a new role is created which requires policy changes to access
   * resources.
   *
   * Default: - no policy added
   *
   * [Documentation](Policy.fromSdkCalls)
   */
  public fun policy(): AwsCustomResourcePolicy? =
      unwrap(this).getPolicy()?.let(AwsCustomResourcePolicy::wrap)

  /**
   * The policy to apply when this resource is removed from the application.
   *
   * Default: cdk.RemovalPolicy.Destroy
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Cloudformation Resource type.
   *
   * Default: - Custom::AWS
   */
  public fun resourceType(): String? = unwrap(this).getResourceType()

  /**
   * The execution role for the singleton Lambda function implementing this custom resource
   * provider.
   *
   * This role will apply to all `AwsCustomResource`
   * instances in the stack. The role must be assumable by the
   * `lambda.amazonaws.com` service principal.
   *
   * Default: - a new role is created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The timeout for the singleton Lambda function implementing this custom resource.
   *
   * Default: Duration.minutes(2)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * The vpc to provision the lambda function in.
   *
   * Default: - the function is not provisioned inside a vpc.
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * Which subnets from the VPC to place the lambda function in.
   *
   * Only used if 'vpc' is supplied. Note: internet access for Lambdas
   * requires a NAT gateway, so picking Public subnets is not allowed.
   *
   * Default: - the Vpc default strategy if not specified
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [AwsCustomResourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param functionName A name for the singleton Lambda function implementing this custom
     * resource.
     * The function name will remain the same after the first AwsCustomResource is created in a
     * stack.
     */
    public fun functionName(functionName: String)

    /**
     * @param installLatestAwsSdk Whether to install the latest AWS SDK v2.
     * If not specified, this uses whatever JavaScript SDK version is the default in
     * AWS Lambda at the time of execution.
     *
     * Otherwise, installs the latest version from 'npmjs.com'. The installation takes
     * around 60 seconds and requires internet connectivity.
     *
     * The default can be controlled using the context key
     * `&#64;aws-cdk/customresources:installLatestAwsSdkDefault` is.
     */
    public fun installLatestAwsSdk(installLatestAwsSdk: Boolean)

    /**
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function.
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param logRetention The number of days log events of the singleton Lambda function
     * implementing this custom resource are kept in CloudWatch Logs.
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * @param onCreate The AWS SDK call to make when the resource is created.
     */
    public fun onCreate(onCreate: AwsSdkCall)

    /**
     * @param onCreate The AWS SDK call to make when the resource is created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b7d83925f337400070b058c2c5817eece64b7025dff0d1cdce207b715ed8e0c")
    public fun onCreate(onCreate: AwsSdkCall.Builder.() -> Unit)

    /**
     * @param onDelete The AWS SDK call to make when the resource is deleted.
     */
    public fun onDelete(onDelete: AwsSdkCall)

    /**
     * @param onDelete The AWS SDK call to make when the resource is deleted.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("522a51155d300c6e37ace685101570bb5db0cf50484ddb88b9a883cda34b7119")
    public fun onDelete(onDelete: AwsSdkCall.Builder.() -> Unit)

    /**
     * @param onUpdate The AWS SDK call to make when the resource is updated.
     */
    public fun onUpdate(onUpdate: AwsSdkCall)

    /**
     * @param onUpdate The AWS SDK call to make when the resource is updated.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1afa3e515eeaa39eec57853b1d14153b0442e69efc9058fa081bf9457e55c45")
    public fun onUpdate(onUpdate: AwsSdkCall.Builder.() -> Unit)

    /**
     * @param policy The policy that will be added to the execution role of the Lambda function
     * implementing this custom resource provider.
     * The custom resource also implements `iam.IGrantable`, making it possible
     * to use the `grantXxx()` methods.
     *
     * As this custom resource uses a singleton Lambda function, it's important
     * to note the that function's role will eventually accumulate the
     * permissions/grants from all resources.
     *
     * Note that a policy must be specified if `role` is not provided, as
     * by default a new role is created which requires policy changes to access
     * resources.
     */
    public fun policy(policy: AwsCustomResourcePolicy)

    /**
     * @param removalPolicy The policy to apply when this resource is removed from the application.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param resourceType Cloudformation Resource type.
     */
    public fun resourceType(resourceType: String)

    /**
     * @param role The execution role for the singleton Lambda function implementing this custom
     * resource provider.
     * This role will apply to all `AwsCustomResource`
     * instances in the stack. The role must be assumable by the
     * `lambda.amazonaws.com` service principal.
     */
    public fun role(role: IRole)

    /**
     * @param timeout The timeout for the singleton Lambda function implementing this custom
     * resource.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param vpc The vpc to provision the lambda function in.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda function in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda function in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7df7ab27452084b6d7cc3d2d4fb67c130943ba890527bd12a3aebd90994a8fa9")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.AwsCustomResourceProps.Builder =
        software.amazon.awscdk.customresources.AwsCustomResourceProps.builder()

    /**
     * @param functionName A name for the singleton Lambda function implementing this custom
     * resource.
     * The function name will remain the same after the first AwsCustomResource is created in a
     * stack.
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param installLatestAwsSdk Whether to install the latest AWS SDK v2.
     * If not specified, this uses whatever JavaScript SDK version is the default in
     * AWS Lambda at the time of execution.
     *
     * Otherwise, installs the latest version from 'npmjs.com'. The installation takes
     * around 60 seconds and requires internet connectivity.
     *
     * The default can be controlled using the context key
     * `&#64;aws-cdk/customresources:installLatestAwsSdkDefault` is.
     */
    override fun installLatestAwsSdk(installLatestAwsSdk: Boolean) {
      cdkBuilder.installLatestAwsSdk(installLatestAwsSdk)
    }

    /**
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     * lambda function.
     * Providing a user-controlled log group was rolled out to commercial regions on 2023-11-16.
     * If you are deploying to another type of region, please check regional availability first.
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param logRetention The number of days log events of the singleton Lambda function
     * implementing this custom resource are kept in CloudWatch Logs.
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    /**
     * @param onCreate The AWS SDK call to make when the resource is created.
     */
    override fun onCreate(onCreate: AwsSdkCall) {
      cdkBuilder.onCreate(onCreate.let(AwsSdkCall::unwrap))
    }

    /**
     * @param onCreate The AWS SDK call to make when the resource is created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b7d83925f337400070b058c2c5817eece64b7025dff0d1cdce207b715ed8e0c")
    override fun onCreate(onCreate: AwsSdkCall.Builder.() -> Unit): Unit =
        onCreate(AwsSdkCall(onCreate))

    /**
     * @param onDelete The AWS SDK call to make when the resource is deleted.
     */
    override fun onDelete(onDelete: AwsSdkCall) {
      cdkBuilder.onDelete(onDelete.let(AwsSdkCall::unwrap))
    }

    /**
     * @param onDelete The AWS SDK call to make when the resource is deleted.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("522a51155d300c6e37ace685101570bb5db0cf50484ddb88b9a883cda34b7119")
    override fun onDelete(onDelete: AwsSdkCall.Builder.() -> Unit): Unit =
        onDelete(AwsSdkCall(onDelete))

    /**
     * @param onUpdate The AWS SDK call to make when the resource is updated.
     */
    override fun onUpdate(onUpdate: AwsSdkCall) {
      cdkBuilder.onUpdate(onUpdate.let(AwsSdkCall::unwrap))
    }

    /**
     * @param onUpdate The AWS SDK call to make when the resource is updated.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1afa3e515eeaa39eec57853b1d14153b0442e69efc9058fa081bf9457e55c45")
    override fun onUpdate(onUpdate: AwsSdkCall.Builder.() -> Unit): Unit =
        onUpdate(AwsSdkCall(onUpdate))

    /**
     * @param policy The policy that will be added to the execution role of the Lambda function
     * implementing this custom resource provider.
     * The custom resource also implements `iam.IGrantable`, making it possible
     * to use the `grantXxx()` methods.
     *
     * As this custom resource uses a singleton Lambda function, it's important
     * to note the that function's role will eventually accumulate the
     * permissions/grants from all resources.
     *
     * Note that a policy must be specified if `role` is not provided, as
     * by default a new role is created which requires policy changes to access
     * resources.
     */
    override fun policy(policy: AwsCustomResourcePolicy) {
      cdkBuilder.policy(policy.let(AwsCustomResourcePolicy::unwrap))
    }

    /**
     * @param removalPolicy The policy to apply when this resource is removed from the application.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param resourceType Cloudformation Resource type.
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param role The execution role for the singleton Lambda function implementing this custom
     * resource provider.
     * This role will apply to all `AwsCustomResource`
     * instances in the stack. The role must be assumable by the
     * `lambda.amazonaws.com` service principal.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param timeout The timeout for the singleton Lambda function implementing this custom
     * resource.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * @param vpc The vpc to provision the lambda function in.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda function in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda function in.
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7df7ab27452084b6d7cc3d2d4fb67c130943ba890527bd12a3aebd90994a8fa9")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.customresources.AwsCustomResourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.customresources.AwsCustomResourceProps,
  ) : CdkObject(cdkObject), AwsCustomResourceProps {
    /**
     * A name for the singleton Lambda function implementing this custom resource.
     *
     * The function name will remain the same after the first AwsCustomResource is created in a
     * stack.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that
     * ID for the function's name. For more information, see Name Type.
     */
    override fun functionName(): String? = unwrap(this).getFunctionName()

    /**
     * Whether to install the latest AWS SDK v2.
     *
     * If not specified, this uses whatever JavaScript SDK version is the default in
     * AWS Lambda at the time of execution.
     *
     * Otherwise, installs the latest version from 'npmjs.com'. The installation takes
     * around 60 seconds and requires internet connectivity.
     *
     * The default can be controlled using the context key
     * `&#64;aws-cdk/customresources:installLatestAwsSdkDefault` is.
     *
     * Default: - The value of `@aws-cdk/customresources:installLatestAwsSdkDefault`, otherwise
     * `true`
     */
    override fun installLatestAwsSdk(): Boolean? = unwrap(this).getInstallLatestAwsSdk()

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
     * The number of days log events of the singleton Lambda function implementing this custom
     * resource are kept in CloudWatch Logs.
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
     * The AWS SDK call to make when the resource is created.
     *
     * Default: - the call when the resource is updated
     */
    override fun onCreate(): AwsSdkCall? = unwrap(this).getOnCreate()?.let(AwsSdkCall::wrap)

    /**
     * The AWS SDK call to make when the resource is deleted.
     *
     * Default: - no call
     */
    override fun onDelete(): AwsSdkCall? = unwrap(this).getOnDelete()?.let(AwsSdkCall::wrap)

    /**
     * The AWS SDK call to make when the resource is updated.
     *
     * Default: - no call
     */
    override fun onUpdate(): AwsSdkCall? = unwrap(this).getOnUpdate()?.let(AwsSdkCall::wrap)

    /**
     * The policy that will be added to the execution role of the Lambda function implementing this
     * custom resource provider.
     *
     * The custom resource also implements `iam.IGrantable`, making it possible
     * to use the `grantXxx()` methods.
     *
     * As this custom resource uses a singleton Lambda function, it's important
     * to note the that function's role will eventually accumulate the
     * permissions/grants from all resources.
     *
     * Note that a policy must be specified if `role` is not provided, as
     * by default a new role is created which requires policy changes to access
     * resources.
     *
     * Default: - no policy added
     *
     * [Documentation](Policy.fromSdkCalls)
     */
    override fun policy(): AwsCustomResourcePolicy? =
        unwrap(this).getPolicy()?.let(AwsCustomResourcePolicy::wrap)

    /**
     * The policy to apply when this resource is removed from the application.
     *
     * Default: cdk.RemovalPolicy.Destroy
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Cloudformation Resource type.
     *
     * Default: - Custom::AWS
     */
    override fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * The execution role for the singleton Lambda function implementing this custom resource
     * provider.
     *
     * This role will apply to all `AwsCustomResource`
     * instances in the stack. The role must be assumable by the
     * `lambda.amazonaws.com` service principal.
     *
     * Default: - a new role is created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The timeout for the singleton Lambda function implementing this custom resource.
     *
     * Default: Duration.minutes(2)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The vpc to provision the lambda function in.
     *
     * Default: - the function is not provisioned inside a vpc.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * Which subnets from the VPC to place the lambda function in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsCustomResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.AwsCustomResourceProps):
        AwsCustomResourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsCustomResourceProps):
        software.amazon.awscdk.customresources.AwsCustomResourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.customresources.AwsCustomResourceProps
  }
}

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Reference
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AwsCustomResource internal constructor(
  private val cdkObject: software.amazon.awscdk.customresources.AwsCustomResource,
) : CloudshiftdevConstructsConstruct(cdkObject), IGrantable {
  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Returns response data for the AWS SDK call as string.
   *
   * Example for S3 / listBucket : 'Buckets.0.Name'
   *
   * Note that you cannot use this method if `ignoreErrorCodesMatching`
   * is configured for any of the SDK calls. This is because in such a case,
   * the response data might not exist, and will cause a CloudFormation deploy time error.
   *
   * @param dataPath the path to the data. 
   */
  public open fun responseField(dataPath: String): String = unwrap(this).getResponseField(dataPath)

  /**
   * Returns response data for the AWS SDK call.
   *
   * Example for S3 / listBucket : 'Buckets.0.Name'
   *
   * Use `Token.asXxx` to encode the returned `Reference` as a specific type or
   * use the convenience `getDataString` for string attributes.
   *
   * Note that you cannot use this method if `ignoreErrorCodesMatching`
   * is configured for any of the SDK calls. This is because in such a case,
   * the response data might not exist, and will cause a CloudFormation deploy time error.
   *
   * @param dataPath the path to the data. 
   */
  public open fun responseFieldReference(dataPath: String): Reference =
      unwrap(this).getResponseFieldReference(dataPath).let(Reference::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.customresources.AwsCustomResource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the singleton Lambda function implementing this custom resource.
     *
     * The function name will remain the same after the first AwsCustomResource is created in a
     * stack.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that
     * ID for the function's name. For more information, see Name Type.
     *
     * @param functionName A name for the singleton Lambda function implementing this custom
     * resource. 
     */
    public fun functionName(functionName: String)

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
     *
     * @param installLatestAwsSdk Whether to install the latest AWS SDK v2. 
     */
    public fun installLatestAwsSdk(installLatestAwsSdk: Boolean)

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
     * The number of days log events of the singleton Lambda function implementing this custom
     * resource are kept in CloudWatch Logs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: logs.RetentionDays.INFINITE
     *
     * @param logRetention The number of days log events of the singleton Lambda function
     * implementing this custom resource are kept in CloudWatch Logs. 
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * The AWS SDK call to make when the resource is created.
     *
     * Default: - the call when the resource is updated
     *
     * @param onCreate The AWS SDK call to make when the resource is created. 
     */
    public fun onCreate(onCreate: AwsSdkCall)

    /**
     * The AWS SDK call to make when the resource is created.
     *
     * Default: - the call when the resource is updated
     *
     * @param onCreate The AWS SDK call to make when the resource is created. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0abceb2a25226ed018ed77bc9067d5e666f441f9f7c8b30365b8ba71d382af32")
    public fun onCreate(onCreate: AwsSdkCall.Builder.() -> Unit)

    /**
     * The AWS SDK call to make when the resource is deleted.
     *
     * Default: - no call
     *
     * @param onDelete The AWS SDK call to make when the resource is deleted. 
     */
    public fun onDelete(onDelete: AwsSdkCall)

    /**
     * The AWS SDK call to make when the resource is deleted.
     *
     * Default: - no call
     *
     * @param onDelete The AWS SDK call to make when the resource is deleted. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efb30bcba09a86be18f98a0f5ace3302a9a2b7655bc8409423acddb0fab3208d")
    public fun onDelete(onDelete: AwsSdkCall.Builder.() -> Unit)

    /**
     * The AWS SDK call to make when the resource is updated.
     *
     * Default: - no call
     *
     * @param onUpdate The AWS SDK call to make when the resource is updated. 
     */
    public fun onUpdate(onUpdate: AwsSdkCall)

    /**
     * The AWS SDK call to make when the resource is updated.
     *
     * Default: - no call
     *
     * @param onUpdate The AWS SDK call to make when the resource is updated. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b47349731bf7e943a6dc22393547fa8cfd7aa5ce1efd59b106715f42b7de03c")
    public fun onUpdate(onUpdate: AwsSdkCall.Builder.() -> Unit)

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
     * @param policy The policy that will be added to the execution role of the Lambda function
     * implementing this custom resource provider. 
     */
    public fun policy(policy: AwsCustomResourcePolicy)

    /**
     * The policy to apply when this resource is removed from the application.
     *
     * Default: cdk.RemovalPolicy.Destroy
     *
     * @param removalPolicy The policy to apply when this resource is removed from the application. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * Cloudformation Resource type.
     *
     * Default: - Custom::AWS
     *
     * @param resourceType Cloudformation Resource type. 
     */
    public fun resourceType(resourceType: String)

    /**
     * The execution role for the singleton Lambda function implementing this custom resource
     * provider.
     *
     * This role will apply to all `AwsCustomResource`
     * instances in the stack. The role must be assumable by the
     * `lambda.amazonaws.com` service principal.
     *
     * Default: - a new role is created
     *
     * @param role The execution role for the singleton Lambda function implementing this custom
     * resource provider. 
     */
    public fun role(role: IRole)

    /**
     * The timeout for the singleton Lambda function implementing this custom resource.
     *
     * Default: Duration.minutes(2)
     *
     * @param timeout The timeout for the singleton Lambda function implementing this custom
     * resource. 
     */
    public fun timeout(timeout: Duration)

    /**
     * The vpc to provision the lambda function in.
     *
     * Default: - the function is not provisioned inside a vpc.
     *
     * @param vpc The vpc to provision the lambda function in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Which subnets from the VPC to place the lambda function in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets from the VPC to place the lambda function in. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Which subnets from the VPC to place the lambda function in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets from the VPC to place the lambda function in. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("832e5764ad2889290b88a07eb3c204b7c910500a8ca75024237e0e7ba9fee539")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.AwsCustomResource.Builder =
        software.amazon.awscdk.customresources.AwsCustomResource.Builder.create(scope, id)

    /**
     * A name for the singleton Lambda function implementing this custom resource.
     *
     * The function name will remain the same after the first AwsCustomResource is created in a
     * stack.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that
     * ID for the function's name. For more information, see Name Type.
     *
     * @param functionName A name for the singleton Lambda function implementing this custom
     * resource. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

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
     *
     * @param installLatestAwsSdk Whether to install the latest AWS SDK v2. 
     */
    override fun installLatestAwsSdk(installLatestAwsSdk: Boolean) {
      cdkBuilder.installLatestAwsSdk(installLatestAwsSdk)
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
     * The number of days log events of the singleton Lambda function implementing this custom
     * resource are kept in CloudWatch Logs.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     *
     * Default: logs.RetentionDays.INFINITE
     *
     * @param logRetention The number of days log events of the singleton Lambda function
     * implementing this custom resource are kept in CloudWatch Logs. 
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    /**
     * The AWS SDK call to make when the resource is created.
     *
     * Default: - the call when the resource is updated
     *
     * @param onCreate The AWS SDK call to make when the resource is created. 
     */
    override fun onCreate(onCreate: AwsSdkCall) {
      cdkBuilder.onCreate(onCreate.let(AwsSdkCall::unwrap))
    }

    /**
     * The AWS SDK call to make when the resource is created.
     *
     * Default: - the call when the resource is updated
     *
     * @param onCreate The AWS SDK call to make when the resource is created. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0abceb2a25226ed018ed77bc9067d5e666f441f9f7c8b30365b8ba71d382af32")
    override fun onCreate(onCreate: AwsSdkCall.Builder.() -> Unit): Unit =
        onCreate(AwsSdkCall(onCreate))

    /**
     * The AWS SDK call to make when the resource is deleted.
     *
     * Default: - no call
     *
     * @param onDelete The AWS SDK call to make when the resource is deleted. 
     */
    override fun onDelete(onDelete: AwsSdkCall) {
      cdkBuilder.onDelete(onDelete.let(AwsSdkCall::unwrap))
    }

    /**
     * The AWS SDK call to make when the resource is deleted.
     *
     * Default: - no call
     *
     * @param onDelete The AWS SDK call to make when the resource is deleted. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efb30bcba09a86be18f98a0f5ace3302a9a2b7655bc8409423acddb0fab3208d")
    override fun onDelete(onDelete: AwsSdkCall.Builder.() -> Unit): Unit =
        onDelete(AwsSdkCall(onDelete))

    /**
     * The AWS SDK call to make when the resource is updated.
     *
     * Default: - no call
     *
     * @param onUpdate The AWS SDK call to make when the resource is updated. 
     */
    override fun onUpdate(onUpdate: AwsSdkCall) {
      cdkBuilder.onUpdate(onUpdate.let(AwsSdkCall::unwrap))
    }

    /**
     * The AWS SDK call to make when the resource is updated.
     *
     * Default: - no call
     *
     * @param onUpdate The AWS SDK call to make when the resource is updated. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b47349731bf7e943a6dc22393547fa8cfd7aa5ce1efd59b106715f42b7de03c")
    override fun onUpdate(onUpdate: AwsSdkCall.Builder.() -> Unit): Unit =
        onUpdate(AwsSdkCall(onUpdate))

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
     * @param policy The policy that will be added to the execution role of the Lambda function
     * implementing this custom resource provider. 
     */
    override fun policy(policy: AwsCustomResourcePolicy) {
      cdkBuilder.policy(policy.let(AwsCustomResourcePolicy::unwrap))
    }

    /**
     * The policy to apply when this resource is removed from the application.
     *
     * Default: cdk.RemovalPolicy.Destroy
     *
     * @param removalPolicy The policy to apply when this resource is removed from the application. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * Cloudformation Resource type.
     *
     * Default: - Custom::AWS
     *
     * @param resourceType Cloudformation Resource type. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * The execution role for the singleton Lambda function implementing this custom resource
     * provider.
     *
     * This role will apply to all `AwsCustomResource`
     * instances in the stack. The role must be assumable by the
     * `lambda.amazonaws.com` service principal.
     *
     * Default: - a new role is created
     *
     * @param role The execution role for the singleton Lambda function implementing this custom
     * resource provider. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * The timeout for the singleton Lambda function implementing this custom resource.
     *
     * Default: Duration.minutes(2)
     *
     * @param timeout The timeout for the singleton Lambda function implementing this custom
     * resource. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * The vpc to provision the lambda function in.
     *
     * Default: - the function is not provisioned inside a vpc.
     *
     * @param vpc The vpc to provision the lambda function in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * Which subnets from the VPC to place the lambda function in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets from the VPC to place the lambda function in. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * Which subnets from the VPC to place the lambda function in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas
     * requires a NAT gateway, so picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets from the VPC to place the lambda function in. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("832e5764ad2889290b88a07eb3c204b7c910500a8ca75024237e0e7ba9fee539")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.customresources.AwsCustomResource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AwsCustomResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AwsCustomResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.AwsCustomResource):
        AwsCustomResource = AwsCustomResource(cdkObject)

    internal fun unwrap(wrapped: AwsCustomResource):
        software.amazon.awscdk.customresources.AwsCustomResource = wrapped.cdkObject
  }
}

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

package io.cloudshiftdev.awscdkdsl.customresources

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.customresources.AwsCustomResourcePolicy
import software.amazon.awscdk.customresources.AwsCustomResourceProps
import software.amazon.awscdk.customresources.AwsSdkCall
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.RetentionDays

/**
 * Properties for AwsCustomResource.
 *
 * Note that at least onCreate, onUpdate or onDelete must be specified.
 *
 * Example:
 * ```
 * AwsCustomResource getParameter = AwsCustomResource.Builder.create(this, "GetParameter")
 * .onUpdate(AwsSdkCall.builder() // will also be called for a CREATE event
 * .service("SSM")
 * .action("getParameter")
 * .parameters(Map.of(
 * "Name", "my-parameter",
 * "WithDecryption", true))
 * .physicalResourceId(PhysicalResourceId.of(Date.now().toString())).build())
 * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
 * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
 * .build()))
 * .build();
 * // Use the value in another construct with
 * getParameter.getResponseField("Parameter.Value");
 * ```
 */
@CdkDslMarker
public class AwsCustomResourcePropsDsl {
    private val cdkBuilder: AwsCustomResourceProps.Builder = AwsCustomResourceProps.builder()

    /**
     * @param functionName A name for the singleton Lambda function implementing this custom
     *   resource. The function name will remain the same after the first AwsCustomResource is
     *   created in a stack.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * @param installLatestAwsSdk Whether to install the latest AWS SDK v2. If not specified, this
     *   uses whatever JavaScript SDK version is the default in AWS Lambda at the time of execution.
     *
     * Otherwise, installs the latest version from 'npmjs.com'. The installation takes around 60
     * seconds and requires internet connectivity.
     *
     * The default can be controlled using the context key
     * `&#64;aws-cdk/customresources:installLatestAwsSdkDefault` is.
     */
    public fun installLatestAwsSdk(installLatestAwsSdk: Boolean) {
        cdkBuilder.installLatestAwsSdk(installLatestAwsSdk)
    }

    /**
     * @param logRetention The number of days log events of the singleton Lambda function
     *   implementing this custom resource are kept in CloudWatch Logs.
     */
    public fun logRetention(logRetention: RetentionDays) {
        cdkBuilder.logRetention(logRetention)
    }

    /** @param onCreate The AWS SDK call to make when the resource is created. */
    public fun onCreate(onCreate: AwsSdkCallDsl.() -> Unit = {}) {
        val builder = AwsSdkCallDsl()
        builder.apply(onCreate)
        cdkBuilder.onCreate(builder.build())
    }

    /** @param onCreate The AWS SDK call to make when the resource is created. */
    public fun onCreate(onCreate: AwsSdkCall) {
        cdkBuilder.onCreate(onCreate)
    }

    /** @param onDelete The AWS SDK call to make when the resource is deleted. */
    public fun onDelete(onDelete: AwsSdkCallDsl.() -> Unit = {}) {
        val builder = AwsSdkCallDsl()
        builder.apply(onDelete)
        cdkBuilder.onDelete(builder.build())
    }

    /** @param onDelete The AWS SDK call to make when the resource is deleted. */
    public fun onDelete(onDelete: AwsSdkCall) {
        cdkBuilder.onDelete(onDelete)
    }

    /** @param onUpdate The AWS SDK call to make when the resource is updated. */
    public fun onUpdate(onUpdate: AwsSdkCallDsl.() -> Unit = {}) {
        val builder = AwsSdkCallDsl()
        builder.apply(onUpdate)
        cdkBuilder.onUpdate(builder.build())
    }

    /** @param onUpdate The AWS SDK call to make when the resource is updated. */
    public fun onUpdate(onUpdate: AwsSdkCall) {
        cdkBuilder.onUpdate(onUpdate)
    }

    /**
     * @param policy The policy that will be added to the execution role of the Lambda function
     *   implementing this custom resource provider. The custom resource also implements
     *   `iam.IGrantable`, making it possible to use the `grantXxx()` methods.
     *
     * As this custom resource uses a singleton Lambda function, it's important to note the that
     * function's role will eventually accumulate the permissions/grants from all resources.
     *
     * Note that a policy must be specified if `role` is not provided, as by default a new role is
     * created which requires policy changes to access resources.
     */
    public fun policy(policy: AwsCustomResourcePolicy) {
        cdkBuilder.policy(policy)
    }

    /**
     * @param removalPolicy The policy to apply when this resource is removed from the application.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /** @param resourceType Cloudformation Resource type. */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param role The execution role for the singleton Lambda function implementing this custom
     *   resource provider. This role will apply to all `AwsCustomResource` instances in the stack.
     *   The role must be assumable by the `lambda.amazonaws.com` service principal.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param timeout The timeout for the singleton Lambda function implementing this custom
     *   resource.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /** @param vpc The vpc to provision the lambda function in. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda function in. Only used if
     *   'vpc' is supplied. Note: internet access for Lambdas requires a NAT gateway, so picking
     *   Public subnets is not allowed.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda function in. Only used if
     *   'vpc' is supplied. Note: internet access for Lambdas requires a NAT gateway, so picking
     *   Public subnets is not allowed.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): AwsCustomResourceProps = cdkBuilder.build()
}

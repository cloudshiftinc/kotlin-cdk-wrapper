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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.customresources.Provider
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.logs.RetentionDays
import software.constructs.Construct

/**
 * Defines an AWS CloudFormation custom resource provider.
 *
 * Example:
 * ```
 * Function onEvent;
 * Function isComplete;
 * Role myRole;
 * Provider myProvider = Provider.Builder.create(this, "MyProvider")
 * .onEventHandler(onEvent)
 * .isCompleteHandler(isComplete)
 * .logRetention(RetentionDays.ONE_DAY)
 * .role(myRole)
 * .providerFunctionName("the-lambda-name")
 * .build();
 * ```
 */
@CdkDslMarker
public class ProviderDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Provider.Builder = Provider.Builder.create(scope, id)

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * The AWS Lambda function to invoke in order to determine if the operation is complete.
     *
     * This function will be called immediately after `onEvent` and then periodically based on the
     * configured query interval as long as it returns `false`. If the function still returns
     * `false` and the alloted timeout has passed, the operation will fail.
     *
     * Default: - provider is synchronous. This means that the `onEvent` handler is expected to
     * finish all lifecycle operations within the initial invocation.
     *
     * @param isCompleteHandler The AWS Lambda function to invoke in order to determine if the
     *   operation is complete.
     */
    public fun isCompleteHandler(isCompleteHandler: IFunction) {
        cdkBuilder.isCompleteHandler(isCompleteHandler)
    }

    /**
     * The number of days framework log events are kept in CloudWatch Logs.
     *
     * When updating this property, unsetting it doesn't remove the log retention policy. To remove
     * the retention policy, set the value to `INFINITE`.
     *
     * Default: logs.RetentionDays.INFINITE
     *
     * @param logRetention The number of days framework log events are kept in CloudWatch Logs.
     */
    public fun logRetention(logRetention: RetentionDays) {
        cdkBuilder.logRetention(logRetention)
    }

    /**
     * The AWS Lambda function to invoke for all resource lifecycle operations
     * (CREATE/UPDATE/DELETE).
     *
     * This function is responsible to begin the requested resource operation (CREATE/UPDATE/DELETE)
     * and return any additional properties to add to the event, which will later be passed to
     * `isComplete`. The `PhysicalResourceId` property must be included in the response.
     *
     * @param onEventHandler The AWS Lambda function to invoke for all resource lifecycle operations
     *   (CREATE/UPDATE/DELETE).
     */
    public fun onEventHandler(onEventHandler: IFunction) {
        cdkBuilder.onEventHandler(onEventHandler)
    }

    /**
     * AWS KMS key used to encrypt provider lambda's environment variables.
     *
     * Default: - AWS Lambda creates and uses an AWS managed customer master key (CMK)
     *
     * @param providerFunctionEnvEncryption AWS KMS key used to encrypt provider lambda's
     *   environment variables.
     */
    public fun providerFunctionEnvEncryption(providerFunctionEnvEncryption: IKey) {
        cdkBuilder.providerFunctionEnvEncryption(providerFunctionEnvEncryption)
    }

    /**
     * Provider Lambda name.
     *
     * The provider lambda function name.
     *
     * Default: - CloudFormation default name from unique physical ID
     *
     * @param providerFunctionName Provider Lambda name.
     */
    public fun providerFunctionName(providerFunctionName: String) {
        cdkBuilder.providerFunctionName(providerFunctionName)
    }

    /**
     * Time between calls to the `isComplete` handler which determines if the resource has been
     * stabilized.
     *
     * The first `isComplete` will be called immediately after `handler` and then every
     * `queryInterval` seconds, and until `timeout` has been reached or until `isComplete` returns
     * `true`.
     *
     * Default: Duration.seconds(5)
     *
     * @param queryInterval Time between calls to the `isComplete` handler which determines if the
     *   resource has been stabilized.
     */
    public fun queryInterval(queryInterval: Duration) {
        cdkBuilder.queryInterval(queryInterval)
    }

    /**
     * AWS Lambda execution role.
     *
     * The role that will be assumed by the AWS Lambda. Must be assumable by the
     * 'lambda.amazonaws.com' service principal.
     *
     * Default: - A default role will be created.
     *
     * @param role AWS Lambda execution role.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * Security groups to attach to the provider functions.
     *
     * Only used if 'vpc' is supplied
     *
     * Default: - If `vpc` is not supplied, no security groups are attached. Otherwise, a dedicated
     * security group is created for each function.
     *
     * @param securityGroups Security groups to attach to the provider functions.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * Security groups to attach to the provider functions.
     *
     * Only used if 'vpc' is supplied
     *
     * Default: - If `vpc` is not supplied, no security groups are attached. Otherwise, a dedicated
     * security group is created for each function.
     *
     * @param securityGroups Security groups to attach to the provider functions.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * Total timeout for the entire operation.
     *
     * The maximum timeout is 2 hours (yes, it can exceed the AWS Lambda 15 minutes)
     *
     * Default: Duration.minutes(30)
     *
     * @param totalTimeout Total timeout for the entire operation.
     */
    public fun totalTimeout(totalTimeout: Duration) {
        cdkBuilder.totalTimeout(totalTimeout)
    }

    /**
     * The vpc to provision the lambda functions in.
     *
     * Default: - functions are not provisioned inside a vpc.
     *
     * @param vpc The vpc to provision the lambda functions in.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * Which subnets from the VPC to place the lambda functions in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas requires a NAT gateway, so
     * picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * Which subnets from the VPC to place the lambda functions in.
     *
     * Only used if 'vpc' is supplied. Note: internet access for Lambdas requires a NAT gateway, so
     * picking Public subnets is not allowed.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): Provider {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}

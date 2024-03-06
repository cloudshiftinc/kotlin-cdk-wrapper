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
import software.amazon.awscdk.customresources.ProviderProps
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.RetentionDays

/**
 * Initialization properties for the `Provider` construct.
 *
 * Example:
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
@CdkDslMarker
public class ProviderPropsDsl {
    private val cdkBuilder: ProviderProps.Builder = ProviderProps.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param isCompleteHandler The AWS Lambda function to invoke in order to determine if the
     *   operation is complete. This function will be called immediately after `onEvent` and then
     *   periodically based on the configured query interval as long as it returns `false`. If the
     *   function still returns `false` and the alloted timeout has passed, the operation will fail.
     */
    public fun isCompleteHandler(isCompleteHandler: IFunction) {
        cdkBuilder.isCompleteHandler(isCompleteHandler)
    }

    /**
     * @param logGroup The Log Group used for logging of events emitted by the custom resource's
     *   lambda function. Providing a user-controlled log group was rolled out to commercial regions
     *   on 2023-11-16. If you are deploying to another type of region, please check regional
     *   availability first.
     */
    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
    }

    /**
     * @param logRetention The number of days framework log events are kept in CloudWatch Logs. When
     *   updating this property, unsetting it doesn't remove the log retention policy. To remove the
     *   retention policy, set the value to `INFINITE`.
     *
     * This is a legacy API and we strongly recommend you migrate to `logGroup` if you can.
     * `logGroup` allows you to create a fully customizable log group and instruct the Lambda
     * function to send logs to it.
     */
    public fun logRetention(logRetention: RetentionDays) {
        cdkBuilder.logRetention(logRetention)
    }

    /**
     * @param onEventHandler The AWS Lambda function to invoke for all resource lifecycle operations
     *   (CREATE/UPDATE/DELETE). This function is responsible to begin the requested resource
     *   operation (CREATE/UPDATE/DELETE) and return any additional properties to add to the event,
     *   which will later be passed to `isComplete`. The `PhysicalResourceId` property must be
     *   included in the response.
     */
    public fun onEventHandler(onEventHandler: IFunction) {
        cdkBuilder.onEventHandler(onEventHandler)
    }

    /**
     * @param providerFunctionEnvEncryption AWS KMS key used to encrypt provider lambda's
     *   environment variables.
     */
    public fun providerFunctionEnvEncryption(providerFunctionEnvEncryption: IKey) {
        cdkBuilder.providerFunctionEnvEncryption(providerFunctionEnvEncryption)
    }

    /** @param providerFunctionName Provider Lambda name. The provider lambda function name. */
    public fun providerFunctionName(providerFunctionName: String) {
        cdkBuilder.providerFunctionName(providerFunctionName)
    }

    /**
     * @param queryInterval Time between calls to the `isComplete` handler which determines if the
     *   resource has been stabilized. The first `isComplete` will be called immediately after
     *   `handler` and then every `queryInterval` seconds, and until `timeout` has been reached or
     *   until `isComplete` returns `true`.
     */
    public fun queryInterval(queryInterval: Duration) {
        cdkBuilder.queryInterval(queryInterval)
    }

    /**
     * @param role AWS Lambda execution role. The role that will be assumed by the AWS Lambda. Must
     *   be assumable by the 'lambda.amazonaws.com' service principal.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param securityGroups Security groups to attach to the provider functions. Only used if 'vpc'
     *   is supplied
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups Security groups to attach to the provider functions. Only used if 'vpc'
     *   is supplied
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param totalTimeout Total timeout for the entire operation. The maximum timeout is 1 hour
     *   (yes, it can exceed the AWS Lambda 15 minutes)
     */
    public fun totalTimeout(totalTimeout: Duration) {
        cdkBuilder.totalTimeout(totalTimeout)
    }

    /** @param vpc The vpc to provision the lambda functions in. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in. Only used if
     *   'vpc' is supplied. Note: internet access for Lambdas requires a NAT gateway, so picking
     *   Public subnets is not allowed.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * @param vpcSubnets Which subnets from the VPC to place the lambda functions in. Only used if
     *   'vpc' is supplied. Note: internet access for Lambdas requires a NAT gateway, so picking
     *   Public subnets is not allowed.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): ProviderProps {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}

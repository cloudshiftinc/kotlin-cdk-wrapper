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

package cloudshift.awscdk.dsl.customresources

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.customresources.AwsCustomResource
import software.amazon.awscdk.customresources.AwsCustomResourcePolicy
import software.amazon.awscdk.customresources.AwsSdkCall
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.RetentionDays
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class AwsCustomResourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: AwsCustomResource.Builder = AwsCustomResource.Builder.create(scope, id)

    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun installLatestAwsSdk(installLatestAwsSdk: Boolean) {
        cdkBuilder.installLatestAwsSdk(installLatestAwsSdk)
    }

    public fun logRetention(logRetention: RetentionDays) {
        cdkBuilder.logRetention(logRetention)
    }

    public fun onCreate(block: AwsSdkCallDsl.() -> Unit = {}) {
        val builder = AwsSdkCallDsl()
        builder.apply(block)
        cdkBuilder.onCreate(builder.build())
    }

    public fun onCreate(onCreate: AwsSdkCall) {
        cdkBuilder.onCreate(onCreate)
    }

    public fun onDelete(block: AwsSdkCallDsl.() -> Unit = {}) {
        val builder = AwsSdkCallDsl()
        builder.apply(block)
        cdkBuilder.onDelete(builder.build())
    }

    public fun onDelete(onDelete: AwsSdkCall) {
        cdkBuilder.onDelete(onDelete)
    }

    public fun onUpdate(block: AwsSdkCallDsl.() -> Unit = {}) {
        val builder = AwsSdkCallDsl()
        builder.apply(block)
        cdkBuilder.onUpdate(builder.build())
    }

    public fun onUpdate(onUpdate: AwsSdkCall) {
        cdkBuilder.onUpdate(onUpdate)
    }

    public fun policy(policy: AwsCustomResourcePolicy) {
        cdkBuilder.policy(policy)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.vpcSubnets(builder.build())
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): AwsCustomResource = cdkBuilder.build()
}

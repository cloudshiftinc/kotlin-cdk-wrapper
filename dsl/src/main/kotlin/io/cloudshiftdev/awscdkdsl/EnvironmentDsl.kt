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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Environment

/**
 * The deployment environment for a stack.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * App app = new App();
 * Stack stack = Stack.Builder.create(app,
 * "Stack").env(Environment.builder().region("us-west-2").build()).build();
 * TableV2 globalTable = TableV2.Builder.create(stack, "GlobalTable")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * .replicas(List.of(ReplicaTableProps.builder().region("us-east-1").build()))
 * .build();
 * globalTable.addReplica(ReplicaTableProps.builder().region("us-east-2").deletionProtection(true).build());
 * ```
 */
@CdkDslMarker
public class EnvironmentDsl {
    private val cdkBuilder: Environment.Builder = Environment.builder()

    /**
     * @param account The AWS account ID for this environment. This can be either a concrete value
     *   such as `585191031104` or `Aws.ACCOUNT_ID` which indicates that account ID will only be
     *   determined during deployment (it will resolve to the CloudFormation intrinsic
     *   `{"Ref":"AWS::AccountId"}`). Note that certain features, such as cross-stack references and
     *   environmental context providers require concrete region information and will cause this
     *   stack to emit synthesis errors.
     */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * @param region The AWS region for this environment. This can be either a concrete value such
     *   as `eu-west-2` or `Aws.REGION` which indicates that account ID will only be determined
     *   during deployment (it will resolve to the CloudFormation intrinsic
     *   `{"Ref":"AWS::Region"}`). Note that certain features, such as cross-stack references and
     *   environmental context providers require concrete region information and will cause this
     *   stack to emit synthesis errors.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): Environment = cdkBuilder.build()
}

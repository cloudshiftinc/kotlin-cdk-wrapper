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

package io.cloudshiftdev.awscdkdsl.services.lex

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnResourcePolicy
import software.constructs.Construct

/**
 * Amazon Lex V2 is the only supported version in AWS CloudFormation .
 *
 * Specifies a new resource policy with the specified policy statements.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * Object policy;
 * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
 * "MyCfnResourcePolicy")
 * .policy(policy)
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourcePolicy.Builder = CfnResourcePolicy.Builder.create(scope, id)

    /**
     * A resource policy to add to the resource.
     *
     * The policy is a JSON structure that contains one or more statements that define the policy.
     * The policy must follow IAM syntax. If the policy isn't valid, Amazon Lex returns a validation
     * exception.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html#cfn-lex-resourcepolicy-policy)
     *
     * @param policy A resource policy to add to the resource.
     */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /**
     * A resource policy to add to the resource.
     *
     * The policy is a JSON structure that contains one or more statements that define the policy.
     * The policy must follow IAM syntax. If the policy isn't valid, Amazon Lex returns a validation
     * exception.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html#cfn-lex-resourcepolicy-policy)
     *
     * @param policy A resource policy to add to the resource.
     */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    /**
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached
     * to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html#cfn-lex-resourcepolicy-resourcearn)
     *
     * @param resourceArn The Amazon Resource Name (ARN) of the bot or bot alias that the resource
     *   policy is attached to.
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnResourcePolicy = cdkBuilder.build()
}

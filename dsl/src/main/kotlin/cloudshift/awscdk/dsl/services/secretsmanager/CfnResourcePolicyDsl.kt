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

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy
import software.constructs.Construct

/**
 * Attaches a resource-based permission policy to a secret.
 *
 * A resource-based policy is optional. For more information, see
 * [Authentication and access control for Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html)
 *
 * For information about attaching a policy in the console, see
 * [Attach a permissions policy to a secret](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html)
 * .
 *
 * *Required permissions:* `secretsmanager:PutResourcePolicy` . For more information, see
 * [IAM policy actions for Secrets Manager](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awssecretsmanager.html#awssecretsmanager-actions-as-permissions)
 * and
 * [Authentication and access control in Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * Object resourcePolicy;
 * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
 * "MyCfnResourcePolicy")
 * .resourcePolicy(resourcePolicy)
 * .secretId("secretId")
 * // the properties below are optional
 * .blockPublicPolicy(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResourcePolicy.Builder = CfnResourcePolicy.Builder.create(scope, id)

    /**
     * Specifies whether to block resource-based policies that allow broad access to the secret.
     *
     * By default, Secrets Manager blocks policies that allow broad access, for example those that
     * use a wildcard for the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-blockpublicpolicy)
     *
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     *   access to the secret.
     */
    public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    /**
     * Specifies whether to block resource-based policies that allow broad access to the secret.
     *
     * By default, Secrets Manager blocks policies that allow broad access, for example those that
     * use a wildcard for the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-blockpublicpolicy)
     *
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     *   access to the secret.
     */
    public fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * For example policies, see
     * [Permissions policy examples](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-resourcepolicy)
     *
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy.
     */
    public fun resourcePolicy(resourcePolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resourcePolicy)
        cdkBuilder.resourcePolicy(builder.map)
    }

    /**
     * A JSON-formatted string for an AWS resource-based policy.
     *
     * For example policies, see
     * [Permissions policy examples](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-resourcepolicy)
     *
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy.
     */
    public fun resourcePolicy(resourcePolicy: Any) {
        cdkBuilder.resourcePolicy(resourcePolicy)
    }

    /**
     * The ARN or name of the secret to attach the resource-based policy.
     *
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html#cfn-secretsmanager-resourcepolicy-secretid)
     *
     * @param secretId The ARN or name of the secret to attach the resource-based policy.
     */
    public fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
    }

    public fun build(): CfnResourcePolicy = cdkBuilder.build()
}

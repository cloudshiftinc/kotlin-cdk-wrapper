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

package io.cloudshiftdev.awscdkdsl.services.opensearchserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicy
import software.constructs.Construct

/**
 * Creates a lifecyle policy to be applied to OpenSearch Serverless indexes.
 *
 * Lifecycle policies define the number of days or hours to retain the data on an OpenSearch
 * Serverless index. For more information, see
 * [Creating data lifecycle policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-lifecycle.html#serverless-lifecycle-create)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchserverless.*;
 * CfnLifecyclePolicy cfnLifecyclePolicy = CfnLifecyclePolicy.Builder.create(this,
 * "MyCfnLifecyclePolicy")
 * .name("name")
 * .policy("policy")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLifecyclePolicy.Builder =
        CfnLifecyclePolicy.Builder.create(scope, id)

    /**
     * The description of the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-description)
     *
     * @param description The description of the lifecycle policy.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-name)
     *
     * @param name The name of the lifecycle policy.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The JSON policy document without any whitespaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-policy)
     *
     * @param policy The JSON policy document without any whitespaces.
     */
    public fun policy(policy: String) {
        cdkBuilder.policy(policy)
    }

    /**
     * The type of lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-lifecyclepolicy.html#cfn-opensearchserverless-lifecyclepolicy-type)
     *
     * @param type The type of lifecycle policy.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLifecyclePolicy = cdkBuilder.build()
}

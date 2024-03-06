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
import software.amazon.awscdk.services.opensearchserverless.CfnLifecyclePolicyProps

/**
 * Properties for defining a `CfnLifecyclePolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchserverless.*;
 * CfnLifecyclePolicyProps cfnLifecyclePolicyProps = CfnLifecyclePolicyProps.builder()
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
public class CfnLifecyclePolicyPropsDsl {
    private val cdkBuilder: CfnLifecyclePolicyProps.Builder = CfnLifecyclePolicyProps.builder()

    /** @param description The description of the lifecycle policy. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the lifecycle policy. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param policy The JSON policy document without any whitespaces. */
    public fun policy(policy: String) {
        cdkBuilder.policy(policy)
    }

    /** @param type The type of lifecycle policy. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLifecyclePolicyProps = cdkBuilder.build()
}

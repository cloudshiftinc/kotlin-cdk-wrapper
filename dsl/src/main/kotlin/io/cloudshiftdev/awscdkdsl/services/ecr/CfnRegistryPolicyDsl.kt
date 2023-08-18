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

package io.cloudshiftdev.awscdkdsl.services.ecr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRegistryPolicy
import software.constructs.Construct

/**
 * The `AWS::ECR::RegistryPolicy` resource creates or updates the permissions policy for a private
 * registry.
 *
 * A private registry policy is used to specify permissions for another AWS account and is used when
 * configuring cross-account replication. For more information, see
 * [Registry permissions](https://docs.aws.amazon.com/AmazonECR/latest/userguide/registry-permissions.html)
 * in the *Amazon Elastic Container Registry User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * Object policyText;
 * CfnRegistryPolicy cfnRegistryPolicy = CfnRegistryPolicy.Builder.create(this,
 * "MyCfnRegistryPolicy")
 * .policyText(policyText)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html)
 */
@CdkDslMarker
public class CfnRegistryPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRegistryPolicy.Builder = CfnRegistryPolicy.Builder.create(scope, id)

    /**
     * The JSON policy text for your registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html#cfn-ecr-registrypolicy-policytext)
     *
     * @param policyText The JSON policy text for your registry.
     */
    public fun policyText(policyText: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyText)
        cdkBuilder.policyText(builder.map)
    }

    /**
     * The JSON policy text for your registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html#cfn-ecr-registrypolicy-policytext)
     *
     * @param policyText The JSON policy text for your registry.
     */
    public fun policyText(policyText: Any) {
        cdkBuilder.policyText(policyText)
    }

    public fun build(): CfnRegistryPolicy = cdkBuilder.build()
}

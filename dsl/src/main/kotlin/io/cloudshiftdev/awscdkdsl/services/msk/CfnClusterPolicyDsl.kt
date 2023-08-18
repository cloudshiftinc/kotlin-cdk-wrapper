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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnClusterPolicy
import software.constructs.Construct

/**
 * Create or update cluster policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * Object policy;
 * CfnClusterPolicy cfnClusterPolicy = CfnClusterPolicy.Builder.create(this, "MyCfnClusterPolicy")
 * .clusterArn("clusterArn")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html)
 */
@CdkDslMarker
public class CfnClusterPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnClusterPolicy.Builder = CfnClusterPolicy.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html#cfn-msk-clusterpolicy-clusterarn)
     *
     * @param clusterArn The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     */
    public fun clusterArn(clusterArn: String) {
        cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * Resource policy for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html#cfn-msk-clusterpolicy-policy)
     *
     * @param policy Resource policy for the cluster.
     */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /**
     * Resource policy for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html#cfn-msk-clusterpolicy-policy)
     *
     * @param policy Resource policy for the cluster.
     */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun build(): CfnClusterPolicy = cdkBuilder.build()
}

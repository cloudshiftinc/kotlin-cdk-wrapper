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

package io.cloudshiftdev.awscdkdsl.services.mediapackagev2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy
import software.constructs.Construct

/**
 * Specifies the configuration parameters of a policy associated with a MediaPackage V2 origin
 * endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * Object policy;
 * CfnOriginEndpointPolicy cfnOriginEndpointPolicy = CfnOriginEndpointPolicy.Builder.create(this,
 * "MyCfnOriginEndpointPolicy")
 * .channelGroupName("channelGroupName")
 * .channelName("channelName")
 * .originEndpointName("originEndpointName")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html)
 */
@CdkDslMarker
public class CfnOriginEndpointPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOriginEndpointPolicy.Builder =
        CfnOriginEndpointPolicy.Builder.create(scope, id)

    /**
     * The name of the channel group associated with the origin endpoint policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-channelgroupname)
     *
     * @param channelGroupName The name of the channel group associated with the origin endpoint
     *   policy.
     */
    public fun channelGroupName(channelGroupName: String) {
        cdkBuilder.channelGroupName(channelGroupName)
    }

    /**
     * The channel name associated with the origin endpoint policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-channelname)
     *
     * @param channelName The channel name associated with the origin endpoint policy.
     */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /**
     * The name of the origin endpoint associated with the origin endpoint policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-originendpointname)
     *
     * @param originEndpointName The name of the origin endpoint associated with the origin endpoint
     *   policy.
     */
    public fun originEndpointName(originEndpointName: String) {
        cdkBuilder.originEndpointName(originEndpointName)
    }

    /**
     * The policy associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-policy)
     *
     * @param policy The policy associated with the origin endpoint.
     */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /**
     * The policy associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-policy)
     *
     * @param policy The policy associated with the origin endpoint.
     */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun build(): CfnOriginEndpointPolicy = cdkBuilder.build()
}

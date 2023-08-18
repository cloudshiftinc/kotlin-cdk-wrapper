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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnChannelPolicy
import software.constructs.Construct

/**
 * Definition of AWS::MediaTailor::ChannelPolicy Resource Type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * Object policy;
 * CfnChannelPolicy cfnChannelPolicy = CfnChannelPolicy.Builder.create(this, "MyCfnChannelPolicy")
 * .channelName("channelName")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html)
 */
@CdkDslMarker
public class CfnChannelPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnChannelPolicy.Builder = CfnChannelPolicy.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html#cfn-mediatailor-channelpolicy-channelname)
     *
     * @param channelName
     */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html#cfn-mediatailor-channelpolicy-policy)
     *
     * @param policy
     */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html#cfn-mediatailor-channelpolicy-policy)
     *
     * @param policy
     */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun build(): CfnChannelPolicy = cdkBuilder.build()
}

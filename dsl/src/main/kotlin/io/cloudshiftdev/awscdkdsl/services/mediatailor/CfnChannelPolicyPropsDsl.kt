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
import software.amazon.awscdk.services.mediatailor.CfnChannelPolicyProps

/**
 * Properties for defining a `CfnChannelPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * Object policy;
 * CfnChannelPolicyProps cfnChannelPolicyProps = CfnChannelPolicyProps.builder()
 * .channelName("channelName")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html)
 */
@CdkDslMarker
public class CfnChannelPolicyPropsDsl {
    private val cdkBuilder: CfnChannelPolicyProps.Builder = CfnChannelPolicyProps.builder()

    /** @param channelName the value to be set. */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /** @param policy the value to be set. */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /** @param policy the value to be set. */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun build(): CfnChannelPolicyProps = cdkBuilder.build()
}

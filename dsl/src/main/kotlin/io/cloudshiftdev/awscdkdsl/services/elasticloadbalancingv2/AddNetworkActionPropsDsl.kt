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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction

/**
 * Properties for adding a new action to a listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * NetworkListenerAction networkListenerAction;
 * AddNetworkActionProps addNetworkActionProps = AddNetworkActionProps.builder()
 * .action(networkListenerAction)
 * .build();
 * ```
 */
@CdkDslMarker
public class AddNetworkActionPropsDsl {
    private val cdkBuilder: AddNetworkActionProps.Builder = AddNetworkActionProps.builder()

    /** @param action Action to perform. */
    public fun action(action: NetworkListenerAction) {
        cdkBuilder.action(action)
    }

    public fun build(): AddNetworkActionProps = cdkBuilder.build()
}

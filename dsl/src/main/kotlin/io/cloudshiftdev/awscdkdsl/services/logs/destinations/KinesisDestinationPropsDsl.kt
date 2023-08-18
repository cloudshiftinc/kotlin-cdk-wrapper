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

package io.cloudshiftdev.awscdkdsl.services.logs.destinations

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps

/**
 * Customize the Kinesis Logs Destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.logs.destinations.*;
 * Role role;
 * KinesisDestinationProps kinesisDestinationProps = KinesisDestinationProps.builder()
 * .role(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class KinesisDestinationPropsDsl {
    private val cdkBuilder: KinesisDestinationProps.Builder = KinesisDestinationProps.builder()

    /** @param role The role to assume to write log events to the destination. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): KinesisDestinationProps = cdkBuilder.build()
}

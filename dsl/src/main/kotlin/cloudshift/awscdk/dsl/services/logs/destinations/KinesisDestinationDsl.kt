@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.logs.destinations

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.logs.destinations.KinesisDestination

@CdkDslMarker
public class KinesisDestinationDsl(
    stream: IStream,
) {
    private val cdkBuilder: KinesisDestination.Builder = KinesisDestination.Builder.create(stream)

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): KinesisDestination = cdkBuilder.build()
}

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

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup
import kotlin.String

@CdkDslMarker
public class CfnReplicationGroupKinesisFirehoseDestinationDetailsPropertyDsl {
    private val cdkBuilder: CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty.Builder =
        CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty.builder()

    public fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
    }

    public fun build(): CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty =
        cdkBuilder.build()
}

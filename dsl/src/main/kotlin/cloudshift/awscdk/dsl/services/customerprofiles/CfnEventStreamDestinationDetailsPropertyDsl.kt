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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.customerprofiles.CfnEventStream
import kotlin.String

@CdkDslMarker
public class CfnEventStreamDestinationDetailsPropertyDsl {
    private val cdkBuilder: CfnEventStream.DestinationDetailsProperty.Builder =
        CfnEventStream.DestinationDetailsProperty.builder()

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): CfnEventStream.DestinationDetailsProperty = cdkBuilder.build()
}

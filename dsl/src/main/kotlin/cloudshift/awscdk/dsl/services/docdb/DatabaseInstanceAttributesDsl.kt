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

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class DatabaseInstanceAttributesDsl {
    private val cdkBuilder: DatabaseInstanceAttributes.Builder = DatabaseInstanceAttributes.builder()

    public fun instanceEndpointAddress(instanceEndpointAddress: String) {
        cdkBuilder.instanceEndpointAddress(instanceEndpointAddress)
    }

    public fun instanceIdentifier(instanceIdentifier: String) {
        cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): DatabaseInstanceAttributes = cdkBuilder.build()
}

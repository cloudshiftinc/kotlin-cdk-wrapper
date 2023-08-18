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

package io.cloudshiftdev.awscdkdsl.services.docdb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes

/**
 * Properties that describe an existing instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdb.*;
 * DatabaseInstanceAttributes databaseInstanceAttributes = DatabaseInstanceAttributes.builder()
 * .instanceEndpointAddress("instanceEndpointAddress")
 * .instanceIdentifier("instanceIdentifier")
 * .port(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class DatabaseInstanceAttributesDsl {
    private val cdkBuilder: DatabaseInstanceAttributes.Builder =
        DatabaseInstanceAttributes.builder()

    /** @param instanceEndpointAddress The endpoint address. */
    public fun instanceEndpointAddress(instanceEndpointAddress: String) {
        cdkBuilder.instanceEndpointAddress(instanceEndpointAddress)
    }

    /** @param instanceIdentifier The instance identifier. */
    public fun instanceIdentifier(instanceIdentifier: String) {
        cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    /** @param port The database port. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): DatabaseInstanceAttributes = cdkBuilder.build()
}

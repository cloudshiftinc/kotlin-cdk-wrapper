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

package io.cloudshiftdev.awscdkdsl.services.athena

import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnCapacityReservation
import software.amazon.awscdk.services.athena.CfnWorkGroup

/** Assigns Athena workgroups (and hence their queries) to capacity reservations. */
public inline fun CfnCapacityReservation.setCapacityAssignmentConfiguration(
    block: CfnCapacityReservationCapacityAssignmentConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCapacityReservationCapacityAssignmentConfigurationPropertyDsl()
    builder.apply(block)
    return setCapacityAssignmentConfiguration(builder.build())
}

/**
 * The configuration of the workgroup, which includes the location in Amazon S3 where query results
 * are stored, the encryption option, if any, used for query results, whether Amazon CloudWatch
 * Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned (cutoff) per
 * query, if it is specified.
 */
public inline fun CfnWorkGroup.setWorkGroupConfiguration(
    block: CfnWorkGroupWorkGroupConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWorkGroupWorkGroupConfigurationPropertyDsl()
    builder.apply(block)
    return setWorkGroupConfiguration(builder.build())
}

/**
 * (deprecated) The configuration information that will be updated for this workgroup, which
 * includes the location in Amazon S3 where query results are stored, the encryption option, if any,
 * used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup,
 * whether the workgroup settings override the client-side settings, and the data usage limit for
 * the amount of bytes scanned per query, if it is specified.
 *
 * @deprecated this property has been deprecated
 */
public inline fun CfnWorkGroup.setWorkGroupConfigurationUpdates(
    block: CfnWorkGroupWorkGroupConfigurationUpdatesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWorkGroupWorkGroupConfigurationUpdatesPropertyDsl()
    builder.apply(block)
    return setWorkGroupConfigurationUpdates(builder.build())
}

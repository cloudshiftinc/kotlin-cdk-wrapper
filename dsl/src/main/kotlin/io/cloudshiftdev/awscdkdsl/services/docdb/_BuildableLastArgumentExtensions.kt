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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseCluster
import software.amazon.awscdk.services.secretsmanager.SecretRotation

/**
 * Adds the multi user rotation to this cluster.
 *
 * @param id
 * @param options
 */
public inline fun DatabaseCluster.addRotationMultiUser(
    id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}
): SecretRotation {
    val builder = RotationMultiUserOptionsDsl()
    builder.apply(block)
    return addRotationMultiUser(id, builder.build())
}

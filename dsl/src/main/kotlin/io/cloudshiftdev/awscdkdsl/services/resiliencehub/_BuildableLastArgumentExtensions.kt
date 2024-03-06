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

package io.cloudshiftdev.awscdkdsl.services.resiliencehub

import kotlin.Unit
import software.amazon.awscdk.services.resiliencehub.CfnApp

/**
 * Defines the roles and credentials that AWS Resilience Hub would use while creating the
 * application, importing its resources, and running an assessment.
 */
public inline fun CfnApp.setPermissionModel(
    block: CfnAppPermissionModelPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAppPermissionModelPropertyDsl()
    builder.apply(block)
    return setPermissionModel(builder.build())
}

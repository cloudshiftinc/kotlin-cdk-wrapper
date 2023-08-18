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

package io.cloudshiftdev.awscdkdsl.services.workspaces

import kotlin.Unit
import software.amazon.awscdk.services.workspaces.CfnWorkspace

/** The WorkSpace properties. */
public inline fun CfnWorkspace.setWorkspaceProperties(
    block: CfnWorkspaceWorkspacePropertiesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWorkspaceWorkspacePropertiesPropertyDsl()
    builder.apply(block)
    return setWorkspaceProperties(builder.build())
}

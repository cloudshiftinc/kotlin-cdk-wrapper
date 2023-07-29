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

package cloudshift.awscdk.dsl.services.aps

import kotlin.Unit
import software.amazon.awscdk.services.aps.CfnWorkspace

/**
 * The LoggingConfiguration attribute is used to set the logging configuration for the workspace.
 */
public inline fun CfnWorkspace.setLoggingConfiguration(
    block: CfnWorkspaceLoggingConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWorkspaceLoggingConfigurationPropertyDsl()
    builder.apply(block)
    return setLoggingConfiguration(builder.build())
}

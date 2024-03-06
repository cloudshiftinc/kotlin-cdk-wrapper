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

package io.cloudshiftdev.awscdkdsl.services.workspacesweb

import kotlin.Unit
import software.amazon.awscdk.services.workspacesweb.CfnUserSettings

/**
 * The configuration that specifies which cookies should be synchronized from the end user's local
 * browser to the remote browser.
 */
public inline fun CfnUserSettings.setCookieSynchronizationConfiguration(
    block: CfnUserSettingsCookieSynchronizationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserSettingsCookieSynchronizationConfigurationPropertyDsl()
    builder.apply(block)
    return setCookieSynchronizationConfiguration(builder.build())
}

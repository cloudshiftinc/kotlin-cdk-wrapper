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

package io.cloudshiftdev.awscdkdsl.services.grafana

import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace

/** The configuration settings for network access to your workspace. */
public inline fun CfnWorkspace.setNetworkAccessControl(
    block: CfnWorkspaceNetworkAccessControlPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWorkspaceNetworkAccessControlPropertyDsl()
    builder.apply(block)
    return setNetworkAccessControl(builder.build())
}

/**
 * If the workspace uses SAML, use this structure to map SAML assertion attributes to workspace user
 * information and define which groups in the assertion attribute are to have the `Admin` and
 * `Editor` roles in the workspace.
 */
public inline fun CfnWorkspace.setSamlConfiguration(
    block: CfnWorkspaceSamlConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWorkspaceSamlConfigurationPropertyDsl()
    builder.apply(block)
    return setSamlConfiguration(builder.build())
}

/**
 * The configuration settings for an Amazon VPC that contains data sources for your Grafana
 * workspace to connect to.
 */
public inline fun CfnWorkspace.setVpcConfiguration(
    block: CfnWorkspaceVpcConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnWorkspaceVpcConfigurationPropertyDsl()
    builder.apply(block)
    return setVpcConfiguration(builder.build())
}

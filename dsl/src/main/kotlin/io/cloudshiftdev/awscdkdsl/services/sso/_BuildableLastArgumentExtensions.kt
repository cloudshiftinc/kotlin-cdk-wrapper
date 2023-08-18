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

package io.cloudshiftdev.awscdkdsl.services.sso

import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration
import software.amazon.awscdk.services.sso.CfnPermissionSet

/**
 * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but is
 * still supported for backwards compatibility purposes.
 *
 * @deprecated this property has been deprecated
 */
public inline fun CfnInstanceAccessControlAttributeConfiguration
    .setInstanceAccessControlAttributeConfiguration(
    block:
        CfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationPropertyDsl.(
        ) -> Unit =
        {}
) {
    val builder =
        CfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationPropertyDsl()
    builder.apply(block)
    return setInstanceAccessControlAttributeConfiguration(builder.build())
}

/**
 * Specifies the configuration of the AWS managed or customer managed policy that you want to set as
 * a permissions boundary.
 */
public inline fun CfnPermissionSet.setPermissionsBoundary(
    block: CfnPermissionSetPermissionsBoundaryPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPermissionSetPermissionsBoundaryPropertyDsl()
    builder.apply(block)
    return setPermissionsBoundary(builder.build())
}

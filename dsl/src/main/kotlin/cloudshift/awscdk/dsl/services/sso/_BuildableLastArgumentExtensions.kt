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

package cloudshift.awscdk.dsl.services.sso

import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration
import software.amazon.awscdk.services.sso.CfnPermissionSet
import kotlin.Unit

public inline fun CfnPermissionSet.setPermissionsBoundary(
    block: CfnPermissionSetPermissionsBoundaryPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnPermissionSetPermissionsBoundaryPropertyDsl()
    builder.apply(block)
    return setPermissionsBoundary(builder.build())
}

public inline fun CfnInstanceAccessControlAttributeConfiguration.setInstanceAccessControlAttributeConfiguration(
    block: CfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder =
        CfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationPropertyDsl()
    builder.apply(block)
    return setInstanceAccessControlAttributeConfiguration(builder.build())
}

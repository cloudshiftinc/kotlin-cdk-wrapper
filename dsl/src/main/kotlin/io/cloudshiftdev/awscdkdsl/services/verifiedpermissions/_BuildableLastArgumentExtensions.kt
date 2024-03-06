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

package io.cloudshiftdev.awscdkdsl.services.verifiedpermissions

import kotlin.Unit
import software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicy
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore

/** Contains configuration information used when creating a new identity source. */
public inline fun CfnIdentitySource.setConfiguration(
    block: CfnIdentitySourceIdentitySourceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnIdentitySourceIdentitySourceConfigurationPropertyDsl()
    builder.apply(block)
    return setConfiguration(builder.build())
}

/** Specifies the policy type and content to use for the new or updated policy. */
public inline fun CfnPolicy.setDefinition(
    block: CfnPolicyPolicyDefinitionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPolicyPolicyDefinitionPropertyDsl()
    builder.apply(block)
    return setDefinition(builder.build())
}

/** Creates or updates the policy schema in a policy store. */
public inline fun CfnPolicyStore.setSchema(
    block: CfnPolicyStoreSchemaDefinitionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPolicyStoreSchemaDefinitionPropertyDsl()
    builder.apply(block)
    return setSchema(builder.build())
}

/** Specifies the validation setting for this policy store. */
public inline fun CfnPolicyStore.setValidationSettings(
    block: CfnPolicyStoreValidationSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPolicyStoreValidationSettingsPropertyDsl()
    builder.apply(block)
    return setValidationSettings(builder.build())
}

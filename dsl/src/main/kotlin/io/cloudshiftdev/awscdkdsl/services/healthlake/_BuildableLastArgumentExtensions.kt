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

package io.cloudshiftdev.awscdkdsl.services.healthlake

import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

/** The identity provider configuration that you gave when the data store was created. */
public inline fun CfnFHIRDatastore.setIdentityProviderConfiguration(
    block: CfnFHIRDatastoreIdentityProviderConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFHIRDatastoreIdentityProviderConfigurationPropertyDsl()
    builder.apply(block)
    return setIdentityProviderConfiguration(builder.build())
}

/** The preloaded data configuration for the data store. */
public inline fun CfnFHIRDatastore.setPreloadDataConfig(
    block: CfnFHIRDatastorePreloadDataConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFHIRDatastorePreloadDataConfigPropertyDsl()
    builder.apply(block)
    return setPreloadDataConfig(builder.build())
}

/**
 * The server-side encryption key configuration for a customer provided encryption key specified for
 * creating a data store.
 */
public inline fun CfnFHIRDatastore.setSseConfiguration(
    block: CfnFHIRDatastoreSseConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFHIRDatastoreSseConfigurationPropertyDsl()
    builder.apply(block)
    return setSseConfiguration(builder.build())
}

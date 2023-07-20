@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.healthlake

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps
import software.constructs.Construct

public object healthlake {
  public inline fun cfnFHIRDatastore(
    scope: Construct,
    id: String,
    block: CfnFHIRDatastoreDsl.() -> Unit = {},
  ): CfnFHIRDatastore {
    val builder = CfnFHIRDatastoreDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFHIRDatastoreCreatedAtProperty(block: CfnFHIRDatastoreCreatedAtPropertyDsl.() -> Unit =
      {}): CfnFHIRDatastore.CreatedAtProperty {
    val builder = CfnFHIRDatastoreCreatedAtPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFHIRDatastoreIdentityProviderConfigurationProperty(block: CfnFHIRDatastoreIdentityProviderConfigurationPropertyDsl.() -> Unit
      = {}): CfnFHIRDatastore.IdentityProviderConfigurationProperty {
    val builder = CfnFHIRDatastoreIdentityProviderConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFHIRDatastoreKmsEncryptionConfigProperty(block: CfnFHIRDatastoreKmsEncryptionConfigPropertyDsl.() -> Unit
      = {}): CfnFHIRDatastore.KmsEncryptionConfigProperty {
    val builder = CfnFHIRDatastoreKmsEncryptionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFHIRDatastorePreloadDataConfigProperty(block: CfnFHIRDatastorePreloadDataConfigPropertyDsl.() -> Unit
      = {}): CfnFHIRDatastore.PreloadDataConfigProperty {
    val builder = CfnFHIRDatastorePreloadDataConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFHIRDatastoreProps(block: CfnFHIRDatastorePropsDsl.() -> Unit = {}):
      CfnFHIRDatastoreProps {
    val builder = CfnFHIRDatastorePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFHIRDatastoreSseConfigurationProperty(block: CfnFHIRDatastoreSseConfigurationPropertyDsl.() -> Unit
      = {}): CfnFHIRDatastore.SseConfigurationProperty {
    val builder = CfnFHIRDatastoreSseConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}

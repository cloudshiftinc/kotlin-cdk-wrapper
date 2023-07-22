@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.healthlake

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps
import software.constructs.Construct

public object healthlake {
  /**
   * Creates a Data Store that can ingest and export FHIR formatted data.
   *
   *
   * Please note that when a user tries to do an Update operation via CloudFormation, changes to the
   * Data Store name, Type Version, PreloadDataConfig, or SSEConfiguration will delete their existing
   * Data Store for the stack and create a new one. This will lead to potential loss of data.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.healthlake.*;
   * CfnFHIRDatastore cfnFHIRDatastore = CfnFHIRDatastore.Builder.create(this, "MyCfnFHIRDatastore")
   * .datastoreTypeVersion("datastoreTypeVersion")
   * // the properties below are optional
   * .datastoreName("datastoreName")
   * .identityProviderConfiguration(IdentityProviderConfigurationProperty.builder()
   * .authorizationStrategy("authorizationStrategy")
   * // the properties below are optional
   * .fineGrainedAuthorizationEnabled(false)
   * .idpLambdaArn("idpLambdaArn")
   * .metadata("metadata")
   * .build())
   * .preloadDataConfig(PreloadDataConfigProperty.builder()
   * .preloadDataType("preloadDataType")
   * .build())
   * .sseConfiguration(SseConfigurationProperty.builder()
   * .kmsEncryptionConfig(KmsEncryptionConfigProperty.builder()
   * .cmkType("cmkType")
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .build())
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html)
   */
  public inline fun cfnFHIRDatastore(
    scope: Construct,
    id: String,
    block: CfnFHIRDatastoreDsl.() -> Unit = {},
  ): CfnFHIRDatastore {
    val builder = CfnFHIRDatastoreDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The time that a Data Store was created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.healthlake.*;
   * CreatedAtProperty createdAtProperty = CreatedAtProperty.builder()
   * .nanos(123)
   * .seconds("seconds")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-createdat.html)
   */
  public inline
      fun cfnFHIRDatastoreCreatedAtProperty(block: CfnFHIRDatastoreCreatedAtPropertyDsl.() -> Unit =
      {}): CfnFHIRDatastore.CreatedAtProperty {
    val builder = CfnFHIRDatastoreCreatedAtPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.healthlake.*;
   * IdentityProviderConfigurationProperty identityProviderConfigurationProperty =
   * IdentityProviderConfigurationProperty.builder()
   * .authorizationStrategy("authorizationStrategy")
   * // the properties below are optional
   * .fineGrainedAuthorizationEnabled(false)
   * .idpLambdaArn("idpLambdaArn")
   * .metadata("metadata")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-identityproviderconfiguration.html)
   */
  public inline
      fun cfnFHIRDatastoreIdentityProviderConfigurationProperty(block: CfnFHIRDatastoreIdentityProviderConfigurationPropertyDsl.() -> Unit
      = {}): CfnFHIRDatastore.IdentityProviderConfigurationProperty {
    val builder = CfnFHIRDatastoreIdentityProviderConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The customer-managed-key(CMK) used when creating a Data Store.
   *
   * If a customer owned key is not specified, an Amazon owned key will be used for encryption.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.healthlake.*;
   * KmsEncryptionConfigProperty kmsEncryptionConfigProperty = KmsEncryptionConfigProperty.builder()
   * .cmkType("cmkType")
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-kmsencryptionconfig.html)
   */
  public inline
      fun cfnFHIRDatastoreKmsEncryptionConfigProperty(block: CfnFHIRDatastoreKmsEncryptionConfigPropertyDsl.() -> Unit
      = {}): CfnFHIRDatastore.KmsEncryptionConfigProperty {
    val builder = CfnFHIRDatastoreKmsEncryptionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Optional parameter to preload data upon creation of the Data Store.
   *
   * Currently, the only supported preloaded data is synthetic data generated from Synthea.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.healthlake.*;
   * PreloadDataConfigProperty preloadDataConfigProperty = PreloadDataConfigProperty.builder()
   * .preloadDataType("preloadDataType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-preloaddataconfig.html)
   */
  public inline
      fun cfnFHIRDatastorePreloadDataConfigProperty(block: CfnFHIRDatastorePreloadDataConfigPropertyDsl.() -> Unit
      = {}): CfnFHIRDatastore.PreloadDataConfigProperty {
    val builder = CfnFHIRDatastorePreloadDataConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnFHIRDatastore`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.healthlake.*;
   * CfnFHIRDatastoreProps cfnFHIRDatastoreProps = CfnFHIRDatastoreProps.builder()
   * .datastoreTypeVersion("datastoreTypeVersion")
   * // the properties below are optional
   * .datastoreName("datastoreName")
   * .identityProviderConfiguration(IdentityProviderConfigurationProperty.builder()
   * .authorizationStrategy("authorizationStrategy")
   * // the properties below are optional
   * .fineGrainedAuthorizationEnabled(false)
   * .idpLambdaArn("idpLambdaArn")
   * .metadata("metadata")
   * .build())
   * .preloadDataConfig(PreloadDataConfigProperty.builder()
   * .preloadDataType("preloadDataType")
   * .build())
   * .sseConfiguration(SseConfigurationProperty.builder()
   * .kmsEncryptionConfig(KmsEncryptionConfigProperty.builder()
   * .cmkType("cmkType")
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .build())
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html)
   */
  public inline fun cfnFHIRDatastoreProps(block: CfnFHIRDatastorePropsDsl.() -> Unit = {}):
      CfnFHIRDatastoreProps {
    val builder = CfnFHIRDatastorePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The server-side encryption key configuration for a customer provided encryption key.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.healthlake.*;
   * SseConfigurationProperty sseConfigurationProperty = SseConfigurationProperty.builder()
   * .kmsEncryptionConfig(KmsEncryptionConfigProperty.builder()
   * .cmkType("cmkType")
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-sseconfiguration.html)
   */
  public inline
      fun cfnFHIRDatastoreSseConfigurationProperty(block: CfnFHIRDatastoreSseConfigurationPropertyDsl.() -> Unit
      = {}): CfnFHIRDatastore.SseConfigurationProperty {
    val builder = CfnFHIRDatastoreSseConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}

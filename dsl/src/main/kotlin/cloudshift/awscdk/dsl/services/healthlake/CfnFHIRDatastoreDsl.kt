@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore
import software.constructs.Construct

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
@CdkDslMarker
public class CfnFHIRDatastoreDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFHIRDatastore.Builder = CfnFHIRDatastore.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The user generated name for the Data Store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-datastorename)
   * @param datastoreName The user generated name for the Data Store. 
   */
  public fun datastoreName(datastoreName: String) {
    cdkBuilder.datastoreName(datastoreName)
  }

  /**
   * The FHIR version of the Data Store.
   *
   * The only supported version is R4.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-datastoretypeversion)
   * @param datastoreTypeVersion The FHIR version of the Data Store. 
   */
  public fun datastoreTypeVersion(datastoreTypeVersion: String) {
    cdkBuilder.datastoreTypeVersion(datastoreTypeVersion)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration)
   * @param identityProviderConfiguration 
   */
  public fun identityProviderConfiguration(identityProviderConfiguration: IResolvable) {
    cdkBuilder.identityProviderConfiguration(identityProviderConfiguration)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration)
   * @param identityProviderConfiguration 
   */
  public
      fun identityProviderConfiguration(identityProviderConfiguration: CfnFHIRDatastore.IdentityProviderConfigurationProperty) {
    cdkBuilder.identityProviderConfiguration(identityProviderConfiguration)
  }

  /**
   * The preloaded data configuration for the Data Store.
   *
   * Only data preloaded from Synthea is supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-preloaddataconfig)
   * @param preloadDataConfig The preloaded data configuration for the Data Store. 
   */
  public fun preloadDataConfig(preloadDataConfig: IResolvable) {
    cdkBuilder.preloadDataConfig(preloadDataConfig)
  }

  /**
   * The preloaded data configuration for the Data Store.
   *
   * Only data preloaded from Synthea is supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-preloaddataconfig)
   * @param preloadDataConfig The preloaded data configuration for the Data Store. 
   */
  public fun preloadDataConfig(preloadDataConfig: CfnFHIRDatastore.PreloadDataConfigProperty) {
    cdkBuilder.preloadDataConfig(preloadDataConfig)
  }

  /**
   * The server-side encryption key configuration for a customer provided encryption key specified
   * for creating a Data Store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-sseconfiguration)
   * @param sseConfiguration The server-side encryption key configuration for a customer provided
   * encryption key specified for creating a Data Store. 
   */
  public fun sseConfiguration(sseConfiguration: IResolvable) {
    cdkBuilder.sseConfiguration(sseConfiguration)
  }

  /**
   * The server-side encryption key configuration for a customer provided encryption key specified
   * for creating a Data Store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-sseconfiguration)
   * @param sseConfiguration The server-side encryption key configuration for a customer provided
   * encryption key specified for creating a Data Store. 
   */
  public fun sseConfiguration(sseConfiguration: CfnFHIRDatastore.SseConfigurationProperty) {
    cdkBuilder.sseConfiguration(sseConfiguration)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFHIRDatastore {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

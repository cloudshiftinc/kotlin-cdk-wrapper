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
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps

/**
 * Properties for defining a `CfnFHIRDatastore`.
 *
 * Example:
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
@CdkDslMarker
public class CfnFHIRDatastorePropsDsl {
    private val cdkBuilder: CfnFHIRDatastoreProps.Builder = CfnFHIRDatastoreProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param datastoreName The user generated name for the Data Store. */
    public fun datastoreName(datastoreName: String) {
        cdkBuilder.datastoreName(datastoreName)
    }

    /**
     * @param datastoreTypeVersion The FHIR version of the Data Store. The only supported version is
     *   R4.
     */
    public fun datastoreTypeVersion(datastoreTypeVersion: String) {
        cdkBuilder.datastoreTypeVersion(datastoreTypeVersion)
    }

    /** @param identityProviderConfiguration the value to be set. */
    public fun identityProviderConfiguration(identityProviderConfiguration: IResolvable) {
        cdkBuilder.identityProviderConfiguration(identityProviderConfiguration)
    }

    /** @param identityProviderConfiguration the value to be set. */
    public fun identityProviderConfiguration(
        identityProviderConfiguration: CfnFHIRDatastore.IdentityProviderConfigurationProperty
    ) {
        cdkBuilder.identityProviderConfiguration(identityProviderConfiguration)
    }

    /**
     * @param preloadDataConfig The preloaded data configuration for the Data Store. Only data
     *   preloaded from Synthea is supported.
     */
    public fun preloadDataConfig(preloadDataConfig: IResolvable) {
        cdkBuilder.preloadDataConfig(preloadDataConfig)
    }

    /**
     * @param preloadDataConfig The preloaded data configuration for the Data Store. Only data
     *   preloaded from Synthea is supported.
     */
    public fun preloadDataConfig(preloadDataConfig: CfnFHIRDatastore.PreloadDataConfigProperty) {
        cdkBuilder.preloadDataConfig(preloadDataConfig)
    }

    /**
     * @param sseConfiguration The server-side encryption key configuration for a customer provided
     *   encryption key specified for creating a Data Store.
     */
    public fun sseConfiguration(sseConfiguration: IResolvable) {
        cdkBuilder.sseConfiguration(sseConfiguration)
    }

    /**
     * @param sseConfiguration The server-side encryption key configuration for a customer provided
     *   encryption key specified for creating a Data Store.
     */
    public fun sseConfiguration(sseConfiguration: CfnFHIRDatastore.SseConfigurationProperty) {
        cdkBuilder.sseConfiguration(sseConfiguration)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFHIRDatastoreProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

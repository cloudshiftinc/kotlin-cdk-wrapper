@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.healthlake

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFHIRDatastore`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.healthlake.*;
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
public interface CfnFHIRDatastoreProps {
  /**
   * The data store name (user-generated).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-datastorename)
   */
  public fun datastoreName(): String? = unwrap(this).getDatastoreName()

  /**
   * The FHIR release version supported by the data store.
   *
   * Current support is for version `R4` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-datastoretypeversion)
   */
  public fun datastoreTypeVersion(): String

  /**
   * The identity provider configuration selected when the data store was created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration)
   */
  public fun identityProviderConfiguration(): Any? = unwrap(this).getIdentityProviderConfiguration()

  /**
   * The preloaded Synthea data configuration for the data store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-preloaddataconfig)
   */
  public fun preloadDataConfig(): Any? = unwrap(this).getPreloadDataConfig()

  /**
   * The server-side encryption key configuration for a customer-provided encryption key specified
   * for creating a data store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-sseconfiguration)
   */
  public fun sseConfiguration(): Any? = unwrap(this).getSseConfiguration()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFHIRDatastoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param datastoreName The data store name (user-generated).
     */
    public fun datastoreName(datastoreName: String)

    /**
     * @param datastoreTypeVersion The FHIR release version supported by the data store. 
     * Current support is for version `R4` .
     */
    public fun datastoreTypeVersion(datastoreTypeVersion: String)

    /**
     * @param identityProviderConfiguration The identity provider configuration selected when the
     * data store was created.
     */
    public fun identityProviderConfiguration(identityProviderConfiguration: IResolvable)

    /**
     * @param identityProviderConfiguration The identity provider configuration selected when the
     * data store was created.
     */
    public
        fun identityProviderConfiguration(identityProviderConfiguration: CfnFHIRDatastore.IdentityProviderConfigurationProperty)

    /**
     * @param identityProviderConfiguration The identity provider configuration selected when the
     * data store was created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45755fdf68254141e2b75c6c8cccefe78b8ed2d1f3426f0340d49596a8a3754e")
    public
        fun identityProviderConfiguration(identityProviderConfiguration: CfnFHIRDatastore.IdentityProviderConfigurationProperty.Builder.() -> Unit)

    /**
     * @param preloadDataConfig The preloaded Synthea data configuration for the data store.
     */
    public fun preloadDataConfig(preloadDataConfig: IResolvable)

    /**
     * @param preloadDataConfig The preloaded Synthea data configuration for the data store.
     */
    public fun preloadDataConfig(preloadDataConfig: CfnFHIRDatastore.PreloadDataConfigProperty)

    /**
     * @param preloadDataConfig The preloaded Synthea data configuration for the data store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a132be8301b86ccda20d3511b8b35da5cd9714d6d6004087e3050216cdb2299c")
    public
        fun preloadDataConfig(preloadDataConfig: CfnFHIRDatastore.PreloadDataConfigProperty.Builder.() -> Unit)

    /**
     * @param sseConfiguration The server-side encryption key configuration for a customer-provided
     * encryption key specified for creating a data store.
     */
    public fun sseConfiguration(sseConfiguration: IResolvable)

    /**
     * @param sseConfiguration The server-side encryption key configuration for a customer-provided
     * encryption key specified for creating a data store.
     */
    public fun sseConfiguration(sseConfiguration: CfnFHIRDatastore.SseConfigurationProperty)

    /**
     * @param sseConfiguration The server-side encryption key configuration for a customer-provided
     * encryption key specified for creating a data store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68bf6021640c6faa3c708d58dcad10fdd4c4fb0ed08b9173028476b4723a5de3")
    public
        fun sseConfiguration(sseConfiguration: CfnFHIRDatastore.SseConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps.Builder
        = software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps.builder()

    /**
     * @param datastoreName The data store name (user-generated).
     */
    override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    /**
     * @param datastoreTypeVersion The FHIR release version supported by the data store. 
     * Current support is for version `R4` .
     */
    override fun datastoreTypeVersion(datastoreTypeVersion: String) {
      cdkBuilder.datastoreTypeVersion(datastoreTypeVersion)
    }

    /**
     * @param identityProviderConfiguration The identity provider configuration selected when the
     * data store was created.
     */
    override fun identityProviderConfiguration(identityProviderConfiguration: IResolvable) {
      cdkBuilder.identityProviderConfiguration(identityProviderConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param identityProviderConfiguration The identity provider configuration selected when the
     * data store was created.
     */
    override
        fun identityProviderConfiguration(identityProviderConfiguration: CfnFHIRDatastore.IdentityProviderConfigurationProperty) {
      cdkBuilder.identityProviderConfiguration(identityProviderConfiguration.let(CfnFHIRDatastore.IdentityProviderConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param identityProviderConfiguration The identity provider configuration selected when the
     * data store was created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45755fdf68254141e2b75c6c8cccefe78b8ed2d1f3426f0340d49596a8a3754e")
    override
        fun identityProviderConfiguration(identityProviderConfiguration: CfnFHIRDatastore.IdentityProviderConfigurationProperty.Builder.() -> Unit):
        Unit =
        identityProviderConfiguration(CfnFHIRDatastore.IdentityProviderConfigurationProperty(identityProviderConfiguration))

    /**
     * @param preloadDataConfig The preloaded Synthea data configuration for the data store.
     */
    override fun preloadDataConfig(preloadDataConfig: IResolvable) {
      cdkBuilder.preloadDataConfig(preloadDataConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param preloadDataConfig The preloaded Synthea data configuration for the data store.
     */
    override fun preloadDataConfig(preloadDataConfig: CfnFHIRDatastore.PreloadDataConfigProperty) {
      cdkBuilder.preloadDataConfig(preloadDataConfig.let(CfnFHIRDatastore.PreloadDataConfigProperty.Companion::unwrap))
    }

    /**
     * @param preloadDataConfig The preloaded Synthea data configuration for the data store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a132be8301b86ccda20d3511b8b35da5cd9714d6d6004087e3050216cdb2299c")
    override
        fun preloadDataConfig(preloadDataConfig: CfnFHIRDatastore.PreloadDataConfigProperty.Builder.() -> Unit):
        Unit = preloadDataConfig(CfnFHIRDatastore.PreloadDataConfigProperty(preloadDataConfig))

    /**
     * @param sseConfiguration The server-side encryption key configuration for a customer-provided
     * encryption key specified for creating a data store.
     */
    override fun sseConfiguration(sseConfiguration: IResolvable) {
      cdkBuilder.sseConfiguration(sseConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sseConfiguration The server-side encryption key configuration for a customer-provided
     * encryption key specified for creating a data store.
     */
    override fun sseConfiguration(sseConfiguration: CfnFHIRDatastore.SseConfigurationProperty) {
      cdkBuilder.sseConfiguration(sseConfiguration.let(CfnFHIRDatastore.SseConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param sseConfiguration The server-side encryption key configuration for a customer-provided
     * encryption key specified for creating a data store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68bf6021640c6faa3c708d58dcad10fdd4c4fb0ed08b9173028476b4723a5de3")
    override
        fun sseConfiguration(sseConfiguration: CfnFHIRDatastore.SseConfigurationProperty.Builder.() -> Unit):
        Unit = sseConfiguration(CfnFHIRDatastore.SseConfigurationProperty(sseConfiguration))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps,
  ) : CdkObject(cdkObject),
      CfnFHIRDatastoreProps {
    /**
     * The data store name (user-generated).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-datastorename)
     */
    override fun datastoreName(): String? = unwrap(this).getDatastoreName()

    /**
     * The FHIR release version supported by the data store.
     *
     * Current support is for version `R4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-datastoretypeversion)
     */
    override fun datastoreTypeVersion(): String = unwrap(this).getDatastoreTypeVersion()

    /**
     * The identity provider configuration selected when the data store was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration)
     */
    override fun identityProviderConfiguration(): Any? =
        unwrap(this).getIdentityProviderConfiguration()

    /**
     * The preloaded Synthea data configuration for the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-preloaddataconfig)
     */
    override fun preloadDataConfig(): Any? = unwrap(this).getPreloadDataConfig()

    /**
     * The server-side encryption key configuration for a customer-provided encryption key specified
     * for creating a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-sseconfiguration)
     */
    override fun sseConfiguration(): Any? = unwrap(this).getSseConfiguration()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFHIRDatastoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps):
        CfnFHIRDatastoreProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFHIRDatastoreProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFHIRDatastoreProps):
        software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.healthlake.CfnFHIRDatastoreProps
  }
}

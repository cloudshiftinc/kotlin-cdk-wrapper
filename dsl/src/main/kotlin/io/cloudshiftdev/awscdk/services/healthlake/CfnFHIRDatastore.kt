package io.cloudshiftdev.awscdk.services.healthlake

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFHIRDatastore internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The time that a Data Store was created.
   */
  public open fun attrCreatedAt(): IResolvable =
      unwrap(this).getAttrCreatedAt().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrCreatedAtNanos(): Number = unwrap(this).getAttrCreatedAtNanos()

  /**
   *
   */
  public open fun attrCreatedAtSeconds(): String = unwrap(this).getAttrCreatedAtSeconds()

  /**
   * The Data Store ARN is generated during the creation of the Data Store and can be found in the
   * output from the initial Data Store creation request.
   */
  public open fun attrDatastoreArn(): String = unwrap(this).getAttrDatastoreArn()

  /**
   * The endpoint for the created Data Store.
   */
  public open fun attrDatastoreEndpoint(): String = unwrap(this).getAttrDatastoreEndpoint()

  /**
   * The Amazon generated Data Store id.
   *
   * This id is in the output from the initial Data Store creation call.
   */
  public open fun attrDatastoreId(): String = unwrap(this).getAttrDatastoreId()

  /**
   * The status of the FHIR Data Store.
   *
   * Possible statuses are ‘CREATING’, ‘ACTIVE’, ‘DELETING’, ‘DELETED’.
   */
  public open fun attrDatastoreStatus(): String = unwrap(this).getAttrDatastoreStatus()

  /**
   * The user generated name for the data store.
   */
  public open fun datastoreName(): String? = unwrap(this).getDatastoreName()

  /**
   * The user generated name for the data store.
   */
  public open fun datastoreName(`value`: String) {
    unwrap(this).setDatastoreName(`value`)
  }

  /**
   * The FHIR version of the data store.
   */
  public open fun datastoreTypeVersion(): String = unwrap(this).getDatastoreTypeVersion()

  /**
   * The FHIR version of the data store.
   */
  public open fun datastoreTypeVersion(`value`: String) {
    unwrap(this).setDatastoreTypeVersion(`value`)
  }

  /**
   * The identity provider configuration that you gave when the data store was created.
   */
  public open fun identityProviderConfiguration(): Any? =
      unwrap(this).getIdentityProviderConfiguration()

  /**
   * The identity provider configuration that you gave when the data store was created.
   */
  public open fun identityProviderConfiguration(`value`: IResolvable) {
    unwrap(this).setIdentityProviderConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The identity provider configuration that you gave when the data store was created.
   */
  public open fun identityProviderConfiguration(`value`: IdentityProviderConfigurationProperty) {
    unwrap(this).setIdentityProviderConfiguration(`value`.let(IdentityProviderConfigurationProperty::unwrap))
  }

  /**
   * The identity provider configuration that you gave when the data store was created.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c59b927899bad6099026fcb7d2328d2122456f4ea7d2e06c6ea513861c813813")
  public open
      fun identityProviderConfiguration(`value`: IdentityProviderConfigurationProperty.Builder.() -> Unit):
      Unit = identityProviderConfiguration(IdentityProviderConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The preloaded data configuration for the data store.
   */
  public open fun preloadDataConfig(): Any? = unwrap(this).getPreloadDataConfig()

  /**
   * The preloaded data configuration for the data store.
   */
  public open fun preloadDataConfig(`value`: IResolvable) {
    unwrap(this).setPreloadDataConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The preloaded data configuration for the data store.
   */
  public open fun preloadDataConfig(`value`: PreloadDataConfigProperty) {
    unwrap(this).setPreloadDataConfig(`value`.let(PreloadDataConfigProperty::unwrap))
  }

  /**
   * The preloaded data configuration for the data store.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b14710e249703a79b742ddb36815ed3a08c54cc20543e86a9f152648d553b6ac")
  public open fun preloadDataConfig(`value`: PreloadDataConfigProperty.Builder.() -> Unit): Unit =
      preloadDataConfig(PreloadDataConfigProperty(`value`))

  /**
   * The server-side encryption key configuration for a customer provided encryption key specified
   * for creating a data store.
   */
  public open fun sseConfiguration(): Any? = unwrap(this).getSseConfiguration()

  /**
   * The server-side encryption key configuration for a customer provided encryption key specified
   * for creating a data store.
   */
  public open fun sseConfiguration(`value`: IResolvable) {
    unwrap(this).setSseConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The server-side encryption key configuration for a customer provided encryption key specified
   * for creating a data store.
   */
  public open fun sseConfiguration(`value`: SseConfigurationProperty) {
    unwrap(this).setSseConfiguration(`value`.let(SseConfigurationProperty::unwrap))
  }

  /**
   * The server-side encryption key configuration for a customer provided encryption key specified
   * for creating a data store.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5011c12f035b6e57185c02cc426133032cc13191663743a3c61e4fed9610158e")
  public open fun sseConfiguration(`value`: SseConfigurationProperty.Builder.() -> Unit): Unit =
      sseConfiguration(SseConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.healthlake.CfnFHIRDatastore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The user generated name for the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-datastorename)
     * @param datastoreName The user generated name for the data store. 
     */
    public fun datastoreName(datastoreName: String)

    /**
     * The FHIR version of the data store.
     *
     * The only supported version is R4.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-datastoretypeversion)
     * @param datastoreTypeVersion The FHIR version of the data store. 
     */
    public fun datastoreTypeVersion(datastoreTypeVersion: String)

    /**
     * The identity provider configuration that you gave when the data store was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration)
     * @param identityProviderConfiguration The identity provider configuration that you gave when
     * the data store was created. 
     */
    public fun identityProviderConfiguration(identityProviderConfiguration: IResolvable)

    /**
     * The identity provider configuration that you gave when the data store was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration)
     * @param identityProviderConfiguration The identity provider configuration that you gave when
     * the data store was created. 
     */
    public
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty)

    /**
     * The identity provider configuration that you gave when the data store was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration)
     * @param identityProviderConfiguration The identity provider configuration that you gave when
     * the data store was created. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dffc6d7ef11842eb6785afe9896bf02391868537b05102cc60c9d6e7bf910c86")
    public
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty.Builder.() -> Unit)

    /**
     * The preloaded data configuration for the data store.
     *
     * Only data preloaded from Synthea is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-preloaddataconfig)
     * @param preloadDataConfig The preloaded data configuration for the data store. 
     */
    public fun preloadDataConfig(preloadDataConfig: IResolvable)

    /**
     * The preloaded data configuration for the data store.
     *
     * Only data preloaded from Synthea is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-preloaddataconfig)
     * @param preloadDataConfig The preloaded data configuration for the data store. 
     */
    public fun preloadDataConfig(preloadDataConfig: PreloadDataConfigProperty)

    /**
     * The preloaded data configuration for the data store.
     *
     * Only data preloaded from Synthea is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-preloaddataconfig)
     * @param preloadDataConfig The preloaded data configuration for the data store. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f415c8ec6d6fb864b37abdb60559b8096a0e3743967f14948ddbdfb7cdebddb")
    public fun preloadDataConfig(preloadDataConfig: PreloadDataConfigProperty.Builder.() -> Unit)

    /**
     * The server-side encryption key configuration for a customer provided encryption key specified
     * for creating a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-sseconfiguration)
     * @param sseConfiguration The server-side encryption key configuration for a customer provided
     * encryption key specified for creating a data store. 
     */
    public fun sseConfiguration(sseConfiguration: IResolvable)

    /**
     * The server-side encryption key configuration for a customer provided encryption key specified
     * for creating a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-sseconfiguration)
     * @param sseConfiguration The server-side encryption key configuration for a customer provided
     * encryption key specified for creating a data store. 
     */
    public fun sseConfiguration(sseConfiguration: SseConfigurationProperty)

    /**
     * The server-side encryption key configuration for a customer provided encryption key specified
     * for creating a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-sseconfiguration)
     * @param sseConfiguration The server-side encryption key configuration for a customer provided
     * encryption key specified for creating a data store. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ff80698f76fb67e7cc1beac160a04d19b55f627350ad6a5b041372099ff5944")
    public fun sseConfiguration(sseConfiguration: SseConfigurationProperty.Builder.() -> Unit)

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
    public fun tags(tags: List<CfnTag>)

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
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.Builder =
        software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.Builder.create(scope, id)

    /**
     * The user generated name for the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-datastorename)
     * @param datastoreName The user generated name for the data store. 
     */
    override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    /**
     * The FHIR version of the data store.
     *
     * The only supported version is R4.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-datastoretypeversion)
     * @param datastoreTypeVersion The FHIR version of the data store. 
     */
    override fun datastoreTypeVersion(datastoreTypeVersion: String) {
      cdkBuilder.datastoreTypeVersion(datastoreTypeVersion)
    }

    /**
     * The identity provider configuration that you gave when the data store was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration)
     * @param identityProviderConfiguration The identity provider configuration that you gave when
     * the data store was created. 
     */
    override fun identityProviderConfiguration(identityProviderConfiguration: IResolvable) {
      cdkBuilder.identityProviderConfiguration(identityProviderConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The identity provider configuration that you gave when the data store was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration)
     * @param identityProviderConfiguration The identity provider configuration that you gave when
     * the data store was created. 
     */
    override
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty) {
      cdkBuilder.identityProviderConfiguration(identityProviderConfiguration.let(IdentityProviderConfigurationProperty::unwrap))
    }

    /**
     * The identity provider configuration that you gave when the data store was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration)
     * @param identityProviderConfiguration The identity provider configuration that you gave when
     * the data store was created. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dffc6d7ef11842eb6785afe9896bf02391868537b05102cc60c9d6e7bf910c86")
    override
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty.Builder.() -> Unit):
        Unit =
        identityProviderConfiguration(IdentityProviderConfigurationProperty(identityProviderConfiguration))

    /**
     * The preloaded data configuration for the data store.
     *
     * Only data preloaded from Synthea is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-preloaddataconfig)
     * @param preloadDataConfig The preloaded data configuration for the data store. 
     */
    override fun preloadDataConfig(preloadDataConfig: IResolvable) {
      cdkBuilder.preloadDataConfig(preloadDataConfig.let(IResolvable::unwrap))
    }

    /**
     * The preloaded data configuration for the data store.
     *
     * Only data preloaded from Synthea is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-preloaddataconfig)
     * @param preloadDataConfig The preloaded data configuration for the data store. 
     */
    override fun preloadDataConfig(preloadDataConfig: PreloadDataConfigProperty) {
      cdkBuilder.preloadDataConfig(preloadDataConfig.let(PreloadDataConfigProperty::unwrap))
    }

    /**
     * The preloaded data configuration for the data store.
     *
     * Only data preloaded from Synthea is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-preloaddataconfig)
     * @param preloadDataConfig The preloaded data configuration for the data store. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f415c8ec6d6fb864b37abdb60559b8096a0e3743967f14948ddbdfb7cdebddb")
    override fun preloadDataConfig(preloadDataConfig: PreloadDataConfigProperty.Builder.() -> Unit):
        Unit = preloadDataConfig(PreloadDataConfigProperty(preloadDataConfig))

    /**
     * The server-side encryption key configuration for a customer provided encryption key specified
     * for creating a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-sseconfiguration)
     * @param sseConfiguration The server-side encryption key configuration for a customer provided
     * encryption key specified for creating a data store. 
     */
    override fun sseConfiguration(sseConfiguration: IResolvable) {
      cdkBuilder.sseConfiguration(sseConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The server-side encryption key configuration for a customer provided encryption key specified
     * for creating a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-sseconfiguration)
     * @param sseConfiguration The server-side encryption key configuration for a customer provided
     * encryption key specified for creating a data store. 
     */
    override fun sseConfiguration(sseConfiguration: SseConfigurationProperty) {
      cdkBuilder.sseConfiguration(sseConfiguration.let(SseConfigurationProperty::unwrap))
    }

    /**
     * The server-side encryption key configuration for a customer provided encryption key specified
     * for creating a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-healthlake-fhirdatastore.html#cfn-healthlake-fhirdatastore-sseconfiguration)
     * @param sseConfiguration The server-side encryption key configuration for a customer provided
     * encryption key specified for creating a data store. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ff80698f76fb67e7cc1beac160a04d19b55f627350ad6a5b041372099ff5944")
    override fun sseConfiguration(sseConfiguration: SseConfigurationProperty.Builder.() -> Unit):
        Unit = sseConfiguration(SseConfigurationProperty(sseConfiguration))

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
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.healthlake.CfnFHIRDatastore =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFHIRDatastore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFHIRDatastore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore):
        CfnFHIRDatastore = CfnFHIRDatastore(cdkObject)

    internal fun unwrap(wrapped: CfnFHIRDatastore):
        software.amazon.awscdk.services.healthlake.CfnFHIRDatastore = wrapped.cdkObject
  }

  public interface PreloadDataConfigProperty {
    /**
     * The type of preloaded data.
     *
     * Only Synthea preloaded data is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-preloaddataconfig.html#cfn-healthlake-fhirdatastore-preloaddataconfig-preloaddatatype)
     */
    public fun preloadDataType(): String

    /**
     * A builder for [PreloadDataConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param preloadDataType The type of preloaded data. 
       * Only Synthea preloaded data is supported.
       */
      public fun preloadDataType(preloadDataType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty.Builder
          =
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty.builder()

      /**
       * @param preloadDataType The type of preloaded data. 
       * Only Synthea preloaded data is supported.
       */
      override fun preloadDataType(preloadDataType: String) {
        cdkBuilder.preloadDataType(preloadDataType)
      }

      public fun build():
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty,
    ) : CdkObject(cdkObject), PreloadDataConfigProperty {
      /**
       * The type of preloaded data.
       *
       * Only Synthea preloaded data is supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-preloaddataconfig.html#cfn-healthlake-fhirdatastore-preloaddataconfig-preloaddatatype)
       */
      override fun preloadDataType(): String = unwrap(this).getPreloadDataType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PreloadDataConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty):
          PreloadDataConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PreloadDataConfigProperty):
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty
    }
  }

  public interface IdentityProviderConfigurationProperty {
    /**
     * The authorization strategy that you selected when you created the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-identityproviderconfiguration.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration-authorizationstrategy)
     */
    public fun authorizationStrategy(): String

    /**
     * If you enabled fine-grained authorization when you created the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-identityproviderconfiguration.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration-finegrainedauthorizationenabled)
     */
    public fun fineGrainedAuthorizationEnabled(): Any? =
        unwrap(this).getFineGrainedAuthorizationEnabled()

    /**
     * The Amazon Resource Name (ARN) of the Lambda function that you want to use to decode the
     * access token created by the authorization server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-identityproviderconfiguration.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration-idplambdaarn)
     */
    public fun idpLambdaArn(): String? = unwrap(this).getIdpLambdaArn()

    /**
     * The JSON metadata elements that you want to use in your identity provider configuration.
     *
     * Required elements are listed based on the launch specification of the SMART application. For
     * more information on all possible elements, see
     * [Metadata](https://docs.aws.amazon.com/https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata)
     * in SMART's App Launch specification.
     *
     * `authorization_endpoint` : The URL to the OAuth2 authorization endpoint.
     *
     * `grant_types_supported` : An array of grant types that are supported at the token endpoint.
     * You must provide at least one grant type option. Valid options are `authorization_code` and
     * `client_credentials` .
     *
     * `token_endpoint` : The URL to the OAuth2 token endpoint.
     *
     * `capabilities` : An array of strings of the SMART capabilities that the authorization server
     * supports.
     *
     * `code_challenge_methods_supported` : An array of strings of supported PKCE code challenge
     * methods. You must include the `S256` method in the array of PKCE code challenge methods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-identityproviderconfiguration.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration-metadata)
     */
    public fun metadata(): String? = unwrap(this).getMetadata()

    /**
     * A builder for [IdentityProviderConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationStrategy The authorization strategy that you selected when you created
       * the data store. 
       */
      public fun authorizationStrategy(authorizationStrategy: String)

      /**
       * @param fineGrainedAuthorizationEnabled If you enabled fine-grained authorization when you
       * created the data store.
       */
      public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: Boolean)

      /**
       * @param fineGrainedAuthorizationEnabled If you enabled fine-grained authorization when you
       * created the data store.
       */
      public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: IResolvable)

      /**
       * @param idpLambdaArn The Amazon Resource Name (ARN) of the Lambda function that you want to
       * use to decode the access token created by the authorization server.
       */
      public fun idpLambdaArn(idpLambdaArn: String)

      /**
       * @param metadata The JSON metadata elements that you want to use in your identity provider
       * configuration.
       * Required elements are listed based on the launch specification of the SMART application.
       * For more information on all possible elements, see
       * [Metadata](https://docs.aws.amazon.com/https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata)
       * in SMART's App Launch specification.
       *
       * `authorization_endpoint` : The URL to the OAuth2 authorization endpoint.
       *
       * `grant_types_supported` : An array of grant types that are supported at the token endpoint.
       * You must provide at least one grant type option. Valid options are `authorization_code` and
       * `client_credentials` .
       *
       * `token_endpoint` : The URL to the OAuth2 token endpoint.
       *
       * `capabilities` : An array of strings of the SMART capabilities that the authorization
       * server supports.
       *
       * `code_challenge_methods_supported` : An array of strings of supported PKCE code challenge
       * methods. You must include the `S256` method in the array of PKCE code challenge methods.
       */
      public fun metadata(metadata: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.IdentityProviderConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.IdentityProviderConfigurationProperty.builder()

      /**
       * @param authorizationStrategy The authorization strategy that you selected when you created
       * the data store. 
       */
      override fun authorizationStrategy(authorizationStrategy: String) {
        cdkBuilder.authorizationStrategy(authorizationStrategy)
      }

      /**
       * @param fineGrainedAuthorizationEnabled If you enabled fine-grained authorization when you
       * created the data store.
       */
      override fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: Boolean) {
        cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled)
      }

      /**
       * @param fineGrainedAuthorizationEnabled If you enabled fine-grained authorization when you
       * created the data store.
       */
      override fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: IResolvable) {
        cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param idpLambdaArn The Amazon Resource Name (ARN) of the Lambda function that you want to
       * use to decode the access token created by the authorization server.
       */
      override fun idpLambdaArn(idpLambdaArn: String) {
        cdkBuilder.idpLambdaArn(idpLambdaArn)
      }

      /**
       * @param metadata The JSON metadata elements that you want to use in your identity provider
       * configuration.
       * Required elements are listed based on the launch specification of the SMART application.
       * For more information on all possible elements, see
       * [Metadata](https://docs.aws.amazon.com/https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata)
       * in SMART's App Launch specification.
       *
       * `authorization_endpoint` : The URL to the OAuth2 authorization endpoint.
       *
       * `grant_types_supported` : An array of grant types that are supported at the token endpoint.
       * You must provide at least one grant type option. Valid options are `authorization_code` and
       * `client_credentials` .
       *
       * `token_endpoint` : The URL to the OAuth2 token endpoint.
       *
       * `capabilities` : An array of strings of the SMART capabilities that the authorization
       * server supports.
       *
       * `code_challenge_methods_supported` : An array of strings of supported PKCE code challenge
       * methods. You must include the `S256` method in the array of PKCE code challenge methods.
       */
      override fun metadata(metadata: String) {
        cdkBuilder.metadata(metadata)
      }

      public fun build():
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.IdentityProviderConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.IdentityProviderConfigurationProperty,
    ) : CdkObject(cdkObject), IdentityProviderConfigurationProperty {
      /**
       * The authorization strategy that you selected when you created the data store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-identityproviderconfiguration.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration-authorizationstrategy)
       */
      override fun authorizationStrategy(): String = unwrap(this).getAuthorizationStrategy()

      /**
       * If you enabled fine-grained authorization when you created the data store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-identityproviderconfiguration.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration-finegrainedauthorizationenabled)
       */
      override fun fineGrainedAuthorizationEnabled(): Any? =
          unwrap(this).getFineGrainedAuthorizationEnabled()

      /**
       * The Amazon Resource Name (ARN) of the Lambda function that you want to use to decode the
       * access token created by the authorization server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-identityproviderconfiguration.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration-idplambdaarn)
       */
      override fun idpLambdaArn(): String? = unwrap(this).getIdpLambdaArn()

      /**
       * The JSON metadata elements that you want to use in your identity provider configuration.
       *
       * Required elements are listed based on the launch specification of the SMART application.
       * For more information on all possible elements, see
       * [Metadata](https://docs.aws.amazon.com/https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata)
       * in SMART's App Launch specification.
       *
       * `authorization_endpoint` : The URL to the OAuth2 authorization endpoint.
       *
       * `grant_types_supported` : An array of grant types that are supported at the token endpoint.
       * You must provide at least one grant type option. Valid options are `authorization_code` and
       * `client_credentials` .
       *
       * `token_endpoint` : The URL to the OAuth2 token endpoint.
       *
       * `capabilities` : An array of strings of the SMART capabilities that the authorization
       * server supports.
       *
       * `code_challenge_methods_supported` : An array of strings of supported PKCE code challenge
       * methods. You must include the `S256` method in the array of PKCE code challenge methods.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-identityproviderconfiguration.html#cfn-healthlake-fhirdatastore-identityproviderconfiguration-metadata)
       */
      override fun metadata(): String? = unwrap(this).getMetadata()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdentityProviderConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.IdentityProviderConfigurationProperty):
          IdentityProviderConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentityProviderConfigurationProperty):
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.IdentityProviderConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.IdentityProviderConfigurationProperty
    }
  }

  public interface SseConfigurationProperty {
    /**
     * The server-side encryption key configuration for a customer provided encryption key (CMK).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-sseconfiguration.html#cfn-healthlake-fhirdatastore-sseconfiguration-kmsencryptionconfig)
     */
    public fun kmsEncryptionConfig(): Any

    /**
     * A builder for [SseConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsEncryptionConfig The server-side encryption key configuration for a customer
       * provided encryption key (CMK). 
       */
      public fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable)

      /**
       * @param kmsEncryptionConfig The server-side encryption key configuration for a customer
       * provided encryption key (CMK). 
       */
      public fun kmsEncryptionConfig(kmsEncryptionConfig: KmsEncryptionConfigProperty)

      /**
       * @param kmsEncryptionConfig The server-side encryption key configuration for a customer
       * provided encryption key (CMK). 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c721448173211696f2fe6251251770004484fa49a3e92d45027181a323d63ff")
      public
          fun kmsEncryptionConfig(kmsEncryptionConfig: KmsEncryptionConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty.builder()

      /**
       * @param kmsEncryptionConfig The server-side encryption key configuration for a customer
       * provided encryption key (CMK). 
       */
      override fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable) {
        cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig.let(IResolvable::unwrap))
      }

      /**
       * @param kmsEncryptionConfig The server-side encryption key configuration for a customer
       * provided encryption key (CMK). 
       */
      override fun kmsEncryptionConfig(kmsEncryptionConfig: KmsEncryptionConfigProperty) {
        cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig.let(KmsEncryptionConfigProperty::unwrap))
      }

      /**
       * @param kmsEncryptionConfig The server-side encryption key configuration for a customer
       * provided encryption key (CMK). 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c721448173211696f2fe6251251770004484fa49a3e92d45027181a323d63ff")
      override
          fun kmsEncryptionConfig(kmsEncryptionConfig: KmsEncryptionConfigProperty.Builder.() -> Unit):
          Unit = kmsEncryptionConfig(KmsEncryptionConfigProperty(kmsEncryptionConfig))

      public fun build():
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty,
    ) : CdkObject(cdkObject), SseConfigurationProperty {
      /**
       * The server-side encryption key configuration for a customer provided encryption key (CMK).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-sseconfiguration.html#cfn-healthlake-fhirdatastore-sseconfiguration-kmsencryptionconfig)
       */
      override fun kmsEncryptionConfig(): Any = unwrap(this).getKmsEncryptionConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SseConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty):
          SseConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseConfigurationProperty):
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty
    }
  }

  public interface CreatedAtProperty {
    /**
     * Nanoseconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-createdat.html#cfn-healthlake-fhirdatastore-createdat-nanos)
     */
    public fun nanos(): Number

    /**
     * Seconds since epoch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-createdat.html#cfn-healthlake-fhirdatastore-createdat-seconds)
     */
    public fun seconds(): String

    /**
     * A builder for [CreatedAtProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nanos Nanoseconds. 
       */
      public fun nanos(nanos: Number)

      /**
       * @param seconds Seconds since epoch. 
       */
      public fun seconds(seconds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty.Builder =
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty.builder()

      /**
       * @param nanos Nanoseconds. 
       */
      override fun nanos(nanos: Number) {
        cdkBuilder.nanos(nanos)
      }

      /**
       * @param seconds Seconds since epoch. 
       */
      override fun seconds(seconds: String) {
        cdkBuilder.seconds(seconds)
      }

      public fun build():
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty,
    ) : CdkObject(cdkObject), CreatedAtProperty {
      /**
       * Nanoseconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-createdat.html#cfn-healthlake-fhirdatastore-createdat-nanos)
       */
      override fun nanos(): Number = unwrap(this).getNanos()

      /**
       * Seconds since epoch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-createdat.html#cfn-healthlake-fhirdatastore-createdat-seconds)
       */
      override fun seconds(): String = unwrap(this).getSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CreatedAtProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty):
          CreatedAtProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreatedAtProperty):
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty
    }
  }

  public interface KmsEncryptionConfigProperty {
    /**
     * The type of customer-managed-key(CMK) used for encryption.
     *
     * The two types of supported CMKs are customer owned CMKs and Amazon owned CMKs. For more
     * information on CMK types, see
     * [KmsEncryptionConfig](https://docs.aws.amazon.com/healthlake/latest/APIReference/API_KmsEncryptionConfig.html#HealthLake-Type-KmsEncryptionConfig-CmkType)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-kmsencryptionconfig.html#cfn-healthlake-fhirdatastore-kmsencryptionconfig-cmktype)
     */
    public fun cmkType(): String

    /**
     * The KMS encryption key id/alias used to encrypt the data store contents at rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-kmsencryptionconfig.html#cfn-healthlake-fhirdatastore-kmsencryptionconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A builder for [KmsEncryptionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cmkType The type of customer-managed-key(CMK) used for encryption. 
       * The two types of supported CMKs are customer owned CMKs and Amazon owned CMKs. For more
       * information on CMK types, see
       * [KmsEncryptionConfig](https://docs.aws.amazon.com/healthlake/latest/APIReference/API_KmsEncryptionConfig.html#HealthLake-Type-KmsEncryptionConfig-CmkType)
       * .
       */
      public fun cmkType(cmkType: String)

      /**
       * @param kmsKeyId The KMS encryption key id/alias used to encrypt the data store contents at
       * rest.
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty.Builder
          =
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty.builder()

      /**
       * @param cmkType The type of customer-managed-key(CMK) used for encryption. 
       * The two types of supported CMKs are customer owned CMKs and Amazon owned CMKs. For more
       * information on CMK types, see
       * [KmsEncryptionConfig](https://docs.aws.amazon.com/healthlake/latest/APIReference/API_KmsEncryptionConfig.html#HealthLake-Type-KmsEncryptionConfig-CmkType)
       * .
       */
      override fun cmkType(cmkType: String) {
        cdkBuilder.cmkType(cmkType)
      }

      /**
       * @param kmsKeyId The KMS encryption key id/alias used to encrypt the data store contents at
       * rest.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty,
    ) : CdkObject(cdkObject), KmsEncryptionConfigProperty {
      /**
       * The type of customer-managed-key(CMK) used for encryption.
       *
       * The two types of supported CMKs are customer owned CMKs and Amazon owned CMKs. For more
       * information on CMK types, see
       * [KmsEncryptionConfig](https://docs.aws.amazon.com/healthlake/latest/APIReference/API_KmsEncryptionConfig.html#HealthLake-Type-KmsEncryptionConfig-CmkType)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-kmsencryptionconfig.html#cfn-healthlake-fhirdatastore-kmsencryptionconfig-cmktype)
       */
      override fun cmkType(): String = unwrap(this).getCmkType()

      /**
       * The KMS encryption key id/alias used to encrypt the data store contents at rest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-kmsencryptionconfig.html#cfn-healthlake-fhirdatastore-kmsencryptionconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KmsEncryptionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty):
          KmsEncryptionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KmsEncryptionConfigProperty):
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty
    }
  }
}

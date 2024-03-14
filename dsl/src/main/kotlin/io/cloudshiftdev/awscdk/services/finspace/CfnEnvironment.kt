package io.cloudshiftdev.awscdk.services.finspace

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAwsAccountId(): String = unwrap(this).getAttrAwsAccountId()

  public open fun attrDedicatedServiceAccountId(): String =
      unwrap(this).getAttrDedicatedServiceAccountId()

  public open fun attrEnvironmentArn(): String = unwrap(this).getAttrEnvironmentArn()

  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  public open fun attrEnvironmentUrl(): String = unwrap(this).getAttrEnvironmentUrl()

  public open fun attrSageMakerStudioDomainUrl(): String =
      unwrap(this).getAttrSageMakerStudioDomainUrl()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  @Deprecated(message = "deprecated in CDK")
  public open fun dataBundles(): List<String> = unwrap(this).getDataBundles() ?: emptyList()

  @Deprecated(message = "deprecated in CDK")
  public open fun dataBundles(`value`: List<String>) {
    unwrap(this).setDataBundles(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun federationMode(): String? = unwrap(this).getFederationMode()

  public open fun federationMode(`value`: String) {
    unwrap(this).setFederationMode(`value`)
  }

  public open fun federationParameters(): Any? = unwrap(this).getFederationParameters()

  public open fun federationParameters(`value`: IResolvable) {
    unwrap(this).setFederationParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun federationParameters(`value`: FederationParametersProperty) {
    unwrap(this).setFederationParameters(`value`.let(FederationParametersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12b626a58737f7c11275a88aaab0c643989ed1a92d1d630aef27ec8339e4e7ce")
  public open fun federationParameters(`value`: FederationParametersProperty.Builder.() -> Unit):
      Unit = federationParameters(FederationParametersProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun superuserParameters(): Any? = unwrap(this).getSuperuserParameters()

  public open fun superuserParameters(`value`: IResolvable) {
    unwrap(this).setSuperuserParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun superuserParameters(`value`: SuperuserParametersProperty) {
    unwrap(this).setSuperuserParameters(`value`.let(SuperuserParametersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("130a9ed514447909c8271eb10fb11dbd2d00de39694e4f629bea34418e2a512f")
  public open fun superuserParameters(`value`: SuperuserParametersProperty.Builder.() -> Unit): Unit
      = superuserParameters(SuperuserParametersProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun dataBundles(dataBundles: List<String>)

    public fun description(description: String)

    public fun federationMode(federationMode: String)

    public fun federationParameters(federationParameters: IResolvable)

    public fun federationParameters(federationParameters: FederationParametersProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9df12da2f0c697b85c338698db8006b519ebdbe211ca2f952127f7ceff4496d0")
    public
        fun federationParameters(federationParameters: FederationParametersProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun superuserParameters(superuserParameters: IResolvable)

    public fun superuserParameters(superuserParameters: SuperuserParametersProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8539c50c6b8910ceea4521f816dc281fc996c5bab7195e03c37e5ef08360a309")
    public
        fun superuserParameters(superuserParameters: SuperuserParametersProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.finspace.CfnEnvironment.Builder =
        software.amazon.awscdk.services.finspace.CfnEnvironment.Builder.create(scope, id)

    @Deprecated(message = "deprecated in CDK")
    override fun dataBundles(dataBundles: List<String>) {
      cdkBuilder.dataBundles(dataBundles)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun federationMode(federationMode: String) {
      cdkBuilder.federationMode(federationMode)
    }

    override fun federationParameters(federationParameters: IResolvable) {
      cdkBuilder.federationParameters(federationParameters.let(IResolvable::unwrap))
    }

    override fun federationParameters(federationParameters: FederationParametersProperty) {
      cdkBuilder.federationParameters(federationParameters.let(FederationParametersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9df12da2f0c697b85c338698db8006b519ebdbe211ca2f952127f7ceff4496d0")
    override
        fun federationParameters(federationParameters: FederationParametersProperty.Builder.() -> Unit):
        Unit = federationParameters(FederationParametersProperty(federationParameters))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun superuserParameters(superuserParameters: IResolvable) {
      cdkBuilder.superuserParameters(superuserParameters.let(IResolvable::unwrap))
    }

    override fun superuserParameters(superuserParameters: SuperuserParametersProperty) {
      cdkBuilder.superuserParameters(superuserParameters.let(SuperuserParametersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8539c50c6b8910ceea4521f816dc281fc996c5bab7195e03c37e5ef08360a309")
    override
        fun superuserParameters(superuserParameters: SuperuserParametersProperty.Builder.() -> Unit):
        Unit = superuserParameters(SuperuserParametersProperty(superuserParameters))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.finspace.CfnEnvironment = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.finspace.CfnEnvironment = wrapped.cdkObject
  }

  public interface FederationParametersProperty {
    public fun applicationCallBackUrl(): String? = unwrap(this).getApplicationCallBackUrl()

    public fun attributeMap(): Any? = unwrap(this).getAttributeMap()

    public fun federationProviderName(): String? = unwrap(this).getFederationProviderName()

    public fun federationUrn(): String? = unwrap(this).getFederationUrn()

    public fun samlMetadataDocument(): String? = unwrap(this).getSamlMetadataDocument()

    public fun samlMetadataUrl(): String? = unwrap(this).getSamlMetadataUrl()

    public interface Builder {
      public fun applicationCallBackUrl(applicationCallBackUrl: String)

      public fun attributeMap(attributeMap: IResolvable)

      public fun attributeMap(attributeMap: List<Any>)

      public fun federationProviderName(federationProviderName: String)

      public fun federationUrn(federationUrn: String)

      public fun samlMetadataDocument(samlMetadataDocument: String)

      public fun samlMetadataUrl(samlMetadataUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty.Builder
          =
          software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty.builder()

      override fun applicationCallBackUrl(applicationCallBackUrl: String) {
        cdkBuilder.applicationCallBackUrl(applicationCallBackUrl)
      }

      override fun attributeMap(attributeMap: IResolvable) {
        cdkBuilder.attributeMap(attributeMap.let(IResolvable::unwrap))
      }

      override fun attributeMap(attributeMap: List<Any>) {
        cdkBuilder.attributeMap(attributeMap)
      }

      override fun federationProviderName(federationProviderName: String) {
        cdkBuilder.federationProviderName(federationProviderName)
      }

      override fun federationUrn(federationUrn: String) {
        cdkBuilder.federationUrn(federationUrn)
      }

      override fun samlMetadataDocument(samlMetadataDocument: String) {
        cdkBuilder.samlMetadataDocument(samlMetadataDocument)
      }

      override fun samlMetadataUrl(samlMetadataUrl: String) {
        cdkBuilder.samlMetadataUrl(samlMetadataUrl)
      }

      public fun build():
          software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty,
    ) : FederationParametersProperty {
      override fun applicationCallBackUrl(): String? = unwrap(this).getApplicationCallBackUrl()

      override fun attributeMap(): Any? = unwrap(this).getAttributeMap()

      override fun federationProviderName(): String? = unwrap(this).getFederationProviderName()

      override fun federationUrn(): String? = unwrap(this).getFederationUrn()

      override fun samlMetadataDocument(): String? = unwrap(this).getSamlMetadataDocument()

      override fun samlMetadataUrl(): String? = unwrap(this).getSamlMetadataUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FederationParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty):
          FederationParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FederationParametersProperty):
          software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AttributeMapItemsProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty.Builder
          =
          software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty,
    ) : AttributeMapItemsProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeMapItemsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty):
          AttributeMapItemsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeMapItemsProperty):
          software.amazon.awscdk.services.finspace.CfnEnvironment.AttributeMapItemsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SuperuserParametersProperty {
    public fun emailAddress(): String? = unwrap(this).getEmailAddress()

    public fun firstName(): String? = unwrap(this).getFirstName()

    public fun lastName(): String? = unwrap(this).getLastName()

    public interface Builder {
      public fun emailAddress(emailAddress: String)

      public fun firstName(firstName: String)

      public fun lastName(lastName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty.Builder
          =
          software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty.builder()

      override fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
      }

      override fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
      }

      override fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
      }

      public fun build():
          software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty,
    ) : SuperuserParametersProperty {
      override fun emailAddress(): String? = unwrap(this).getEmailAddress()

      override fun firstName(): String? = unwrap(this).getFirstName()

      override fun lastName(): String? = unwrap(this).getLastName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SuperuserParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty):
          SuperuserParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuperuserParametersProperty):
          software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}

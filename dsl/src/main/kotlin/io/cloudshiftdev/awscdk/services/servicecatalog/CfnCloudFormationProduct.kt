package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCloudFormationProduct internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrProductName(): String = unwrap(this).getAttrProductName()

  public open fun attrProvisioningArtifactIds(): String =
      unwrap(this).getAttrProvisioningArtifactIds()

  public open fun attrProvisioningArtifactNames(): String =
      unwrap(this).getAttrProvisioningArtifactNames()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun distributor(): String? = unwrap(this).getDistributor()

  public open fun distributor(`value`: String) {
    unwrap(this).setDistributor(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun owner(): String = unwrap(this).getOwner()

  public open fun owner(`value`: String) {
    unwrap(this).setOwner(`value`)
  }

  public open fun productType(): String? = unwrap(this).getProductType()

  public open fun productType(`value`: String) {
    unwrap(this).setProductType(`value`)
  }

  public open fun provisioningArtifactParameters(): Any? =
      unwrap(this).getProvisioningArtifactParameters()

  public open fun provisioningArtifactParameters(`value`: IResolvable) {
    unwrap(this).setProvisioningArtifactParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun provisioningArtifactParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setProvisioningArtifactParameters(__idx_ac66f0)
  }

  public open fun replaceProvisioningArtifacts(): Any? =
      unwrap(this).getReplaceProvisioningArtifacts()

  public open fun replaceProvisioningArtifacts(`value`: Boolean) {
    unwrap(this).setReplaceProvisioningArtifacts(`value`)
  }

  public open fun replaceProvisioningArtifacts(`value`: IResolvable) {
    unwrap(this).setReplaceProvisioningArtifacts(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceConnection(): Any? = unwrap(this).getSourceConnection()

  public open fun sourceConnection(`value`: IResolvable) {
    unwrap(this).setSourceConnection(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceConnection(`value`: SourceConnectionProperty) {
    unwrap(this).setSourceConnection(`value`.let(SourceConnectionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15c39e804a8b7060fe32e2eb9a717a8fb7f145cb56fc3abf1af3630d0f675186")
  public open fun sourceConnection(`value`: SourceConnectionProperty.Builder.() -> Unit): Unit =
      sourceConnection(SourceConnectionProperty(`value`))

  public open fun supportDescription(): String? = unwrap(this).getSupportDescription()

  public open fun supportDescription(`value`: String) {
    unwrap(this).setSupportDescription(`value`)
  }

  public open fun supportEmail(): String? = unwrap(this).getSupportEmail()

  public open fun supportEmail(`value`: String) {
    unwrap(this).setSupportEmail(`value`)
  }

  public open fun supportUrl(): String? = unwrap(this).getSupportUrl()

  public open fun supportUrl(`value`: String) {
    unwrap(this).setSupportUrl(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun acceptLanguage(acceptLanguage: String)

    public fun description(description: String)

    public fun distributor(distributor: String)

    public fun name(name: String)

    public fun owner(owner: String)

    public fun productType(productType: String)

    public fun provisioningArtifactParameters(provisioningArtifactParameters: IResolvable)

    public fun provisioningArtifactParameters(provisioningArtifactParameters: List<Any>)

    public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: Boolean)

    public fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: IResolvable)

    public fun sourceConnection(sourceConnection: IResolvable)

    public fun sourceConnection(sourceConnection: SourceConnectionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6cff10ddcf3be0f1cd49992c4b0f8bb297910e7d596f39cfdab4e7c43de6b5f")
    public fun sourceConnection(sourceConnection: SourceConnectionProperty.Builder.() -> Unit)

    public fun supportDescription(supportDescription: String)

    public fun supportEmail(supportEmail: String)

    public fun supportUrl(supportUrl: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.Builder.create(scope,
        id)

    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun distributor(distributor: String) {
      cdkBuilder.distributor(distributor)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    override fun productType(productType: String) {
      cdkBuilder.productType(productType)
    }

    override fun provisioningArtifactParameters(provisioningArtifactParameters: IResolvable) {
      cdkBuilder.provisioningArtifactParameters(provisioningArtifactParameters.let(IResolvable::unwrap))
    }

    override fun provisioningArtifactParameters(provisioningArtifactParameters: List<Any>) {
      cdkBuilder.provisioningArtifactParameters(provisioningArtifactParameters)
    }

    override fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: Boolean) {
      cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts)
    }

    override fun replaceProvisioningArtifacts(replaceProvisioningArtifacts: IResolvable) {
      cdkBuilder.replaceProvisioningArtifacts(replaceProvisioningArtifacts.let(IResolvable::unwrap))
    }

    override fun sourceConnection(sourceConnection: IResolvable) {
      cdkBuilder.sourceConnection(sourceConnection.let(IResolvable::unwrap))
    }

    override fun sourceConnection(sourceConnection: SourceConnectionProperty) {
      cdkBuilder.sourceConnection(sourceConnection.let(SourceConnectionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6cff10ddcf3be0f1cd49992c4b0f8bb297910e7d596f39cfdab4e7c43de6b5f")
    override fun sourceConnection(sourceConnection: SourceConnectionProperty.Builder.() -> Unit):
        Unit = sourceConnection(SourceConnectionProperty(sourceConnection))

    override fun supportDescription(supportDescription: String) {
      cdkBuilder.supportDescription(supportDescription)
    }

    override fun supportEmail(supportEmail: String) {
      cdkBuilder.supportEmail(supportEmail)
    }

    override fun supportUrl(supportUrl: String) {
      cdkBuilder.supportUrl(supportUrl)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCloudFormationProduct {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCloudFormationProduct(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct):
        CfnCloudFormationProduct = CfnCloudFormationProduct(cdkObject)

    internal fun unwrap(wrapped: CfnCloudFormationProduct):
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct = wrapped.cdkObject
  }

  public interface ProvisioningArtifactPropertiesProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun disableTemplateValidation(): Any? = unwrap(this).getDisableTemplateValidation()

    public fun info(): Any

    public fun name(): String? = unwrap(this).getName()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun description(description: String)

      public fun disableTemplateValidation(disableTemplateValidation: Boolean)

      public fun disableTemplateValidation(disableTemplateValidation: IResolvable)

      public fun info(info: Any)

      public fun name(name: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun disableTemplateValidation(disableTemplateValidation: Boolean) {
        cdkBuilder.disableTemplateValidation(disableTemplateValidation)
      }

      override fun disableTemplateValidation(disableTemplateValidation: IResolvable) {
        cdkBuilder.disableTemplateValidation(disableTemplateValidation.let(IResolvable::unwrap))
      }

      override fun info(info: Any) {
        cdkBuilder.info(info)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty,
    ) : ProvisioningArtifactPropertiesProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun disableTemplateValidation(): Any? = unwrap(this).getDisableTemplateValidation()

      override fun info(): Any = unwrap(this).getInfo()

      override fun name(): String? = unwrap(this).getName()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProvisioningArtifactPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty):
          ProvisioningArtifactPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningArtifactPropertiesProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CodeStarParametersProperty {
    public fun artifactPath(): String

    public fun branch(): String

    public fun connectionArn(): String

    public fun repository(): String

    public interface Builder {
      public fun artifactPath(artifactPath: String)

      public fun branch(branch: String)

      public fun connectionArn(connectionArn: String)

      public fun repository(repository: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty.builder()

      override fun artifactPath(artifactPath: String) {
        cdkBuilder.artifactPath(artifactPath)
      }

      override fun branch(branch: String) {
        cdkBuilder.branch(branch)
      }

      override fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
      }

      override fun repository(repository: String) {
        cdkBuilder.repository(repository)
      }

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty,
    ) : CodeStarParametersProperty {
      override fun artifactPath(): String = unwrap(this).getArtifactPath()

      override fun branch(): String = unwrap(this).getBranch()

      override fun connectionArn(): String = unwrap(this).getConnectionArn()

      override fun repository(): String = unwrap(this).getRepository()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CodeStarParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty):
          CodeStarParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeStarParametersProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.CodeStarParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectionParametersProperty {
    public fun codeStar(): Any? = unwrap(this).getCodeStar()

    public interface Builder {
      public fun codeStar(codeStar: IResolvable)

      public fun codeStar(codeStar: CodeStarParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4535c19f9c126f48c42ff0a7c4dd97d57374d914f7acd5c03106fed30edddd8b")
      public fun codeStar(codeStar: CodeStarParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty.builder()

      override fun codeStar(codeStar: IResolvable) {
        cdkBuilder.codeStar(codeStar.let(IResolvable::unwrap))
      }

      override fun codeStar(codeStar: CodeStarParametersProperty) {
        cdkBuilder.codeStar(codeStar.let(CodeStarParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4535c19f9c126f48c42ff0a7c4dd97d57374d914f7acd5c03106fed30edddd8b")
      override fun codeStar(codeStar: CodeStarParametersProperty.Builder.() -> Unit): Unit =
          codeStar(CodeStarParametersProperty(codeStar))

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty,
    ) : ConnectionParametersProperty {
      override fun codeStar(): Any? = unwrap(this).getCodeStar()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty):
          ConnectionParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionParametersProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.ConnectionParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SourceConnectionProperty {
    public fun connectionParameters(): Any

    public fun type(): String

    public interface Builder {
      public fun connectionParameters(connectionParameters: IResolvable)

      public fun connectionParameters(connectionParameters: ConnectionParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91e8b9c506db905bed859bcb46d9e4023c14486820356214116cac00209d0817")
      public
          fun connectionParameters(connectionParameters: ConnectionParametersProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty.Builder
          =
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty.builder()

      override fun connectionParameters(connectionParameters: IResolvable) {
        cdkBuilder.connectionParameters(connectionParameters.let(IResolvable::unwrap))
      }

      override fun connectionParameters(connectionParameters: ConnectionParametersProperty) {
        cdkBuilder.connectionParameters(connectionParameters.let(ConnectionParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91e8b9c506db905bed859bcb46d9e4023c14486820356214116cac00209d0817")
      override
          fun connectionParameters(connectionParameters: ConnectionParametersProperty.Builder.() -> Unit):
          Unit = connectionParameters(ConnectionParametersProperty(connectionParameters))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty,
    ) : SourceConnectionProperty {
      override fun connectionParameters(): Any = unwrap(this).getConnectionParameters()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceConnectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty):
          SourceConnectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceConnectionProperty):
          software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct.SourceConnectionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

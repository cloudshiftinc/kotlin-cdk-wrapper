package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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

public open class CfnIndex internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kendra.CfnIndex,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

  public open fun capacityUnits(`value`: IResolvable) {
    unwrap(this).setCapacityUnits(`value`.let(IResolvable::unwrap))
  }

  public open fun capacityUnits(`value`: CapacityUnitsConfigurationProperty) {
    unwrap(this).setCapacityUnits(`value`.let(CapacityUnitsConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ac9628696274aae7547bb523fc9355b738bc0aac35ea72627546a14855d3e9d2")
  public open fun capacityUnits(`value`: CapacityUnitsConfigurationProperty.Builder.() -> Unit):
      Unit = capacityUnits(CapacityUnitsConfigurationProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun documentMetadataConfigurations(): Any? =
      unwrap(this).getDocumentMetadataConfigurations()

  public open fun documentMetadataConfigurations(`value`: IResolvable) {
    unwrap(this).setDocumentMetadataConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun documentMetadataConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setDocumentMetadataConfigurations(__idx_ac66f0)
  }

  public open fun documentMetadataConfigurations(vararg __idx_ac66f0: Any): Unit =
      documentMetadataConfigurations(__idx_ac66f0.toList())

  public open fun edition(): String = unwrap(this).getEdition()

  public open fun edition(`value`: String) {
    unwrap(this).setEdition(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  public open fun serverSideEncryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(ServerSideEncryptionConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8cd982c52b4004cb165dd44dde8ec5225baa9bc80c5f26003c27f80b95f238a4")
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
      Unit = serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun userContextPolicy(): String? = unwrap(this).getUserContextPolicy()

  public open fun userContextPolicy(`value`: String) {
    unwrap(this).setUserContextPolicy(`value`)
  }

  public open fun userTokenConfigurations(): Any? = unwrap(this).getUserTokenConfigurations()

  public open fun userTokenConfigurations(`value`: IResolvable) {
    unwrap(this).setUserTokenConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun userTokenConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setUserTokenConfigurations(__idx_ac66f0)
  }

  public open fun userTokenConfigurations(vararg __idx_ac66f0: Any): Unit =
      userTokenConfigurations(__idx_ac66f0.toList())

  public interface Builder {
    public fun capacityUnits(capacityUnits: IResolvable)

    public fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d38515d81b65ad12a0112808e60b88658c07d2d9b54fb879362e1b26d9039cf")
    public fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun documentMetadataConfigurations(documentMetadataConfigurations: IResolvable)

    public fun documentMetadataConfigurations(documentMetadataConfigurations: List<Any>)

    public fun documentMetadataConfigurations(vararg documentMetadataConfigurations: Any)

    public fun edition(edition: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66297df61c7f33a3e947db30b9a9e02024ca4e92755576ea3ff17f18cd2df80c")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userContextPolicy(userContextPolicy: String)

    public fun userTokenConfigurations(userTokenConfigurations: IResolvable)

    public fun userTokenConfigurations(userTokenConfigurations: List<Any>)

    public fun userTokenConfigurations(vararg userTokenConfigurations: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnIndex.Builder =
        software.amazon.awscdk.services.kendra.CfnIndex.Builder.create(scope, id)

    override fun capacityUnits(capacityUnits: IResolvable) {
      cdkBuilder.capacityUnits(capacityUnits.let(IResolvable::unwrap))
    }

    override fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty) {
      cdkBuilder.capacityUnits(capacityUnits.let(CapacityUnitsConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d38515d81b65ad12a0112808e60b88658c07d2d9b54fb879362e1b26d9039cf")
    override
        fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty.Builder.() -> Unit):
        Unit = capacityUnits(CapacityUnitsConfigurationProperty(capacityUnits))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun documentMetadataConfigurations(documentMetadataConfigurations: IResolvable) {
      cdkBuilder.documentMetadataConfigurations(documentMetadataConfigurations.let(IResolvable::unwrap))
    }

    override fun documentMetadataConfigurations(documentMetadataConfigurations: List<Any>) {
      cdkBuilder.documentMetadataConfigurations(documentMetadataConfigurations)
    }

    override fun documentMetadataConfigurations(vararg documentMetadataConfigurations: Any): Unit =
        documentMetadataConfigurations(documentMetadataConfigurations.toList())

    override fun edition(edition: String) {
      cdkBuilder.edition(edition)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(ServerSideEncryptionConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66297df61c7f33a3e947db30b9a9e02024ca4e92755576ea3ff17f18cd2df80c")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userContextPolicy(userContextPolicy: String) {
      cdkBuilder.userContextPolicy(userContextPolicy)
    }

    override fun userTokenConfigurations(userTokenConfigurations: IResolvable) {
      cdkBuilder.userTokenConfigurations(userTokenConfigurations.let(IResolvable::unwrap))
    }

    override fun userTokenConfigurations(userTokenConfigurations: List<Any>) {
      cdkBuilder.userTokenConfigurations(userTokenConfigurations)
    }

    override fun userTokenConfigurations(vararg userTokenConfigurations: Any): Unit =
        userTokenConfigurations(userTokenConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.kendra.CfnIndex = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIndex {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIndex(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndex): CfnIndex =
        CfnIndex(cdkObject)

    internal fun unwrap(wrapped: CfnIndex): software.amazon.awscdk.services.kendra.CfnIndex =
        wrapped.cdkObject
  }

  public interface CapacityUnitsConfigurationProperty {
    public fun queryCapacityUnits(): Number

    public fun storageCapacityUnits(): Number

    public interface Builder {
      public fun queryCapacityUnits(queryCapacityUnits: Number)

      public fun storageCapacityUnits(storageCapacityUnits: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty.builder()

      override fun queryCapacityUnits(queryCapacityUnits: Number) {
        cdkBuilder.queryCapacityUnits(queryCapacityUnits)
      }

      override fun storageCapacityUnits(storageCapacityUnits: Number) {
        cdkBuilder.storageCapacityUnits(storageCapacityUnits)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty,
    ) : CapacityUnitsConfigurationProperty {
      override fun queryCapacityUnits(): Number = unwrap(this).getQueryCapacityUnits()

      override fun storageCapacityUnits(): Number = unwrap(this).getStorageCapacityUnits()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityUnitsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty):
          CapacityUnitsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityUnitsConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RelevanceProperty {
    public fun duration(): String? = unwrap(this).getDuration()

    public fun freshness(): Any? = unwrap(this).getFreshness()

    public fun importance(): Number? = unwrap(this).getImportance()

    public fun rankOrder(): String? = unwrap(this).getRankOrder()

    public fun valueImportanceItems(): Any? = unwrap(this).getValueImportanceItems()

    public interface Builder {
      public fun duration(duration: String)

      public fun freshness(freshness: Boolean)

      public fun freshness(freshness: IResolvable)

      public fun importance(importance: Number)

      public fun rankOrder(rankOrder: String)

      public fun valueImportanceItems(valueImportanceItems: IResolvable)

      public fun valueImportanceItems(valueImportanceItems: List<Any>)

      public fun valueImportanceItems(vararg valueImportanceItems: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty.builder()

      override fun duration(duration: String) {
        cdkBuilder.duration(duration)
      }

      override fun freshness(freshness: Boolean) {
        cdkBuilder.freshness(freshness)
      }

      override fun freshness(freshness: IResolvable) {
        cdkBuilder.freshness(freshness.let(IResolvable::unwrap))
      }

      override fun importance(importance: Number) {
        cdkBuilder.importance(importance)
      }

      override fun rankOrder(rankOrder: String) {
        cdkBuilder.rankOrder(rankOrder)
      }

      override fun valueImportanceItems(valueImportanceItems: IResolvable) {
        cdkBuilder.valueImportanceItems(valueImportanceItems.let(IResolvable::unwrap))
      }

      override fun valueImportanceItems(valueImportanceItems: List<Any>) {
        cdkBuilder.valueImportanceItems(valueImportanceItems)
      }

      override fun valueImportanceItems(vararg valueImportanceItems: Any): Unit =
          valueImportanceItems(valueImportanceItems.toList())

      public fun build(): software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty,
    ) : RelevanceProperty {
      override fun duration(): String? = unwrap(this).getDuration()

      override fun freshness(): Any? = unwrap(this).getFreshness()

      override fun importance(): Number? = unwrap(this).getImportance()

      override fun rankOrder(): String? = unwrap(this).getRankOrder()

      override fun valueImportanceItems(): Any? = unwrap(this).getValueImportanceItems()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RelevanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty):
          RelevanceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelevanceProperty):
          software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UserTokenConfigurationProperty {
    public fun jsonTokenTypeConfiguration(): Any? = unwrap(this).getJsonTokenTypeConfiguration()

    public fun jwtTokenTypeConfiguration(): Any? = unwrap(this).getJwtTokenTypeConfiguration()

    public interface Builder {
      public fun jsonTokenTypeConfiguration(jsonTokenTypeConfiguration: IResolvable)

      public
          fun jsonTokenTypeConfiguration(jsonTokenTypeConfiguration: JsonTokenTypeConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2b5657d56c6ffc4b2998617167f62e077c15729e83acbefe984863f124826d6")
      public
          fun jsonTokenTypeConfiguration(jsonTokenTypeConfiguration: JsonTokenTypeConfigurationProperty.Builder.() -> Unit)

      public fun jwtTokenTypeConfiguration(jwtTokenTypeConfiguration: IResolvable)

      public
          fun jwtTokenTypeConfiguration(jwtTokenTypeConfiguration: JwtTokenTypeConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d02dd01b0333bbec06cbc77d1731bd147a022d10a87639d37c63ae4aac7641f7")
      public
          fun jwtTokenTypeConfiguration(jwtTokenTypeConfiguration: JwtTokenTypeConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty.builder()

      override fun jsonTokenTypeConfiguration(jsonTokenTypeConfiguration: IResolvable) {
        cdkBuilder.jsonTokenTypeConfiguration(jsonTokenTypeConfiguration.let(IResolvable::unwrap))
      }

      override
          fun jsonTokenTypeConfiguration(jsonTokenTypeConfiguration: JsonTokenTypeConfigurationProperty) {
        cdkBuilder.jsonTokenTypeConfiguration(jsonTokenTypeConfiguration.let(JsonTokenTypeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2b5657d56c6ffc4b2998617167f62e077c15729e83acbefe984863f124826d6")
      override
          fun jsonTokenTypeConfiguration(jsonTokenTypeConfiguration: JsonTokenTypeConfigurationProperty.Builder.() -> Unit):
          Unit =
          jsonTokenTypeConfiguration(JsonTokenTypeConfigurationProperty(jsonTokenTypeConfiguration))

      override fun jwtTokenTypeConfiguration(jwtTokenTypeConfiguration: IResolvable) {
        cdkBuilder.jwtTokenTypeConfiguration(jwtTokenTypeConfiguration.let(IResolvable::unwrap))
      }

      override
          fun jwtTokenTypeConfiguration(jwtTokenTypeConfiguration: JwtTokenTypeConfigurationProperty) {
        cdkBuilder.jwtTokenTypeConfiguration(jwtTokenTypeConfiguration.let(JwtTokenTypeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d02dd01b0333bbec06cbc77d1731bd147a022d10a87639d37c63ae4aac7641f7")
      override
          fun jwtTokenTypeConfiguration(jwtTokenTypeConfiguration: JwtTokenTypeConfigurationProperty.Builder.() -> Unit):
          Unit =
          jwtTokenTypeConfiguration(JwtTokenTypeConfigurationProperty(jwtTokenTypeConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty,
    ) : UserTokenConfigurationProperty {
      override fun jsonTokenTypeConfiguration(): Any? = unwrap(this).getJsonTokenTypeConfiguration()

      override fun jwtTokenTypeConfiguration(): Any? = unwrap(this).getJwtTokenTypeConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserTokenConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty):
          UserTokenConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserTokenConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface JwtTokenTypeConfigurationProperty {
    public fun claimRegex(): String? = unwrap(this).getClaimRegex()

    public fun groupAttributeField(): String? = unwrap(this).getGroupAttributeField()

    public fun issuer(): String? = unwrap(this).getIssuer()

    public fun keyLocation(): String

    public fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

    public fun url(): String? = unwrap(this).getUrl()

    public fun userNameAttributeField(): String? = unwrap(this).getUserNameAttributeField()

    public interface Builder {
      public fun claimRegex(claimRegex: String)

      public fun groupAttributeField(groupAttributeField: String)

      public fun issuer(issuer: String)

      public fun keyLocation(keyLocation: String)

      public fun secretManagerArn(secretManagerArn: String)

      public fun url(url: String)

      public fun userNameAttributeField(userNameAttributeField: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty.builder()

      override fun claimRegex(claimRegex: String) {
        cdkBuilder.claimRegex(claimRegex)
      }

      override fun groupAttributeField(groupAttributeField: String) {
        cdkBuilder.groupAttributeField(groupAttributeField)
      }

      override fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
      }

      override fun keyLocation(keyLocation: String) {
        cdkBuilder.keyLocation(keyLocation)
      }

      override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      override fun userNameAttributeField(userNameAttributeField: String) {
        cdkBuilder.userNameAttributeField(userNameAttributeField)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty,
    ) : JwtTokenTypeConfigurationProperty {
      override fun claimRegex(): String? = unwrap(this).getClaimRegex()

      override fun groupAttributeField(): String? = unwrap(this).getGroupAttributeField()

      override fun issuer(): String? = unwrap(this).getIssuer()

      override fun keyLocation(): String = unwrap(this).getKeyLocation()

      override fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

      override fun url(): String? = unwrap(this).getUrl()

      override fun userNameAttributeField(): String? = unwrap(this).getUserNameAttributeField()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          JwtTokenTypeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty):
          JwtTokenTypeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JwtTokenTypeConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DocumentMetadataConfigurationProperty {
    public fun name(): String

    public fun relevance(): Any? = unwrap(this).getRelevance()

    public fun search(): Any? = unwrap(this).getSearch()

    public fun type(): String

    public interface Builder {
      public fun name(name: String)

      public fun relevance(relevance: IResolvable)

      public fun relevance(relevance: RelevanceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd71cb346fd43a23cb27cd4336b913ab1ed1651c684ae7045c87fd3eea2236e8")
      public fun relevance(relevance: RelevanceProperty.Builder.() -> Unit)

      public fun search(search: IResolvable)

      public fun search(search: SearchProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85095dde21447ef2f3d3bb8aed5edd9c3a66f25cf46dc38121e1038b29d27f81")
      public fun search(search: SearchProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun relevance(relevance: IResolvable) {
        cdkBuilder.relevance(relevance.let(IResolvable::unwrap))
      }

      override fun relevance(relevance: RelevanceProperty) {
        cdkBuilder.relevance(relevance.let(RelevanceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd71cb346fd43a23cb27cd4336b913ab1ed1651c684ae7045c87fd3eea2236e8")
      override fun relevance(relevance: RelevanceProperty.Builder.() -> Unit): Unit =
          relevance(RelevanceProperty(relevance))

      override fun search(search: IResolvable) {
        cdkBuilder.search(search.let(IResolvable::unwrap))
      }

      override fun search(search: SearchProperty) {
        cdkBuilder.search(search.let(SearchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("85095dde21447ef2f3d3bb8aed5edd9c3a66f25cf46dc38121e1038b29d27f81")
      override fun search(search: SearchProperty.Builder.() -> Unit): Unit =
          search(SearchProperty(search))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty,
    ) : DocumentMetadataConfigurationProperty {
      override fun name(): String = unwrap(this).getName()

      override fun relevance(): Any? = unwrap(this).getRelevance()

      override fun search(): Any? = unwrap(this).getSearch()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentMetadataConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty):
          DocumentMetadataConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentMetadataConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServerSideEncryptionConfigurationProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty,
    ) : ServerSideEncryptionConfigurationProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerSideEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty):
          ServerSideEncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface JsonTokenTypeConfigurationProperty {
    public fun groupAttributeField(): String

    public fun userNameAttributeField(): String

    public interface Builder {
      public fun groupAttributeField(groupAttributeField: String)

      public fun userNameAttributeField(userNameAttributeField: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty.builder()

      override fun groupAttributeField(groupAttributeField: String) {
        cdkBuilder.groupAttributeField(groupAttributeField)
      }

      override fun userNameAttributeField(userNameAttributeField: String) {
        cdkBuilder.userNameAttributeField(userNameAttributeField)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty,
    ) : JsonTokenTypeConfigurationProperty {
      override fun groupAttributeField(): String = unwrap(this).getGroupAttributeField()

      override fun userNameAttributeField(): String = unwrap(this).getUserNameAttributeField()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          JsonTokenTypeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty):
          JsonTokenTypeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonTokenTypeConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SearchProperty {
    public fun displayable(): Any? = unwrap(this).getDisplayable()

    public fun facetable(): Any? = unwrap(this).getFacetable()

    public fun searchable(): Any? = unwrap(this).getSearchable()

    public fun sortable(): Any? = unwrap(this).getSortable()

    public interface Builder {
      public fun displayable(displayable: Boolean)

      public fun displayable(displayable: IResolvable)

      public fun facetable(facetable: Boolean)

      public fun facetable(facetable: IResolvable)

      public fun searchable(searchable: Boolean)

      public fun searchable(searchable: IResolvable)

      public fun sortable(sortable: Boolean)

      public fun sortable(sortable: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty.Builder
          = software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty.builder()

      override fun displayable(displayable: Boolean) {
        cdkBuilder.displayable(displayable)
      }

      override fun displayable(displayable: IResolvable) {
        cdkBuilder.displayable(displayable.let(IResolvable::unwrap))
      }

      override fun facetable(facetable: Boolean) {
        cdkBuilder.facetable(facetable)
      }

      override fun facetable(facetable: IResolvable) {
        cdkBuilder.facetable(facetable.let(IResolvable::unwrap))
      }

      override fun searchable(searchable: Boolean) {
        cdkBuilder.searchable(searchable)
      }

      override fun searchable(searchable: IResolvable) {
        cdkBuilder.searchable(searchable.let(IResolvable::unwrap))
      }

      override fun sortable(sortable: Boolean) {
        cdkBuilder.sortable(sortable)
      }

      override fun sortable(sortable: IResolvable) {
        cdkBuilder.sortable(sortable.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty,
    ) : SearchProperty {
      override fun displayable(): Any? = unwrap(this).getDisplayable()

      override fun facetable(): Any? = unwrap(this).getFacetable()

      override fun searchable(): Any? = unwrap(this).getSearchable()

      override fun sortable(): Any? = unwrap(this).getSortable()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SearchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty):
          SearchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SearchProperty):
          software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ValueImportanceItemProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): Number? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty,
    ) : ValueImportanceItemProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValueImportanceItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty):
          ValueImportanceItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValueImportanceItemProperty):
          software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}

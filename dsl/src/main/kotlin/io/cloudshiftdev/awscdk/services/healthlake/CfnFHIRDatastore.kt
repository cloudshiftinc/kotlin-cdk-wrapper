package io.cloudshiftdev.awscdk.services.healthlake

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

public open class CfnFHIRDatastore internal constructor(
  private val cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreatedAt(): IResolvable =
      unwrap(this).getAttrCreatedAt().let(IResolvable::wrap)

  public open fun attrCreatedAtNanos(): Number = unwrap(this).getAttrCreatedAtNanos()

  public open fun attrCreatedAtSeconds(): String = unwrap(this).getAttrCreatedAtSeconds()

  public open fun attrDatastoreArn(): String = unwrap(this).getAttrDatastoreArn()

  public open fun attrDatastoreEndpoint(): String = unwrap(this).getAttrDatastoreEndpoint()

  public open fun attrDatastoreId(): String = unwrap(this).getAttrDatastoreId()

  public open fun attrDatastoreStatus(): String = unwrap(this).getAttrDatastoreStatus()

  public open fun datastoreName(): String? = unwrap(this).getDatastoreName()

  public open fun datastoreName(`value`: String) {
    unwrap(this).setDatastoreName(`value`)
  }

  public open fun datastoreTypeVersion(): String = unwrap(this).getDatastoreTypeVersion()

  public open fun datastoreTypeVersion(`value`: String) {
    unwrap(this).setDatastoreTypeVersion(`value`)
  }

  public open fun identityProviderConfiguration(): Any? =
      unwrap(this).getIdentityProviderConfiguration()

  public open fun identityProviderConfiguration(`value`: IResolvable) {
    unwrap(this).setIdentityProviderConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun identityProviderConfiguration(`value`: IdentityProviderConfigurationProperty) {
    unwrap(this).setIdentityProviderConfiguration(`value`.let(IdentityProviderConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c59b927899bad6099026fcb7d2328d2122456f4ea7d2e06c6ea513861c813813")
  public open
      fun identityProviderConfiguration(`value`: IdentityProviderConfigurationProperty.Builder.() -> Unit):
      Unit = identityProviderConfiguration(IdentityProviderConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun preloadDataConfig(): Any? = unwrap(this).getPreloadDataConfig()

  public open fun preloadDataConfig(`value`: IResolvable) {
    unwrap(this).setPreloadDataConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun preloadDataConfig(`value`: PreloadDataConfigProperty) {
    unwrap(this).setPreloadDataConfig(`value`.let(PreloadDataConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b14710e249703a79b742ddb36815ed3a08c54cc20543e86a9f152648d553b6ac")
  public open fun preloadDataConfig(`value`: PreloadDataConfigProperty.Builder.() -> Unit): Unit =
      preloadDataConfig(PreloadDataConfigProperty(`value`))

  public open fun sseConfiguration(): Any? = unwrap(this).getSseConfiguration()

  public open fun sseConfiguration(`value`: IResolvable) {
    unwrap(this).setSseConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun sseConfiguration(`value`: SseConfigurationProperty) {
    unwrap(this).setSseConfiguration(`value`.let(SseConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5011c12f035b6e57185c02cc426133032cc13191663743a3c61e4fed9610158e")
  public open fun sseConfiguration(`value`: SseConfigurationProperty.Builder.() -> Unit): Unit =
      sseConfiguration(SseConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun datastoreName(datastoreName: String) {
    }

    public fun datastoreTypeVersion(datastoreTypeVersion: String) {
    }

    public fun identityProviderConfiguration(identityProviderConfiguration: IResolvable) {
    }

    public
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dffc6d7ef11842eb6785afe9896bf02391868537b05102cc60c9d6e7bf910c86")
    public
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty.Builder.() -> Unit) {
    }

    public fun preloadDataConfig(preloadDataConfig: IResolvable) {
    }

    public fun preloadDataConfig(preloadDataConfig: PreloadDataConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f415c8ec6d6fb864b37abdb60559b8096a0e3743967f14948ddbdfb7cdebddb")
    public fun preloadDataConfig(preloadDataConfig: PreloadDataConfigProperty.Builder.() -> Unit) {
    }

    public fun sseConfiguration(sseConfiguration: IResolvable) {
    }

    public fun sseConfiguration(sseConfiguration: SseConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ff80698f76fb67e7cc1beac160a04d19b55f627350ad6a5b041372099ff5944")
    public fun sseConfiguration(sseConfiguration: SseConfigurationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.Builder =
        software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.Builder.create(scope, id)

    public override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    public override fun datastoreTypeVersion(datastoreTypeVersion: String) {
      cdkBuilder.datastoreTypeVersion(datastoreTypeVersion)
    }

    public override fun identityProviderConfiguration(identityProviderConfiguration: IResolvable) {
      cdkBuilder.identityProviderConfiguration(identityProviderConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty) {
      cdkBuilder.identityProviderConfiguration(identityProviderConfiguration.let(IdentityProviderConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dffc6d7ef11842eb6785afe9896bf02391868537b05102cc60c9d6e7bf910c86")
    public override
        fun identityProviderConfiguration(identityProviderConfiguration: IdentityProviderConfigurationProperty.Builder.() -> Unit):
        Unit =
        identityProviderConfiguration(IdentityProviderConfigurationProperty(identityProviderConfiguration))

    public override fun preloadDataConfig(preloadDataConfig: IResolvable) {
      cdkBuilder.preloadDataConfig(preloadDataConfig.let(IResolvable::unwrap))
    }

    public override fun preloadDataConfig(preloadDataConfig: PreloadDataConfigProperty) {
      cdkBuilder.preloadDataConfig(preloadDataConfig.let(PreloadDataConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f415c8ec6d6fb864b37abdb60559b8096a0e3743967f14948ddbdfb7cdebddb")
    public override
        fun preloadDataConfig(preloadDataConfig: PreloadDataConfigProperty.Builder.() -> Unit): Unit
        = preloadDataConfig(PreloadDataConfigProperty(preloadDataConfig))

    public override fun sseConfiguration(sseConfiguration: IResolvable) {
      cdkBuilder.sseConfiguration(sseConfiguration.let(IResolvable::unwrap))
    }

    public override fun sseConfiguration(sseConfiguration: SseConfigurationProperty) {
      cdkBuilder.sseConfiguration(sseConfiguration.let(SseConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ff80698f76fb67e7cc1beac160a04d19b55f627350ad6a5b041372099ff5944")
    public override
        fun sseConfiguration(sseConfiguration: SseConfigurationProperty.Builder.() -> Unit): Unit =
        sseConfiguration(SseConfigurationProperty(sseConfiguration))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.healthlake.CfnFHIRDatastore =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
    public fun preloadDataType(): String

    public interface Builder {
      public fun preloadDataType(preloadDataType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty.Builder
          =
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty.builder()

      public override fun preloadDataType(preloadDataType: String) {
        cdkBuilder.preloadDataType(preloadDataType)
      }

      public fun build():
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty,
    ) : PreloadDataConfigProperty {
      public override fun preloadDataType(): String = unwrap(this).getPreloadDataType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PreloadDataConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty):
          PreloadDataConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PreloadDataConfigProperty):
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.PreloadDataConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IdentityProviderConfigurationProperty {
    public fun authorizationStrategy(): String

    public fun fineGrainedAuthorizationEnabled(): Any? =
        unwrap(this).getFineGrainedAuthorizationEnabled()

    public fun idpLambdaArn(): String? = unwrap(this).getIdpLambdaArn()

    public fun metadata(): String? = unwrap(this).getMetadata()

    public interface Builder {
      public fun authorizationStrategy(authorizationStrategy: String) {
      }

      public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: Boolean) {
      }

      public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: IResolvable) {
      }

      public fun idpLambdaArn(idpLambdaArn: String) {
      }

      public fun metadata(metadata: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.IdentityProviderConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.IdentityProviderConfigurationProperty.builder()

      public override fun authorizationStrategy(authorizationStrategy: String) {
        cdkBuilder.authorizationStrategy(authorizationStrategy)
      }

      public override
          fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: Boolean) {
        cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled)
      }

      public override
          fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: IResolvable) {
        cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled.let(IResolvable::unwrap))
      }

      public override fun idpLambdaArn(idpLambdaArn: String) {
        cdkBuilder.idpLambdaArn(idpLambdaArn)
      }

      public override fun metadata(metadata: String) {
        cdkBuilder.metadata(metadata)
      }

      public fun build():
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.IdentityProviderConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.IdentityProviderConfigurationProperty,
    ) : IdentityProviderConfigurationProperty {
      public override fun authorizationStrategy(): String = unwrap(this).getAuthorizationStrategy()

      public override fun fineGrainedAuthorizationEnabled(): Any? =
          unwrap(this).getFineGrainedAuthorizationEnabled()

      public override fun idpLambdaArn(): String? = unwrap(this).getIdpLambdaArn()

      public override fun metadata(): String? = unwrap(this).getMetadata()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SseConfigurationProperty {
    public fun kmsEncryptionConfig(): Any

    public interface Builder {
      public fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable) {
      }

      public fun kmsEncryptionConfig(kmsEncryptionConfig: KmsEncryptionConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c721448173211696f2fe6251251770004484fa49a3e92d45027181a323d63ff")
      public
          fun kmsEncryptionConfig(kmsEncryptionConfig: KmsEncryptionConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty.builder()

      public override fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable) {
        cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig.let(IResolvable::unwrap))
      }

      public override fun kmsEncryptionConfig(kmsEncryptionConfig: KmsEncryptionConfigProperty) {
        cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig.let(KmsEncryptionConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c721448173211696f2fe6251251770004484fa49a3e92d45027181a323d63ff")
      public override
          fun kmsEncryptionConfig(kmsEncryptionConfig: KmsEncryptionConfigProperty.Builder.() -> Unit):
          Unit = kmsEncryptionConfig(KmsEncryptionConfigProperty(kmsEncryptionConfig))

      public fun build():
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty,
    ) : SseConfigurationProperty {
      public override fun kmsEncryptionConfig(): Any = unwrap(this).getKmsEncryptionConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SseConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty):
          SseConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseConfigurationProperty):
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.SseConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CreatedAtProperty {
    public fun nanos(): Number

    public fun seconds(): String

    public interface Builder {
      public fun nanos(nanos: Number) {
      }

      public fun seconds(seconds: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty.Builder =
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty.builder()

      public override fun nanos(nanos: Number) {
        cdkBuilder.nanos(nanos)
      }

      public override fun seconds(seconds: String) {
        cdkBuilder.seconds(seconds)
      }

      public fun build():
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty,
    ) : CreatedAtProperty {
      public override fun nanos(): Number = unwrap(this).getNanos()

      public override fun seconds(): String = unwrap(this).getSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CreatedAtProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty):
          CreatedAtProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreatedAtProperty):
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.CreatedAtProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface KmsEncryptionConfigProperty {
    public fun cmkType(): String

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public interface Builder {
      public fun cmkType(cmkType: String) {
      }

      public fun kmsKeyId(kmsKeyId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty.Builder
          =
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty.builder()

      public override fun cmkType(cmkType: String) {
        cdkBuilder.cmkType(cmkType)
      }

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty,
    ) : KmsEncryptionConfigProperty {
      public override fun cmkType(): String = unwrap(this).getCmkType()

      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KmsEncryptionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty):
          KmsEncryptionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KmsEncryptionConfigProperty):
          software.amazon.awscdk.services.healthlake.CfnFHIRDatastore.KmsEncryptionConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}

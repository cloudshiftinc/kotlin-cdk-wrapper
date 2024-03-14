package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceStorageConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun kinesisFirehoseConfig(): Any? = unwrap(this).getKinesisFirehoseConfig()

  public open fun kinesisFirehoseConfig(`value`: IResolvable) {
    unwrap(this).setKinesisFirehoseConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun kinesisFirehoseConfig(`value`: KinesisFirehoseConfigProperty) {
    unwrap(this).setKinesisFirehoseConfig(`value`.let(KinesisFirehoseConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f829ccf1a9fb3cb8f251c7a520cbb503978cfd01a74f1c8113de828be418f2e3")
  public open fun kinesisFirehoseConfig(`value`: KinesisFirehoseConfigProperty.Builder.() -> Unit):
      Unit = kinesisFirehoseConfig(KinesisFirehoseConfigProperty(`value`))

  public open fun kinesisStreamConfig(): Any? = unwrap(this).getKinesisStreamConfig()

  public open fun kinesisStreamConfig(`value`: IResolvable) {
    unwrap(this).setKinesisStreamConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun kinesisStreamConfig(`value`: KinesisStreamConfigProperty) {
    unwrap(this).setKinesisStreamConfig(`value`.let(KinesisStreamConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe90dbc14d057fc8df2d5e2f2dc3c1ed451aa8d0573f240f5bd4c0f7bb58cf1b")
  public open fun kinesisStreamConfig(`value`: KinesisStreamConfigProperty.Builder.() -> Unit): Unit
      = kinesisStreamConfig(KinesisStreamConfigProperty(`value`))

  public open fun kinesisVideoStreamConfig(): Any? = unwrap(this).getKinesisVideoStreamConfig()

  public open fun kinesisVideoStreamConfig(`value`: IResolvable) {
    unwrap(this).setKinesisVideoStreamConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun kinesisVideoStreamConfig(`value`: KinesisVideoStreamConfigProperty) {
    unwrap(this).setKinesisVideoStreamConfig(`value`.let(KinesisVideoStreamConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("80b2083296e858d8b30c96551ab620fac29935872c4a0965d86e899f3f388705")
  public open
      fun kinesisVideoStreamConfig(`value`: KinesisVideoStreamConfigProperty.Builder.() -> Unit):
      Unit = kinesisVideoStreamConfig(KinesisVideoStreamConfigProperty(`value`))

  public open fun resourceType(): String = unwrap(this).getResourceType()

  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  public open fun s3Config(): Any? = unwrap(this).getS3Config()

  public open fun s3Config(`value`: IResolvable) {
    unwrap(this).setS3Config(`value`.let(IResolvable::unwrap))
  }

  public open fun s3Config(`value`: S3ConfigProperty) {
    unwrap(this).setS3Config(`value`.let(S3ConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df832be7b1bfc2e38144eaf8719e82917aed11a8447a219819ec47fae0992bb6")
  public open fun s3Config(`value`: S3ConfigProperty.Builder.() -> Unit): Unit =
      s3Config(S3ConfigProperty(`value`))

  public open fun storageType(): String = unwrap(this).getStorageType()

  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
  }

  public interface Builder {
    public fun instanceArn(instanceArn: String)

    public fun kinesisFirehoseConfig(kinesisFirehoseConfig: IResolvable)

    public fun kinesisFirehoseConfig(kinesisFirehoseConfig: KinesisFirehoseConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("837242d5661f3787c2b251575e565ac16b1cc8ddceaa3e928aba36258457650d")
    public
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: KinesisFirehoseConfigProperty.Builder.() -> Unit)

    public fun kinesisStreamConfig(kinesisStreamConfig: IResolvable)

    public fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e0974cfd229ccc4f27fe13b7d0d51afc36bdd3fe5e372817ba019ba82b8bcd0")
    public
        fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty.Builder.() -> Unit)

    public fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: IResolvable)

    public fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: KinesisVideoStreamConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8797446b9b75f207d018820b7ee612f83c154f89380c02505464e74e9c664e66")
    public
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: KinesisVideoStreamConfigProperty.Builder.() -> Unit)

    public fun resourceType(resourceType: String)

    public fun s3Config(s3Config: IResolvable)

    public fun s3Config(s3Config: S3ConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebe316cdedce46a0df936d4f551a4a4e9e688aa09135bdd653b61fde43513318")
    public fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit)

    public fun storageType(storageType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.Builder
        = software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.Builder.create(scope, id)

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun kinesisFirehoseConfig(kinesisFirehoseConfig: IResolvable) {
      cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig.let(IResolvable::unwrap))
    }

    override fun kinesisFirehoseConfig(kinesisFirehoseConfig: KinesisFirehoseConfigProperty) {
      cdkBuilder.kinesisFirehoseConfig(kinesisFirehoseConfig.let(KinesisFirehoseConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("837242d5661f3787c2b251575e565ac16b1cc8ddceaa3e928aba36258457650d")
    override
        fun kinesisFirehoseConfig(kinesisFirehoseConfig: KinesisFirehoseConfigProperty.Builder.() -> Unit):
        Unit = kinesisFirehoseConfig(KinesisFirehoseConfigProperty(kinesisFirehoseConfig))

    override fun kinesisStreamConfig(kinesisStreamConfig: IResolvable) {
      cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(IResolvable::unwrap))
    }

    override fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty) {
      cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(KinesisStreamConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e0974cfd229ccc4f27fe13b7d0d51afc36bdd3fe5e372817ba019ba82b8bcd0")
    override
        fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty.Builder.() -> Unit):
        Unit = kinesisStreamConfig(KinesisStreamConfigProperty(kinesisStreamConfig))

    override fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: IResolvable) {
      cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig.let(IResolvable::unwrap))
    }

    override
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: KinesisVideoStreamConfigProperty) {
      cdkBuilder.kinesisVideoStreamConfig(kinesisVideoStreamConfig.let(KinesisVideoStreamConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8797446b9b75f207d018820b7ee612f83c154f89380c02505464e74e9c664e66")
    override
        fun kinesisVideoStreamConfig(kinesisVideoStreamConfig: KinesisVideoStreamConfigProperty.Builder.() -> Unit):
        Unit = kinesisVideoStreamConfig(KinesisVideoStreamConfigProperty(kinesisVideoStreamConfig))

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun s3Config(s3Config: IResolvable) {
      cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
    }

    override fun s3Config(s3Config: S3ConfigProperty) {
      cdkBuilder.s3Config(s3Config.let(S3ConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebe316cdedce46a0df936d4f551a4a4e9e688aa09135bdd653b61fde43513318")
    override fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit): Unit =
        s3Config(S3ConfigProperty(s3Config))

    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnInstanceStorageConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceStorageConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceStorageConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig):
        CfnInstanceStorageConfig = CfnInstanceStorageConfig(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceStorageConfig):
        software.amazon.awscdk.services.connect.CfnInstanceStorageConfig = wrapped.cdkObject
  }

  public interface KinesisStreamConfigProperty {
    public fun streamArn(): String

    public interface Builder {
      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty.builder()

      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty,
    ) : KinesisStreamConfigProperty {
      override fun streamArn(): String = unwrap(this).getStreamArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty):
          KinesisStreamConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamConfigProperty):
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisStreamConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisFirehoseConfigProperty {
    public fun firehoseArn(): String

    public interface Builder {
      public fun firehoseArn(firehoseArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.builder()

      override fun firehoseArn(firehoseArn: String) {
        cdkBuilder.firehoseArn(firehoseArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty,
    ) : KinesisFirehoseConfigProperty {
      override fun firehoseArn(): String = unwrap(this).getFirehoseArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty):
          KinesisFirehoseConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseConfigProperty):
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisFirehoseConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ConfigProperty {
    public fun bucketName(): String

    public fun bucketPrefix(): String

    public fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun bucketPrefix(bucketPrefix: String)

      public fun encryptionConfig(encryptionConfig: IResolvable)

      public fun encryptionConfig(encryptionConfig: EncryptionConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b587ea16dac97f9b6a3f7d9059384e699de7c3a22d9d30a3631948349c4dbec")
      public fun encryptionConfig(encryptionConfig: EncryptionConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      override fun encryptionConfig(encryptionConfig: IResolvable) {
        cdkBuilder.encryptionConfig(encryptionConfig.let(IResolvable::unwrap))
      }

      override fun encryptionConfig(encryptionConfig: EncryptionConfigProperty) {
        cdkBuilder.encryptionConfig(encryptionConfig.let(EncryptionConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b587ea16dac97f9b6a3f7d9059384e699de7c3a22d9d30a3631948349c4dbec")
      override fun encryptionConfig(encryptionConfig: EncryptionConfigProperty.Builder.() -> Unit):
          Unit = encryptionConfig(EncryptionConfigProperty(encryptionConfig))

      public fun build():
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty,
    ) : S3ConfigProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun bucketPrefix(): String = unwrap(this).getBucketPrefix()

      override fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty):
          S3ConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigProperty):
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.S3ConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisVideoStreamConfigProperty {
    public fun encryptionConfig(): Any

    public fun prefix(): String

    public fun retentionPeriodHours(): Number

    public interface Builder {
      public fun encryptionConfig(encryptionConfig: IResolvable)

      public fun encryptionConfig(encryptionConfig: EncryptionConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03ae3056e2f0c36164b8c11bc25a478da4c222920ea05c9641948476c5ef590f")
      public fun encryptionConfig(encryptionConfig: EncryptionConfigProperty.Builder.() -> Unit)

      public fun prefix(prefix: String)

      public fun retentionPeriodHours(retentionPeriodHours: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty.builder()

      override fun encryptionConfig(encryptionConfig: IResolvable) {
        cdkBuilder.encryptionConfig(encryptionConfig.let(IResolvable::unwrap))
      }

      override fun encryptionConfig(encryptionConfig: EncryptionConfigProperty) {
        cdkBuilder.encryptionConfig(encryptionConfig.let(EncryptionConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03ae3056e2f0c36164b8c11bc25a478da4c222920ea05c9641948476c5ef590f")
      override fun encryptionConfig(encryptionConfig: EncryptionConfigProperty.Builder.() -> Unit):
          Unit = encryptionConfig(EncryptionConfigProperty(encryptionConfig))

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun retentionPeriodHours(retentionPeriodHours: Number) {
        cdkBuilder.retentionPeriodHours(retentionPeriodHours)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty,
    ) : KinesisVideoStreamConfigProperty {
      override fun encryptionConfig(): Any = unwrap(this).getEncryptionConfig()

      override fun prefix(): String = unwrap(this).getPrefix()

      override fun retentionPeriodHours(): Number = unwrap(this).getRetentionPeriodHours()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisVideoStreamConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty):
          KinesisVideoStreamConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisVideoStreamConfigProperty):
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EncryptionConfigProperty {
    public fun encryptionType(): String

    public fun keyId(): String

    public interface Builder {
      public fun encryptionType(encryptionType: String)

      public fun keyId(keyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty.builder()

      override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      override fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty,
    ) : EncryptionConfigProperty {
      override fun encryptionType(): String = unwrap(this).getEncryptionType()

      override fun keyId(): String = unwrap(this).getKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty):
          EncryptionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigProperty):
          software.amazon.awscdk.services.connect.CfnInstanceStorageConfig.EncryptionConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

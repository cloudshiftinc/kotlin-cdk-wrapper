package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun encryptionConfiguration(): Any = unwrap(this).getEncryptionConfiguration()

  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ab58857b92fdadd7180278fa55038b4e4adba208f5e9503b98c5e0944b6f9c9c")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2d661c7cb5a046f1cf3d25eb041a3a6944de9e98a6509743c41f60ca94ed073")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.Builder =
        software.amazon.awscdk.services.glue.CfnSecurityConfiguration.Builder.create(scope, id)

    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2d661c7cb5a046f1cf3d25eb041a3a6944de9e98a6509743c41f60ca94ed073")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnSecurityConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration):
        CfnSecurityConfiguration = CfnSecurityConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityConfiguration):
        software.amazon.awscdk.services.glue.CfnSecurityConfiguration = wrapped.cdkObject
  }

  public interface EncryptionConfigurationProperty {
    public fun cloudWatchEncryption(): Any? = unwrap(this).getCloudWatchEncryption()

    public fun jobBookmarksEncryption(): Any? = unwrap(this).getJobBookmarksEncryption()

    public fun s3Encryptions(): Any? = unwrap(this).getS3Encryptions()

    public interface Builder {
      public fun cloudWatchEncryption(cloudWatchEncryption: IResolvable)

      public fun cloudWatchEncryption(cloudWatchEncryption: CloudWatchEncryptionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5af6550f41429b699a193a796c9b24ca0ecfabb293a337f25a4adfad5abbdcee")
      public
          fun cloudWatchEncryption(cloudWatchEncryption: CloudWatchEncryptionProperty.Builder.() -> Unit)

      public fun jobBookmarksEncryption(jobBookmarksEncryption: IResolvable)

      public fun jobBookmarksEncryption(jobBookmarksEncryption: JobBookmarksEncryptionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b122dc9d6bb91334ed916d535ba76b49f737643531468b50059ee1f377af3fac")
      public
          fun jobBookmarksEncryption(jobBookmarksEncryption: JobBookmarksEncryptionProperty.Builder.() -> Unit)

      public fun s3Encryptions(s3Encryptions: IResolvable)

      public fun s3Encryptions(s3Encryptions: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty.builder()

      override fun cloudWatchEncryption(cloudWatchEncryption: IResolvable) {
        cdkBuilder.cloudWatchEncryption(cloudWatchEncryption.let(IResolvable::unwrap))
      }

      override fun cloudWatchEncryption(cloudWatchEncryption: CloudWatchEncryptionProperty) {
        cdkBuilder.cloudWatchEncryption(cloudWatchEncryption.let(CloudWatchEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5af6550f41429b699a193a796c9b24ca0ecfabb293a337f25a4adfad5abbdcee")
      override
          fun cloudWatchEncryption(cloudWatchEncryption: CloudWatchEncryptionProperty.Builder.() -> Unit):
          Unit = cloudWatchEncryption(CloudWatchEncryptionProperty(cloudWatchEncryption))

      override fun jobBookmarksEncryption(jobBookmarksEncryption: IResolvable) {
        cdkBuilder.jobBookmarksEncryption(jobBookmarksEncryption.let(IResolvable::unwrap))
      }

      override fun jobBookmarksEncryption(jobBookmarksEncryption: JobBookmarksEncryptionProperty) {
        cdkBuilder.jobBookmarksEncryption(jobBookmarksEncryption.let(JobBookmarksEncryptionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b122dc9d6bb91334ed916d535ba76b49f737643531468b50059ee1f377af3fac")
      override
          fun jobBookmarksEncryption(jobBookmarksEncryption: JobBookmarksEncryptionProperty.Builder.() -> Unit):
          Unit = jobBookmarksEncryption(JobBookmarksEncryptionProperty(jobBookmarksEncryption))

      override fun s3Encryptions(s3Encryptions: IResolvable) {
        cdkBuilder.s3Encryptions(s3Encryptions.let(IResolvable::unwrap))
      }

      override fun s3Encryptions(s3Encryptions: List<Any>) {
        cdkBuilder.s3Encryptions(s3Encryptions)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty,
    ) : EncryptionConfigurationProperty {
      override fun cloudWatchEncryption(): Any? = unwrap(this).getCloudWatchEncryption()

      override fun jobBookmarksEncryption(): Any? = unwrap(this).getJobBookmarksEncryption()

      override fun s3Encryptions(): Any? = unwrap(this).getS3Encryptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchEncryptionProperty {
    public fun cloudWatchEncryptionMode(): String? = unwrap(this).getCloudWatchEncryptionMode()

    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public interface Builder {
      public fun cloudWatchEncryptionMode(cloudWatchEncryptionMode: String)

      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty.builder()

      override fun cloudWatchEncryptionMode(cloudWatchEncryptionMode: String) {
        cdkBuilder.cloudWatchEncryptionMode(cloudWatchEncryptionMode)
      }

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty,
    ) : CloudWatchEncryptionProperty {
      override fun cloudWatchEncryptionMode(): String? = unwrap(this).getCloudWatchEncryptionMode()

      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty):
          CloudWatchEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchEncryptionProperty):
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.CloudWatchEncryptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3EncryptionProperty {
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public fun s3EncryptionMode(): String? = unwrap(this).getS3EncryptionMode()

    public interface Builder {
      public fun kmsKeyArn(kmsKeyArn: String)

      public fun s3EncryptionMode(s3EncryptionMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty.builder()

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      override fun s3EncryptionMode(s3EncryptionMode: String) {
        cdkBuilder.s3EncryptionMode(s3EncryptionMode)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty,
    ) : S3EncryptionProperty {
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      override fun s3EncryptionMode(): String? = unwrap(this).getS3EncryptionMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty):
          S3EncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3EncryptionProperty):
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.S3EncryptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface JobBookmarksEncryptionProperty {
    public fun jobBookmarksEncryptionMode(): String? = unwrap(this).getJobBookmarksEncryptionMode()

    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public interface Builder {
      public fun jobBookmarksEncryptionMode(jobBookmarksEncryptionMode: String)

      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty.builder()

      override fun jobBookmarksEncryptionMode(jobBookmarksEncryptionMode: String) {
        cdkBuilder.jobBookmarksEncryptionMode(jobBookmarksEncryptionMode)
      }

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty,
    ) : JobBookmarksEncryptionProperty {
      override fun jobBookmarksEncryptionMode(): String? =
          unwrap(this).getJobBookmarksEncryptionMode()

      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JobBookmarksEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty):
          JobBookmarksEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobBookmarksEncryptionProperty):
          software.amazon.awscdk.services.glue.CfnSecurityConfiguration.JobBookmarksEncryptionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

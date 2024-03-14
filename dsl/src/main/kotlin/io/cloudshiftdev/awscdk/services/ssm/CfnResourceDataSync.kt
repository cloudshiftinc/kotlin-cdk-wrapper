package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnResourceDataSync internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSync,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrSyncName(): String = unwrap(this).getAttrSyncName()

  public open fun bucketName(): String? = unwrap(this).getBucketName()

  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  public open fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

  public open fun bucketPrefix(`value`: String) {
    unwrap(this).setBucketPrefix(`value`)
  }

  public open fun bucketRegion(): String? = unwrap(this).getBucketRegion()

  public open fun bucketRegion(`value`: String) {
    unwrap(this).setBucketRegion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  public open fun s3Destination(): Any? = unwrap(this).getS3Destination()

  public open fun s3Destination(`value`: IResolvable) {
    unwrap(this).setS3Destination(`value`.let(IResolvable::unwrap))
  }

  public open fun s3Destination(`value`: S3DestinationProperty) {
    unwrap(this).setS3Destination(`value`.let(S3DestinationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c432aa5a72a916d666940dd0f9f88e632981ae256c4848191f47b188b5a88af3")
  public open fun s3Destination(`value`: S3DestinationProperty.Builder.() -> Unit): Unit =
      s3Destination(S3DestinationProperty(`value`))

  public open fun syncFormat(): String? = unwrap(this).getSyncFormat()

  public open fun syncFormat(`value`: String) {
    unwrap(this).setSyncFormat(`value`)
  }

  public open fun syncName(): String = unwrap(this).getSyncName()

  public open fun syncName(`value`: String) {
    unwrap(this).setSyncName(`value`)
  }

  public open fun syncSource(): Any? = unwrap(this).getSyncSource()

  public open fun syncSource(`value`: IResolvable) {
    unwrap(this).setSyncSource(`value`.let(IResolvable::unwrap))
  }

  public open fun syncSource(`value`: SyncSourceProperty) {
    unwrap(this).setSyncSource(`value`.let(SyncSourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f8e468ffa5c113c230b1ebfca5c85b16a5879409f1f5ba7068a0bda7d8190d3")
  public open fun syncSource(`value`: SyncSourceProperty.Builder.() -> Unit): Unit =
      syncSource(SyncSourceProperty(`value`))

  public open fun syncType(): String? = unwrap(this).getSyncType()

  public open fun syncType(`value`: String) {
    unwrap(this).setSyncType(`value`)
  }

  public interface Builder {
    public fun bucketName(bucketName: String)

    public fun bucketPrefix(bucketPrefix: String)

    public fun bucketRegion(bucketRegion: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun s3Destination(s3Destination: IResolvable)

    public fun s3Destination(s3Destination: S3DestinationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c378387d02085c81c4b97cfbbed7f69a5025cddd7a2441d77d7d685cae1c0ed2")
    public fun s3Destination(s3Destination: S3DestinationProperty.Builder.() -> Unit)

    public fun syncFormat(syncFormat: String)

    public fun syncName(syncName: String)

    public fun syncSource(syncSource: IResolvable)

    public fun syncSource(syncSource: SyncSourceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e14b005fb825862d912ca43eb369a99982a83b0e4689af10cd3f1c5f5f71498")
    public fun syncSource(syncSource: SyncSourceProperty.Builder.() -> Unit)

    public fun syncType(syncType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnResourceDataSync.Builder =
        software.amazon.awscdk.services.ssm.CfnResourceDataSync.Builder.create(scope, id)

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun bucketPrefix(bucketPrefix: String) {
      cdkBuilder.bucketPrefix(bucketPrefix)
    }

    override fun bucketRegion(bucketRegion: String) {
      cdkBuilder.bucketRegion(bucketRegion)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun s3Destination(s3Destination: IResolvable) {
      cdkBuilder.s3Destination(s3Destination.let(IResolvable::unwrap))
    }

    override fun s3Destination(s3Destination: S3DestinationProperty) {
      cdkBuilder.s3Destination(s3Destination.let(S3DestinationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c378387d02085c81c4b97cfbbed7f69a5025cddd7a2441d77d7d685cae1c0ed2")
    override fun s3Destination(s3Destination: S3DestinationProperty.Builder.() -> Unit): Unit =
        s3Destination(S3DestinationProperty(s3Destination))

    override fun syncFormat(syncFormat: String) {
      cdkBuilder.syncFormat(syncFormat)
    }

    override fun syncName(syncName: String) {
      cdkBuilder.syncName(syncName)
    }

    override fun syncSource(syncSource: IResolvable) {
      cdkBuilder.syncSource(syncSource.let(IResolvable::unwrap))
    }

    override fun syncSource(syncSource: SyncSourceProperty) {
      cdkBuilder.syncSource(syncSource.let(SyncSourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e14b005fb825862d912ca43eb369a99982a83b0e4689af10cd3f1c5f5f71498")
    override fun syncSource(syncSource: SyncSourceProperty.Builder.() -> Unit): Unit =
        syncSource(SyncSourceProperty(syncSource))

    override fun syncType(syncType: String) {
      cdkBuilder.syncType(syncType)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnResourceDataSync = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceDataSync {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceDataSync(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSync):
        CfnResourceDataSync = CfnResourceDataSync(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDataSync):
        software.amazon.awscdk.services.ssm.CfnResourceDataSync = wrapped.cdkObject
  }

  public interface AwsOrganizationsSourceProperty {
    public fun organizationSourceType(): String

    public fun organizationalUnits(): List<String> = unwrap(this).getOrganizationalUnits() ?:
        emptyList()

    public interface Builder {
      public fun organizationSourceType(organizationSourceType: String)

      public fun organizationalUnits(organizationalUnits: List<String>)

      public fun organizationalUnits(vararg organizationalUnits: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty.Builder
          =
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty.builder()

      override fun organizationSourceType(organizationSourceType: String) {
        cdkBuilder.organizationSourceType(organizationSourceType)
      }

      override fun organizationalUnits(organizationalUnits: List<String>) {
        cdkBuilder.organizationalUnits(organizationalUnits)
      }

      override fun organizationalUnits(vararg organizationalUnits: String): Unit =
          organizationalUnits(organizationalUnits.toList())

      public fun build():
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty,
    ) : AwsOrganizationsSourceProperty {
      override fun organizationSourceType(): String = unwrap(this).getOrganizationSourceType()

      override fun organizationalUnits(): List<String> = unwrap(this).getOrganizationalUnits() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AwsOrganizationsSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty):
          AwsOrganizationsSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsOrganizationsSourceProperty):
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.AwsOrganizationsSourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3DestinationProperty {
    public fun bucketName(): String

    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public fun bucketRegion(): String

    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public fun syncFormat(): String

    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun bucketPrefix(bucketPrefix: String)

      public fun bucketRegion(bucketRegion: String)

      public fun kmsKeyArn(kmsKeyArn: String)

      public fun syncFormat(syncFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      override fun bucketRegion(bucketRegion: String) {
        cdkBuilder.bucketRegion(bucketRegion)
      }

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      override fun syncFormat(syncFormat: String) {
        cdkBuilder.syncFormat(syncFormat)
      }

      public fun build():
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty,
    ) : S3DestinationProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      override fun bucketRegion(): String = unwrap(this).getBucketRegion()

      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      override fun syncFormat(): String = unwrap(this).getSyncFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty):
          S3DestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationProperty):
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.S3DestinationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SyncSourceProperty {
    public fun awsOrganizationsSource(): Any? = unwrap(this).getAwsOrganizationsSource()

    public fun includeFutureRegions(): Any? = unwrap(this).getIncludeFutureRegions()

    public fun sourceRegions(): List<String>

    public fun sourceType(): String

    public interface Builder {
      public fun awsOrganizationsSource(awsOrganizationsSource: IResolvable)

      public fun awsOrganizationsSource(awsOrganizationsSource: AwsOrganizationsSourceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88e6d3855aee2ba6fd38c8dd0a81e6ed5bcc2164ffa523c9dc2e0708b28e2bdf")
      public
          fun awsOrganizationsSource(awsOrganizationsSource: AwsOrganizationsSourceProperty.Builder.() -> Unit)

      public fun includeFutureRegions(includeFutureRegions: Boolean)

      public fun includeFutureRegions(includeFutureRegions: IResolvable)

      public fun sourceRegions(sourceRegions: List<String>)

      public fun sourceRegions(vararg sourceRegions: String)

      public fun sourceType(sourceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty.builder()

      override fun awsOrganizationsSource(awsOrganizationsSource: IResolvable) {
        cdkBuilder.awsOrganizationsSource(awsOrganizationsSource.let(IResolvable::unwrap))
      }

      override fun awsOrganizationsSource(awsOrganizationsSource: AwsOrganizationsSourceProperty) {
        cdkBuilder.awsOrganizationsSource(awsOrganizationsSource.let(AwsOrganizationsSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88e6d3855aee2ba6fd38c8dd0a81e6ed5bcc2164ffa523c9dc2e0708b28e2bdf")
      override
          fun awsOrganizationsSource(awsOrganizationsSource: AwsOrganizationsSourceProperty.Builder.() -> Unit):
          Unit = awsOrganizationsSource(AwsOrganizationsSourceProperty(awsOrganizationsSource))

      override fun includeFutureRegions(includeFutureRegions: Boolean) {
        cdkBuilder.includeFutureRegions(includeFutureRegions)
      }

      override fun includeFutureRegions(includeFutureRegions: IResolvable) {
        cdkBuilder.includeFutureRegions(includeFutureRegions.let(IResolvable::unwrap))
      }

      override fun sourceRegions(sourceRegions: List<String>) {
        cdkBuilder.sourceRegions(sourceRegions)
      }

      override fun sourceRegions(vararg sourceRegions: String): Unit =
          sourceRegions(sourceRegions.toList())

      override fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
      }

      public fun build(): software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty,
    ) : SyncSourceProperty {
      override fun awsOrganizationsSource(): Any? = unwrap(this).getAwsOrganizationsSource()

      override fun includeFutureRegions(): Any? = unwrap(this).getIncludeFutureRegions()

      override fun sourceRegions(): List<String> = unwrap(this).getSourceRegions()

      override fun sourceType(): String = unwrap(this).getSourceType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SyncSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty):
          SyncSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SyncSourceProperty):
          software.amazon.awscdk.services.ssm.CfnResourceDataSync.SyncSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}

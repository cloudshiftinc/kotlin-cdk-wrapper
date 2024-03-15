@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnResourceDataSyncProps {
  public fun bucketName(): String? = unwrap(this).getBucketName()

  public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

  public fun bucketRegion(): String? = unwrap(this).getBucketRegion()

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun s3Destination(): Any? = unwrap(this).getS3Destination()

  public fun syncFormat(): String? = unwrap(this).getSyncFormat()

  public fun syncName(): String

  public fun syncSource(): Any? = unwrap(this).getSyncSource()

  public fun syncType(): String? = unwrap(this).getSyncType()

  @CdkDslMarker
  public interface Builder {
    public fun bucketName(bucketName: String)

    public fun bucketPrefix(bucketPrefix: String)

    public fun bucketRegion(bucketRegion: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun s3Destination(s3Destination: IResolvable)

    public fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7552ab8a7fe08243c488d378cf9c819e6c90971e4ea849a36200de1164446aa2")
    public
        fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty.Builder.() -> Unit)

    public fun syncFormat(syncFormat: String)

    public fun syncName(syncName: String)

    public fun syncSource(syncSource: IResolvable)

    public fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffe484ae1dfc69db267d415ae122618d657352e806e838efddea605927310215")
    public fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty.Builder.() -> Unit)

    public fun syncType(syncType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps.Builder =
        software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps.builder()

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

    override fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty) {
      cdkBuilder.s3Destination(s3Destination.let(CfnResourceDataSync.S3DestinationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7552ab8a7fe08243c488d378cf9c819e6c90971e4ea849a36200de1164446aa2")
    override
        fun s3Destination(s3Destination: CfnResourceDataSync.S3DestinationProperty.Builder.() -> Unit):
        Unit = s3Destination(CfnResourceDataSync.S3DestinationProperty(s3Destination))

    override fun syncFormat(syncFormat: String) {
      cdkBuilder.syncFormat(syncFormat)
    }

    override fun syncName(syncName: String) {
      cdkBuilder.syncName(syncName)
    }

    override fun syncSource(syncSource: IResolvable) {
      cdkBuilder.syncSource(syncSource.let(IResolvable::unwrap))
    }

    override fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty) {
      cdkBuilder.syncSource(syncSource.let(CfnResourceDataSync.SyncSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffe484ae1dfc69db267d415ae122618d657352e806e838efddea605927310215")
    override fun syncSource(syncSource: CfnResourceDataSync.SyncSourceProperty.Builder.() -> Unit):
        Unit = syncSource(CfnResourceDataSync.SyncSourceProperty(syncSource))

    override fun syncType(syncType: String) {
      cdkBuilder.syncType(syncType)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps,
  ) : CdkObject(cdkObject), CfnResourceDataSyncProps {
    override fun bucketName(): String? = unwrap(this).getBucketName()

    override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    override fun bucketRegion(): String? = unwrap(this).getBucketRegion()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun s3Destination(): Any? = unwrap(this).getS3Destination()

    override fun syncFormat(): String? = unwrap(this).getSyncFormat()

    override fun syncName(): String = unwrap(this).getSyncName()

    override fun syncSource(): Any? = unwrap(this).getSyncSource()

    override fun syncType(): String? = unwrap(this).getSyncType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceDataSyncProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps):
        CfnResourceDataSyncProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDataSyncProps):
        software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnResourceDataSyncProps
  }
}

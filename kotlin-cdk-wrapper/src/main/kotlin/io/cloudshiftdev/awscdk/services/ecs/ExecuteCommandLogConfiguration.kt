@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ExecuteCommandLogConfiguration {
  public fun cloudWatchEncryptionEnabled(): Boolean? = unwrap(this).getCloudWatchEncryptionEnabled()

  public fun cloudWatchLogGroup(): ILogGroup? =
      unwrap(this).getCloudWatchLogGroup()?.let(ILogGroup::wrap)

  public fun s3Bucket(): IBucket? = unwrap(this).getS3Bucket()?.let(IBucket::wrap)

  public fun s3EncryptionEnabled(): Boolean? = unwrap(this).getS3EncryptionEnabled()

  public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  @CdkDslMarker
  public interface Builder {
    public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean)

    public fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup)

    public fun s3Bucket(s3Bucket: IBucket)

    public fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean)

    public fun s3KeyPrefix(s3KeyPrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration.Builder =
        software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration.builder()

    override fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean) {
      cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled)
    }

    override fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
      cdkBuilder.cloudWatchLogGroup(cloudWatchLogGroup.let(ILogGroup::unwrap))
    }

    override fun s3Bucket(s3Bucket: IBucket) {
      cdkBuilder.s3Bucket(s3Bucket.let(IBucket::unwrap))
    }

    override fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean) {
      cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled)
    }

    override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration,
  ) : CdkObject(cdkObject), ExecuteCommandLogConfiguration {
    override fun cloudWatchEncryptionEnabled(): Boolean? =
        unwrap(this).getCloudWatchEncryptionEnabled()

    override fun cloudWatchLogGroup(): ILogGroup? =
        unwrap(this).getCloudWatchLogGroup()?.let(ILogGroup::wrap)

    override fun s3Bucket(): IBucket? = unwrap(this).getS3Bucket()?.let(IBucket::wrap)

    override fun s3EncryptionEnabled(): Boolean? = unwrap(this).getS3EncryptionEnabled()

    override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExecuteCommandLogConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration):
        ExecuteCommandLogConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExecuteCommandLogConfiguration):
        software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration
  }
}

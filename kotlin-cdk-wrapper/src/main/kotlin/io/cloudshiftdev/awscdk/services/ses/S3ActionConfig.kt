@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface S3ActionConfig {
  public fun bucketName(): String

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

  public fun topicArn(): String? = unwrap(this).getTopicArn()

  @CdkDslMarker
  public interface Builder {
    public fun bucketName(bucketName: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun objectKeyPrefix(objectKeyPrefix: String)

    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.S3ActionConfig.Builder =
        software.amazon.awscdk.services.ses.S3ActionConfig.builder()

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun objectKeyPrefix(objectKeyPrefix: String) {
      cdkBuilder.objectKeyPrefix(objectKeyPrefix)
    }

    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.S3ActionConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.S3ActionConfig,
  ) : CdkObject(cdkObject), S3ActionConfig {
    override fun bucketName(): String = unwrap(this).getBucketName()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

    override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3ActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.S3ActionConfig): S3ActionConfig
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3ActionConfig): software.amazon.awscdk.services.ses.S3ActionConfig
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.S3ActionConfig
  }
}

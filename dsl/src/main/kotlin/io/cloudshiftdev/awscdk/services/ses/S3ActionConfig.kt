package io.cloudshiftdev.awscdk.services.ses

import kotlin.String
import kotlin.Unit

public interface S3ActionConfig {
  public fun bucketName(): String

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

  public fun topicArn(): String? = unwrap(this).getTopicArn()

  public interface Builder {
    public fun bucketName(bucketName: String) {
    }

    public fun kmsKeyArn(kmsKeyArn: String) {
    }

    public fun objectKeyPrefix(objectKeyPrefix: String) {
    }

    public fun topicArn(topicArn: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.S3ActionConfig.Builder =
        software.amazon.awscdk.services.ses.S3ActionConfig.builder()

    public override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    public override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public override fun objectKeyPrefix(objectKeyPrefix: String) {
      cdkBuilder.objectKeyPrefix(objectKeyPrefix)
    }

    public override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.S3ActionConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.S3ActionConfig,
  ) : S3ActionConfig {
    public override fun bucketName(): String = unwrap(this).getBucketName()

    public override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

    public override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): S3ActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.S3ActionConfig): S3ActionConfig
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3ActionConfig): software.amazon.awscdk.services.ses.S3ActionConfig
        = (wrapped as Wrapper).cdkObject
  }
}

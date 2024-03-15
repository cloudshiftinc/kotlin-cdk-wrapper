@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit

public interface S3Props {
  public fun bucket(): IBucket

  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

  public fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun kmsKey(kmsKey: IKey)

    public fun objectKeyPrefix(objectKeyPrefix: String)

    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.S3Props.Builder =
        software.amazon.awscdk.services.ses.actions.S3Props.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    override fun objectKeyPrefix(objectKeyPrefix: String) {
      cdkBuilder.objectKeyPrefix(objectKeyPrefix)
    }

    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.S3Props = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.S3Props,
  ) : CdkObject(cdkObject), S3Props {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

    override fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.S3Props): S3Props =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3Props): software.amazon.awscdk.services.ses.actions.S3Props =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.actions.S3Props
  }
}

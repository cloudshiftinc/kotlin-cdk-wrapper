package io.cloudshiftdev.awscdk.services.secretsmanager

import kotlin.String
import kotlin.Unit

public interface SecretAttachmentTargetProps {
  public fun targetId(): String

  public fun targetType(): AttachmentTargetType

  public interface Builder {
    public fun targetId(targetId: String)

    public fun targetType(targetType: AttachmentTargetType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.builder()

    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    override fun targetType(targetType: AttachmentTargetType) {
      cdkBuilder.targetType(targetType.let(AttachmentTargetType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps,
  ) : SecretAttachmentTargetProps {
    override fun targetId(): String = unwrap(this).getTargetId()

    override fun targetType(): AttachmentTargetType =
        unwrap(this).getTargetType().let(AttachmentTargetType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SecretAttachmentTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps):
        SecretAttachmentTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretAttachmentTargetProps):
        software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps = (wrapped as
        Wrapper).cdkObject
  }
}

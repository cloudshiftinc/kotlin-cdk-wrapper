package io.cloudshiftdev.awscdk.services.secretsmanager

public interface ISecretAttachmentTarget {
  public fun asSecretAttachmentTarget(): SecretAttachmentTargetProps

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget,
  ) : ISecretAttachmentTarget {
    override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
        unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget):
        ISecretAttachmentTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISecretAttachmentTarget):
        software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget = (wrapped as
        Wrapper).cdkObject
  }
}

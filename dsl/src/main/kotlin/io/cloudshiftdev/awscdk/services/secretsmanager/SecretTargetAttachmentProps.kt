package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface SecretTargetAttachmentProps : AttachedSecretOptions {
  /**
   * The secret to attach to the target.
   */
  public fun secret(): ISecret

  /**
   * A builder for [SecretTargetAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param secret The secret to attach to the target. 
     */
    public fun secret(secret: ISecret)

    /**
     * @param target The target to attach the secret to. 
     */
    public fun target(target: ISecretAttachmentTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps.builder()

    /**
     * @param secret The secret to attach to the target. 
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    /**
     * @param target The target to attach the secret to. 
     */
    override fun target(target: ISecretAttachmentTarget) {
      cdkBuilder.target(target.let(ISecretAttachmentTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps,
  ) : CdkObject(cdkObject), SecretTargetAttachmentProps {
    /**
     * The secret to attach to the target.
     */
    override fun secret(): ISecret = unwrap(this).getSecret().let(ISecret::wrap)

    /**
     * The target to attach the secret to.
     */
    override fun target(): ISecretAttachmentTarget =
        unwrap(this).getTarget().let(ISecretAttachmentTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretTargetAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps):
        SecretTargetAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretTargetAttachmentProps):
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps
  }
}

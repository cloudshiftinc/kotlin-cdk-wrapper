package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface AttachedSecretOptions {
  /**
   * The target to attach the secret to.
   */
  public fun target(): ISecretAttachmentTarget

  /**
   * A builder for [AttachedSecretOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param target The target to attach the secret to. 
     */
    public fun target(target: ISecretAttachmentTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions.Builder =
        software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions.builder()

    /**
     * @param target The target to attach the secret to. 
     */
    override fun target(target: ISecretAttachmentTarget) {
      cdkBuilder.target(target.let(ISecretAttachmentTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions,
  ) : CdkObject(cdkObject), AttachedSecretOptions {
    /**
     * The target to attach the secret to.
     */
    override fun target(): ISecretAttachmentTarget =
        unwrap(this).getTarget().let(ISecretAttachmentTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AttachedSecretOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions):
        AttachedSecretOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AttachedSecretOptions):
        software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions
  }
}

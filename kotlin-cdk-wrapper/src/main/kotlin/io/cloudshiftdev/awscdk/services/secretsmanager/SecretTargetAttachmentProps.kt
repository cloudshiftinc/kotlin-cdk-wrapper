@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface SecretTargetAttachmentProps : AttachedSecretOptions {
  public fun secret(): ISecret

  @CdkDslMarker
  public interface Builder {
    public fun secret(secret: ISecret)

    public fun target(target: ISecretAttachmentTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps.builder()

    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

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
    override fun secret(): ISecret = unwrap(this).getSecret().let(ISecret::wrap)

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

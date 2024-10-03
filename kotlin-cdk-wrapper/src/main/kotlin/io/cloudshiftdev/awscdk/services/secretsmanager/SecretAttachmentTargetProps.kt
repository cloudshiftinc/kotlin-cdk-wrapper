@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Attachment target specifications.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * SecretAttachmentTargetProps secretAttachmentTargetProps = SecretAttachmentTargetProps.builder()
 * .targetId("targetId")
 * .targetType(AttachmentTargetType.RDS_DB_INSTANCE)
 * .build();
 * ```
 */
public interface SecretAttachmentTargetProps {
  /**
   * The id of the target to attach the secret to.
   */
  public fun targetId(): String

  /**
   * The type of the target to attach the secret to.
   */
  public fun targetType(): AttachmentTargetType

  /**
   * A builder for [SecretAttachmentTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param targetId The id of the target to attach the secret to. 
     */
    public fun targetId(targetId: String)

    /**
     * @param targetType The type of the target to attach the secret to. 
     */
    public fun targetType(targetType: AttachmentTargetType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps.builder()

    /**
     * @param targetId The id of the target to attach the secret to. 
     */
    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    /**
     * @param targetType The type of the target to attach the secret to. 
     */
    override fun targetType(targetType: AttachmentTargetType) {
      cdkBuilder.targetType(targetType.let(AttachmentTargetType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps,
  ) : CdkObject(cdkObject),
      SecretAttachmentTargetProps {
    /**
     * The id of the target to attach the secret to.
     */
    override fun targetId(): String = unwrap(this).getTargetId()

    /**
     * The type of the target to attach the secret to.
     */
    override fun targetType(): AttachmentTargetType =
        unwrap(this).getTargetType().let(AttachmentTargetType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretAttachmentTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps):
        SecretAttachmentTargetProps = CdkObjectWrappers.wrap(cdkObject) as?
        SecretAttachmentTargetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretAttachmentTargetProps):
        software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps
  }
}

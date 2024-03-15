@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * A secret attachment target.
 */
public interface ISecretAttachmentTarget {
  /**
   * Renders the target specifications.
   */
  public fun asSecretAttachmentTarget(): SecretAttachmentTargetProps

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget,
  ) : CdkObject(cdkObject), ISecretAttachmentTarget {
    /**
     * Renders the target specifications.
     */
    override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
        unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget):
        ISecretAttachmentTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISecretAttachmentTarget):
        software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget
  }
}

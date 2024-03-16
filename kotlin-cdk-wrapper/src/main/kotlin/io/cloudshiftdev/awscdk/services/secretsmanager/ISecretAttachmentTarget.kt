@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * A secret attachment target.
 */
public interface ISecretAttachmentTarget {
  /**
   * Renders the target specifications.
   */
  public fun asSecretAttachmentTarget(): SecretAttachmentTargetProps

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget):
        ISecretAttachmentTarget = CdkObjectWrappers.wrap(cdkObject) as ISecretAttachmentTarget

    internal fun unwrap(wrapped: ISecretAttachmentTarget):
        software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget
  }
}

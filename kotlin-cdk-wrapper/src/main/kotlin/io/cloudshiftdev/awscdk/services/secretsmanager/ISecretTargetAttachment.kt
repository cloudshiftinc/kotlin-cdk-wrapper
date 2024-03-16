@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface ISecretTargetAttachment : ISecret {
  /**
   * Same as `secretArn`.
   */
  public fun secretTargetAttachmentSecretArn(): String

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ISecretTargetAttachment):
        ISecretTargetAttachment = CdkObjectWrappers.wrap(cdkObject) as ISecretTargetAttachment

    internal fun unwrap(wrapped: ISecretTargetAttachment):
        software.amazon.awscdk.services.secretsmanager.ISecretTargetAttachment = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.ISecretTargetAttachment
  }
}

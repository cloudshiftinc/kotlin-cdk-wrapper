@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 * An email identity.
 */
public interface IEmailIdentity : IResource {
  /**
   * The ARN of the email identity.
   */
  public fun emailIdentityArn(): String

  /**
   * The name of the email identity.
   */
  public fun emailIdentityName(): String

  /**
   * Adds an IAM policy statement associated with this email identity to an IAM principal's policy.
   *
   * @param grantee the principal (no-op if undefined). 
   * @param actions the set of actions to allow. 
   */
  public fun grant(grantee: IGrantable, actions: String): Grant

  /**
   * Permits an IAM principal the send email action.
   *
   * Actions: SendEmail.
   *
   * @param grantee the principal to grant access to. 
   */
  public fun grantSendEmail(grantee: IGrantable): Grant

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IEmailIdentity): IEmailIdentity
        = CdkObjectWrappers.wrap(cdkObject) as IEmailIdentity

    internal fun unwrap(wrapped: IEmailIdentity): software.amazon.awscdk.services.ses.IEmailIdentity
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.IEmailIdentity
  }
}

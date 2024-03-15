@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.IEmailIdentity,
  ) : CdkObject(cdkObject), IEmailIdentity {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The ARN of the email identity.
     */
    override fun emailIdentityArn(): String = unwrap(this).getEmailIdentityArn()

    /**
     * The name of the email identity.
     */
    override fun emailIdentityName(): String = unwrap(this).getEmailIdentityName()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Adds an IAM policy statement associated with this email identity to an IAM principal's
     * policy.
     *
     * @param grantee the principal (no-op if undefined). 
     * @param actions the set of actions to allow. 
     */
    override fun grant(grantee: IGrantable, actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

    /**
     * Permits an IAM principal the send email action.
     *
     * Actions: SendEmail.
     *
     * @param grantee the principal to grant access to. 
     */
    override fun grantSendEmail(grantee: IGrantable): Grant =
        unwrap(this).grantSendEmail(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IEmailIdentity): IEmailIdentity
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEmailIdentity): software.amazon.awscdk.services.ses.IEmailIdentity
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.IEmailIdentity
  }
}

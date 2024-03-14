package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IIdentity : IPrincipal, IResource {
  /**
   * Attaches a managed policy to this principal.
   *
   * @param policy The managed policy. 
   */
  public fun addManagedPolicy(policy: IManagedPolicy)

  /**
   * Attaches an inline policy to this principal.
   *
   * This is the same as calling `policy.addToXxx(principal)`.
   *
   * @param policy The policy resource to attach to this principal
   * [disable-awslint:ref-via-interface]. 
   */
  public fun attachInlinePolicy(policy: Policy)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.IIdentity,
  ) : IIdentity {
    /**
     * Attaches a managed policy to this principal.
     *
     * @param policy The managed policy. 
     */
    override fun addManagedPolicy(policy: IManagedPolicy) {
      unwrap(this).addManagedPolicy(policy.let(IManagedPolicy::unwrap))
    }

    /**
     * Add to the policy of this principal.
     *
     * @param statement 
     */
    override fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult =
        unwrap(this).addToPrincipalPolicy(statement.let(PolicyStatement::unwrap)).let(AddToPrincipalPolicyResult::wrap)

    /**
     * Add to the policy of this principal.
     *
     * @param statement 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
    override fun addToPrincipalPolicy(statement: PolicyStatement.Builder.() -> Unit):
        AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(statement))

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
     * When this Principal is used in an AssumeRole policy, the action to use.
     */
    override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

    /**
     * Attaches an inline policy to this principal.
     *
     * This is the same as calling `policy.addToXxx(principal)`.
     *
     * @param policy The policy resource to attach to this principal
     * [disable-awslint:ref-via-interface]. 
     */
    override fun attachInlinePolicy(policy: Policy) {
      unwrap(this).attachInlinePolicy(policy.let(Policy::unwrap))
    }

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
     * The principal to grant permissions to.
     */
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Return the policy fragment that identifies this principal in a Policy.
     */
    override fun policyFragment(): PrincipalPolicyFragment =
        unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

    /**
     * The AWS account ID of this principal.
     *
     * Can be undefined when the account is not known
     * (for example, for service principals).
     * Can be a Token - in that case,
     * it's assumed to be AWS::AccountId.
     */
    override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IIdentity): IIdentity =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IIdentity): software.amazon.awscdk.services.iam.IIdentity =
        (wrapped as Wrapper).cdkObject
  }
}

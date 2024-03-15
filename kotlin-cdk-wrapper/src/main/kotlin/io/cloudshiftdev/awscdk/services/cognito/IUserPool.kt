@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Represents a Cognito UserPool.
 */
public interface IUserPool : IResource {
  /**
   * Add a new app client to this user pool.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html)
   * @param id 
   * @param options
   */
  public fun addClient(id: String): UserPoolClient

  /**
   * Add a new app client to this user pool.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html)
   * @param id 
   * @param options
   */
  public fun addClient(id: String, options: UserPoolClientOptions): UserPoolClient

  /**
   * Add a new app client to this user pool.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html)
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("42297806aa541d85041ea1bc4cf76108cb351b2d246367abc20a34d17396503d")
  public fun addClient(id: String, options: UserPoolClientOptions.Builder.() -> Unit):
      UserPoolClient

  /**
   * Associate a domain to this user pool.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html)
   * @param id 
   * @param options 
   */
  public fun addDomain(id: String, options: UserPoolDomainOptions): UserPoolDomain

  /**
   * Associate a domain to this user pool.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html)
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ec5f0dfd81190c1f527b75d6573c8eecb7722a4724cfee3c560b8e67d4e8e51")
  public fun addDomain(id: String, options: UserPoolDomainOptions.Builder.() -> Unit):
      UserPoolDomain

  /**
   * Add a new resource server to this user pool.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-resource-servers.html)
   * @param id 
   * @param options 
   */
  public fun addResourceServer(id: String, options: UserPoolResourceServerOptions):
      UserPoolResourceServer

  /**
   * Add a new resource server to this user pool.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-resource-servers.html)
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c0131bb696cddea8896fb678ee26b29332262cbb25eaa0573fe05069a3b0d28d")
  public fun addResourceServer(id: String,
      options: UserPoolResourceServerOptions.Builder.() -> Unit): UserPoolResourceServer

  /**
   * Adds an IAM policy statement associated with this user pool to an IAM principal's policy.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, actions: String): Grant

  /**
   * Get all identity providers registered with this user pool.
   */
  public fun identityProviders(): List<IUserPoolIdentityProvider>

  /**
   * Register an identity provider with this user pool.
   *
   * @param provider 
   */
  public fun registerIdentityProvider(provider: IUserPoolIdentityProvider)

  /**
   * The ARN of this user pool resource.
   */
  public fun userPoolArn(): String

  /**
   * The physical ID of this user pool resource.
   */
  public fun userPoolId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.IUserPool,
  ) : CdkObject(cdkObject), IUserPool {
    /**
     * Add a new app client to this user pool.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html)
     * @param id 
     * @param options
     */
    override fun addClient(id: String): UserPoolClient =
        unwrap(this).addClient(id).let(UserPoolClient::wrap)

    /**
     * Add a new app client to this user pool.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html)
     * @param id 
     * @param options
     */
    override fun addClient(id: String, options: UserPoolClientOptions): UserPoolClient =
        unwrap(this).addClient(id,
        options.let(UserPoolClientOptions::unwrap)).let(UserPoolClient::wrap)

    /**
     * Add a new app client to this user pool.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html)
     * @param id 
     * @param options
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42297806aa541d85041ea1bc4cf76108cb351b2d246367abc20a34d17396503d")
    override fun addClient(id: String, options: UserPoolClientOptions.Builder.() -> Unit):
        UserPoolClient = addClient(id, UserPoolClientOptions(options))

    /**
     * Associate a domain to this user pool.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html)
     * @param id 
     * @param options 
     */
    override fun addDomain(id: String, options: UserPoolDomainOptions): UserPoolDomain =
        unwrap(this).addDomain(id,
        options.let(UserPoolDomainOptions::unwrap)).let(UserPoolDomain::wrap)

    /**
     * Associate a domain to this user pool.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html)
     * @param id 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ec5f0dfd81190c1f527b75d6573c8eecb7722a4724cfee3c560b8e67d4e8e51")
    override fun addDomain(id: String, options: UserPoolDomainOptions.Builder.() -> Unit):
        UserPoolDomain = addDomain(id, UserPoolDomainOptions(options))

    /**
     * Add a new resource server to this user pool.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-resource-servers.html)
     * @param id 
     * @param options 
     */
    override fun addResourceServer(id: String, options: UserPoolResourceServerOptions):
        UserPoolResourceServer = unwrap(this).addResourceServer(id,
        options.let(UserPoolResourceServerOptions::unwrap)).let(UserPoolResourceServer::wrap)

    /**
     * Add a new resource server to this user pool.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-resource-servers.html)
     * @param id 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0131bb696cddea8896fb678ee26b29332262cbb25eaa0573fe05069a3b0d28d")
    override fun addResourceServer(id: String,
        options: UserPoolResourceServerOptions.Builder.() -> Unit): UserPoolResourceServer =
        addResourceServer(id, UserPoolResourceServerOptions(options))

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
     * Adds an IAM policy statement associated with this user pool to an IAM principal's policy.
     *
     * @param grantee 
     * @param actions 
     */
    override fun grant(grantee: IGrantable, actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

    /**
     * Get all identity providers registered with this user pool.
     */
    override fun identityProviders(): List<IUserPoolIdentityProvider> =
        unwrap(this).getIdentityProviders().map(IUserPoolIdentityProvider::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Register an identity provider with this user pool.
     *
     * @param provider 
     */
    override fun registerIdentityProvider(provider: IUserPoolIdentityProvider) {
      unwrap(this).registerIdentityProvider(provider.let(IUserPoolIdentityProvider::unwrap))
    }

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The ARN of this user pool resource.
     */
    override fun userPoolArn(): String = unwrap(this).getUserPoolArn()

    /**
     * The physical ID of this user pool resource.
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.IUserPool): IUserPool =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IUserPool): software.amazon.awscdk.services.cognito.IUserPool =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cognito.IUserPool
  }
}

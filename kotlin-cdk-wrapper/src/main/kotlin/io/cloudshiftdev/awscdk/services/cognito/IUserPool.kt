@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.IUserPool): IUserPool =
        CdkObjectWrappers.wrap(cdkObject) as IUserPool

    internal fun unwrap(wrapped: IUserPool): software.amazon.awscdk.services.cognito.IUserPool =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cognito.IUserPool
  }
}

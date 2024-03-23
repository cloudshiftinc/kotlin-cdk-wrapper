@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Configures Amazon OpenSearch Service to use Amazon Cognito authentication for OpenSearch
 * Dashboards.
 *
 * Example:
 *
 * ```
 * Domain.Builder.create(this, "Domain")
 * .cognitoDashboardsAuth(CognitoOptions.builder()
 * .identityPoolId("test-identity-pool-id")
 * .userPoolId("test-user-pool-id")
 * .role(role)
 * .build())
 * .version(openSearchVersion)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
 */
public interface CognitoOptions {
  /**
   * The Amazon Cognito identity pool ID that you want Amazon OpenSearch Service to use for
   * OpenSearch Dashboards authentication.
   */
  public fun identityPoolId(): String

  /**
   * A role that allows Amazon OpenSearch Service to configure your user pool and identity pool.
   *
   * It must have the `AmazonESCognitoAccess` policy attached to it.
   *
   * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html#cognito-auth-prereq)
   */
  public fun role(): IRole

  /**
   * The Amazon Cognito user pool ID that you want Amazon OpenSearch Service to use for OpenSearch
   * Dashboards authentication.
   */
  public fun userPoolId(): String

  /**
   * A builder for [CognitoOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identityPoolId The Amazon Cognito identity pool ID that you want Amazon OpenSearch
     * Service to use for OpenSearch Dashboards authentication. 
     */
    public fun identityPoolId(identityPoolId: String)

    /**
     * @param role A role that allows Amazon OpenSearch Service to configure your user pool and
     * identity pool. 
     * It must have the `AmazonESCognitoAccess` policy attached to it.
     */
    public fun role(role: IRole)

    /**
     * @param userPoolId The Amazon Cognito user pool ID that you want Amazon OpenSearch Service to
     * use for OpenSearch Dashboards authentication. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.CognitoOptions.Builder
        = software.amazon.awscdk.services.opensearchservice.CognitoOptions.builder()

    /**
     * @param identityPoolId The Amazon Cognito identity pool ID that you want Amazon OpenSearch
     * Service to use for OpenSearch Dashboards authentication. 
     */
    override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    /**
     * @param role A role that allows Amazon OpenSearch Service to configure your user pool and
     * identity pool. 
     * It must have the `AmazonESCognitoAccess` policy attached to it.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param userPoolId The Amazon Cognito user pool ID that you want Amazon OpenSearch Service to
     * use for OpenSearch Dashboards authentication. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.CognitoOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opensearchservice.CognitoOptions,
  ) : CdkObject(cdkObject), CognitoOptions {
    /**
     * The Amazon Cognito identity pool ID that you want Amazon OpenSearch Service to use for
     * OpenSearch Dashboards authentication.
     */
    override fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

    /**
     * A role that allows Amazon OpenSearch Service to configure your user pool and identity pool.
     *
     * It must have the `AmazonESCognitoAccess` policy attached to it.
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html#cognito-auth-prereq)
     */
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    /**
     * The Amazon Cognito user pool ID that you want Amazon OpenSearch Service to use for OpenSearch
     * Dashboards authentication.
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CognitoOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CognitoOptions):
        CognitoOptions = CdkObjectWrappers.wrap(cdkObject) as? CognitoOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CognitoOptions):
        software.amazon.awscdk.services.opensearchservice.CognitoOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.CognitoOptions
  }
}

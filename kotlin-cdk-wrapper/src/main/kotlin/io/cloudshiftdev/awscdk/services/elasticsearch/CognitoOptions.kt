@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

/**
 * (deprecated) Configures Amazon ES to use Amazon Cognito authentication for Kibana.
 *
 * Example:
 *
 * ```
 * Domain.Builder.create(this, "Domain")
 * .cognitoKibanaAuth(CognitoOptions.builder()
 * .identityPoolId("test-identity-pool-id")
 * .userPoolId("test-user-pool-id")
 * .role(role)
 * .build())
 * .version(elasticsearchVersion)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html)
 * @deprecated use opensearchservice module instead
 */
public interface CognitoOptions {
  /**
   * (deprecated) The Amazon Cognito identity pool ID that you want Amazon ES to use for Kibana
   * authentication.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun identityPoolId(): String

  /**
   * (deprecated) A role that allows Amazon ES to configure your user pool and identity pool.
   *
   * It must have the `AmazonESCognitoAccess` policy attached to it.
   *
   * [Documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html#es-cognito-auth-prereq)
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun role(): IRole

  /**
   * (deprecated) The Amazon Cognito user pool ID that you want Amazon ES to use for Kibana
   * authentication.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun userPoolId(): String

  /**
   * A builder for [CognitoOptions]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * @param identityPoolId The Amazon Cognito identity pool ID that you want Amazon ES to use for
     * Kibana authentication. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun identityPoolId(identityPoolId: String)

    /**
     * @param role A role that allows Amazon ES to configure your user pool and identity pool. 
     * It must have the `AmazonESCognitoAccess` policy attached to it.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun role(role: IRole)

    /**
     * @param userPoolId The Amazon Cognito user pool ID that you want Amazon ES to use for Kibana
     * authentication. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.CognitoOptions.Builder =
        software.amazon.awscdk.services.elasticsearch.CognitoOptions.builder()

    /**
     * @param identityPoolId The Amazon Cognito identity pool ID that you want Amazon ES to use for
     * Kibana authentication. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    /**
     * @param role A role that allows Amazon ES to configure your user pool and identity pool. 
     * It must have the `AmazonESCognitoAccess` policy attached to it.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param userPoolId The Amazon Cognito user pool ID that you want Amazon ES to use for Kibana
     * authentication. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.CognitoOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticsearch.CognitoOptions,
  ) : CdkObject(cdkObject), CognitoOptions {
    /**
     * (deprecated) The Amazon Cognito identity pool ID that you want Amazon ES to use for Kibana
     * authentication.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

    /**
     * (deprecated) A role that allows Amazon ES to configure your user pool and identity pool.
     *
     * It must have the `AmazonESCognitoAccess` policy attached to it.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html#es-cognito-auth-prereq)
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    /**
     * (deprecated) The Amazon Cognito user pool ID that you want Amazon ES to use for Kibana
     * authentication.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CognitoOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.CognitoOptions):
        CognitoOptions = CdkObjectWrappers.wrap(cdkObject) as CognitoOptions

    internal fun unwrap(wrapped: CognitoOptions):
        software.amazon.awscdk.services.elasticsearch.CognitoOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.CognitoOptions
  }
}

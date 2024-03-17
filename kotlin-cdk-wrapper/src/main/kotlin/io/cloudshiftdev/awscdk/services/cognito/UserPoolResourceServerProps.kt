@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for the UserPoolResourceServer construct.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * ResourceServerScope resourceServerScope;
 * UserPool userPool;
 * UserPoolResourceServerProps userPoolResourceServerProps = UserPoolResourceServerProps.builder()
 * .identifier("identifier")
 * .userPool(userPool)
 * // the properties below are optional
 * .scopes(List.of(resourceServerScope))
 * .userPoolResourceServerName("userPoolResourceServerName")
 * .build();
 * ```
 */
public interface UserPoolResourceServerProps : UserPoolResourceServerOptions {
  /**
   * The user pool to add this resource server to.
   */
  public fun userPool(): IUserPool

  /**
   * A builder for [UserPoolResourceServerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identifier A unique resource server identifier for the resource server. 
     */
    public fun identifier(identifier: String)

    /**
     * @param scopes Oauth scopes.
     */
    public fun scopes(scopes: List<ResourceServerScope>)

    /**
     * @param scopes Oauth scopes.
     */
    public fun scopes(vararg scopes: ResourceServerScope)

    /**
     * @param userPool The user pool to add this resource server to. 
     */
    public fun userPool(userPool: IUserPool)

    /**
     * @param userPoolResourceServerName A friendly name for the resource server.
     */
    public fun userPoolResourceServerName(userPoolResourceServerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolResourceServerProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolResourceServerProps.builder()

    /**
     * @param identifier A unique resource server identifier for the resource server. 
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * @param scopes Oauth scopes.
     */
    override fun scopes(scopes: List<ResourceServerScope>) {
      cdkBuilder.scopes(scopes.map(ResourceServerScope::unwrap))
    }

    /**
     * @param scopes Oauth scopes.
     */
    override fun scopes(vararg scopes: ResourceServerScope): Unit = scopes(scopes.toList())

    /**
     * @param userPool The user pool to add this resource server to. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    /**
     * @param userPoolResourceServerName A friendly name for the resource server.
     */
    override fun userPoolResourceServerName(userPoolResourceServerName: String) {
      cdkBuilder.userPoolResourceServerName(userPoolResourceServerName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolResourceServerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolResourceServerProps,
  ) : CdkObject(cdkObject), UserPoolResourceServerProps {
    /**
     * A unique resource server identifier for the resource server.
     */
    override fun identifier(): String = unwrap(this).getIdentifier()

    /**
     * Oauth scopes.
     *
     * Default: - No scopes will be added
     */
    override fun scopes(): List<ResourceServerScope> =
        unwrap(this).getScopes()?.map(ResourceServerScope::wrap) ?: emptyList()

    /**
     * The user pool to add this resource server to.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)

    /**
     * A friendly name for the resource server.
     *
     * Default: - same as `identifier`
     */
    override fun userPoolResourceServerName(): String? =
        unwrap(this).getUserPoolResourceServerName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolResourceServerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolResourceServerProps):
        UserPoolResourceServerProps = CdkObjectWrappers.wrap(cdkObject) as?
        UserPoolResourceServerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolResourceServerProps):
        software.amazon.awscdk.services.cognito.UserPoolResourceServerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolResourceServerProps
  }
}

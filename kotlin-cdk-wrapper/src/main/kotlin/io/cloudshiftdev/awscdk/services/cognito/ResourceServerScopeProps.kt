@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Props to initialize ResourceServerScope.
 *
 * Example:
 *
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * ResourceServerScope readOnlyScope =
 * ResourceServerScope.Builder.create().scopeName("read").scopeDescription("Read-only access").build();
 * ResourceServerScope fullAccessScope =
 * ResourceServerScope.Builder.create().scopeName("*").scopeDescription("Full access").build();
 * UserPoolResourceServer userServer = pool.addResourceServer("ResourceServer",
 * UserPoolResourceServerOptions.builder()
 * .identifier("users")
 * .scopes(List.of(readOnlyScope, fullAccessScope))
 * .build());
 * UserPoolClient readOnlyClient = pool.addClient("read-only-client",
 * UserPoolClientOptions.builder()
 * // ...
 * .oAuth(OAuthSettings.builder()
 * // ...
 * .scopes(List.of(OAuthScope.resourceServer(userServer, readOnlyScope)))
 * .build())
 * .build());
 * UserPoolClient fullAccessClient = pool.addClient("full-access-client",
 * UserPoolClientOptions.builder()
 * // ...
 * .oAuth(OAuthSettings.builder()
 * // ...
 * .scopes(List.of(OAuthScope.resourceServer(userServer, fullAccessScope)))
 * .build())
 * .build());
 * ```
 */
public interface ResourceServerScopeProps {
  /**
   * A description of the scope.
   */
  public fun scopeDescription(): String

  /**
   * The name of the scope.
   */
  public fun scopeName(): String

  /**
   * A builder for [ResourceServerScopeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param scopeDescription A description of the scope. 
     */
    public fun scopeDescription(scopeDescription: String)

    /**
     * @param scopeName The name of the scope. 
     */
    public fun scopeName(scopeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.ResourceServerScopeProps.Builder
        = software.amazon.awscdk.services.cognito.ResourceServerScopeProps.builder()

    /**
     * @param scopeDescription A description of the scope. 
     */
    override fun scopeDescription(scopeDescription: String) {
      cdkBuilder.scopeDescription(scopeDescription)
    }

    /**
     * @param scopeName The name of the scope. 
     */
    override fun scopeName(scopeName: String) {
      cdkBuilder.scopeName(scopeName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.ResourceServerScopeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.ResourceServerScopeProps,
  ) : CdkObject(cdkObject), ResourceServerScopeProps {
    /**
     * A description of the scope.
     */
    override fun scopeDescription(): String = unwrap(this).getScopeDescription()

    /**
     * The name of the scope.
     */
    override fun scopeName(): String = unwrap(this).getScopeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceServerScopeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ResourceServerScopeProps):
        ResourceServerScopeProps = CdkObjectWrappers.wrap(cdkObject) as ResourceServerScopeProps

    internal fun unwrap(wrapped: ResourceServerScopeProps):
        software.amazon.awscdk.services.cognito.ResourceServerScopeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.ResourceServerScopeProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * A scope for ResourceServer.
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
public open class ResourceServerScope(
  cdkObject: software.amazon.awscdk.services.cognito.ResourceServerScope,
) : CdkObject(cdkObject) {
  public constructor(props: ResourceServerScopeProps) :
      this(software.amazon.awscdk.services.cognito.ResourceServerScope(props.let(ResourceServerScopeProps::unwrap))
  )

  public constructor(props: ResourceServerScopeProps.Builder.() -> Unit) :
      this(ResourceServerScopeProps(props)
  )

  /**
   * A description of the scope.
   */
  public open fun scopeDescription(): String = unwrap(this).getScopeDescription()

  /**
   * The name of the scope.
   */
  public open fun scopeName(): String = unwrap(this).getScopeName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.ResourceServerScope].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the scope.
     *
     * @param scopeDescription A description of the scope. 
     */
    public fun scopeDescription(scopeDescription: String)

    /**
     * The name of the scope.
     *
     * @param scopeName The name of the scope. 
     */
    public fun scopeName(scopeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.ResourceServerScope.Builder =
        software.amazon.awscdk.services.cognito.ResourceServerScope.Builder.create()

    /**
     * A description of the scope.
     *
     * @param scopeDescription A description of the scope. 
     */
    override fun scopeDescription(scopeDescription: String) {
      cdkBuilder.scopeDescription(scopeDescription)
    }

    /**
     * The name of the scope.
     *
     * @param scopeName The name of the scope. 
     */
    override fun scopeName(scopeName: String) {
      cdkBuilder.scopeName(scopeName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.ResourceServerScope =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceServerScope {
      val builderImpl = BuilderImpl()
      return ResourceServerScope(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ResourceServerScope):
        ResourceServerScope = ResourceServerScope(cdkObject)

    internal fun unwrap(wrapped: ResourceServerScope):
        software.amazon.awscdk.services.cognito.ResourceServerScope = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.ResourceServerScope
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface UserPoolResourceServerProps : UserPoolResourceServerOptions {
  public fun userPool(): IUserPool

  @CdkDslMarker
  public interface Builder {
    public fun identifier(identifier: String)

    public fun scopes(scopes: List<ResourceServerScope>)

    public fun scopes(vararg scopes: ResourceServerScope)

    public fun userPool(userPool: IUserPool)

    public fun userPoolResourceServerName(userPoolResourceServerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolResourceServerProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolResourceServerProps.builder()

    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    override fun scopes(scopes: List<ResourceServerScope>) {
      cdkBuilder.scopes(scopes.map(ResourceServerScope::unwrap))
    }

    override fun scopes(vararg scopes: ResourceServerScope): Unit = scopes(scopes.toList())

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    override fun userPoolResourceServerName(userPoolResourceServerName: String) {
      cdkBuilder.userPoolResourceServerName(userPoolResourceServerName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolResourceServerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolResourceServerProps,
  ) : CdkObject(cdkObject), UserPoolResourceServerProps {
    override fun identifier(): String = unwrap(this).getIdentifier()

    override fun scopes(): List<ResourceServerScope> =
        unwrap(this).getScopes()?.map(ResourceServerScope::wrap) ?: emptyList()

    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)

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
        UserPoolResourceServerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolResourceServerProps):
        software.amazon.awscdk.services.cognito.UserPoolResourceServerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolResourceServerProps
  }
}

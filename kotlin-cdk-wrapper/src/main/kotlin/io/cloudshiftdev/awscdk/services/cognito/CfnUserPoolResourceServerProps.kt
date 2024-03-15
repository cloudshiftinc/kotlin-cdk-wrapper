@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnUserPoolResourceServerProps {
  public fun identifier(): String

  public fun name(): String

  public fun scopes(): Any? = unwrap(this).getScopes()

  public fun userPoolId(): String

  @CdkDslMarker
  public interface Builder {
    public fun identifier(identifier: String)

    public fun name(name: String)

    public fun scopes(scopes: IResolvable)

    public fun scopes(scopes: List<Any>)

    public fun scopes(vararg scopes: Any)

    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps.builder()

    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun scopes(scopes: IResolvable) {
      cdkBuilder.scopes(scopes.let(IResolvable::unwrap))
    }

    override fun scopes(scopes: List<Any>) {
      cdkBuilder.scopes(scopes)
    }

    override fun scopes(vararg scopes: Any): Unit = scopes(scopes.toList())

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps,
  ) : CdkObject(cdkObject), CfnUserPoolResourceServerProps {
    override fun identifier(): String = unwrap(this).getIdentifier()

    override fun name(): String = unwrap(this).getName()

    override fun scopes(): Any? = unwrap(this).getScopes()

    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolResourceServerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps):
        CfnUserPoolResourceServerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolResourceServerProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps
  }
}

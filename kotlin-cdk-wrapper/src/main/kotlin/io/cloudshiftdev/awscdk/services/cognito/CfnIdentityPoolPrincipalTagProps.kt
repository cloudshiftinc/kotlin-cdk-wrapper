@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnIdentityPoolPrincipalTagProps {
  public fun identityPoolId(): String

  public fun identityProviderName(): String

  public fun principalTags(): Any? = unwrap(this).getPrincipalTags()

  public fun useDefaults(): Any? = unwrap(this).getUseDefaults()

  @CdkDslMarker
  public interface Builder {
    public fun identityPoolId(identityPoolId: String)

    public fun identityProviderName(identityProviderName: String)

    public fun principalTags(principalTags: Any)

    public fun useDefaults(useDefaults: Boolean)

    public fun useDefaults(useDefaults: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps.builder()

    override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    override fun identityProviderName(identityProviderName: String) {
      cdkBuilder.identityProviderName(identityProviderName)
    }

    override fun principalTags(principalTags: Any) {
      cdkBuilder.principalTags(principalTags)
    }

    override fun useDefaults(useDefaults: Boolean) {
      cdkBuilder.useDefaults(useDefaults)
    }

    override fun useDefaults(useDefaults: IResolvable) {
      cdkBuilder.useDefaults(useDefaults.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps,
  ) : CdkObject(cdkObject), CfnIdentityPoolPrincipalTagProps {
    override fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

    override fun identityProviderName(): String = unwrap(this).getIdentityProviderName()

    override fun principalTags(): Any? = unwrap(this).getPrincipalTags()

    override fun useDefaults(): Any? = unwrap(this).getUseDefaults()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityPoolPrincipalTagProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps):
        CfnIdentityPoolPrincipalTagProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPoolPrincipalTagProps):
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps
  }
}

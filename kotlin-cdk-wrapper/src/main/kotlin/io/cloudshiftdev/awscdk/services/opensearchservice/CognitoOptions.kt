@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface CognitoOptions {
  public fun identityPoolId(): String

  public fun role(): IRole

  public fun userPoolId(): String

  @CdkDslMarker
  public interface Builder {
    public fun identityPoolId(identityPoolId: String)

    public fun role(role: IRole)

    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.CognitoOptions.Builder
        = software.amazon.awscdk.services.opensearchservice.CognitoOptions.builder()

    override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.CognitoOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.CognitoOptions,
  ) : CdkObject(cdkObject), CognitoOptions {
    override fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CognitoOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CognitoOptions):
        CognitoOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CognitoOptions):
        software.amazon.awscdk.services.opensearchservice.CognitoOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.CognitoOptions
  }
}

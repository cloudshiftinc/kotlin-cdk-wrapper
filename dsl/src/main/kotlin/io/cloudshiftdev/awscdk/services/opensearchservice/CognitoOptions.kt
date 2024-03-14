package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface CognitoOptions {
  public fun identityPoolId(): String

  public fun role(): IRole

  public fun userPoolId(): String

  public interface Builder {
    public fun identityPoolId(identityPoolId: String) {
    }

    public fun role(role: IRole) {
    }

    public fun userPoolId(userPoolId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.CognitoOptions.Builder
        = software.amazon.awscdk.services.opensearchservice.CognitoOptions.builder()

    public override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.CognitoOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.opensearchservice.CognitoOptions,
  ) : CognitoOptions {
    public override fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

    public override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    public override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CognitoOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CognitoOptions):
        CognitoOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CognitoOptions):
        software.amazon.awscdk.services.opensearchservice.CognitoOptions = (wrapped as
        Wrapper).cdkObject
  }
}

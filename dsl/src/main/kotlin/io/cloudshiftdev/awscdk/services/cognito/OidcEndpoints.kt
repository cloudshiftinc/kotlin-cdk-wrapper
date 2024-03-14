package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String
import kotlin.Unit

public interface OidcEndpoints {
  public fun authorization(): String

  public fun jwksUri(): String

  public fun token(): String

  public fun userInfo(): String

  public interface Builder {
    public fun authorization(authorization: String) {
    }

    public fun jwksUri(jwksUri: String) {
    }

    public fun token(token: String) {
    }

    public fun userInfo(userInfo: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.OidcEndpoints.Builder =
        software.amazon.awscdk.services.cognito.OidcEndpoints.builder()

    public override fun authorization(authorization: String) {
      cdkBuilder.authorization(authorization)
    }

    public override fun jwksUri(jwksUri: String) {
      cdkBuilder.jwksUri(jwksUri)
    }

    public override fun token(token: String) {
      cdkBuilder.token(token)
    }

    public override fun userInfo(userInfo: String) {
      cdkBuilder.userInfo(userInfo)
    }

    public fun build(): software.amazon.awscdk.services.cognito.OidcEndpoints = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.OidcEndpoints,
  ) : OidcEndpoints {
    public override fun authorization(): String = unwrap(this).getAuthorization()

    public override fun jwksUri(): String = unwrap(this).getJwksUri()

    public override fun token(): String = unwrap(this).getToken()

    public override fun userInfo(): String = unwrap(this).getUserInfo()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OidcEndpoints {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.OidcEndpoints):
        OidcEndpoints = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OidcEndpoints):
        software.amazon.awscdk.services.cognito.OidcEndpoints = (wrapped as Wrapper).cdkObject
  }
}

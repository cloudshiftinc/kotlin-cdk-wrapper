package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface SignInUrlOptions : BaseUrlOptions {
  public fun redirectUri(): String

  public fun signInPath(): String? = unwrap(this).getSignInPath()

  public interface Builder {
    public fun fips(fips: Boolean) {
    }

    public fun redirectUri(redirectUri: String) {
    }

    public fun signInPath(signInPath: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.SignInUrlOptions.Builder =
        software.amazon.awscdk.services.cognito.SignInUrlOptions.builder()

    public override fun fips(fips: Boolean) {
      cdkBuilder.fips(fips)
    }

    public override fun redirectUri(redirectUri: String) {
      cdkBuilder.redirectUri(redirectUri)
    }

    public override fun signInPath(signInPath: String) {
      cdkBuilder.signInPath(signInPath)
    }

    public fun build(): software.amazon.awscdk.services.cognito.SignInUrlOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.SignInUrlOptions,
  ) : SignInUrlOptions {
    public override fun fips(): Boolean? = unwrap(this).getFips()

    public override fun redirectUri(): String = unwrap(this).getRedirectUri()

    public override fun signInPath(): String? = unwrap(this).getSignInPath()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SignInUrlOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.SignInUrlOptions):
        SignInUrlOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SignInUrlOptions):
        software.amazon.awscdk.services.cognito.SignInUrlOptions = (wrapped as Wrapper).cdkObject
  }
}

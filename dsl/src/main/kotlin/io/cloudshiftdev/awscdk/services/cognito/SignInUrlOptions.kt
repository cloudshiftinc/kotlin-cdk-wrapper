package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface SignInUrlOptions : BaseUrlOptions {
  /**
   * Where to redirect to after sign in.
   */
  public fun redirectUri(): String

  /**
   * The path in the URI where the sign-in page is located.
   *
   * Default: '/login'
   */
  public fun signInPath(): String? = unwrap(this).getSignInPath()

  /**
   * A builder for [SignInUrlOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fips Whether to return the FIPS-compliant endpoint.
     */
    public fun fips(fips: Boolean)

    /**
     * @param redirectUri Where to redirect to after sign in. 
     */
    public fun redirectUri(redirectUri: String)

    /**
     * @param signInPath The path in the URI where the sign-in page is located.
     */
    public fun signInPath(signInPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.SignInUrlOptions.Builder =
        software.amazon.awscdk.services.cognito.SignInUrlOptions.builder()

    /**
     * @param fips Whether to return the FIPS-compliant endpoint.
     */
    override fun fips(fips: Boolean) {
      cdkBuilder.fips(fips)
    }

    /**
     * @param redirectUri Where to redirect to after sign in. 
     */
    override fun redirectUri(redirectUri: String) {
      cdkBuilder.redirectUri(redirectUri)
    }

    /**
     * @param signInPath The path in the URI where the sign-in page is located.
     */
    override fun signInPath(signInPath: String) {
      cdkBuilder.signInPath(signInPath)
    }

    public fun build(): software.amazon.awscdk.services.cognito.SignInUrlOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.SignInUrlOptions,
  ) : SignInUrlOptions {
    /**
     * Whether to return the FIPS-compliant endpoint.
     *
     * Default: return the standard URL
     */
    override fun fips(): Boolean? = unwrap(this).getFips()

    /**
     * Where to redirect to after sign in.
     */
    override fun redirectUri(): String = unwrap(this).getRedirectUri()

    /**
     * The path in the URI where the sign-in page is located.
     *
     * Default: '/login'
     */
    override fun signInPath(): String? = unwrap(this).getSignInPath()
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

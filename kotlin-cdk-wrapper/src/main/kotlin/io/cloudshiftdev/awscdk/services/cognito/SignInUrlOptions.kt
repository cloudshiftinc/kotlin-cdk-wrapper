@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface SignInUrlOptions : BaseUrlOptions {
  public fun redirectUri(): String

  public fun signInPath(): String? = unwrap(this).getSignInPath()

  @CdkDslMarker
  public interface Builder {
    public fun fips(fips: Boolean)

    public fun redirectUri(redirectUri: String)

    public fun signInPath(signInPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.SignInUrlOptions.Builder =
        software.amazon.awscdk.services.cognito.SignInUrlOptions.builder()

    override fun fips(fips: Boolean) {
      cdkBuilder.fips(fips)
    }

    override fun redirectUri(redirectUri: String) {
      cdkBuilder.redirectUri(redirectUri)
    }

    override fun signInPath(signInPath: String) {
      cdkBuilder.signInPath(signInPath)
    }

    public fun build(): software.amazon.awscdk.services.cognito.SignInUrlOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.SignInUrlOptions,
  ) : CdkObject(cdkObject), SignInUrlOptions {
    override fun fips(): Boolean? = unwrap(this).getFips()

    override fun redirectUri(): String = unwrap(this).getRedirectUri()

    override fun signInPath(): String? = unwrap(this).getSignInPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SignInUrlOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.SignInUrlOptions):
        SignInUrlOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SignInUrlOptions):
        software.amazon.awscdk.services.cognito.SignInUrlOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.SignInUrlOptions
  }
}

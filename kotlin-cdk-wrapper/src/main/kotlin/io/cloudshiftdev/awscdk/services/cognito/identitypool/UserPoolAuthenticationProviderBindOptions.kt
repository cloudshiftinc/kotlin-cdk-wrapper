@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito.identitypool

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Represents UserPoolAuthenticationProvider Bind Options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.identitypool.*;
 * UserPoolAuthenticationProviderBindOptions userPoolAuthenticationProviderBindOptions =
 * UserPoolAuthenticationProviderBindOptions.builder().build();
 * ```
 */
public interface UserPoolAuthenticationProviderBindOptions {
  /**
   * A builder for [UserPoolAuthenticationProviderBindOptions]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindOptions.Builder
        =
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindOptions.builder()

    public fun build():
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindOptions,
  ) : CdkObject(cdkObject),
      UserPoolAuthenticationProviderBindOptions

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        UserPoolAuthenticationProviderBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindOptions):
        UserPoolAuthenticationProviderBindOptions = CdkObjectWrappers.wrap(cdkObject) as?
        UserPoolAuthenticationProviderBindOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolAuthenticationProviderBindOptions):
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindOptions
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProviderBindOptions
  }
}

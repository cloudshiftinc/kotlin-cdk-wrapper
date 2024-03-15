@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface AuthorizationConfig {
  public fun additionalAuthorizationModes(): List<AuthorizationMode> =
      unwrap(this).getAdditionalAuthorizationModes()?.map(AuthorizationMode::wrap) ?: emptyList()

  public fun defaultAuthorization(): AuthorizationMode? =
      unwrap(this).getDefaultAuthorization()?.let(AuthorizationMode::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun additionalAuthorizationModes(additionalAuthorizationModes: List<AuthorizationMode>)

    public fun additionalAuthorizationModes(vararg additionalAuthorizationModes: AuthorizationMode)

    public fun defaultAuthorization(defaultAuthorization: AuthorizationMode)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4692d9be17568762847112a3ed1c1df1ac4768f899c97e5b4e77df5dca3c48ad")
    public fun defaultAuthorization(defaultAuthorization: AuthorizationMode.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AuthorizationConfig.Builder =
        software.amazon.awscdk.services.appsync.AuthorizationConfig.builder()

    override
        fun additionalAuthorizationModes(additionalAuthorizationModes: List<AuthorizationMode>) {
      cdkBuilder.additionalAuthorizationModes(additionalAuthorizationModes.map(AuthorizationMode::unwrap))
    }

    override fun additionalAuthorizationModes(vararg
        additionalAuthorizationModes: AuthorizationMode): Unit =
        additionalAuthorizationModes(additionalAuthorizationModes.toList())

    override fun defaultAuthorization(defaultAuthorization: AuthorizationMode) {
      cdkBuilder.defaultAuthorization(defaultAuthorization.let(AuthorizationMode::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4692d9be17568762847112a3ed1c1df1ac4768f899c97e5b4e77df5dca3c48ad")
    override fun defaultAuthorization(defaultAuthorization: AuthorizationMode.Builder.() -> Unit):
        Unit = defaultAuthorization(AuthorizationMode(defaultAuthorization))

    public fun build(): software.amazon.awscdk.services.appsync.AuthorizationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.AuthorizationConfig,
  ) : CdkObject(cdkObject), AuthorizationConfig {
    override fun additionalAuthorizationModes(): List<AuthorizationMode> =
        unwrap(this).getAdditionalAuthorizationModes()?.map(AuthorizationMode::wrap) ?: emptyList()

    override fun defaultAuthorization(): AuthorizationMode? =
        unwrap(this).getDefaultAuthorization()?.let(AuthorizationMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AuthorizationConfig):
        AuthorizationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthorizationConfig):
        software.amazon.awscdk.services.appsync.AuthorizationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AuthorizationConfig
  }
}

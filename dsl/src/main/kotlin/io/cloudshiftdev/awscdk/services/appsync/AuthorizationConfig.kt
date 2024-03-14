package io.cloudshiftdev.awscdk.services.appsync

import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface AuthorizationConfig {
  public fun additionalAuthorizationModes(): List<AuthorizationMode> =
      unwrap(this).getAdditionalAuthorizationModes()?.map(AuthorizationMode::wrap) ?: emptyList()

  public fun defaultAuthorization(): AuthorizationMode? =
      unwrap(this).getDefaultAuthorization()?.let(AuthorizationMode::wrap)

  public interface Builder {
    public fun additionalAuthorizationModes(additionalAuthorizationModes: List<AuthorizationMode>) {
    }

    public fun defaultAuthorization(defaultAuthorization: AuthorizationMode) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4692d9be17568762847112a3ed1c1df1ac4768f899c97e5b4e77df5dca3c48ad")
    public fun defaultAuthorization(defaultAuthorization: AuthorizationMode.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AuthorizationConfig.Builder =
        software.amazon.awscdk.services.appsync.AuthorizationConfig.builder()

    public override
        fun additionalAuthorizationModes(additionalAuthorizationModes: List<AuthorizationMode>) {
      cdkBuilder.additionalAuthorizationModes(additionalAuthorizationModes.map(AuthorizationMode::unwrap))
    }

    public override fun defaultAuthorization(defaultAuthorization: AuthorizationMode) {
      cdkBuilder.defaultAuthorization(defaultAuthorization.let(AuthorizationMode::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4692d9be17568762847112a3ed1c1df1ac4768f899c97e5b4e77df5dca3c48ad")
    public override
        fun defaultAuthorization(defaultAuthorization: AuthorizationMode.Builder.() -> Unit): Unit =
        defaultAuthorization(AuthorizationMode(defaultAuthorization))

    public fun build(): software.amazon.awscdk.services.appsync.AuthorizationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.AuthorizationConfig,
  ) : AuthorizationConfig {
    public override fun additionalAuthorizationModes(): List<AuthorizationMode> =
        unwrap(this).getAdditionalAuthorizationModes()?.map(AuthorizationMode::wrap) ?: emptyList()

    public override fun defaultAuthorization(): AuthorizationMode? =
        unwrap(this).getDefaultAuthorization()?.let(AuthorizationMode::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AuthorizationConfig):
        AuthorizationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthorizationConfig):
        software.amazon.awscdk.services.appsync.AuthorizationConfig = (wrapped as Wrapper).cdkObject
  }
}

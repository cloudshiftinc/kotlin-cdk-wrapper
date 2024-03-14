package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

public open class FunctionRuntime internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.FunctionRuntime,
) {
  public open fun name(): String = unwrap(this).getName()

  public open fun toProperties(): RuntimeConfig =
      unwrap(this).toProperties().let(RuntimeConfig::wrap)

  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.FunctionRuntime):
        FunctionRuntime = FunctionRuntime(cdkObject)

    internal fun unwrap(wrapped: FunctionRuntime):
        software.amazon.awscdk.services.appsync.FunctionRuntime = wrapped.cdkObject
  }
}

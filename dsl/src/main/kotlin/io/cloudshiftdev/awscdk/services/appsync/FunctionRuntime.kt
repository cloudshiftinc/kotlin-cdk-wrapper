package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

public open class FunctionRuntime internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.FunctionRuntime,
) {
  /**
   * The name of the runtime.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Convert to Cfn runtime configuration property format.
   */
  public open fun toProperties(): RuntimeConfig =
      unwrap(this).toProperties().let(RuntimeConfig::wrap)

  /**
   * The runtime version.
   */
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

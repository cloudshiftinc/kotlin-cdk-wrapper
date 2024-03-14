package io.cloudshiftdev.awscdk.services.opensearchservice

import kotlin.String

public open class EngineVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.opensearchservice.EngineVersion,
) {
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public open fun elasticsearch(version: String): EngineVersion =
        software.amazon.awscdk.services.opensearchservice.EngineVersion.elasticsearch(version).let(EngineVersion::wrap)

    public open fun openSearch(version: String): EngineVersion =
        software.amazon.awscdk.services.opensearchservice.EngineVersion.openSearch(version).let(EngineVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.EngineVersion):
        EngineVersion = EngineVersion(cdkObject)

    internal fun unwrap(wrapped: EngineVersion):
        software.amazon.awscdk.services.opensearchservice.EngineVersion = wrapped.cdkObject
  }
}

package io.cloudshiftdev.awscdk.services.elasticsearch

import kotlin.String

public open class ElasticsearchVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion,
) {
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public open fun of(version: String): ElasticsearchVersion =
        software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.of(version).let(ElasticsearchVersion::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion):
        ElasticsearchVersion = ElasticsearchVersion(cdkObject)

    internal fun unwrap(wrapped: ElasticsearchVersion):
        software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion = wrapped.cdkObject
  }
}

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class ElasticsearchVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion,
) : CdkObject(cdkObject) {
  /**
   * Elasticsearch version number.
   */
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public fun of(version: String): ElasticsearchVersion =
        software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.of(version).let(ElasticsearchVersion::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion):
        ElasticsearchVersion = ElasticsearchVersion(cdkObject)

    internal fun unwrap(wrapped: ElasticsearchVersion):
        software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion = wrapped.cdkObject
  }
}

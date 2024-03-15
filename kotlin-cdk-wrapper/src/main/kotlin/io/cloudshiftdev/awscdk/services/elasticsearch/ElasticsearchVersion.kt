@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class ElasticsearchVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion,
) : CdkObject(cdkObject) {
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public val V1_5: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V1_5)

    public val V2_3: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V2_3)

    public val V5_1: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V5_1)

    public val V5_3: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V5_3)

    public val V5_5: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V5_5)

    public val V5_6: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V5_6)

    public val V6_0: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V6_0)

    public val V6_2: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V6_2)

    public val V6_3: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V6_3)

    public val V6_4: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V6_4)

    public val V6_5: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V6_5)

    public val V6_7: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V6_7)

    public val V6_8: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V6_8)

    public val V7_1: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V7_1)

    public val V7_10: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V7_10)

    public val V7_4: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V7_4)

    public val V7_7: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V7_7)

    public val V7_8: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V7_8)

    public val V7_9: ElasticsearchVersion =
        ElasticsearchVersion.wrap(software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.V7_9)

    public fun of(version: String): ElasticsearchVersion =
        software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion.of(version).let(ElasticsearchVersion::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion):
        ElasticsearchVersion = ElasticsearchVersion(cdkObject)

    internal fun unwrap(wrapped: ElasticsearchVersion):
        software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion = wrapped.cdkObject
  }
}

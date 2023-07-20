@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.s3.IntelligentTieringConfiguration
import software.amazon.awscdk.services.s3.Tag
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class IntelligentTieringConfigurationDsl {
    private val cdkBuilder: IntelligentTieringConfiguration.Builder =
        IntelligentTieringConfiguration.builder()

    private val _tags: MutableList<Tag> = mutableListOf()

    public fun archiveAccessTierTime(archiveAccessTierTime: Duration) {
        cdkBuilder.archiveAccessTierTime(archiveAccessTierTime)
    }

    public fun deepArchiveAccessTierTime(deepArchiveAccessTierTime: Duration) {
        cdkBuilder.deepArchiveAccessTierTime(deepArchiveAccessTierTime)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun tags(tags: TagDsl.() -> Unit) {
        _tags.add(TagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<Tag>) {
        _tags.addAll(tags)
    }

    public fun build(): IntelligentTieringConfiguration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

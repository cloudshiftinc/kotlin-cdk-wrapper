@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.s3.IntelligentTieringConfiguration
import software.amazon.awscdk.services.s3.Tag

/**
 * The intelligent tiering configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.s3.*;
 * IntelligentTieringConfiguration intelligentTieringConfiguration =
 * IntelligentTieringConfiguration.builder()
 * .name("name")
 * // the properties below are optional
 * .archiveAccessTierTime(Duration.minutes(30))
 * .deepArchiveAccessTierTime(Duration.minutes(30))
 * .prefix("prefix")
 * .tags(List.of(Tag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class IntelligentTieringConfigurationDsl {
    private val cdkBuilder: IntelligentTieringConfiguration.Builder =
        IntelligentTieringConfiguration.builder()

    private val _tags: MutableList<Tag> = mutableListOf()

    /**
     * @param archiveAccessTierTime When enabled, Intelligent-Tiering will automatically move
     *   objects that haven’t been accessed for a minimum of 90 days to the Archive Access tier.
     */
    public fun archiveAccessTierTime(archiveAccessTierTime: Duration) {
        cdkBuilder.archiveAccessTierTime(archiveAccessTierTime)
    }

    /**
     * @param deepArchiveAccessTierTime When enabled, Intelligent-Tiering will automatically move
     *   objects that haven’t been accessed for a minimum of 180 days to the Deep Archive Access
     *   tier.
     */
    public fun deepArchiveAccessTierTime(deepArchiveAccessTierTime: Duration) {
        cdkBuilder.deepArchiveAccessTierTime(deepArchiveAccessTierTime)
    }

    /** @param name Configuration name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param prefix Add a filter to limit the scope of this configuration to a single prefix. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    /** @param tags You can limit the scope of this rule to the key value pairs added below. */
    public fun tags(tags: TagDsl.() -> Unit) {
        _tags.add(TagDsl().apply(tags).build())
    }

    /** @param tags You can limit the scope of this rule to the key value pairs added below. */
    public fun tags(tags: Collection<Tag>) {
        _tags.addAll(tags)
    }

    public fun build(): IntelligentTieringConfiguration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The intelligent tiering configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
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
public interface IntelligentTieringConfiguration {
  /**
   * When enabled, Intelligent-Tiering will automatically move objects that haven’t been accessed
   * for a minimum of 90 days to the Archive Access tier.
   *
   * Default: Objects will not move to Glacier
   */
  public fun archiveAccessTierTime(): Duration? =
      unwrap(this).getArchiveAccessTierTime()?.let(Duration::wrap)

  /**
   * When enabled, Intelligent-Tiering will automatically move objects that haven’t been accessed
   * for a minimum of 180 days to the Deep Archive Access tier.
   *
   * Default: Objects will not move to Glacier Deep Access
   */
  public fun deepArchiveAccessTierTime(): Duration? =
      unwrap(this).getDeepArchiveAccessTierTime()?.let(Duration::wrap)

  /**
   * Configuration name.
   */
  public fun name(): String

  /**
   * Add a filter to limit the scope of this configuration to a single prefix.
   *
   * Default: this configuration will apply to **all** objects in the bucket.
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * You can limit the scope of this rule to the key value pairs added below.
   *
   * Default: No filtering will be performed on tags
   */
  public fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

  /**
   * A builder for [IntelligentTieringConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param archiveAccessTierTime When enabled, Intelligent-Tiering will automatically move
     * objects that haven’t been accessed for a minimum of 90 days to the Archive Access tier.
     */
    public fun archiveAccessTierTime(archiveAccessTierTime: Duration)

    /**
     * @param deepArchiveAccessTierTime When enabled, Intelligent-Tiering will automatically move
     * objects that haven’t been accessed for a minimum of 180 days to the Deep Archive Access tier.
     */
    public fun deepArchiveAccessTierTime(deepArchiveAccessTierTime: Duration)

    /**
     * @param name Configuration name. 
     */
    public fun name(name: String)

    /**
     * @param prefix Add a filter to limit the scope of this configuration to a single prefix.
     */
    public fun prefix(prefix: String)

    /**
     * @param tags You can limit the scope of this rule to the key value pairs added below.
     */
    public fun tags(tags: List<Tag>)

    /**
     * @param tags You can limit the scope of this rule to the key value pairs added below.
     */
    public fun tags(vararg tags: Tag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.IntelligentTieringConfiguration.Builder =
        software.amazon.awscdk.services.s3.IntelligentTieringConfiguration.builder()

    /**
     * @param archiveAccessTierTime When enabled, Intelligent-Tiering will automatically move
     * objects that haven’t been accessed for a minimum of 90 days to the Archive Access tier.
     */
    override fun archiveAccessTierTime(archiveAccessTierTime: Duration) {
      cdkBuilder.archiveAccessTierTime(archiveAccessTierTime.let(Duration::unwrap))
    }

    /**
     * @param deepArchiveAccessTierTime When enabled, Intelligent-Tiering will automatically move
     * objects that haven’t been accessed for a minimum of 180 days to the Deep Archive Access tier.
     */
    override fun deepArchiveAccessTierTime(deepArchiveAccessTierTime: Duration) {
      cdkBuilder.deepArchiveAccessTierTime(deepArchiveAccessTierTime.let(Duration::unwrap))
    }

    /**
     * @param name Configuration name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param prefix Add a filter to limit the scope of this configuration to a single prefix.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * @param tags You can limit the scope of this rule to the key value pairs added below.
     */
    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag::unwrap))
    }

    /**
     * @param tags You can limit the scope of this rule to the key value pairs added below.
     */
    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.IntelligentTieringConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.IntelligentTieringConfiguration,
  ) : CdkObject(cdkObject), IntelligentTieringConfiguration {
    /**
     * When enabled, Intelligent-Tiering will automatically move objects that haven’t been accessed
     * for a minimum of 90 days to the Archive Access tier.
     *
     * Default: Objects will not move to Glacier
     */
    override fun archiveAccessTierTime(): Duration? =
        unwrap(this).getArchiveAccessTierTime()?.let(Duration::wrap)

    /**
     * When enabled, Intelligent-Tiering will automatically move objects that haven’t been accessed
     * for a minimum of 180 days to the Deep Archive Access tier.
     *
     * Default: Objects will not move to Glacier Deep Access
     */
    override fun deepArchiveAccessTierTime(): Duration? =
        unwrap(this).getDeepArchiveAccessTierTime()?.let(Duration::wrap)

    /**
     * Configuration name.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Add a filter to limit the scope of this configuration to a single prefix.
     *
     * Default: this configuration will apply to **all** objects in the bucket.
     */
    override fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * You can limit the scope of this rule to the key value pairs added below.
     *
     * Default: No filtering will be performed on tags
     */
    override fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IntelligentTieringConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.IntelligentTieringConfiguration):
        IntelligentTieringConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntelligentTieringConfiguration):
        software.amazon.awscdk.services.s3.IntelligentTieringConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.IntelligentTieringConfiguration
  }
}

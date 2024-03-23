@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The event archive properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.events.*;
 * Object detail;
 * EventBus eventBus;
 * ArchiveProps archiveProps = ArchiveProps.builder()
 * .eventPattern(EventPattern.builder()
 * .account(List.of("account"))
 * .detail(Map.of(
 * "detailKey", detail))
 * .detailType(List.of("detailType"))
 * .id(List.of("id"))
 * .region(List.of("region"))
 * .resources(List.of("resources"))
 * .source(List.of("source"))
 * .time(List.of("time"))
 * .version(List.of("version"))
 * .build())
 * .sourceEventBus(eventBus)
 * // the properties below are optional
 * .archiveName("archiveName")
 * .description("description")
 * .retention(Duration.minutes(30))
 * .build();
 * ```
 */
public interface ArchiveProps : BaseArchiveProps {
  /**
   * The event source associated with the archive.
   */
  public fun sourceEventBus(): IEventBus

  /**
   * A builder for [ArchiveProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param archiveName The name of the archive.
     */
    public fun archiveName(archiveName: String)

    /**
     * @param description A description for the archive.
     */
    public fun description(description: String)

    /**
     * @param eventPattern An event pattern to use to filter events sent to the archive. 
     */
    public fun eventPattern(eventPattern: EventPattern)

    /**
     * @param eventPattern An event pattern to use to filter events sent to the archive. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a072b8c4254ec878c82313ff960681baeb435139a193bf06ebd4fe41cbe6aafa")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    /**
     * @param retention The number of days to retain events for.
     * Default value is 0. If set to 0, events are retained indefinitely.
     */
    public fun retention(retention: Duration)

    /**
     * @param sourceEventBus The event source associated with the archive. 
     */
    public fun sourceEventBus(sourceEventBus: IEventBus)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.ArchiveProps.Builder =
        software.amazon.awscdk.services.events.ArchiveProps.builder()

    /**
     * @param archiveName The name of the archive.
     */
    override fun archiveName(archiveName: String) {
      cdkBuilder.archiveName(archiveName)
    }

    /**
     * @param description A description for the archive.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventPattern An event pattern to use to filter events sent to the archive. 
     */
    override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
    }

    /**
     * @param eventPattern An event pattern to use to filter events sent to the archive. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a072b8c4254ec878c82313ff960681baeb435139a193bf06ebd4fe41cbe6aafa")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    /**
     * @param retention The number of days to retain events for.
     * Default value is 0. If set to 0, events are retained indefinitely.
     */
    override fun retention(retention: Duration) {
      cdkBuilder.retention(retention.let(Duration::unwrap))
    }

    /**
     * @param sourceEventBus The event source associated with the archive. 
     */
    override fun sourceEventBus(sourceEventBus: IEventBus) {
      cdkBuilder.sourceEventBus(sourceEventBus.let(IEventBus::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.ArchiveProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.ArchiveProps,
  ) : CdkObject(cdkObject), ArchiveProps {
    /**
     * The name of the archive.
     *
     * Default: - Automatically generated
     */
    override fun archiveName(): String? = unwrap(this).getArchiveName()

    /**
     * A description for the archive.
     *
     * Default: - none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An event pattern to use to filter events sent to the archive.
     */
    override fun eventPattern(): EventPattern =
        unwrap(this).getEventPattern().let(EventPattern::wrap)

    /**
     * The number of days to retain events for.
     *
     * Default value is 0. If set to 0, events are retained indefinitely.
     *
     * Default: - Infinite
     */
    override fun retention(): Duration? = unwrap(this).getRetention()?.let(Duration::wrap)

    /**
     * The event source associated with the archive.
     */
    override fun sourceEventBus(): IEventBus = unwrap(this).getSourceEventBus().let(IEventBus::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.ArchiveProps): ArchiveProps
        = CdkObjectWrappers.wrap(cdkObject) as? ArchiveProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArchiveProps): software.amazon.awscdk.services.events.ArchiveProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.ArchiveProps
  }
}

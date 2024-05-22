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
 * The event archive base properties.
 *
 * Example:
 *
 * ```
 * EventBus bus = EventBus.Builder.create(this, "bus")
 * .eventBusName("MyCustomEventBus")
 * .build();
 * bus.archive("MyArchive", BaseArchiveProps.builder()
 * .archiveName("MyCustomEventBusArchive")
 * .description("MyCustomerEventBus Archive")
 * .eventPattern(EventPattern.builder()
 * .account(List.of(Stack.of(this).getAccount()))
 * .build())
 * .retention(Duration.days(365))
 * .build());
 * ```
 */
public interface BaseArchiveProps {
  /**
   * The name of the archive.
   *
   * Default: - Automatically generated
   */
  public fun archiveName(): String? = unwrap(this).getArchiveName()

  /**
   * A description for the archive.
   *
   * Default: - none
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An event pattern to use to filter events sent to the archive.
   */
  public fun eventPattern(): EventPattern

  /**
   * The number of days to retain events for.
   *
   * Default value is 0. If set to 0, events are retained indefinitely.
   *
   * Default: - Infinite
   */
  public fun retention(): Duration? = unwrap(this).getRetention()?.let(Duration::wrap)

  /**
   * A builder for [BaseArchiveProps]
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
    @JvmName("13ac5df233fe96d816e0408ba6d1cd1172ea899f4b2b563458e7941f9418c84c")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    /**
     * @param retention The number of days to retain events for.
     * Default value is 0. If set to 0, events are retained indefinitely.
     */
    public fun retention(retention: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.BaseArchiveProps.Builder =
        software.amazon.awscdk.services.events.BaseArchiveProps.builder()

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
      cdkBuilder.eventPattern(eventPattern.let(EventPattern.Companion::unwrap))
    }

    /**
     * @param eventPattern An event pattern to use to filter events sent to the archive. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13ac5df233fe96d816e0408ba6d1cd1172ea899f4b2b563458e7941f9418c84c")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    /**
     * @param retention The number of days to retain events for.
     * Default value is 0. If set to 0, events are retained indefinitely.
     */
    override fun retention(retention: Duration) {
      cdkBuilder.retention(retention.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.BaseArchiveProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.BaseArchiveProps,
  ) : CdkObject(cdkObject), BaseArchiveProps {
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseArchiveProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.BaseArchiveProps):
        BaseArchiveProps = CdkObjectWrappers.wrap(cdkObject) as? BaseArchiveProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseArchiveProps):
        software.amazon.awscdk.services.events.BaseArchiveProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.events.BaseArchiveProps
  }
}

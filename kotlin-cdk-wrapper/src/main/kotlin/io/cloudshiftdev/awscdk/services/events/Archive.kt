@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define an EventBridge Archive.
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
 * Archive archive = Archive.Builder.create(this, "MyArchive")
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
public open class Archive(
  cdkObject: software.amazon.awscdk.services.events.Archive,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ArchiveProps,
  ) :
      this(software.amazon.awscdk.services.events.Archive(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ArchiveProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ArchiveProps.Builder.() -> Unit,
  ) : this(scope, id, ArchiveProps(props)
  )

  /**
   * The ARN of the archive created.
   */
  public open fun archiveArn(): String = unwrap(this).getArchiveArn()

  /**
   * The archive name.
   */
  public open fun archiveName(): String = unwrap(this).getArchiveName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.Archive].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the archive.
     *
     * Default: - Automatically generated
     *
     * @param archiveName The name of the archive. 
     */
    public fun archiveName(archiveName: String)

    /**
     * A description for the archive.
     *
     * Default: - none
     *
     * @param description A description for the archive. 
     */
    public fun description(description: String)

    /**
     * An event pattern to use to filter events sent to the archive.
     *
     * @param eventPattern An event pattern to use to filter events sent to the archive. 
     */
    public fun eventPattern(eventPattern: EventPattern)

    /**
     * An event pattern to use to filter events sent to the archive.
     *
     * @param eventPattern An event pattern to use to filter events sent to the archive. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54203e45cadc4b2928902af7430b96858863a84f06d0449c50223a1ac08c387c")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    /**
     * The number of days to retain events for.
     *
     * Default value is 0. If set to 0, events are retained indefinitely.
     *
     * Default: - Infinite
     *
     * @param retention The number of days to retain events for. 
     */
    public fun retention(retention: Duration)

    /**
     * The event source associated with the archive.
     *
     * @param sourceEventBus The event source associated with the archive. 
     */
    public fun sourceEventBus(sourceEventBus: IEventBus)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.Archive.Builder =
        software.amazon.awscdk.services.events.Archive.Builder.create(scope, id)

    /**
     * The name of the archive.
     *
     * Default: - Automatically generated
     *
     * @param archiveName The name of the archive. 
     */
    override fun archiveName(archiveName: String) {
      cdkBuilder.archiveName(archiveName)
    }

    /**
     * A description for the archive.
     *
     * Default: - none
     *
     * @param description A description for the archive. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An event pattern to use to filter events sent to the archive.
     *
     * @param eventPattern An event pattern to use to filter events sent to the archive. 
     */
    override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
    }

    /**
     * An event pattern to use to filter events sent to the archive.
     *
     * @param eventPattern An event pattern to use to filter events sent to the archive. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54203e45cadc4b2928902af7430b96858863a84f06d0449c50223a1ac08c387c")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    /**
     * The number of days to retain events for.
     *
     * Default value is 0. If set to 0, events are retained indefinitely.
     *
     * Default: - Infinite
     *
     * @param retention The number of days to retain events for. 
     */
    override fun retention(retention: Duration) {
      cdkBuilder.retention(retention.let(Duration::unwrap))
    }

    /**
     * The event source associated with the archive.
     *
     * @param sourceEventBus The event source associated with the archive. 
     */
    override fun sourceEventBus(sourceEventBus: IEventBus) {
      cdkBuilder.sourceEventBus(sourceEventBus.let(IEventBus::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.Archive = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Archive {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Archive(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.Archive): Archive =
        Archive(cdkObject)

    internal fun unwrap(wrapped: Archive): software.amazon.awscdk.services.events.Archive =
        wrapped.cdkObject as software.amazon.awscdk.services.events.Archive
  }
}

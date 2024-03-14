package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Archive internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.Archive,
) : Resource(cdkObject) {
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
        wrapped.cdkObject
  }
}

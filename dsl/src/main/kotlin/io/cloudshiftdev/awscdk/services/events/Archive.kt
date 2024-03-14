package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Archive internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.Archive,
) : Resource(cdkObject) {
  public open fun archiveArn(): String = unwrap(this).getArchiveArn()

  public open fun archiveName(): String = unwrap(this).getArchiveName()

  public interface Builder {
    public fun archiveName(archiveName: String)

    public fun description(description: String)

    public fun eventPattern(eventPattern: EventPattern)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54203e45cadc4b2928902af7430b96858863a84f06d0449c50223a1ac08c387c")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    public fun retention(retention: Duration)

    public fun sourceEventBus(sourceEventBus: IEventBus)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.Archive.Builder =
        software.amazon.awscdk.services.events.Archive.Builder.create(scope, id)

    override fun archiveName(archiveName: String) {
      cdkBuilder.archiveName(archiveName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54203e45cadc4b2928902af7430b96858863a84f06d0449c50223a1ac08c387c")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    override fun retention(retention: Duration) {
      cdkBuilder.retention(retention.let(Duration::unwrap))
    }

    override fun sourceEventBus(sourceEventBus: IEventBus) {
      cdkBuilder.sourceEventBus(sourceEventBus.let(IEventBus::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.Archive = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

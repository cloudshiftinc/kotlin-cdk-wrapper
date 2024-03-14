package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Duration
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BaseArchiveProps {
  public fun archiveName(): String? = unwrap(this).getArchiveName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun eventPattern(): EventPattern

  public fun retention(): Duration? = unwrap(this).getRetention()?.let(Duration::wrap)

  public interface Builder {
    public fun archiveName(archiveName: String)

    public fun description(description: String)

    public fun eventPattern(eventPattern: EventPattern)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13ac5df233fe96d816e0408ba6d1cd1172ea899f4b2b563458e7941f9418c84c")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    public fun retention(retention: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.BaseArchiveProps.Builder =
        software.amazon.awscdk.services.events.BaseArchiveProps.builder()

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
    @JvmName("13ac5df233fe96d816e0408ba6d1cd1172ea899f4b2b563458e7941f9418c84c")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    override fun retention(retention: Duration) {
      cdkBuilder.retention(retention.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.BaseArchiveProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.BaseArchiveProps,
  ) : BaseArchiveProps {
    override fun archiveName(): String? = unwrap(this).getArchiveName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventPattern(): EventPattern =
        unwrap(this).getEventPattern().let(EventPattern::wrap)

    override fun retention(): Duration? = unwrap(this).getRetention()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseArchiveProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.BaseArchiveProps):
        BaseArchiveProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseArchiveProps):
        software.amazon.awscdk.services.events.BaseArchiveProps = (wrapped as Wrapper).cdkObject
  }
}

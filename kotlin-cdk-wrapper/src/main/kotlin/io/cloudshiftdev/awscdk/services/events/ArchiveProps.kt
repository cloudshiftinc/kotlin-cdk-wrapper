@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ArchiveProps : BaseArchiveProps {
  public fun sourceEventBus(): IEventBus

  @CdkDslMarker
  public interface Builder {
    public fun archiveName(archiveName: String)

    public fun description(description: String)

    public fun eventPattern(eventPattern: EventPattern)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a072b8c4254ec878c82313ff960681baeb435139a193bf06ebd4fe41cbe6aafa")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

    public fun retention(retention: Duration)

    public fun sourceEventBus(sourceEventBus: IEventBus)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.ArchiveProps.Builder =
        software.amazon.awscdk.services.events.ArchiveProps.builder()

    override fun archiveName(archiveName: String) {
      cdkBuilder.archiveName(archiveName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a072b8c4254ec878c82313ff960681baeb435139a193bf06ebd4fe41cbe6aafa")
    override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    override fun retention(retention: Duration) {
      cdkBuilder.retention(retention.let(Duration::unwrap))
    }

    override fun sourceEventBus(sourceEventBus: IEventBus) {
      cdkBuilder.sourceEventBus(sourceEventBus.let(IEventBus::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.ArchiveProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.ArchiveProps,
  ) : CdkObject(cdkObject), ArchiveProps {
    override fun archiveName(): String? = unwrap(this).getArchiveName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventPattern(): EventPattern =
        unwrap(this).getEventPattern().let(EventPattern::wrap)

    override fun retention(): Duration? = unwrap(this).getRetention()?.let(Duration::wrap)

    override fun sourceEventBus(): IEventBus = unwrap(this).getSourceEventBus().let(IEventBus::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.ArchiveProps): ArchiveProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArchiveProps): software.amazon.awscdk.services.events.ArchiveProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.ArchiveProps
  }
}

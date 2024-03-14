package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface AddEventSelectorOptions {
  /**
   * An optional list of service event sources from which you do not want management events to be
   * logged on your trail.
   *
   * Default: []
   */
  public fun excludeManagementEventSources(): List<ManagementEventSources> =
      unwrap(this).getExcludeManagementEventSources()?.map(ManagementEventSources::wrap) ?:
      emptyList()

  /**
   * Specifies whether the event selector includes management events for the trail.
   *
   * Default: true
   */
  public fun includeManagementEvents(): Boolean? = unwrap(this).getIncludeManagementEvents()

  /**
   * Specifies whether to log read-only events, write-only events, or all events.
   *
   * Default: ReadWriteType.All
   */
  public fun readWriteType(): ReadWriteType? =
      unwrap(this).getReadWriteType()?.let(ReadWriteType::wrap)

  /**
   * A builder for [AddEventSelectorOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param excludeManagementEventSources An optional list of service event sources from which you
     * do not want management events to be logged on your trail.
     */
    public
        fun excludeManagementEventSources(excludeManagementEventSources: List<ManagementEventSources>)

    /**
     * @param excludeManagementEventSources An optional list of service event sources from which you
     * do not want management events to be logged on your trail.
     */
    public fun excludeManagementEventSources(vararg
        excludeManagementEventSources: ManagementEventSources)

    /**
     * @param includeManagementEvents Specifies whether the event selector includes management
     * events for the trail.
     */
    public fun includeManagementEvents(includeManagementEvents: Boolean)

    /**
     * @param readWriteType Specifies whether to log read-only events, write-only events, or all
     * events.
     */
    public fun readWriteType(readWriteType: ReadWriteType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions.Builder =
        software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions.builder()

    /**
     * @param excludeManagementEventSources An optional list of service event sources from which you
     * do not want management events to be logged on your trail.
     */
    override
        fun excludeManagementEventSources(excludeManagementEventSources: List<ManagementEventSources>) {
      cdkBuilder.excludeManagementEventSources(excludeManagementEventSources.map(ManagementEventSources::unwrap))
    }

    /**
     * @param excludeManagementEventSources An optional list of service event sources from which you
     * do not want management events to be logged on your trail.
     */
    override fun excludeManagementEventSources(vararg
        excludeManagementEventSources: ManagementEventSources): Unit =
        excludeManagementEventSources(excludeManagementEventSources.toList())

    /**
     * @param includeManagementEvents Specifies whether the event selector includes management
     * events for the trail.
     */
    override fun includeManagementEvents(includeManagementEvents: Boolean) {
      cdkBuilder.includeManagementEvents(includeManagementEvents)
    }

    /**
     * @param readWriteType Specifies whether to log read-only events, write-only events, or all
     * events.
     */
    override fun readWriteType(readWriteType: ReadWriteType) {
      cdkBuilder.readWriteType(readWriteType.let(ReadWriteType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions,
  ) : CdkObject(cdkObject), AddEventSelectorOptions {
    /**
     * An optional list of service event sources from which you do not want management events to be
     * logged on your trail.
     *
     * Default: []
     */
    override fun excludeManagementEventSources(): List<ManagementEventSources> =
        unwrap(this).getExcludeManagementEventSources()?.map(ManagementEventSources::wrap) ?:
        emptyList()

    /**
     * Specifies whether the event selector includes management events for the trail.
     *
     * Default: true
     */
    override fun includeManagementEvents(): Boolean? = unwrap(this).getIncludeManagementEvents()

    /**
     * Specifies whether to log read-only events, write-only events, or all events.
     *
     * Default: ReadWriteType.All
     */
    override fun readWriteType(): ReadWriteType? =
        unwrap(this).getReadWriteType()?.let(ReadWriteType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddEventSelectorOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions):
        AddEventSelectorOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddEventSelectorOptions):
        software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions
  }
}
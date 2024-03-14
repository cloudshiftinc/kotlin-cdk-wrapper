package io.cloudshiftdev.awscdk.services.cloudtrail

import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface AddEventSelectorOptions {
  public fun excludeManagementEventSources(): List<ManagementEventSources> =
      unwrap(this).getExcludeManagementEventSources()?.map(ManagementEventSources::wrap) ?:
      emptyList()

  public fun includeManagementEvents(): Boolean? = unwrap(this).getIncludeManagementEvents()

  public fun readWriteType(): ReadWriteType? =
      unwrap(this).getReadWriteType()?.let(ReadWriteType::wrap)

  public interface Builder {
    public
        fun excludeManagementEventSources(excludeManagementEventSources: List<ManagementEventSources>)

    public fun includeManagementEvents(includeManagementEvents: Boolean)

    public fun readWriteType(readWriteType: ReadWriteType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions.Builder =
        software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions.builder()

    override
        fun excludeManagementEventSources(excludeManagementEventSources: List<ManagementEventSources>) {
      cdkBuilder.excludeManagementEventSources(excludeManagementEventSources.map(ManagementEventSources::unwrap))
    }

    override fun includeManagementEvents(includeManagementEvents: Boolean) {
      cdkBuilder.includeManagementEvents(includeManagementEvents)
    }

    override fun readWriteType(readWriteType: ReadWriteType) {
      cdkBuilder.readWriteType(readWriteType.let(ReadWriteType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions,
  ) : AddEventSelectorOptions {
    override fun excludeManagementEventSources(): List<ManagementEventSources> =
        unwrap(this).getExcludeManagementEventSources()?.map(ManagementEventSources::wrap) ?:
        emptyList()

    override fun includeManagementEvents(): Boolean? = unwrap(this).getIncludeManagementEvents()

    override fun readWriteType(): ReadWriteType? =
        unwrap(this).getReadWriteType()?.let(ReadWriteType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddEventSelectorOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions):
        AddEventSelectorOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddEventSelectorOptions):
        software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions = (wrapped as
        Wrapper).cdkObject
  }
}

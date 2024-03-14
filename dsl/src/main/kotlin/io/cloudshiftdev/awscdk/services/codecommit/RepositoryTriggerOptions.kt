package io.cloudshiftdev.awscdk.services.codecommit

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface RepositoryTriggerOptions {
  public fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

  public fun customData(): String? = unwrap(this).getCustomData()

  public fun events(): List<RepositoryEventTrigger> =
      unwrap(this).getEvents()?.map(RepositoryEventTrigger::wrap) ?: emptyList()

  public fun name(): String? = unwrap(this).getName()

  public interface Builder {
    public fun branches(branches: List<String>) {
    }

    public fun customData(customData: String) {
    }

    public fun events(events: List<RepositoryEventTrigger>) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.Builder =
        software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.builder()

    public override fun branches(branches: List<String>) {
      cdkBuilder.branches(branches)
    }

    public override fun customData(customData: String) {
      cdkBuilder.customData(customData)
    }

    public override fun events(events: List<RepositoryEventTrigger>) {
      cdkBuilder.events(events.map(RepositoryEventTrigger::unwrap))
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions,
  ) : RepositoryTriggerOptions {
    public override fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

    public override fun customData(): String? = unwrap(this).getCustomData()

    public override fun events(): List<RepositoryEventTrigger> =
        unwrap(this).getEvents()?.map(RepositoryEventTrigger::wrap) ?: emptyList()

    public override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryTriggerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions):
        RepositoryTriggerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryTriggerOptions):
        software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions = (wrapped as
        Wrapper).cdkObject
  }
}

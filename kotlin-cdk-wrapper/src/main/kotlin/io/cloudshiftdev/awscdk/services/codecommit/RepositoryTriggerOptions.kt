@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface RepositoryTriggerOptions {
  public fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

  public fun customData(): String? = unwrap(this).getCustomData()

  public fun events(): List<RepositoryEventTrigger> =
      unwrap(this).getEvents()?.map(RepositoryEventTrigger::wrap) ?: emptyList()

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
  public interface Builder {
    public fun branches(branches: List<String>)

    public fun branches(vararg branches: String)

    public fun customData(customData: String)

    public fun events(events: List<RepositoryEventTrigger>)

    public fun events(vararg events: RepositoryEventTrigger)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.Builder =
        software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions.builder()

    override fun branches(branches: List<String>) {
      cdkBuilder.branches(branches)
    }

    override fun branches(vararg branches: String): Unit = branches(branches.toList())

    override fun customData(customData: String) {
      cdkBuilder.customData(customData)
    }

    override fun events(events: List<RepositoryEventTrigger>) {
      cdkBuilder.events(events.map(RepositoryEventTrigger::unwrap))
    }

    override fun events(vararg events: RepositoryEventTrigger): Unit = events(events.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions,
  ) : CdkObject(cdkObject), RepositoryTriggerOptions {
    override fun branches(): List<String> = unwrap(this).getBranches() ?: emptyList()

    override fun customData(): String? = unwrap(this).getCustomData()

    override fun events(): List<RepositoryEventTrigger> =
        unwrap(this).getEvents()?.map(RepositoryEventTrigger::wrap) ?: emptyList()

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryTriggerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions):
        RepositoryTriggerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryTriggerOptions):
        software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions
  }
}

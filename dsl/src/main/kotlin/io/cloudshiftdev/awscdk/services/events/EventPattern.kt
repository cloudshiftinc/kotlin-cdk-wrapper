package io.cloudshiftdev.awscdk.services.events

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface EventPattern {
  public fun account(): List<String> = unwrap(this).getAccount() ?: emptyList()

  public fun detail(): Map<String, Any> = unwrap(this).getDetail() ?: emptyMap()

  public fun detailType(): List<String> = unwrap(this).getDetailType() ?: emptyList()

  public fun id(): List<String> = unwrap(this).getId() ?: emptyList()

  public fun region(): List<String> = unwrap(this).getRegion() ?: emptyList()

  public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  public fun source(): List<String> = unwrap(this).getSource() ?: emptyList()

  public fun time(): List<String> = unwrap(this).getTime() ?: emptyList()

  public fun version(): List<String> = unwrap(this).getVersion() ?: emptyList()

  public interface Builder {
    public fun account(account: List<String>) {
    }

    public fun detail(detail: Map<String, Any>) {
    }

    public fun detailType(detailType: List<String>) {
    }

    public fun id(id: List<String>) {
    }

    public fun region(region: List<String>) {
    }

    public fun resources(resources: List<String>) {
    }

    public fun source(source: List<String>) {
    }

    public fun time(time: List<String>) {
    }

    public fun version(version: List<String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventPattern.Builder =
        software.amazon.awscdk.services.events.EventPattern.builder()

    public override fun account(account: List<String>) {
      cdkBuilder.account(account)
    }

    public override fun detail(detail: Map<String, Any>) {
      cdkBuilder.detail(detail)
    }

    public override fun detailType(detailType: List<String>) {
      cdkBuilder.detailType(detailType)
    }

    public override fun id(id: List<String>) {
      cdkBuilder.id(id)
    }

    public override fun region(region: List<String>) {
      cdkBuilder.region(region)
    }

    public override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    public override fun source(source: List<String>) {
      cdkBuilder.source(source)
    }

    public override fun time(time: List<String>) {
      cdkBuilder.time(time)
    }

    public override fun version(version: List<String>) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.events.EventPattern = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.EventPattern,
  ) : EventPattern {
    public override fun account(): List<String> = unwrap(this).getAccount() ?: emptyList()

    public override fun detail(): Map<String, Any> = unwrap(this).getDetail() ?: emptyMap()

    public override fun detailType(): List<String> = unwrap(this).getDetailType() ?: emptyList()

    public override fun id(): List<String> = unwrap(this).getId() ?: emptyList()

    public override fun region(): List<String> = unwrap(this).getRegion() ?: emptyList()

    public override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    public override fun source(): List<String> = unwrap(this).getSource() ?: emptyList()

    public override fun time(): List<String> = unwrap(this).getTime() ?: emptyList()

    public override fun version(): List<String> = unwrap(this).getVersion() ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EventPattern {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventPattern): EventPattern
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventPattern): software.amazon.awscdk.services.events.EventPattern
        = (wrapped as Wrapper).cdkObject
  }
}

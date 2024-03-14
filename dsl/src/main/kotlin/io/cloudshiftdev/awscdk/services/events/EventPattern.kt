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
    public fun account(account: List<String>)

    public fun detail(detail: Map<String, Any>)

    public fun detailType(detailType: List<String>)

    public fun id(id: List<String>)

    public fun region(region: List<String>)

    public fun resources(resources: List<String>)

    public fun source(source: List<String>)

    public fun time(time: List<String>)

    public fun version(version: List<String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventPattern.Builder =
        software.amazon.awscdk.services.events.EventPattern.builder()

    override fun account(account: List<String>) {
      cdkBuilder.account(account)
    }

    override fun detail(detail: Map<String, Any>) {
      cdkBuilder.detail(detail)
    }

    override fun detailType(detailType: List<String>) {
      cdkBuilder.detailType(detailType)
    }

    override fun id(id: List<String>) {
      cdkBuilder.id(id)
    }

    override fun region(region: List<String>) {
      cdkBuilder.region(region)
    }

    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    override fun source(source: List<String>) {
      cdkBuilder.source(source)
    }

    override fun time(time: List<String>) {
      cdkBuilder.time(time)
    }

    override fun version(version: List<String>) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.events.EventPattern = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.EventPattern,
  ) : EventPattern {
    override fun account(): List<String> = unwrap(this).getAccount() ?: emptyList()

    override fun detail(): Map<String, Any> = unwrap(this).getDetail() ?: emptyMap()

    override fun detailType(): List<String> = unwrap(this).getDetailType() ?: emptyList()

    override fun id(): List<String> = unwrap(this).getId() ?: emptyList()

    override fun region(): List<String> = unwrap(this).getRegion() ?: emptyList()

    override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    override fun source(): List<String> = unwrap(this).getSource() ?: emptyList()

    override fun time(): List<String> = unwrap(this).getTime() ?: emptyList()

    override fun version(): List<String> = unwrap(this).getVersion() ?: emptyList()
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

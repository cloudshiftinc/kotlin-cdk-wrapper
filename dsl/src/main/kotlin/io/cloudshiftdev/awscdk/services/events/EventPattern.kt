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

    public fun account(vararg account: String)

    public fun detail(detail: Map<String, Any>)

    public fun detailType(detailType: List<String>)

    public fun detailType(vararg detailType: String)

    public fun id(id: List<String>)

    public fun id(vararg id: String)

    public fun region(region: List<String>)

    public fun region(vararg region: String)

    public fun resources(resources: List<String>)

    public fun resources(vararg resources: String)

    public fun source(source: List<String>)

    public fun source(vararg source: String)

    public fun time(time: List<String>)

    public fun time(vararg time: String)

    public fun version(version: List<String>)

    public fun version(vararg version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventPattern.Builder =
        software.amazon.awscdk.services.events.EventPattern.builder()

    override fun account(account: List<String>) {
      cdkBuilder.account(account)
    }

    override fun account(vararg account: String): Unit = account(account.toList())

    override fun detail(detail: Map<String, Any>) {
      cdkBuilder.detail(detail)
    }

    override fun detailType(detailType: List<String>) {
      cdkBuilder.detailType(detailType)
    }

    override fun detailType(vararg detailType: String): Unit = detailType(detailType.toList())

    override fun id(id: List<String>) {
      cdkBuilder.id(id)
    }

    override fun id(vararg id: String): Unit = id(id.toList())

    override fun region(region: List<String>) {
      cdkBuilder.region(region)
    }

    override fun region(vararg region: String): Unit = region(region.toList())

    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    override fun source(source: List<String>) {
      cdkBuilder.source(source)
    }

    override fun source(vararg source: String): Unit = source(source.toList())

    override fun time(time: List<String>) {
      cdkBuilder.time(time)
    }

    override fun time(vararg time: String): Unit = time(time.toList())

    override fun version(version: List<String>) {
      cdkBuilder.version(version)
    }

    override fun version(vararg version: String): Unit = version(version.toList())

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

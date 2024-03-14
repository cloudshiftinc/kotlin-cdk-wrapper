package io.cloudshiftdev.awscdk.services.dynamodb

import kotlin.Unit

public interface ThroughputProps {
  public fun readCapacity(): Capacity

  public fun writeCapacity(): Capacity

  public interface Builder {
    public fun readCapacity(readCapacity: Capacity)

    public fun writeCapacity(writeCapacity: Capacity)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.ThroughputProps.Builder =
        software.amazon.awscdk.services.dynamodb.ThroughputProps.builder()

    override fun readCapacity(readCapacity: Capacity) {
      cdkBuilder.readCapacity(readCapacity.let(Capacity::unwrap))
    }

    override fun writeCapacity(writeCapacity: Capacity) {
      cdkBuilder.writeCapacity(writeCapacity.let(Capacity::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.ThroughputProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.ThroughputProps,
  ) : ThroughputProps {
    override fun readCapacity(): Capacity = unwrap(this).getReadCapacity().let(Capacity::wrap)

    override fun writeCapacity(): Capacity = unwrap(this).getWriteCapacity().let(Capacity::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ThroughputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ThroughputProps):
        ThroughputProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ThroughputProps):
        software.amazon.awscdk.services.dynamodb.ThroughputProps = (wrapped as Wrapper).cdkObject
  }
}

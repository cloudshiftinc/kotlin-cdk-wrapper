@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface ThroughputProps {
  public fun readCapacity(): Capacity

  public fun writeCapacity(): Capacity

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.ThroughputProps,
  ) : CdkObject(cdkObject), ThroughputProps {
    override fun readCapacity(): Capacity = unwrap(this).getReadCapacity().let(Capacity::wrap)

    override fun writeCapacity(): Capacity = unwrap(this).getWriteCapacity().let(Capacity::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ThroughputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ThroughputProps):
        ThroughputProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ThroughputProps):
        software.amazon.awscdk.services.dynamodb.ThroughputProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dynamodb.ThroughputProps
  }
}

package io.cloudshiftdev.awscdk.services.rds

import kotlin.Number
import kotlin.Unit

public interface ProcessorFeatures {
  public fun coreCount(): Number? = unwrap(this).getCoreCount()

  public fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()

  public interface Builder {
    public fun coreCount(coreCount: Number)

    public fun threadsPerCore(threadsPerCore: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ProcessorFeatures.Builder =
        software.amazon.awscdk.services.rds.ProcessorFeatures.builder()

    override fun coreCount(coreCount: Number) {
      cdkBuilder.coreCount(coreCount)
    }

    override fun threadsPerCore(threadsPerCore: Number) {
      cdkBuilder.threadsPerCore(threadsPerCore)
    }

    public fun build(): software.amazon.awscdk.services.rds.ProcessorFeatures = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ProcessorFeatures,
  ) : ProcessorFeatures {
    override fun coreCount(): Number? = unwrap(this).getCoreCount()

    override fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorFeatures {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ProcessorFeatures):
        ProcessorFeatures = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProcessorFeatures):
        software.amazon.awscdk.services.rds.ProcessorFeatures = (wrapped as Wrapper).cdkObject
  }
}

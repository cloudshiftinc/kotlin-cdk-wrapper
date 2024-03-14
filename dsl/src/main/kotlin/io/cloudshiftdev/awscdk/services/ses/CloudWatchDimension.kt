package io.cloudshiftdev.awscdk.services.ses

import kotlin.String
import kotlin.Unit

public interface CloudWatchDimension {
  public fun defaultValue(): String

  public fun name(): String

  public fun source(): CloudWatchDimensionSource

  public interface Builder {
    public fun defaultValue(defaultValue: String)

    public fun name(name: String)

    public fun source(source: CloudWatchDimensionSource)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CloudWatchDimension.Builder =
        software.amazon.awscdk.services.ses.CloudWatchDimension.builder()

    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun source(source: CloudWatchDimensionSource) {
      cdkBuilder.source(source.let(CloudWatchDimensionSource::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.CloudWatchDimension = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.CloudWatchDimension,
  ) : CloudWatchDimension {
    override fun defaultValue(): String = unwrap(this).getDefaultValue()

    override fun name(): String = unwrap(this).getName()

    override fun source(): CloudWatchDimensionSource =
        unwrap(this).getSource().let(CloudWatchDimensionSource::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchDimension {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CloudWatchDimension):
        CloudWatchDimension = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudWatchDimension):
        software.amazon.awscdk.services.ses.CloudWatchDimension = (wrapped as Wrapper).cdkObject
  }
}

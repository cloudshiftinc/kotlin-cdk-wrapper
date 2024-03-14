package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Unit

public interface DataSourceOptions {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public interface Builder {
    public fun description(description: String) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.DataSourceOptions.Builder =
        software.amazon.awscdk.services.appsync.DataSourceOptions.builder()

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.DataSourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.DataSourceOptions,
  ) : DataSourceOptions {
    public override fun description(): String? = unwrap(this).getDescription()

    public override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.DataSourceOptions):
        DataSourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DataSourceOptions):
        software.amazon.awscdk.services.appsync.DataSourceOptions = (wrapped as Wrapper).cdkObject
  }
}

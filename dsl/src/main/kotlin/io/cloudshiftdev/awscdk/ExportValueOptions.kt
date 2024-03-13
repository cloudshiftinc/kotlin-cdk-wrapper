package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface ExportValueOptions {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public interface Builder {
    public fun description(description: String) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ExportValueOptions.Builder =
        software.amazon.awscdk.ExportValueOptions.builder()

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.ExportValueOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ExportValueOptions,
  ) : ExportValueOptions {
    public override fun description(): String? = unwrap(this).getDescription()

    public override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ExportValueOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ExportValueOptions): ExportValueOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExportValueOptions): software.amazon.awscdk.ExportValueOptions =
        (wrapped as Wrapper).cdkObject
  }
}

package io.cloudshiftdev.awscdk.services.cloudwatch

import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface Dimension {
  public fun name(): String

  public fun `value`(): Any

  public interface Builder {
    public fun name(name: String) {
    }

    public fun `value`(`value`: Any) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.Dimension.Builder =
        software.amazon.awscdk.services.cloudwatch.Dimension.builder()

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.Dimension = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudwatch.Dimension,
  ) : Dimension {
    public override fun name(): String = unwrap(this).getName()

    public override fun `value`(): Any = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Dimension {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Dimension): Dimension =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Dimension): software.amazon.awscdk.services.cloudwatch.Dimension =
        (wrapped as Wrapper).cdkObject
  }
}

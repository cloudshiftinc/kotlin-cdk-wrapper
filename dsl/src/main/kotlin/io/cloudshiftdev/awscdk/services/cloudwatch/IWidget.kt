package io.cloudshiftdev.awscdk.services.cloudwatch

import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public interface IWidget {
  public fun height(): Number

  public fun position(arg0: Number, arg1: Number)

  public fun toJson(): List<Any>

  @Deprecated(message = "deprecated in CDK")
  public fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

  public fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

  public fun width(): Number

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudwatch.IWidget,
  ) : IWidget {
    public override fun height(): Number = unwrap(this).getHeight()

    public override fun position(arg0: Number, arg1: Number) {
      unwrap(this).position(arg0, arg1)
    }

    public override fun toJson(): List<Any> = unwrap(this).toJson() ?: emptyList()

    @Deprecated(message = "deprecated in CDK")
    public override fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

    public override fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?:
        emptyMap()

    public override fun width(): Number = unwrap(this).getWidth()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IWidget): IWidget =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IWidget): software.amazon.awscdk.services.cloudwatch.IWidget =
        (wrapped as Wrapper).cdkObject
  }
}

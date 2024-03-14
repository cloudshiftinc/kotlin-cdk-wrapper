package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String

public interface IMappingValue {
  public fun `value`(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IMappingValue,
  ) : IMappingValue {
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IMappingValue):
        IMappingValue = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IMappingValue):
        software.amazon.awscdk.services.apigatewayv2.IMappingValue = (wrapped as Wrapper).cdkObject
  }
}

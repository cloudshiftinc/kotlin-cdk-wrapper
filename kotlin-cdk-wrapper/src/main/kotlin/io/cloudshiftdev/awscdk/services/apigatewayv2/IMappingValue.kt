@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IMappingValue {
  public fun `value`(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IMappingValue,
  ) : CdkObject(cdkObject), IMappingValue {
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IMappingValue):
        IMappingValue = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IMappingValue):
        software.amazon.awscdk.services.apigatewayv2.IMappingValue = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IMappingValue
  }
}

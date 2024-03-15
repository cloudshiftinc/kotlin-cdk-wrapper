@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.IWidget,
  ) : CdkObject(cdkObject), IWidget {
    override fun height(): Number = unwrap(this).getHeight()

    override fun position(arg0: Number, arg1: Number) {
      unwrap(this).position(arg0, arg1)
    }

    override fun toJson(): List<Any> = unwrap(this).toJson()

    @Deprecated(message = "deprecated in CDK")
    override fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

    override fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

    override fun width(): Number = unwrap(this).getWidth()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IWidget): IWidget =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IWidget): software.amazon.awscdk.services.cloudwatch.IWidget =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IWidget
  }
}

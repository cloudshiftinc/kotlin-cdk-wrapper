@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface CfnConditionProps {
  public fun expression(): ICfnConditionExpression? =
      unwrap(this).getExpression()?.let(ICfnConditionExpression::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun expression(expression: ICfnConditionExpression)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnConditionProps.Builder =
        software.amazon.awscdk.CfnConditionProps.builder()

    override fun expression(expression: ICfnConditionExpression) {
      cdkBuilder.expression(expression.let(ICfnConditionExpression::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnConditionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnConditionProps,
  ) : CdkObject(cdkObject), CfnConditionProps {
    override fun expression(): ICfnConditionExpression? =
        unwrap(this).getExpression()?.let(ICfnConditionExpression::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConditionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnConditionProps): CfnConditionProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConditionProps): software.amazon.awscdk.CfnConditionProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnConditionProps
  }
}

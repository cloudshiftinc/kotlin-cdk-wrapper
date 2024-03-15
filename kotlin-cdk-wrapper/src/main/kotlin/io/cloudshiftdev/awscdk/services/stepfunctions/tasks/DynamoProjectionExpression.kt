@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String

public open class DynamoProjectionExpression internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression,
) : CdkObject(cdkObject) {
  public open fun atIndex(index: Number): DynamoProjectionExpression =
      unwrap(this).atIndex(index).let(DynamoProjectionExpression::wrap)

  public open fun withAttribute(attr: String): DynamoProjectionExpression =
      unwrap(this).withAttribute(attr).let(DynamoProjectionExpression::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression):
        DynamoProjectionExpression = DynamoProjectionExpression(cdkObject)

    internal fun unwrap(wrapped: DynamoProjectionExpression):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression =
        wrapped.cdkObject
  }
}

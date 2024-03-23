@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String

/**
 * Class to generate projection expression.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * DynamoProjectionExpression dynamoProjectionExpression = new DynamoProjectionExpression();
 * ```
 */
public open class DynamoProjectionExpression(
  cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression,
) : CdkObject(cdkObject) {
  public constructor() :
      this(software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression()
  )

  /**
   * Adds the array literal access for passed index.
   *
   * @param index array index. 
   */
  public open fun atIndex(index: Number): DynamoProjectionExpression =
      unwrap(this).atIndex(index).let(DynamoProjectionExpression::wrap)

  /**
   * Adds the passed attribute to the chain.
   *
   * @param attr Attribute name. 
   */
  public open fun withAttribute(attr: String): DynamoProjectionExpression =
      unwrap(this).withAttribute(attr).let(DynamoProjectionExpression::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression):
        DynamoProjectionExpression = DynamoProjectionExpression(cdkObject)

    internal fun unwrap(wrapped: DynamoProjectionExpression):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression =
        wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoProjectionExpression
  }
}

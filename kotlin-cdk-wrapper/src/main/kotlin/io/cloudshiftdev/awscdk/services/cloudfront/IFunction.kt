@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a CloudFront Function.
 */
public interface IFunction : IResource {
  /**
   * The ARN of the function.
   */
  public fun functionArn(): String

  /**
   * The name of the function.
   */
  public fun functionName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IFunction): IFunction =
        CdkObjectWrappers.wrap(cdkObject) as IFunction

    internal fun unwrap(wrapped: IFunction): software.amazon.awscdk.services.cloudfront.IFunction =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IFunction
  }
}

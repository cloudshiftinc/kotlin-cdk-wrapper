@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface IAlias : IFunction {
  /**
   * Name of this alias.
   */
  public fun aliasName(): String

  /**
   * The underlying Lambda function version.
   */
  public fun version(): IVersion

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IAlias): IAlias =
        CdkObjectWrappers.wrap(cdkObject) as IAlias

    internal fun unwrap(wrapped: IAlias): software.amazon.awscdk.services.lambda.IAlias = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IAlias
  }
}

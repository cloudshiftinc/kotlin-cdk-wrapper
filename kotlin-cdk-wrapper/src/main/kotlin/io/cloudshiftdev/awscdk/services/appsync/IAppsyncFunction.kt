@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for AppSync Functions.
 */
public interface IAppsyncFunction : IResource {
  /**
   * the ARN of the AppSync function.
   */
  public fun functionArn(): String

  /**
   * the name of this AppSync Function.
   */
  public fun functionId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.IAppsyncFunction):
        IAppsyncFunction = CdkObjectWrappers.wrap(cdkObject) as IAppsyncFunction

    internal fun unwrap(wrapped: IAppsyncFunction):
        software.amazon.awscdk.services.appsync.IAppsyncFunction = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.IAppsyncFunction
  }
}

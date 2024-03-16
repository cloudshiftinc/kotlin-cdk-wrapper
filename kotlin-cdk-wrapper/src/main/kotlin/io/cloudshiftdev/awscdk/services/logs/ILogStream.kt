@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface ILogStream : IResource {
  /**
   * The name of this log stream.
   */
  public fun logStreamName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ILogStream): ILogStream =
        CdkObjectWrappers.wrap(cdkObject) as ILogStream

    internal fun unwrap(wrapped: ILogStream): software.amazon.awscdk.services.logs.ILogStream =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.ILogStream
  }
}

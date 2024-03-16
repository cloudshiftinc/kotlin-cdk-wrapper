@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents Realtime Log Configuration.
 */
public interface IRealtimeLogConfig : IResource {
  /**
   * The arn of the realtime log config.
   */
  public fun realtimeLogConfigArn(): String

  /**
   * The name of the realtime log config.
   */
  public fun realtimeLogConfigName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig):
        IRealtimeLogConfig = CdkObjectWrappers.wrap(cdkObject) as IRealtimeLogConfig

    internal fun unwrap(wrapped: IRealtimeLogConfig):
        software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IRealtimeLogConfig
  }
}

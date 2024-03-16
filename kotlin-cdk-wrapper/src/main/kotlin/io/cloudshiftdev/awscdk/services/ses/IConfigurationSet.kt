@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A configuration set.
 */
public interface IConfigurationSet : IResource {
  /**
   * The name of the configuration set.
   */
  public fun configurationSetName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IConfigurationSet):
        IConfigurationSet = CdkObjectWrappers.wrap(cdkObject) as IConfigurationSet

    internal fun unwrap(wrapped: IConfigurationSet):
        software.amazon.awscdk.services.ses.IConfigurationSet = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.IConfigurationSet
  }
}

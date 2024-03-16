@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a Key Group.
 */
public interface IKeyGroup : IResource {
  /**
   * The ID of the key group.
   */
  public fun keyGroupId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IKeyGroup): IKeyGroup =
        CdkObjectWrappers.wrap(cdkObject) as IKeyGroup

    internal fun unwrap(wrapped: IKeyGroup): software.amazon.awscdk.services.cloudfront.IKeyGroup =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IKeyGroup
  }
}

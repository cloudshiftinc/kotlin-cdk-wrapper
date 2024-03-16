@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A prefix list.
 */
public interface IPrefixList : IResource {
  /**
   * The ID of the prefix list.
   */
  public fun prefixListId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPrefixList): IPrefixList =
        CdkObjectWrappers.wrap(cdkObject) as IPrefixList

    internal fun unwrap(wrapped: IPrefixList): software.amazon.awscdk.services.ec2.IPrefixList =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IPrefixList
  }
}

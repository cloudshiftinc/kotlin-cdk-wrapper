@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A parameter group.
 */
public interface IClusterParameterGroup : IResource {
  /**
   * The name of this parameter group.
   */
  public fun parameterGroupName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.IClusterParameterGroup):
        IClusterParameterGroup = CdkObjectWrappers.wrap(cdkObject) as IClusterParameterGroup

    internal fun unwrap(wrapped: IClusterParameterGroup):
        software.amazon.awscdk.services.docdb.IClusterParameterGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdb.IClusterParameterGroup
  }
}

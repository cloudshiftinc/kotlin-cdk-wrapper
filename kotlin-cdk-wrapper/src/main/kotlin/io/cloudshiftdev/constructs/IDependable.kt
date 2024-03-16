@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

public interface IDependable {
  public companion object {
    internal fun wrap(cdkObject: software.constructs.IDependable): IDependable =
        CdkObjectWrappers.wrap(cdkObject) as IDependable

    internal fun unwrap(wrapped: IDependable): software.constructs.IDependable = (wrapped as
        CdkObject).cdkObject as software.constructs.IDependable
  }
}

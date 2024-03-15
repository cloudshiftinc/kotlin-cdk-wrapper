@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IDependable

public open class CompositeDependable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CompositeDependable,
) : CdkObject(cdkObject), IDependable {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CompositeDependable):
        CompositeDependable = CompositeDependable(cdkObject)

    internal fun unwrap(wrapped: CompositeDependable):
        software.amazon.awscdk.services.iam.CompositeDependable = wrapped.cdkObject
  }
}

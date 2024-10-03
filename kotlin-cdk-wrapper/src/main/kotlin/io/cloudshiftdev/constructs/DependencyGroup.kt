@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.common.CdkObject

public open class DependencyGroup(
  cdkObject: software.constructs.DependencyGroup,
) : CdkObject(cdkObject),
    IDependable {
  public constructor(deps: IDependable) :
      this(software.constructs.DependencyGroup(deps.let(IDependable.Companion::unwrap))
  )

  public open fun add(scopes: IDependable) {
    unwrap(this).add(scopes.let(IDependable.Companion::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.constructs.DependencyGroup): DependencyGroup =
        DependencyGroup(cdkObject)

    internal fun unwrap(wrapped: DependencyGroup): software.constructs.DependencyGroup =
        wrapped.cdkObject as software.constructs.DependencyGroup
  }
}

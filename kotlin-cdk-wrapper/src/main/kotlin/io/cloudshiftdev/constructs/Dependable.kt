@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.collections.List

public abstract class Dependable(
  cdkObject: software.constructs.Dependable,
) : CdkObject(cdkObject) {
  public open fun dependencyRoots(): List<IConstruct> =
      unwrap(this).getDependencyRoots().map(IConstruct::wrap)

  private class Wrapper(
    cdkObject: software.constructs.Dependable,
  ) : Dependable(cdkObject)

  public companion object {
    @Deprecated(message = "deprecated in CDK")
    public fun `get`(instance: IDependable): Dependable =
        software.constructs.Dependable.`get`(instance.let(IDependable.Companion::unwrap)).let(Dependable::wrap)

    public fun implement(instance: IDependable, trait: Dependable) {
      software.constructs.Dependable.implement(instance.let(IDependable.Companion::unwrap),
          trait.let(Dependable.Companion::unwrap))
    }

    public fun of(instance: IDependable): Dependable =
        software.constructs.Dependable.of(instance.let(IDependable.Companion::unwrap)).let(Dependable::wrap)

    internal fun wrap(cdkObject: software.constructs.Dependable): Dependable =
        CdkObjectWrappers.wrap(cdkObject) as? Dependable ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Dependable): software.constructs.Dependable = (wrapped as
        CdkObject).cdkObject as software.constructs.Dependable
  }
}

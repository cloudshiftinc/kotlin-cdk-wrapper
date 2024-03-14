package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Deprecated
import kotlin.collections.List

public abstract class Dependable internal constructor(
  internal override val cdkObject: software.constructs.Dependable,
) : CdkObject(cdkObject) {
  public open fun dependencyRoots(): List<IConstruct> =
      unwrap(this).getDependencyRoots().map(IConstruct::wrap)

  private class Wrapper(
    override val cdkObject: software.constructs.Dependable,
  ) : Dependable(cdkObject)

  public companion object {
    @Deprecated(message = "deprecated in CDK")
    public fun `get`(instance: IDependable): Dependable =
        software.constructs.Dependable.`get`(instance.let(IDependable::unwrap)).let(Dependable::wrap)

    public fun implement(instance: IDependable, trait: Dependable) {
      software.constructs.Dependable.implement(instance.let(IDependable::unwrap),
          trait.let(Dependable::unwrap))
    }

    public fun of(instance: IDependable): Dependable =
        software.constructs.Dependable.of(instance.let(IDependable::unwrap)).let(Dependable::wrap)

    internal fun wrap(cdkObject: software.constructs.Dependable): Dependable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Dependable): software.constructs.Dependable = (wrapped as
        CdkObject).cdkObject as software.constructs.Dependable
  }
}

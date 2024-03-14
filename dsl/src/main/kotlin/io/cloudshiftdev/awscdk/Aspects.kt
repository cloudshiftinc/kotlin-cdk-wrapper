package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.IConstruct
import kotlin.collections.List

public open class Aspects internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Aspects,
) : CdkObject(cdkObject) {
  /**
   * Adds an aspect to apply this scope before synthesis.
   *
   * @param aspect The aspect to add. 
   */
  public open fun add(aspect: IAspect) {
    unwrap(this).add(aspect.let(IAspect::unwrap))
  }

  /**
   * The list of aspects which were directly applied on this scope.
   */
  public open fun all(): List<IAspect> = unwrap(this).getAll().map(IAspect::wrap)

  public companion object {
    public fun of(scope: IConstruct): Aspects =
        software.amazon.awscdk.Aspects.of(scope.let(IConstruct::unwrap)).let(Aspects::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.Aspects): Aspects = Aspects(cdkObject)

    internal fun unwrap(wrapped: Aspects): software.amazon.awscdk.Aspects = wrapped.cdkObject
  }
}

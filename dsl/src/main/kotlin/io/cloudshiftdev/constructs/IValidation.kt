package io.cloudshiftdev.constructs

import kotlin.String
import kotlin.collections.List

public interface IValidation {
  public fun validate(): List<String>

  private class Wrapper internal constructor(
    internal val cdkObject: software.constructs.IValidation,
  ) : IValidation {
    public override fun validate(): List<String> = unwrap(this).validate() ?: emptyList()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.constructs.IValidation): IValidation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IValidation): software.constructs.IValidation = (wrapped as
        Wrapper).cdkObject
  }
}

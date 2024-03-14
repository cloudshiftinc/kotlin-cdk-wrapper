package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.collections.List

public interface IResolvable {
  public fun creationStack(): List<String>

  public fun resolve(arg0: IResolveContext): Any

  public fun typeHint(): ResolutionTypeHint? =
      unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.IResolvable,
  ) : IResolvable {
    override fun creationStack(): List<String> = unwrap(this).getCreationStack()

    override fun resolve(arg0: IResolveContext): Any =
        unwrap(this).resolve(arg0.let(IResolveContext::unwrap))

    override fun toString(): String = unwrap(this).toString()

    override fun typeHint(): ResolutionTypeHint? =
        unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IResolvable): IResolvable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IResolvable): software.amazon.awscdk.IResolvable = (wrapped as
        Wrapper).cdkObject
  }
}

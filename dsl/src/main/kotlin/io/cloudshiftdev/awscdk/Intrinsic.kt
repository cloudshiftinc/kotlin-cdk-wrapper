package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class Intrinsic internal constructor(
  private val cdkObject: software.amazon.awscdk.Intrinsic,
) : IResolvable {
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack() ?: emptyList()

  public override fun resolve(_context: IResolveContext): Any =
      unwrap(this).resolve(_context.let(IResolveContext::unwrap))

  public open fun toJson(): Any = unwrap(this).toJSON()

  public open fun toStringList(): List<String> = unwrap(this).toStringList() ?: emptyList()

  public override fun typeHint(): ResolutionTypeHint? =
      unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)

  public interface Builder {
    public fun stackTrace(stackTrace: Boolean) {
    }

    public fun typeHint(typeHint: ResolutionTypeHint) {
    }
  }

  private class BuilderImpl(
    `value`: Any,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.Intrinsic.Builder =
        software.amazon.awscdk.Intrinsic.Builder.create(`value`)

    public override fun stackTrace(stackTrace: Boolean) {
      cdkBuilder.stackTrace(stackTrace)
    }

    public override fun typeHint(typeHint: ResolutionTypeHint) {
      cdkBuilder.typeHint(typeHint.let(ResolutionTypeHint::unwrap))
    }

    public fun build(): software.amazon.awscdk.Intrinsic = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(`value`: Any, block: Builder.() -> Unit = {}): Intrinsic {
      val builderImpl = BuilderImpl(`value`)
      return Intrinsic(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.Intrinsic): Intrinsic = Intrinsic(cdkObject)

    internal fun unwrap(wrapped: Intrinsic): software.amazon.awscdk.Intrinsic = wrapped.cdkObject
  }
}

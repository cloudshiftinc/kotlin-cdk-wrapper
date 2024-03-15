@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class Intrinsic internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Intrinsic,
) : CdkObject(cdkObject), IResolvable {
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  public override fun resolve(_context: IResolveContext): Any =
      unwrap(this).resolve(_context.let(IResolveContext::unwrap))

  public open fun toJson(): Any = unwrap(this).toJSON()

  public open fun toStringList(): List<String> = unwrap(this).toStringList()

  public override fun typeHint(): ResolutionTypeHint? =
      unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun stackTrace(stackTrace: Boolean)

    public fun typeHint(typeHint: ResolutionTypeHint)
  }

  private class BuilderImpl(
    `value`: Any,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.Intrinsic.Builder =
        software.amazon.awscdk.Intrinsic.Builder.create(`value`)

    override fun stackTrace(stackTrace: Boolean) {
      cdkBuilder.stackTrace(stackTrace)
    }

    override fun typeHint(typeHint: ResolutionTypeHint) {
      cdkBuilder.typeHint(typeHint.let(ResolutionTypeHint::unwrap))
    }

    public fun build(): software.amazon.awscdk.Intrinsic = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(`value`: Any, block: Builder.() -> Unit = {}): Intrinsic {
      val builderImpl = BuilderImpl(`value`)
      return Intrinsic(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.Intrinsic): Intrinsic = Intrinsic(cdkObject)

    internal fun unwrap(wrapped: Intrinsic): software.amazon.awscdk.Intrinsic = wrapped.cdkObject
  }
}

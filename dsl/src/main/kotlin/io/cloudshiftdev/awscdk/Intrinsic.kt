package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class Intrinsic internal constructor(
  private val cdkObject: software.amazon.awscdk.Intrinsic,
) : IResolvable {
  /**
   * The captured stack trace which represents the location in which this token was created.
   */
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  /**
   * Produce the Token's value at resolution time.
   *
   * @param _context 
   */
  public override fun resolve(_context: IResolveContext): Any =
      unwrap(this).resolve(_context.let(IResolveContext::unwrap))

  /**
   * Turn this Token into JSON.
   *
   * Called automatically when JSON.stringify() is called on a Token.
   */
  public open fun toJson(): Any = unwrap(this).toJSON()

  /**
   * Convert an instance of this Token to a string list.
   *
   * This method will be called implicitly by language runtimes if the object
   * is embedded into a list. We treat it the same as an explicit
   * stringification.
   */
  public open fun toStringList(): List<String> = unwrap(this).toStringList()

  /**
   * Type that the Intrinsic is expected to evaluate to.
   */
  public override fun typeHint(): ResolutionTypeHint? =
      unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.Intrinsic].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Capture the stack trace of where this token is created.
     *
     * Default: true
     *
     * @param stackTrace Capture the stack trace of where this token is created. 
     */
    public fun stackTrace(stackTrace: Boolean)

    /**
     * Type that this token is expected to evaluate to.
     *
     * Default: ResolutionTypeHint.STRING
     *
     * @param typeHint Type that this token is expected to evaluate to. 
     */
    public fun typeHint(typeHint: ResolutionTypeHint)
  }

  private class BuilderImpl(
    `value`: Any,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.Intrinsic.Builder =
        software.amazon.awscdk.Intrinsic.Builder.create(`value`)

    /**
     * Capture the stack trace of where this token is created.
     *
     * Default: true
     *
     * @param stackTrace Capture the stack trace of where this token is created. 
     */
    override fun stackTrace(stackTrace: Boolean) {
      cdkBuilder.stackTrace(stackTrace)
    }

    /**
     * Type that this token is expected to evaluate to.
     *
     * Default: ResolutionTypeHint.STRING
     *
     * @param typeHint Type that this token is expected to evaluate to. 
     */
    override fun typeHint(typeHint: ResolutionTypeHint) {
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

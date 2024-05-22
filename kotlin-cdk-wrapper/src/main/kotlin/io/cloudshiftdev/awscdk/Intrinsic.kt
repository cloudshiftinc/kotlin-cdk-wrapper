@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Token subclass that represents values intrinsic to the target document language.
 *
 * WARNING: this class should not be externally exposed, but is currently visible
 * because of a limitation of jsii (https://github.com/aws/jsii/issues/524).
 *
 * This class will disappear in a future release and should not be used.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * Object value;
 * Intrinsic intrinsic = Intrinsic.Builder.create(value)
 * .stackTrace(false)
 * .typeHint(ResolutionTypeHint.STRING)
 * .build();
 * ```
 */
public open class Intrinsic(
  cdkObject: software.amazon.awscdk.Intrinsic,
) : CdkObject(cdkObject), IResolvable {
  public constructor(`value`: Any) : this(software.amazon.awscdk.Intrinsic(`value`)
  )

  public constructor(`value`: Any, options: IntrinsicProps) :
      this(software.amazon.awscdk.Intrinsic(`value`, options.let(IntrinsicProps.Companion::unwrap))
  )

  public constructor(`value`: Any, options: IntrinsicProps.Builder.() -> Unit) : this(`value`,
      IntrinsicProps(options)
  )

  /**
   * The captured stack trace which represents the location in which this token was created.
   */
  public override fun creationStack(): List<String> = unwrap(this).getCreationStack()

  /**
   * Produce the Token's value at resolution time.
   *
   * @param _context 
   */
  public override fun resolve(context: IResolveContext): Any =
      unwrap(this).resolve(context.let(IResolveContext.Companion::unwrap))

  /**
   * Turn this Token into JSON.
   *
   * Called automatically when JSON.stringify() is called on a Token.
   */
  public open fun toJSON(): Any = unwrap(this).toJSON()

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
      cdkBuilder.typeHint(typeHint.let(ResolutionTypeHint.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.Intrinsic = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(`value`: Any, block: Builder.() -> Unit = {}): Intrinsic {
      val builderImpl = BuilderImpl(`value`)
      return Intrinsic(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.Intrinsic): Intrinsic = Intrinsic(cdkObject)

    internal fun unwrap(wrapped: Intrinsic): software.amazon.awscdk.Intrinsic = wrapped.cdkObject as
        software.amazon.awscdk.Intrinsic
  }
}

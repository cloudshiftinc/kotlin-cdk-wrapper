@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Customization properties for an Intrinsic token.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * IntrinsicProps intrinsicProps = IntrinsicProps.builder()
 * .stackTrace(false)
 * .typeHint(ResolutionTypeHint.STRING)
 * .build();
 * ```
 */
public interface IntrinsicProps {
  /**
   * Capture the stack trace of where this token is created.
   *
   * Default: true
   */
  public fun stackTrace(): Boolean? = unwrap(this).getStackTrace()

  /**
   * Type that this token is expected to evaluate to.
   *
   * Default: ResolutionTypeHint.STRING
   */
  public fun typeHint(): ResolutionTypeHint? =
      unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)

  /**
   * A builder for [IntrinsicProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param stackTrace Capture the stack trace of where this token is created.
     */
    public fun stackTrace(stackTrace: Boolean)

    /**
     * @param typeHint Type that this token is expected to evaluate to.
     */
    public fun typeHint(typeHint: ResolutionTypeHint)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.IntrinsicProps.Builder =
        software.amazon.awscdk.IntrinsicProps.builder()

    /**
     * @param stackTrace Capture the stack trace of where this token is created.
     */
    override fun stackTrace(stackTrace: Boolean) {
      cdkBuilder.stackTrace(stackTrace)
    }

    /**
     * @param typeHint Type that this token is expected to evaluate to.
     */
    override fun typeHint(typeHint: ResolutionTypeHint) {
      cdkBuilder.typeHint(typeHint.let(ResolutionTypeHint.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.IntrinsicProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IntrinsicProps,
  ) : CdkObject(cdkObject),
      IntrinsicProps {
    /**
     * Capture the stack trace of where this token is created.
     *
     * Default: true
     */
    override fun stackTrace(): Boolean? = unwrap(this).getStackTrace()

    /**
     * Type that this token is expected to evaluate to.
     *
     * Default: ResolutionTypeHint.STRING
     */
    override fun typeHint(): ResolutionTypeHint? =
        unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IntrinsicProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IntrinsicProps): IntrinsicProps =
        CdkObjectWrappers.wrap(cdkObject) as? IntrinsicProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntrinsicProps): software.amazon.awscdk.IntrinsicProps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.IntrinsicProps
  }
}

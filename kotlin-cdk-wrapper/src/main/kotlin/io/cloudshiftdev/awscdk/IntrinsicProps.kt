@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface IntrinsicProps {
  public fun stackTrace(): Boolean? = unwrap(this).getStackTrace()

  public fun typeHint(): ResolutionTypeHint? =
      unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun stackTrace(stackTrace: Boolean)

    public fun typeHint(typeHint: ResolutionTypeHint)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.IntrinsicProps.Builder =
        software.amazon.awscdk.IntrinsicProps.builder()

    override fun stackTrace(stackTrace: Boolean) {
      cdkBuilder.stackTrace(stackTrace)
    }

    override fun typeHint(typeHint: ResolutionTypeHint) {
      cdkBuilder.typeHint(typeHint.let(ResolutionTypeHint::unwrap))
    }

    public fun build(): software.amazon.awscdk.IntrinsicProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IntrinsicProps,
  ) : CdkObject(cdkObject), IntrinsicProps {
    override fun stackTrace(): Boolean? = unwrap(this).getStackTrace()

    override fun typeHint(): ResolutionTypeHint? =
        unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IntrinsicProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IntrinsicProps): IntrinsicProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntrinsicProps): software.amazon.awscdk.IntrinsicProps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.IntrinsicProps
  }
}

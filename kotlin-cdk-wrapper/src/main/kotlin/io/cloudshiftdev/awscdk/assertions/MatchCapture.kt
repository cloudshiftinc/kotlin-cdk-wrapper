@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit

public interface MatchCapture {
  public fun capture(): Capture

  public fun `value`(): Any

  @CdkDslMarker
  public interface Builder {
    public fun capture(capture: Capture)

    public fun `value`(`value`: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.assertions.MatchCapture.Builder =
        software.amazon.awscdk.assertions.MatchCapture.builder()

    override fun capture(capture: Capture) {
      cdkBuilder.capture(capture.let(Capture::unwrap))
    }

    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.assertions.MatchCapture = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.assertions.MatchCapture,
  ) : CdkObject(cdkObject), MatchCapture {
    override fun capture(): Capture = unwrap(this).getCapture().let(Capture::wrap)

    override fun `value`(): Any = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MatchCapture {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.MatchCapture): MatchCapture =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MatchCapture): software.amazon.awscdk.assertions.MatchCapture =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.assertions.MatchCapture
  }
}

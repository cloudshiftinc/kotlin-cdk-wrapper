@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface WaitProps {
  public fun comment(): String? = unwrap(this).getComment()

  public fun stateName(): String? = unwrap(this).getStateName()

  public fun time(): WaitTime

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun stateName(stateName: String)

    public fun time(time: WaitTime)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.WaitProps.Builder =
        software.amazon.awscdk.services.stepfunctions.WaitProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun time(time: WaitTime) {
      cdkBuilder.time(time.let(WaitTime::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.WaitProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.WaitProps,
  ) : CdkObject(cdkObject), WaitProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun time(): WaitTime = unwrap(this).getTime().let(WaitTime::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WaitProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.WaitProps): WaitProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WaitProps): software.amazon.awscdk.services.stepfunctions.WaitProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.WaitProps
  }
}

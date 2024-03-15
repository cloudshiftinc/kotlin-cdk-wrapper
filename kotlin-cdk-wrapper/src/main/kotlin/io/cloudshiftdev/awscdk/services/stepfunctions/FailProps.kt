@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface FailProps {
  public fun cause(): String? = unwrap(this).getCause()

  public fun causePath(): String? = unwrap(this).getCausePath()

  public fun comment(): String? = unwrap(this).getComment()

  public fun error(): String? = unwrap(this).getError()

  public fun errorPath(): String? = unwrap(this).getErrorPath()

  public fun stateName(): String? = unwrap(this).getStateName()

  @CdkDslMarker
  public interface Builder {
    public fun cause(cause: String)

    public fun causePath(causePath: String)

    public fun comment(comment: String)

    public fun error(error: String)

    public fun errorPath(errorPath: String)

    public fun stateName(stateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.FailProps.Builder =
        software.amazon.awscdk.services.stepfunctions.FailProps.builder()

    override fun cause(cause: String) {
      cdkBuilder.cause(cause)
    }

    override fun causePath(causePath: String) {
      cdkBuilder.causePath(causePath)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun error(error: String) {
      cdkBuilder.error(error)
    }

    override fun errorPath(errorPath: String) {
      cdkBuilder.errorPath(errorPath)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.FailProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.FailProps,
  ) : CdkObject(cdkObject), FailProps {
    override fun cause(): String? = unwrap(this).getCause()

    override fun causePath(): String? = unwrap(this).getCausePath()

    override fun comment(): String? = unwrap(this).getComment()

    override fun error(): String? = unwrap(this).getError()

    override fun errorPath(): String? = unwrap(this).getErrorPath()

    override fun stateName(): String? = unwrap(this).getStateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FailProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.FailProps): FailProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FailProps): software.amazon.awscdk.services.stepfunctions.FailProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.FailProps
  }
}

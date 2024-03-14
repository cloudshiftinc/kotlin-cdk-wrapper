package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface WaitProps {
  /**
   * An optional description for this state.
   *
   * Default: No comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * Optional name for this state.
   *
   * Default: - The construct ID will be used as state name
   */
  public fun stateName(): String? = unwrap(this).getStateName()

  /**
   * Wait duration.
   */
  public fun time(): WaitTime

  /**
   * A builder for [WaitProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment An optional description for this state.
     */
    public fun comment(comment: String)

    /**
     * @param stateName Optional name for this state.
     */
    public fun stateName(stateName: String)

    /**
     * @param time Wait duration. 
     */
    public fun time(time: WaitTime)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.WaitProps.Builder =
        software.amazon.awscdk.services.stepfunctions.WaitProps.builder()

    /**
     * @param comment An optional description for this state.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param stateName Optional name for this state.
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * @param time Wait duration. 
     */
    override fun time(time: WaitTime) {
      cdkBuilder.time(time.let(WaitTime::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.WaitProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.WaitProps,
  ) : CdkObject(cdkObject), WaitProps {
    /**
     * An optional description for this state.
     *
     * Default: No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     */
    override fun stateName(): String? = unwrap(this).getStateName()

    /**
     * Wait duration.
     */
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

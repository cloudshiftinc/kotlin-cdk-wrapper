@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

/**
 * Construction properties for a stop action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.actions.*;
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Topic topic;
 * StopProps stopProps = StopProps.builder()
 * .topic(topic)
 * .build();
 * ```
 */
public interface StopProps {
  /**
   * The SNS topic to notify when the stop action is taken.
   */
  public fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  /**
   * A builder for [StopProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param topic The SNS topic to notify when the stop action is taken.
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.StopProps.Builder =
        software.amazon.awscdk.services.ses.actions.StopProps.builder()

    /**
     * @param topic The SNS topic to notify when the stop action is taken.
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.StopProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.actions.StopProps,
  ) : CdkObject(cdkObject), StopProps {
    /**
     * The SNS topic to notify when the stop action is taken.
     */
    override fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StopProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.StopProps): StopProps =
        CdkObjectWrappers.wrap(cdkObject) as? StopProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StopProps): software.amazon.awscdk.services.ses.actions.StopProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.actions.StopProps
  }
}

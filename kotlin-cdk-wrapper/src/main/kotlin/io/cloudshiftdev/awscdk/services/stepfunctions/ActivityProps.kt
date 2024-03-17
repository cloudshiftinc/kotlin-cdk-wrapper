@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a new Step Functions Activity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * ActivityProps activityProps = ActivityProps.builder()
 * .activityName("activityName")
 * .build();
 * ```
 */
public interface ActivityProps {
  /**
   * The name for this activity.
   *
   * Default: - If not supplied, a name is generated
   */
  public fun activityName(): String? = unwrap(this).getActivityName()

  /**
   * A builder for [ActivityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param activityName The name for this activity.
     */
    public fun activityName(activityName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ActivityProps.Builder =
        software.amazon.awscdk.services.stepfunctions.ActivityProps.builder()

    /**
     * @param activityName The name for this activity.
     */
    override fun activityName(activityName: String) {
      cdkBuilder.activityName(activityName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ActivityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.ActivityProps,
  ) : CdkObject(cdkObject), ActivityProps {
    /**
     * The name for this activity.
     *
     * Default: - If not supplied, a name is generated
     */
    override fun activityName(): String? = unwrap(this).getActivityName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ActivityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ActivityProps):
        ActivityProps = CdkObjectWrappers.wrap(cdkObject) as? ActivityProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ActivityProps):
        software.amazon.awscdk.services.stepfunctions.ActivityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ActivityProps
  }
}

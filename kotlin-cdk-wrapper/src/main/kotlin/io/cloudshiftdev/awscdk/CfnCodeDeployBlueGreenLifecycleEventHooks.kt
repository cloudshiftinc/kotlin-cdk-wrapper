@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Lifecycle events for blue-green deployments.
 *
 * The type of the `CfnCodeDeployBlueGreenHookProps.lifecycleEventHooks` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnCodeDeployBlueGreenLifecycleEventHooks cfnCodeDeployBlueGreenLifecycleEventHooks =
 * CfnCodeDeployBlueGreenLifecycleEventHooks.builder()
 * .afterAllowTestTraffic("afterAllowTestTraffic")
 * .afterAllowTraffic("afterAllowTraffic")
 * .afterInstall("afterInstall")
 * .beforeAllowTraffic("beforeAllowTraffic")
 * .beforeInstall("beforeInstall")
 * .build();
 * ```
 */
public interface CfnCodeDeployBlueGreenLifecycleEventHooks {
  /**
   * Function to use to run tasks after the test listener serves traffic to the replacement task
   * set.
   *
   * Default: - none
   */
  public fun afterAllowTestTraffic(): String? = unwrap(this).getAfterAllowTestTraffic()

  /**
   * Function to use to run tasks after the second target group serves traffic to the replacement
   * task set.
   *
   * Default: - none
   */
  public fun afterAllowTraffic(): String? = unwrap(this).getAfterAllowTraffic()

  /**
   * Function to use to run tasks after the replacement task set is created and one of the target
   * groups is associated with it.
   *
   * Default: - none
   */
  public fun afterInstall(): String? = unwrap(this).getAfterInstall()

  /**
   * Function to use to run tasks after the second target group is associated with the replacement
   * task set, but before traffic is shifted to the replacement task set.
   *
   * Default: - none
   */
  public fun beforeAllowTraffic(): String? = unwrap(this).getBeforeAllowTraffic()

  /**
   * Function to use to run tasks before the replacement task set is created.
   *
   * Default: - none
   */
  public fun beforeInstall(): String? = unwrap(this).getBeforeInstall()

  /**
   * A builder for [CfnCodeDeployBlueGreenLifecycleEventHooks]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param afterAllowTestTraffic Function to use to run tasks after the test listener serves
     * traffic to the replacement task set.
     */
    public fun afterAllowTestTraffic(afterAllowTestTraffic: String)

    /**
     * @param afterAllowTraffic Function to use to run tasks after the second target group serves
     * traffic to the replacement task set.
     */
    public fun afterAllowTraffic(afterAllowTraffic: String)

    /**
     * @param afterInstall Function to use to run tasks after the replacement task set is created
     * and one of the target groups is associated with it.
     */
    public fun afterInstall(afterInstall: String)

    /**
     * @param beforeAllowTraffic Function to use to run tasks after the second target group is
     * associated with the replacement task set, but before traffic is shifted to the replacement task
     * set.
     */
    public fun beforeAllowTraffic(beforeAllowTraffic: String)

    /**
     * @param beforeInstall Function to use to run tasks before the replacement task set is created.
     */
    public fun beforeInstall(beforeInstall: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks.Builder
        = software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks.builder()

    /**
     * @param afterAllowTestTraffic Function to use to run tasks after the test listener serves
     * traffic to the replacement task set.
     */
    override fun afterAllowTestTraffic(afterAllowTestTraffic: String) {
      cdkBuilder.afterAllowTestTraffic(afterAllowTestTraffic)
    }

    /**
     * @param afterAllowTraffic Function to use to run tasks after the second target group serves
     * traffic to the replacement task set.
     */
    override fun afterAllowTraffic(afterAllowTraffic: String) {
      cdkBuilder.afterAllowTraffic(afterAllowTraffic)
    }

    /**
     * @param afterInstall Function to use to run tasks after the replacement task set is created
     * and one of the target groups is associated with it.
     */
    override fun afterInstall(afterInstall: String) {
      cdkBuilder.afterInstall(afterInstall)
    }

    /**
     * @param beforeAllowTraffic Function to use to run tasks after the second target group is
     * associated with the replacement task set, but before traffic is shifted to the replacement task
     * set.
     */
    override fun beforeAllowTraffic(beforeAllowTraffic: String) {
      cdkBuilder.beforeAllowTraffic(beforeAllowTraffic)
    }

    /**
     * @param beforeInstall Function to use to run tasks before the replacement task set is created.
     */
    override fun beforeInstall(beforeInstall: String) {
      cdkBuilder.beforeInstall(beforeInstall)
    }

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks,
  ) : CdkObject(cdkObject), CfnCodeDeployBlueGreenLifecycleEventHooks {
    /**
     * Function to use to run tasks after the test listener serves traffic to the replacement task
     * set.
     *
     * Default: - none
     */
    override fun afterAllowTestTraffic(): String? = unwrap(this).getAfterAllowTestTraffic()

    /**
     * Function to use to run tasks after the second target group serves traffic to the replacement
     * task set.
     *
     * Default: - none
     */
    override fun afterAllowTraffic(): String? = unwrap(this).getAfterAllowTraffic()

    /**
     * Function to use to run tasks after the replacement task set is created and one of the target
     * groups is associated with it.
     *
     * Default: - none
     */
    override fun afterInstall(): String? = unwrap(this).getAfterInstall()

    /**
     * Function to use to run tasks after the second target group is associated with the replacement
     * task set, but before traffic is shifted to the replacement task set.
     *
     * Default: - none
     */
    override fun beforeAllowTraffic(): String? = unwrap(this).getBeforeAllowTraffic()

    /**
     * Function to use to run tasks before the replacement task set is created.
     *
     * Default: - none
     */
    override fun beforeInstall(): String? = unwrap(this).getBeforeInstall()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCodeDeployBlueGreenLifecycleEventHooks {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks):
        CfnCodeDeployBlueGreenLifecycleEventHooks = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenLifecycleEventHooks):
        software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Associate the CreationPolicy attribute with a resource to prevent its status from reaching create
 * complete until AWS CloudFormation receives a specified number of success signals or the timeout
 * period is exceeded.
 *
 * To signal a
 * resource, you can use the cfn-signal helper script or SignalResource API. AWS CloudFormation
 * publishes valid signals
 * to the stack events so that you track the number of signals sent.
 *
 * The creation policy is invoked only when AWS CloudFormation creates the associated resource.
 * Currently, the only
 * AWS CloudFormation resources that support creation policies are
 * AWS::AutoScaling::AutoScalingGroup, AWS::EC2::Instance,
 * AWS::CloudFormation::WaitCondition and AWS::AppStream::Fleet.
 *
 * Use the CreationPolicy attribute when you want to wait on resource configuration actions before
 * stack creation proceeds.
 * For example, if you install and configure software applications on an EC2 instance, you might
 * want those applications to
 * be running before proceeding. In such cases, you can add a CreationPolicy attribute to the
 * instance, and then send a success
 * signal to the instance after the applications are installed and configured. For a detailed
 * example, see Deploying Applications
 * on Amazon EC2 with AWS CloudFormation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnCreationPolicy cfnCreationPolicy = CfnCreationPolicy.builder()
 * .autoScalingCreationPolicy(CfnResourceAutoScalingCreationPolicy.builder()
 * .minSuccessfulInstancesPercent(123)
 * .build())
 * .resourceSignal(CfnResourceSignal.builder()
 * .count(123)
 * .timeout("timeout")
 * .build())
 * .startFleet(false)
 * .build();
 * ```
 */
public interface CfnCreationPolicy {
  /**
   * For an Auto Scaling group replacement update, specifies how many instances must signal success
   * for the update to succeed.
   */
  public fun autoScalingCreationPolicy(): CfnResourceAutoScalingCreationPolicy? =
      unwrap(this).getAutoScalingCreationPolicy()?.let(CfnResourceAutoScalingCreationPolicy::wrap)

  /**
   * When AWS CloudFormation creates the associated resource, configures the number of required
   * success signals and the length of time that AWS CloudFormation waits for those signals.
   */
  public fun resourceSignal(): CfnResourceSignal? =
      unwrap(this).getResourceSignal()?.let(CfnResourceSignal::wrap)

  /**
   * For an AppStream Fleet creation, specifies that the fleet is started after creation.
   */
  public fun startFleet(): Boolean? = unwrap(this).getStartFleet()

  /**
   * A builder for [CfnCreationPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingCreationPolicy For an Auto Scaling group replacement update, specifies how
     * many instances must signal success for the update to succeed.
     */
    public
        fun autoScalingCreationPolicy(autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy)

    /**
     * @param autoScalingCreationPolicy For an Auto Scaling group replacement update, specifies how
     * many instances must signal success for the update to succeed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4add8616539c69239c0783c9278278081595b1ad9633d76522b1be1545be2e2c")
    public
        fun autoScalingCreationPolicy(autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy.Builder.() -> Unit)

    /**
     * @param resourceSignal When AWS CloudFormation creates the associated resource, configures the
     * number of required success signals and the length of time that AWS CloudFormation waits for
     * those signals.
     */
    public fun resourceSignal(resourceSignal: CfnResourceSignal)

    /**
     * @param resourceSignal When AWS CloudFormation creates the associated resource, configures the
     * number of required success signals and the length of time that AWS CloudFormation waits for
     * those signals.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("413cf468f1ed163d6fc53c57ce4ebee9f545d2b69a4fbdaaaef4058e7d8b2373")
    public fun resourceSignal(resourceSignal: CfnResourceSignal.Builder.() -> Unit)

    /**
     * @param startFleet For an AppStream Fleet creation, specifies that the fleet is started after
     * creation.
     */
    public fun startFleet(startFleet: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCreationPolicy.Builder =
        software.amazon.awscdk.CfnCreationPolicy.builder()

    /**
     * @param autoScalingCreationPolicy For an Auto Scaling group replacement update, specifies how
     * many instances must signal success for the update to succeed.
     */
    override
        fun autoScalingCreationPolicy(autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy) {
      cdkBuilder.autoScalingCreationPolicy(autoScalingCreationPolicy.let(CfnResourceAutoScalingCreationPolicy::unwrap))
    }

    /**
     * @param autoScalingCreationPolicy For an Auto Scaling group replacement update, specifies how
     * many instances must signal success for the update to succeed.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4add8616539c69239c0783c9278278081595b1ad9633d76522b1be1545be2e2c")
    override
        fun autoScalingCreationPolicy(autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy.Builder.() -> Unit):
        Unit =
        autoScalingCreationPolicy(CfnResourceAutoScalingCreationPolicy(autoScalingCreationPolicy))

    /**
     * @param resourceSignal When AWS CloudFormation creates the associated resource, configures the
     * number of required success signals and the length of time that AWS CloudFormation waits for
     * those signals.
     */
    override fun resourceSignal(resourceSignal: CfnResourceSignal) {
      cdkBuilder.resourceSignal(resourceSignal.let(CfnResourceSignal::unwrap))
    }

    /**
     * @param resourceSignal When AWS CloudFormation creates the associated resource, configures the
     * number of required success signals and the length of time that AWS CloudFormation waits for
     * those signals.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("413cf468f1ed163d6fc53c57ce4ebee9f545d2b69a4fbdaaaef4058e7d8b2373")
    override fun resourceSignal(resourceSignal: CfnResourceSignal.Builder.() -> Unit): Unit =
        resourceSignal(CfnResourceSignal(resourceSignal))

    /**
     * @param startFleet For an AppStream Fleet creation, specifies that the fleet is started after
     * creation.
     */
    override fun startFleet(startFleet: Boolean) {
      cdkBuilder.startFleet(startFleet)
    }

    public fun build(): software.amazon.awscdk.CfnCreationPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnCreationPolicy,
  ) : CdkObject(cdkObject), CfnCreationPolicy {
    /**
     * For an Auto Scaling group replacement update, specifies how many instances must signal
     * success for the update to succeed.
     */
    override fun autoScalingCreationPolicy(): CfnResourceAutoScalingCreationPolicy? =
        unwrap(this).getAutoScalingCreationPolicy()?.let(CfnResourceAutoScalingCreationPolicy::wrap)

    /**
     * When AWS CloudFormation creates the associated resource, configures the number of required
     * success signals and the length of time that AWS CloudFormation waits for those signals.
     */
    override fun resourceSignal(): CfnResourceSignal? =
        unwrap(this).getResourceSignal()?.let(CfnResourceSignal::wrap)

    /**
     * For an AppStream Fleet creation, specifies that the fleet is started after creation.
     */
    override fun startFleet(): Boolean? = unwrap(this).getStartFleet()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCreationPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCreationPolicy): CfnCreationPolicy =
        CdkObjectWrappers.wrap(cdkObject) as? CfnCreationPolicy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCreationPolicy): software.amazon.awscdk.CfnCreationPolicy =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnCreationPolicy
  }
}

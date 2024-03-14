package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnCreationPolicy,
  ) : CfnCreationPolicy {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCreationPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCreationPolicy): CfnCreationPolicy =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCreationPolicy): software.amazon.awscdk.CfnCreationPolicy =
        (wrapped as Wrapper).cdkObject
  }
}

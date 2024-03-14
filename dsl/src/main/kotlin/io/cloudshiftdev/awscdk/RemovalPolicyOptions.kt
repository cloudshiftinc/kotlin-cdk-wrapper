package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface RemovalPolicyOptions {
  /**
   * Apply the same deletion policy to the resource's "UpdateReplacePolicy".
   *
   * Default: true
   */
  public fun applyToUpdateReplacePolicy(): Boolean? = unwrap(this).getApplyToUpdateReplacePolicy()

  /**
   * The default policy to apply in case the removal policy is not defined.
   *
   * Default: - Default value is resource specific. To determine the default value for a resource,
   * please consult that specific resource's documentation.
   */
  public fun defaultValue(): RemovalPolicy? =
      unwrap(this).getDefaultValue()?.let(RemovalPolicy::wrap)

  /**
   * A builder for [RemovalPolicyOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applyToUpdateReplacePolicy Apply the same deletion policy to the resource's
     * "UpdateReplacePolicy".
     */
    public fun applyToUpdateReplacePolicy(applyToUpdateReplacePolicy: Boolean)

    /**
     * @param defaultValue The default policy to apply in case the removal policy is not defined.
     */
    public fun defaultValue(defaultValue: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.RemovalPolicyOptions.Builder =
        software.amazon.awscdk.RemovalPolicyOptions.builder()

    /**
     * @param applyToUpdateReplacePolicy Apply the same deletion policy to the resource's
     * "UpdateReplacePolicy".
     */
    override fun applyToUpdateReplacePolicy(applyToUpdateReplacePolicy: Boolean) {
      cdkBuilder.applyToUpdateReplacePolicy(applyToUpdateReplacePolicy)
    }

    /**
     * @param defaultValue The default policy to apply in case the removal policy is not defined.
     */
    override fun defaultValue(defaultValue: RemovalPolicy) {
      cdkBuilder.defaultValue(defaultValue.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.RemovalPolicyOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.RemovalPolicyOptions,
  ) : RemovalPolicyOptions {
    /**
     * Apply the same deletion policy to the resource's "UpdateReplacePolicy".
     *
     * Default: true
     */
    override fun applyToUpdateReplacePolicy(): Boolean? =
        unwrap(this).getApplyToUpdateReplacePolicy()

    /**
     * The default policy to apply in case the removal policy is not defined.
     *
     * Default: - Default value is resource specific. To determine the default value for a resource,
     * please consult that specific resource's documentation.
     */
    override fun defaultValue(): RemovalPolicy? =
        unwrap(this).getDefaultValue()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RemovalPolicyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.RemovalPolicyOptions): RemovalPolicyOptions
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RemovalPolicyOptions): software.amazon.awscdk.RemovalPolicyOptions
        = (wrapped as Wrapper).cdkObject
  }
}

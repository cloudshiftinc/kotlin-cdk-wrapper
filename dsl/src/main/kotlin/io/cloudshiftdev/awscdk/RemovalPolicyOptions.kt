package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.Unit

public interface RemovalPolicyOptions {
  public fun applyToUpdateReplacePolicy(): Boolean? = unwrap(this).getApplyToUpdateReplacePolicy()

  public fun defaultValue(): RemovalPolicy? =
      unwrap(this).getDefaultValue()?.let(RemovalPolicy::wrap)

  public interface Builder {
    public fun applyToUpdateReplacePolicy(applyToUpdateReplacePolicy: Boolean) {
    }

    public fun defaultValue(defaultValue: RemovalPolicy) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.RemovalPolicyOptions.Builder =
        software.amazon.awscdk.RemovalPolicyOptions.builder()

    public override fun applyToUpdateReplacePolicy(applyToUpdateReplacePolicy: Boolean) {
      cdkBuilder.applyToUpdateReplacePolicy(applyToUpdateReplacePolicy)
    }

    public override fun defaultValue(defaultValue: RemovalPolicy) {
      cdkBuilder.defaultValue(defaultValue.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.RemovalPolicyOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.RemovalPolicyOptions,
  ) : RemovalPolicyOptions {
    public override fun applyToUpdateReplacePolicy(): Boolean? =
        unwrap(this).getApplyToUpdateReplacePolicy()

    public override fun defaultValue(): RemovalPolicy? =
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

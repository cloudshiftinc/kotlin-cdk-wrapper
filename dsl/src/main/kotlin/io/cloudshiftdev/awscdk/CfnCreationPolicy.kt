package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnCreationPolicy {
  public fun autoScalingCreationPolicy(): CfnResourceAutoScalingCreationPolicy? =
      unwrap(this).getAutoScalingCreationPolicy()?.let(CfnResourceAutoScalingCreationPolicy::wrap)

  public fun resourceSignal(): CfnResourceSignal? =
      unwrap(this).getResourceSignal()?.let(CfnResourceSignal::wrap)

  public fun startFleet(): Boolean? = unwrap(this).getStartFleet()

  public interface Builder {
    public
        fun autoScalingCreationPolicy(autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4add8616539c69239c0783c9278278081595b1ad9633d76522b1be1545be2e2c")
    public
        fun autoScalingCreationPolicy(autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy.Builder.() -> Unit) {
    }

    public fun resourceSignal(resourceSignal: CfnResourceSignal) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("413cf468f1ed163d6fc53c57ce4ebee9f545d2b69a4fbdaaaef4058e7d8b2373")
    public fun resourceSignal(resourceSignal: CfnResourceSignal.Builder.() -> Unit) {
    }

    public fun startFleet(startFleet: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCreationPolicy.Builder =
        software.amazon.awscdk.CfnCreationPolicy.builder()

    public override
        fun autoScalingCreationPolicy(autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy) {
      cdkBuilder.autoScalingCreationPolicy(autoScalingCreationPolicy.let(CfnResourceAutoScalingCreationPolicy::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4add8616539c69239c0783c9278278081595b1ad9633d76522b1be1545be2e2c")
    public override
        fun autoScalingCreationPolicy(autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy.Builder.() -> Unit):
        Unit =
        autoScalingCreationPolicy(CfnResourceAutoScalingCreationPolicy(autoScalingCreationPolicy))

    public override fun resourceSignal(resourceSignal: CfnResourceSignal) {
      cdkBuilder.resourceSignal(resourceSignal.let(CfnResourceSignal::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("413cf468f1ed163d6fc53c57ce4ebee9f545d2b69a4fbdaaaef4058e7d8b2373")
    public override fun resourceSignal(resourceSignal: CfnResourceSignal.Builder.() -> Unit): Unit =
        resourceSignal(CfnResourceSignal(resourceSignal))

    public override fun startFleet(startFleet: Boolean) {
      cdkBuilder.startFleet(startFleet)
    }

    public fun build(): software.amazon.awscdk.CfnCreationPolicy = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnCreationPolicy,
  ) : CfnCreationPolicy {
    public override fun autoScalingCreationPolicy(): CfnResourceAutoScalingCreationPolicy? =
        unwrap(this).getAutoScalingCreationPolicy()?.let(CfnResourceAutoScalingCreationPolicy::wrap)

    public override fun resourceSignal(): CfnResourceSignal? =
        unwrap(this).getResourceSignal()?.let(CfnResourceSignal::wrap)

    public override fun startFleet(): Boolean? = unwrap(this).getStartFleet()
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

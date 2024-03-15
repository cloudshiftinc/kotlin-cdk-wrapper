@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnCodeDeployBlueGreenApplication {
  public fun ecsAttributes(): CfnCodeDeployBlueGreenEcsAttributes

  public fun target(): CfnCodeDeployBlueGreenApplicationTarget

  @CdkDslMarker
  public interface Builder {
    public fun ecsAttributes(ecsAttributes: CfnCodeDeployBlueGreenEcsAttributes)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2949b093137affa82667f7aadd73d2a3f9a659a80e8ce0a5773e3a9520660c1a")
    public fun ecsAttributes(ecsAttributes: CfnCodeDeployBlueGreenEcsAttributes.Builder.() -> Unit)

    public fun target(target: CfnCodeDeployBlueGreenApplicationTarget)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a6b144a7caab90d92ab5814297f2d3e984915d397737fb5bcc194546504c0df")
    public fun target(target: CfnCodeDeployBlueGreenApplicationTarget.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenApplication.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenApplication.builder()

    override fun ecsAttributes(ecsAttributes: CfnCodeDeployBlueGreenEcsAttributes) {
      cdkBuilder.ecsAttributes(ecsAttributes.let(CfnCodeDeployBlueGreenEcsAttributes::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2949b093137affa82667f7aadd73d2a3f9a659a80e8ce0a5773e3a9520660c1a")
    override
        fun ecsAttributes(ecsAttributes: CfnCodeDeployBlueGreenEcsAttributes.Builder.() -> Unit):
        Unit = ecsAttributes(CfnCodeDeployBlueGreenEcsAttributes(ecsAttributes))

    override fun target(target: CfnCodeDeployBlueGreenApplicationTarget) {
      cdkBuilder.target(target.let(CfnCodeDeployBlueGreenApplicationTarget::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a6b144a7caab90d92ab5814297f2d3e984915d397737fb5bcc194546504c0df")
    override fun target(target: CfnCodeDeployBlueGreenApplicationTarget.Builder.() -> Unit): Unit =
        target(CfnCodeDeployBlueGreenApplicationTarget(target))

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenApplication =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenApplication,
  ) : CdkObject(cdkObject), CfnCodeDeployBlueGreenApplication {
    override fun ecsAttributes(): CfnCodeDeployBlueGreenEcsAttributes =
        unwrap(this).getEcsAttributes().let(CfnCodeDeployBlueGreenEcsAttributes::wrap)

    override fun target(): CfnCodeDeployBlueGreenApplicationTarget =
        unwrap(this).getTarget().let(CfnCodeDeployBlueGreenApplicationTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCodeDeployBlueGreenApplication {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenApplication):
        CfnCodeDeployBlueGreenApplication = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenApplication):
        software.amazon.awscdk.CfnCodeDeployBlueGreenApplication = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.CfnCodeDeployBlueGreenApplication
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnCodeDeployBlueGreenLifecycleEventHooks {
  public fun afterAllowTestTraffic(): String? = unwrap(this).getAfterAllowTestTraffic()

  public fun afterAllowTraffic(): String? = unwrap(this).getAfterAllowTraffic()

  public fun afterInstall(): String? = unwrap(this).getAfterInstall()

  public fun beforeAllowTraffic(): String? = unwrap(this).getBeforeAllowTraffic()

  public fun beforeInstall(): String? = unwrap(this).getBeforeInstall()

  @CdkDslMarker
  public interface Builder {
    public fun afterAllowTestTraffic(afterAllowTestTraffic: String)

    public fun afterAllowTraffic(afterAllowTraffic: String)

    public fun afterInstall(afterInstall: String)

    public fun beforeAllowTraffic(beforeAllowTraffic: String)

    public fun beforeInstall(beforeInstall: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks.Builder
        = software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks.builder()

    override fun afterAllowTestTraffic(afterAllowTestTraffic: String) {
      cdkBuilder.afterAllowTestTraffic(afterAllowTestTraffic)
    }

    override fun afterAllowTraffic(afterAllowTraffic: String) {
      cdkBuilder.afterAllowTraffic(afterAllowTraffic)
    }

    override fun afterInstall(afterInstall: String) {
      cdkBuilder.afterInstall(afterInstall)
    }

    override fun beforeAllowTraffic(beforeAllowTraffic: String) {
      cdkBuilder.beforeAllowTraffic(beforeAllowTraffic)
    }

    override fun beforeInstall(beforeInstall: String) {
      cdkBuilder.beforeInstall(beforeInstall)
    }

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks,
  ) : CdkObject(cdkObject), CfnCodeDeployBlueGreenLifecycleEventHooks {
    override fun afterAllowTestTraffic(): String? = unwrap(this).getAfterAllowTestTraffic()

    override fun afterAllowTraffic(): String? = unwrap(this).getAfterAllowTraffic()

    override fun afterInstall(): String? = unwrap(this).getAfterInstall()

    override fun beforeAllowTraffic(): String? = unwrap(this).getBeforeAllowTraffic()

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

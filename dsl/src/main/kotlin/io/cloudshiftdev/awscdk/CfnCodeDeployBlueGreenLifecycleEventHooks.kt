package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface CfnCodeDeployBlueGreenLifecycleEventHooks {
  public fun afterAllowTestTraffic(): String? = unwrap(this).getAfterAllowTestTraffic()

  public fun afterAllowTraffic(): String? = unwrap(this).getAfterAllowTraffic()

  public fun afterInstall(): String? = unwrap(this).getAfterInstall()

  public fun beforeAllowTraffic(): String? = unwrap(this).getBeforeAllowTraffic()

  public fun beforeInstall(): String? = unwrap(this).getBeforeInstall()

  public interface Builder {
    public fun afterAllowTestTraffic(afterAllowTestTraffic: String) {
    }

    public fun afterAllowTraffic(afterAllowTraffic: String) {
    }

    public fun afterInstall(afterInstall: String) {
    }

    public fun beforeAllowTraffic(beforeAllowTraffic: String) {
    }

    public fun beforeInstall(beforeInstall: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks.Builder
        = software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks.builder()

    public override fun afterAllowTestTraffic(afterAllowTestTraffic: String) {
      cdkBuilder.afterAllowTestTraffic(afterAllowTestTraffic)
    }

    public override fun afterAllowTraffic(afterAllowTraffic: String) {
      cdkBuilder.afterAllowTraffic(afterAllowTraffic)
    }

    public override fun afterInstall(afterInstall: String) {
      cdkBuilder.afterInstall(afterInstall)
    }

    public override fun beforeAllowTraffic(beforeAllowTraffic: String) {
      cdkBuilder.beforeAllowTraffic(beforeAllowTraffic)
    }

    public override fun beforeInstall(beforeInstall: String) {
      cdkBuilder.beforeInstall(beforeInstall)
    }

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks,
  ) : CfnCodeDeployBlueGreenLifecycleEventHooks {
    public override fun afterAllowTestTraffic(): String? = unwrap(this).getAfterAllowTestTraffic()

    public override fun afterAllowTraffic(): String? = unwrap(this).getAfterAllowTraffic()

    public override fun afterInstall(): String? = unwrap(this).getAfterInstall()

    public override fun beforeAllowTraffic(): String? = unwrap(this).getBeforeAllowTraffic()

    public override fun beforeInstall(): String? = unwrap(this).getBeforeInstall()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCodeDeployBlueGreenLifecycleEventHooks {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks):
        CfnCodeDeployBlueGreenLifecycleEventHooks = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenLifecycleEventHooks):
        software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks = (wrapped as
        Wrapper).cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCodeDeployBlueGreenHookProps {
  public fun additionalOptions(): CfnCodeDeployBlueGreenAdditionalOptions? =
      unwrap(this).getAdditionalOptions()?.let(CfnCodeDeployBlueGreenAdditionalOptions::wrap)

  public fun applications(): List<CfnCodeDeployBlueGreenApplication>

  public fun lifecycleEventHooks(): CfnCodeDeployBlueGreenLifecycleEventHooks? =
      unwrap(this).getLifecycleEventHooks()?.let(CfnCodeDeployBlueGreenLifecycleEventHooks::wrap)

  public fun serviceRole(): String

  public fun trafficRoutingConfig(): CfnTrafficRoutingConfig? =
      unwrap(this).getTrafficRoutingConfig()?.let(CfnTrafficRoutingConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a7313e2337dbd9bacd0d044add4afffdee0ea9620d1424dbc3c0a272adfd693")
    public
        fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions.Builder.() -> Unit)

    public fun applications(applications: List<CfnCodeDeployBlueGreenApplication>)

    public fun applications(vararg applications: CfnCodeDeployBlueGreenApplication)

    public fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b88c7821b7a74fa6b15da11ee9bc8a34a3824d0679a826156119da744b03403f")
    public
        fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks.Builder.() -> Unit)

    public fun serviceRole(serviceRole: String)

    public fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce22a9dcac098a4f5b940b21a387b71aa7c2916d0f3f6b3ea24b5329fffe3fe5")
    public
        fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps.builder()

    override fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions) {
      cdkBuilder.additionalOptions(additionalOptions.let(CfnCodeDeployBlueGreenAdditionalOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a7313e2337dbd9bacd0d044add4afffdee0ea9620d1424dbc3c0a272adfd693")
    override
        fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions.Builder.() -> Unit):
        Unit = additionalOptions(CfnCodeDeployBlueGreenAdditionalOptions(additionalOptions))

    override fun applications(applications: List<CfnCodeDeployBlueGreenApplication>) {
      cdkBuilder.applications(applications.map(CfnCodeDeployBlueGreenApplication::unwrap))
    }

    override fun applications(vararg applications: CfnCodeDeployBlueGreenApplication): Unit =
        applications(applications.toList())

    override
        fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks) {
      cdkBuilder.lifecycleEventHooks(lifecycleEventHooks.let(CfnCodeDeployBlueGreenLifecycleEventHooks::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b88c7821b7a74fa6b15da11ee9bc8a34a3824d0679a826156119da744b03403f")
    override
        fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks.Builder.() -> Unit):
        Unit = lifecycleEventHooks(CfnCodeDeployBlueGreenLifecycleEventHooks(lifecycleEventHooks))

    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    override fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig) {
      cdkBuilder.trafficRoutingConfig(trafficRoutingConfig.let(CfnTrafficRoutingConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce22a9dcac098a4f5b940b21a387b71aa7c2916d0f3f6b3ea24b5329fffe3fe5")
    override
        fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig.Builder.() -> Unit):
        Unit = trafficRoutingConfig(CfnTrafficRoutingConfig(trafficRoutingConfig))

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps,
  ) : CdkObject(cdkObject), CfnCodeDeployBlueGreenHookProps {
    override fun additionalOptions(): CfnCodeDeployBlueGreenAdditionalOptions? =
        unwrap(this).getAdditionalOptions()?.let(CfnCodeDeployBlueGreenAdditionalOptions::wrap)

    override fun applications(): List<CfnCodeDeployBlueGreenApplication> =
        unwrap(this).getApplications().map(CfnCodeDeployBlueGreenApplication::wrap)

    override fun lifecycleEventHooks(): CfnCodeDeployBlueGreenLifecycleEventHooks? =
        unwrap(this).getLifecycleEventHooks()?.let(CfnCodeDeployBlueGreenLifecycleEventHooks::wrap)

    override fun serviceRole(): String = unwrap(this).getServiceRole()

    override fun trafficRoutingConfig(): CfnTrafficRoutingConfig? =
        unwrap(this).getTrafficRoutingConfig()?.let(CfnTrafficRoutingConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCodeDeployBlueGreenHookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps):
        CfnCodeDeployBlueGreenHookProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenHookProps):
        software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps
  }
}

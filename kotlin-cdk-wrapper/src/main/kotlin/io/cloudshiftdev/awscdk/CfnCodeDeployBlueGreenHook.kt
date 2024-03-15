@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCodeDeployBlueGreenHook internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenHook,
) : CfnHook(cdkObject) {
  public open fun additionalOptions(): CfnCodeDeployBlueGreenAdditionalOptions? =
      unwrap(this).getAdditionalOptions()?.let(CfnCodeDeployBlueGreenAdditionalOptions::wrap)

  public open fun additionalOptions(`value`: CfnCodeDeployBlueGreenAdditionalOptions) {
    unwrap(this).setAdditionalOptions(`value`.let(CfnCodeDeployBlueGreenAdditionalOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51269bf776d795345066a2d1089e48ffdd80ff6456dcbb4f03ed70bf516a2d25")
  public open
      fun additionalOptions(`value`: CfnCodeDeployBlueGreenAdditionalOptions.Builder.() -> Unit):
      Unit = additionalOptions(CfnCodeDeployBlueGreenAdditionalOptions(`value`))

  public open fun applications(): List<CfnCodeDeployBlueGreenApplication> =
      unwrap(this).getApplications().map(CfnCodeDeployBlueGreenApplication::wrap)

  public open fun applications(`value`: List<CfnCodeDeployBlueGreenApplication>) {
    unwrap(this).setApplications(`value`.map(CfnCodeDeployBlueGreenApplication::unwrap))
  }

  public open fun applications(vararg `value`: CfnCodeDeployBlueGreenApplication): Unit =
      applications(`value`.toList())

  public open fun lifecycleEventHooks(): CfnCodeDeployBlueGreenLifecycleEventHooks? =
      unwrap(this).getLifecycleEventHooks()?.let(CfnCodeDeployBlueGreenLifecycleEventHooks::wrap)

  public open fun lifecycleEventHooks(`value`: CfnCodeDeployBlueGreenLifecycleEventHooks) {
    unwrap(this).setLifecycleEventHooks(`value`.let(CfnCodeDeployBlueGreenLifecycleEventHooks::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e09225660029a1b22f7ba904f5c6d9410a4da9e4e04d128b4b89fc3ba2d129a7")
  public open
      fun lifecycleEventHooks(`value`: CfnCodeDeployBlueGreenLifecycleEventHooks.Builder.() -> Unit):
      Unit = lifecycleEventHooks(CfnCodeDeployBlueGreenLifecycleEventHooks(`value`))

  public open fun serviceRole(): String = unwrap(this).getServiceRole()

  public open fun serviceRole(`value`: String) {
    unwrap(this).setServiceRole(`value`)
  }

  public open fun trafficRoutingConfig(): CfnTrafficRoutingConfig? =
      unwrap(this).getTrafficRoutingConfig()?.let(CfnTrafficRoutingConfig::wrap)

  public open fun trafficRoutingConfig(`value`: CfnTrafficRoutingConfig) {
    unwrap(this).setTrafficRoutingConfig(`value`.let(CfnTrafficRoutingConfig::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("317837bc71e11a366dde8d80b18e85dd22c3bb45d5f78683a8607315bfd85523")
  public open fun trafficRoutingConfig(`value`: CfnTrafficRoutingConfig.Builder.() -> Unit): Unit =
      trafficRoutingConfig(CfnTrafficRoutingConfig(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2942ee11ea6a57ebe0c2645198c9fb7a2b6814640b751575ce2816ffb3a970cd")
    public
        fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions.Builder.() -> Unit)

    public fun applications(applications: List<CfnCodeDeployBlueGreenApplication>)

    public fun applications(vararg applications: CfnCodeDeployBlueGreenApplication)

    public fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35bbc097d9e2b40b18625b08e25f624da081705f1612bef8803388ecfbcaffaf")
    public
        fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks.Builder.() -> Unit)

    public fun serviceRole(serviceRole: String)

    public fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b8b7a942d34f0b578b07c9f5b5b9cb941a8181809736d58b79a15c1dd7c0e61")
    public
        fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenHook.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenHook.Builder.create(scope, id)

    override fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions) {
      cdkBuilder.additionalOptions(additionalOptions.let(CfnCodeDeployBlueGreenAdditionalOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2942ee11ea6a57ebe0c2645198c9fb7a2b6814640b751575ce2816ffb3a970cd")
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
    @JvmName("35bbc097d9e2b40b18625b08e25f624da081705f1612bef8803388ecfbcaffaf")
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
    @JvmName("0b8b7a942d34f0b578b07c9f5b5b9cb941a8181809736d58b79a15c1dd7c0e61")
    override
        fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig.Builder.() -> Unit):
        Unit = trafficRoutingConfig(CfnTrafficRoutingConfig(trafficRoutingConfig))

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenHook = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCodeDeployBlueGreenHook {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCodeDeployBlueGreenHook(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenHook):
        CfnCodeDeployBlueGreenHook = CfnCodeDeployBlueGreenHook(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenHook):
        software.amazon.awscdk.CfnCodeDeployBlueGreenHook = wrapped.cdkObject
  }
}

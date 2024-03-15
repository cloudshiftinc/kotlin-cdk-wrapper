@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnHostedZoneProps {
  public fun hostedZoneConfig(): Any? = unwrap(this).getHostedZoneConfig()

  public fun hostedZoneTags(): List<CfnHostedZone.HostedZoneTagProperty> =
      unwrap(this).getHostedZoneTags()?.map(CfnHostedZone.HostedZoneTagProperty::wrap) ?:
      emptyList()

  public fun name(): String? = unwrap(this).getName()

  public fun queryLoggingConfig(): Any? = unwrap(this).getQueryLoggingConfig()

  public fun vpcs(): Any? = unwrap(this).getVpcs()

  @CdkDslMarker
  public interface Builder {
    public fun hostedZoneConfig(hostedZoneConfig: IResolvable)

    public fun hostedZoneConfig(hostedZoneConfig: CfnHostedZone.HostedZoneConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6574110f4a0be76cab610c15603ca3d716a5ea83624203658054049213ce9c56")
    public
        fun hostedZoneConfig(hostedZoneConfig: CfnHostedZone.HostedZoneConfigProperty.Builder.() -> Unit)

    public fun hostedZoneTags(hostedZoneTags: List<CfnHostedZone.HostedZoneTagProperty>)

    public fun hostedZoneTags(vararg hostedZoneTags: CfnHostedZone.HostedZoneTagProperty)

    public fun name(name: String)

    public fun queryLoggingConfig(queryLoggingConfig: IResolvable)

    public fun queryLoggingConfig(queryLoggingConfig: CfnHostedZone.QueryLoggingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42a44c584443442773b8449e484e99a8dfff50592fa20f22e1c61c9f0d5efdf4")
    public
        fun queryLoggingConfig(queryLoggingConfig: CfnHostedZone.QueryLoggingConfigProperty.Builder.() -> Unit)

    public fun vpcs(vpcs: IResolvable)

    public fun vpcs(vpcs: List<Any>)

    public fun vpcs(vararg vpcs: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnHostedZoneProps.Builder =
        software.amazon.awscdk.services.route53.CfnHostedZoneProps.builder()

    override fun hostedZoneConfig(hostedZoneConfig: IResolvable) {
      cdkBuilder.hostedZoneConfig(hostedZoneConfig.let(IResolvable::unwrap))
    }

    override fun hostedZoneConfig(hostedZoneConfig: CfnHostedZone.HostedZoneConfigProperty) {
      cdkBuilder.hostedZoneConfig(hostedZoneConfig.let(CfnHostedZone.HostedZoneConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6574110f4a0be76cab610c15603ca3d716a5ea83624203658054049213ce9c56")
    override
        fun hostedZoneConfig(hostedZoneConfig: CfnHostedZone.HostedZoneConfigProperty.Builder.() -> Unit):
        Unit = hostedZoneConfig(CfnHostedZone.HostedZoneConfigProperty(hostedZoneConfig))

    override fun hostedZoneTags(hostedZoneTags: List<CfnHostedZone.HostedZoneTagProperty>) {
      cdkBuilder.hostedZoneTags(hostedZoneTags.map(CfnHostedZone.HostedZoneTagProperty::unwrap))
    }

    override fun hostedZoneTags(vararg hostedZoneTags: CfnHostedZone.HostedZoneTagProperty): Unit =
        hostedZoneTags(hostedZoneTags.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun queryLoggingConfig(queryLoggingConfig: IResolvable) {
      cdkBuilder.queryLoggingConfig(queryLoggingConfig.let(IResolvable::unwrap))
    }

    override fun queryLoggingConfig(queryLoggingConfig: CfnHostedZone.QueryLoggingConfigProperty) {
      cdkBuilder.queryLoggingConfig(queryLoggingConfig.let(CfnHostedZone.QueryLoggingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42a44c584443442773b8449e484e99a8dfff50592fa20f22e1c61c9f0d5efdf4")
    override
        fun queryLoggingConfig(queryLoggingConfig: CfnHostedZone.QueryLoggingConfigProperty.Builder.() -> Unit):
        Unit = queryLoggingConfig(CfnHostedZone.QueryLoggingConfigProperty(queryLoggingConfig))

    override fun vpcs(vpcs: IResolvable) {
      cdkBuilder.vpcs(vpcs.let(IResolvable::unwrap))
    }

    override fun vpcs(vpcs: List<Any>) {
      cdkBuilder.vpcs(vpcs)
    }

    override fun vpcs(vararg vpcs: Any): Unit = vpcs(vpcs.toList())

    public fun build(): software.amazon.awscdk.services.route53.CfnHostedZoneProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CfnHostedZoneProps,
  ) : CdkObject(cdkObject), CfnHostedZoneProps {
    override fun hostedZoneConfig(): Any? = unwrap(this).getHostedZoneConfig()

    override fun hostedZoneTags(): List<CfnHostedZone.HostedZoneTagProperty> =
        unwrap(this).getHostedZoneTags()?.map(CfnHostedZone.HostedZoneTagProperty::wrap) ?:
        emptyList()

    override fun name(): String? = unwrap(this).getName()

    override fun queryLoggingConfig(): Any? = unwrap(this).getQueryLoggingConfig()

    override fun vpcs(): Any? = unwrap(this).getVpcs()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHostedZoneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHostedZoneProps):
        CfnHostedZoneProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHostedZoneProps):
        software.amazon.awscdk.services.route53.CfnHostedZoneProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnHostedZoneProps
  }
}

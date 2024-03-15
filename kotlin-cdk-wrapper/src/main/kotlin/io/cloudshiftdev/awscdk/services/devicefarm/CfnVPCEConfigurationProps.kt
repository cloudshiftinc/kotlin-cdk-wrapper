@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVPCEConfigurationProps {
  public fun serviceDnsName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpceConfigurationDescription(): String? =
      unwrap(this).getVpceConfigurationDescription()

  public fun vpceConfigurationName(): String

  public fun vpceServiceName(): String

  @CdkDslMarker
  public interface Builder {
    public fun serviceDnsName(serviceDnsName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpceConfigurationDescription(vpceConfigurationDescription: String)

    public fun vpceConfigurationName(vpceConfigurationName: String)

    public fun vpceServiceName(vpceServiceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps.Builder =
        software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps.builder()

    override fun serviceDnsName(serviceDnsName: String) {
      cdkBuilder.serviceDnsName(serviceDnsName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpceConfigurationDescription(vpceConfigurationDescription: String) {
      cdkBuilder.vpceConfigurationDescription(vpceConfigurationDescription)
    }

    override fun vpceConfigurationName(vpceConfigurationName: String) {
      cdkBuilder.vpceConfigurationName(vpceConfigurationName)
    }

    override fun vpceServiceName(vpceServiceName: String) {
      cdkBuilder.vpceServiceName(vpceServiceName)
    }

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps,
  ) : CdkObject(cdkObject), CfnVPCEConfigurationProps {
    override fun serviceDnsName(): String = unwrap(this).getServiceDnsName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpceConfigurationDescription(): String? =
        unwrap(this).getVpceConfigurationDescription()

    override fun vpceConfigurationName(): String = unwrap(this).getVpceConfigurationName()

    override fun vpceServiceName(): String = unwrap(this).getVpceServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCEConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps):
        CfnVPCEConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEConfigurationProps):
        software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps
  }
}

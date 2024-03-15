@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshiftserverless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnWorkgroupProps {
  public fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

  public fun configParameters(): Any? = unwrap(this).getConfigParameters()

  public fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  public fun namespaceName(): String? = unwrap(this).getNamespaceName()

  public fun port(): Number? = unwrap(this).getPort()

  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun workgroupName(): String

  @CdkDslMarker
  public interface Builder {
    public fun baseCapacity(baseCapacity: Number)

    public fun configParameters(configParameters: IResolvable)

    public fun configParameters(configParameters: List<Any>)

    public fun configParameters(vararg configParameters: Any)

    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean)

    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable)

    public fun maxCapacity(maxCapacity: Number)

    public fun namespaceName(namespaceName: String)

    public fun port(port: Number)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun workgroupName(workgroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps.Builder =
        software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps.builder()

    override fun baseCapacity(baseCapacity: Number) {
      cdkBuilder.baseCapacity(baseCapacity)
    }

    override fun configParameters(configParameters: IResolvable) {
      cdkBuilder.configParameters(configParameters.let(IResolvable::unwrap))
    }

    override fun configParameters(configParameters: List<Any>) {
      cdkBuilder.configParameters(configParameters)
    }

    override fun configParameters(vararg configParameters: Any): Unit =
        configParameters(configParameters.toList())

    override fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    override fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting.let(IResolvable::unwrap))
    }

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun workgroupName(workgroupName: String) {
      cdkBuilder.workgroupName(workgroupName)
    }

    public fun build(): software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps,
  ) : CdkObject(cdkObject), CfnWorkgroupProps {
    override fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

    override fun configParameters(): Any? = unwrap(this).getConfigParameters()

    override fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    override fun namespaceName(): String? = unwrap(this).getNamespaceName()

    override fun port(): Number? = unwrap(this).getPort()

    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun workgroupName(): String = unwrap(this).getWorkgroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkgroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps):
        CfnWorkgroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkgroupProps):
        software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps
  }
}

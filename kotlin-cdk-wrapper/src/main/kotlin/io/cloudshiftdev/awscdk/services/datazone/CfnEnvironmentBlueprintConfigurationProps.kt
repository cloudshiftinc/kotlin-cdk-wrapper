@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEnvironmentBlueprintConfigurationProps {
  public fun domainIdentifier(): String

  public fun enabledRegions(): List<String>

  public fun environmentBlueprintIdentifier(): String

  public fun manageAccessRoleArn(): String? = unwrap(this).getManageAccessRoleArn()

  public fun provisioningRoleArn(): String? = unwrap(this).getProvisioningRoleArn()

  public fun regionalParameters(): Any? = unwrap(this).getRegionalParameters()

  @CdkDslMarker
  public interface Builder {
    public fun domainIdentifier(domainIdentifier: String)

    public fun enabledRegions(enabledRegions: List<String>)

    public fun enabledRegions(vararg enabledRegions: String)

    public fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String)

    public fun manageAccessRoleArn(manageAccessRoleArn: String)

    public fun provisioningRoleArn(provisioningRoleArn: String)

    public fun regionalParameters(regionalParameters: IResolvable)

    public fun regionalParameters(regionalParameters: List<Any>)

    public fun regionalParameters(vararg regionalParameters: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfigurationProps.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfigurationProps.builder()

    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    override fun enabledRegions(enabledRegions: List<String>) {
      cdkBuilder.enabledRegions(enabledRegions)
    }

    override fun enabledRegions(vararg enabledRegions: String): Unit =
        enabledRegions(enabledRegions.toList())

    override fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String) {
      cdkBuilder.environmentBlueprintIdentifier(environmentBlueprintIdentifier)
    }

    override fun manageAccessRoleArn(manageAccessRoleArn: String) {
      cdkBuilder.manageAccessRoleArn(manageAccessRoleArn)
    }

    override fun provisioningRoleArn(provisioningRoleArn: String) {
      cdkBuilder.provisioningRoleArn(provisioningRoleArn)
    }

    override fun regionalParameters(regionalParameters: IResolvable) {
      cdkBuilder.regionalParameters(regionalParameters.let(IResolvable::unwrap))
    }

    override fun regionalParameters(regionalParameters: List<Any>) {
      cdkBuilder.regionalParameters(regionalParameters)
    }

    override fun regionalParameters(vararg regionalParameters: Any): Unit =
        regionalParameters(regionalParameters.toList())

    public fun build():
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfigurationProps,
  ) : CdkObject(cdkObject), CfnEnvironmentBlueprintConfigurationProps {
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    override fun enabledRegions(): List<String> = unwrap(this).getEnabledRegions()

    override fun environmentBlueprintIdentifier(): String =
        unwrap(this).getEnvironmentBlueprintIdentifier()

    override fun manageAccessRoleArn(): String? = unwrap(this).getManageAccessRoleArn()

    override fun provisioningRoleArn(): String? = unwrap(this).getProvisioningRoleArn()

    override fun regionalParameters(): Any? = unwrap(this).getRegionalParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnEnvironmentBlueprintConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfigurationProps):
        CfnEnvironmentBlueprintConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentBlueprintConfigurationProps):
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfigurationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfigurationProps
  }
}

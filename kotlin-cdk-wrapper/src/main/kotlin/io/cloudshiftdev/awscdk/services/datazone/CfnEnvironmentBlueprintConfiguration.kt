@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironmentBlueprintConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  public open fun attrEnvironmentBlueprintId(): String =
      unwrap(this).getAttrEnvironmentBlueprintId()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  public open fun enabledRegions(): List<String> = unwrap(this).getEnabledRegions()

  public open fun enabledRegions(`value`: List<String>) {
    unwrap(this).setEnabledRegions(`value`)
  }

  public open fun enabledRegions(vararg `value`: String): Unit = enabledRegions(`value`.toList())

  public open fun environmentBlueprintIdentifier(): String =
      unwrap(this).getEnvironmentBlueprintIdentifier()

  public open fun environmentBlueprintIdentifier(`value`: String) {
    unwrap(this).setEnvironmentBlueprintIdentifier(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun manageAccessRoleArn(): String? = unwrap(this).getManageAccessRoleArn()

  public open fun manageAccessRoleArn(`value`: String) {
    unwrap(this).setManageAccessRoleArn(`value`)
  }

  public open fun provisioningRoleArn(): String? = unwrap(this).getProvisioningRoleArn()

  public open fun provisioningRoleArn(`value`: String) {
    unwrap(this).setProvisioningRoleArn(`value`)
  }

  public open fun regionalParameters(): Any? = unwrap(this).getRegionalParameters()

  public open fun regionalParameters(`value`: IResolvable) {
    unwrap(this).setRegionalParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun regionalParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setRegionalParameters(__idx_ac66f0)
  }

  public open fun regionalParameters(vararg __idx_ac66f0: Any): Unit =
      regionalParameters(__idx_ac66f0.toList())

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.Builder.create(scope,
        id)

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
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironmentBlueprintConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironmentBlueprintConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration):
        CfnEnvironmentBlueprintConfiguration = CfnEnvironmentBlueprintConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentBlueprintConfiguration):
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration =
        wrapped.cdkObject
  }

  public interface RegionalParameterProperty {
    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun region(): String? = unwrap(this).getRegion()

    @CdkDslMarker
    public interface Builder {
      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: Map<String, String>)

      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty.builder()

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty,
    ) : CdkObject(cdkObject), RegionalParameterProperty {
      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun region(): String? = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegionalParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty):
          RegionalParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegionalParameterProperty):
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty
    }
  }
}

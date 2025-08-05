@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The configuration details of an environment blueprint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnEnvironmentBlueprintConfiguration cfnEnvironmentBlueprintConfiguration =
 * CfnEnvironmentBlueprintConfiguration.Builder.create(this, "MyCfnEnvironmentBlueprintConfiguration")
 * .domainIdentifier("domainIdentifier")
 * .enabledRegions(List.of("enabledRegions"))
 * .environmentBlueprintIdentifier("environmentBlueprintIdentifier")
 * // the properties below are optional
 * .environmentRolePermissionBoundary("environmentRolePermissionBoundary")
 * .manageAccessRoleArn("manageAccessRoleArn")
 * .provisioningConfigurations(List.of(ProvisioningConfigurationProperty.builder()
 * .lakeFormationConfiguration(LakeFormationConfigurationProperty.builder()
 * .locationRegistrationExcludeS3Locations(List.of("locationRegistrationExcludeS3Locations"))
 * .locationRegistrationRole("locationRegistrationRole")
 * .build())
 * .build()))
 * .provisioningRoleArn("provisioningRoleArn")
 * .regionalParameters(List.of(RegionalParameterProperty.builder()
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .region("region")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html)
 */
public open class CfnEnvironmentBlueprintConfiguration(
  cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentBlueprintConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEnvironmentBlueprintConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentBlueprintConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEnvironmentBlueprintConfigurationProps(props)
  )

  /**
   * The timestamp of when an environment blueprint was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The identifier of the Amazon DataZone domain in which an environment blueprint exists.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The identifier of the environment blueprint.
   *
   * This identifier should be used when creating environment profiles.
   */
  public open fun attrEnvironmentBlueprintId(): String =
      unwrap(this).getAttrEnvironmentBlueprintId()

  /**
   * The timestamp of when the environment blueprint was updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The identifier of the Amazon DataZone domain in which an environment blueprint exists.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The identifier of the Amazon DataZone domain in which an environment blueprint exists.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * The enabled AWS Regions specified in a blueprint configuration.
   */
  public open fun enabledRegions(): List<String> = unwrap(this).getEnabledRegions()

  /**
   * The enabled AWS Regions specified in a blueprint configuration.
   */
  public open fun enabledRegions(`value`: List<String>) {
    unwrap(this).setEnabledRegions(`value`)
  }

  /**
   * The enabled AWS Regions specified in a blueprint configuration.
   */
  public open fun enabledRegions(vararg `value`: String): Unit = enabledRegions(`value`.toList())

  /**
   * The identifier of the environment blueprint.
   */
  public open fun environmentBlueprintIdentifier(): String =
      unwrap(this).getEnvironmentBlueprintIdentifier()

  /**
   * The identifier of the environment blueprint.
   */
  public open fun environmentBlueprintIdentifier(`value`: String) {
    unwrap(this).setEnvironmentBlueprintIdentifier(`value`)
  }

  /**
   * The environment role permission boundary.
   */
  public open fun environmentRolePermissionBoundary(): String? =
      unwrap(this).getEnvironmentRolePermissionBoundary()

  /**
   * The environment role permission boundary.
   */
  public open fun environmentRolePermissionBoundary(`value`: String) {
    unwrap(this).setEnvironmentRolePermissionBoundary(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ARN of the manage access role.
   */
  public open fun manageAccessRoleArn(): String? = unwrap(this).getManageAccessRoleArn()

  /**
   * The ARN of the manage access role.
   */
  public open fun manageAccessRoleArn(`value`: String) {
    unwrap(this).setManageAccessRoleArn(`value`)
  }

  /**
   * The provisioning configuration of a blueprint.
   */
  public open fun provisioningConfigurations(): Any? = unwrap(this).getProvisioningConfigurations()

  /**
   * The provisioning configuration of a blueprint.
   */
  public open fun provisioningConfigurations(`value`: IResolvable) {
    unwrap(this).setProvisioningConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The provisioning configuration of a blueprint.
   */
  public open fun provisioningConfigurations(`value`: List<Any>) {
    unwrap(this).setProvisioningConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The provisioning configuration of a blueprint.
   */
  public open fun provisioningConfigurations(vararg `value`: Any): Unit =
      provisioningConfigurations(`value`.toList())

  /**
   * The ARN of the provisioning role.
   */
  public open fun provisioningRoleArn(): String? = unwrap(this).getProvisioningRoleArn()

  /**
   * The ARN of the provisioning role.
   */
  public open fun provisioningRoleArn(`value`: String) {
    unwrap(this).setProvisioningRoleArn(`value`)
  }

  /**
   * The regional parameters of the environment blueprint.
   */
  public open fun regionalParameters(): Any? = unwrap(this).getRegionalParameters()

  /**
   * The regional parameters of the environment blueprint.
   */
  public open fun regionalParameters(`value`: IResolvable) {
    unwrap(this).setRegionalParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The regional parameters of the environment blueprint.
   */
  public open fun regionalParameters(`value`: List<Any>) {
    unwrap(this).setRegionalParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The regional parameters of the environment blueprint.
   */
  public open fun regionalParameters(vararg `value`: Any): Unit =
      regionalParameters(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Amazon DataZone domain in which an environment blueprint exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-domainidentifier)
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which an environment
     * blueprint exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The enabled AWS Regions specified in a blueprint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-enabledregions)
     * @param enabledRegions The enabled AWS Regions specified in a blueprint configuration. 
     */
    public fun enabledRegions(enabledRegions: List<String>)

    /**
     * The enabled AWS Regions specified in a blueprint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-enabledregions)
     * @param enabledRegions The enabled AWS Regions specified in a blueprint configuration. 
     */
    public fun enabledRegions(vararg enabledRegions: String)

    /**
     * The identifier of the environment blueprint.
     *
     * In the current release, only the following values are supported: `DefaultDataLake` and
     * `DefaultDataWarehouse` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-environmentblueprintidentifier)
     * @param environmentBlueprintIdentifier The identifier of the environment blueprint. 
     */
    public fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String)

    /**
     * The environment role permission boundary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-environmentrolepermissionboundary)
     * @param environmentRolePermissionBoundary The environment role permission boundary. 
     */
    public fun environmentRolePermissionBoundary(environmentRolePermissionBoundary: String)

    /**
     * The ARN of the manage access role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-manageaccessrolearn)
     * @param manageAccessRoleArn The ARN of the manage access role. 
     */
    public fun manageAccessRoleArn(manageAccessRoleArn: String)

    /**
     * The provisioning configuration of a blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningconfigurations)
     * @param provisioningConfigurations The provisioning configuration of a blueprint. 
     */
    public fun provisioningConfigurations(provisioningConfigurations: IResolvable)

    /**
     * The provisioning configuration of a blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningconfigurations)
     * @param provisioningConfigurations The provisioning configuration of a blueprint. 
     */
    public fun provisioningConfigurations(provisioningConfigurations: List<Any>)

    /**
     * The provisioning configuration of a blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningconfigurations)
     * @param provisioningConfigurations The provisioning configuration of a blueprint. 
     */
    public fun provisioningConfigurations(vararg provisioningConfigurations: Any)

    /**
     * The ARN of the provisioning role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningrolearn)
     * @param provisioningRoleArn The ARN of the provisioning role. 
     */
    public fun provisioningRoleArn(provisioningRoleArn: String)

    /**
     * The regional parameters of the environment blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-regionalparameters)
     * @param regionalParameters The regional parameters of the environment blueprint. 
     */
    public fun regionalParameters(regionalParameters: IResolvable)

    /**
     * The regional parameters of the environment blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-regionalparameters)
     * @param regionalParameters The regional parameters of the environment blueprint. 
     */
    public fun regionalParameters(regionalParameters: List<Any>)

    /**
     * The regional parameters of the environment blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-regionalparameters)
     * @param regionalParameters The regional parameters of the environment blueprint. 
     */
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

    /**
     * The identifier of the Amazon DataZone domain in which an environment blueprint exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-domainidentifier)
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which an environment
     * blueprint exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The enabled AWS Regions specified in a blueprint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-enabledregions)
     * @param enabledRegions The enabled AWS Regions specified in a blueprint configuration. 
     */
    override fun enabledRegions(enabledRegions: List<String>) {
      cdkBuilder.enabledRegions(enabledRegions)
    }

    /**
     * The enabled AWS Regions specified in a blueprint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-enabledregions)
     * @param enabledRegions The enabled AWS Regions specified in a blueprint configuration. 
     */
    override fun enabledRegions(vararg enabledRegions: String): Unit =
        enabledRegions(enabledRegions.toList())

    /**
     * The identifier of the environment blueprint.
     *
     * In the current release, only the following values are supported: `DefaultDataLake` and
     * `DefaultDataWarehouse` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-environmentblueprintidentifier)
     * @param environmentBlueprintIdentifier The identifier of the environment blueprint. 
     */
    override fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String) {
      cdkBuilder.environmentBlueprintIdentifier(environmentBlueprintIdentifier)
    }

    /**
     * The environment role permission boundary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-environmentrolepermissionboundary)
     * @param environmentRolePermissionBoundary The environment role permission boundary. 
     */
    override fun environmentRolePermissionBoundary(environmentRolePermissionBoundary: String) {
      cdkBuilder.environmentRolePermissionBoundary(environmentRolePermissionBoundary)
    }

    /**
     * The ARN of the manage access role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-manageaccessrolearn)
     * @param manageAccessRoleArn The ARN of the manage access role. 
     */
    override fun manageAccessRoleArn(manageAccessRoleArn: String) {
      cdkBuilder.manageAccessRoleArn(manageAccessRoleArn)
    }

    /**
     * The provisioning configuration of a blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningconfigurations)
     * @param provisioningConfigurations The provisioning configuration of a blueprint. 
     */
    override fun provisioningConfigurations(provisioningConfigurations: IResolvable) {
      cdkBuilder.provisioningConfigurations(provisioningConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * The provisioning configuration of a blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningconfigurations)
     * @param provisioningConfigurations The provisioning configuration of a blueprint. 
     */
    override fun provisioningConfigurations(provisioningConfigurations: List<Any>) {
      cdkBuilder.provisioningConfigurations(provisioningConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The provisioning configuration of a blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningconfigurations)
     * @param provisioningConfigurations The provisioning configuration of a blueprint. 
     */
    override fun provisioningConfigurations(vararg provisioningConfigurations: Any): Unit =
        provisioningConfigurations(provisioningConfigurations.toList())

    /**
     * The ARN of the provisioning role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningrolearn)
     * @param provisioningRoleArn The ARN of the provisioning role. 
     */
    override fun provisioningRoleArn(provisioningRoleArn: String) {
      cdkBuilder.provisioningRoleArn(provisioningRoleArn)
    }

    /**
     * The regional parameters of the environment blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-regionalparameters)
     * @param regionalParameters The regional parameters of the environment blueprint. 
     */
    override fun regionalParameters(regionalParameters: IResolvable) {
      cdkBuilder.regionalParameters(regionalParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * The regional parameters of the environment blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-regionalparameters)
     * @param regionalParameters The regional parameters of the environment blueprint. 
     */
    override fun regionalParameters(regionalParameters: List<Any>) {
      cdkBuilder.regionalParameters(regionalParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The regional parameters of the environment blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-regionalparameters)
     * @param regionalParameters The regional parameters of the environment blueprint. 
     */
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
        wrapped.cdkObject as
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * LakeFormationConfigurationProperty lakeFormationConfigurationProperty =
   * LakeFormationConfigurationProperty.builder()
   * .locationRegistrationExcludeS3Locations(List.of("locationRegistrationExcludeS3Locations"))
   * .locationRegistrationRole("locationRegistrationRole")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-lakeformationconfiguration.html)
   */
  public interface LakeFormationConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-lakeformationconfiguration.html#cfn-datazone-environmentblueprintconfiguration-lakeformationconfiguration-locationregistrationexcludes3locations)
     */
    public fun locationRegistrationExcludeS3Locations(): List<String> =
        unwrap(this).getLocationRegistrationExcludeS3Locations() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-lakeformationconfiguration.html#cfn-datazone-environmentblueprintconfiguration-lakeformationconfiguration-locationregistrationrole)
     */
    public fun locationRegistrationRole(): String? = unwrap(this).getLocationRegistrationRole()

    /**
     * A builder for [LakeFormationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param locationRegistrationExcludeS3Locations the value to be set.
       */
      public
          fun locationRegistrationExcludeS3Locations(locationRegistrationExcludeS3Locations: List<String>)

      /**
       * @param locationRegistrationExcludeS3Locations the value to be set.
       */
      public fun locationRegistrationExcludeS3Locations(vararg
          locationRegistrationExcludeS3Locations: String)

      /**
       * @param locationRegistrationRole the value to be set.
       */
      public fun locationRegistrationRole(locationRegistrationRole: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.LakeFormationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.LakeFormationConfigurationProperty.builder()

      /**
       * @param locationRegistrationExcludeS3Locations the value to be set.
       */
      override
          fun locationRegistrationExcludeS3Locations(locationRegistrationExcludeS3Locations: List<String>) {
        cdkBuilder.locationRegistrationExcludeS3Locations(locationRegistrationExcludeS3Locations)
      }

      /**
       * @param locationRegistrationExcludeS3Locations the value to be set.
       */
      override fun locationRegistrationExcludeS3Locations(vararg
          locationRegistrationExcludeS3Locations: String): Unit =
          locationRegistrationExcludeS3Locations(locationRegistrationExcludeS3Locations.toList())

      /**
       * @param locationRegistrationRole the value to be set.
       */
      override fun locationRegistrationRole(locationRegistrationRole: String) {
        cdkBuilder.locationRegistrationRole(locationRegistrationRole)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.LakeFormationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.LakeFormationConfigurationProperty,
    ) : CdkObject(cdkObject),
        LakeFormationConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-lakeformationconfiguration.html#cfn-datazone-environmentblueprintconfiguration-lakeformationconfiguration-locationregistrationexcludes3locations)
       */
      override fun locationRegistrationExcludeS3Locations(): List<String> =
          unwrap(this).getLocationRegistrationExcludeS3Locations() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-lakeformationconfiguration.html#cfn-datazone-environmentblueprintconfiguration-lakeformationconfiguration-locationregistrationrole)
       */
      override fun locationRegistrationRole(): String? = unwrap(this).getLocationRegistrationRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LakeFormationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.LakeFormationConfigurationProperty):
          LakeFormationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LakeFormationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LakeFormationConfigurationProperty):
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.LakeFormationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.LakeFormationConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * ProvisioningConfigurationProperty provisioningConfigurationProperty =
   * ProvisioningConfigurationProperty.builder()
   * .lakeFormationConfiguration(LakeFormationConfigurationProperty.builder()
   * .locationRegistrationExcludeS3Locations(List.of("locationRegistrationExcludeS3Locations"))
   * .locationRegistrationRole("locationRegistrationRole")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-provisioningconfiguration.html)
   */
  public interface ProvisioningConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-provisioningconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningconfiguration-lakeformationconfiguration)
     */
    public fun lakeFormationConfiguration(): Any

    /**
     * A builder for [ProvisioningConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lakeFormationConfiguration the value to be set. 
       */
      public fun lakeFormationConfiguration(lakeFormationConfiguration: IResolvable)

      /**
       * @param lakeFormationConfiguration the value to be set. 
       */
      public
          fun lakeFormationConfiguration(lakeFormationConfiguration: LakeFormationConfigurationProperty)

      /**
       * @param lakeFormationConfiguration the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0540a8939eaf4f9b0b476c25ca80c0db4f67c6618671d1b50ea9744e23dc0f15")
      public
          fun lakeFormationConfiguration(lakeFormationConfiguration: LakeFormationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.ProvisioningConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.ProvisioningConfigurationProperty.builder()

      /**
       * @param lakeFormationConfiguration the value to be set. 
       */
      override fun lakeFormationConfiguration(lakeFormationConfiguration: IResolvable) {
        cdkBuilder.lakeFormationConfiguration(lakeFormationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lakeFormationConfiguration the value to be set. 
       */
      override
          fun lakeFormationConfiguration(lakeFormationConfiguration: LakeFormationConfigurationProperty) {
        cdkBuilder.lakeFormationConfiguration(lakeFormationConfiguration.let(LakeFormationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param lakeFormationConfiguration the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0540a8939eaf4f9b0b476c25ca80c0db4f67c6618671d1b50ea9744e23dc0f15")
      override
          fun lakeFormationConfiguration(lakeFormationConfiguration: LakeFormationConfigurationProperty.Builder.() -> Unit):
          Unit =
          lakeFormationConfiguration(LakeFormationConfigurationProperty(lakeFormationConfiguration))

      public fun build():
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.ProvisioningConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.ProvisioningConfigurationProperty,
    ) : CdkObject(cdkObject),
        ProvisioningConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-provisioningconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningconfiguration-lakeformationconfiguration)
       */
      override fun lakeFormationConfiguration(): Any = unwrap(this).getLakeFormationConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProvisioningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.ProvisioningConfigurationProperty):
          ProvisioningConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProvisioningConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningConfigurationProperty):
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.ProvisioningConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.ProvisioningConfigurationProperty
    }
  }

  /**
   * The regional parameters in the environment blueprint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * RegionalParameterProperty regionalParameterProperty = RegionalParameterProperty.builder()
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .region("region")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-regionalparameter.html)
   */
  public interface RegionalParameterProperty {
    /**
     * A string to string map containing parameters for the region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-regionalparameter.html#cfn-datazone-environmentblueprintconfiguration-regionalparameter-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The region specified in the environment parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-regionalparameter.html#cfn-datazone-environmentblueprintconfiguration-regionalparameter-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * A builder for [RegionalParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameters A string to string map containing parameters for the region.
       */
      public fun parameters(parameters: Map<String, String>)

      /**
       * @param parameters A string to string map containing parameters for the region.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param region The region specified in the environment parameter.
       */
      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty.builder()

      /**
       * @param parameters A string to string map containing parameters for the region.
       */
      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param parameters A string to string map containing parameters for the region.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param region The region specified in the environment parameter.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty,
    ) : CdkObject(cdkObject),
        RegionalParameterProperty {
      /**
       * A string to string map containing parameters for the region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-regionalparameter.html#cfn-datazone-environmentblueprintconfiguration-regionalparameter-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The region specified in the environment parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentblueprintconfiguration-regionalparameter.html#cfn-datazone-environmentblueprintconfiguration-regionalparameter-region)
       */
      override fun region(): String? = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegionalParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty):
          RegionalParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RegionalParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegionalParameterProperty):
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration.RegionalParameterProperty
    }
  }
}

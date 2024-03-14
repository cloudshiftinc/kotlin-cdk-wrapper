package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEnvironmentBlueprintConfigurationProps {
  /**
   * The identifier of the Amazon DataZone domain in which an environment blueprint exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The enabled AWS Regions specified in a blueprint configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-enabledregions)
   */
  public fun enabledRegions(): List<String>

  /**
   * The identifier of the environment blueprint.
   *
   * In the current release, only the following values are supported: `DefaultDataLake` and
   * `DefaultDataWarehouse` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-environmentblueprintidentifier)
   */
  public fun environmentBlueprintIdentifier(): String

  /**
   * The ARN of the manage access role.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-manageaccessrolearn)
   */
  public fun manageAccessRoleArn(): String? = unwrap(this).getManageAccessRoleArn()

  /**
   * The ARN of the provisioning role.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningrolearn)
   */
  public fun provisioningRoleArn(): String? = unwrap(this).getProvisioningRoleArn()

  /**
   * The regional parameters of the environment blueprint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-regionalparameters)
   */
  public fun regionalParameters(): Any? = unwrap(this).getRegionalParameters()

  /**
   * A builder for [CfnEnvironmentBlueprintConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which an environment
     * blueprint exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param enabledRegions The enabled AWS Regions specified in a blueprint configuration. 
     */
    public fun enabledRegions(enabledRegions: List<String>)

    /**
     * @param enabledRegions The enabled AWS Regions specified in a blueprint configuration. 
     */
    public fun enabledRegions(vararg enabledRegions: String)

    /**
     * @param environmentBlueprintIdentifier The identifier of the environment blueprint. 
     * In the current release, only the following values are supported: `DefaultDataLake` and
     * `DefaultDataWarehouse` .
     */
    public fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String)

    /**
     * @param manageAccessRoleArn The ARN of the manage access role.
     */
    public fun manageAccessRoleArn(manageAccessRoleArn: String)

    /**
     * @param provisioningRoleArn The ARN of the provisioning role.
     */
    public fun provisioningRoleArn(provisioningRoleArn: String)

    /**
     * @param regionalParameters The regional parameters of the environment blueprint.
     */
    public fun regionalParameters(regionalParameters: IResolvable)

    /**
     * @param regionalParameters The regional parameters of the environment blueprint.
     */
    public fun regionalParameters(regionalParameters: List<Any>)

    /**
     * @param regionalParameters The regional parameters of the environment blueprint.
     */
    public fun regionalParameters(vararg regionalParameters: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfigurationProps.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfigurationProps.builder()

    /**
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which an environment
     * blueprint exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param enabledRegions The enabled AWS Regions specified in a blueprint configuration. 
     */
    override fun enabledRegions(enabledRegions: List<String>) {
      cdkBuilder.enabledRegions(enabledRegions)
    }

    /**
     * @param enabledRegions The enabled AWS Regions specified in a blueprint configuration. 
     */
    override fun enabledRegions(vararg enabledRegions: String): Unit =
        enabledRegions(enabledRegions.toList())

    /**
     * @param environmentBlueprintIdentifier The identifier of the environment blueprint. 
     * In the current release, only the following values are supported: `DefaultDataLake` and
     * `DefaultDataWarehouse` .
     */
    override fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String) {
      cdkBuilder.environmentBlueprintIdentifier(environmentBlueprintIdentifier)
    }

    /**
     * @param manageAccessRoleArn The ARN of the manage access role.
     */
    override fun manageAccessRoleArn(manageAccessRoleArn: String) {
      cdkBuilder.manageAccessRoleArn(manageAccessRoleArn)
    }

    /**
     * @param provisioningRoleArn The ARN of the provisioning role.
     */
    override fun provisioningRoleArn(provisioningRoleArn: String) {
      cdkBuilder.provisioningRoleArn(provisioningRoleArn)
    }

    /**
     * @param regionalParameters The regional parameters of the environment blueprint.
     */
    override fun regionalParameters(regionalParameters: IResolvable) {
      cdkBuilder.regionalParameters(regionalParameters.let(IResolvable::unwrap))
    }

    /**
     * @param regionalParameters The regional parameters of the environment blueprint.
     */
    override fun regionalParameters(regionalParameters: List<Any>) {
      cdkBuilder.regionalParameters(regionalParameters)
    }

    /**
     * @param regionalParameters The regional parameters of the environment blueprint.
     */
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
    /**
     * The identifier of the Amazon DataZone domain in which an environment blueprint exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The enabled AWS Regions specified in a blueprint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-enabledregions)
     */
    override fun enabledRegions(): List<String> = unwrap(this).getEnabledRegions()

    /**
     * The identifier of the environment blueprint.
     *
     * In the current release, only the following values are supported: `DefaultDataLake` and
     * `DefaultDataWarehouse` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-environmentblueprintidentifier)
     */
    override fun environmentBlueprintIdentifier(): String =
        unwrap(this).getEnvironmentBlueprintIdentifier()

    /**
     * The ARN of the manage access role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-manageaccessrolearn)
     */
    override fun manageAccessRoleArn(): String? = unwrap(this).getManageAccessRoleArn()

    /**
     * The ARN of the provisioning role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningrolearn)
     */
    override fun provisioningRoleArn(): String? = unwrap(this).getProvisioningRoleArn()

    /**
     * The regional parameters of the environment blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-regionalparameters)
     */
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

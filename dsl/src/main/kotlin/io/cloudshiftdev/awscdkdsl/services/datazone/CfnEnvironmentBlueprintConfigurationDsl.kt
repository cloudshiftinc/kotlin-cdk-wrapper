@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datazone.CfnEnvironmentBlueprintConfiguration
import software.constructs.Construct

/**
 * The configuration details of an environment blueprint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnEnvironmentBlueprintConfiguration cfnEnvironmentBlueprintConfiguration =
 * CfnEnvironmentBlueprintConfiguration.Builder.create(this, "MyCfnEnvironmentBlueprintConfiguration")
 * .domainIdentifier("domainIdentifier")
 * .enabledRegions(List.of("enabledRegions"))
 * .environmentBlueprintIdentifier("environmentBlueprintIdentifier")
 * // the properties below are optional
 * .manageAccessRoleArn("manageAccessRoleArn")
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
@CdkDslMarker
public class CfnEnvironmentBlueprintConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnvironmentBlueprintConfiguration.Builder =
        CfnEnvironmentBlueprintConfiguration.Builder.create(scope, id)

    private val _enabledRegions: MutableList<String> = mutableListOf()

    private val _regionalParameters: MutableList<Any> = mutableListOf()

    /**
     * The identifier of the Amazon DataZone domain in which an environment blueprint exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-domainidentifier)
     *
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which an environment
     *   blueprint exists.
     */
    public fun domainIdentifier(domainIdentifier: String) {
        cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The enabled AWS Regions specified in a blueprint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-enabledregions)
     *
     * @param enabledRegions The enabled AWS Regions specified in a blueprint configuration.
     */
    public fun enabledRegions(vararg enabledRegions: String) {
        _enabledRegions.addAll(listOf(*enabledRegions))
    }

    /**
     * The enabled AWS Regions specified in a blueprint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-enabledregions)
     *
     * @param enabledRegions The enabled AWS Regions specified in a blueprint configuration.
     */
    public fun enabledRegions(enabledRegions: Collection<String>) {
        _enabledRegions.addAll(enabledRegions)
    }

    /**
     * The identifier of the environment blueprint.
     *
     * In the current release, only the following values are supported: `DefaultDataLake` and
     * `DefaultDataWarehouse` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-environmentblueprintidentifier)
     *
     * @param environmentBlueprintIdentifier The identifier of the environment blueprint.
     */
    public fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String) {
        cdkBuilder.environmentBlueprintIdentifier(environmentBlueprintIdentifier)
    }

    /**
     * The ARN of the manage access role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-manageaccessrolearn)
     *
     * @param manageAccessRoleArn The ARN of the manage access role.
     */
    public fun manageAccessRoleArn(manageAccessRoleArn: String) {
        cdkBuilder.manageAccessRoleArn(manageAccessRoleArn)
    }

    /**
     * The ARN of the provisioning role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-provisioningrolearn)
     *
     * @param provisioningRoleArn The ARN of the provisioning role.
     */
    public fun provisioningRoleArn(provisioningRoleArn: String) {
        cdkBuilder.provisioningRoleArn(provisioningRoleArn)
    }

    /**
     * The regional parameters of the environment blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-regionalparameters)
     *
     * @param regionalParameters The regional parameters of the environment blueprint.
     */
    public fun regionalParameters(vararg regionalParameters: Any) {
        _regionalParameters.addAll(listOf(*regionalParameters))
    }

    /**
     * The regional parameters of the environment blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-regionalparameters)
     *
     * @param regionalParameters The regional parameters of the environment blueprint.
     */
    public fun regionalParameters(regionalParameters: Collection<Any>) {
        _regionalParameters.addAll(regionalParameters)
    }

    /**
     * The regional parameters of the environment blueprint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentblueprintconfiguration.html#cfn-datazone-environmentblueprintconfiguration-regionalparameters)
     *
     * @param regionalParameters The regional parameters of the environment blueprint.
     */
    public fun regionalParameters(regionalParameters: IResolvable) {
        cdkBuilder.regionalParameters(regionalParameters)
    }

    public fun build(): CfnEnvironmentBlueprintConfiguration {
        if (_enabledRegions.isNotEmpty()) cdkBuilder.enabledRegions(_enabledRegions)
        if (_regionalParameters.isNotEmpty()) cdkBuilder.regionalParameters(_regionalParameters)
        return cdkBuilder.build()
    }
}

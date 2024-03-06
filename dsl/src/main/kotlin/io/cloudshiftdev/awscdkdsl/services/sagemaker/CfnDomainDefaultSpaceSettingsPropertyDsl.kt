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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDomain

/**
 * A collection of settings that apply to spaces created in the domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DefaultSpaceSettingsProperty defaultSpaceSettingsProperty =
 * DefaultSpaceSettingsProperty.builder()
 * .executionRole("executionRole")
 * // the properties below are optional
 * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
 * .customImages(List.of(CustomImageProperty.builder()
 * .appImageConfigName("appImageConfigName")
 * .imageName("imageName")
 * // the properties below are optional
 * .imageVersionNumber(123)
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .securityGroups(List.of("securityGroups"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-defaultspacesettings.html)
 */
@CdkDslMarker
public class CfnDomainDefaultSpaceSettingsPropertyDsl {
    private val cdkBuilder: CfnDomain.DefaultSpaceSettingsProperty.Builder =
        CfnDomain.DefaultSpaceSettingsProperty.builder()

    private val _securityGroups: MutableList<String> = mutableListOf()

    /** @param executionRole The ARN of the execution role for the space. */
    public fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
    }

    /** @param jupyterServerAppSettings The JupyterServer app settings. */
    public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
    }

    /** @param jupyterServerAppSettings The JupyterServer app settings. */
    public fun jupyterServerAppSettings(
        jupyterServerAppSettings: CfnDomain.JupyterServerAppSettingsProperty
    ) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
    }

    /** @param kernelGatewayAppSettings The KernelGateway app settings. */
    public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
    }

    /** @param kernelGatewayAppSettings The KernelGateway app settings. */
    public fun kernelGatewayAppSettings(
        kernelGatewayAppSettings: CfnDomain.KernelGatewayAppSettingsProperty
    ) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
    }

    /**
     * @param securityGroups The security group IDs for the Amazon VPC that the space uses for
     *   communication.
     */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups The security group IDs for the Amazon VPC that the space uses for
     *   communication.
     */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun build(): CfnDomain.DefaultSpaceSettingsProperty {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}

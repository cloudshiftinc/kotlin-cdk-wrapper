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

package io.cloudshiftdev.awscdkdsl.services.grafana

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace
import software.amazon.awscdk.services.grafana.CfnWorkspaceProps
import software.constructs.Construct

public object grafana {
    /**
     * Specifies a *workspace* .
     *
     * In a workspace, you can create Grafana dashboards and visualizations to analyze your metrics,
     * logs, and traces. You don't have to build, package, or deploy any hardware to run the Grafana
     * server.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.grafana.*;
     * CfnWorkspace cfnWorkspace = CfnWorkspace.Builder.create(this, "MyCfnWorkspace")
     * .accountAccessType("accountAccessType")
     * .authenticationProviders(List.of("authenticationProviders"))
     * .permissionType("permissionType")
     * // the properties below are optional
     * .clientToken("clientToken")
     * .dataSources(List.of("dataSources"))
     * .description("description")
     * .grafanaVersion("grafanaVersion")
     * .name("name")
     * .networkAccessControl(NetworkAccessControlProperty.builder()
     * .prefixListIds(List.of("prefixListIds"))
     * .vpceIds(List.of("vpceIds"))
     * .build())
     * .notificationDestinations(List.of("notificationDestinations"))
     * .organizationalUnits(List.of("organizationalUnits"))
     * .organizationRoleName("organizationRoleName")
     * .roleArn("roleArn")
     * .samlConfiguration(SamlConfigurationProperty.builder()
     * .idpMetadata(IdpMetadataProperty.builder()
     * .url("url")
     * .xml("xml")
     * .build())
     * // the properties below are optional
     * .allowedOrganizations(List.of("allowedOrganizations"))
     * .assertionAttributes(AssertionAttributesProperty.builder()
     * .email("email")
     * .groups("groups")
     * .login("login")
     * .name("name")
     * .org("org")
     * .role("role")
     * .build())
     * .loginValidityDuration(123)
     * .roleValues(RoleValuesProperty.builder()
     * .admin(List.of("admin"))
     * .editor(List.of("editor"))
     * .build())
     * .build())
     * .stackSetName("stackSetName")
     * .vpcConfiguration(VpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html)
     */
    public inline fun cfnWorkspace(
        scope: Construct,
        id: String,
        block: CfnWorkspaceDsl.() -> Unit = {},
    ): CfnWorkspace {
        val builder = CfnWorkspaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that defines which attributes in the IdP assertion are to be used to define
     * information about the users authenticated by the IdP to use the workspace.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.grafana.*;
     * AssertionAttributesProperty assertionAttributesProperty = AssertionAttributesProperty.builder()
     * .email("email")
     * .groups("groups")
     * .login("login")
     * .name("name")
     * .org("org")
     * .role("role")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-assertionattributes.html)
     */
    public inline fun cfnWorkspaceAssertionAttributesProperty(
        block: CfnWorkspaceAssertionAttributesPropertyDsl.() -> Unit = {}
    ): CfnWorkspace.AssertionAttributesProperty {
        val builder = CfnWorkspaceAssertionAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure containing the identity provider (IdP) metadata used to integrate the identity
     * provider with this workspace.
     *
     * You can specify the metadata either by providing a URL to its location in the `url`
     * parameter, or by specifying the full metadata in XML format in the `xml` parameter.
     * Specifying both will cause an error.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.grafana.*;
     * IdpMetadataProperty idpMetadataProperty = IdpMetadataProperty.builder()
     * .url("url")
     * .xml("xml")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-idpmetadata.html)
     */
    public inline fun cfnWorkspaceIdpMetadataProperty(
        block: CfnWorkspaceIdpMetadataPropertyDsl.() -> Unit = {}
    ): CfnWorkspace.IdpMetadataProperty {
        val builder = CfnWorkspaceIdpMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration settings for in-bound network access to your workspace.
     *
     * When this is configured, only listed IP addresses and VPC endpoints will be able to access
     * your workspace. Standard Grafana authentication and authorization are still required.
     *
     * Access is granted to a caller that is in either the IP address list or the VPC endpoint
     * list - they do not need to be in both.
     *
     * If this is not configured, or is removed, then all IP addresses and VPC endpoints are
     * allowed. Standard Grafana authentication and authorization are still required.
     *
     * While both `prefixListIds` and `vpceIds` are required, you can pass in an empty array of
     * strings for either parameter if you do not want to allow any of that type.
     *
     * If both are passed as empty arrays, no traffic is allowed to the workspace, because only
     * *explicitly* allowed connections are accepted.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.grafana.*;
     * NetworkAccessControlProperty networkAccessControlProperty =
     * NetworkAccessControlProperty.builder()
     * .prefixListIds(List.of("prefixListIds"))
     * .vpceIds(List.of("vpceIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-networkaccesscontrol.html)
     */
    public inline fun cfnWorkspaceNetworkAccessControlProperty(
        block: CfnWorkspaceNetworkAccessControlPropertyDsl.() -> Unit = {}
    ): CfnWorkspace.NetworkAccessControlProperty {
        val builder = CfnWorkspaceNetworkAccessControlPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWorkspace`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.grafana.*;
     * CfnWorkspaceProps cfnWorkspaceProps = CfnWorkspaceProps.builder()
     * .accountAccessType("accountAccessType")
     * .authenticationProviders(List.of("authenticationProviders"))
     * .permissionType("permissionType")
     * // the properties below are optional
     * .clientToken("clientToken")
     * .dataSources(List.of("dataSources"))
     * .description("description")
     * .grafanaVersion("grafanaVersion")
     * .name("name")
     * .networkAccessControl(NetworkAccessControlProperty.builder()
     * .prefixListIds(List.of("prefixListIds"))
     * .vpceIds(List.of("vpceIds"))
     * .build())
     * .notificationDestinations(List.of("notificationDestinations"))
     * .organizationalUnits(List.of("organizationalUnits"))
     * .organizationRoleName("organizationRoleName")
     * .roleArn("roleArn")
     * .samlConfiguration(SamlConfigurationProperty.builder()
     * .idpMetadata(IdpMetadataProperty.builder()
     * .url("url")
     * .xml("xml")
     * .build())
     * // the properties below are optional
     * .allowedOrganizations(List.of("allowedOrganizations"))
     * .assertionAttributes(AssertionAttributesProperty.builder()
     * .email("email")
     * .groups("groups")
     * .login("login")
     * .name("name")
     * .org("org")
     * .role("role")
     * .build())
     * .loginValidityDuration(123)
     * .roleValues(RoleValuesProperty.builder()
     * .admin(List.of("admin"))
     * .editor(List.of("editor"))
     * .build())
     * .build())
     * .stackSetName("stackSetName")
     * .vpcConfiguration(VpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-grafana-workspace.html)
     */
    public inline fun cfnWorkspaceProps(
        block: CfnWorkspacePropsDsl.() -> Unit = {}
    ): CfnWorkspaceProps {
        val builder = CfnWorkspacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure defines which groups defined in the SAML assertion attribute are to be mapped
     * to the Grafana `Admin` and `Editor` roles in the workspace.
     *
     * SAML authenticated users not part of `Admin` or `Editor` role groups have `Viewer` permission
     * over the workspace.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.grafana.*;
     * RoleValuesProperty roleValuesProperty = RoleValuesProperty.builder()
     * .admin(List.of("admin"))
     * .editor(List.of("editor"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-rolevalues.html)
     */
    public inline fun cfnWorkspaceRoleValuesProperty(
        block: CfnWorkspaceRoleValuesPropertyDsl.() -> Unit = {}
    ): CfnWorkspace.RoleValuesProperty {
        val builder = CfnWorkspaceRoleValuesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure containing information about how this workspace works with SAML.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.grafana.*;
     * SamlConfigurationProperty samlConfigurationProperty = SamlConfigurationProperty.builder()
     * .idpMetadata(IdpMetadataProperty.builder()
     * .url("url")
     * .xml("xml")
     * .build())
     * // the properties below are optional
     * .allowedOrganizations(List.of("allowedOrganizations"))
     * .assertionAttributes(AssertionAttributesProperty.builder()
     * .email("email")
     * .groups("groups")
     * .login("login")
     * .name("name")
     * .org("org")
     * .role("role")
     * .build())
     * .loginValidityDuration(123)
     * .roleValues(RoleValuesProperty.builder()
     * .admin(List.of("admin"))
     * .editor(List.of("editor"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-samlconfiguration.html)
     */
    public inline fun cfnWorkspaceSamlConfigurationProperty(
        block: CfnWorkspaceSamlConfigurationPropertyDsl.() -> Unit = {}
    ): CfnWorkspace.SamlConfigurationProperty {
        val builder = CfnWorkspaceSamlConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration settings for an Amazon VPC that contains data sources for your Grafana
     * workspace to connect to.
     *
     * Provided `securityGroupIds` and `subnetIds` must be part of the same VPC.
     *
     * Connecting to a private VPC is not yet available in the Asia Pacific (Seoul) Region
     * (ap-northeast-2).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.grafana.*;
     * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-vpcconfiguration.html)
     */
    public inline fun cfnWorkspaceVpcConfigurationProperty(
        block: CfnWorkspaceVpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnWorkspace.VpcConfigurationProperty {
        val builder = CfnWorkspaceVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}

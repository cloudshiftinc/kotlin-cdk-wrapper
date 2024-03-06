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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnStudioProps

/**
 * Properties for defining a `CfnStudio`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * CfnStudioProps cfnStudioProps = CfnStudioProps.builder()
 * .authMode("authMode")
 * .defaultS3Location("defaultS3Location")
 * .engineSecurityGroupId("engineSecurityGroupId")
 * .name("name")
 * .serviceRole("serviceRole")
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .workspaceSecurityGroupId("workspaceSecurityGroupId")
 * // the properties below are optional
 * .description("description")
 * .encryptionKeyArn("encryptionKeyArn")
 * .idcInstanceArn("idcInstanceArn")
 * .idcUserAssignment("idcUserAssignment")
 * .idpAuthUrl("idpAuthUrl")
 * .idpRelayStateParameterName("idpRelayStateParameterName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trustedIdentityPropagationEnabled(false)
 * .userRole("userRole")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-studio.html)
 */
@CdkDslMarker
public class CfnStudioPropsDsl {
    private val cdkBuilder: CfnStudioProps.Builder = CfnStudioProps.builder()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param authMode Specifies whether the Studio authenticates users using IAM Identity Center or
     *   IAM.
     */
    public fun authMode(authMode: String) {
        cdkBuilder.authMode(authMode)
    }

    /**
     * @param defaultS3Location The Amazon S3 location to back up EMR Studio Workspaces and notebook
     *   files.
     */
    public fun defaultS3Location(defaultS3Location: String) {
        cdkBuilder.defaultS3Location(defaultS3Location)
    }

    /** @param description A detailed description of the Amazon EMR Studio. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param encryptionKeyArn The AWS KMS key identifier (ARN) used to encrypt Amazon EMR Studio
     *   workspace and notebook files when backed up to Amazon S3.
     */
    public fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    /**
     * @param engineSecurityGroupId The ID of the Amazon EMR Studio Engine security group. The
     *   Engine security group allows inbound network traffic from the Workspace security group, and
     *   it must be in the same VPC specified by `VpcId` .
     */
    public fun engineSecurityGroupId(engineSecurityGroupId: String) {
        cdkBuilder.engineSecurityGroupId(engineSecurityGroupId)
    }

    /**
     * @param idcInstanceArn The ARN of the IAM Identity Center instance the Studio application
     *   belongs to.
     */
    public fun idcInstanceArn(idcInstanceArn: String) {
        cdkBuilder.idcInstanceArn(idcInstanceArn)
    }

    /**
     * @param idcUserAssignment Indicates whether the Studio has `REQUIRED` or `OPTIONAL` IAM
     *   Identity Center user assignment. If the value is set to `REQUIRED` , users must be
     *   explicitly assigned to the Studio application to access the Studio.
     */
    public fun idcUserAssignment(idcUserAssignment: String) {
        cdkBuilder.idcUserAssignment(idcUserAssignment)
    }

    /**
     * @param idpAuthUrl Your identity provider's authentication endpoint. Amazon EMR Studio
     *   redirects federated users to this endpoint for authentication when logging in to a Studio
     *   with the Studio URL.
     */
    public fun idpAuthUrl(idpAuthUrl: String) {
        cdkBuilder.idpAuthUrl(idpAuthUrl)
    }

    /**
     * @param idpRelayStateParameterName The name of your identity provider's `RelayState`
     *   parameter.
     */
    public fun idpRelayStateParameterName(idpRelayStateParameterName: String) {
        cdkBuilder.idpRelayStateParameterName(idpRelayStateParameterName)
    }

    /** @param name A descriptive name for the Amazon EMR Studio. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param serviceRole The Amazon Resource Name (ARN) of the IAM role that will be assumed by the
     *   Amazon EMR Studio. The service role provides a way for Amazon EMR Studio to interoperate
     *   with other AWS services.
     */
    public fun serviceRole(serviceRole: String) {
        cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * @param subnetIds A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can
     *   have a maximum of 5 subnets. The subnets must belong to the VPC specified by `VpcId` .
     *   Studio users can create a Workspace in any of the specified subnets.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can
     *   have a maximum of 5 subnets. The subnets must belong to the VPC specified by `VpcId` .
     *   Studio users can create a Workspace in any of the specified subnets.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param trustedIdentityPropagationEnabled Indicates whether the Studio has Trusted identity
     *   propagation enabled. The default value is `false` .
     */
    public fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: Boolean) {
        cdkBuilder.trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled)
    }

    /**
     * @param trustedIdentityPropagationEnabled Indicates whether the Studio has Trusted identity
     *   propagation enabled. The default value is `false` .
     */
    public fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: IResolvable) {
        cdkBuilder.trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled)
    }

    /**
     * @param userRole The Amazon Resource Name (ARN) of the IAM user role that will be assumed by
     *   users and groups logged in to a Studio. The permissions attached to this IAM role can be
     *   scoped down for each user or group using session policies. You only need to specify
     *   `UserRole` when you set `AuthMode` to `SSO` .
     */
    public fun userRole(userRole: String) {
        cdkBuilder.userRole(userRole)
    }

    /**
     * @param vpcId The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the
     *   Studio.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    /**
     * @param workspaceSecurityGroupId The ID of the Workspace security group associated with the
     *   Amazon EMR Studio. The Workspace security group allows outbound network traffic to
     *   resources in the Engine security group and to the internet.
     */
    public fun workspaceSecurityGroupId(workspaceSecurityGroupId: String) {
        cdkBuilder.workspaceSecurityGroupId(workspaceSecurityGroupId)
    }

    public fun build(): CfnStudioProps {
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

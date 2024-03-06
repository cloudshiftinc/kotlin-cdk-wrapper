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

package io.cloudshiftdev.awscdkdsl.services.proton

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection
import software.constructs.Construct

/**
 * Detailed data of an AWS Proton environment account connection resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.proton.*;
 * CfnEnvironmentAccountConnection cfnEnvironmentAccountConnection =
 * CfnEnvironmentAccountConnection.Builder.create(this, "MyCfnEnvironmentAccountConnection")
 * .codebuildRoleArn("codebuildRoleArn")
 * .componentRoleArn("componentRoleArn")
 * .environmentAccountId("environmentAccountId")
 * .environmentName("environmentName")
 * .managementAccountId("managementAccountId")
 * .roleArn("roleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html)
 */
@CdkDslMarker
public class CfnEnvironmentAccountConnectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnvironmentAccountConnection.Builder =
        CfnEnvironmentAccountConnection.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Amazon Resource Name (ARN) of an IAM service role in the environment account.
     *
     * AWS Proton uses this role to provision infrastructure resources using CodeBuild-based
     * provisioning in the associated environment account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-codebuildrolearn)
     *
     * @param codebuildRoleArn The Amazon Resource Name (ARN) of an IAM service role in the
     *   environment account.
     */
    public fun codebuildRoleArn(codebuildRoleArn: String) {
        cdkBuilder.codebuildRoleArn(codebuildRoleArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM service role that AWS Proton uses when provisioning
     * directly defined components in the associated environment account.
     *
     * It determines the scope of infrastructure that a component can provision in the account.
     *
     * The environment account connection must have a `componentRoleArn` to allow directly defined
     * components to be associated with any environments running in the account.
     *
     * For more information about components, see
     * [AWS Proton components](https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html)
     * in the *AWS Proton User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-componentrolearn)
     *
     * @param componentRoleArn The Amazon Resource Name (ARN) of the IAM service role that AWS
     *   Proton uses when provisioning directly defined components in the associated environment
     *   account.
     */
    public fun componentRoleArn(componentRoleArn: String) {
        cdkBuilder.componentRoleArn(componentRoleArn)
    }

    /**
     * The environment account that's connected to the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-environmentaccountid)
     *
     * @param environmentAccountId The environment account that's connected to the environment
     *   account connection.
     */
    public fun environmentAccountId(environmentAccountId: String) {
        cdkBuilder.environmentAccountId(environmentAccountId)
    }

    /**
     * The name of the environment that's associated with the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-environmentname)
     *
     * @param environmentName The name of the environment that's associated with the environment
     *   account connection.
     */
    public fun environmentName(environmentName: String) {
        cdkBuilder.environmentName(environmentName)
    }

    /**
     * The ID of the management account that's connected to the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-managementaccountid)
     *
     * @param managementAccountId The ID of the management account that's connected to the
     *   environment account connection.
     */
    public fun managementAccountId(managementAccountId: String) {
        cdkBuilder.managementAccountId(managementAccountId)
    }

    /**
     * The IAM service role that's associated with the environment account connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-rolearn)
     *
     * @param roleArn The IAM service role that's associated with the environment account
     *   connection.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * An optional list of metadata items that you can associate with the AWS Proton environment
     * account connection.
     *
     * A tag is a key-value pair.
     *
     * For more information, see
     * [AWS Proton resources and tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html)
     * in the *AWS Proton User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-tags)
     *
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     *   environment account connection.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An optional list of metadata items that you can associate with the AWS Proton environment
     * account connection.
     *
     * A tag is a key-value pair.
     *
     * For more information, see
     * [AWS Proton resources and tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html)
     * in the *AWS Proton User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmentaccountconnection.html#cfn-proton-environmentaccountconnection-tags)
     *
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     *   environment account connection.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEnvironmentAccountConnection {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

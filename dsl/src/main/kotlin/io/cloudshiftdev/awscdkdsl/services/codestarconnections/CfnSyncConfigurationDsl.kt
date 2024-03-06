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

package io.cloudshiftdev.awscdkdsl.services.codestarconnections

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration
import software.constructs.Construct

/**
 * Information, such as repository, branch, provider, and resource names for a specific sync
 * configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codestarconnections.*;
 * CfnSyncConfiguration cfnSyncConfiguration = CfnSyncConfiguration.Builder.create(this,
 * "MyCfnSyncConfiguration")
 * .branch("branch")
 * .configFile("configFile")
 * .repositoryLinkId("repositoryLinkId")
 * .resourceName("resourceName")
 * .roleArn("roleArn")
 * .syncType("syncType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html)
 */
@CdkDslMarker
public class CfnSyncConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSyncConfiguration.Builder =
        CfnSyncConfiguration.Builder.create(scope, id)

    /**
     * The branch associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-branch)
     *
     * @param branch The branch associated with a specific sync configuration.
     */
    public fun branch(branch: String) {
        cdkBuilder.branch(branch)
    }

    /**
     * The file path to the configuration file associated with a specific sync configuration.
     *
     * The path should point to an actual file in the sync configurations linked repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-configfile)
     *
     * @param configFile The file path to the configuration file associated with a specific sync
     *   configuration.
     */
    public fun configFile(configFile: String) {
        cdkBuilder.configFile(configFile)
    }

    /**
     * The ID of the repository link associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-repositorylinkid)
     *
     * @param repositoryLinkId The ID of the repository link associated with a specific sync
     *   configuration.
     */
    public fun repositoryLinkId(repositoryLinkId: String) {
        cdkBuilder.repositoryLinkId(repositoryLinkId)
    }

    /**
     * The name of the connection resource associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-resourcename)
     *
     * @param resourceName The name of the connection resource associated with a specific sync
     *   configuration.
     */
    public fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role associated with a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role associated with a specific sync
     *   configuration.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * The type of sync for a specific sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html#cfn-codestarconnections-syncconfiguration-synctype)
     *
     * @param syncType The type of sync for a specific sync configuration.
     */
    public fun syncType(syncType: String) {
        cdkBuilder.syncType(syncType)
    }

    public fun build(): CfnSyncConfiguration = cdkBuilder.build()
}

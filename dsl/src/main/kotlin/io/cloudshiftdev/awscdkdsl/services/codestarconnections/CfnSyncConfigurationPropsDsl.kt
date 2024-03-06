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
import software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps

/**
 * Properties for defining a `CfnSyncConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codestarconnections.*;
 * CfnSyncConfigurationProps cfnSyncConfigurationProps = CfnSyncConfigurationProps.builder()
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
public class CfnSyncConfigurationPropsDsl {
    private val cdkBuilder: CfnSyncConfigurationProps.Builder = CfnSyncConfigurationProps.builder()

    /** @param branch The branch associated with a specific sync configuration. */
    public fun branch(branch: String) {
        cdkBuilder.branch(branch)
    }

    /**
     * @param configFile The file path to the configuration file associated with a specific sync
     *   configuration. The path should point to an actual file in the sync configurations linked
     *   repository.
     */
    public fun configFile(configFile: String) {
        cdkBuilder.configFile(configFile)
    }

    /**
     * @param repositoryLinkId The ID of the repository link associated with a specific sync
     *   configuration.
     */
    public fun repositoryLinkId(repositoryLinkId: String) {
        cdkBuilder.repositoryLinkId(repositoryLinkId)
    }

    /**
     * @param resourceName The name of the connection resource associated with a specific sync
     *   configuration.
     */
    public fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role associated with a specific sync
     *   configuration.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param syncType The type of sync for a specific sync configuration. */
    public fun syncType(syncType: String) {
        cdkBuilder.syncType(syncType)
    }

    public fun build(): CfnSyncConfigurationProps = cdkBuilder.build()
}

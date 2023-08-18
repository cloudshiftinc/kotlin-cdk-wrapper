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

package io.cloudshiftdev.awscdkdsl.services.ecr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import software.constructs.Construct

/**
 * The `AWS::ECR::ReplicationConfiguration` resource creates or updates the replication
 * configuration for a private registry.
 *
 * The first time a replication configuration is applied to a private registry, a service-linked IAM
 * role is created in your account for the replication process. For more information, see
 * [Using Service-Linked Roles for Amazon ECR](https://docs.aws.amazon.com/AmazonECR/latest/userguide/using-service-linked-roles.html)
 * in the *Amazon Elastic Container Registry User Guide* .
 *
 * When configuring cross-account replication, the destination account must grant the source account
 * permission to replicate. This permission is controlled using a private registry permissions
 * policy. For more information, see `AWS::ECR::RegistryPolicy` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * CfnReplicationConfiguration cfnReplicationConfiguration =
 * CfnReplicationConfiguration.Builder.create(this, "MyCfnReplicationConfiguration")
 * .replicationConfiguration(ReplicationConfigurationProperty.builder()
 * .rules(List.of(ReplicationRuleProperty.builder()
 * .destinations(List.of(ReplicationDestinationProperty.builder()
 * .region("region")
 * .registryId("registryId")
 * .build()))
 * // the properties below are optional
 * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
 * .filter("filter")
 * .filterType("filterType")
 * .build()))
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html)
 */
@CdkDslMarker
public class CfnReplicationConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReplicationConfiguration.Builder =
        CfnReplicationConfiguration.Builder.create(scope, id)

    /**
     * The replication configuration for a registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
     *
     * @param replicationConfiguration The replication configuration for a registry.
     */
    public fun replicationConfiguration(replicationConfiguration: IResolvable) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    /**
     * The replication configuration for a registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
     *
     * @param replicationConfiguration The replication configuration for a registry.
     */
    public fun replicationConfiguration(
        replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty
    ) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    public fun build(): CfnReplicationConfiguration = cdkBuilder.build()
}

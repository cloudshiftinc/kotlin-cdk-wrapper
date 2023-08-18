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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnReplicationConfig
import software.amazon.awscdk.services.dms.CfnReplicationConfigProps

/**
 * Properties for defining a `CfnReplicationConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * Object replicationSettings;
 * Object supplementalSettings;
 * Object tableMappings;
 * CfnReplicationConfigProps cfnReplicationConfigProps = CfnReplicationConfigProps.builder()
 * .computeConfig(ComputeConfigProperty.builder()
 * .maxCapacityUnits(123)
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .dnsNameServers("dnsNameServers")
 * .kmsKeyId("kmsKeyId")
 * .minCapacityUnits(123)
 * .multiAz(false)
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .replicationSubnetGroupId("replicationSubnetGroupId")
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build())
 * .replicationConfigArn("replicationConfigArn")
 * .replicationConfigIdentifier("replicationConfigIdentifier")
 * .replicationSettings(replicationSettings)
 * .replicationType("replicationType")
 * .resourceIdentifier("resourceIdentifier")
 * .sourceEndpointArn("sourceEndpointArn")
 * .supplementalSettings(supplementalSettings)
 * .tableMappings(tableMappings)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetEndpointArn("targetEndpointArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationconfig.html)
 */
@CdkDslMarker
public class CfnReplicationConfigPropsDsl {
    private val cdkBuilder: CfnReplicationConfigProps.Builder = CfnReplicationConfigProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     *   replication.
     */
    public fun computeConfig(computeConfig: IResolvable) {
        cdkBuilder.computeConfig(computeConfig)
    }

    /**
     * @param computeConfig Configuration parameters for provisioning an AWS DMS Serverless
     *   replication.
     */
    public fun computeConfig(computeConfig: CfnReplicationConfig.ComputeConfigProperty) {
        cdkBuilder.computeConfig(computeConfig)
    }

    /**
     * @param replicationConfigArn The Amazon Resource Name (ARN) of this AWS DMS Serverless
     *   replication configuration.
     */
    public fun replicationConfigArn(replicationConfigArn: String) {
        cdkBuilder.replicationConfigArn(replicationConfigArn)
    }

    /**
     * @param replicationConfigIdentifier A unique identifier that you want to use to create a
     *   `ReplicationConfigArn` that is returned as part of the output from this action. You can
     *   then pass this output `ReplicationConfigArn` as the value of the `ReplicationConfigArn`
     *   option for other actions to identify both AWS DMS Serverless replications and replication
     *   configurations that you want those actions to operate on. For some actions, you can also
     *   use either this unique identifier or a corresponding ARN in action filters to identify the
     *   specific replication and replication configuration to operate on.
     */
    public fun replicationConfigIdentifier(replicationConfigIdentifier: String) {
        cdkBuilder.replicationConfigIdentifier(replicationConfigIdentifier)
    }

    /**
     * @param replicationSettings Optional JSON settings for AWS DMS Serverless replications that
     *   are provisioned using this replication configuration. For example, see
     *   [Change processing tuning settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
     *   .
     */
    public fun replicationSettings(replicationSettings: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(replicationSettings)
        cdkBuilder.replicationSettings(builder.map)
    }

    /**
     * @param replicationSettings Optional JSON settings for AWS DMS Serverless replications that
     *   are provisioned using this replication configuration. For example, see
     *   [Change processing tuning settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
     *   .
     */
    public fun replicationSettings(replicationSettings: Any) {
        cdkBuilder.replicationSettings(replicationSettings)
    }

    /**
     * @param replicationType The type of AWS DMS Serverless replication to provision using this
     *   replication configuration. Possible values:
     * * `"full-load"`
     * * `"cdc"`
     * * `"full-load-and-cdc"`
     */
    public fun replicationType(replicationType: String) {
        cdkBuilder.replicationType(replicationType)
    }

    /**
     * @param resourceIdentifier Optional unique value or name that you set for a given resource
     *   that can be used to construct an Amazon Resource Name (ARN) for that resource. For more
     *   information, see
     *   [Fine-grained access control using resource names and tags](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess)
     *   .
     */
    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * @param sourceEndpointArn The Amazon Resource Name (ARN) of the source endpoint for this AWS
     *   DMS Serverless replication configuration.
     */
    public fun sourceEndpointArn(sourceEndpointArn: String) {
        cdkBuilder.sourceEndpointArn(sourceEndpointArn)
    }

    /**
     * @param supplementalSettings Optional JSON settings for specifying supplemental data. For more
     *   information, see
     *   [Specifying supplemental data for task settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html)
     *   .
     */
    public fun supplementalSettings(supplementalSettings: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(supplementalSettings)
        cdkBuilder.supplementalSettings(builder.map)
    }

    /**
     * @param supplementalSettings Optional JSON settings for specifying supplemental data. For more
     *   information, see
     *   [Specifying supplemental data for task settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html)
     *   .
     */
    public fun supplementalSettings(supplementalSettings: Any) {
        cdkBuilder.supplementalSettings(supplementalSettings)
    }

    /**
     * @param tableMappings JSON table mappings for AWS DMS Serverless replications that are
     *   provisioned using this replication configuration. For more information, see
     *   [Specifying table selection and transformations rules using JSON](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html)
     *   .
     */
    public fun tableMappings(tableMappings: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tableMappings)
        cdkBuilder.tableMappings(builder.map)
    }

    /**
     * @param tableMappings JSON table mappings for AWS DMS Serverless replications that are
     *   provisioned using this replication configuration. For more information, see
     *   [Specifying table selection and transformations rules using JSON](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.html)
     *   .
     */
    public fun tableMappings(tableMappings: Any) {
        cdkBuilder.tableMappings(tableMappings)
    }

    /**
     * @param tags One or more optional tags associated with resources used by the AWS DMS
     *   Serverless replication. For more information, see
     *   [Tagging resources in AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags One or more optional tags associated with resources used by the AWS DMS
     *   Serverless replication. For more information, see
     *   [Tagging resources in AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tagging.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param targetEndpointArn The Amazon Resource Name (ARN) of the target endpoint for this AWS
     *   DMS serverless replication configuration.
     */
    public fun targetEndpointArn(targetEndpointArn: String) {
        cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    public fun build(): CfnReplicationConfigProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

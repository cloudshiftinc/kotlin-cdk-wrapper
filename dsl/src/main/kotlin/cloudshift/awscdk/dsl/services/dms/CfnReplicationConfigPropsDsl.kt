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

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
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
     * @param computeConfig Configuration parameters for provisioning a AWS DMS Serverless
     *   replication.
     */
    public fun computeConfig(computeConfig: IResolvable) {
        cdkBuilder.computeConfig(computeConfig)
    }

    /**
     * @param computeConfig Configuration parameters for provisioning a AWS DMS Serverless
     *   replication.
     */
    public fun computeConfig(computeConfig: CfnReplicationConfig.ComputeConfigProperty) {
        cdkBuilder.computeConfig(computeConfig)
    }

    /** @param replicationConfigArn the value to be set. */
    public fun replicationConfigArn(replicationConfigArn: String) {
        cdkBuilder.replicationConfigArn(replicationConfigArn)
    }

    /** @param replicationConfigIdentifier A unique identifier of replication configuration. */
    public fun replicationConfigIdentifier(replicationConfigIdentifier: String) {
        cdkBuilder.replicationConfigIdentifier(replicationConfigIdentifier)
    }

    /**
     * @param replicationSettings JSON settings for Servereless replications that are provisioned
     *   using this replication configuration.
     */
    public fun replicationSettings(replicationSettings: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(replicationSettings)
        cdkBuilder.replicationSettings(builder.map)
    }

    /**
     * @param replicationSettings JSON settings for Servereless replications that are provisioned
     *   using this replication configuration.
     */
    public fun replicationSettings(replicationSettings: Any) {
        cdkBuilder.replicationSettings(replicationSettings)
    }

    /**
     * @param replicationType The type of AWS DMS Serverless replication to provision using this
     *   replication configuration.
     */
    public fun replicationType(replicationType: String) {
        cdkBuilder.replicationType(replicationType)
    }

    /**
     * @param resourceIdentifier A unique value or name that you get set for a given resource that
     *   can be used to construct an Amazon Resource Name (ARN) for that resource.
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

    /** @param supplementalSettings JSON settings for specifying supplemental data. */
    public fun supplementalSettings(supplementalSettings: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(supplementalSettings)
        cdkBuilder.supplementalSettings(builder.map)
    }

    /** @param supplementalSettings JSON settings for specifying supplemental data. */
    public fun supplementalSettings(supplementalSettings: Any) {
        cdkBuilder.supplementalSettings(supplementalSettings)
    }

    /**
     * @param tableMappings JSON table mappings for AWS DMS Serverless replications that are
     *   provisioned using this replication configuration.
     */
    public fun tableMappings(tableMappings: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tableMappings)
        cdkBuilder.tableMappings(builder.map)
    }

    /**
     * @param tableMappings JSON table mappings for AWS DMS Serverless replications that are
     *   provisioned using this replication configuration.
     */
    public fun tableMappings(tableMappings: Any) {
        cdkBuilder.tableMappings(tableMappings)
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     *   the dataset.</p>.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Contains a map of the key-value pairs for the resource tag or tags assigned to
     *   the dataset.</p>.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param targetEndpointArn The Amazon Resource Name (ARN) of the target endpoint for this AWS
     *   DMS Serverless replication configuration.
     */
    public fun targetEndpointArn(targetEndpointArn: String) {
        cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    public fun build(): CfnReplicationConfigProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

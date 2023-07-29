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

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet
import software.constructs.Construct

/**
 * The `AWS::SSMIncidents::ReplicationSet` resource specifies a set of Regions that Incident Manager
 * data is replicated to and the KMS key used to encrypt the data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * CfnReplicationSet cfnReplicationSet = CfnReplicationSet.Builder.create(this,
 * "MyCfnReplicationSet")
 * .regions(List.of(ReplicationRegionProperty.builder()
 * .regionConfiguration(RegionConfigurationProperty.builder()
 * .sseKmsKeyId("sseKmsKeyId")
 * .build())
 * .regionName("regionName")
 * .build()))
 * // the properties below are optional
 * .deletionProtected(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html)
 */
@CdkDslMarker
public class CfnReplicationSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReplicationSet.Builder = CfnReplicationSet.Builder.create(scope, id)

    private val _regions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Determines if the replication set deletion protection is enabled or not.
     *
     * If deletion protection is enabled, you can't delete the last Region in the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-deletionprotected)
     *
     * @param deletionProtected Determines if the replication set deletion protection is enabled or
     *   not.
     */
    public fun deletionProtected(deletionProtected: Boolean) {
        cdkBuilder.deletionProtected(deletionProtected)
    }

    /**
     * Determines if the replication set deletion protection is enabled or not.
     *
     * If deletion protection is enabled, you can't delete the last Region in the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-deletionprotected)
     *
     * @param deletionProtected Determines if the replication set deletion protection is enabled or
     *   not.
     */
    public fun deletionProtected(deletionProtected: IResolvable) {
        cdkBuilder.deletionProtected(deletionProtected)
    }

    /**
     * Specifies the Regions of the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-regions)
     *
     * @param regions Specifies the Regions of the replication set.
     */
    public fun regions(vararg regions: Any) {
        _regions.addAll(listOf(*regions))
    }

    /**
     * Specifies the Regions of the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-regions)
     *
     * @param regions Specifies the Regions of the replication set.
     */
    public fun regions(regions: Collection<Any>) {
        _regions.addAll(regions)
    }

    /**
     * Specifies the Regions of the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-regions)
     *
     * @param regions Specifies the Regions of the replication set.
     */
    public fun regions(regions: IResolvable) {
        cdkBuilder.regions(regions)
    }

    /**
     * A list of tags to add to the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-tags)
     *
     * @param tags A list of tags to add to the replication set.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags to add to the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-tags)
     *
     * @param tags A list of tags to add to the replication set.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnReplicationSet {
        if (_regions.isNotEmpty()) cdkBuilder.regions(_regions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

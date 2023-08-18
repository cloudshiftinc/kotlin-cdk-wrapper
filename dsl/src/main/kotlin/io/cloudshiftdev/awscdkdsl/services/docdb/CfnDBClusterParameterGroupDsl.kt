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

package io.cloudshiftdev.awscdkdsl.services.docdb

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup
import software.constructs.Construct

/**
 * The `AWS::DocDB::DBClusterParameterGroup` Amazon DocumentDB (with MongoDB compatibility) resource
 * describes a DBClusterParameterGroup.
 *
 * For more information, see
 * [DBClusterParameterGroup](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_DBClusterParameterGroup.html)
 * in the *Amazon DocumentDB Developer Guide* .
 *
 * Parameters in a cluster parameter group apply to all of the instances in a cluster.
 *
 * A cluster parameter group is initially created with the default parameters for the database
 * engine used by instances in the cluster. To provide custom values for any of the parameters, you
 * must modify the group after you create it. After you create a DB cluster parameter group, you
 * must associate it with your cluster. For the new cluster parameter group and associated settings
 * to take effect, you must then reboot the DB instances in the cluster without failover.
 *
 * After you create a cluster parameter group, you should wait at least 5 minutes before creating
 * your first cluster that uses that cluster parameter group as the default parameter group. This
 * allows Amazon DocumentDB to fully complete the create action before the cluster parameter group
 * is used as the default for a new cluster. This step is especially important for parameters that
 * are critical when creating the default database for a cluster, such as the character set for the
 * default database defined by the `character_set_database` parameter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdb.*;
 * Object parameters;
 * CfnDBClusterParameterGroup cfnDBClusterParameterGroup =
 * CfnDBClusterParameterGroup.Builder.create(this, "MyCfnDBClusterParameterGroup")
 * .description("description")
 * .family("family")
 * .parameters(parameters)
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html)
 */
@CdkDslMarker
public class CfnDBClusterParameterGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDBClusterParameterGroup.Builder =
        CfnDBClusterParameterGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-description)
     *
     * @param description The description for the cluster parameter group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The cluster parameter group family name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-family)
     *
     * @param family The cluster parameter group family name.
     */
    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    /**
     * The name of the DB cluster parameter group.
     *
     * Constraints:
     * * Must not match the name of an existing `DBClusterParameterGroup` .
     *
     * This value is stored as a lowercase string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-name)
     *
     * @param name The name of the DB cluster parameter group.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Provides a list of parameters for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-parameters)
     *
     * @param parameters Provides a list of parameters for the cluster parameter group.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * Provides a list of parameters for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-parameters)
     *
     * @param parameters Provides a list of parameters for the cluster parameter group.
     */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * The tags to be assigned to the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-tags)
     *
     * @param tags The tags to be assigned to the cluster parameter group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to be assigned to the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-tags)
     *
     * @param tags The tags to be assigned to the cluster parameter group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDBClusterParameterGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

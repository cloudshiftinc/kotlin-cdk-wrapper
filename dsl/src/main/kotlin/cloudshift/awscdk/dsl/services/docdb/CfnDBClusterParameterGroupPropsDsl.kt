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

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps

/**
 * Properties for defining a `CfnDBClusterParameterGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdb.*;
 * Object parameters;
 * CfnDBClusterParameterGroupProps cfnDBClusterParameterGroupProps =
 * CfnDBClusterParameterGroupProps.builder()
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
public class CfnDBClusterParameterGroupPropsDsl {
    private val cdkBuilder: CfnDBClusterParameterGroupProps.Builder =
        CfnDBClusterParameterGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description for the cluster parameter group. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param family The cluster parameter group family name. */
    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    /**
     * @param name The name of the DB cluster parameter group. Constraints:
     * * Must not match the name of an existing `DBClusterParameterGroup` .
     *
     * This value is stored as a lowercase string.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param parameters Provides a list of parameters for the cluster parameter group. */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /** @param parameters Provides a list of parameters for the cluster parameter group. */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /** @param tags The tags to be assigned to the cluster parameter group. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to be assigned to the cluster parameter group. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDBClusterParameterGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

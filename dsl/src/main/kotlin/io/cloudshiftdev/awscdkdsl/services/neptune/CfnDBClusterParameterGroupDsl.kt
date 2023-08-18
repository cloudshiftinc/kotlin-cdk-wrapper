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

package io.cloudshiftdev.awscdkdsl.services.neptune

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroup
import software.constructs.Construct

/**
 * The `AWS::Neptune::DBClusterParameterGroup` resource creates a new Amazon Neptune DB cluster
 * parameter group.
 *
 * Applying a parameter group to a DB cluster might require instances to reboot, resulting in a
 * database outage while the instances reboot. &gt; If you provide a custom
 * `DBClusterParameterGroup` that you associate with the `DBCluster` , it is best to specify an
 * `EngineVersion` property in the `DBCluster` . That `EngineVersion` needs to be compatible with
 * the value of the `Family` property in the `DBClusterParameterGroup` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.neptune.*;
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html)
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
     * Provides the customer-specified description for this DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-description)
     *
     * @param description Provides the customer-specified description for this DB cluster parameter
     *   group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Must be `neptune1` for engine versions prior to
     * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html)
     * , or `neptune1.2` for engine version `1.2.0.0` and higher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-family)
     *
     * @param family Must be `neptune1` for engine versions prior to
     *   [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html)
     *   , or `neptune1.2` for engine version `1.2.0.0` and higher.
     */
    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    /**
     * Provides the name of the DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-name)
     *
     * @param name Provides the name of the DB cluster parameter group.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The parameters to set for this DB cluster parameter group.
     *
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * If you update the parameters, some interruption may occur depending on which parameters you
     * update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-parameters)
     *
     * @param parameters The parameters to set for this DB cluster parameter group.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * The parameters to set for this DB cluster parameter group.
     *
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * If you update the parameters, some interruption may occur depending on which parameters you
     * update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-parameters)
     *
     * @param parameters The parameters to set for this DB cluster parameter group.
     */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * The tags that you want to attach to this parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-tags)
     *
     * @param tags The tags that you want to attach to this parameter group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags that you want to attach to this parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-tags)
     *
     * @param tags The tags that you want to attach to this parameter group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDBClusterParameterGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

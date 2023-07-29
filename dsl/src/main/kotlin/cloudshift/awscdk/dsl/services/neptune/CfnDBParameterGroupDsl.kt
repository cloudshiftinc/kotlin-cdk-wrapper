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

package cloudshift.awscdk.dsl.services.neptune

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.neptune.CfnDBParameterGroup
import software.constructs.Construct

/**
 * `AWS::Neptune::DBParameterGroup` creates a new DB parameter group.
 *
 * This type can be declared in a template and referenced in the `DBParameterGroupName` parameter of
 * `AWS::Neptune::DBInstance` .
 *
 * Applying a parameter group to a DB instance might require the instance to reboot, resulting in a
 * database outage for the duration of the reboot. &gt; If you provide a custom `DBParameterGroup`
 * that you associate with `DBInstance` , it is best to specify an `EngineVersion` property in
 * `DBCluster` . That `EngineVersion` needs to be compatible with the value of the `Family` property
 * in the `DBParameterGroup` .
 *
 * A DB parameter group is initially created with the default parameters for the database engine
 * used by the DB instance. To provide custom values for any of the parameters, you must modify the
 * group after creating it using *ModifyDBParameterGroup* . Once you've created a DB parameter
 * group, you need to associate it with your DB instance using *ModifyDBInstance* . When you
 * associate a new DB parameter group with a running DB instance, you need to reboot the DB instance
 * without failover for the new DB parameter group and associated settings to take effect.
 *
 * After you create a DB parameter group, you should wait at least 5 minutes before creating your
 * first DB instance that uses that DB parameter group as the default parameter group. This allows
 * Amazon Neptune to fully complete the create action before the parameter group is used as the
 * default for a new DB instance. This is especially important for parameters that are critical when
 * creating the default database for a DB instance, such as the character set for the default
 * database defined by the `character_set_database` parameter. You can use the *Parameter Groups*
 * option of the Amazon Neptune console or the *DescribeDBParameters* command to verify that your DB
 * parameter group has been created or modified.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.neptune.*;
 * Object parameters;
 * CfnDBParameterGroup cfnDBParameterGroup = CfnDBParameterGroup.Builder.create(this,
 * "MyCfnDBParameterGroup")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html)
 */
@CdkDslMarker
public class CfnDBParameterGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDBParameterGroup.Builder =
        CfnDBParameterGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Provides the customer-specified description for this DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-description)
     *
     * @param description Provides the customer-specified description for this DB parameter group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Must be `neptune1` for engine versions prior to
     * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html)
     * , or `neptune1.2` for engine version `1.2.0.0` and higher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-family)
     *
     * @param family Must be `neptune1` for engine versions prior to
     *   [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html)
     *   , or `neptune1.2` for engine version `1.2.0.0` and higher.
     */
    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    /**
     * Provides the name of the DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-name)
     *
     * @param name Provides the name of the DB parameter group.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The parameters to set for this DB parameter group.
     *
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * Changes to dynamic parameters are applied immediately. During an update, if you have static
     * parameters (whether they were changed or not), it triggers AWS CloudFormation to reboot the
     * associated DB instance without failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-parameters)
     *
     * @param parameters The parameters to set for this DB parameter group.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * The parameters to set for this DB parameter group.
     *
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * Changes to dynamic parameters are applied immediately. During an update, if you have static
     * parameters (whether they were changed or not), it triggers AWS CloudFormation to reboot the
     * associated DB instance without failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-parameters)
     *
     * @param parameters The parameters to set for this DB parameter group.
     */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * The tags that you want to attach to this parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags)
     *
     * @param tags The tags that you want to attach to this parameter group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags that you want to attach to this parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags)
     *
     * @param tags The tags that you want to attach to this parameter group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDBParameterGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

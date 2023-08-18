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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.rds.CfnDBParameterGroup
import software.constructs.Construct

/**
 * The `AWS::RDS::DBParameterGroup` resource creates a custom parameter group for an RDS database
 * family.
 *
 * This type can be declared in a template and referenced in the `DBParameterGroupName` property of
 * an
 * `[AWS::RDS::DBInstance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html)`
 * resource.
 *
 * For information about configuring parameters for Amazon RDS DB instances, see
 * [Working with parameter groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithParamGroups.html)
 * in the *Amazon RDS User Guide* .
 *
 * For information about configuring parameters for Amazon Aurora DB instances, see
 * [Working with parameter groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
 * in the *Amazon Aurora User Guide* .
 *
 * Applying a parameter group to a DB instance may require the DB instance to reboot, resulting in a
 * database outage for the duration of the reboot.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * Object parameters;
 * CfnDBParameterGroup cfnDBParameterGroup = CfnDBParameterGroup.Builder.create(this,
 * "MyCfnDBParameterGroup")
 * .description("description")
 * .family("family")
 * // the properties below are optional
 * .dbParameterGroupName("dbParameterGroupName")
 * .parameters(parameters)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html)
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
     * The name of the DB parameter group.
     *
     * Constraints:
     * * Must be 1 to 255 letters, numbers, or hyphens.
     * * First character must be a letter
     * * Can't end with a hyphen or contain two consecutive hyphens
     *
     * If you don't specify a value for `DBParameterGroupName` property, a name is automatically
     * created for the DB parameter group.
     *
     * This value is stored as a lowercase string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-dbparametergroupname)
     *
     * @param dbParameterGroupName The name of the DB parameter group.
     */
    public fun dbParameterGroupName(dbParameterGroupName: String) {
        cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

    /**
     * Provides the customer-specified description for this DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-description)
     *
     * @param description Provides the customer-specified description for this DB parameter group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The DB parameter group family name.
     *
     * A DB parameter group can be associated with one and only one DB parameter group family, and
     * can be applied only to a DB instance running a DB engine and engine version compatible with
     * that DB parameter group family.
     *
     * The DB parameter group family can't be changed when updating a DB parameter group.
     *
     * To list all of the available parameter group families, use the following command:
     *
     * `aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"`
     *
     * The output contains duplicates.
     *
     * For more information, see
     * `[CreateDBParameterGroup](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_CreateDBParameterGroup.html)`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-family)
     *
     * @param family The DB parameter group family name.
     */
    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    /**
     * An array of parameter names and values for the parameter update.
     *
     * At least one parameter name and value must be supplied. Subsequent arguments are optional.
     *
     * For more information about DB parameters and DB parameter groups for Amazon RDS DB engines,
     * see
     * [Working with DB Parameter Groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon RDS User Guide* .
     *
     * For more information about DB cluster and DB instance parameters and parameter groups for
     * Amazon Aurora DB engines, see
     * [Working with DB Parameter Groups and DB Cluster Parameter Groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon Aurora User Guide* .
     *
     * AWS CloudFormation doesn't support specifying an apply method for each individual parameter.
     * The default apply method for each parameter is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-parameters)
     *
     * @param parameters An array of parameter names and values for the parameter update.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * An array of parameter names and values for the parameter update.
     *
     * At least one parameter name and value must be supplied. Subsequent arguments are optional.
     *
     * For more information about DB parameters and DB parameter groups for Amazon RDS DB engines,
     * see
     * [Working with DB Parameter Groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon RDS User Guide* .
     *
     * For more information about DB cluster and DB instance parameters and parameter groups for
     * Amazon Aurora DB engines, see
     * [Working with DB Parameter Groups and DB Cluster Parameter Groups](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_WorkingWithParamGroups.html)
     * in the *Amazon Aurora User Guide* .
     *
     * AWS CloudFormation doesn't support specifying an apply method for each individual parameter.
     * The default apply method for each parameter is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-parameters)
     *
     * @param parameters An array of parameter names and values for the parameter update.
     */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * An optional array of key-value pairs to apply to this DB parameter group.
     *
     * Currently, this is the only property that supports drift detection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags)
     *
     * @param tags An optional array of key-value pairs to apply to this DB parameter group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An optional array of key-value pairs to apply to this DB parameter group.
     *
     * Currently, this is the only property that supports drift detection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbparametergroup.html#cfn-rds-dbparametergroup-tags)
     *
     * @param tags An optional array of key-value pairs to apply to this DB parameter group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDBParameterGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

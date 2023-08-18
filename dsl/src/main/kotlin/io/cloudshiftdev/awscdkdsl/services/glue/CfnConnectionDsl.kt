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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnConnection
import software.constructs.Construct

/**
 * The `AWS::Glue::Connection` resource specifies an AWS Glue connection to a data source.
 *
 * For more information, see
 * [Adding a Connection to Your Data Store](https://docs.aws.amazon.com/glue/latest/dg/populate-add-connection.html)
 * and
 * [Connection Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-connections.html#aws-glue-api-catalog-connections-Connection)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object connectionProperties;
 * CfnConnection cfnConnection = CfnConnection.Builder.create(this, "MyCfnConnection")
 * .catalogId("catalogId")
 * .connectionInput(ConnectionInputProperty.builder()
 * .connectionType("connectionType")
 * // the properties below are optional
 * .connectionProperties(connectionProperties)
 * .description("description")
 * .matchCriteria(List.of("matchCriteria"))
 * .name("name")
 * .physicalConnectionRequirements(PhysicalConnectionRequirementsProperty.builder()
 * .availabilityZone("availabilityZone")
 * .securityGroupIdList(List.of("securityGroupIdList"))
 * .subnetId("subnetId")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html)
 */
@CdkDslMarker
public class CfnConnectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConnection.Builder = CfnConnection.Builder.create(scope, id)

    /**
     * The ID of the data catalog to create the catalog object in.
     *
     * Currently, this should be the AWS account ID.
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid)
     *
     * @param catalogId The ID of the data catalog to create the catalog object in.
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     *
     * @param connectionInput The connection that you want to create.
     */
    public fun connectionInput(connectionInput: IResolvable) {
        cdkBuilder.connectionInput(connectionInput)
    }

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     *
     * @param connectionInput The connection that you want to create.
     */
    public fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty) {
        cdkBuilder.connectionInput(connectionInput)
    }

    public fun build(): CfnConnection = cdkBuilder.build()
}

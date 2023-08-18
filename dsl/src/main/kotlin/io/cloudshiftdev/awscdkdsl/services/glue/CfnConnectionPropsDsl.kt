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
import software.amazon.awscdk.services.glue.CfnConnectionProps

/**
 * Properties for defining a `CfnConnection`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object connectionProperties;
 * CfnConnectionProps cfnConnectionProps = CfnConnectionProps.builder()
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
public class CfnConnectionPropsDsl {
    private val cdkBuilder: CfnConnectionProps.Builder = CfnConnectionProps.builder()

    /**
     * @param catalogId The ID of the data catalog to create the catalog object in. Currently, this
     *   should be the AWS account ID.
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId` .
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /** @param connectionInput The connection that you want to create. */
    public fun connectionInput(connectionInput: IResolvable) {
        cdkBuilder.connectionInput(connectionInput)
    }

    /** @param connectionInput The connection that you want to create. */
    public fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty) {
        cdkBuilder.connectionInput(connectionInput)
    }

    public fun build(): CfnConnectionProps = cdkBuilder.build()
}

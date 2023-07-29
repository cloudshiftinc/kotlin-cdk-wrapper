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
import kotlin.String
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information, including the Amazon Resource Name (ARN) of the IAM role used to define an
 * Amazon DynamoDB target endpoint.
 *
 * This information also includes the output format of records applied to the endpoint and details
 * of transaction and control table data information. For information about other available
 * settings, see
 * [Using object mapping to migrate data to DynamoDB](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.DynamoDB.html#CHAP_Target.DynamoDB.ObjectMapping)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * DynamoDbSettingsProperty dynamoDbSettingsProperty = DynamoDbSettingsProperty.builder()
 * .serviceAccessRoleArn("serviceAccessRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-dynamodbsettings.html)
 */
@CdkDslMarker
public class CfnEndpointDynamoDbSettingsPropertyDsl {
    private val cdkBuilder: CfnEndpoint.DynamoDbSettingsProperty.Builder =
        CfnEndpoint.DynamoDbSettingsProperty.builder()

    /**
     * @param serviceAccessRoleArn The Amazon Resource Name (ARN) used by the service to access the
     *   IAM role. The role must allow the `iam:PassRole` action.
     */
    public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
    }

    public fun build(): CfnEndpoint.DynamoDbSettingsProperty = cdkBuilder.build()
}

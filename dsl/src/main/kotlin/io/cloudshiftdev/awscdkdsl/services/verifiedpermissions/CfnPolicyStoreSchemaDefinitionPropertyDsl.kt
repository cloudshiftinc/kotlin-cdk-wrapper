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

package io.cloudshiftdev.awscdkdsl.services.verifiedpermissions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore

/**
 * Contains a list of principal types, resource types, and actions that can be specified in policies
 * stored in the same policy store.
 *
 * If the validation mode for the policy store is set to `STRICT` , then policies that can't be
 * validated by this schema are rejected by Verified Permissions and can't be stored in the policy
 * store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * SchemaDefinitionProperty schemaDefinitionProperty = SchemaDefinitionProperty.builder()
 * .cedarJson("cedarJson")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policystore-schemadefinition.html)
 */
@CdkDslMarker
public class CfnPolicyStoreSchemaDefinitionPropertyDsl {
    private val cdkBuilder: CfnPolicyStore.SchemaDefinitionProperty.Builder =
        CfnPolicyStore.SchemaDefinitionProperty.builder()

    /**
     * @param cedarJson A JSON string representation of the schema supported by applications that
     *   use this policy store. For more information, see
     *   [Policy store schema](https://docs.aws.amazon.com/verifiedpermissions/latest/userguide/schema.html)
     *   in the *Amazon Verified Permissions User Guide* .
     */
    public fun cedarJson(cedarJson: String) {
        cdkBuilder.cedarJson(cedarJson)
    }

    public fun build(): CfnPolicyStore.SchemaDefinitionProperty = cdkBuilder.build()
}

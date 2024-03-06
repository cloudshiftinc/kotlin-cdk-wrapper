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
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicy

/**
 * Contains the identifier of an entity in a policy, including its ID and type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * EntityIdentifierProperty entityIdentifierProperty = EntityIdentifierProperty.builder()
 * .entityId("entityId")
 * .entityType("entityType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-entityidentifier.html)
 */
@CdkDslMarker
public class CfnPolicyEntityIdentifierPropertyDsl {
    private val cdkBuilder: CfnPolicy.EntityIdentifierProperty.Builder =
        CfnPolicy.EntityIdentifierProperty.builder()

    /** @param entityId The identifier of an entity. `"entityId":" *identifier* "` */
    public fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
    }

    /** @param entityType The type of an entity. Example: `"entityType":" *typeName* "` */
    public fun entityType(entityType: String) {
        cdkBuilder.entityType(entityType)
    }

    public fun build(): CfnPolicy.EntityIdentifierProperty = cdkBuilder.build()
}

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

package io.cloudshiftdev.awscdkdsl.services.evidently

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnFeature

/**
 * A set of key-value pairs that specify users who should always be served a specific variation of a
 * feature.
 *
 * Each key specifies a user using their user ID, account ID, or some other identifier. The value
 * specifies the name of the variation that the user is to be served.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * EntityOverrideProperty entityOverrideProperty = EntityOverrideProperty.builder()
 * .entityId("entityId")
 * .variation("variation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-feature-entityoverride.html)
 */
@CdkDslMarker
public class CfnFeatureEntityOverridePropertyDsl {
    private val cdkBuilder: CfnFeature.EntityOverrideProperty.Builder =
        CfnFeature.EntityOverrideProperty.builder()

    /** @param entityId The entity ID to be served the variation specified in `Variation` . */
    public fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
    }

    /**
     * @param variation The name of the variation to serve to the user session that matches the
     *   `EntityId` .
     */
    public fun variation(variation: String) {
        cdkBuilder.variation(variation)
    }

    public fun build(): CfnFeature.EntityOverrideProperty = cdkBuilder.build()
}

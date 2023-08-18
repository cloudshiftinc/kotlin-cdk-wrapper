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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * A map in which each key is an event type from an external application such as Segment or Shopify,
 * and each value is an `ObjectTypeName` (template) used to ingest the event.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * ObjectTypeMappingProperty objectTypeMappingProperty = ObjectTypeMappingProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-objecttypemapping.html)
 */
@CdkDslMarker
public class CfnIntegrationObjectTypeMappingPropertyDsl {
    private val cdkBuilder: CfnIntegration.ObjectTypeMappingProperty.Builder =
        CfnIntegration.ObjectTypeMappingProperty.builder()

    /** @param key The key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnIntegration.ObjectTypeMappingProperty = cdkBuilder.build()
}

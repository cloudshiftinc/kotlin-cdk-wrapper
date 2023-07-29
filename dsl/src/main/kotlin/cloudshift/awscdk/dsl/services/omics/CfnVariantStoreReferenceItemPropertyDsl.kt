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

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.omics.CfnVariantStore

/**
 * The read set's genome reference ARN.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * ReferenceItemProperty referenceItemProperty = ReferenceItemProperty.builder()
 * .referenceArn("referenceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-variantstore-referenceitem.html)
 */
@CdkDslMarker
public class CfnVariantStoreReferenceItemPropertyDsl {
    private val cdkBuilder: CfnVariantStore.ReferenceItemProperty.Builder =
        CfnVariantStore.ReferenceItemProperty.builder()

    /** @param referenceArn The reference's ARN. */
    public fun referenceArn(referenceArn: String) {
        cdkBuilder.referenceArn(referenceArn)
    }

    public fun build(): CfnVariantStore.ReferenceItemProperty = cdkBuilder.build()
}

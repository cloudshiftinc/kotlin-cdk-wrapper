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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps

/**
 * Properties for defining a `CfnTagOptionAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnTagOptionAssociationProps cfnTagOptionAssociationProps =
 * CfnTagOptionAssociationProps.builder()
 * .resourceId("resourceId")
 * .tagOptionId("tagOptionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html)
 */
@CdkDslMarker
public class CfnTagOptionAssociationPropsDsl {
    private val cdkBuilder: CfnTagOptionAssociationProps.Builder =
        CfnTagOptionAssociationProps.builder()

    /** @param resourceId The resource identifier. */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /** @param tagOptionId The TagOption identifier. */
    public fun tagOptionId(tagOptionId: String) {
        cdkBuilder.tagOptionId(tagOptionId)
    }

    public fun build(): CfnTagOptionAssociationProps = cdkBuilder.build()
}

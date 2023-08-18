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

package io.cloudshiftdev.awscdkdsl.services.securityhub

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

/**
 * Provides details about a list of findings that the current finding relates to.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.securityhub.*;
 * Object id;
 * RelatedFindingProperty relatedFindingProperty = RelatedFindingProperty.builder()
 * .id(id)
 * .productArn("productArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-relatedfinding.html)
 */
@CdkDslMarker
public class CfnAutomationRuleRelatedFindingPropertyDsl {
    private val cdkBuilder: CfnAutomationRule.RelatedFindingProperty.Builder =
        CfnAutomationRule.RelatedFindingProperty.builder()

    /** @param id The product-generated identifier for a related finding. */
    public fun id(id: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(id)
        cdkBuilder.id(builder.map)
    }

    /** @param id The product-generated identifier for a related finding. */
    public fun id(id: Any) {
        cdkBuilder.id(id)
    }

    /**
     * @param productArn The Amazon Resource Name (ARN) for the product that generated a related
     *   finding.
     */
    public fun productArn(productArn: String) {
        cdkBuilder.productArn(productArn)
    }

    public fun build(): CfnAutomationRule.RelatedFindingProperty = cdkBuilder.build()
}

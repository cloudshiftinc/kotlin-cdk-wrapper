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
import kotlin.collections.List
import kotlin.collections.Map
import software.amazon.awscdk.services.servicecatalog.TagOptionsProps

/**
 * Properties for TagOptions.
 *
 * Example:
 * ```
 * Portfolio portfolio;
 * CloudFormationProduct product;
 * TagOptions tagOptionsForPortfolio = TagOptions.Builder.create(this, "OrgTagOptions")
 * .allowedValuesForTags(Map.of(
 * "Group", List.of("finance", "engineering", "marketing", "research"),
 * "CostCenter", List.of("01", "02", "03")))
 * .build();
 * portfolio.associateTagOptions(tagOptionsForPortfolio);
 * TagOptions tagOptionsForProduct = TagOptions.Builder.create(this, "ProductTagOptions")
 * .allowedValuesForTags(Map.of(
 * "Environment", List.of("dev", "alpha", "prod")))
 * .build();
 * product.associateTagOptions(tagOptionsForProduct);
 * ```
 */
@CdkDslMarker
public class TagOptionsPropsDsl {
    private val cdkBuilder: TagOptionsProps.Builder = TagOptionsProps.builder()

    /**
     * @param allowedValuesForTags The values that are allowed to be set for specific tags. The keys
     *   of the map represent the tag keys, and the values of the map are a list of allowed values
     *   for that particular tag key.
     */
    public fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>) {
        cdkBuilder.allowedValuesForTags(allowedValuesForTags)
    }

    public fun build(): TagOptionsProps = cdkBuilder.build()
}

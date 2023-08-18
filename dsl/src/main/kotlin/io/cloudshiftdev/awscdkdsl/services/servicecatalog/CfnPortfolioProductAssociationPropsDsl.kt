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

package io.cloudshiftdev.awscdkdsl.services.servicecatalog

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps

/**
 * Properties for defining a `CfnPortfolioProductAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnPortfolioProductAssociationProps cfnPortfolioProductAssociationProps =
 * CfnPortfolioProductAssociationProps.builder()
 * .portfolioId("portfolioId")
 * .productId("productId")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .sourcePortfolioId("sourcePortfolioId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html)
 */
@CdkDslMarker
public class CfnPortfolioProductAssociationPropsDsl {
    private val cdkBuilder: CfnPortfolioProductAssociationProps.Builder =
        CfnPortfolioProductAssociationProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /** @param portfolioId The portfolio identifier. */
    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    /** @param productId The product identifier. */
    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    /** @param sourcePortfolioId The identifier of the source portfolio. */
    public fun sourcePortfolioId(sourcePortfolioId: String) {
        cdkBuilder.sourcePortfolioId(sourcePortfolioId)
    }

    public fun build(): CfnPortfolioProductAssociationProps = cdkBuilder.build()
}

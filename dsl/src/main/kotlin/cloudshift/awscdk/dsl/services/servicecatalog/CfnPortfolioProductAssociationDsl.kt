@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnPortfolioProductAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPortfolioProductAssociation.Builder =
        CfnPortfolioProductAssociation.Builder.create(scope, id)

    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    public fun sourcePortfolioId(sourcePortfolioId: String) {
        cdkBuilder.sourcePortfolioId(sourcePortfolioId)
    }

    public fun build(): CfnPortfolioProductAssociation = cdkBuilder.build()
}

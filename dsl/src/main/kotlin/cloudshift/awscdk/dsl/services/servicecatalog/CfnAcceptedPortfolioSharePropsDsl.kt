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
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps
import kotlin.String

@CdkDslMarker
public class CfnAcceptedPortfolioSharePropsDsl {
    private val cdkBuilder: CfnAcceptedPortfolioShareProps.Builder =
        CfnAcceptedPortfolioShareProps.builder()

    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    public fun build(): CfnAcceptedPortfolioShareProps = cdkBuilder.build()
}

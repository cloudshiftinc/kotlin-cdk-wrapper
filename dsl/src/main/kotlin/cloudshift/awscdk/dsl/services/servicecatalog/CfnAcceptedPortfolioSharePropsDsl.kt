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
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps

/**
 * Properties for defining a `CfnAcceptedPortfolioShare`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnAcceptedPortfolioShareProps cfnAcceptedPortfolioShareProps =
 * CfnAcceptedPortfolioShareProps.builder()
 * .portfolioId("portfolioId")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html)
 */
@CdkDslMarker
public class CfnAcceptedPortfolioSharePropsDsl {
    private val cdkBuilder: CfnAcceptedPortfolioShareProps.Builder =
        CfnAcceptedPortfolioShareProps.builder()

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

    public fun build(): CfnAcceptedPortfolioShareProps = cdkBuilder.build()
}

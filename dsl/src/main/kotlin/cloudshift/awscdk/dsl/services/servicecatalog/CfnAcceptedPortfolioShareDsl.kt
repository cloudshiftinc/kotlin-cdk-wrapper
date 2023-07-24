@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare
import software.constructs.Construct
import kotlin.String

/**
 * Accepts an offer to share the specified portfolio.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnAcceptedPortfolioShare cfnAcceptedPortfolioShare =
 * CfnAcceptedPortfolioShare.Builder.create(this, "MyCfnAcceptedPortfolioShare")
 * .portfolioId("portfolioId")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html)
 */
@CdkDslMarker
public class CfnAcceptedPortfolioShareDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnAcceptedPortfolioShare.Builder =
        CfnAcceptedPortfolioShare.Builder.create(scope, id)

    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-acceptlanguage)
     * @param acceptLanguage The language code.
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html#cfn-servicecatalog-acceptedportfolioshare-portfolioid)
     * @param portfolioId The portfolio identifier.
     */
    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    public fun build(): CfnAcceptedPortfolioShare = cdkBuilder.build()
}

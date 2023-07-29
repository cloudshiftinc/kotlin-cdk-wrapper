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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare
import software.constructs.Construct

/**
 * Shares the specified portfolio with the specified account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnPortfolioShare cfnPortfolioShare = CfnPortfolioShare.Builder.create(this,
 * "MyCfnPortfolioShare")
 * .accountId("accountId")
 * .portfolioId("portfolioId")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .shareTagOptions(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html)
 */
@CdkDslMarker
public class CfnPortfolioShareDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPortfolioShare.Builder = CfnPortfolioShare.Builder.create(scope, id)

    /**
     * The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-acceptlanguage)
     *
     * @param acceptLanguage The language code.
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * The AWS account ID.
     *
     * For example, `123456789012` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-accountid)
     *
     * @param accountId The AWS account ID.
     */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-portfolioid)
     *
     * @param portfolioId The portfolio identifier.
     */
    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-sharetagoptions)
     *
     * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
     *   portfolio share.
     */
    public fun shareTagOptions(shareTagOptions: Boolean) {
        cdkBuilder.shareTagOptions(shareTagOptions)
    }

    /**
     * Indicates whether TagOptions sharing is enabled or disabled for the portfolio share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html#cfn-servicecatalog-portfolioshare-sharetagoptions)
     *
     * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
     *   portfolio share.
     */
    public fun shareTagOptions(shareTagOptions: IResolvable) {
        cdkBuilder.shareTagOptions(shareTagOptions)
    }

    public fun build(): CfnPortfolioShare = cdkBuilder.build()
}

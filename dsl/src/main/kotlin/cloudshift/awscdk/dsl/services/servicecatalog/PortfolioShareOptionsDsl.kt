@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions
import kotlin.Boolean

/**
 * Options for portfolio share.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * PortfolioShareOptions portfolioShareOptions = PortfolioShareOptions.builder()
 * .messageLanguage(MessageLanguage.EN)
 * .shareTagOptions(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class PortfolioShareOptionsDsl {
    private val cdkBuilder: PortfolioShareOptions.Builder = PortfolioShareOptions.builder()

    /**
     * @param messageLanguage The message language of the share.
     * Controls status and error message language for share.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage) {
        cdkBuilder.messageLanguage(messageLanguage)
    }

    /**
     * @param shareTagOptions Whether to share tagOptions as a part of the portfolio share.
     */
    public fun shareTagOptions(shareTagOptions: Boolean) {
        cdkBuilder.shareTagOptions(shareTagOptions)
    }

    public fun build(): PortfolioShareOptions = cdkBuilder.build()
}

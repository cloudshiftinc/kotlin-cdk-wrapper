@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.PortfolioProps
import software.amazon.awscdk.services.servicecatalog.TagOptions
import kotlin.String

/**
 * Properties for a Portfolio.
 *
 * Example:
 *
 * ```
 * Portfolio.Builder.create(this, "Portfolio")
 * .displayName("MyPortfolio")
 * .providerName("MyTeam")
 * .build();
 * ```
 */
@CdkDslMarker
public class PortfolioPropsDsl {
    private val cdkBuilder: PortfolioProps.Builder = PortfolioProps.builder()

    /**
     * @param description Description for portfolio.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param displayName The name of the portfolio.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * @param messageLanguage The message language.
     * Controls language for
     * status logging and errors.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage) {
        cdkBuilder.messageLanguage(messageLanguage)
    }

    /**
     * @param providerName The provider name.
     */
    public fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
    }

    /**
     * @param tagOptions TagOptions associated directly to a portfolio.
     */
    public fun tagOptions(tagOptions: TagOptions) {
        cdkBuilder.tagOptions(tagOptions)
    }

    public fun build(): PortfolioProps = cdkBuilder.build()
}

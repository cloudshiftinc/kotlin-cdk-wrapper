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
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.Portfolio
import software.amazon.awscdk.services.servicecatalog.TagOptions
import software.constructs.Construct

/**
 * A Service Catalog portfolio.
 *
 * Example:
 * ```
 * Portfolio.Builder.create(this, "Portfolio")
 * .displayName("MyPortfolio")
 * .providerName("MyTeam")
 * .build();
 * ```
 */
@CdkDslMarker
public class PortfolioDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Portfolio.Builder = Portfolio.Builder.create(scope, id)

    /**
     * Description for portfolio.
     *
     * Default: - No description provided
     *
     * @param description Description for portfolio.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the portfolio.
     *
     * @param displayName The name of the portfolio.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * The message language.
     *
     * Controls language for status logging and errors.
     *
     * Default: - English
     *
     * @param messageLanguage The message language.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage) {
        cdkBuilder.messageLanguage(messageLanguage)
    }

    /**
     * The provider name.
     *
     * @param providerName The provider name.
     */
    public fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
    }

    /**
     * TagOptions associated directly to a portfolio.
     *
     * Default: - No tagOptions provided
     *
     * @param tagOptions TagOptions associated directly to a portfolio.
     */
    public fun tagOptions(tagOptions: TagOptions) {
        cdkBuilder.tagOptions(tagOptions)
    }

    public fun build(): Portfolio = cdkBuilder.build()
}

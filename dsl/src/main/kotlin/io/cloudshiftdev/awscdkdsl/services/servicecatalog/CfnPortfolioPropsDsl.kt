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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps

/**
 * Properties for defining a `CfnPortfolio`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnPortfolioProps cfnPortfolioProps = CfnPortfolioProps.builder()
 * .displayName("displayName")
 * .providerName("providerName")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html)
 */
@CdkDslMarker
public class CfnPortfolioPropsDsl {
    private val cdkBuilder: CfnPortfolioProps.Builder = CfnPortfolioProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /** @param description The description of the portfolio. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param displayName The name to use for display purposes. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /** @param providerName The name of the portfolio provider. */
    public fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
    }

    /** @param tags One or more tags. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags One or more tags. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPortfolioProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

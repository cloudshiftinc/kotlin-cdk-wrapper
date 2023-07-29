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
import software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions
import software.amazon.awscdk.services.servicecatalog.MessageLanguage

/**
 * Properties for governance mechanisms and constraints.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.sns.*;
 * Portfolio portfolio;
 * CloudFormationProduct product;
 * Topic topic1 = new Topic(this, "Topic1");
 * portfolio.notifyOnStackEvents(product, topic1);
 * Topic topic2 = new Topic(this, "Topic2");
 * portfolio.notifyOnStackEvents(product, topic2, CommonConstraintOptions.builder()
 * .description("description for topic2")
 * .build());
 * ```
 */
@CdkDslMarker
public class CommonConstraintOptionsDsl {
    private val cdkBuilder: CommonConstraintOptions.Builder = CommonConstraintOptions.builder()

    /** @param description The description of the constraint. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param messageLanguage The language code. Configures the language for error messages from
     *   service catalog.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage) {
        cdkBuilder.messageLanguage(messageLanguage)
    }

    public fun build(): CommonConstraintOptions = cdkBuilder.build()
}

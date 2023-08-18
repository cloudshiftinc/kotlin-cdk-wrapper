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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions

/**
 * Properties for ResourceUpdateConstraint.
 *
 * Example:
 * ```
 * Portfolio portfolio;
 * CloudFormationProduct product;
 * // to disable tag updates:
 * portfolio.constrainTagUpdates(product, TagUpdateConstraintOptions.builder()
 * .allow(false)
 * .build());
 * ```
 */
@CdkDslMarker
public class TagUpdateConstraintOptionsDsl {
    private val cdkBuilder: TagUpdateConstraintOptions.Builder =
        TagUpdateConstraintOptions.builder()

    /**
     * @param allow Toggle for if users should be allowed to change/update tags on provisioned
     *   products.
     */
    public fun allow(allow: Boolean) {
        cdkBuilder.allow(allow)
    }

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

    public fun build(): TagUpdateConstraintOptions = cdkBuilder.build()
}

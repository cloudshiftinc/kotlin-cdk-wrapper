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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * List of errors that occurred when the template version creation failed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TemplateErrorProperty templateErrorProperty = TemplateErrorProperty.builder()
 * .message("message")
 * .type("type")
 * .violatedEntities(List.of(EntityProperty.builder()
 * .path("path")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-templateerror.html)
 */
@CdkDslMarker
public class CfnTemplateTemplateErrorPropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateErrorProperty.Builder =
        CfnTemplate.TemplateErrorProperty.builder()

    private val _violatedEntities: MutableList<Any> = mutableListOf()

    /** @param message Description of the error type. */
    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    /** @param type Type of error. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param violatedEntities An error path that shows which entities caused the template error.
     */
    public fun violatedEntities(vararg violatedEntities: Any) {
        _violatedEntities.addAll(listOf(*violatedEntities))
    }

    /**
     * @param violatedEntities An error path that shows which entities caused the template error.
     */
    public fun violatedEntities(violatedEntities: Collection<Any>) {
        _violatedEntities.addAll(violatedEntities)
    }

    /**
     * @param violatedEntities An error path that shows which entities caused the template error.
     */
    public fun violatedEntities(violatedEntities: IResolvable) {
        cdkBuilder.violatedEntities(violatedEntities)
    }

    public fun build(): CfnTemplate.TemplateErrorProperty {
        if (_violatedEntities.isNotEmpty()) cdkBuilder.violatedEntities(_violatedEntities)
        return cdkBuilder.build()
    }
}

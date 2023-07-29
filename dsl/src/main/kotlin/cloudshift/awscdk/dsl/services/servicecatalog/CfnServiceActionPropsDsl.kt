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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps

/**
 * Properties for defining a `CfnServiceAction`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnServiceActionProps cfnServiceActionProps = CfnServiceActionProps.builder()
 * .definition(List.of(DefinitionParameterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .definitionType("definitionType")
 * .name("name")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html)
 */
@CdkDslMarker
public class CfnServiceActionPropsDsl {
    private val cdkBuilder: CfnServiceActionProps.Builder = CfnServiceActionProps.builder()

    private val _definition: MutableList<Any> = mutableListOf()

    /**
     * @param acceptLanguage The language code.
     * * `en` - English (default)
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /** @param definition A map that defines the self-service action. */
    public fun definition(vararg definition: Any) {
        _definition.addAll(listOf(*definition))
    }

    /** @param definition A map that defines the self-service action. */
    public fun definition(definition: Collection<Any>) {
        _definition.addAll(definition)
    }

    /** @param definition A map that defines the self-service action. */
    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    /**
     * @param definitionType The self-service action definition type. For example, `SSM_AUTOMATION`
     *   .
     */
    public fun definitionType(definitionType: String) {
        cdkBuilder.definitionType(definitionType)
    }

    /** @param description The self-service action description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The self-service action name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnServiceActionProps {
        if (_definition.isNotEmpty()) cdkBuilder.definition(_definition)
        return cdkBuilder.build()
    }
}

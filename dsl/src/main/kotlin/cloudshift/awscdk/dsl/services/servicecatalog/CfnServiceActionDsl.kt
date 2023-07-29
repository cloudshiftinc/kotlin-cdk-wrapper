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
import software.amazon.awscdk.services.servicecatalog.CfnServiceAction
import software.constructs.Construct

/**
 * Creates a self-service action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnServiceAction cfnServiceAction = CfnServiceAction.Builder.create(this, "MyCfnServiceAction")
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
public class CfnServiceActionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnServiceAction.Builder = CfnServiceAction.Builder.create(scope, id)

    private val _definition: MutableList<Any> = mutableListOf()

    /**
     * The language code.
     * * `en` - English (default)
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-acceptlanguage)
     *
     * @param acceptLanguage The language code.
     */
    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * A map that defines the self-service action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definition)
     *
     * @param definition A map that defines the self-service action.
     */
    public fun definition(vararg definition: Any) {
        _definition.addAll(listOf(*definition))
    }

    /**
     * A map that defines the self-service action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definition)
     *
     * @param definition A map that defines the self-service action.
     */
    public fun definition(definition: Collection<Any>) {
        _definition.addAll(definition)
    }

    /**
     * A map that defines the self-service action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definition)
     *
     * @param definition A map that defines the self-service action.
     */
    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    /**
     * The self-service action definition type.
     *
     * For example, `SSM_AUTOMATION` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-definitiontype)
     *
     * @param definitionType The self-service action definition type.
     */
    public fun definitionType(definitionType: String) {
        cdkBuilder.definitionType(definitionType)
    }

    /**
     * The self-service action description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-description)
     *
     * @param description The self-service action description.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The self-service action name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html#cfn-servicecatalog-serviceaction-name)
     *
     * @param name The self-service action name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnServiceAction {
        if (_definition.isNotEmpty()) cdkBuilder.definition(_definition)
        return cdkBuilder.build()
    }
}

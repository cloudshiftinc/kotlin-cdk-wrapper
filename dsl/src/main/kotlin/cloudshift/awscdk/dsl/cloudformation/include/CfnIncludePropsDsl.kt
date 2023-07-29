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

package cloudshift.awscdk.dsl.cloudformation.include

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.cloudformation.include.CfnIncludeProps

/**
 * Construction properties of `CfnInclude`.
 *
 * Example:
 * ```
 * CfnInclude parentTemplate = CfnInclude.Builder.create(this, "ParentStack")
 * .templateFile("path/to/my-parent-template.json")
 * .loadNestedStacks(Map.of(
 * "ChildStack", CfnIncludeProps.builder()
 * .templateFile("path/to/my-nested-template.json")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnIncludePropsDsl {
    private val cdkBuilder: CfnIncludeProps.Builder = CfnIncludeProps.builder()

    /**
     * @param allowCyclicalReferences Specifies whether to allow cyclical references, effectively
     *   disregarding safeguards meant to avoid undeployable templates. This should only be set to
     *   true in the case of templates utilizing cloud transforms (e.g. SAM) that after processing
     *   the transform will no longer contain any circular references.
     */
    public fun allowCyclicalReferences(allowCyclicalReferences: Boolean) {
        cdkBuilder.allowCyclicalReferences(allowCyclicalReferences)
    }

    /**
     * @param loadNestedStacks Specifies the template files that define nested stacks that should be
     *   included. If your template specifies a stack that isn't included here, it won't be created
     *   as a NestedStack resource, and it won't be accessible from the `CfnInclude.getNestedStack`
     *   method (but will still be accessible from the `CfnInclude.getResource` method).
     *
     * If you include a stack here with an ID that isn't in the template, or is in the template but
     * is not a nested stack, template creation will fail and an error will be thrown.
     */
    public fun loadNestedStacks(loadNestedStacks: Map<String, CfnIncludeProps>) {
        cdkBuilder.loadNestedStacks(loadNestedStacks)
    }

    /**
     * @param parameters Specifies parameters to be replaced by the values in this mapping. Any
     *   parameters in the template that aren't specified here will be left unmodified. If you
     *   include a parameter here with an ID that isn't in the template, template creation will fail
     *   and an error will be thrown.
     *
     * If you are importing a parameter from a live stack, we cannot know the value of that
     * parameter. You will need to supply a value for your parameters, else the default value will
     * be used.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * @param parameters Specifies parameters to be replaced by the values in this mapping. Any
     *   parameters in the template that aren't specified here will be left unmodified. If you
     *   include a parameter here with an ID that isn't in the template, template creation will fail
     *   and an error will be thrown.
     *
     * If you are importing a parameter from a live stack, we cannot know the value of that
     * parameter. You will need to supply a value for your parameters, else the default value will
     * be used.
     */
    public fun parameters(parameters: Map<String, Any>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param preserveLogicalIds Whether the resources should have the same logical IDs in the
     *   resulting CDK template as they did in the original CloudFormation template file. If you're
     *   vending a Construct using an existing CloudFormation template, make sure to pass this as
     *   `false`.
     *
     * **Note**: regardless of whether this option is true or false, the `CfnInclude.getResource`
     * and related methods always uses the original logical ID of the resource/element, as specified
     * in the template file.
     */
    public fun preserveLogicalIds(preserveLogicalIds: Boolean) {
        cdkBuilder.preserveLogicalIds(preserveLogicalIds)
    }

    /**
     * @param templateFile Path to the template file. Both JSON and YAML template formats are
     *   supported.
     */
    public fun templateFile(templateFile: String) {
        cdkBuilder.templateFile(templateFile)
    }

    public fun build(): CfnIncludeProps = cdkBuilder.build()
}

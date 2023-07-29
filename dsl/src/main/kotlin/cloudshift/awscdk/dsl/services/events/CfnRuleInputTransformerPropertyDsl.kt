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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule

/**
 * Contains the parameters needed for you to provide custom input to a target based on one or more
 * pieces of data extracted from the event.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * InputTransformerProperty inputTransformerProperty = InputTransformerProperty.builder()
 * .inputTemplate("inputTemplate")
 * // the properties below are optional
 * .inputPathsMap(Map.of(
 * "inputPathsMapKey", "inputPathsMap"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html)
 */
@CdkDslMarker
public class CfnRuleInputTransformerPropertyDsl {
    private val cdkBuilder: CfnRule.InputTransformerProperty.Builder =
        CfnRule.InputTransformerProperty.builder()

    /**
     * @param inputPathsMap Map of JSON paths to be extracted from the event. You can then insert
     *   these in the template in `InputTemplate` to produce the output you want to be sent to the
     *   target.
     *
     * `InputPathsMap` is an array key-value pairs, where each value is a valid JSON path. You can
     * have as many as 100 key-value pairs. You must use JSON dot notation, not bracket notation.
     *
     * The keys cannot start with " AWS ."
     */
    public fun inputPathsMap(inputPathsMap: Map<String, String>) {
        cdkBuilder.inputPathsMap(inputPathsMap)
    }

    /**
     * @param inputPathsMap Map of JSON paths to be extracted from the event. You can then insert
     *   these in the template in `InputTemplate` to produce the output you want to be sent to the
     *   target.
     *
     * `InputPathsMap` is an array key-value pairs, where each value is a valid JSON path. You can
     * have as many as 100 key-value pairs. You must use JSON dot notation, not bracket notation.
     *
     * The keys cannot start with " AWS ."
     */
    public fun inputPathsMap(inputPathsMap: IResolvable) {
        cdkBuilder.inputPathsMap(inputPathsMap)
    }

    /**
     * @param inputTemplate Input template where you specify placeholders that will be filled with
     *   the values of the keys from `InputPathsMap` to customize the data sent to the target.
     *   Enclose each `InputPathsMaps` value in brackets: &lt; *value* &gt;
     *
     * If `InputTemplate` is a JSON object (surrounded by curly braces), the following restrictions
     * apply:
     * * The placeholder cannot be used as an object key.
     *
     * The following example shows the syntax for using `InputPathsMap` and `InputTemplate` .
     *
     * `"InputTransformer":`
     *
     * `{`
     *
     * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
     *
     * `"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"`
     *
     * `}`
     *
     * To have the `InputTemplate` include quote marks within a JSON string, escape each quote marks
     * with a slash, as in the following example:
     *
     * `"InputTransformer":`
     *
     * `{`
     *
     * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
     *
     * `"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""`
     *
     * `}`
     *
     * The `InputTemplate` can also be valid JSON with varibles in quotes or out, as in the
     * following example:
     *
     * `"InputTransformer":`
     *
     * `{`
     *
     * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
     *
     * `"InputTemplate": '{"myInstance": &lt;instance&gt;,"myStatus": "&lt;instance&gt; is in state
     * \"&lt;status&gt;\""}'`
     *
     * `}`
     */
    public fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
    }

    public fun build(): CfnRule.InputTransformerProperty = cdkBuilder.build()
}

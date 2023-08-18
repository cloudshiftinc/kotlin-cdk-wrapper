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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule

/**
 * Information about the task action.
 *
 * This field is required if `TriggerEventSource` is one of the following values:
 * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * TaskActionProperty taskActionProperty = TaskActionProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .references(Map.of(
 * "referencesKey", ReferenceProperty.builder()
 * .type("type")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-taskaction.html)
 */
@CdkDslMarker
public class CfnRuleTaskActionPropertyDsl {
    private val cdkBuilder: CfnRule.TaskActionProperty.Builder =
        CfnRule.TaskActionProperty.builder()

    /** @param contactFlowArn The Amazon Resource Name (ARN) of the flow. */
    public fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
    }

    /**
     * @param description The description. Supports variable injection. For more information, see
     *   [JSONPath reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
     *   in the *Amazon Connect Administrators Guide* .
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name The name. Supports variable injection. For more information, see
     *   [JSONPath reference](https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html)
     *   in the *Amazon Connect Administrators Guide* .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param references Information about the reference when the `referenceType` is `URL` .
     *   Otherwise, null. `URL` is the only accepted type. (Supports variable injection in the
     *   `Value` field.)
     */
    public fun references(references: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(references)
        cdkBuilder.references(builder.map)
    }

    /**
     * @param references Information about the reference when the `referenceType` is `URL` .
     *   Otherwise, null. `URL` is the only accepted type. (Supports variable injection in the
     *   `Value` field.)
     */
    public fun references(references: Map<String, Any>) {
        cdkBuilder.references(references)
    }

    /**
     * @param references Information about the reference when the `referenceType` is `URL` .
     *   Otherwise, null. `URL` is the only accepted type. (Supports variable injection in the
     *   `Value` field.)
     */
    public fun references(references: IResolvable) {
        cdkBuilder.references(references)
    }

    public fun build(): CfnRule.TaskActionProperty = cdkBuilder.build()
}

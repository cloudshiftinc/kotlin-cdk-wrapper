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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.Action
import software.amazon.awscdk.services.appconfig.ExtensionAttributes

/**
 * Attributes of an existing AWS AppConfig extension to import.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * Action action;
 * ExtensionAttributes extensionAttributes = ExtensionAttributes.builder()
 * .extensionId("extensionId")
 * .extensionVersionNumber(123)
 * // the properties below are optional
 * .actions(List.of(action))
 * .description("description")
 * .extensionArn("extensionArn")
 * .name("name")
 * .build();
 * ```
 */
@CdkDslMarker
public class ExtensionAttributesDsl {
    private val cdkBuilder: ExtensionAttributes.Builder = ExtensionAttributes.builder()

    private val _actions: MutableList<Action> = mutableListOf()

    /** @param actions The actions of the extension. */
    public fun actions(actions: ActionDsl.() -> Unit) {
        _actions.add(ActionDsl().apply(actions).build())
    }

    /** @param actions The actions of the extension. */
    public fun actions(actions: Collection<Action>) {
        _actions.addAll(actions)
    }

    /** @param description The description of the extension. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param extensionArn The Amazon Resource Name (ARN) of the extension. */
    public fun extensionArn(extensionArn: String) {
        cdkBuilder.extensionArn(extensionArn)
    }

    /** @param extensionId The ID of the extension. */
    public fun extensionId(extensionId: String) {
        cdkBuilder.extensionId(extensionId)
    }

    /** @param extensionVersionNumber The version number of the extension. */
    public fun extensionVersionNumber(extensionVersionNumber: Number) {
        cdkBuilder.extensionVersionNumber(extensionVersionNumber)
    }

    /** @param name The name of the extension. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): ExtensionAttributes {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}

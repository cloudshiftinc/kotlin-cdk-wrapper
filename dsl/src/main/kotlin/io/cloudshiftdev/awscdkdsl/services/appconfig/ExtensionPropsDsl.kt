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
import software.amazon.awscdk.services.appconfig.ExtensionProps
import software.amazon.awscdk.services.appconfig.Parameter

/**
 * Properties for the Extension construct.
 *
 * Example:
 * ```
 * Function fn;
 * Extension.Builder.create(this, "MyExtension")
 * .actions(List.of(
 * Action.Builder.create()
 * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
 * .eventDestination(new LambdaDestination(fn))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ExtensionPropsDsl {
    private val cdkBuilder: ExtensionProps.Builder = ExtensionProps.builder()

    private val _actions: MutableList<Action> = mutableListOf()

    private val _parameters: MutableList<Parameter> = mutableListOf()

    /** @param actions The actions for the extension. */
    public fun actions(actions: ActionDsl.() -> Unit) {
        _actions.add(ActionDsl().apply(actions).build())
    }

    /** @param actions The actions for the extension. */
    public fun actions(actions: Collection<Action>) {
        _actions.addAll(actions)
    }

    /** @param description A description of the extension. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param extensionName The name of the extension. */
    public fun extensionName(extensionName: String) {
        cdkBuilder.extensionName(extensionName)
    }

    /**
     * @param latestVersionNumber The latest version number of the extension. When you create a new
     *   version, specify the most recent current version number. For example, you create version 3,
     *   enter 2 for this field.
     */
    public fun latestVersionNumber(latestVersionNumber: Number) {
        cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /** @param parameters The parameters accepted for the extension. */
    public fun parameters(vararg parameters: Parameter) {
        _parameters.addAll(listOf(*parameters))
    }

    /** @param parameters The parameters accepted for the extension. */
    public fun parameters(parameters: Collection<Parameter>) {
        _parameters.addAll(parameters)
    }

    public fun build(): ExtensionProps {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        return cdkBuilder.build()
    }
}

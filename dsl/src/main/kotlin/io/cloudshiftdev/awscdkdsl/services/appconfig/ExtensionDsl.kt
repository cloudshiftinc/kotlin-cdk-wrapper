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
import software.amazon.awscdk.services.appconfig.Extension
import software.amazon.awscdk.services.appconfig.Parameter
import software.constructs.Construct

/**
 * An AWS AppConfig extension.
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
 *
 * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html)
 */
@CdkDslMarker
public class ExtensionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Extension.Builder = Extension.Builder.create(scope, id)

    private val _actions: MutableList<Action> = mutableListOf()

    private val _parameters: MutableList<Parameter> = mutableListOf()

    /**
     * The actions for the extension.
     *
     * @param actions The actions for the extension.
     */
    public fun actions(actions: ActionDsl.() -> Unit) {
        _actions.add(ActionDsl().apply(actions).build())
    }

    /**
     * The actions for the extension.
     *
     * @param actions The actions for the extension.
     */
    public fun actions(actions: Collection<Action>) {
        _actions.addAll(actions)
    }

    /**
     * A description of the extension.
     *
     * Default: - No description.
     *
     * @param description A description of the extension.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the extension.
     *
     * Default: - A name is generated.
     *
     * @param extensionName The name of the extension.
     */
    public fun extensionName(extensionName: String) {
        cdkBuilder.extensionName(extensionName)
    }

    /**
     * The latest version number of the extension.
     *
     * When you create a new version, specify the most recent current version number. For example,
     * you create version 3, enter 2 for this field.
     *
     * Default: - None.
     *
     * @param latestVersionNumber The latest version number of the extension.
     */
    public fun latestVersionNumber(latestVersionNumber: Number) {
        cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /**
     * The parameters accepted for the extension.
     *
     * Default: - None.
     *
     * @param parameters The parameters accepted for the extension.
     */
    public fun parameters(vararg parameters: Parameter) {
        _parameters.addAll(listOf(*parameters))
    }

    /**
     * The parameters accepted for the extension.
     *
     * Default: - None.
     *
     * @param parameters The parameters accepted for the extension.
     */
    public fun parameters(parameters: Collection<Parameter>) {
        _parameters.addAll(parameters)
    }

    public fun build(): Extension {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        return cdkBuilder.build()
    }
}

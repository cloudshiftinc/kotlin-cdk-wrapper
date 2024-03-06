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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.ExtensionOptions
import software.amazon.awscdk.services.appconfig.Parameter

/**
 * Options for the Extension construct.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * Parameter parameter;
 * ExtensionOptions extensionOptions = ExtensionOptions.builder()
 * .description("description")
 * .extensionName("extensionName")
 * .latestVersionNumber(123)
 * .parameters(List.of(parameter))
 * .build();
 * ```
 */
@CdkDslMarker
public class ExtensionOptionsDsl {
    private val cdkBuilder: ExtensionOptions.Builder = ExtensionOptions.builder()

    private val _parameters: MutableList<Parameter> = mutableListOf()

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

    public fun build(): ExtensionOptions {
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        return cdkBuilder.build()
    }
}

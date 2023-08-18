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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.InitServiceRestartHandle
import software.amazon.awscdk.services.ec2.NamedPackageOptions

/**
 * Options for InitPackage.yum/apt/rubyGem/python.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * InitServiceRestartHandle initServiceRestartHandle;
 * NamedPackageOptions namedPackageOptions = NamedPackageOptions.builder()
 * .serviceRestartHandles(List.of(initServiceRestartHandle))
 * .version(List.of("version"))
 * .build();
 * ```
 */
@CdkDslMarker
public class NamedPackageOptionsDsl {
    private val cdkBuilder: NamedPackageOptions.Builder = NamedPackageOptions.builder()

    private val _serviceRestartHandles: MutableList<InitServiceRestartHandle> = mutableListOf()

    private val _version: MutableList<String> = mutableListOf()

    /** @param serviceRestartHandles Restart the given services after this command has run. */
    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle) {
        _serviceRestartHandles.addAll(listOf(*serviceRestartHandles))
    }

    /** @param serviceRestartHandles Restart the given services after this command has run. */
    public fun serviceRestartHandles(serviceRestartHandles: Collection<InitServiceRestartHandle>) {
        _serviceRestartHandles.addAll(serviceRestartHandles)
    }

    /** @param version Specify the versions to install. */
    public fun version(vararg version: String) {
        _version.addAll(listOf(*version))
    }

    /** @param version Specify the versions to install. */
    public fun version(version: Collection<String>) {
        _version.addAll(version)
    }

    public fun build(): NamedPackageOptions {
        if (_serviceRestartHandles.isNotEmpty())
            cdkBuilder.serviceRestartHandles(_serviceRestartHandles)
        if (_version.isNotEmpty()) cdkBuilder.version(_version)
        return cdkBuilder.build()
    }
}

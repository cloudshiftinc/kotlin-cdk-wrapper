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
import software.amazon.awscdk.services.ec2.LocationPackageOptions

/**
 * Options for InitPackage.rpm/InitPackage.msi.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * InitServiceRestartHandle initServiceRestartHandle;
 * LocationPackageOptions locationPackageOptions = LocationPackageOptions.builder()
 * .key("key")
 * .serviceRestartHandles(List.of(initServiceRestartHandle))
 * .build();
 * ```
 */
@CdkDslMarker
public class LocationPackageOptionsDsl {
    private val cdkBuilder: LocationPackageOptions.Builder = LocationPackageOptions.builder()

    private val _serviceRestartHandles: MutableList<InitServiceRestartHandle> = mutableListOf()

    /** @param key Identifier key for this package. You can use this to order package installs. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param serviceRestartHandles Restart the given service after this command has run. */
    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle) {
        _serviceRestartHandles.addAll(listOf(*serviceRestartHandles))
    }

    /** @param serviceRestartHandles Restart the given service after this command has run. */
    public fun serviceRestartHandles(serviceRestartHandles: Collection<InitServiceRestartHandle>) {
        _serviceRestartHandles.addAll(serviceRestartHandles)
    }

    public fun build(): LocationPackageOptions {
        if (_serviceRestartHandles.isNotEmpty())
            cdkBuilder.serviceRestartHandles(_serviceRestartHandles)
        return cdkBuilder.build()
    }
}

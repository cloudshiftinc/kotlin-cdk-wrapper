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

package io.cloudshiftdev.awscdkdsl.services.fsx

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.fsx.CfnVolume

/**
 * Specifies who can mount an OpenZFS file system and the options available while mounting the file
 * system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * ClientConfigurationsProperty clientConfigurationsProperty =
 * ClientConfigurationsProperty.builder()
 * .clients("clients")
 * .options(List.of("options"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-clientconfigurations.html)
 */
@CdkDslMarker
public class CfnVolumeClientConfigurationsPropertyDsl {
    private val cdkBuilder: CfnVolume.ClientConfigurationsProperty.Builder =
        CfnVolume.ClientConfigurationsProperty.builder()

    private val _options: MutableList<String> = mutableListOf()

    /**
     * @param clients A value that specifies who can mount the file system. You can provide a
     *   wildcard character ( `*` ), an IP address ( `0.0.0.0` ), or a CIDR address ( `192.0.2.0/24`
     *   ). By default, Amazon FSx uses the wildcard character when specifying the client.
     */
    public fun clients(clients: String) {
        cdkBuilder.clients(clients)
    }

    /**
     * @param options The options to use when mounting the file system. For a list of options that
     *   you can use with Network File System (NFS), see the
     *   [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
     *   . When choosing your options, consider the following:
     * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
     *   configuration, you won't be able to see or access snapshots in your file system's snapshot
     *   directory.
     * * `sync` is used by default. If you instead specify `async` , the system acknowledges writes
     *   before writing to disk. If the system crashes before the writes are finished, you lose the
     *   unwritten data.
     */
    public fun options(vararg options: String) {
        _options.addAll(listOf(*options))
    }

    /**
     * @param options The options to use when mounting the file system. For a list of options that
     *   you can use with Network File System (NFS), see the
     *   [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
     *   . When choosing your options, consider the following:
     * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
     *   configuration, you won't be able to see or access snapshots in your file system's snapshot
     *   directory.
     * * `sync` is used by default. If you instead specify `async` , the system acknowledges writes
     *   before writing to disk. If the system crashes before the writes are finished, you lose the
     *   unwritten data.
     */
    public fun options(options: Collection<String>) {
        _options.addAll(options)
    }

    public fun build(): CfnVolume.ClientConfigurationsProperty {
        if (_options.isNotEmpty()) cdkBuilder.options(_options)
        return cdkBuilder.build()
    }
}

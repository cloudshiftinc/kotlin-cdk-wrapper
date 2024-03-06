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

package io.cloudshiftdev.awscdkdsl.services.efs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.efs.CfnFileSystem

/**
 * Describes the replication configuration for a specific file system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * ReplicationConfigurationProperty replicationConfigurationProperty =
 * ReplicationConfigurationProperty.builder()
 * .destinations(List.of(ReplicationDestinationProperty.builder()
 * .availabilityZoneName("availabilityZoneName")
 * .fileSystemId("fileSystemId")
 * .kmsKeyId("kmsKeyId")
 * .region("region")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationconfiguration.html)
 */
@CdkDslMarker
public class CfnFileSystemReplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnFileSystem.ReplicationConfigurationProperty.Builder =
        CfnFileSystem.ReplicationConfigurationProperty.builder()

    private val _destinations: MutableList<Any> = mutableListOf()

    /**
     * @param destinations An array of destination objects. Only one destination object is
     *   supported.
     */
    public fun destinations(vararg destinations: Any) {
        _destinations.addAll(listOf(*destinations))
    }

    /**
     * @param destinations An array of destination objects. Only one destination object is
     *   supported.
     */
    public fun destinations(destinations: Collection<Any>) {
        _destinations.addAll(destinations)
    }

    /**
     * @param destinations An array of destination objects. Only one destination object is
     *   supported.
     */
    public fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations)
    }

    public fun build(): CfnFileSystem.ReplicationConfigurationProperty {
        if (_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
        return cdkBuilder.build()
    }
}

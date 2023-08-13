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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.datasync.CfnLocationNFS

/**
 * The AWS DataSync agents that are connecting to a Network File System (NFS) location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * OnPremConfigProperty onPremConfigProperty = OnPremConfigProperty.builder()
 * .agentArns(List.of("agentArns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationnfs-onpremconfig.html)
 */
@CdkDslMarker
public class CfnLocationNFSOnPremConfigPropertyDsl {
    private val cdkBuilder: CfnLocationNFS.OnPremConfigProperty.Builder =
        CfnLocationNFS.OnPremConfigProperty.builder()

    private val _agentArns: MutableList<String> = mutableListOf()

    /**
     * @param agentArns The Amazon Resource Names (ARNs) of the agents connecting to a transfer
     *   location.
     */
    public fun agentArns(vararg agentArns: String) {
        _agentArns.addAll(listOf(*agentArns))
    }

    /**
     * @param agentArns The Amazon Resource Names (ARNs) of the agents connecting to a transfer
     *   location.
     */
    public fun agentArns(agentArns: Collection<String>) {
        _agentArns.addAll(agentArns)
    }

    public fun build(): CfnLocationNFS.OnPremConfigProperty {
        if (_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
        return cdkBuilder.build()
    }
}

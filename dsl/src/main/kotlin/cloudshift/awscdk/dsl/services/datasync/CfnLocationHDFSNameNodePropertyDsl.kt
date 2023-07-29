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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnLocationHDFS

/**
 * The NameNode of the Hadoop Distributed File System (HDFS).
 *
 * The NameNode manages the file system's namespace and performs operations such as opening,
 * closing, and renaming files and directories. The NameNode also contains the information to map
 * blocks of data to the DataNodes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * NameNodeProperty nameNodeProperty = NameNodeProperty.builder()
 * .hostname("hostname")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationhdfs-namenode.html)
 */
@CdkDslMarker
public class CfnLocationHDFSNameNodePropertyDsl {
    private val cdkBuilder: CfnLocationHDFS.NameNodeProperty.Builder =
        CfnLocationHDFS.NameNodeProperty.builder()

    /**
     * @param hostname The hostname of the NameNode in the HDFS cluster. This value is the IP
     *   address or Domain Name Service (DNS) name of the NameNode. An agent that's installed
     *   on-premises uses this hostname to communicate with the NameNode in the network.
     */
    public fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
    }

    /** @param port The port that the NameNode uses to listen to client requests. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnLocationHDFS.NameNodeProperty = cdkBuilder.build()
}

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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationNFS
import software.amazon.awscdk.services.datasync.CfnLocationNFSProps

/**
 * Properties for defining a `CfnLocationNFS`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnLocationNFSProps cfnLocationNFSProps = CfnLocationNFSProps.builder()
 * .onPremConfig(OnPremConfigProperty.builder()
 * .agentArns(List.of("agentArns"))
 * .build())
 * // the properties below are optional
 * .mountOptions(MountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .serverHostname("serverHostname")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html)
 */
@CdkDslMarker
public class CfnLocationNFSPropsDsl {
    private val cdkBuilder: CfnLocationNFSProps.Builder = CfnLocationNFSProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
     *   server.
     */
    public fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions)
    }

    /**
     * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
     *   server.
     */
    public fun mountOptions(mountOptions: CfnLocationNFS.MountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions)
    }

    /**
     * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that want
     *   to connect to your NFS file server. You can specify more than one agent. For more
     *   information, see
     *   [Using multiple agents for transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
     *   .
     */
    public fun onPremConfig(onPremConfig: IResolvable) {
        cdkBuilder.onPremConfig(onPremConfig)
    }

    /**
     * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that want
     *   to connect to your NFS file server. You can specify more than one agent. For more
     *   information, see
     *   [Using multiple agents for transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
     *   .
     */
    public fun onPremConfig(onPremConfig: CfnLocationNFS.OnPremConfigProperty) {
        cdkBuilder.onPremConfig(onPremConfig)
    }

    /**
     * @param serverHostname Specifies the Domain Name System (DNS) name or IP version 4 address of
     *   the NFS file server that your DataSync agent connects to.
     */
    public fun serverHostname(serverHostname: String) {
        cdkBuilder.serverHostname(serverHostname)
    }

    /**
     * @param subdirectory Specifies the export path in your NFS file server that you want DataSync
     *   to mount. This path (or a subdirectory of the path) is where DataSync transfers data to or
     *   from. For information on configuring an export for DataSync, see
     *   [Accessing NFS file servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs)
     *   .
     */
    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources. We recommend creating at least a name tag for your location.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources. We recommend creating at least a name tag for your location.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLocationNFSProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}

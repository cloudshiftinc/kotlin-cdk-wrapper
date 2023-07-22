@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
import software.constructs.Construct

@CdkDslMarker
public class CfnLocationNFSDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLocationNFS.Builder = CfnLocationNFS.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Specifies the mount options that DataSync can use to mount your NFS share.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-mountoptions)
   * @param mountOptions Specifies the mount options that DataSync can use to mount your NFS share. 
   */
  public fun mountOptions(mountOptions: IResolvable) {
    cdkBuilder.mountOptions(mountOptions)
  }

  /**
   * Specifies the mount options that DataSync can use to mount your NFS share.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-mountoptions)
   * @param mountOptions Specifies the mount options that DataSync can use to mount your NFS share. 
   */
  public fun mountOptions(mountOptions: CfnLocationNFS.MountOptionsProperty) {
    cdkBuilder.mountOptions(mountOptions)
  }

  /**
   * Specifies the Amazon Resource Names (ARNs) of agents that DataSync uses to connect to your NFS
   * file server.
   *
   * If you are copying data to or from your AWS Snowcone device, see [NFS Server on AWS
   * Snowcone](https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#nfs-on-snowcone)
   * for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-onpremconfig)
   * @param onPremConfig Specifies the Amazon Resource Names (ARNs) of agents that DataSync uses to
   * connect to your NFS file server. 
   */
  public fun onPremConfig(onPremConfig: IResolvable) {
    cdkBuilder.onPremConfig(onPremConfig)
  }

  /**
   * Specifies the Amazon Resource Names (ARNs) of agents that DataSync uses to connect to your NFS
   * file server.
   *
   * If you are copying data to or from your AWS Snowcone device, see [NFS Server on AWS
   * Snowcone](https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#nfs-on-snowcone)
   * for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-onpremconfig)
   * @param onPremConfig Specifies the Amazon Resource Names (ARNs) of agents that DataSync uses to
   * connect to your NFS file server. 
   */
  public fun onPremConfig(onPremConfig: CfnLocationNFS.OnPremConfigProperty) {
    cdkBuilder.onPremConfig(onPremConfig)
  }

  /**
   * Specifies the IP address or domain name of your NFS file server.
   *
   * An agent that is installed on-premises uses this hostname to mount the NFS server in a network.
   *
   * If you are copying data to or from your AWS Snowcone device, see [NFS Server on AWS
   * Snowcone](https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#nfs-on-snowcone)
   * for more information.
   *
   *
   * You must specify be an IP version 4 address or Domain Name System (DNS)-compliant name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-serverhostname)
   * @param serverHostname Specifies the IP address or domain name of your NFS file server. 
   */
  public fun serverHostname(serverHostname: String) {
    cdkBuilder.serverHostname(serverHostname)
  }

  /**
   * Specifies the subdirectory in the NFS file server that DataSync transfers to or from.
   *
   * The NFS path should be a path that's exported by the NFS server, or a subdirectory of that
   * path. The path should be such that it can be mounted by other NFS clients in your network.
   *
   * To see all the paths exported by your NFS server, run " `showmount -e nfs-server-name` " from
   * an NFS client that has access to your server. You can specify any directory that appears in the
   * results, and any subdirectory of that directory. Ensure that the NFS export is accessible without
   * Kerberos authentication.
   *
   * To transfer all the data in the folder you specified, DataSync needs to have permissions to
   * read all the data. To ensure this, either configure the NFS export with `no_root_squash,` or
   * ensure that the permissions for all of the files that you want DataSync allow read access for all
   * users. Doing either enables the agent to read the files. For the agent to access directories, you
   * must additionally enable all execute access.
   *
   * If you are copying data to or from your AWS Snowcone device, see [NFS Server on AWS
   * Snowcone](https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#nfs-on-snowcone)
   * for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-subdirectory)
   * @param subdirectory Specifies the subdirectory in the NFS file server that DataSync transfers
   * to or from. 
   */
  public fun subdirectory(subdirectory: String) {
    cdkBuilder.subdirectory(subdirectory)
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-tags)
   * @param tags Specifies labels that help you categorize, filter, and search for your AWS
   * resources. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-tags)
   * @param tags Specifies labels that help you categorize, filter, and search for your AWS
   * resources. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLocationNFS {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

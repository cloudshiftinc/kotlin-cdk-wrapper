@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnLocationHDFS

@CdkDslMarker
public class CfnLocationHDFSQopConfigurationPropertyDsl {
  private val cdkBuilder: CfnLocationHDFS.QopConfigurationProperty.Builder =
      CfnLocationHDFS.QopConfigurationProperty.builder()

  /**
   * @param dataTransferProtection The data transfer protection setting configured on the HDFS
   * cluster.
   * This setting corresponds to your `dfs.data.transfer.protection` setting in the `hdfs-site.xml`
   * file on your Hadoop cluster.
   */
  public fun dataTransferProtection(dataTransferProtection: String) {
    cdkBuilder.dataTransferProtection(dataTransferProtection)
  }

  /**
   * @param rpcProtection The Remote Procedure Call (RPC) protection setting configured on the HDFS
   * cluster.
   * This setting corresponds to your `hadoop.rpc.protection` setting in your `core-site.xml` file
   * on your Hadoop cluster.
   */
  public fun rpcProtection(rpcProtection: String) {
    cdkBuilder.rpcProtection(rpcProtection)
  }

  public fun build(): CfnLocationHDFS.QopConfigurationProperty = cdkBuilder.build()
}

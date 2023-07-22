@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnLocationHDFS

@CdkDslMarker
public class CfnLocationHDFSNameNodePropertyDsl {
  private val cdkBuilder: CfnLocationHDFS.NameNodeProperty.Builder =
      CfnLocationHDFS.NameNodeProperty.builder()

  /**
   * @param hostname The hostname of the NameNode in the HDFS cluster. 
   * This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent that's
   * installed on-premises uses this hostname to communicate with the NameNode in the network.
   */
  public fun hostname(hostname: String) {
    cdkBuilder.hostname(hostname)
  }

  /**
   * @param port The port that the NameNode uses to listen to client requests. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnLocationHDFS.NameNodeProperty = cdkBuilder.build()
}

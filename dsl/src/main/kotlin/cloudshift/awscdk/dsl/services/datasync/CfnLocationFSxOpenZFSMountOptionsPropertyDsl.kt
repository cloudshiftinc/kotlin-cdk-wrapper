@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS

@CdkDslMarker
public class CfnLocationFSxOpenZFSMountOptionsPropertyDsl {
  private val cdkBuilder: CfnLocationFSxOpenZFS.MountOptionsProperty.Builder =
      CfnLocationFSxOpenZFS.MountOptionsProperty.builder()

  /**
   * @param version The specific NFS version that you want DataSync to use to mount your NFS share.
   * If the server refuses to use the version specified, the sync will fail. If you don't specify a
   * version, DataSync defaults to `AUTOMATIC` . That is, DataSync automatically selects a version
   * based on negotiation with the NFS server.
   *
   * You can specify the following NFS versions:
   *
   * * *[NFSv3](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc1813)* : Stateless
   * protocol version that allows for asynchronous writes on the server.
   * * *[NFSv4.0](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3530)* : Stateful,
   * firewall-friendly protocol version that supports delegations and pseudo file systems.
   * * *[NFSv4.1](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc5661)* : Stateful
   * protocol version that supports sessions, directory delegations, and parallel data processing.
   * Version 4.1 also includes all features available in version 4.0.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnLocationFSxOpenZFS.MountOptionsProperty = cdkBuilder.build()
}

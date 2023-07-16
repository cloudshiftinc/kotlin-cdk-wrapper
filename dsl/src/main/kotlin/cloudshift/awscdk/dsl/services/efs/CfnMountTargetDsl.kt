@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.efs.CfnMountTarget
import software.constructs.Construct

@CdkDslMarker
public class CfnMountTargetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMountTarget.Builder = CfnMountTarget.Builder.create(scope, id)

  private val _securityGroups: MutableList<String> = mutableListOf()

  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
  }

  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnMountTarget {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}

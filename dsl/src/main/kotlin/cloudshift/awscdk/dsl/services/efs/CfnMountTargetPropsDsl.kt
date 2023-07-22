@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.efs.CfnMountTargetProps

@CdkDslMarker
public class CfnMountTargetPropsDsl {
  private val cdkBuilder: CfnMountTargetProps.Builder = CfnMountTargetProps.builder()

  private val _securityGroups: MutableList<String> = mutableListOf()

  /**
   * @param fileSystemId The ID of the file system for which to create the mount target. 
   */
  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  /**
   * @param ipAddress Valid IPv4 address within the address range of the specified subnet.
   */
  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
  }

  /**
   * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . 
   * These must be for the same VPC as subnet specified.
   */
  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . 
   * These must be for the same VPC as subnet specified.
   */
  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param subnetId The ID of the subnet to add the mount target in. 
   * For file systems that use One Zone storage classes, use the subnet that is associated with the
   * file system's Availability Zone.
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnMountTargetProps {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}

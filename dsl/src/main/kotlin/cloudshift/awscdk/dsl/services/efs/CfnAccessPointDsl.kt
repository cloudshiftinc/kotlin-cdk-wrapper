@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.efs.CfnAccessPoint
import software.constructs.Construct

@CdkDslMarker
public class CfnAccessPointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccessPoint.Builder = CfnAccessPoint.Builder.create(scope, id)

  private val _accessPointTags: MutableList<CfnAccessPoint.AccessPointTagProperty> = mutableListOf()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags)
   * @param accessPointTags An array of key-value pairs to apply to this resource. 
   */
  public fun accessPointTags(accessPointTags: CfnAccessPointAccessPointTagPropertyDsl.() -> Unit) {
    _accessPointTags.add(CfnAccessPointAccessPointTagPropertyDsl().apply(accessPointTags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-accesspointtags)
   * @param accessPointTags An array of key-value pairs to apply to this resource. 
   */
  public fun accessPointTags(accessPointTags: Collection<CfnAccessPoint.AccessPointTagProperty>) {
    _accessPointTags.addAll(accessPointTags)
  }

  /**
   * The opaque string specified in the request to ensure idempotent creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-clienttoken)
   * @param clientToken The opaque string specified in the request to ensure idempotent creation. 
   */
  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  /**
   * The ID of the EFS file system that the access point applies to.
   *
   * Accepts only the ID format for input when specifying a file system, for example
   * `fs-0123456789abcedf2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-filesystemid)
   * @param fileSystemId The ID of the EFS file system that the access point applies to. 
   */
  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  /**
   * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access
   * point that is used for all file operations by NFS clients using the access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-posixuser)
   * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary group
   * IDs on the access point that is used for all file operations by NFS clients using the access
   * point. 
   */
  public fun posixUser(posixUser: IResolvable) {
    cdkBuilder.posixUser(posixUser)
  }

  /**
   * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access
   * point that is used for all file operations by NFS clients using the access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-posixuser)
   * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary group
   * IDs on the access point that is used for all file operations by NFS clients using the access
   * point. 
   */
  public fun posixUser(posixUser: CfnAccessPoint.PosixUserProperty) {
    cdkBuilder.posixUser(posixUser)
  }

  /**
   * The directory on the Amazon EFS file system that the access point exposes as the root directory
   * to NFS clients using the access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-rootdirectory)
   * @param rootDirectory The directory on the Amazon EFS file system that the access point exposes
   * as the root directory to NFS clients using the access point. 
   */
  public fun rootDirectory(rootDirectory: IResolvable) {
    cdkBuilder.rootDirectory(rootDirectory)
  }

  /**
   * The directory on the Amazon EFS file system that the access point exposes as the root directory
   * to NFS clients using the access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html#cfn-efs-accesspoint-rootdirectory)
   * @param rootDirectory The directory on the Amazon EFS file system that the access point exposes
   * as the root directory to NFS clients using the access point. 
   */
  public fun rootDirectory(rootDirectory: CfnAccessPoint.RootDirectoryProperty) {
    cdkBuilder.rootDirectory(rootDirectory)
  }

  public fun build(): CfnAccessPoint {
    if(_accessPointTags.isNotEmpty()) cdkBuilder.accessPointTags(_accessPointTags)
    return cdkBuilder.build()
  }
}

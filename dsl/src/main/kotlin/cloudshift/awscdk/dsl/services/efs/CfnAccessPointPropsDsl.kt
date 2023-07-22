@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.efs.CfnAccessPoint
import software.amazon.awscdk.services.efs.CfnAccessPointProps

/**
 * Properties for defining a `CfnAccessPoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * CfnAccessPointProps cfnAccessPointProps = CfnAccessPointProps.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .accessPointTags(List.of(AccessPointTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .clientToken("clientToken")
 * .posixUser(PosixUserProperty.builder()
 * .gid("gid")
 * .uid("uid")
 * // the properties below are optional
 * .secondaryGids(List.of("secondaryGids"))
 * .build())
 * .rootDirectory(RootDirectoryProperty.builder()
 * .creationInfo(CreationInfoProperty.builder()
 * .ownerGid("ownerGid")
 * .ownerUid("ownerUid")
 * .permissions("permissions")
 * .build())
 * .path("path")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html)
 */
@CdkDslMarker
public class CfnAccessPointPropsDsl {
  private val cdkBuilder: CfnAccessPointProps.Builder = CfnAccessPointProps.builder()

  private val _accessPointTags: MutableList<CfnAccessPoint.AccessPointTagProperty> = mutableListOf()

  /**
   * @param accessPointTags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun accessPointTags(accessPointTags: CfnAccessPointAccessPointTagPropertyDsl.() -> Unit) {
    _accessPointTags.add(CfnAccessPointAccessPointTagPropertyDsl().apply(accessPointTags).build())
  }

  /**
   * @param accessPointTags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun accessPointTags(accessPointTags: Collection<CfnAccessPoint.AccessPointTagProperty>) {
    _accessPointTags.addAll(accessPointTags)
  }

  /**
   * @param clientToken The opaque string specified in the request to ensure idempotent creation.
   */
  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  /**
   * @param fileSystemId The ID of the EFS file system that the access point applies to. 
   * Accepts only the ID format for input when specifying a file system, for example
   * `fs-0123456789abcedf2` .
   */
  public fun fileSystemId(fileSystemId: String) {
    cdkBuilder.fileSystemId(fileSystemId)
  }

  /**
   * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary group
   * IDs on the access point that is used for all file operations by NFS clients using the access
   * point.
   */
  public fun posixUser(posixUser: IResolvable) {
    cdkBuilder.posixUser(posixUser)
  }

  /**
   * @param posixUser The full POSIX identity, including the user ID, group ID, and secondary group
   * IDs on the access point that is used for all file operations by NFS clients using the access
   * point.
   */
  public fun posixUser(posixUser: CfnAccessPoint.PosixUserProperty) {
    cdkBuilder.posixUser(posixUser)
  }

  /**
   * @param rootDirectory The directory on the Amazon EFS file system that the access point exposes
   * as the root directory to NFS clients using the access point.
   */
  public fun rootDirectory(rootDirectory: IResolvable) {
    cdkBuilder.rootDirectory(rootDirectory)
  }

  /**
   * @param rootDirectory The directory on the Amazon EFS file system that the access point exposes
   * as the root directory to NFS clients using the access point.
   */
  public fun rootDirectory(rootDirectory: CfnAccessPoint.RootDirectoryProperty) {
    cdkBuilder.rootDirectory(rootDirectory)
  }

  public fun build(): CfnAccessPointProps {
    if(_accessPointTags.isNotEmpty()) cdkBuilder.accessPointTags(_accessPointTags)
    return cdkBuilder.build()
  }
}

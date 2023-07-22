@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.efs.CfnAccessPoint

/**
 * The full POSIX identity, including the user ID, group ID, and any secondary group IDs, on the
 * access point that is used for all file system operations performed by NFS clients using the access
 * point.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * PosixUserProperty posixUserProperty = PosixUserProperty.builder()
 * .gid("gid")
 * .uid("uid")
 * // the properties below are optional
 * .secondaryGids(List.of("secondaryGids"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html)
 */
@CdkDslMarker
public class CfnAccessPointPosixUserPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.PosixUserProperty.Builder =
      CfnAccessPoint.PosixUserProperty.builder()

  private val _secondaryGids: MutableList<String> = mutableListOf()

  /**
   * @param gid The POSIX group ID used for all file system operations using this access point. 
   */
  public fun gid(gid: String) {
    cdkBuilder.gid(gid)
  }

  /**
   * @param secondaryGids Secondary POSIX group IDs used for all file system operations using this
   * access point.
   */
  public fun secondaryGids(vararg secondaryGids: String) {
    _secondaryGids.addAll(listOf(*secondaryGids))
  }

  /**
   * @param secondaryGids Secondary POSIX group IDs used for all file system operations using this
   * access point.
   */
  public fun secondaryGids(secondaryGids: Collection<String>) {
    _secondaryGids.addAll(secondaryGids)
  }

  /**
   * @param uid The POSIX user ID used for all file system operations using this access point. 
   */
  public fun uid(uid: String) {
    cdkBuilder.uid(uid)
  }

  public fun build(): CfnAccessPoint.PosixUserProperty {
    if(_secondaryGids.isNotEmpty()) cdkBuilder.secondaryGids(_secondaryGids)
    return cdkBuilder.build()
  }
}

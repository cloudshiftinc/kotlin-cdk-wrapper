@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionAuthorizationConfigPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.AuthorizationConfigProperty.Builder =
      CfnTaskDefinition.AuthorizationConfigProperty.builder()

  /**
   * @param accessPointId The Amazon EFS access point ID to use.
   * If an access point is specified, the root directory value specified in the
   * `EFSVolumeConfiguration` must either be omitted or set to `/` which will enforce the path set on
   * the EFS access point. If an access point is used, transit encryption must be on in the
   * `EFSVolumeConfiguration` . For more information, see [Working with Amazon EFS access
   * points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) in the *Amazon Elastic
   * File System User Guide* .
   */
  public fun accessPointId(accessPointId: String) {
    cdkBuilder.accessPointId(accessPointId)
  }

  /**
   * @param iam Determines whether to use the Amazon ECS task role defined in a task definition when
   * mounting the Amazon EFS file system.
   * If it is turned on, transit encryption must be turned on in the `EFSVolumeConfiguration` . If
   * this parameter is omitted, the default value of `DISABLED` is used. For more information, see
   * [Using Amazon EFS access
   * points](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints)
   * in the *Amazon Elastic Container Service Developer Guide* .
   */
  public fun iam(iam: String) {
    cdkBuilder.iam(iam)
  }

  public fun build(): CfnTaskDefinition.AuthorizationConfigProperty = cdkBuilder.build()
}

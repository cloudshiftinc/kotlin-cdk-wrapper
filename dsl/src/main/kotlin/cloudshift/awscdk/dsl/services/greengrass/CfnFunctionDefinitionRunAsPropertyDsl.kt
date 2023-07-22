@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition

@CdkDslMarker
public class CfnFunctionDefinitionRunAsPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinition.RunAsProperty.Builder =
      CfnFunctionDefinition.RunAsProperty.builder()

  /**
   * @param gid The group ID whose permissions are used to run the Lambda function.
   * You can use the `getent group` command on your core device to look up the group ID.
   */
  public fun gid(gid: Number) {
    cdkBuilder.gid(gid)
  }

  /**
   * @param uid The user ID whose permissions are used to run the Lambda function.
   * You can use the `getent passwd` command on your core device to look up the user ID.
   */
  public fun uid(uid: Number) {
    cdkBuilder.uid(uid)
  }

  public fun build(): CfnFunctionDefinition.RunAsProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the AWS Cloud Map attribute information for your virtual node.
 *
 *
 * AWS Cloud Map is not available in the eu-south-1 Region.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * AwsCloudMapInstanceAttributeProperty awsCloudMapInstanceAttributeProperty =
 * AwsCloudMapInstanceAttributeProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapinstanceattribute.html)
 */
@CdkDslMarker
public class CfnVirtualNodeAwsCloudMapInstanceAttributePropertyDsl {
  private val cdkBuilder: CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.Builder =
      CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.builder()

  /**
   * @param key The name of an AWS Cloud Map service instance attribute key. 
   * Any AWS Cloud Map service instance that contains the specified key and value is returned.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value of an AWS Cloud Map service instance attribute key. 
   * Any AWS Cloud Map service instance that contains the specified key and value is returned.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnVirtualNode.AwsCloudMapInstanceAttributeProperty = cdkBuilder.build()
}

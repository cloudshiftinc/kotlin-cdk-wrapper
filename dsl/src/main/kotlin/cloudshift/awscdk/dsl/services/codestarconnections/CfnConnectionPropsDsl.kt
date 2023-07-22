@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarconnections

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.codestarconnections.CfnConnectionProps

/**
 * Properties for defining a `CfnConnection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codestarconnections.*;
 * CfnConnectionProps cfnConnectionProps = CfnConnectionProps.builder()
 * .connectionName("connectionName")
 * // the properties below are optional
 * .hostArn("hostArn")
 * .providerType("providerType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html)
 */
@CdkDslMarker
public class CfnConnectionPropsDsl {
  private val cdkBuilder: CfnConnectionProps.Builder = CfnConnectionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param connectionName The name of the connection. 
   * Connection names must be unique in an AWS user account.
   */
  public fun connectionName(connectionName: String) {
    cdkBuilder.connectionName(connectionName)
  }

  /**
   * @param hostArn The Amazon Resource Name (ARN) of the host associated with the connection.
   */
  public fun hostArn(hostArn: String) {
    cdkBuilder.hostArn(hostArn)
  }

  /**
   * @param providerType The name of the external provider where your third-party code repository is
   * configured.
   */
  public fun providerType(providerType: String) {
    cdkBuilder.providerType(providerType)
  }

  /**
   * @param tags Specifies the tags applied to the resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Specifies the tags applied to the resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnConnectionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.identitystore

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.identitystore.CfnGroup
import software.constructs.Construct

/**
 * A group object, which contains a specified group’s metadata and attributes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.identitystore.*;
 * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
 * .displayName("displayName")
 * .identityStoreId("identityStoreId")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html)
 */
@CdkDslMarker
public class CfnGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGroup.Builder = CfnGroup.Builder.create(scope, id)

  /**
   * A string containing the description of the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-description)
   * @param description A string containing the description of the group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * A string containing the name of the group.
   *
   * This value is commonly displayed when the group is referenced.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-displayname)
   * @param displayName A string containing the name of the group. 
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * The globally unique identifier for the identity store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-identitystoreid)
   * @param identityStoreId The globally unique identifier for the identity store. 
   */
  public fun identityStoreId(identityStoreId: String) {
    cdkBuilder.identityStoreId(identityStoreId)
  }

  public fun build(): CfnGroup = cdkBuilder.build()
}

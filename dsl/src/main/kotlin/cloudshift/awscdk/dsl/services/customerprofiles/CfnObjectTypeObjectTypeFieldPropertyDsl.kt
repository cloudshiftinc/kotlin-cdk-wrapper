@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnObjectType

/**
 * Represents a field in a ProfileObjectType.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * ObjectTypeFieldProperty objectTypeFieldProperty = ObjectTypeFieldProperty.builder()
 * .contentType("contentType")
 * .source("source")
 * .target("target")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-objecttypefield.html)
 */
@CdkDslMarker
public class CfnObjectTypeObjectTypeFieldPropertyDsl {
  private val cdkBuilder: CfnObjectType.ObjectTypeFieldProperty.Builder =
      CfnObjectType.ObjectTypeFieldProperty.builder()

  /**
   * @param contentType The content type of the field.
   * Used for determining equality when searching.
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param source A field of a ProfileObject.
   * For example: _source.FirstName, where “_source” is a ProfileObjectType of a Zendesk user and
   * “FirstName” is a field in that ObjectType.
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  /**
   * @param target The location of the data in the standard ProfileObject model.
   * For example: _profile.Address.PostalCode.
   */
  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnObjectType.ObjectTypeFieldProperty = cdkBuilder.build()
}

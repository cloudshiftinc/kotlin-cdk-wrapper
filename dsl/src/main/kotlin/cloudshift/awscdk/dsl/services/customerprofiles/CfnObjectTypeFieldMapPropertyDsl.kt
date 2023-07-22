@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnObjectType

/**
 * A map of the name and ObjectType field.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * FieldMapProperty fieldMapProperty = FieldMapProperty.builder()
 * .name("name")
 * .objectTypeField(ObjectTypeFieldProperty.builder()
 * .contentType("contentType")
 * .source("source")
 * .target("target")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-fieldmap.html)
 */
@CdkDslMarker
public class CfnObjectTypeFieldMapPropertyDsl {
  private val cdkBuilder: CfnObjectType.FieldMapProperty.Builder =
      CfnObjectType.FieldMapProperty.builder()

  /**
   * @param name Name of the field.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param objectTypeField Represents a field in a ProfileObjectType.
   */
  public fun objectTypeField(objectTypeField: IResolvable) {
    cdkBuilder.objectTypeField(objectTypeField)
  }

  /**
   * @param objectTypeField Represents a field in a ProfileObjectType.
   */
  public fun objectTypeField(objectTypeField: CfnObjectType.ObjectTypeFieldProperty) {
    cdkBuilder.objectTypeField(objectTypeField)
  }

  public fun build(): CfnObjectType.FieldMapProperty = cdkBuilder.build()
}

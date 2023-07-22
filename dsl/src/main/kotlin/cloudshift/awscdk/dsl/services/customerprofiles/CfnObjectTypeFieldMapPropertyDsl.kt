@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnObjectType

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

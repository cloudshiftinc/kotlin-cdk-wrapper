@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnIndex

@CdkDslMarker
public class CfnIndexJsonTokenTypeConfigurationPropertyDsl {
  private val cdkBuilder: CfnIndex.JsonTokenTypeConfigurationProperty.Builder =
      CfnIndex.JsonTokenTypeConfigurationProperty.builder()

  /**
   * @param groupAttributeField The group attribute field. 
   */
  public fun groupAttributeField(groupAttributeField: String) {
    cdkBuilder.groupAttributeField(groupAttributeField)
  }

  /**
   * @param userNameAttributeField The user name attribute field. 
   */
  public fun userNameAttributeField(userNameAttributeField: String) {
    cdkBuilder.userNameAttributeField(userNameAttributeField)
  }

  public fun build(): CfnIndex.JsonTokenTypeConfigurationProperty = cdkBuilder.build()
}

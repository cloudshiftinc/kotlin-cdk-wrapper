@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstance
import software.amazon.awscdk.services.connect.CfnInstanceProps

@CdkDslMarker
public class CfnInstancePropsDsl {
  private val cdkBuilder: CfnInstanceProps.Builder = CfnInstanceProps.builder()

  /**
   * @param attributes A toggle for an individual feature at the instance level. 
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * @param attributes A toggle for an individual feature at the instance level. 
   */
  public fun attributes(attributes: CfnInstance.AttributesProperty) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * @param directoryId The identifier for the directory.
   */
  public fun directoryId(directoryId: String) {
    cdkBuilder.directoryId(directoryId)
  }

  /**
   * @param identityManagementType The identity management type. 
   */
  public fun identityManagementType(identityManagementType: String) {
    cdkBuilder.identityManagementType(identityManagementType)
  }

  /**
   * @param instanceAlias The alias of instance.
   * `InstanceAlias` is only required when `IdentityManagementType` is `CONNECT_MANAGED` or `SAML` .
   * `InstanceAlias` is not required when `IdentityManagementType` is `EXISTING_DIRECTORY` .
   */
  public fun instanceAlias(instanceAlias: String) {
    cdkBuilder.instanceAlias(instanceAlias)
  }

  public fun build(): CfnInstanceProps = cdkBuilder.build()
}

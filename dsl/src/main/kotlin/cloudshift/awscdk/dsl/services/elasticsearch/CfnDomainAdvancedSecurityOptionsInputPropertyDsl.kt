@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@CdkDslMarker
public class CfnDomainAdvancedSecurityOptionsInputPropertyDsl {
  private val cdkBuilder: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder =
      CfnDomain.AdvancedSecurityOptionsInputProperty.builder()

  /**
   * @param anonymousAuthEnabled the value to be set.
   */
  public fun anonymousAuthEnabled(anonymousAuthEnabled: Boolean) {
    cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled)
  }

  /**
   * @param anonymousAuthEnabled the value to be set.
   */
  public fun anonymousAuthEnabled(anonymousAuthEnabled: IResolvable) {
    cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled)
  }

  /**
   * @param enabled True to enable fine-grained access control.
   * You must also enable encryption of data at rest and node-to-node encryption.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled True to enable fine-grained access control.
   * You must also enable encryption of data at rest and node-to-node encryption.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param internalUserDatabaseEnabled True to enable the internal user database.
   */
  public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: Boolean) {
    cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled)
  }

  /**
   * @param internalUserDatabaseEnabled True to enable the internal user database.
   */
  public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: IResolvable) {
    cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled)
  }

  /**
   * @param masterUserOptions Specifies information about the master user.
   */
  public fun masterUserOptions(masterUserOptions: IResolvable) {
    cdkBuilder.masterUserOptions(masterUserOptions)
  }

  /**
   * @param masterUserOptions Specifies information about the master user.
   */
  public fun masterUserOptions(masterUserOptions: CfnDomain.MasterUserOptionsProperty) {
    cdkBuilder.masterUserOptions(masterUserOptions)
  }

  public fun build(): CfnDomain.AdvancedSecurityOptionsInputProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.healthlake.*;
 * IdentityProviderConfigurationProperty identityProviderConfigurationProperty =
 * IdentityProviderConfigurationProperty.builder()
 * .authorizationStrategy("authorizationStrategy")
 * // the properties below are optional
 * .fineGrainedAuthorizationEnabled(false)
 * .idpLambdaArn("idpLambdaArn")
 * .metadata("metadata")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-identityproviderconfiguration.html)
 */
@CdkDslMarker
public class CfnFHIRDatastoreIdentityProviderConfigurationPropertyDsl {
  private val cdkBuilder: CfnFHIRDatastore.IdentityProviderConfigurationProperty.Builder =
      CfnFHIRDatastore.IdentityProviderConfigurationProperty.builder()

  /**
   * @param authorizationStrategy the value to be set. 
   */
  public fun authorizationStrategy(authorizationStrategy: String) {
    cdkBuilder.authorizationStrategy(authorizationStrategy)
  }

  /**
   * @param fineGrainedAuthorizationEnabled the value to be set.
   */
  public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: Boolean) {
    cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled)
  }

  /**
   * @param fineGrainedAuthorizationEnabled the value to be set.
   */
  public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: IResolvable) {
    cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled)
  }

  /**
   * @param idpLambdaArn the value to be set.
   */
  public fun idpLambdaArn(idpLambdaArn: String) {
    cdkBuilder.idpLambdaArn(idpLambdaArn)
  }

  /**
   * @param metadata the value to be set.
   */
  public fun metadata(metadata: String) {
    cdkBuilder.metadata(metadata)
  }

  public fun build(): CfnFHIRDatastore.IdentityProviderConfigurationProperty = cdkBuilder.build()
}

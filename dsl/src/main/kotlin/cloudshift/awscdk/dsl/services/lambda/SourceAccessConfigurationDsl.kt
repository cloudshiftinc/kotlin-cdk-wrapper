@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.SourceAccessConfiguration
import software.amazon.awscdk.services.lambda.SourceAccessConfigurationType

@CdkDslMarker
public class SourceAccessConfigurationDsl {
  private val cdkBuilder: SourceAccessConfiguration.Builder = SourceAccessConfiguration.builder()

  /**
   * @param type The type of authentication protocol or the VPC components for your event source. 
   * For example: "SASL_SCRAM_512_AUTH".
   */
  public fun type(type: SourceAccessConfigurationType) {
    cdkBuilder.type(type)
  }

  /**
   * @param uri The value for your chosen configuration in type. 
   * For example: "URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName".
   * The exact string depends on the type.
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): SourceAccessConfiguration = cdkBuilder.build()
}

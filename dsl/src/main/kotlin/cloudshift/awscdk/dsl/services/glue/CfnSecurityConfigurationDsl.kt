@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration
import software.constructs.Construct

/**
 * Creates a new security configuration.
 *
 * A security configuration is a set of security properties that can be used by AWS Glue . You can
 * use a security configuration to encrypt data at rest. For information about using security
 * configurations in AWS Glue , see [Encrypting Data Written by Crawlers, Jobs, and Development
 * Endpoints](https://docs.aws.amazon.com/glue/latest/dg/encryption-security-configuration.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnSecurityConfiguration cfnSecurityConfiguration = CfnSecurityConfiguration.Builder.create(this,
 * "MyCfnSecurityConfiguration")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .cloudWatchEncryption(CloudWatchEncryptionProperty.builder()
 * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .jobBookmarksEncryption(JobBookmarksEncryptionProperty.builder()
 * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .s3Encryptions(List.of(S3EncryptionProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .s3EncryptionMode("s3EncryptionMode")
 * .build()))
 * .build())
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html)
 */
@CdkDslMarker
public class CfnSecurityConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecurityConfiguration.Builder =
      CfnSecurityConfiguration.Builder.create(scope, id)

  /**
   * The encryption configuration associated with this security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
   * @param encryptionConfiguration The encryption configuration associated with this security
   * configuration. 
   */
  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * The encryption configuration associated with this security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
   * @param encryptionConfiguration The encryption configuration associated with this security
   * configuration. 
   */
  public
      fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * The name of the security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-name)
   * @param name The name of the security configuration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnSecurityConfiguration = cdkBuilder.build()
}

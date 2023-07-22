@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.forecast

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.forecast.CfnDataset

@CdkDslMarker
public class CfnDatasetEncryptionConfigPropertyDsl {
  private val cdkBuilder: CfnDataset.EncryptionConfigProperty.Builder =
      CfnDataset.EncryptionConfigProperty.builder()

  /**
   * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * @param roleArn The ARN of the IAM role that Amazon Forecast can assume to access the AWS KMS
   * key.
   * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your
   * account, you get an `InvalidInputException` error.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDataset.EncryptionConfigProperty = cdkBuilder.build()
}

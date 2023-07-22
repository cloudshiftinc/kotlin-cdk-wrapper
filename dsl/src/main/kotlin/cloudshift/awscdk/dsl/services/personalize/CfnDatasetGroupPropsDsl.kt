@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnDatasetGroupProps

@CdkDslMarker
public class CfnDatasetGroupPropsDsl {
  private val cdkBuilder: CfnDatasetGroupProps.Builder = CfnDatasetGroupProps.builder()

  /**
   * @param domain The domain of a Domain dataset group.
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key
   * used to encrypt the datasets.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * @param name The name of the dataset group. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param roleArn The ARN of the IAM role that has permissions to create the dataset group.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDatasetGroupProps = cdkBuilder.build()
}

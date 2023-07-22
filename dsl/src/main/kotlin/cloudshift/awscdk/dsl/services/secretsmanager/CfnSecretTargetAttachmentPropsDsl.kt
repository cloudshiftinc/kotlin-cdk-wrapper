@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps

@CdkDslMarker
public class CfnSecretTargetAttachmentPropsDsl {
  private val cdkBuilder: CfnSecretTargetAttachmentProps.Builder =
      CfnSecretTargetAttachmentProps.builder()

  /**
   * @param secretId The ARN or name of the secret. 
   * To reference a secret also created in this template, use the see
   * [Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)
   * function with the secret's logical ID.
   */
  public fun secretId(secretId: String) {
    cdkBuilder.secretId(secretId)
  }

  /**
   * @param targetId The ID of the database or cluster. 
   */
  public fun targetId(targetId: String) {
    cdkBuilder.targetId(targetId)
  }

  /**
   * @param targetType A string that defines the type of service or database associated with the
   * secret. 
   * This value instructs Secrets Manager how to update the secret with the details of the service
   * or database. This value must be one of the following:
   *
   * * AWS::RDS::DBInstance
   * * AWS::RDS::DBCluster
   * * AWS::Redshift::Cluster
   * * AWS::DocDB::DBInstance
   * * AWS::DocDB::DBCluster
   */
  public fun targetType(targetType: String) {
    cdkBuilder.targetType(targetType)
  }

  public fun build(): CfnSecretTargetAttachmentProps = cdkBuilder.build()
}

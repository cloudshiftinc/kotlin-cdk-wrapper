@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule

@CdkDslMarker
public class CfnRotationScheduleHostedRotationLambdaPropertyDsl {
  private val cdkBuilder: CfnRotationSchedule.HostedRotationLambdaProperty.Builder =
      CfnRotationSchedule.HostedRotationLambdaProperty.builder()

  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  public fun masterSecretArn(masterSecretArn: String) {
    cdkBuilder.masterSecretArn(masterSecretArn)
  }

  public fun masterSecretKmsKeyArn(masterSecretKmsKeyArn: String) {
    cdkBuilder.masterSecretKmsKeyArn(masterSecretKmsKeyArn)
  }

  public fun rotationLambdaName(rotationLambdaName: String) {
    cdkBuilder.rotationLambdaName(rotationLambdaName)
  }

  public fun rotationType(rotationType: String) {
    cdkBuilder.rotationType(rotationType)
  }

  public fun runtime(runtime: String) {
    cdkBuilder.runtime(runtime)
  }

  public fun superuserSecretArn(superuserSecretArn: String) {
    cdkBuilder.superuserSecretArn(superuserSecretArn)
  }

  public fun superuserSecretKmsKeyArn(superuserSecretKmsKeyArn: String) {
    cdkBuilder.superuserSecretKmsKeyArn(superuserSecretKmsKeyArn)
  }

  public fun vpcSecurityGroupIds(vpcSecurityGroupIds: String) {
    cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
  }

  public fun vpcSubnetIds(vpcSubnetIds: String) {
    cdkBuilder.vpcSubnetIds(vpcSubnetIds)
  }

  public fun build(): CfnRotationSchedule.HostedRotationLambdaProperty = cdkBuilder.build()
}

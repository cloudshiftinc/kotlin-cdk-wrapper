@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.Architecture
import software.amazon.awscdk.services.lambda.FunctionAttributes

@CdkDslMarker
public class FunctionAttributesDsl {
  private val cdkBuilder: FunctionAttributes.Builder = FunctionAttributes.builder()

  public fun architecture(architecture: Architecture) {
    cdkBuilder.architecture(architecture)
  }

  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun sameEnvironment(sameEnvironment: Boolean) {
    cdkBuilder.sameEnvironment(sameEnvironment)
  }

  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun skipPermissions(skipPermissions: Boolean) {
    cdkBuilder.skipPermissions(skipPermissions)
  }

  public fun build(): FunctionAttributes = cdkBuilder.build()
}

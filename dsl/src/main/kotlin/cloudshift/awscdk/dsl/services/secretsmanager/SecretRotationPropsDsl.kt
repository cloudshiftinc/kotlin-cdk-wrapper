@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IConnectable
import software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplication
import software.amazon.awscdk.services.secretsmanager.SecretRotationProps

@CdkDslMarker
public class SecretRotationPropsDsl {
  private val cdkBuilder: SecretRotationProps.Builder = SecretRotationProps.builder()

  public fun application(application: SecretRotationApplication) {
    cdkBuilder.application(application)
  }

  public fun automaticallyAfter(automaticallyAfter: Duration) {
    cdkBuilder.automaticallyAfter(automaticallyAfter)
  }

  public fun endpoint(endpoint: IInterfaceVpcEndpoint) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  public fun masterSecret(masterSecret: ISecret) {
    cdkBuilder.masterSecret(masterSecret)
  }

  public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
    cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
  }

  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun target(target: IConnectable) {
    cdkBuilder.target(target)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.vpcSubnets(builder.build())
  }

  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): SecretRotationProps = cdkBuilder.build()
}

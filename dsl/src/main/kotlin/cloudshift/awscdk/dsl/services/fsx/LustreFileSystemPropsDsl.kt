@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.ISubnet
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.fsx.LustreConfiguration
import software.amazon.awscdk.services.fsx.LustreFileSystemProps
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
public class LustreFileSystemPropsDsl {
  private val cdkBuilder: LustreFileSystemProps.Builder = LustreFileSystemProps.builder()

  public fun backupId(backupId: String) {
    cdkBuilder.backupId(backupId)
  }

  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun lustreConfiguration(block: LustreConfigurationDsl.() -> Unit = {}) {
    val builder = LustreConfigurationDsl()
    builder.apply(block)
    cdkBuilder.lustreConfiguration(builder.build())
  }

  public fun lustreConfiguration(lustreConfiguration: LustreConfiguration) {
    cdkBuilder.lustreConfiguration(lustreConfiguration)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun storageCapacityGiB(storageCapacityGiB: Number) {
    cdkBuilder.storageCapacityGiB(storageCapacityGiB)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpcSubnet(vpcSubnet: ISubnet) {
    cdkBuilder.vpcSubnet(vpcSubnet)
  }

  public fun build(): LustreFileSystemProps = cdkBuilder.build()
}

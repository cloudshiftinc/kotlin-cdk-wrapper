@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.customresources

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.customresources.ProviderProps
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.logs.RetentionDays

@CdkDslMarker
public class ProviderPropsDsl {
  private val cdkBuilder: ProviderProps.Builder = ProviderProps.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  public fun isCompleteHandler(isCompleteHandler: IFunction) {
    cdkBuilder.isCompleteHandler(isCompleteHandler)
  }

  public fun logRetention(logRetention: RetentionDays) {
    cdkBuilder.logRetention(logRetention)
  }

  public fun onEventHandler(onEventHandler: IFunction) {
    cdkBuilder.onEventHandler(onEventHandler)
  }

  public fun providerFunctionEnvEncryption(providerFunctionEnvEncryption: IKey) {
    cdkBuilder.providerFunctionEnvEncryption(providerFunctionEnvEncryption)
  }

  public fun providerFunctionName(providerFunctionName: String) {
    cdkBuilder.providerFunctionName(providerFunctionName)
  }

  public fun queryInterval(queryInterval: Duration) {
    cdkBuilder.queryInterval(queryInterval)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun totalTimeout(totalTimeout: Duration) {
    cdkBuilder.totalTimeout(totalTimeout)
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

  public fun build(): ProviderProps {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}

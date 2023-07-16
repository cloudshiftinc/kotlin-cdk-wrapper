@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster
import software.amazon.awscdk.services.eks.CfnClusterProps

@CdkDslMarker
public class CfnClusterPropsDsl {
  private val cdkBuilder: CfnClusterProps.Builder = CfnClusterProps.builder()

  private val _encryptionConfig: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun encryptionConfig(vararg encryptionConfig: Any) {
    _encryptionConfig.addAll(listOf(*encryptionConfig))
  }

  public fun encryptionConfig(encryptionConfig: Collection<Any>) {
    _encryptionConfig.addAll(encryptionConfig)
  }

  public fun encryptionConfig(encryptionConfig: IResolvable) {
    cdkBuilder.encryptionConfig(encryptionConfig)
  }

  public fun kubernetesNetworkConfig(kubernetesNetworkConfig: IResolvable) {
    cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig)
  }

  public
      fun kubernetesNetworkConfig(kubernetesNetworkConfig: CfnCluster.KubernetesNetworkConfigProperty) {
    cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig)
  }

  public fun logging(logging: IResolvable) {
    cdkBuilder.logging(logging)
  }

  public fun logging(logging: CfnCluster.LoggingProperty) {
    cdkBuilder.logging(logging)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun outpostConfig(outpostConfig: IResolvable) {
    cdkBuilder.outpostConfig(outpostConfig)
  }

  public fun outpostConfig(outpostConfig: CfnCluster.OutpostConfigProperty) {
    cdkBuilder.outpostConfig(outpostConfig)
  }

  public fun resourcesVpcConfig(resourcesVpcConfig: IResolvable) {
    cdkBuilder.resourcesVpcConfig(resourcesVpcConfig)
  }

  public fun resourcesVpcConfig(resourcesVpcConfig: CfnCluster.ResourcesVpcConfigProperty) {
    cdkBuilder.resourcesVpcConfig(resourcesVpcConfig)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnClusterProps {
    if(_encryptionConfig.isNotEmpty()) cdkBuilder.encryptionConfig(_encryptionConfig)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

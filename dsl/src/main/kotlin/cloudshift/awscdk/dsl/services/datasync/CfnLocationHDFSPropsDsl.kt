@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationHDFS
import software.amazon.awscdk.services.datasync.CfnLocationHDFSProps

@CdkDslMarker
public class CfnLocationHDFSPropsDsl {
  private val cdkBuilder: CfnLocationHDFSProps.Builder = CfnLocationHDFSProps.builder()

  private val _agentArns: MutableList<String> = mutableListOf()

  private val _nameNodes: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun agentArns(vararg agentArns: String) {
    _agentArns.addAll(listOf(*agentArns))
  }

  public fun agentArns(agentArns: Collection<String>) {
    _agentArns.addAll(agentArns)
  }

  public fun authenticationType(authenticationType: String) {
    cdkBuilder.authenticationType(authenticationType)
  }

  public fun blockSize(blockSize: Number) {
    cdkBuilder.blockSize(blockSize)
  }

  public fun kerberosKeytab(kerberosKeytab: String) {
    cdkBuilder.kerberosKeytab(kerberosKeytab)
  }

  public fun kerberosKrb5Conf(kerberosKrb5Conf: String) {
    cdkBuilder.kerberosKrb5Conf(kerberosKrb5Conf)
  }

  public fun kerberosPrincipal(kerberosPrincipal: String) {
    cdkBuilder.kerberosPrincipal(kerberosPrincipal)
  }

  public fun kmsKeyProviderUri(kmsKeyProviderUri: String) {
    cdkBuilder.kmsKeyProviderUri(kmsKeyProviderUri)
  }

  public fun nameNodes(vararg nameNodes: Any) {
    _nameNodes.addAll(listOf(*nameNodes))
  }

  public fun nameNodes(nameNodes: Collection<Any>) {
    _nameNodes.addAll(nameNodes)
  }

  public fun nameNodes(nameNodes: IResolvable) {
    cdkBuilder.nameNodes(nameNodes)
  }

  public fun qopConfiguration(qopConfiguration: IResolvable) {
    cdkBuilder.qopConfiguration(qopConfiguration)
  }

  public fun qopConfiguration(qopConfiguration: CfnLocationHDFS.QopConfigurationProperty) {
    cdkBuilder.qopConfiguration(qopConfiguration)
  }

  public fun replicationFactor(replicationFactor: Number) {
    cdkBuilder.replicationFactor(replicationFactor)
  }

  public fun simpleUser(simpleUser: String) {
    cdkBuilder.simpleUser(simpleUser)
  }

  public fun subdirectory(subdirectory: String) {
    cdkBuilder.subdirectory(subdirectory)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLocationHDFSProps {
    if(_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
    if(_nameNodes.isNotEmpty()) cdkBuilder.nameNodes(_nameNodes)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

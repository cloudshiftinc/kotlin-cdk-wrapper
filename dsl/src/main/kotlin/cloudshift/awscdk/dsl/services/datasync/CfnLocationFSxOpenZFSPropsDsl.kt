@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps

@CdkDslMarker
public class CfnLocationFSxOpenZFSPropsDsl {
  private val cdkBuilder: CfnLocationFSxOpenZFSProps.Builder = CfnLocationFSxOpenZFSProps.builder()

  private val _securityGroupArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun fsxFilesystemArn(fsxFilesystemArn: String) {
    cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
  }

  public fun protocol(protocol: IResolvable) {
    cdkBuilder.protocol(protocol)
  }

  public fun protocol(protocol: CfnLocationFSxOpenZFS.ProtocolProperty) {
    cdkBuilder.protocol(protocol)
  }

  public fun securityGroupArns(vararg securityGroupArns: String) {
    _securityGroupArns.addAll(listOf(*securityGroupArns))
  }

  public fun securityGroupArns(securityGroupArns: Collection<String>) {
    _securityGroupArns.addAll(securityGroupArns)
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

  public fun build(): CfnLocationFSxOpenZFSProps {
    if(_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

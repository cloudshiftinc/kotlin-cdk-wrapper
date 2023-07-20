@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnUser
import software.constructs.Construct

@CdkDslMarker
public class CfnUserDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnUser.Builder = CfnUser.Builder.create(scope, id)

  private val _homeDirectoryMappings: MutableList<Any> = mutableListOf()

  private val _sshPublicKeys: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun homeDirectory(homeDirectory: String) {
    cdkBuilder.homeDirectory(homeDirectory)
  }

  public fun homeDirectoryMappings(vararg homeDirectoryMappings: Any) {
    _homeDirectoryMappings.addAll(listOf(*homeDirectoryMappings))
  }

  public fun homeDirectoryMappings(homeDirectoryMappings: Collection<Any>) {
    _homeDirectoryMappings.addAll(homeDirectoryMappings)
  }

  public fun homeDirectoryMappings(homeDirectoryMappings: IResolvable) {
    cdkBuilder.homeDirectoryMappings(homeDirectoryMappings)
  }

  public fun homeDirectoryType(homeDirectoryType: String) {
    cdkBuilder.homeDirectoryType(homeDirectoryType)
  }

  public fun policy(policy: String) {
    cdkBuilder.policy(policy)
  }

  public fun posixProfile(posixProfile: IResolvable) {
    cdkBuilder.posixProfile(posixProfile)
  }

  public fun posixProfile(posixProfile: CfnUser.PosixProfileProperty) {
    cdkBuilder.posixProfile(posixProfile)
  }

  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun serverId(serverId: String) {
    cdkBuilder.serverId(serverId)
  }

  public fun sshPublicKeys(vararg sshPublicKeys: String) {
    _sshPublicKeys.addAll(listOf(*sshPublicKeys))
  }

  public fun sshPublicKeys(sshPublicKeys: Collection<String>) {
    _sshPublicKeys.addAll(sshPublicKeys)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): CfnUser {
    if(_homeDirectoryMappings.isNotEmpty()) cdkBuilder.homeDirectoryMappings(_homeDirectoryMappings)
    if(_sshPublicKeys.isNotEmpty()) cdkBuilder.sshPublicKeys(_sshPublicKeys)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

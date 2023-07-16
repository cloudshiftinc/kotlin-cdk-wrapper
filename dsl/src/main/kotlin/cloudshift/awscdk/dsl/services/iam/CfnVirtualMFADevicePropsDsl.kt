@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps

@CdkDslMarker
public class CfnVirtualMFADevicePropsDsl {
  private val cdkBuilder: CfnVirtualMFADeviceProps.Builder = CfnVirtualMFADeviceProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _users: MutableList<String> = mutableListOf()

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun users(vararg users: String) {
    _users.addAll(listOf(*users))
  }

  public fun users(users: Collection<String>) {
    _users.addAll(users)
  }

  public fun virtualMfaDeviceName(virtualMfaDeviceName: String) {
    cdkBuilder.virtualMfaDeviceName(virtualMfaDeviceName)
  }

  public fun build(): CfnVirtualMFADeviceProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_users.isNotEmpty()) cdkBuilder.users(_users)
    return cdkBuilder.build()
  }
}

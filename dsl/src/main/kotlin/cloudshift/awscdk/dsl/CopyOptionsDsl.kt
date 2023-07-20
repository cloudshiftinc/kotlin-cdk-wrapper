@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CopyOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode

@CdkDslMarker
public class CopyOptionsDsl {
  private val cdkBuilder: CopyOptions.Builder = CopyOptions.builder()

  private val _exclude: MutableList<String> = mutableListOf()

  public fun exclude(vararg exclude: String) {
    _exclude.addAll(listOf(*exclude))
  }

  public fun exclude(exclude: Collection<String>) {
    _exclude.addAll(exclude)
  }

  public fun follow(follow: SymlinkFollowMode) {
    cdkBuilder.follow(follow)
  }

  public fun ignoreMode(ignoreMode: IgnoreMode) {
    cdkBuilder.ignoreMode(ignoreMode)
  }

  public fun build(): CopyOptions {
    if(_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
    return cdkBuilder.build()
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.FileCopyOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode

@CdkDslMarker
public class FileCopyOptionsDsl {
  private val cdkBuilder: FileCopyOptions.Builder = FileCopyOptions.builder()

  private val _exclude: MutableList<String> = mutableListOf()

  /**
   * @param exclude File paths matching the patterns will be excluded.
   * See `ignoreMode` to set the matching behavior.
   * Has no effect on Assets bundled using the `bundling` property.
   */
  public fun exclude(vararg exclude: String) {
    _exclude.addAll(listOf(*exclude))
  }

  /**
   * @param exclude File paths matching the patterns will be excluded.
   * See `ignoreMode` to set the matching behavior.
   * Has no effect on Assets bundled using the `bundling` property.
   */
  public fun exclude(exclude: Collection<String>) {
    _exclude.addAll(exclude)
  }

  /**
   * @param followSymlinks A strategy for how to handle symlinks.
   */
  public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
    cdkBuilder.followSymlinks(followSymlinks)
  }

  /**
   * @param ignoreMode The ignore behavior to use for `exclude` patterns.
   */
  public fun ignoreMode(ignoreMode: IgnoreMode) {
    cdkBuilder.ignoreMode(ignoreMode)
  }

  public fun build(): FileCopyOptions {
    if(_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
    return cdkBuilder.build()
  }
}

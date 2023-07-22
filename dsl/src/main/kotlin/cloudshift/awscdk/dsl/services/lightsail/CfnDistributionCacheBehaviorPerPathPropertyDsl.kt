@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnDistribution

@CdkDslMarker
public class CfnDistributionCacheBehaviorPerPathPropertyDsl {
  private val cdkBuilder: CfnDistribution.CacheBehaviorPerPathProperty.Builder =
      CfnDistribution.CacheBehaviorPerPathProperty.builder()

  /**
   * @param behavior The cache behavior for the specified path.
   * You can specify one of the following per-path cache behaviors:
   *
   * * *`cache`* - This behavior caches the specified path.
   * * *`dont-cache`* - This behavior doesn't cache the specified path.
   */
  public fun behavior(behavior: String) {
    cdkBuilder.behavior(behavior)
  }

  /**
   * @param path The path to a directory or file to cache, or not cache.
   * Use an asterisk symbol to specify wildcard directories ( `path/to/assets/ *` ), and file types
   * ( `*.html` , `*jpg` , `*js` ). Directories and file paths are case-sensitive.
   *
   * Examples:
   *
   * * Specify the following to cache all files in the document root of an Apache web server running
   * on a instance.
   *
   * `var/www/html/`
   *
   * * Specify the following file to cache only the index page in the document root of an Apache web
   * server.
   *
   * `var/www/html/index.html`
   *
   * * Specify the following to cache only the .html files in the document root of an Apache web
   * server.
   *
   * `var/www/html/ *.html`
   *
   * * Specify the following to cache only the .jpg, .png, and .gif files in the images
   * sub-directory of the document root of an Apache web server.
   *
   * `var/www/html/images/ *.jpg`
   *
   * `var/www/html/images/ *.png`
   *
   * `var/www/html/images/ *.gif`
   *
   * Specify the following to cache all files in the images subdirectory of the document root of an
   * Apache web server.
   *
   * `var/www/html/images/`
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnDistribution.CacheBehaviorPerPathProperty = cdkBuilder.build()
}

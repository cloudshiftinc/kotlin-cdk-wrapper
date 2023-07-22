@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnDistribution

/**
 * `CacheBehaviorPerPath` is a property of the
 * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
 * resource. It describes the per-path cache behavior of an Amazon Lightsail content delivery network
 * (CDN) distribution.
 *
 * Use a per-path cache behavior to override the default cache behavior of a distribution, or to add
 * an exception to it. For example, if you set the `CacheBehavior` to `cache` , you can use a per-path
 * cache behavior to specify a directory, file, or file type that your distribution will cache. If you
 * don’t want your distribution to cache a specified directory, file, or file type, set the per-path
 * cache behavior to `dont-cache` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CacheBehaviorPerPathProperty cacheBehaviorPerPathProperty =
 * CacheBehaviorPerPathProperty.builder()
 * .behavior("behavior")
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehaviorperpath.html)
 */
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

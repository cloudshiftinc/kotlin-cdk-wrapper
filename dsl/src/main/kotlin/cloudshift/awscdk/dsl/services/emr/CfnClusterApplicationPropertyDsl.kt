@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * `Application` is a property of `AWS::EMR::Cluster` .
 *
 * The `Application` property type defines the open-source big data applications for EMR to install
 * and configure when a cluster is created.
 *
 * With Amazon EMR release version 4.0 and later, the only accepted parameter is the application
 * `Name` . To pass arguments to these applications, you use configuration classifications specified
 * using JSON objects in a `Configuration` property. For more information, see [Configuring
 * Applications](https://docs.aws.amazon.com//emr/latest/ReleaseGuide/emr-configure-apps.html) .
 *
 * With earlier Amazon EMR releases, the application is any AWS or third-party software that you can
 * add to the cluster. You can specify the version of the application and arguments to pass to it.
 * Amazon EMR accepts and forwards the argument list to the corresponding installation script as a
 * bootstrap action argument.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * ApplicationProperty applicationProperty = ApplicationProperty.builder()
 * .additionalInfo(Map.of(
 * "additionalInfoKey", "additionalInfo"))
 * .args(List.of("args"))
 * .name("name")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-application.html)
 */
@CdkDslMarker
public class CfnClusterApplicationPropertyDsl {
  private val cdkBuilder: CfnCluster.ApplicationProperty.Builder =
      CfnCluster.ApplicationProperty.builder()

  private val _args: MutableList<String> = mutableListOf()

  /**
   * @param additionalInfo This option is for advanced users only.
   * This is meta information about clusters and applications that are used for testing and
   * troubleshooting.
   */
  public fun additionalInfo(additionalInfo: Map<String, String>) {
    cdkBuilder.additionalInfo(additionalInfo)
  }

  /**
   * @param additionalInfo This option is for advanced users only.
   * This is meta information about clusters and applications that are used for testing and
   * troubleshooting.
   */
  public fun additionalInfo(additionalInfo: IResolvable) {
    cdkBuilder.additionalInfo(additionalInfo)
  }

  /**
   * @param args Arguments for Amazon EMR to pass to the application.
   */
  public fun args(vararg args: String) {
    _args.addAll(listOf(*args))
  }

  /**
   * @param args Arguments for Amazon EMR to pass to the application.
   */
  public fun args(args: Collection<String>) {
    _args.addAll(args)
  }

  /**
   * @param name The name of the application.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param version The version of the application.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnCluster.ApplicationProperty {
    if(_args.isNotEmpty()) cdkBuilder.args(_args)
    return cdkBuilder.build()
  }
}

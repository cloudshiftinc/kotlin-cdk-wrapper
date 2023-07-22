@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.AlbControllerOptions
import software.amazon.awscdk.services.eks.AlbControllerVersion

@CdkDslMarker
public class AlbControllerOptionsDsl {
  private val cdkBuilder: AlbControllerOptions.Builder = AlbControllerOptions.builder()

  /**
   * @param policy The IAM policy to apply to the service account.
   * If you're using one of the built-in versions, this is not required since
   * CDK ships with the appropriate policies for those versions.
   *
   * However, if you are using a custom version, this is required (and validated).
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * @param policy The IAM policy to apply to the service account.
   * If you're using one of the built-in versions, this is not required since
   * CDK ships with the appropriate policies for those versions.
   *
   * However, if you are using a custom version, this is required (and validated).
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  /**
   * @param repository The repository to pull the controller image from.
   * Note that the default repository works for most regions, but not all.
   * If the repository is not applicable to your region, use a custom repository
   * according to the information here:
   * https://github.com/kubernetes-sigs/aws-load-balancer-controller/releases.
   */
  public fun repository(repository: String) {
    cdkBuilder.repository(repository)
  }

  /**
   * @param version Version of the controller. 
   */
  public fun version(version: AlbControllerVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): AlbControllerOptions = cdkBuilder.build()
}

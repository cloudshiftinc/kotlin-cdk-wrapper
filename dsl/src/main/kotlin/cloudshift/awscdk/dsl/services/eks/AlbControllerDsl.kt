@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.AlbController
import software.amazon.awscdk.services.eks.AlbControllerVersion
import software.amazon.awscdk.services.eks.Cluster
import software.constructs.Construct

@CdkDslMarker
public class AlbControllerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: AlbController.Builder = AlbController.Builder.create(scope, id)

  /**
   * [disable-awslint:ref-via-interface] Cluster to install the controller onto.
   *
   * @param cluster [disable-awslint:ref-via-interface] Cluster to install the controller onto. 
   */
  public fun cluster(cluster: Cluster) {
    cdkBuilder.cluster(cluster)
  }

  /**
   * The IAM policy to apply to the service account.
   *
   * If you're using one of the built-in versions, this is not required since
   * CDK ships with the appropriate policies for those versions.
   *
   * However, if you are using a custom version, this is required (and validated).
   *
   * Default: - Corresponds to the predefined version.
   *
   * @param policy The IAM policy to apply to the service account. 
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * The IAM policy to apply to the service account.
   *
   * If you're using one of the built-in versions, this is not required since
   * CDK ships with the appropriate policies for those versions.
   *
   * However, if you are using a custom version, this is required (and validated).
   *
   * Default: - Corresponds to the predefined version.
   *
   * @param policy The IAM policy to apply to the service account. 
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  /**
   * The repository to pull the controller image from.
   *
   * Note that the default repository works for most regions, but not all.
   * If the repository is not applicable to your region, use a custom repository
   * according to the information here:
   * https://github.com/kubernetes-sigs/aws-load-balancer-controller/releases.
   *
   * Default: '602401143452.dkr.ecr.us-west-2.amazonaws.com/amazon/aws-load-balancer-controller'
   *
   * @param repository The repository to pull the controller image from. 
   */
  public fun repository(repository: String) {
    cdkBuilder.repository(repository)
  }

  /**
   * Version of the controller.
   *
   * @param version Version of the controller. 
   */
  public fun version(version: AlbControllerVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): AlbController = cdkBuilder.build()
}

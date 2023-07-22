@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.AwsAuth
import software.amazon.awscdk.services.eks.Cluster
import software.constructs.Construct

@CdkDslMarker
public class AwsAuthDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: AwsAuth.Builder = AwsAuth.Builder.create(scope, id)

  /**
   * The EKS cluster to apply this configuration to.
   *
   * [disable-awslint:ref-via-interface]
   *
   * @param cluster The EKS cluster to apply this configuration to. 
   */
  public fun cluster(cluster: Cluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun build(): AwsAuth = cdkBuilder.build()
}

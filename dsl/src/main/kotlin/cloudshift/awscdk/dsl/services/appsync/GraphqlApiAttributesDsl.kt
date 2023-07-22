@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.GraphqlApiAttributes

@CdkDslMarker
public class GraphqlApiAttributesDsl {
  private val cdkBuilder: GraphqlApiAttributes.Builder = GraphqlApiAttributes.builder()

  /**
   * @param graphqlApiArn the arn for the GraphQL Api.
   */
  public fun graphqlApiArn(graphqlApiArn: String) {
    cdkBuilder.graphqlApiArn(graphqlApiArn)
  }

  /**
   * @param graphqlApiId an unique AWS AppSync GraphQL API identifier i.e.
   * 'lxz775lwdrgcndgz3nurvac7oa'. 
   */
  public fun graphqlApiId(graphqlApiId: String) {
    cdkBuilder.graphqlApiId(graphqlApiId)
  }

  public fun build(): GraphqlApiAttributes = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleOpenSearchActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.OpenSearchActionProperty.Builder =
      CfnTopicRule.OpenSearchActionProperty.builder()

  /**
   * @param endpoint The endpoint of your OpenSearch domain. 
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param id The unique identifier for the document you are storing. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param index The OpenSearch index where you want to store your data. 
   */
  public fun index(index: String) {
    cdkBuilder.index(index)
  }

  /**
   * @param roleArn The IAM role ARN that has access to OpenSearch. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param type The type of document you are storing. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTopicRule.OpenSearchActionProperty = cdkBuilder.build()
}

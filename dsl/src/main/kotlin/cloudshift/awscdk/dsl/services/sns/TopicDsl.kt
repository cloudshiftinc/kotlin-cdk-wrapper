@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.sns.Topic
import software.constructs.Construct

@CdkDslMarker
public class TopicDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Topic.Builder = Topic.Builder.create(scope, id)

  /**
   * Enables content-based deduplication for FIFO topics.
   *
   * Default: None
   *
   * @param contentBasedDeduplication Enables content-based deduplication for FIFO topics. 
   */
  public fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
    cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
  }

  /**
   * A developer-defined string that can be used to identify this SNS topic.
   *
   * Default: None
   *
   * @param displayName A developer-defined string that can be used to identify this SNS topic. 
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * Set to true to create a FIFO topic.
   *
   * Default: None
   *
   * @param fifo Set to true to create a FIFO topic. 
   */
  public fun fifo(fifo: Boolean) {
    cdkBuilder.fifo(fifo)
  }

  /**
   * A KMS Key, either managed by this CDK app, or imported.
   *
   * Default: None
   *
   * @param masterKey A KMS Key, either managed by this CDK app, or imported. 
   */
  public fun masterKey(masterKey: IKey) {
    cdkBuilder.masterKey(masterKey)
  }

  /**
   * A name for the topic.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique
   * physical ID and uses that ID for the topic name. For more information,
   * see Name Type.
   *
   * Default: Generated name
   *
   * @param topicName A name for the topic. 
   */
  public fun topicName(topicName: String) {
    cdkBuilder.topicName(topicName)
  }

  public fun build(): Topic = cdkBuilder.build()
}

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

  public fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
    cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
  }

  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  public fun fifo(fifo: Boolean) {
    cdkBuilder.fifo(fifo)
  }

  public fun masterKey(masterKey: IKey) {
    cdkBuilder.masterKey(masterKey)
  }

  public fun topicName(topicName: String) {
    cdkBuilder.topicName(topicName)
  }

  public fun build(): Topic = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.sns.TopicProps

@CdkDslMarker
public class TopicPropsDsl {
  private val cdkBuilder: TopicProps.Builder = TopicProps.builder()

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

  public fun build(): TopicProps = cdkBuilder.build()
}

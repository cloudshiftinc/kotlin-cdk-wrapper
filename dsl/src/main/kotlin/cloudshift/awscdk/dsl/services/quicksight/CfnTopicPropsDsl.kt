@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopicProps

@CdkDslMarker
public class CfnTopicPropsDsl {
  private val cdkBuilder: CfnTopicProps.Builder = CfnTopicProps.builder()

  private val _dataSets: MutableList<Any> = mutableListOf()

  /**
   * @param awsAccountId The ID of the AWS account that you want to create a topic in.
   */
  public fun awsAccountId(awsAccountId: String) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  /**
   * @param dataSets The data sets that the topic is associated with.
   */
  public fun dataSets(vararg dataSets: Any) {
    _dataSets.addAll(listOf(*dataSets))
  }

  /**
   * @param dataSets The data sets that the topic is associated with.
   */
  public fun dataSets(dataSets: Collection<Any>) {
    _dataSets.addAll(dataSets)
  }

  /**
   * @param dataSets The data sets that the topic is associated with.
   */
  public fun dataSets(dataSets: IResolvable) {
    cdkBuilder.dataSets(dataSets)
  }

  /**
   * @param description The description of the topic.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the topic.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param topicId The ID for the topic.
   * This ID is unique per AWS Region for each AWS account.
   */
  public fun topicId(topicId: String) {
    cdkBuilder.topicId(topicId)
  }

  public fun build(): CfnTopicProps {
    if(_dataSets.isNotEmpty()) cdkBuilder.dataSets(_dataSets)
    return cdkBuilder.build()
  }
}

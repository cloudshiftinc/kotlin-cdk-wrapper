@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic
import software.constructs.Construct

@CdkDslMarker
public class CfnTopicDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTopic.Builder = CfnTopic.Builder.create(scope, id)

  private val _dataSets: MutableList<Any> = mutableListOf()

  /**
   * The ID of the AWS account that you want to create a topic in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-awsaccountid)
   * @param awsAccountId The ID of the AWS account that you want to create a topic in. 
   */
  public fun awsAccountId(awsAccountId: String) {
    cdkBuilder.awsAccountId(awsAccountId)
  }

  /**
   * The data sets that the topic is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-datasets)
   * @param dataSets The data sets that the topic is associated with. 
   */
  public fun dataSets(vararg dataSets: Any) {
    _dataSets.addAll(listOf(*dataSets))
  }

  /**
   * The data sets that the topic is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-datasets)
   * @param dataSets The data sets that the topic is associated with. 
   */
  public fun dataSets(dataSets: Collection<Any>) {
    _dataSets.addAll(dataSets)
  }

  /**
   * The data sets that the topic is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-datasets)
   * @param dataSets The data sets that the topic is associated with. 
   */
  public fun dataSets(dataSets: IResolvable) {
    cdkBuilder.dataSets(dataSets)
  }

  /**
   * The description of the topic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-description)
   * @param description The description of the topic. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the topic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-name)
   * @param name The name of the topic. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The ID for the topic.
   *
   * This ID is unique per AWS Region for each AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-topicid)
   * @param topicId The ID for the topic. 
   */
  public fun topicId(topicId: String) {
    cdkBuilder.topicId(topicId)
  }

  public fun build(): CfnTopic {
    if(_dataSets.isNotEmpty()) cdkBuilder.dataSets(_dataSets)
    return cdkBuilder.build()
  }
}

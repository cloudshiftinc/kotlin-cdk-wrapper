package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTopicProps {
  /**
   * The ID of the AWS account that you want to create a topic in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-awsaccountid)
   */
  public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * The data sets that the topic is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-datasets)
   */
  public fun dataSets(): Any? = unwrap(this).getDataSets()

  /**
   * The description of the topic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the topic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The ID for the topic.
   *
   * This ID is unique per AWS Region for each AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-topicid)
   */
  public fun topicId(): String? = unwrap(this).getTopicId()

  /**
   * The user experience version of a topic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-userexperienceversion)
   */
  public fun userExperienceVersion(): String? = unwrap(this).getUserExperienceVersion()

  /**
   * A builder for [CfnTopicProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsAccountId The ID of the AWS account that you want to create a topic in.
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * @param dataSets The data sets that the topic is associated with.
     */
    public fun dataSets(dataSets: IResolvable)

    /**
     * @param dataSets The data sets that the topic is associated with.
     */
    public fun dataSets(dataSets: List<Any>)

    /**
     * @param dataSets The data sets that the topic is associated with.
     */
    public fun dataSets(vararg dataSets: Any)

    /**
     * @param description The description of the topic.
     */
    public fun description(description: String)

    /**
     * @param name The name of the topic.
     */
    public fun name(name: String)

    /**
     * @param topicId The ID for the topic.
     * This ID is unique per AWS Region for each AWS account.
     */
    public fun topicId(topicId: String)

    /**
     * @param userExperienceVersion The user experience version of a topic.
     */
    public fun userExperienceVersion(userExperienceVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnTopicProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnTopicProps.builder()

    /**
     * @param awsAccountId The ID of the AWS account that you want to create a topic in.
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * @param dataSets The data sets that the topic is associated with.
     */
    override fun dataSets(dataSets: IResolvable) {
      cdkBuilder.dataSets(dataSets.let(IResolvable::unwrap))
    }

    /**
     * @param dataSets The data sets that the topic is associated with.
     */
    override fun dataSets(dataSets: List<Any>) {
      cdkBuilder.dataSets(dataSets)
    }

    /**
     * @param dataSets The data sets that the topic is associated with.
     */
    override fun dataSets(vararg dataSets: Any): Unit = dataSets(dataSets.toList())

    /**
     * @param description The description of the topic.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the topic.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param topicId The ID for the topic.
     * This ID is unique per AWS Region for each AWS account.
     */
    override fun topicId(topicId: String) {
      cdkBuilder.topicId(topicId)
    }

    /**
     * @param userExperienceVersion The user experience version of a topic.
     */
    override fun userExperienceVersion(userExperienceVersion: String) {
      cdkBuilder.userExperienceVersion(userExperienceVersion)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnTopicProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnTopicProps,
  ) : CdkObject(cdkObject), CfnTopicProps {
    /**
     * The ID of the AWS account that you want to create a topic in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-awsaccountid)
     */
    override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    /**
     * The data sets that the topic is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-datasets)
     */
    override fun dataSets(): Any? = unwrap(this).getDataSets()

    /**
     * The description of the topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The ID for the topic.
     *
     * This ID is unique per AWS Region for each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-topicid)
     */
    override fun topicId(): String? = unwrap(this).getTopicId()

    /**
     * The user experience version of a topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-userexperienceversion)
     */
    override fun userExperienceVersion(): String? = unwrap(this).getUserExperienceVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopicProps):
        CfnTopicProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicProps):
        software.amazon.awscdk.services.quicksight.CfnTopicProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.quicksight.CfnTopicProps
  }
}

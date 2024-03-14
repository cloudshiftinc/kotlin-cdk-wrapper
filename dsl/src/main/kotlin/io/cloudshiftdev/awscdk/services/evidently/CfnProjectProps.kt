package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnProjectProps {
  /**
   * Use this parameter if the project will use *client-side evaluation powered by AWS AppConfig* .
   *
   * Client-side evaluation allows your application to assign variations to user sessions locally
   * instead of by calling the
   * [EvaluateFeature](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html)
   * operation. This mitigates the latency and availability risks that come with an API call. For more
   * information, see [Use client-side evaluation - powered by AWS AppConfig
   * .](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-client-side-evaluation.html)
   *
   * This parameter is a structure that contains information about the AWS AppConfig application
   * that will be used as for client-side evaluation.
   *
   * To create a project that uses client-side evaluation, you must have the
   * `evidently:ExportProjectAsConfiguration` permission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-appconfigresource)
   */
  public fun appConfigResource(): Any? = unwrap(this).getAppConfigResource()

  /**
   * A structure that contains information about where Evidently is to store evaluation events for
   * longer term storage, if you choose to do so.
   *
   * If you choose not to store these events, Evidently deletes them after using them to produce
   * metrics and other experiment results that you can view.
   *
   * You can't specify both `CloudWatchLogs` and `S3Destination` in the same operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-datadelivery)
   */
  public fun dataDelivery(): Any? = unwrap(this).getDataDelivery()

  /**
   * An optional description of the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name for the project.
   *
   * It can include up to 127 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-name)
   */
  public fun name(): String

  /**
   * Assigns one or more tags (key-value pairs) to the project.
   *
   * Tags can help you organize and categorize your resources. You can also use them to scope user
   * permissions by granting a user permission to access or change only resources with certain tag
   * values.
   *
   * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
   * characters.
   *
   * You can associate as many as 50 tags with a project.
   *
   * For more information, see [Tagging AWS
   * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* .
     * Client-side evaluation allows your application to assign variations to user sessions locally
     * instead of by calling the
     * [EvaluateFeature](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html)
     * operation. This mitigates the latency and availability risks that come with an API call. For
     * more information, see [Use client-side evaluation - powered by AWS AppConfig
     * .](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-client-side-evaluation.html)
     *
     * This parameter is a structure that contains information about the AWS AppConfig application
     * that will be used as for client-side evaluation.
     *
     * To create a project that uses client-side evaluation, you must have the
     * `evidently:ExportProjectAsConfiguration` permission.
     */
    public fun appConfigResource(appConfigResource: IResolvable)

    /**
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* .
     * Client-side evaluation allows your application to assign variations to user sessions locally
     * instead of by calling the
     * [EvaluateFeature](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html)
     * operation. This mitigates the latency and availability risks that come with an API call. For
     * more information, see [Use client-side evaluation - powered by AWS AppConfig
     * .](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-client-side-evaluation.html)
     *
     * This parameter is a structure that contains information about the AWS AppConfig application
     * that will be used as for client-side evaluation.
     *
     * To create a project that uses client-side evaluation, you must have the
     * `evidently:ExportProjectAsConfiguration` permission.
     */
    public fun appConfigResource(appConfigResource: CfnProject.AppConfigResourceObjectProperty)

    /**
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* .
     * Client-side evaluation allows your application to assign variations to user sessions locally
     * instead of by calling the
     * [EvaluateFeature](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html)
     * operation. This mitigates the latency and availability risks that come with an API call. For
     * more information, see [Use client-side evaluation - powered by AWS AppConfig
     * .](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-client-side-evaluation.html)
     *
     * This parameter is a structure that contains information about the AWS AppConfig application
     * that will be used as for client-side evaluation.
     *
     * To create a project that uses client-side evaluation, you must have the
     * `evidently:ExportProjectAsConfiguration` permission.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cfa9b878a7eea503632ef02e8b1103004e7a75d461872fb10b042611630a1a7")
    public
        fun appConfigResource(appConfigResource: CfnProject.AppConfigResourceObjectProperty.Builder.() -> Unit)

    /**
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so.
     * If you choose not to store these events, Evidently deletes them after using them to produce
     * metrics and other experiment results that you can view.
     *
     * You can't specify both `CloudWatchLogs` and `S3Destination` in the same operation.
     */
    public fun dataDelivery(dataDelivery: IResolvable)

    /**
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so.
     * If you choose not to store these events, Evidently deletes them after using them to produce
     * metrics and other experiment results that you can view.
     *
     * You can't specify both `CloudWatchLogs` and `S3Destination` in the same operation.
     */
    public fun dataDelivery(dataDelivery: CfnProject.DataDeliveryObjectProperty)

    /**
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so.
     * If you choose not to store these events, Evidently deletes them after using them to produce
     * metrics and other experiment results that you can view.
     *
     * You can't specify both `CloudWatchLogs` and `S3Destination` in the same operation.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("832cfa508b5226c3f1ddb84e2425e9ea6fbf85d942f716e2647898566466bc0d")
    public fun dataDelivery(dataDelivery: CfnProject.DataDeliveryObjectProperty.Builder.() -> Unit)

    /**
     * @param description An optional description of the project.
     */
    public fun description(description: String)

    /**
     * @param name The name for the project. 
     * It can include up to 127 characters.
     */
    public fun name(name: String)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the project.
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a project.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the project.
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a project.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnProjectProps.Builder =
        software.amazon.awscdk.services.evidently.CfnProjectProps.builder()

    /**
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* .
     * Client-side evaluation allows your application to assign variations to user sessions locally
     * instead of by calling the
     * [EvaluateFeature](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html)
     * operation. This mitigates the latency and availability risks that come with an API call. For
     * more information, see [Use client-side evaluation - powered by AWS AppConfig
     * .](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-client-side-evaluation.html)
     *
     * This parameter is a structure that contains information about the AWS AppConfig application
     * that will be used as for client-side evaluation.
     *
     * To create a project that uses client-side evaluation, you must have the
     * `evidently:ExportProjectAsConfiguration` permission.
     */
    override fun appConfigResource(appConfigResource: IResolvable) {
      cdkBuilder.appConfigResource(appConfigResource.let(IResolvable::unwrap))
    }

    /**
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* .
     * Client-side evaluation allows your application to assign variations to user sessions locally
     * instead of by calling the
     * [EvaluateFeature](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html)
     * operation. This mitigates the latency and availability risks that come with an API call. For
     * more information, see [Use client-side evaluation - powered by AWS AppConfig
     * .](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-client-side-evaluation.html)
     *
     * This parameter is a structure that contains information about the AWS AppConfig application
     * that will be used as for client-side evaluation.
     *
     * To create a project that uses client-side evaluation, you must have the
     * `evidently:ExportProjectAsConfiguration` permission.
     */
    override fun appConfigResource(appConfigResource: CfnProject.AppConfigResourceObjectProperty) {
      cdkBuilder.appConfigResource(appConfigResource.let(CfnProject.AppConfigResourceObjectProperty::unwrap))
    }

    /**
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* .
     * Client-side evaluation allows your application to assign variations to user sessions locally
     * instead of by calling the
     * [EvaluateFeature](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html)
     * operation. This mitigates the latency and availability risks that come with an API call. For
     * more information, see [Use client-side evaluation - powered by AWS AppConfig
     * .](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-client-side-evaluation.html)
     *
     * This parameter is a structure that contains information about the AWS AppConfig application
     * that will be used as for client-side evaluation.
     *
     * To create a project that uses client-side evaluation, you must have the
     * `evidently:ExportProjectAsConfiguration` permission.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cfa9b878a7eea503632ef02e8b1103004e7a75d461872fb10b042611630a1a7")
    override
        fun appConfigResource(appConfigResource: CfnProject.AppConfigResourceObjectProperty.Builder.() -> Unit):
        Unit = appConfigResource(CfnProject.AppConfigResourceObjectProperty(appConfigResource))

    /**
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so.
     * If you choose not to store these events, Evidently deletes them after using them to produce
     * metrics and other experiment results that you can view.
     *
     * You can't specify both `CloudWatchLogs` and `S3Destination` in the same operation.
     */
    override fun dataDelivery(dataDelivery: IResolvable) {
      cdkBuilder.dataDelivery(dataDelivery.let(IResolvable::unwrap))
    }

    /**
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so.
     * If you choose not to store these events, Evidently deletes them after using them to produce
     * metrics and other experiment results that you can view.
     *
     * You can't specify both `CloudWatchLogs` and `S3Destination` in the same operation.
     */
    override fun dataDelivery(dataDelivery: CfnProject.DataDeliveryObjectProperty) {
      cdkBuilder.dataDelivery(dataDelivery.let(CfnProject.DataDeliveryObjectProperty::unwrap))
    }

    /**
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so.
     * If you choose not to store these events, Evidently deletes them after using them to produce
     * metrics and other experiment results that you can view.
     *
     * You can't specify both `CloudWatchLogs` and `S3Destination` in the same operation.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("832cfa508b5226c3f1ddb84e2425e9ea6fbf85d942f716e2647898566466bc0d")
    override
        fun dataDelivery(dataDelivery: CfnProject.DataDeliveryObjectProperty.Builder.() -> Unit):
        Unit = dataDelivery(CfnProject.DataDeliveryObjectProperty(dataDelivery))

    /**
     * @param description An optional description of the project.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name for the project. 
     * It can include up to 127 characters.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the project.
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a project.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the project.
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a project.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.evidently.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    /**
     * Use this parameter if the project will use *client-side evaluation powered by AWS AppConfig*
     * .
     *
     * Client-side evaluation allows your application to assign variations to user sessions locally
     * instead of by calling the
     * [EvaluateFeature](https://docs.aws.amazon.com/cloudwatchevidently/latest/APIReference/API_EvaluateFeature.html)
     * operation. This mitigates the latency and availability risks that come with an API call. For
     * more information, see [Use client-side evaluation - powered by AWS AppConfig
     * .](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-client-side-evaluation.html)
     *
     * This parameter is a structure that contains information about the AWS AppConfig application
     * that will be used as for client-side evaluation.
     *
     * To create a project that uses client-side evaluation, you must have the
     * `evidently:ExportProjectAsConfiguration` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-appconfigresource)
     */
    override fun appConfigResource(): Any? = unwrap(this).getAppConfigResource()

    /**
     * A structure that contains information about where Evidently is to store evaluation events for
     * longer term storage, if you choose to do so.
     *
     * If you choose not to store these events, Evidently deletes them after using them to produce
     * metrics and other experiment results that you can view.
     *
     * You can't specify both `CloudWatchLogs` and `S3Destination` in the same operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-datadelivery)
     */
    override fun dataDelivery(): Any? = unwrap(this).getDataDelivery()

    /**
     * An optional description of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name for the project.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Assigns one or more tags (key-value pairs) to the project.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with a project.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnProjectProps):
        CfnProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.evidently.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.evidently.CfnProjectProps
  }
}

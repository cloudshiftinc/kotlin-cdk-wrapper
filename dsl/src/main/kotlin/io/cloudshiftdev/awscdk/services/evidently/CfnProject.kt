package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProject internal constructor(
  private val cdkObject: software.amazon.awscdk.services.evidently.CfnProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Use this parameter if the project will use *client-side evaluation powered by AWS AppConfig* .
   */
  public open fun appConfigResource(): Any? = unwrap(this).getAppConfigResource()

  /**
   * Use this parameter if the project will use *client-side evaluation powered by AWS AppConfig* .
   */
  public open fun appConfigResource(`value`: IResolvable) {
    unwrap(this).setAppConfigResource(`value`.let(IResolvable::unwrap))
  }

  /**
   * Use this parameter if the project will use *client-side evaluation powered by AWS AppConfig* .
   */
  public open fun appConfigResource(`value`: AppConfigResourceObjectProperty) {
    unwrap(this).setAppConfigResource(`value`.let(AppConfigResourceObjectProperty::unwrap))
  }

  /**
   * Use this parameter if the project will use *client-side evaluation powered by AWS AppConfig* .
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("939aff7cb926d7a8e3b70eda82d680762c744a238e28b2e97a85325d5afc36f7")
  public open fun appConfigResource(`value`: AppConfigResourceObjectProperty.Builder.() -> Unit):
      Unit = appConfigResource(AppConfigResourceObjectProperty(`value`))

  /**
   * The ARN of the project.
   *
   * For example, `arn:aws:evidently:us-west-2:0123455678912:project/myProject`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A structure that contains information about where Evidently is to store evaluation events for
   * longer term storage, if you choose to do so.
   */
  public open fun dataDelivery(): Any? = unwrap(this).getDataDelivery()

  /**
   * A structure that contains information about where Evidently is to store evaluation events for
   * longer term storage, if you choose to do so.
   */
  public open fun dataDelivery(`value`: IResolvable) {
    unwrap(this).setDataDelivery(`value`.let(IResolvable::unwrap))
  }

  /**
   * A structure that contains information about where Evidently is to store evaluation events for
   * longer term storage, if you choose to do so.
   */
  public open fun dataDelivery(`value`: DataDeliveryObjectProperty) {
    unwrap(this).setDataDelivery(`value`.let(DataDeliveryObjectProperty::unwrap))
  }

  /**
   * A structure that contains information about where Evidently is to store evaluation events for
   * longer term storage, if you choose to do so.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e05b7b462e1fe8799fe661239a36561bf2b3d0d6e6348b15acf7b43414e332f")
  public open fun dataDelivery(`value`: DataDeliveryObjectProperty.Builder.() -> Unit): Unit =
      dataDelivery(DataDeliveryObjectProperty(`value`))

  /**
   * An optional description of the project.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description of the project.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name for the project.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name for the project.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Assigns one or more tags (key-value pairs) to the project.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Assigns one or more tags (key-value pairs) to the project.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Assigns one or more tags (key-value pairs) to the project.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.evidently.CfnProject].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* . 
     */
    public fun appConfigResource(appConfigResource: IResolvable)

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
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* . 
     */
    public fun appConfigResource(appConfigResource: AppConfigResourceObjectProperty)

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
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c58780625dbccb6ada80e2fdecd5fa7458ecfa7e3b72b67e9e56897231e88c8")
    public
        fun appConfigResource(appConfigResource: AppConfigResourceObjectProperty.Builder.() -> Unit)

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
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so. 
     */
    public fun dataDelivery(dataDelivery: IResolvable)

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
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so. 
     */
    public fun dataDelivery(dataDelivery: DataDeliveryObjectProperty)

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
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb85785ee2aedddaff00d956283467969b245ea062d5a0993529891592acec7a")
    public fun dataDelivery(dataDelivery: DataDeliveryObjectProperty.Builder.() -> Unit)

    /**
     * An optional description of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-description)
     * @param description An optional description of the project. 
     */
    public fun description(description: String)

    /**
     * The name for the project.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-name)
     * @param name The name for the project. 
     */
    public fun name(name: String)

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
     * @param tags Assigns one or more tags (key-value pairs) to the project. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags Assigns one or more tags (key-value pairs) to the project. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnProject.Builder =
        software.amazon.awscdk.services.evidently.CfnProject.Builder.create(scope, id)

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
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* . 
     */
    override fun appConfigResource(appConfigResource: IResolvable) {
      cdkBuilder.appConfigResource(appConfigResource.let(IResolvable::unwrap))
    }

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
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* . 
     */
    override fun appConfigResource(appConfigResource: AppConfigResourceObjectProperty) {
      cdkBuilder.appConfigResource(appConfigResource.let(AppConfigResourceObjectProperty::unwrap))
    }

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
     * @param appConfigResource Use this parameter if the project will use *client-side evaluation
     * powered by AWS AppConfig* . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c58780625dbccb6ada80e2fdecd5fa7458ecfa7e3b72b67e9e56897231e88c8")
    override
        fun appConfigResource(appConfigResource: AppConfigResourceObjectProperty.Builder.() -> Unit):
        Unit = appConfigResource(AppConfigResourceObjectProperty(appConfigResource))

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
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so. 
     */
    override fun dataDelivery(dataDelivery: IResolvable) {
      cdkBuilder.dataDelivery(dataDelivery.let(IResolvable::unwrap))
    }

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
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so. 
     */
    override fun dataDelivery(dataDelivery: DataDeliveryObjectProperty) {
      cdkBuilder.dataDelivery(dataDelivery.let(DataDeliveryObjectProperty::unwrap))
    }

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
     * @param dataDelivery A structure that contains information about where Evidently is to store
     * evaluation events for longer term storage, if you choose to do so. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb85785ee2aedddaff00d956283467969b245ea062d5a0993529891592acec7a")
    override fun dataDelivery(dataDelivery: DataDeliveryObjectProperty.Builder.() -> Unit): Unit =
        dataDelivery(DataDeliveryObjectProperty(dataDelivery))

    /**
     * An optional description of the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-description)
     * @param description An optional description of the project. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name for the project.
     *
     * It can include up to 127 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-evidently-project.html#cfn-evidently-project-name)
     * @param name The name for the project. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param tags Assigns one or more tags (key-value pairs) to the project. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags Assigns one or more tags (key-value pairs) to the project. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnProject = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.evidently.CfnProject =
        wrapped.cdkObject
  }

  public interface AppConfigResourceObjectProperty {
    /**
     * The ID of the AWS AppConfig application to use for client-side evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-appconfigresourceobject.html#cfn-evidently-project-appconfigresourceobject-applicationid)
     */
    public fun applicationId(): String

    /**
     * The ID of the AWS AppConfig environment to use for client-side evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-appconfigresourceobject.html#cfn-evidently-project-appconfigresourceobject-environmentid)
     */
    public fun environmentId(): String

    /**
     * A builder for [AppConfigResourceObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationId The ID of the AWS AppConfig application to use for client-side
       * evaluation. 
       */
      public fun applicationId(applicationId: String)

      /**
       * @param environmentId The ID of the AWS AppConfig environment to use for client-side
       * evaluation. 
       */
      public fun environmentId(environmentId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty.builder()

      /**
       * @param applicationId The ID of the AWS AppConfig application to use for client-side
       * evaluation. 
       */
      override fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
      }

      /**
       * @param environmentId The ID of the AWS AppConfig environment to use for client-side
       * evaluation. 
       */
      override fun environmentId(environmentId: String) {
        cdkBuilder.environmentId(environmentId)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty,
    ) : AppConfigResourceObjectProperty {
      /**
       * The ID of the AWS AppConfig application to use for client-side evaluation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-appconfigresourceobject.html#cfn-evidently-project-appconfigresourceobject-applicationid)
       */
      override fun applicationId(): String = unwrap(this).getApplicationId()

      /**
       * The ID of the AWS AppConfig environment to use for client-side evaluation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-appconfigresourceobject.html#cfn-evidently-project-appconfigresourceobject-environmentid)
       */
      override fun environmentId(): String = unwrap(this).getEnvironmentId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AppConfigResourceObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty):
          AppConfigResourceObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppConfigResourceObjectProperty):
          software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataDeliveryObjectProperty {
    /**
     * If the project stores evaluation events in CloudWatch Logs , this structure stores the log
     * group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-datadeliveryobject.html#cfn-evidently-project-datadeliveryobject-loggroup)
     */
    public fun logGroup(): String? = unwrap(this).getLogGroup()

    /**
     * If the project stores evaluation events in an Amazon S3 bucket, this structure stores the
     * bucket name and bucket prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-datadeliveryobject.html#cfn-evidently-project-datadeliveryobject-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [DataDeliveryObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroup If the project stores evaluation events in CloudWatch Logs , this structure
       * stores the log group name.
       */
      public fun logGroup(logGroup: String)

      /**
       * @param s3 If the project stores evaluation events in an Amazon S3 bucket, this structure
       * stores the bucket name and bucket prefix.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 If the project stores evaluation events in an Amazon S3 bucket, this structure
       * stores the bucket name and bucket prefix.
       */
      public fun s3(s3: S3DestinationProperty)

      /**
       * @param s3 If the project stores evaluation events in an Amazon S3 bucket, this structure
       * stores the bucket name and bucket prefix.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16c6cc3d94b00ed1f82f8c65caa3cf1eaafd4892d08efd06b911c8f71164cda9")
      public fun s3(s3: S3DestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty.builder()

      /**
       * @param logGroup If the project stores evaluation events in CloudWatch Logs , this structure
       * stores the log group name.
       */
      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      /**
       * @param s3 If the project stores evaluation events in an Amazon S3 bucket, this structure
       * stores the bucket name and bucket prefix.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      /**
       * @param s3 If the project stores evaluation events in an Amazon S3 bucket, this structure
       * stores the bucket name and bucket prefix.
       */
      override fun s3(s3: S3DestinationProperty) {
        cdkBuilder.s3(s3.let(S3DestinationProperty::unwrap))
      }

      /**
       * @param s3 If the project stores evaluation events in an Amazon S3 bucket, this structure
       * stores the bucket name and bucket prefix.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16c6cc3d94b00ed1f82f8c65caa3cf1eaafd4892d08efd06b911c8f71164cda9")
      override fun s3(s3: S3DestinationProperty.Builder.() -> Unit): Unit =
          s3(S3DestinationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty,
    ) : DataDeliveryObjectProperty {
      /**
       * If the project stores evaluation events in CloudWatch Logs , this structure stores the log
       * group name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-datadeliveryobject.html#cfn-evidently-project-datadeliveryobject-loggroup)
       */
      override fun logGroup(): String? = unwrap(this).getLogGroup()

      /**
       * If the project stores evaluation events in an Amazon S3 bucket, this structure stores the
       * bucket name and bucket prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-datadeliveryobject.html#cfn-evidently-project-datadeliveryobject-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataDeliveryObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty):
          DataDeliveryObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataDeliveryObjectProperty):
          software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface S3DestinationProperty {
    /**
     * The name of the bucket in which Evidently stores evaluation events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-s3destination.html#cfn-evidently-project-s3destination-bucketname)
     */
    public fun bucketName(): String

    /**
     * The bucket prefix in which Evidently stores evaluation events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-s3destination.html#cfn-evidently-project-s3destination-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [S3DestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The name of the bucket in which Evidently stores evaluation events. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param prefix The bucket prefix in which Evidently stores evaluation events.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty.builder()

      /**
       * @param bucketName The name of the bucket in which Evidently stores evaluation events. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param prefix The bucket prefix in which Evidently stores evaluation events.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty,
    ) : S3DestinationProperty {
      /**
       * The name of the bucket in which Evidently stores evaluation events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-s3destination.html#cfn-evidently-project-s3destination-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The bucket prefix in which Evidently stores evaluation events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-s3destination.html#cfn-evidently-project-s3destination-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty):
          S3DestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationProperty):
          software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}

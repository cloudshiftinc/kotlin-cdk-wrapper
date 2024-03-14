package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The application ID.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The application ID.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The environment ID.
   */
  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description of the environment.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the environment.
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
   * Amazon CloudWatch alarms to monitor during the deployment process.
   */
  public open fun monitors(): Any? = unwrap(this).getMonitors()

  /**
   * Amazon CloudWatch alarms to monitor during the deployment process.
   */
  public open fun monitors(`value`: IResolvable) {
    unwrap(this).setMonitors(`value`.let(IResolvable::unwrap))
  }

  /**
   * Amazon CloudWatch alarms to monitor during the deployment process.
   */
  public open fun monitors(__idx_ac66f0: List<Any>) {
    unwrap(this).setMonitors(__idx_ac66f0)
  }

  /**
   * Amazon CloudWatch alarms to monitor during the deployment process.
   */
  public open fun monitors(vararg __idx_ac66f0: Any): Unit = monitors(__idx_ac66f0.toList())

  /**
   * A name for the environment.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the environment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Metadata to assign to the environment.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata to assign to the environment.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata to assign to the environment.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.CfnEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-applicationid)
     * @param applicationId The application ID. 
     */
    public fun applicationId(applicationId: String)

    /**
     * A description of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-description)
     * @param description A description of the environment. 
     */
    public fun description(description: String)

    /**
     * Amazon CloudWatch alarms to monitor during the deployment process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-monitors)
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process. 
     */
    public fun monitors(monitors: IResolvable)

    /**
     * Amazon CloudWatch alarms to monitor during the deployment process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-monitors)
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process. 
     */
    public fun monitors(monitors: List<Any>)

    /**
     * Amazon CloudWatch alarms to monitor during the deployment process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-monitors)
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process. 
     */
    public fun monitors(vararg monitors: Any)

    /**
     * A name for the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-name)
     * @param name A name for the environment. 
     */
    public fun name(name: String)

    /**
     * Metadata to assign to the environment.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-tags)
     * @param tags Metadata to assign to the environment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata to assign to the environment.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-tags)
     * @param tags Metadata to assign to the environment. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnEnvironment.Builder =
        software.amazon.awscdk.services.appconfig.CfnEnvironment.Builder.create(scope, id)

    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-applicationid)
     * @param applicationId The application ID. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * A description of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-description)
     * @param description A description of the environment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Amazon CloudWatch alarms to monitor during the deployment process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-monitors)
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process. 
     */
    override fun monitors(monitors: IResolvable) {
      cdkBuilder.monitors(monitors.let(IResolvable::unwrap))
    }

    /**
     * Amazon CloudWatch alarms to monitor during the deployment process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-monitors)
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process. 
     */
    override fun monitors(monitors: List<Any>) {
      cdkBuilder.monitors(monitors)
    }

    /**
     * Amazon CloudWatch alarms to monitor during the deployment process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-monitors)
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process. 
     */
    override fun monitors(vararg monitors: Any): Unit = monitors(monitors.toList())

    /**
     * A name for the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-name)
     * @param name A name for the environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Metadata to assign to the environment.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-tags)
     * @param tags Metadata to assign to the environment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata to assign to the environment.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-tags)
     * @param tags Metadata to assign to the environment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appconfig.CfnEnvironment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.appconfig.CfnEnvironment = wrapped.cdkObject
  }

  public interface MonitorProperty {
    /**
     * Amazon Resource Name (ARN) of the Amazon CloudWatch alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitor.html#cfn-appconfig-environment-monitor-alarmarn)
     */
    public fun alarmArn(): String

    /**
     * ARN of an AWS Identity and Access Management (IAM) role for AWS AppConfig to monitor
     * `AlarmArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitor.html#cfn-appconfig-environment-monitor-alarmrolearn)
     */
    public fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()

    /**
     * A builder for [MonitorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmArn Amazon Resource Name (ARN) of the Amazon CloudWatch alarm. 
       */
      public fun alarmArn(alarmArn: String)

      /**
       * @param alarmRoleArn ARN of an AWS Identity and Access Management (IAM) role for AWS
       * AppConfig to monitor `AlarmArn` .
       */
      public fun alarmRoleArn(alarmRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty.Builder =
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty.builder()

      /**
       * @param alarmArn Amazon Resource Name (ARN) of the Amazon CloudWatch alarm. 
       */
      override fun alarmArn(alarmArn: String) {
        cdkBuilder.alarmArn(alarmArn)
      }

      /**
       * @param alarmRoleArn ARN of an AWS Identity and Access Management (IAM) role for AWS
       * AppConfig to monitor `AlarmArn` .
       */
      override fun alarmRoleArn(alarmRoleArn: String) {
        cdkBuilder.alarmRoleArn(alarmRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty,
    ) : CdkObject(cdkObject), MonitorProperty {
      /**
       * Amazon Resource Name (ARN) of the Amazon CloudWatch alarm.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitor.html#cfn-appconfig-environment-monitor-alarmarn)
       */
      override fun alarmArn(): String = unwrap(this).getAlarmArn()

      /**
       * ARN of an AWS Identity and Access Management (IAM) role for AWS AppConfig to monitor
       * `AlarmArn` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitor.html#cfn-appconfig-environment-monitor-alarmrolearn)
       */
      override fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty):
          MonitorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitorProperty):
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorProperty
    }
  }

  public interface MonitorsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmarn)
     */
    public fun alarmArn(): String? = unwrap(this).getAlarmArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmrolearn)
     */
    public fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()

    /**
     * A builder for [MonitorsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmArn the value to be set.
       */
      public fun alarmArn(alarmArn: String)

      /**
       * @param alarmRoleArn the value to be set.
       */
      public fun alarmRoleArn(alarmRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty.Builder =
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty.builder()

      /**
       * @param alarmArn the value to be set.
       */
      override fun alarmArn(alarmArn: String) {
        cdkBuilder.alarmArn(alarmArn)
      }

      /**
       * @param alarmRoleArn the value to be set.
       */
      override fun alarmRoleArn(alarmRoleArn: String) {
        cdkBuilder.alarmRoleArn(alarmRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty,
    ) : CdkObject(cdkObject), MonitorsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmarn)
       */
      override fun alarmArn(): String? = unwrap(this).getAlarmArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmrolearn)
       */
      override fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitorsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty):
          MonitorsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitorsProperty):
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appconfig.CfnEnvironment.MonitorsProperty
    }
  }
}

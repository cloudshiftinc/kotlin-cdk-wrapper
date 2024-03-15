@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeguruprofiler

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a profiling group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codeguruprofiler.*;
 * Object agentPermissions;
 * CfnProfilingGroup cfnProfilingGroup = CfnProfilingGroup.Builder.create(this,
 * "MyCfnProfilingGroup")
 * .profilingGroupName("profilingGroupName")
 * // the properties below are optional
 * .agentPermissions(agentPermissions)
 * .anomalyDetectionNotificationConfiguration(List.of(ChannelProperty.builder()
 * .channelUri("channelUri")
 * // the properties below are optional
 * .channelId("channelId")
 * .build()))
 * .computePlatform("computePlatform")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html)
 */
public open class CfnProfilingGroup internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The agent permissions attached to this profiling group.
   */
  public open fun agentPermissions(): Any? = unwrap(this).getAgentPermissions()

  /**
   * The agent permissions attached to this profiling group.
   */
  public open fun agentPermissions(`value`: Any) {
    unwrap(this).setAgentPermissions(`value`)
  }

  /**
   * Adds anomaly notifications for a profiling group.
   */
  public open fun anomalyDetectionNotificationConfiguration(): Any? =
      unwrap(this).getAnomalyDetectionNotificationConfiguration()

  /**
   * Adds anomaly notifications for a profiling group.
   */
  public open fun anomalyDetectionNotificationConfiguration(`value`: IResolvable) {
    unwrap(this).setAnomalyDetectionNotificationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Adds anomaly notifications for a profiling group.
   */
  public open fun anomalyDetectionNotificationConfiguration(`value`: List<Any>) {
    unwrap(this).setAnomalyDetectionNotificationConfiguration(`value`)
  }

  /**
   * Adds anomaly notifications for a profiling group.
   */
  public open fun anomalyDetectionNotificationConfiguration(vararg `value`: Any): Unit =
      anomalyDetectionNotificationConfiguration(`value`.toList())

  /**
   * The full Amazon Resource Name (ARN) for that profiling group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The compute platform of the profiling group.
   */
  public open fun computePlatform(): String? = unwrap(this).getComputePlatform()

  /**
   * The compute platform of the profiling group.
   */
  public open fun computePlatform(`value`: String) {
    unwrap(this).setComputePlatform(`value`)
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
   * The name of the profiling group.
   */
  public open fun profilingGroupName(): String = unwrap(this).getProfilingGroupName()

  /**
   * The name of the profiling group.
   */
  public open fun profilingGroupName(`value`: String) {
    unwrap(this).setProfilingGroupName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags to add to the created profiling group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags to add to the created profiling group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags to add to the created profiling group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codeguruprofiler.CfnProfilingGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The agent permissions attached to this profiling group.
     *
     * This action group grants `ConfigureAgent` and `PostAgentProfile` permissions to perform
     * actions required by the profiling agent. The Json consists of key `Principals` .
     *
     * *Principals* : A list of string ARNs for the roles and users you want to grant access to the
     * profiling group. Wildcards are not supported in the ARNs. You are allowed to provide up to 50
     * ARNs. An empty list is not permitted. This is a required key.
     *
     * For more information, see [Resource-based policies in CodeGuru
     * Profiler](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html)
     * in the *Amazon CodeGuru Profiler user guide* ,
     * [ConfigureAgent](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html)
     * , and
     * [PostAgentProfile](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-agentpermissions)
     * @param agentPermissions The agent permissions attached to this profiling group. 
     */
    public fun agentPermissions(agentPermissions: Any)

    /**
     * Adds anomaly notifications for a profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-anomalydetectionnotificationconfiguration)
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group. 
     */
    public
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: IResolvable)

    /**
     * Adds anomaly notifications for a profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-anomalydetectionnotificationconfiguration)
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group. 
     */
    public
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: List<Any>)

    /**
     * Adds anomaly notifications for a profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-anomalydetectionnotificationconfiguration)
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group. 
     */
    public fun anomalyDetectionNotificationConfiguration(vararg
        anomalyDetectionNotificationConfiguration: Any)

    /**
     * The compute platform of the profiling group.
     *
     * Use `AWSLambda` if your application runs on AWS Lambda. Use `Default` if your application
     * runs on a compute platform that is not AWS Lambda , such an Amazon EC2 instance, an on-premises
     * server, or a different platform. If not specified, `Default` is used. This property is
     * immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-computeplatform)
     * @param computePlatform The compute platform of the profiling group. 
     */
    public fun computePlatform(computePlatform: String)

    /**
     * The name of the profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-profilinggroupname)
     * @param profilingGroupName The name of the profiling group. 
     */
    public fun profilingGroupName(profilingGroupName: String)

    /**
     * A list of tags to add to the created profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-tags)
     * @param tags A list of tags to add to the created profiling group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to add to the created profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-tags)
     * @param tags A list of tags to add to the created profiling group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.Builder =
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.Builder.create(scope, id)

    /**
     * The agent permissions attached to this profiling group.
     *
     * This action group grants `ConfigureAgent` and `PostAgentProfile` permissions to perform
     * actions required by the profiling agent. The Json consists of key `Principals` .
     *
     * *Principals* : A list of string ARNs for the roles and users you want to grant access to the
     * profiling group. Wildcards are not supported in the ARNs. You are allowed to provide up to 50
     * ARNs. An empty list is not permitted. This is a required key.
     *
     * For more information, see [Resource-based policies in CodeGuru
     * Profiler](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html)
     * in the *Amazon CodeGuru Profiler user guide* ,
     * [ConfigureAgent](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html)
     * , and
     * [PostAgentProfile](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-agentpermissions)
     * @param agentPermissions The agent permissions attached to this profiling group. 
     */
    override fun agentPermissions(agentPermissions: Any) {
      cdkBuilder.agentPermissions(agentPermissions)
    }

    /**
     * Adds anomaly notifications for a profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-anomalydetectionnotificationconfiguration)
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group. 
     */
    override
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: IResolvable) {
      cdkBuilder.anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Adds anomaly notifications for a profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-anomalydetectionnotificationconfiguration)
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group. 
     */
    override
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: List<Any>) {
      cdkBuilder.anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration)
    }

    /**
     * Adds anomaly notifications for a profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-anomalydetectionnotificationconfiguration)
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group. 
     */
    override fun anomalyDetectionNotificationConfiguration(vararg
        anomalyDetectionNotificationConfiguration: Any): Unit =
        anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration.toList())

    /**
     * The compute platform of the profiling group.
     *
     * Use `AWSLambda` if your application runs on AWS Lambda. Use `Default` if your application
     * runs on a compute platform that is not AWS Lambda , such an Amazon EC2 instance, an on-premises
     * server, or a different platform. If not specified, `Default` is used. This property is
     * immutable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-computeplatform)
     * @param computePlatform The compute platform of the profiling group. 
     */
    override fun computePlatform(computePlatform: String) {
      cdkBuilder.computePlatform(computePlatform)
    }

    /**
     * The name of the profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-profilinggroupname)
     * @param profilingGroupName The name of the profiling group. 
     */
    override fun profilingGroupName(profilingGroupName: String) {
      cdkBuilder.profilingGroupName(profilingGroupName)
    }

    /**
     * A list of tags to add to the created profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-tags)
     * @param tags A list of tags to add to the created profiling group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags to add to the created profiling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-tags)
     * @param tags A list of tags to add to the created profiling group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProfilingGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProfilingGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup):
        CfnProfilingGroup = CfnProfilingGroup(cdkObject)

    internal fun unwrap(wrapped: CfnProfilingGroup):
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup = wrapped.cdkObject
  }

  /**
   * The agent permissions attached to this profiling group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codeguruprofiler.*;
   * AgentPermissionsProperty agentPermissionsProperty = AgentPermissionsProperty.builder()
   * .principals(List.of("principals"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeguruprofiler-profilinggroup-agentpermissions.html)
   */
  public interface AgentPermissionsProperty {
    /**
     * The principals for the agent permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeguruprofiler-profilinggroup-agentpermissions.html#cfn-codeguruprofiler-profilinggroup-agentpermissions-principals)
     */
    public fun principals(): List<String>

    /**
     * A builder for [AgentPermissionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param principals The principals for the agent permissions. 
       */
      public fun principals(principals: List<String>)

      /**
       * @param principals The principals for the agent permissions. 
       */
      public fun principals(vararg principals: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty.Builder
          =
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty.builder()

      /**
       * @param principals The principals for the agent permissions. 
       */
      override fun principals(principals: List<String>) {
        cdkBuilder.principals(principals)
      }

      /**
       * @param principals The principals for the agent permissions. 
       */
      override fun principals(vararg principals: String): Unit = principals(principals.toList())

      public fun build():
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty,
    ) : CdkObject(cdkObject), AgentPermissionsProperty {
      /**
       * The principals for the agent permissions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeguruprofiler-profilinggroup-agentpermissions.html#cfn-codeguruprofiler-profilinggroup-agentpermissions-principals)
       */
      override fun principals(): List<String> = unwrap(this).getPrincipals()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AgentPermissionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty):
          AgentPermissionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentPermissionsProperty):
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty
    }
  }

  /**
   * Notification medium for users to get alerted for events that occur in application profile.
   *
   * We support SNS topic as a notification channel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codeguruprofiler.*;
   * ChannelProperty channelProperty = ChannelProperty.builder()
   * .channelUri("channelUri")
   * // the properties below are optional
   * .channelId("channelId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeguruprofiler-profilinggroup-channel.html)
   */
  public interface ChannelProperty {
    /**
     * The channel ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeguruprofiler-profilinggroup-channel.html#cfn-codeguruprofiler-profilinggroup-channel-channelid)
     */
    public fun channelId(): String? = unwrap(this).getChannelId()

    /**
     * The channel URI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeguruprofiler-profilinggroup-channel.html#cfn-codeguruprofiler-profilinggroup-channel-channeluri)
     */
    public fun channelUri(): String

    /**
     * A builder for [ChannelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param channelId The channel ID.
       */
      public fun channelId(channelId: String)

      /**
       * @param channelUri The channel URI. 
       */
      public fun channelUri(channelUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty.Builder
          =
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty.builder()

      /**
       * @param channelId The channel ID.
       */
      override fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
      }

      /**
       * @param channelUri The channel URI. 
       */
      override fun channelUri(channelUri: String) {
        cdkBuilder.channelUri(channelUri)
      }

      public fun build():
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty,
    ) : CdkObject(cdkObject), ChannelProperty {
      /**
       * The channel ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeguruprofiler-profilinggroup-channel.html#cfn-codeguruprofiler-profilinggroup-channel-channelid)
       */
      override fun channelId(): String? = unwrap(this).getChannelId()

      /**
       * The channel URI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeguruprofiler-profilinggroup-channel.html#cfn-codeguruprofiler-profilinggroup-channel-channeluri)
       */
      override fun channelUri(): String = unwrap(this).getChannelUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty):
          ChannelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChannelProperty):
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty
    }
  }
}

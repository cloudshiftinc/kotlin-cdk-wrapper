package io.cloudshiftdev.awscdk.services.codeguruprofiler

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProfilingGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun agentPermissions(): Any? = unwrap(this).getAgentPermissions()

  public open fun agentPermissions(`value`: Any) {
    unwrap(this).setAgentPermissions(`value`)
  }

  public open fun anomalyDetectionNotificationConfiguration(): Any? =
      unwrap(this).getAnomalyDetectionNotificationConfiguration()

  public open fun anomalyDetectionNotificationConfiguration(`value`: IResolvable) {
    unwrap(this).setAnomalyDetectionNotificationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun anomalyDetectionNotificationConfiguration(__idx_ac66f0: List<Any>) {
    unwrap(this).setAnomalyDetectionNotificationConfiguration(__idx_ac66f0)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun computePlatform(): String? = unwrap(this).getComputePlatform()

  public open fun computePlatform(`value`: String) {
    unwrap(this).setComputePlatform(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun profilingGroupName(): String = unwrap(this).getProfilingGroupName()

  public open fun profilingGroupName(`value`: String) {
    unwrap(this).setProfilingGroupName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun agentPermissions(agentPermissions: Any)

    public
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: IResolvable)

    public
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: List<Any>)

    public fun computePlatform(computePlatform: String)

    public fun profilingGroupName(profilingGroupName: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.Builder =
        software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.Builder.create(scope, id)

    override fun agentPermissions(agentPermissions: Any) {
      cdkBuilder.agentPermissions(agentPermissions)
    }

    override
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: IResolvable) {
      cdkBuilder.anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: List<Any>) {
      cdkBuilder.anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration)
    }

    override fun computePlatform(computePlatform: String) {
      cdkBuilder.computePlatform(computePlatform)
    }

    override fun profilingGroupName(profilingGroupName: String) {
      cdkBuilder.profilingGroupName(profilingGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

  public interface AgentPermissionsProperty {
    public fun principals(): List<String>

    public interface Builder {
      public fun principals(principals: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty.Builder
          =
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty.builder()

      override fun principals(principals: List<String>) {
        cdkBuilder.principals(principals)
      }

      public fun build():
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty,
    ) : AgentPermissionsProperty {
      override fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AgentPermissionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty):
          AgentPermissionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentPermissionsProperty):
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.AgentPermissionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ChannelProperty {
    public fun channelId(): String? = unwrap(this).getChannelId()

    public fun channelUri(): String

    public interface Builder {
      public fun channelId(channelId: String)

      public fun channelUri(channelUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty.Builder
          =
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty.builder()

      override fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
      }

      override fun channelUri(channelUri: String) {
        cdkBuilder.channelUri(channelUri)
      }

      public fun build():
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty,
    ) : ChannelProperty {
      override fun channelId(): String? = unwrap(this).getChannelId()

      override fun channelUri(): String = unwrap(this).getChannelUri()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty):
          ChannelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChannelProperty):
          software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup.ChannelProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}

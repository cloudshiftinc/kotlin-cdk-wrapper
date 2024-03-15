@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnLaunchProfileProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun ec2SubnetIds(): List<String>

  public fun launchProfileProtocolVersions(): List<String>

  public fun name(): String

  public fun streamConfiguration(): Any

  public fun studioComponentIds(): List<String>

  public fun studioId(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun ec2SubnetIds(ec2SubnetIds: List<String>)

    public fun ec2SubnetIds(vararg ec2SubnetIds: String)

    public fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>)

    public fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String)

    public fun name(name: String)

    public fun streamConfiguration(streamConfiguration: IResolvable)

    public
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e89e2675aaf68f9e3ab063388960cfad7ee36672343e686bb07cbd5d83c5d40")
    public
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty.Builder.() -> Unit)

    public fun studioComponentIds(studioComponentIds: List<String>)

    public fun studioComponentIds(vararg studioComponentIds: String)

    public fun studioId(studioId: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ec2SubnetIds(ec2SubnetIds: List<String>) {
      cdkBuilder.ec2SubnetIds(ec2SubnetIds)
    }

    override fun ec2SubnetIds(vararg ec2SubnetIds: String): Unit =
        ec2SubnetIds(ec2SubnetIds.toList())

    override fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>) {
      cdkBuilder.launchProfileProtocolVersions(launchProfileProtocolVersions)
    }

    override fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String): Unit =
        launchProfileProtocolVersions(launchProfileProtocolVersions.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun streamConfiguration(streamConfiguration: IResolvable) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(IResolvable::unwrap))
    }

    override
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(CfnLaunchProfile.StreamConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e89e2675aaf68f9e3ab063388960cfad7ee36672343e686bb07cbd5d83c5d40")
    override
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty.Builder.() -> Unit):
        Unit =
        streamConfiguration(CfnLaunchProfile.StreamConfigurationProperty(streamConfiguration))

    override fun studioComponentIds(studioComponentIds: List<String>) {
      cdkBuilder.studioComponentIds(studioComponentIds)
    }

    override fun studioComponentIds(vararg studioComponentIds: String): Unit =
        studioComponentIds(studioComponentIds.toList())

    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps,
  ) : CdkObject(cdkObject), CfnLaunchProfileProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds()

    override fun launchProfileProtocolVersions(): List<String> =
        unwrap(this).getLaunchProfileProtocolVersions()

    override fun name(): String = unwrap(this).getName()

    override fun streamConfiguration(): Any = unwrap(this).getStreamConfiguration()

    override fun studioComponentIds(): List<String> = unwrap(this).getStudioComponentIds()

    override fun studioId(): String = unwrap(this).getStudioId()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps):
        CfnLaunchProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchProfileProps):
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps
  }
}

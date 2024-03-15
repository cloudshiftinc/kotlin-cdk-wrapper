@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnChannelProps {
  public fun authorized(): Any? = unwrap(this).getAuthorized()

  public fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

  public fun latencyMode(): String? = unwrap(this).getLatencyMode()

  public fun name(): String? = unwrap(this).getName()

  public fun preset(): String? = unwrap(this).getPreset()

  public fun recordingConfigurationArn(): String? = unwrap(this).getRecordingConfigurationArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String? = unwrap(this).getType()

  @CdkDslMarker
  public interface Builder {
    public fun authorized(authorized: Boolean)

    public fun authorized(authorized: IResolvable)

    public fun insecureIngest(insecureIngest: Boolean)

    public fun insecureIngest(insecureIngest: IResolvable)

    public fun latencyMode(latencyMode: String)

    public fun name(name: String)

    public fun preset(preset: String)

    public fun recordingConfigurationArn(recordingConfigurationArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnChannelProps.Builder =
        software.amazon.awscdk.services.ivs.CfnChannelProps.builder()

    override fun authorized(authorized: Boolean) {
      cdkBuilder.authorized(authorized)
    }

    override fun authorized(authorized: IResolvable) {
      cdkBuilder.authorized(authorized.let(IResolvable::unwrap))
    }

    override fun insecureIngest(insecureIngest: Boolean) {
      cdkBuilder.insecureIngest(insecureIngest)
    }

    override fun insecureIngest(insecureIngest: IResolvable) {
      cdkBuilder.insecureIngest(insecureIngest.let(IResolvable::unwrap))
    }

    override fun latencyMode(latencyMode: String) {
      cdkBuilder.latencyMode(latencyMode)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun preset(preset: String) {
      cdkBuilder.preset(preset)
    }

    override fun recordingConfigurationArn(recordingConfigurationArn: String) {
      cdkBuilder.recordingConfigurationArn(recordingConfigurationArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ivs.CfnChannelProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ivs.CfnChannelProps,
  ) : CdkObject(cdkObject), CfnChannelProps {
    override fun authorized(): Any? = unwrap(this).getAuthorized()

    override fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

    override fun latencyMode(): String? = unwrap(this).getLatencyMode()

    override fun name(): String? = unwrap(this).getName()

    override fun preset(): String? = unwrap(this).getPreset()

    override fun recordingConfigurationArn(): String? = unwrap(this).getRecordingConfigurationArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnChannelProps):
        CfnChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.ivs.CfnChannelProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ivs.CfnChannelProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.groundstation

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMissionProfileProps {
  public fun contactPostPassDurationSeconds(): Number? =
      unwrap(this).getContactPostPassDurationSeconds()

  public fun contactPrePassDurationSeconds(): Number? =
      unwrap(this).getContactPrePassDurationSeconds()

  public fun dataflowEdges(): Any

  public fun minimumViableContactDurationSeconds(): Number

  public fun name(): String

  public fun streamsKmsKey(): Any? = unwrap(this).getStreamsKmsKey()

  public fun streamsKmsRole(): String? = unwrap(this).getStreamsKmsRole()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun trackingConfigArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number)

    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number)

    public fun dataflowEdges(dataflowEdges: IResolvable)

    public fun dataflowEdges(dataflowEdges: List<Any>)

    public fun dataflowEdges(vararg dataflowEdges: Any)

    public fun minimumViableContactDurationSeconds(minimumViableContactDurationSeconds: Number)

    public fun name(name: String)

    public fun streamsKmsKey(streamsKmsKey: IResolvable)

    public fun streamsKmsKey(streamsKmsKey: CfnMissionProfile.StreamsKmsKeyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("117b35e3da185b448b5d987c3d2710e6ac6a0b3721dc9c7452a754f8b44e93a3")
    public
        fun streamsKmsKey(streamsKmsKey: CfnMissionProfile.StreamsKmsKeyProperty.Builder.() -> Unit)

    public fun streamsKmsRole(streamsKmsRole: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trackingConfigArn(trackingConfigArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.groundstation.CfnMissionProfileProps.Builder =
        software.amazon.awscdk.services.groundstation.CfnMissionProfileProps.builder()

    override fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
      cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    override fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
      cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    override fun dataflowEdges(dataflowEdges: IResolvable) {
      cdkBuilder.dataflowEdges(dataflowEdges.let(IResolvable::unwrap))
    }

    override fun dataflowEdges(dataflowEdges: List<Any>) {
      cdkBuilder.dataflowEdges(dataflowEdges)
    }

    override fun dataflowEdges(vararg dataflowEdges: Any): Unit =
        dataflowEdges(dataflowEdges.toList())

    override fun minimumViableContactDurationSeconds(minimumViableContactDurationSeconds: Number) {
      cdkBuilder.minimumViableContactDurationSeconds(minimumViableContactDurationSeconds)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun streamsKmsKey(streamsKmsKey: IResolvable) {
      cdkBuilder.streamsKmsKey(streamsKmsKey.let(IResolvable::unwrap))
    }

    override fun streamsKmsKey(streamsKmsKey: CfnMissionProfile.StreamsKmsKeyProperty) {
      cdkBuilder.streamsKmsKey(streamsKmsKey.let(CfnMissionProfile.StreamsKmsKeyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("117b35e3da185b448b5d987c3d2710e6ac6a0b3721dc9c7452a754f8b44e93a3")
    override
        fun streamsKmsKey(streamsKmsKey: CfnMissionProfile.StreamsKmsKeyProperty.Builder.() -> Unit):
        Unit = streamsKmsKey(CfnMissionProfile.StreamsKmsKeyProperty(streamsKmsKey))

    override fun streamsKmsRole(streamsKmsRole: String) {
      cdkBuilder.streamsKmsRole(streamsKmsRole)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trackingConfigArn(trackingConfigArn: String) {
      cdkBuilder.trackingConfigArn(trackingConfigArn)
    }

    public fun build(): software.amazon.awscdk.services.groundstation.CfnMissionProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfileProps,
  ) : CdkObject(cdkObject), CfnMissionProfileProps {
    override fun contactPostPassDurationSeconds(): Number? =
        unwrap(this).getContactPostPassDurationSeconds()

    override fun contactPrePassDurationSeconds(): Number? =
        unwrap(this).getContactPrePassDurationSeconds()

    override fun dataflowEdges(): Any = unwrap(this).getDataflowEdges()

    override fun minimumViableContactDurationSeconds(): Number =
        unwrap(this).getMinimumViableContactDurationSeconds()

    override fun name(): String = unwrap(this).getName()

    override fun streamsKmsKey(): Any? = unwrap(this).getStreamsKmsKey()

    override fun streamsKmsRole(): String? = unwrap(this).getStreamsKmsRole()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun trackingConfigArn(): String = unwrap(this).getTrackingConfigArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMissionProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnMissionProfileProps):
        CfnMissionProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMissionProfileProps):
        software.amazon.awscdk.services.groundstation.CfnMissionProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.groundstation.CfnMissionProfileProps
  }
}

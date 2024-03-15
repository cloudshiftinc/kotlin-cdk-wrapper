@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appintegrations

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEventIntegrationProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun eventBridgeBus(): String

  public fun eventFilter(): Any

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun eventBridgeBus(eventBridgeBus: String)

    public fun eventFilter(eventFilter: IResolvable)

    public fun eventFilter(eventFilter: CfnEventIntegration.EventFilterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("705d0aed548b064586a91bab2cece68818501e2ba35ecd90bd0068936c771813")
    public fun eventFilter(eventFilter: CfnEventIntegration.EventFilterProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps.Builder =
        software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventBridgeBus(eventBridgeBus: String) {
      cdkBuilder.eventBridgeBus(eventBridgeBus)
    }

    override fun eventFilter(eventFilter: IResolvable) {
      cdkBuilder.eventFilter(eventFilter.let(IResolvable::unwrap))
    }

    override fun eventFilter(eventFilter: CfnEventIntegration.EventFilterProperty) {
      cdkBuilder.eventFilter(eventFilter.let(CfnEventIntegration.EventFilterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("705d0aed548b064586a91bab2cece68818501e2ba35ecd90bd0068936c771813")
    override
        fun eventFilter(eventFilter: CfnEventIntegration.EventFilterProperty.Builder.() -> Unit):
        Unit = eventFilter(CfnEventIntegration.EventFilterProperty(eventFilter))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps,
  ) : CdkObject(cdkObject), CfnEventIntegrationProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun eventBridgeBus(): String = unwrap(this).getEventBridgeBus()

    override fun eventFilter(): Any = unwrap(this).getEventFilter()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps):
        CfnEventIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventIntegrationProps):
        software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps
  }
}

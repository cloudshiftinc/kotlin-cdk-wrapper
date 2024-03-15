@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnConfigurationProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun kafkaVersionsList(): List<String> = unwrap(this).getKafkaVersionsList() ?: emptyList()

  public fun latestRevision(): Any? = unwrap(this).getLatestRevision()

  public fun name(): String

  public fun serverProperties(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun kafkaVersionsList(kafkaVersionsList: List<String>)

    public fun kafkaVersionsList(vararg kafkaVersionsList: String)

    public fun latestRevision(latestRevision: IResolvable)

    public fun latestRevision(latestRevision: CfnConfiguration.LatestRevisionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0d5b7745687c027d7615e97a5a5910469bb1a8c24279cee0902098c91e4f089")
    public
        fun latestRevision(latestRevision: CfnConfiguration.LatestRevisionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun serverProperties(serverProperties: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnConfigurationProps.Builder =
        software.amazon.awscdk.services.msk.CfnConfigurationProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun kafkaVersionsList(kafkaVersionsList: List<String>) {
      cdkBuilder.kafkaVersionsList(kafkaVersionsList)
    }

    override fun kafkaVersionsList(vararg kafkaVersionsList: String): Unit =
        kafkaVersionsList(kafkaVersionsList.toList())

    override fun latestRevision(latestRevision: IResolvable) {
      cdkBuilder.latestRevision(latestRevision.let(IResolvable::unwrap))
    }

    override fun latestRevision(latestRevision: CfnConfiguration.LatestRevisionProperty) {
      cdkBuilder.latestRevision(latestRevision.let(CfnConfiguration.LatestRevisionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0d5b7745687c027d7615e97a5a5910469bb1a8c24279cee0902098c91e4f089")
    override
        fun latestRevision(latestRevision: CfnConfiguration.LatestRevisionProperty.Builder.() -> Unit):
        Unit = latestRevision(CfnConfiguration.LatestRevisionProperty(latestRevision))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun serverProperties(serverProperties: String) {
      cdkBuilder.serverProperties(serverProperties)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.msk.CfnConfigurationProps,
  ) : CdkObject(cdkObject), CfnConfigurationProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun kafkaVersionsList(): List<String> = unwrap(this).getKafkaVersionsList() ?:
        emptyList()

    override fun latestRevision(): Any? = unwrap(this).getLatestRevision()

    override fun name(): String = unwrap(this).getName()

    override fun serverProperties(): String = unwrap(this).getServerProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnConfigurationProps):
        CfnConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationProps):
        software.amazon.awscdk.services.msk.CfnConfigurationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.msk.CfnConfigurationProps
  }
}

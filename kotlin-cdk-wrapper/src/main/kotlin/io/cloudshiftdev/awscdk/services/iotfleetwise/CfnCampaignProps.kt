@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

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

public interface CfnCampaignProps {
  public fun action(): String

  public fun collectionScheme(): Any

  public fun compression(): String? = unwrap(this).getCompression()

  public fun dataDestinationConfigs(): Any? = unwrap(this).getDataDestinationConfigs()

  public fun dataExtraDimensions(): List<String> = unwrap(this).getDataExtraDimensions() ?:
      emptyList()

  public fun description(): String? = unwrap(this).getDescription()

  public fun diagnosticsMode(): String? = unwrap(this).getDiagnosticsMode()

  public fun expiryTime(): String? = unwrap(this).getExpiryTime()

  public fun name(): String

  public fun postTriggerCollectionDuration(): Number? =
      unwrap(this).getPostTriggerCollectionDuration()

  public fun priority(): Number? = unwrap(this).getPriority()

  public fun signalCatalogArn(): String

  public fun signalsToCollect(): Any? = unwrap(this).getSignalsToCollect()

  public fun spoolingMode(): String? = unwrap(this).getSpoolingMode()

  public fun startTime(): String? = unwrap(this).getStartTime()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun collectionScheme(collectionScheme: IResolvable)

    public fun collectionScheme(collectionScheme: CfnCampaign.CollectionSchemeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3a78aa42b017abf19e8ceda14b40cf5d2d6bdac04d95bbb3a6c568f4882e9e9")
    public
        fun collectionScheme(collectionScheme: CfnCampaign.CollectionSchemeProperty.Builder.() -> Unit)

    public fun compression(compression: String)

    public fun dataDestinationConfigs(dataDestinationConfigs: IResolvable)

    public fun dataDestinationConfigs(dataDestinationConfigs: List<Any>)

    public fun dataDestinationConfigs(vararg dataDestinationConfigs: Any)

    public fun dataExtraDimensions(dataExtraDimensions: List<String>)

    public fun dataExtraDimensions(vararg dataExtraDimensions: String)

    public fun description(description: String)

    public fun diagnosticsMode(diagnosticsMode: String)

    public fun expiryTime(expiryTime: String)

    public fun name(name: String)

    public fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number)

    public fun priority(priority: Number)

    public fun signalCatalogArn(signalCatalogArn: String)

    public fun signalsToCollect(signalsToCollect: IResolvable)

    public fun signalsToCollect(signalsToCollect: List<Any>)

    public fun signalsToCollect(vararg signalsToCollect: Any)

    public fun spoolingMode(spoolingMode: String)

    public fun startTime(startTime: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps.builder()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun collectionScheme(collectionScheme: IResolvable) {
      cdkBuilder.collectionScheme(collectionScheme.let(IResolvable::unwrap))
    }

    override fun collectionScheme(collectionScheme: CfnCampaign.CollectionSchemeProperty) {
      cdkBuilder.collectionScheme(collectionScheme.let(CfnCampaign.CollectionSchemeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3a78aa42b017abf19e8ceda14b40cf5d2d6bdac04d95bbb3a6c568f4882e9e9")
    override
        fun collectionScheme(collectionScheme: CfnCampaign.CollectionSchemeProperty.Builder.() -> Unit):
        Unit = collectionScheme(CfnCampaign.CollectionSchemeProperty(collectionScheme))

    override fun compression(compression: String) {
      cdkBuilder.compression(compression)
    }

    override fun dataDestinationConfigs(dataDestinationConfigs: IResolvable) {
      cdkBuilder.dataDestinationConfigs(dataDestinationConfigs.let(IResolvable::unwrap))
    }

    override fun dataDestinationConfigs(dataDestinationConfigs: List<Any>) {
      cdkBuilder.dataDestinationConfigs(dataDestinationConfigs)
    }

    override fun dataDestinationConfigs(vararg dataDestinationConfigs: Any): Unit =
        dataDestinationConfigs(dataDestinationConfigs.toList())

    override fun dataExtraDimensions(dataExtraDimensions: List<String>) {
      cdkBuilder.dataExtraDimensions(dataExtraDimensions)
    }

    override fun dataExtraDimensions(vararg dataExtraDimensions: String): Unit =
        dataExtraDimensions(dataExtraDimensions.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun diagnosticsMode(diagnosticsMode: String) {
      cdkBuilder.diagnosticsMode(diagnosticsMode)
    }

    override fun expiryTime(expiryTime: String) {
      cdkBuilder.expiryTime(expiryTime)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun postTriggerCollectionDuration(postTriggerCollectionDuration: Number) {
      cdkBuilder.postTriggerCollectionDuration(postTriggerCollectionDuration)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun signalCatalogArn(signalCatalogArn: String) {
      cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    override fun signalsToCollect(signalsToCollect: IResolvable) {
      cdkBuilder.signalsToCollect(signalsToCollect.let(IResolvable::unwrap))
    }

    override fun signalsToCollect(signalsToCollect: List<Any>) {
      cdkBuilder.signalsToCollect(signalsToCollect)
    }

    override fun signalsToCollect(vararg signalsToCollect: Any): Unit =
        signalsToCollect(signalsToCollect.toList())

    override fun spoolingMode(spoolingMode: String) {
      cdkBuilder.spoolingMode(spoolingMode)
    }

    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps,
  ) : CdkObject(cdkObject), CfnCampaignProps {
    override fun action(): String = unwrap(this).getAction()

    override fun collectionScheme(): Any = unwrap(this).getCollectionScheme()

    override fun compression(): String? = unwrap(this).getCompression()

    override fun dataDestinationConfigs(): Any? = unwrap(this).getDataDestinationConfigs()

    override fun dataExtraDimensions(): List<String> = unwrap(this).getDataExtraDimensions() ?:
        emptyList()

    override fun description(): String? = unwrap(this).getDescription()

    override fun diagnosticsMode(): String? = unwrap(this).getDiagnosticsMode()

    override fun expiryTime(): String? = unwrap(this).getExpiryTime()

    override fun name(): String = unwrap(this).getName()

    override fun postTriggerCollectionDuration(): Number? =
        unwrap(this).getPostTriggerCollectionDuration()

    override fun priority(): Number? = unwrap(this).getPriority()

    override fun signalCatalogArn(): String = unwrap(this).getSignalCatalogArn()

    override fun signalsToCollect(): Any? = unwrap(this).getSignalsToCollect()

    override fun spoolingMode(): String? = unwrap(this).getSpoolingMode()

    override fun startTime(): String? = unwrap(this).getStartTime()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCampaignProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps):
        CfnCampaignProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCampaignProps):
        software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleetwise.CfnCampaignProps
  }
}

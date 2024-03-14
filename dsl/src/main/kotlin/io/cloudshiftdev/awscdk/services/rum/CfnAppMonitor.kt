package io.cloudshiftdev.awscdk.services.rum

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAppMonitor internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun appMonitorConfiguration(): Any? = unwrap(this).getAppMonitorConfiguration()

  public open fun appMonitorConfiguration(`value`: IResolvable) {
    unwrap(this).setAppMonitorConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun appMonitorConfiguration(`value`: AppMonitorConfigurationProperty) {
    unwrap(this).setAppMonitorConfiguration(`value`.let(AppMonitorConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04aafd667188d60d7f60268739bc56055270d4debbdc2f660ff7b920ed3a7dea")
  public open
      fun appMonitorConfiguration(`value`: AppMonitorConfigurationProperty.Builder.() -> Unit): Unit
      = appMonitorConfiguration(AppMonitorConfigurationProperty(`value`))

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun customEvents(): Any? = unwrap(this).getCustomEvents()

  public open fun customEvents(`value`: IResolvable) {
    unwrap(this).setCustomEvents(`value`.let(IResolvable::unwrap))
  }

  public open fun customEvents(`value`: CustomEventsProperty) {
    unwrap(this).setCustomEvents(`value`.let(CustomEventsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be3aba87a25928e5f2d398793c238db9ce4d85dc2e7a5720eba8815231bb1d4a")
  public open fun customEvents(`value`: CustomEventsProperty.Builder.() -> Unit): Unit =
      customEvents(CustomEventsProperty(`value`))

  public open fun cwLogEnabled(): Any? = unwrap(this).getCwLogEnabled()

  public open fun cwLogEnabled(`value`: Boolean) {
    unwrap(this).setCwLogEnabled(`value`)
  }

  public open fun cwLogEnabled(`value`: IResolvable) {
    unwrap(this).setCwLogEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun domain(): String = unwrap(this).getDomain()

  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun appMonitorConfiguration(appMonitorConfiguration: IResolvable)

    public fun appMonitorConfiguration(appMonitorConfiguration: AppMonitorConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b802a42d88c685bb109f03f88e6e416040dab8249fa0c83dd16278c4f09081ed")
    public
        fun appMonitorConfiguration(appMonitorConfiguration: AppMonitorConfigurationProperty.Builder.() -> Unit)

    public fun customEvents(customEvents: IResolvable)

    public fun customEvents(customEvents: CustomEventsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e1603fae134115d4dc9eadf51f7d88629bbf2443d24bc3880c95bb84cc5e976")
    public fun customEvents(customEvents: CustomEventsProperty.Builder.() -> Unit)

    public fun cwLogEnabled(cwLogEnabled: Boolean)

    public fun cwLogEnabled(cwLogEnabled: IResolvable)

    public fun domain(domain: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rum.CfnAppMonitor.Builder =
        software.amazon.awscdk.services.rum.CfnAppMonitor.Builder.create(scope, id)

    override fun appMonitorConfiguration(appMonitorConfiguration: IResolvable) {
      cdkBuilder.appMonitorConfiguration(appMonitorConfiguration.let(IResolvable::unwrap))
    }

    override fun appMonitorConfiguration(appMonitorConfiguration: AppMonitorConfigurationProperty) {
      cdkBuilder.appMonitorConfiguration(appMonitorConfiguration.let(AppMonitorConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b802a42d88c685bb109f03f88e6e416040dab8249fa0c83dd16278c4f09081ed")
    override
        fun appMonitorConfiguration(appMonitorConfiguration: AppMonitorConfigurationProperty.Builder.() -> Unit):
        Unit = appMonitorConfiguration(AppMonitorConfigurationProperty(appMonitorConfiguration))

    override fun customEvents(customEvents: IResolvable) {
      cdkBuilder.customEvents(customEvents.let(IResolvable::unwrap))
    }

    override fun customEvents(customEvents: CustomEventsProperty) {
      cdkBuilder.customEvents(customEvents.let(CustomEventsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e1603fae134115d4dc9eadf51f7d88629bbf2443d24bc3880c95bb84cc5e976")
    override fun customEvents(customEvents: CustomEventsProperty.Builder.() -> Unit): Unit =
        customEvents(CustomEventsProperty(customEvents))

    override fun cwLogEnabled(cwLogEnabled: Boolean) {
      cdkBuilder.cwLogEnabled(cwLogEnabled)
    }

    override fun cwLogEnabled(cwLogEnabled: IResolvable) {
      cdkBuilder.cwLogEnabled(cwLogEnabled.let(IResolvable::unwrap))
    }

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rum.CfnAppMonitor = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAppMonitor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAppMonitor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor): CfnAppMonitor =
        CfnAppMonitor(cdkObject)

    internal fun unwrap(wrapped: CfnAppMonitor): software.amazon.awscdk.services.rum.CfnAppMonitor =
        wrapped.cdkObject
  }

  public interface AppMonitorConfigurationProperty {
    public fun allowCookies(): Any? = unwrap(this).getAllowCookies()

    public fun enableXRay(): Any? = unwrap(this).getEnableXRay()

    public fun excludedPages(): List<String> = unwrap(this).getExcludedPages() ?: emptyList()

    public fun favoritePages(): List<String> = unwrap(this).getFavoritePages() ?: emptyList()

    public fun guestRoleArn(): String? = unwrap(this).getGuestRoleArn()

    public fun identityPoolId(): String? = unwrap(this).getIdentityPoolId()

    public fun includedPages(): List<String> = unwrap(this).getIncludedPages() ?: emptyList()

    public fun metricDestinations(): Any? = unwrap(this).getMetricDestinations()

    public fun sessionSampleRate(): Number? = unwrap(this).getSessionSampleRate()

    public fun telemetries(): List<String> = unwrap(this).getTelemetries() ?: emptyList()

    public interface Builder {
      public fun allowCookies(allowCookies: Boolean)

      public fun allowCookies(allowCookies: IResolvable)

      public fun enableXRay(enableXRay: Boolean)

      public fun enableXRay(enableXRay: IResolvable)

      public fun excludedPages(excludedPages: List<String>)

      public fun favoritePages(favoritePages: List<String>)

      public fun guestRoleArn(guestRoleArn: String)

      public fun identityPoolId(identityPoolId: String)

      public fun includedPages(includedPages: List<String>)

      public fun metricDestinations(metricDestinations: IResolvable)

      public fun metricDestinations(metricDestinations: List<Any>)

      public fun sessionSampleRate(sessionSampleRate: Number)

      public fun telemetries(telemetries: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty.builder()

      override fun allowCookies(allowCookies: Boolean) {
        cdkBuilder.allowCookies(allowCookies)
      }

      override fun allowCookies(allowCookies: IResolvable) {
        cdkBuilder.allowCookies(allowCookies.let(IResolvable::unwrap))
      }

      override fun enableXRay(enableXRay: Boolean) {
        cdkBuilder.enableXRay(enableXRay)
      }

      override fun enableXRay(enableXRay: IResolvable) {
        cdkBuilder.enableXRay(enableXRay.let(IResolvable::unwrap))
      }

      override fun excludedPages(excludedPages: List<String>) {
        cdkBuilder.excludedPages(excludedPages)
      }

      override fun favoritePages(favoritePages: List<String>) {
        cdkBuilder.favoritePages(favoritePages)
      }

      override fun guestRoleArn(guestRoleArn: String) {
        cdkBuilder.guestRoleArn(guestRoleArn)
      }

      override fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
      }

      override fun includedPages(includedPages: List<String>) {
        cdkBuilder.includedPages(includedPages)
      }

      override fun metricDestinations(metricDestinations: IResolvable) {
        cdkBuilder.metricDestinations(metricDestinations.let(IResolvable::unwrap))
      }

      override fun metricDestinations(metricDestinations: List<Any>) {
        cdkBuilder.metricDestinations(metricDestinations)
      }

      override fun sessionSampleRate(sessionSampleRate: Number) {
        cdkBuilder.sessionSampleRate(sessionSampleRate)
      }

      override fun telemetries(telemetries: List<String>) {
        cdkBuilder.telemetries(telemetries)
      }

      public fun build():
          software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty,
    ) : AppMonitorConfigurationProperty {
      override fun allowCookies(): Any? = unwrap(this).getAllowCookies()

      override fun enableXRay(): Any? = unwrap(this).getEnableXRay()

      override fun excludedPages(): List<String> = unwrap(this).getExcludedPages() ?: emptyList()

      override fun favoritePages(): List<String> = unwrap(this).getFavoritePages() ?: emptyList()

      override fun guestRoleArn(): String? = unwrap(this).getGuestRoleArn()

      override fun identityPoolId(): String? = unwrap(this).getIdentityPoolId()

      override fun includedPages(): List<String> = unwrap(this).getIncludedPages() ?: emptyList()

      override fun metricDestinations(): Any? = unwrap(this).getMetricDestinations()

      override fun sessionSampleRate(): Number? = unwrap(this).getSessionSampleRate()

      override fun telemetries(): List<String> = unwrap(this).getTelemetries() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AppMonitorConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty):
          AppMonitorConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppMonitorConfigurationProperty):
          software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricDestinationProperty {
    public fun destination(): String

    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    public fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

    public fun metricDefinitions(): Any? = unwrap(this).getMetricDefinitions()

    public interface Builder {
      public fun destination(destination: String)

      public fun destinationArn(destinationArn: String)

      public fun iamRoleArn(iamRoleArn: String)

      public fun metricDefinitions(metricDefinitions: IResolvable)

      public fun metricDefinitions(metricDefinitions: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty.Builder =
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty.builder()

      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      override fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
      }

      override fun metricDefinitions(metricDefinitions: IResolvable) {
        cdkBuilder.metricDefinitions(metricDefinitions.let(IResolvable::unwrap))
      }

      override fun metricDefinitions(metricDefinitions: List<Any>) {
        cdkBuilder.metricDefinitions(metricDefinitions)
      }

      public fun build():
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty,
    ) : MetricDestinationProperty {
      override fun destination(): String = unwrap(this).getDestination()

      override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      override fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

      override fun metricDefinitions(): Any? = unwrap(this).getMetricDefinitions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty):
          MetricDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDestinationProperty):
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomEventsProperty {
    public fun status(): String? = unwrap(this).getStatus()

    public interface Builder {
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty.Builder =
          software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty.builder()

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty,
    ) : CustomEventsProperty {
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomEventsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty):
          CustomEventsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomEventsProperty):
          software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MetricDefinitionProperty {
    public fun dimensionKeys(): Any? = unwrap(this).getDimensionKeys()

    public fun eventPattern(): String? = unwrap(this).getEventPattern()

    public fun name(): String

    public fun namespace(): String? = unwrap(this).getNamespace()

    public fun unitLabel(): String? = unwrap(this).getUnitLabel()

    public fun valueKey(): String? = unwrap(this).getValueKey()

    public interface Builder {
      public fun dimensionKeys(dimensionKeys: IResolvable)

      public fun dimensionKeys(dimensionKeys: Map<String, String>)

      public fun eventPattern(eventPattern: String)

      public fun name(name: String)

      public fun namespace(namespace: String)

      public fun unitLabel(unitLabel: String)

      public fun valueKey(valueKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty.Builder =
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty.builder()

      override fun dimensionKeys(dimensionKeys: IResolvable) {
        cdkBuilder.dimensionKeys(dimensionKeys.let(IResolvable::unwrap))
      }

      override fun dimensionKeys(dimensionKeys: Map<String, String>) {
        cdkBuilder.dimensionKeys(dimensionKeys)
      }

      override fun eventPattern(eventPattern: String) {
        cdkBuilder.eventPattern(eventPattern)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      override fun unitLabel(unitLabel: String) {
        cdkBuilder.unitLabel(unitLabel)
      }

      override fun valueKey(valueKey: String) {
        cdkBuilder.valueKey(valueKey)
      }

      public fun build(): software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty,
    ) : MetricDefinitionProperty {
      override fun dimensionKeys(): Any? = unwrap(this).getDimensionKeys()

      override fun eventPattern(): String? = unwrap(this).getEventPattern()

      override fun name(): String = unwrap(this).getName()

      override fun namespace(): String? = unwrap(this).getNamespace()

      override fun unitLabel(): String? = unwrap(this).getUnitLabel()

      override fun valueKey(): String? = unwrap(this).getValueKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty):
          MetricDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDefinitionProperty):
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
